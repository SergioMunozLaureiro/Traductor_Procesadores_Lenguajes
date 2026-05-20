grammar gramatica;

@header {
    import java.util.*;
}

@members {
    Traductor trad = new Traductor();

    public static String toCLiteral(String s) {
        char delim = s.charAt(0);
        String inner = s.substring(1, s.length() - 1);
        // Des-duplicar comillas del lenguaje fuente
        if (delim == '\'') {
            inner = inner.replace("''", "'");
        } else {
            inner = inner.replace("\"\"", "\"");
        }
        // Escapar comillas dobles para el lenguaje final (C)
        inner = inner.replace("\"", "\\\"");
        return "\"" + inner + "\"";
    }

    // Evita que concatenaciones con atributos null (tras recuperación de error)
    // produzcan el string literal "null"
    public static String s(String v) {
        return v != null ? v : "";
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
         trad.addDefines($ctelist.pares);
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
      { $codigo = s($sent.codigo) + s($sentlistp.codigo); }
    ;

sentlistp returns [String codigo]
    : sent sentlistp
      { $codigo = s($sent.codigo) + s($sentlistp.codigo); }
    | { $codigo = ""; }
    ;

sent returns [String codigo]
    : asignacion { $codigo = s($asignacion.codigo) + "\n"; }
    | 'IF' '(' expcond ')' sentif
      { $codigo = "if(" + s($expcond.codigo) + ") " + s($sentif.codigo) + "\n"; }
    | 'DO' sentdo
      { $codigo = s($sentdo.codigo) + "\n"; }
    | 'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT'
      {
         $codigo = "switch(" + s($exp.codigo) + ") {\n" +
                   trad.indent(s($casos.codigo)) +
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
         else if (trad.esParametroReferencia($IDENT.text))
             $codigo = "*" + $IDENT.text + " = " + $exp.codigo + ";";
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
                           var + " != " + fin + "; " +
                           var + " = " + var + " + " + inc + ") {\n" +
                   trad.indent($sentlist.codigo) +
                   "}";
      }
    ;

/* ============================
   IF / THEN / ELSE
   ============================ */

sentif returns [String codigo]
    : sent
      { $codigo = "{\n" + trad.indent(s($sent.codigo)) + "}\n"; }
    | 'THEN' sentlist sentthen
      { $codigo = "{\n" + trad.indent(s($sentlist.codigo)) + "}" + s($sentthen.codigo) + "\n"; }
    ;

sentthen returns [String codigo]
    : 'ENDIF'
      { $codigo = ""; }
    | 'ELSE' sentlist 'ENDIF'
      { $codigo = " else {\n" + trad.indent(s($sentlist.codigo)) + "}\n"; }
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
         $codigo = $IDENT.text + "(" + trad.procesarLlamada($IDENT.text, $subparamlist.lista) + ")";
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

ctelist returns [List<String[]> pares]
    : COMMA IDENT ASSIGN simpvalue ctelist
      {
         $pares = new ArrayList<>();
         $pares.add(new String[]{ $IDENT.text, $simpvalue.val });
         $pares.addAll($ctelist.pares);
      }
    | { $pares = new ArrayList<>(); }
    ;
simpvalue returns [String val]
    : NUM_INT_CONST     { $val = $NUM_INT_CONST.text; }
    | NUM_REAL_CONST    { $val = $NUM_REAL_CONST.text; }
    | STRING_CONST      { $val = toCLiteral($STRING_CONST.text); }

    // BINARIO → 0b...
    | NUM_INT_CONST_B {
         String raw = $NUM_INT_CONST_B.text;   // b'011'
         String inner = raw.substring(2, raw.length()-1);
         $val = "0b" + inner;
      }

    // OCTAL → 0o...
    | NUM_INT_CONST_O {
         String raw = $NUM_INT_CONST_O.text;
         String inner = raw.substring(2, raw.length()-1);
         $val = "0o" + inner;
      }

    // HEXA → 0x...
    | NUM_INT_CONST_H {
         String raw = $NUM_INT_CONST_H.text;
         String inner = raw.substring(2, raw.length()-1);
         $val = "0x" + inner;
      }

    // BOOLEANOS → 1 / 0
    | CONST_BOOL {
         if ($CONST_BOOL.text.equals(".TRUE.")) $val = "1";
         else $val = "0";
      }
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
         // Comprobar que los nombres del SUBROUTINE coinciden
         if (!($IDENT(0).getText().equals($IDENT(1).getText()))) {
             trad.error("Nombre de subprograma no coincide en declaración SUBROUTINE: "
                        + $IDENT(0).getText() + " vs " + $IDENT(1).getText());
         }

         for (int i = 0; i < $formal_paramlist.lista.size(); i++) {
             Parametro p = $formal_paramlist.lista.get(i);
             Parametro q = $dec_s_paramlist.lista.get(i);

             // Comprobar que los nombres de parámetros coinciden
             if (!p.nombre.equals(q.nombre)) {
                 trad.error("Nombre de parámetro no coincide en declaración SUBROUTINE "
                            + $IDENT(0).getText() + ": " + p.nombre + " vs " + q.nombre);
             }

             p.tipo = q.tipo;
             p.esCadena = q.esCadena;
             p.esReferencia = q.esReferencia;
         }

         trad.addDecFun("void", $IDENT(0).getText(), $formal_paramlist.lista);
      }
    ;


dec_s_paramlist returns [List<Parametro> lista]
    : tipo COMMA 'INTENT' '(' tipoparam ')' IDENT SEMI dec_s_paramlist
      {
         $lista = new ArrayList<>();
         Parametro p;

         if ($tipo.tipoC.equals("char") && $tipo.long > 0)
             p = new Parametro("char[" + $tipo.long + "]", $IDENT.text, true);
         else if ($tipo.tipoC.equals("char"))
             p = new Parametro($tipo.tipoC, $IDENT.text, true);
         else
             p = new Parametro($tipo.tipoC, $IDENT.text, false);

         $lista.add(p);
         $lista.addAll($dec_s_paramlist.lista);
         if ($tipoparam.text.equals("OUT") || $tipoparam.text.equals("INOUT"))
             p.esReferencia = true;

      }
    | { $lista = new ArrayList<>(); }
    ;

tipoparam
    : 'IN'
    | 'OUT'
    | 'INOUT'
    ;
decfun returns [String nombreRetorno]
    : 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT SEMI dec_f_paramlist 'END' 'FUNCTION' IDENT
      {
         for (int i = 0; i < $nomparamlist.lista.size(); i++) {
             Parametro p = $nomparamlist.lista.get(i);
             Parametro q = $dec_f_paramlist.lista.get(i);

             // Comprobar que los nombres de parámetros coinciden
             if (!p.nombre.equals(q.nombre)) {
                 trad.error("Nombre de parámetro no coincide en declaración FUNCTION "
                            + $IDENT(0).getText() + ": " + p.nombre + " vs " + q.nombre);
             }

             p.tipo = q.tipo;
             p.esCadena = q.esCadena;
         }

         // Comprobar nombre de función (inicio vs fin)
         if (!($IDENT(0).getText().equals($IDENT(2).getText()))) {
             trad.error("Nombre de subprograma no coincide en declaración FUNCTION: "
                        + $IDENT(0).getText() + " vs " + $IDENT(2).getText());
         }

         // Comprobar que el nombre de retorno coincide con el nombre de la función
         if (!($IDENT(0).getText().equals($IDENT(1).getText()))) {
             trad.error("Nombre de retorno no coincide con nombre de función: "
                        + $IDENT(1).getText() + " vs " + $IDENT(0).getText());
         }

         $nombreRetorno = $IDENT(1).getText();

         trad.addDecFun($tipo.tipoC, $IDENT(0).getText(), $nomparamlist.lista);
      }
    ;


dec_f_paramlist returns [List<Parametro> lista]
    : tipo COMMA 'INTENT' '(' 'IN' ')' IDENT SEMI dec_f_paramlist
      {
         $lista = new ArrayList<>();
         Parametro p;

         if ($tipo.tipoC.equals("char") && $tipo.long > 0)
             p = new Parametro("char[" + $tipo.long + "]", $IDENT.text, true);
         else if ($tipo.tipoC.equals("char"))
             p = new Parametro($tipo.tipoC, $IDENT.text, true);
         else
             p = new Parametro($tipo.tipoC, $IDENT.text, false);

         // IN → no referencia
         p.esReferencia = false;

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
    : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist
      {
         // Entrar en contexto de procedimiento ANTES de parsear sentlist
         // para que esParametroReferencia funcione
         for (int i = 0; i < $formal_paramlist.lista.size(); i++) {
             Parametro p = $formal_paramlist.lista.get(i);
             if (i < $dec_s_paramlist.lista.size()) {
                 Parametro q = $dec_s_paramlist.lista.get(i);

                 if (!p.nombre.equals(q.nombre)) {
                     trad.error("Nombre de parámetro no coincide en implementación SUBROUTINE "
                                + $IDENT(0).getText() + ": " + p.nombre + " vs " + q.nombre);
                 }

                 p.tipo = q.tipo;
                 p.esCadena = q.esCadena;
                 p.esReferencia = q.esReferencia;
             }
         }
         trad.getContexto().entrarProcedimiento($IDENT(0).getText(), $formal_paramlist.lista);
      }
      dcllist sentlist 'END' 'SUBROUTINE' IDENT
      {
         if (!($IDENT(0).getText().equals($IDENT(1).getText()))) {
             trad.error("Nombre de subprograma no coincide en implementación SUBROUTINE: "
                        + $IDENT(0).getText() + " vs " + $IDENT(1).getText());
         }

         trad.addProcedimiento($IDENT(0).getText(), $formal_paramlist.lista, $dcllist.listaVars, $sentlist.codigo);
         trad.getContexto().salir();
      }
    ;
codfun returns [String nombreRetorno]
    : 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT SEMI dec_f_paramlist
      {
         // Entrar en contexto de función ANTES de parsear sentlist
         // para que esAsignacionDeRetorno funcione
         for (int i = 0; i < $nomparamlist.lista.size(); i++) {
             Parametro p = $nomparamlist.lista.get(i);
             if (i < $dec_f_paramlist.lista.size()) {
                 Parametro q = $dec_f_paramlist.lista.get(i);

                 if (!p.nombre.equals(q.nombre)) {
                     trad.error("Nombre de parámetro no coincide en implementación FUNCTION "
                                + $IDENT(0).getText() + ": " + p.nombre + " vs " + q.nombre);
                 }

                 p.tipo = q.tipo;
                 p.esCadena = q.esCadena;
             }
         }
         trad.getContexto().entrarFuncion($IDENT(0).getText(), $tipo.tipoC, $nomparamlist.lista);
      }
      dcllist sentlist
      'END' 'FUNCTION' IDENT
      {
         // Comprobar nombre de función (IDENT(0) vs IDENT(2))
         if (!($IDENT(0).getText().equals($IDENT(2).getText()))) {
             trad.error("Nombre de subprograma no coincide en implementación FUNCTION: "
                        + $IDENT(0).getText() + " vs " + $IDENT(2).getText());
         }

         // Comprobar que el nombre de retorno coincide con el nombre de la función
         if (!($IDENT(0).getText().equals($IDENT(1).getText()))) {
             trad.error("Nombre de retorno no coincide con nombre de función: "
                        + $IDENT(1).getText() + " vs " + $IDENT(0).getText());
         }

         $nombreRetorno = $IDENT(1).getText();

         trad.addFuncion($IDENT(0).getText(), $tipo.tipoC, $nomparamlist.lista,
                         $dcllist.listaVars, $sentlist.codigo, $nombreRetorno);

         trad.getContexto().salir();
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

oplog returns [String text]
    : '.OR.'   { $text = "||"; }
    | '.AND.'  { $text = "&&"; }
    | '.EQV.'  { $text = "!^"; }
    | '.NEQV.' { $text = "^"; }
    ;




factorcond returns [String codigo]
    : e1=exp opcomp e2=exp
      {
          String op = $opcomp.text.equals("/=") ? "!=" : $opcomp.text;
          $codigo = $e1.codigo + op + $e2.codigo;
      }
    | '(' expcond ')'
      { $codigo = "(" + $expcond.codigo + ")"; }
    | '.NOT.' factorcond
      { $codigo = "!" + $factorcond.codigo; }
    | CONST_BOOL
      { $codigo = $CONST_BOOL.text.equals(".TRUE.") ? "1" : "0"; }
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
             if (e.startsWith("<") || e.startsWith(">")) {
                 // límite superior/inferior: "< X" → "case < X:"  o "> X" → "case > X:"
                 sb.append("case ").append(e).append(":\n");
             } else if (e.contains(" to ")) {
                 // rango: "X to Y" → "case X to Y:"
                 sb.append("case ").append(e).append(":\n");
             } else {
                 sb.append("case ").append(e).append(":\n");
             }
         }

         sb.append(trad.indent($sentlist.codigo));
         sb.append("break;\n");
         sb.append($casos.codigo);

         $codigo = sb.toString();
      }
    | 'DEFAULT' sentlist
      {
         $codigo = "default:\n" +
                   trad.indent($sentlist.codigo);
      }
    ;


etiquetas returns [List<String> lista]
    : simpvalue etiquetasp
      {
         $lista = new ArrayList<>();
         String sv = $simpvalue.val;
         String ep = $etiquetasp.sufijo;
         if (ep != null && ep.startsWith("to")) {
             // caso0 : caso1  →  rango  →  "caso0 to caso1"
             $lista.add(sv + " " + ep);
         } else if (ep != null && ep.equals(">")) {
             // caso3 :        →  límite inferior  →  "> caso3"
             $lista.add("> " + sv);
         } else {
             // lista simple de valores
             $lista.add(sv);
             $lista.addAll($etiquetasp.lista);
         }
      }
    | COLON simpvalue
      {
         // : caso2  →  límite superior  →  "< caso2"
         $lista = new ArrayList<>();
         $lista.add("< " + $simpvalue.val);
      }
    ;

etiquetasp returns [List<String> lista, String sufijo]
    : COLON simpvaluep
      {
         // caso3 :  →  límite inferior  →  "> caso3"
         // caso0 : caso1  →  rango  →  "caso0 to caso1"
         String sv = $simpvaluep.val;
         if (sv != null && !sv.isEmpty()) {
             $sufijo = "to " + sv;
         } else {
             $sufijo = ">";
         }
         $lista = new ArrayList<>();
      }
    | listaetiquetas
      {
         $lista = $listaetiquetas.lista;
         $sufijo = null;
      }
    ;

listaetiquetas returns [List<String> lista]
    : COMMA simpvalue listaetiquetas
      {
         $lista = new ArrayList<>();
         $lista.add($simpvalue.val);
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
NE : '/=' ;
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
