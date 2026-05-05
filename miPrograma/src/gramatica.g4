grammar gramatica;

@header {
    import java.util.*;
}

@members {
    Traductor trad = new Traductor();
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
         for (VariableDecl v : $listaVars)
             v.tipo = $tipo.tipoC;
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

tipo returns [String tipoC]
    : 'INTEGER'   { $tipoC = "int"; }
    | 'REAL'      { $tipoC = "float"; }
    | 'CHARACTER' charlength
      {
         $tipoC = "char";
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
         if ($init.init != null) v.setInit($init.init);
         $lista.add(v);
         $lista.addAll($varlistp.lista);
      }
    ;

varlistp returns [List<VariableDecl> lista]
    : COMMA IDENT init varlistp
      {
         $lista = new ArrayList<>();
         VariableDecl v = new VariableDecl(null, $IDENT.text);
         if ($init.init != null) v.setInit($init.init);
         $lista.add(v);
         $lista.addAll($varlistp.lista);
      }
    | { $lista = new ArrayList<>(); }
    ;

init returns [String init]
    : ASSIGN simpvalue { $init = $simpvalue.val; }
    | { $init = null; }
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
    | 'IF' '(' expcond ')' sentif
      { $codigo = "if(" + $expcond.codigo + ") " + $sentif.codigo + "\n"; }
    | 'DO' sentdo
      { $codigo = $sentdo.codigo + "\n"; }
    | 'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT'
      { $codigo = "// SELECT CASE no implementado\n"; }
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
    | IDENT ASSIGN doval COMMA doval COMMA doval sentlist 'ENDDO'
      {
         $codigo = "// DO loop no implementado\n";
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
    | STRING_CONST      { $val = $STRING_CONST.text; }
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
         $lista.add(new Parametro("int", $IDENT.text, false));
         $lista.addAll($nomparamlistp.lista);
      }
    ;

nomparamlistp returns [List<Parametro> lista]
    : COMMA nomparamlist
      { $lista = $nomparamlist.lista; }
    | { $lista = new ArrayList<>(); }
    ;

/* ============================
   SUBPROGRAMAS
   ============================ */

decproc
    : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' IDENT
    ;

dec_s_paramlist
    : tipo COMMA 'INTENT' '(' tipoparam ')' IDENT SEMI dec_s_paramlist
    | 
    ;

tipoparam
    : 'IN'
    | 'OUT'
    | 'INOUT'
    ;

decfun
    : 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT SEMI dec_f_paramlist 'END' 'FUNCTION' IDENT
    ;

dec_f_paramlist
    : tipo COMMA 'INTENT' '(' 'IN' ')' IDENT SEMI dec_f_paramlist
    | 
    ;

subproglist
    : codproc subproglist
    | codfun subproglist
    | 
    ;

codproc returns [String codigo]
    : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist dcllist sentlist 'END' 'SUBROUTINE' IDENT
      {
         trad.getContexto().entrarProcedimiento($IDENT.text);
         trad.addProcedimiento($IDENT.text, $formal_paramlist.lista, $dcllist.listaVars, $sentlist.codigo);
         trad.getContexto().salir();
         $codigo = "";
      }
    ;

codfun returns [String codigo]
    : 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT SEMI dec_f_paramlist dcllist sentlist IDENT ASSIGN exp SEMI 'END' 'FUNCTION' IDENT
      {
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
    : exp opcomp exp
      { $codigo = $exp(0).codigo + $opcomp.text + $exp(1).codigo; }
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

doval
    : NUM_INT_CONST
    | IDENT
    ;

casos
    : 'CASE' casosp
    | 
    ;

casosp
    : '(' etiquetas ')' sentlist casos
    | 'DEFAULT' sentlist
    ;

etiquetas
    : simpvalue etiquetasp
    | COLON simpvalue
    ;

etiquetasp
    : listaetiquetas
    | COLON simpvaluep
    ;

listaetiquetas
    : COMMA simpvalue listaetiquetas
    | 
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
