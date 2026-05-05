grammar gramatica;

@header {
    import java.util.*;
}

@members {
    Traductor trad = new Traductor();

    public static String toCLiteral(String s) {
        String inner = s.substring(1, s.length() - 1);
        inner = inner.replace("\"", "\\\"");
        return "\"" + inner + "\"";
    }

    public static List<String> expandCase(String etiqueta) {
        List<String> res = new ArrayList<>();

        if (etiqueta.contains(":")) {
            String[] p = etiqueta.split(":");
            int a = Integer.parseInt(p[0]);
            int b = Integer.parseInt(p[1]);
            for (int i = a; i <= b; i++)
                res.add(String.valueOf(i));
        } else {
            res.add(etiqueta);
        }
        return res;
    }
}

/* ============================
   PROGRAMA PRINCIPAL
   ============================ */

prg returns [String codigo]
    : 'PROGRAM' IDENT SEMI dcllist cabecera sentlist 'END' 'PROGRAM' IDENT subproglist EOF
      {
         trad.getContexto().entrarMain();
         trad.generarMain($dcllist.listaVars, $sentlist.codigo);
         trad.getContexto().salir();
         $codigo = trad.generarPrograma();
      }
    ;

/* ============================
   DECLARACIONES
   ============================ */

dcllist returns [List<VariableDecl> listaVars]
    : dcl dcllist
      {
         $listaVars = new ArrayList<>();
         $listaVars.addAll($dcl.listaVars);
         $listaVars.addAll($dcllist.listaVars);
      }
    | { $listaVars = new ArrayList<>(); }
    ;

dcl returns [List<VariableDecl> listaVars]
    : tipo dclp
      {
         $listaVars = $dclp.listaVars;
         for (VariableDecl v : $listaVars) {
             v.tipo = $tipo.tipoC;
             if ($tipo.tipoC.equals("char") && $tipo.long > 0)
                 v.setDimension($tipo.long);
         }
      }
    ;

dclp returns [List<VariableDecl> listaVars]
    : COMMA 'PARAMETER' '::' IDENT ASSIGN simpvalue ctelist SEMI
      {
         trad.addDefine($IDENT.text, $simpvalue.val);
         $listaVars = new ArrayList<>();
      }
    | '::' varlist SEMI
      {
         $listaVars = $varlist.lista;
      }
    ;

/* ============================
   CABECERAS (INTERFACE)
   ============================ */

cabecera
    : 'INTERFACE' cablist 'END' 'INTERFACE'
    |
    ;

cablist
    : dec_elemento decsubprog
    |
    ;

decsubprog
    : dec_elemento decsubprog
    |
    ;

dec_elemento
    : decproc
    | decfun
    ;

/* ============================
   TIPOS
   ============================ */

tipo returns [String tipoC, int long]
    : 'INTEGER'   { $tipoC = "int"; $long = -1; }
    | 'REAL'      { $tipoC = "float"; $long = -1; }
    | 'CHARACTER' charlength
      {
         $tipoC = "char";
         $long = $charlength.long;
      }
    ;

charlength returns [int long]
    : '(' NUM_INT_CONST ')' { $long = Integer.parseInt($NUM_INT_CONST.text); }
    | { $long = -1; }
    ;

/* ============================
   VARIABLES
   ============================ */

varlist returns [List<VariableDecl> lista]
    : IDENT init varlistp
      {
         $lista = new ArrayList<>();
         VariableDecl v = new VariableDecl(null, $IDENT.text);
         if ($init.valor != null) v.setInit($init.valor);
         $lista.add(v);
         $lista.addAll($varlistp.lista);
      }
    ;

varlistp returns [List<VariableDecl> lista]
    : COMMA IDENT init varlistp
      {
         $lista = new ArrayList<>();
         VariableDecl v = new VariableDecl(null, $IDENT.text);
         if ($init.valor != null) v.setInit($init.valor);
         $lista.add(v);
         $lista.addAll($varlistp.lista);
      }
    | { $lista = new ArrayList<>(); }
    ;

init returns [String valor]
    : ASSIGN simpvalue { $valor = $simpvalue.val; }
    | { $valor = null; }
    ;

/* ============================
   SENTENCIAS
   ============================ */

sentlist returns [String codigo]
    : sent sentlistp
      { $codigo = $sent.codigo + $sentlistp.codigo; }
    ;

sentlistp returns [String codigo]
    : sent sentlistp
      { $codigo = $sent.codigo + $sentlistp.codigo; }
    | { $codigo = ""; }
    ;

sent returns [String codigo]
    : asignacion { $codigo = $asignacion.codigo + "\n"; }
    | proc_call SEMI { $codigo = $proc_call.codigo + ";\n"; }
    | 'IF' '(' expcond ')' sentif
      { $codigo = "if(" + $expcond.codigo + ") " + $sentif.codigo + "\n"; }
    | 'DO' sentdo
      { $codigo = $sentdo.codigo + "\n"; }
    | 'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT'
      {
         $codigo = "switch(" + $exp.codigo + ") {\n" +
                   trad.indent($casos.codigo) +
                   "}\n";
      }
    ;

/* ============================
   ASIGNACIONES
   ============================ */

asignacion returns [String codigo]
    : IDENT ASSIGN exp SEMI
      {
         if (trad.getContexto().esAsignacionDeRetorno($IDENT.text))
             $codigo = "return " + $exp.codigo + ";";
         else
             $codigo = $IDENT.text + " = " + $exp.codigo + ";";
      }
    | proc_call SEMI
      { $codigo = $proc_call.codigo + ";"; }
    ;

/* ============================
   DO / WHILE
   ============================ */

sentdo returns [String codigo]
    : 'WHILE' '(' expcond ')' sentlist 'ENDDO'
      {
         $codigo = "while(" + $expcond.codigo + ") {\n" +
                   trad.indent($sentlist.codigo) +
                   "}";
      }
    | IDENT ASSIGN d1=doval COMMA d2=doval COMMA d3=doval sentlist 'ENDDO'
      {
         String var = $IDENT.text;
         String ini = $d1.val;
         String fin = $d2.val;
         String inc = $d3.val;

         $codigo = "for(" + var + " = " + ini + "; " +
                           var + " <= " + fin + "; " +
                           var + " += " + inc + ") {\n" +
                   trad.indent($sentlist.codigo) +
                   "}";
      }
    ;

/* ============================
   IF / THEN / ELSE
   ============================ */

sentif returns [String codigo]
    : sent
      { $codigo = "{\n" + trad.indent($sent.codigo) + "}\n"; }
    | 'THEN' sentlist sentthen
      { $codigo = "{\n" + trad.indent($sentlist.codigo) + "}" + $sentthen.codigo + "\n"; }
    ;

sentthen returns [String codigo]
    : 'ENDIF'
      { $codigo = ""; }
    | 'ELSE' sentlist 'ENDIF'
      { $codigo = " else {\n" + trad.indent($sentlist.codigo) + "}\n"; }
    ;

/* ============================
   EXPRESIONES
   ============================ */

exp returns [String codigo]
    : factor expp
      { $codigo = $factor.codigo + $expp.codigo; }
    ;

expp returns [String codigo]
    : op factor expp
      { $codigo = $op.text + $factor.codigo + $expp.codigo; }
    | { $codigo = ""; }
    ;

op
    : oparit
    ;

oparit
    : '+'
    | '-'
    | '*'
    | '/'
    ;

factor returns [String codigo]
    : simpvalue { $codigo = $simpvalue.val; }
    | '(' exp ')' { $codigo = "(" + $exp.codigo + ")"; }
    | IDENT factorp
      { $codigo = $IDENT.text + $factorp.codigo; }
    ;

factorp returns [String codigo]
    : '(' exp explist ')'
      { $codigo = "(" + $exp.codigo + $explist.lista + ")"; }
    | { $codigo = ""; }
    ;

explist returns [String lista]
    : COMMA exp explist
      { $lista = ", " + $exp.codigo + $explist.lista; }
    | { $lista = ""; }
    ;

/* ============================
   LLAMADAS A PROCEDIMIENTOS
   ============================ */

proc_call returns [String codigo]
    : CALL IDENT subparamlist
      {
         $codigo = $IDENT.text + "(" + $subparamlist.lista + ")";
      }
    ;

subparamlist returns [String lista]
    : '(' exp explist ')'
      { $lista = $exp.codigo + $explist.lista; }
    | { $lista = ""; }
    ;

/* ============================
   CONSTANTES
   ============================ */

ctelist
    : COMMA IDENT ASSIGN simpvalue ctelist
    |
    ;

simpvalue returns [String val]
    : NUM_INT_CONST     { $val = $NUM_INT_CONST.text; }
    | NUM_REAL_CONST    { $val = $NUM_REAL_CONST.text; }
    | STRING_CONST { $val = toCLiteral($STRING_CONST.text); }
    | NUM_INT_CONST_B   { $val = $NUM_INT_CONST_B.text; }
    | NUM_INT_CONST_O   { $val = $NUM_INT_CONST_O.text; }
    | NUM_INT_CONST_H   { $val = $NUM_INT_CONST_H.text; }
    | CONST_BOOL        { $val = $CONST_BOOL.text; }
    ;

simpvaluep returns [String val]
    : simpvalue { $val = $simpvalue.val; }
    | { $val = ""; }
    ;

/* ============================
   PARÁMETROS
   ============================ */

formal_paramlist returns [List<Parametro> lista]
    : '(' nomparamlist ')' { $lista = $nomparamlist.lista; }
    | { $lista = new ArrayList<>(); }
    ;

nomparamlist returns [List<Parametro> lista]
    : IDENT nomparamlistp
      {
         $lista = new ArrayList<>();
         $lista.add(new Parametro(null, $IDENT.text, false));
         $lista.addAll($nomparamlistp.lista);
      }
    ;

nomparamlistp returns [List<Parametro> lista]
    : COMMA nomparamlist
      { $lista = $nomparamlist.lista; }
    | { $lista = new ArrayList<>(); }
    ;

/* ============================
   SUBPROGRAMAS (CABECERAS)
   ============================ */

decproc
    : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' IDENT
      {
         // Combinar nombres (formal_paramlist) con tipos (dec_s_paramlist)
         List<Parametro> params = new ArrayList<>();

         for (int i = 0; i < $formal_paramlist.lista.size(); i++) {
             Parametro p = $formal_paramlist.lista.get(i);
             Parametro q = $dec_s_paramlist.lista.get(i);

             p.tipo = q.tipo;
             p.esCadena = q.esCadena;
         }

         trad.addDecFun("void", $IDENT.text, $formal_paramlist.lista);
      }
    ;


dec_s_paramlist returns [List<Parametro> lista]
    : tipo COMMA 'INTENT' '(' tipoparam ')' IDENT SEMI dec_s_paramlist
      {
         $lista = new ArrayList<>();
         Parametro p;

         if ($tipo.tipoC.equals("char") && $tipo.long > 0)
             p = new Parametro("char[" + $tipo.long + "]", $IDENT.text, true);
         else
             p = new Parametro($tipo.tipoC, $IDENT.text, true);

         $lista.add(p);
         $lista.addAll($dec_s_paramlist.lista);
      }
    | { $lista = new ArrayList<>(); }
    ;

tipoparam
    : 'IN'
    | 'OUT'
    | 'INOUT'
    ;
decfun
    : 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT SEMI dec_f_paramlist 'END' 'FUNCTION' IDENT
      {
         List<Parametro> params = new ArrayList<>();

         for (int i = 0; i < $nomparamlist.lista.size(); i++) {
             Parametro p = $nomparamlist.lista.get(i);
             Parametro q = $dec_f_paramlist.lista.get(i);

             p.tipo = q.tipo;
             p.esCadena = q.esCadena;
         }

         trad.addDecFun($tipo.tipoC, $IDENT.text, $nomparamlist.lista);
      }
    ;

dec_f_paramlist returns [List<Parametro> lista]
    : tipo COMMA 'INTENT' '(' 'IN' ')' IDENT SEMI dec_f_paramlist
      {
         $lista = new ArrayList<>();
         Parametro p;

         if ($tipo.tipoC.equals("char") && $tipo.long > 0)
             p = new Parametro("char[" + $tipo.long + "]", $IDENT.text, true);
         else
             p = new Parametro($tipo.tipoC, $IDENT.text, true);

         $lista.add(p);
         $lista.addAll($dec_f_paramlist.lista);
      }
    | { $lista = new ArrayList<>(); }
    ;


/* ============================
   SUBPROGRAMAS (IMPLEMENTACIÓN)
   ============================ */

subproglist
    : codproc subproglist
    | codfun subproglist
    |
    ;

codproc returns [String codigo]
    : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist dcllist sentlist 'END' 'SUBROUTINE' IDENT
      {
         // Combinar nombres (formal_paramlist) con tipos (dec_s_paramlist)
         for (int i = 0; i < $formal_paramlist.lista.size(); i++) {
             Parametro p = $formal_paramlist.lista.get(i);
             Parametro q = $dec_s_paramlist.lista.get(i);

             p.tipo = q.tipo;
             p.esCadena = q.esCadena;
         }

         trad.getContexto().entrarProcedimiento($IDENT.text);
         trad.addProcedimiento($IDENT.text, $formal_paramlist.lista, $dcllist.listaVars, $sentlist.codigo);
         trad.getContexto().salir();
         $codigo = "";
      }
    ;


codfun returns [String codigo]
    : 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT SEMI dec_f_paramlist dcllist sentlist IDENT ASSIGN exp SEMI 'END' 'FUNCTION' IDENT
      {
         // Combinar nombres (nomparamlist) con tipos (dec_f_paramlist)
         for (int i = 0; i < $nomparamlist.lista.size(); i++) {
             Parametro p = $nomparamlist.lista.get(i);
             Parametro q = $dec_f_paramlist.lista.get(i);

             p.tipo = q.tipo;
             p.esCadena = q.esCadena;
         }

         trad.getContexto().entrarFuncion($IDENT.text, $tipo.tipoC);

         String cuerpo = $sentlist.codigo + "return " + $exp.codigo + ";";

         trad.addFuncion($IDENT.text, $tipo.tipoC, $nomparamlist.lista, $dcllist.listaVars, cuerpo);

         trad.getContexto().salir();
         $codigo = "";
      }
    ;


/* ============================
   CONDICIONES
   ============================ */

expcond returns [String codigo]
    : factorcond expcondp
      { $codigo = $factorcond.codigo + $expcondp.codigo; }
    ;

expcondp returns [String codigo]
    : oplog factorcond expcondp
      { $codigo = $oplog.text + $factorcond.codigo + $expcondp.codigo; }
    | { $codigo = ""; }
    ;

oplog
    : '.OR.'
    | '.AND.'
    | '.EQV.'
    | '.NEQV.'
    ;

factorcond returns [String codigo]
    : e1=exp opcomp e2=exp
      { $codigo = $e1.codigo + $opcomp.text + $e2.codigo; }
    | '(' expcond ')'
      { $codigo = "(" + $expcond.codigo + ")"; }
    | '.NOT.' factorcond
      { $codigo = "!" + $factorcond.codigo; }
    | CONST_BOOL
      { $codigo = $CONST_BOOL.text; }
    ;

opcomp
    : LT
    | GT
    | LE
    | GE
    | EQ
    | NE
    ;

/* === BLOQUE 5: doval === */

doval returns [String val]
    : NUM_INT_CONST { $val = $NUM_INT_CONST.text; }
    | IDENT         { $val = $IDENT.text; }
    ;

/* ============================
   SELECT CASE
   ============================ */

casos returns [String codigo]
    : 'CASE' casosp
      { $codigo = $casosp.codigo; }
    | { $codigo = ""; }
    ;

casosp returns [String codigo]
    : '(' etiquetas ')' sentlist casos
      {
         List<String> lista = $etiquetas.lista;
         StringBuilder sb = new StringBuilder();

         for (String e : lista) {
             sb.append("case ").append(e).append(":\n");
         }

         sb.append(trad.indent($sentlist.codigo));
         sb.append("break;\n");
         sb.append($casos.codigo);

         $codigo = sb.toString();
      }
    | 'DEFAULT' sentlist
      {
         $codigo = "default:\n" +
                   trad.indent($sentlist.codigo) +
                   "break;\n";
      }
    ;

etiquetas returns [List<String> lista]
    : simpvalue etiquetasp
      {
         $lista = new ArrayList<>();
         $lista.addAll(expandCase($simpvalue.val));
         $lista.addAll($etiquetasp.lista);
      }
    | COLON simpvalue
      {
         $lista = expandCase(":" + $simpvalue.val);
      }
    ;

etiquetasp returns [List<String> lista]
    : listaetiquetas
      { $lista = $listaetiquetas.lista; }
    | COLON simpvaluep
      {
         $lista = expandCase($simpvaluep.val);
      }
    ;

listaetiquetas returns [List<String> lista]
    : COMMA simpvalue listaetiquetas
      {
         $lista = new ArrayList<>();
         $lista.addAll(expandCase($simpvalue.val));
         $lista.addAll($listaetiquetas.lista);
      }
    | { $lista = new ArrayList<>(); }
    ;

/* ============================
   TOKENS
   ============================ */

CALL : 'CALL' ;
IDENT : [a-zA-Z] [a-zA-Z0-9_]* ;
LT    : '<' ;
GT    : '>' ;
GE    : '>=' ;
LE    : '<=' ;
EQ    : '==' ;
NE    : '/=' ;
COLON : ':' ;
COMMA : ',' ;
SEMI  : ';' ;
ASSIGN: '=' ;

NUM_INT_CONST_B: 'b' '\'' [0-1]+ '\'' ;
NUM_INT_CONST_O: 'o' '\'' [0-7]+ '\'' ;
NUM_INT_CONST_H: 'z' '\'' [0-9A-F]+ '\'' ;
CONST_BOOL: '.TRUE.' | '.FALSE.' ;

NUM_INT_CONST : '-'? [0-9]+ ;

NUM_REAL_CONST
    : '-'? [0-9]+ '.' [0-9]+ ([eE] '-'? [0-9]+)?
    | '-'? [0-9]+ [eE] '-'? [0-9]+
    ;

STRING_CONST
    : '\'' ( ~['] | '\'\'' )* '\''
    | '"' ( ~["] | '""' )* '"'
    ;

COMMENT : '!' ~[\r\n]* -> skip ;
WS : [ \t\r\n]+ -> skip ;
