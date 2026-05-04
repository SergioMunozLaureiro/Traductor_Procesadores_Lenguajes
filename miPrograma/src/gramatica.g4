grammar gramatica;


prg: 'PROGRAM' IDENT SEMI dcllist cabecera sentlist 'END' 'PROGRAM' IDENT subproglist  EOF;


dcllist:dcl dcllist | ;
dcl: tipo dclp;
dclp: COMMA 'PARAMETER' '::' IDENT ASSIGN simpvalue ctelist SEMI| '::' varlist SEMI; //defcte | defvar
cabecera: 'INTERFACE' cablist 'END' 'INTERFACE' | ;
cablist : dec_elemento decsubprog|  ;

decsubprog : dec_elemento decsubprog | ;//factorizacion en decsubprog añladido dec_elemento

dec_elemento : decproc | decfun ;

sentlist: sent sentlistp ;
sentlistp: sent sentlistp | ;


ctelist:COMMA IDENT ASSIGN simpvalue ctelist | ;
simpvalue:NUM_INT_CONST | NUM_REAL_CONST | STRING_CONST | NUM_INT_CONST_B | NUM_INT_CONST_O | NUM_INT_CONST_H | CONST_BOOL; //CON PARTE OPCIONAL
tipo:'INTEGER' | 'REAL' | 'CHARACTER' charlength;
charlength:'(' NUM_INT_CONST ')' | ;



varlist: IDENT init varlistp;
varlistp:COMMA IDENT init varlistp| ;

init: ASSIGN simpvalue| ;

decproc:'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' IDENT;
formal_paramlist : '(' nomparamlist ')' | ;

nomparamlist:IDENT nomparamlistp;
nomparamlistp: COMMA nomparamlist| ;

dec_s_paramlist:tipo COMMA 'INTENT' '(' tipoparam ')' IDENT SEMI dec_s_paramlist| ;//DIR IGUALES->LL(2) en codproc
tipoparam:'IN'|'OUT'|'INOUT';
decfun:'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT SEMI dec_f_paramlist 'END' 'FUNCTION' IDENT;
dec_f_paramlist: tipo COMMA 'INTENT' '(' 'IN' ')' IDENT SEMI  dec_f_paramlist| ;//DIR IGUALES->LL(2) en codfun


sent:asignacion | 'IF' '(' expcond ')' sentif
| 'DO' sentdo | 'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT'; //parte opcional incliuida
asignacion: IDENT ASSIGN exp SEMI | proc_call SEMI ;
sentdo: 'WHILE' '(' expcond ')' sentlist 'ENDDO' | IDENT ASSIGN doval COMMA doval COMMA doval sentlist 'ENDDO';//Opcional
sentif: sent | 'THEN' sentlist sentthen;//opcional
sentthen: 'ENDIF' | 'ELSE' sentlist 'ENDIF' ;//opcional
exp:factor expp;
expp:op factor expp| ;
op:oparit;
oparit: '+'| '-'| '*'| '/';
factor: simpvalue | '(' exp ')' | IDENT factorp;
factorp: '(' exp explist ')' | ;

explist:COMMA exp explist| ;
proc_call: CALL IDENT subparamlist;
subparamlist: '(' exp explist ')' | ;

subproglist : codproc subproglist| codfun subproglist|  ;
codproc: 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist dcllist sentlist 'END' 'SUBROUTINE' IDENT; //si despues del formal_paramlist lee tipo, no se sabe si es tipo de dec_s_paramlist, o si en cambio es de dcllist porque el anterior es vacio
codfun: 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT SEMI dec_f_paramlist dcllist sentlist IDENT ASSIGN exp SEMI 'END' 'FUNCTION' IDENT;

//OPCIONAL

expcond:factorcond expcondp;
expcondp: oplog factorcond expcondp | ;

oplog: '.OR.' | '.AND.' | '.EQV.' | '.NEQV.' ;
factorcond: exp opcomp exp | '(' expcond ')' | '.NOT.' factorcond | CONST_BOOL ;
opcomp: LT | GT | LE | GE | EQ | NE ;

doval: NUM_INT_CONST | IDENT ;
casos: 'CASE' casosp| ;
casosp: '(' etiquetas ')' sentlist casos | 'DEFAULT' sentlist;
etiquetas: simpvalue etiquetasp | COLON simpvalue ;
etiquetasp: listaetiquetas | COLON simpvaluep ;
simpvaluep:simpvalue | ;
listaetiquetas: COMMA simpvalue listaetiquetas | ;

//fin opcional

CALL : 'CALL' ;
IDENT : [a-zA-Z] [a-zA-Z0-9_]* ;
LT    : '<' ;
GT    : '>' ;
GE    : '>=' ;
LE   : '<=' ;
EQ    : '==' ;
NE    : '/=' ;
COLON : ':' ;
COMMA : ',' ;
SEMI  : ';' ;
ASSIGN: '=' ;

// OPCIONAL
NUM_INT_CONST_B: 'b' '\'' [0-1]+ '\'' ;
NUM_INT_CONST_O: 'o' '\'' [0-7]+ '\'' ;
NUM_INT_CONST_H: 'z' '\'' [0-9A-F]+ '\'' ;
CONST_BOOL: '.TRUE.' | '.FALSE.' ;
//fin opcional
NUM_INT_CONST : '-'? [0-9]+ ;

NUM_REAL_CONST
    : '-'? [0-9]+ '.' [0-9]+ ([eE] '-'  ? [0-9]+)?
    | '-'? [0-9]+ [eE] '-'? [0-9]+
    ;

STRING_CONST
    : '\'' ( ~['] | '\'\'' )* '\''
    | '"' ( ~["] | '""' )* '"'
    ;

COMMENT : '!' ~[\r\n]* -> skip ;
WS : [ \t\r\n]+ -> skip ;