// Generated from src/gramatica.g4 by ANTLR 4.13.2

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, CALL=36, IDENT=37, LT=38, GT=39, 
		GE=40, LE=41, EQ=42, NE=43, COLON=44, COMMA=45, SEMI=46, ASSIGN=47, NUM_INT_CONST_B=48, 
		NUM_INT_CONST_O=49, NUM_INT_CONST_H=50, CONST_BOOL=51, NUM_INT_CONST=52, 
		NUM_REAL_CONST=53, STRING_CONST=54, COMMENT=55, WS=56;
	public static final int
		RULE_prg = 0, RULE_dcllist = 1, RULE_dcl = 2, RULE_dclp = 3, RULE_cabecera = 4, 
		RULE_cablist = 5, RULE_decsubprog = 6, RULE_dec_elemento = 7, RULE_tipo = 8, 
		RULE_charlength = 9, RULE_varlist = 10, RULE_varlistp = 11, RULE_init = 12, 
		RULE_sentlist = 13, RULE_sentlistp = 14, RULE_sent = 15, RULE_asignacion = 16, 
		RULE_sentdo = 17, RULE_sentif = 18, RULE_sentthen = 19, RULE_exp = 20, 
		RULE_expp = 21, RULE_op = 22, RULE_oparit = 23, RULE_factor = 24, RULE_factorp = 25, 
		RULE_explist = 26, RULE_proc_call = 27, RULE_subparamlist = 28, RULE_ctelist = 29, 
		RULE_simpvalue = 30, RULE_simpvaluep = 31, RULE_formal_paramlist = 32, 
		RULE_nomparamlist = 33, RULE_nomparamlistp = 34, RULE_decproc = 35, RULE_dec_s_paramlist = 36, 
		RULE_tipoparam = 37, RULE_decfun = 38, RULE_dec_f_paramlist = 39, RULE_subproglist = 40, 
		RULE_codproc = 41, RULE_codfun = 42, RULE_expcond = 43, RULE_expcondp = 44, 
		RULE_oplog = 45, RULE_factorcond = 46, RULE_opcomp = 47, RULE_doval = 48, 
		RULE_casos = 49, RULE_casosp = 50, RULE_etiquetas = 51, RULE_etiquetasp = 52, 
		RULE_listaetiquetas = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "dcllist", "dcl", "dclp", "cabecera", "cablist", "decsubprog", 
			"dec_elemento", "tipo", "charlength", "varlist", "varlistp", "init", 
			"sentlist", "sentlistp", "sent", "asignacion", "sentdo", "sentif", "sentthen", 
			"exp", "expp", "op", "oparit", "factor", "factorp", "explist", "proc_call", 
			"subparamlist", "ctelist", "simpvalue", "simpvaluep", "formal_paramlist", 
			"nomparamlist", "nomparamlistp", "decproc", "dec_s_paramlist", "tipoparam", 
			"decfun", "dec_f_paramlist", "subproglist", "codproc", "codfun", "expcond", 
			"expcondp", "oplog", "factorcond", "opcomp", "doval", "casos", "casosp", 
			"etiquetas", "etiquetasp", "listaetiquetas"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'END'", "'PARAMETER'", "'::'", "'INTERFACE'", "'INTEGER'", 
			"'REAL'", "'CHARACTER'", "'('", "')'", "'IF'", "'DO'", "'SELECT'", "'CASE'", 
			"'WHILE'", "'ENDDO'", "'THEN'", "'ENDIF'", "'ELSE'", "'+'", "'-'", "'*'", 
			"'/'", "'SUBROUTINE'", "'INTENT'", "'IN'", "'OUT'", "'INOUT'", "'FUNCTION'", 
			"'.OR.'", "'.AND.'", "'.EQV.'", "'.NEQV.'", "'.NOT.'", "'DEFAULT'", "'CALL'", 
			null, "'<'", "'>'", "'>='", "'<='", "'=='", "'/='", "':'", "','", "';'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"CALL", "IDENT", "LT", "GT", "GE", "LE", "EQ", "NE", "COLON", "COMMA", 
			"SEMI", "ASSIGN", "NUM_INT_CONST_B", "NUM_INT_CONST_O", "NUM_INT_CONST_H", 
			"CONST_BOOL", "NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", "COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrgContext extends ParserRuleContext {
		public String codigo;
		public DcllistContext dcllist;
		public SentlistContext sentlist;
		public List<TerminalNode> IDENT() { return getTokens(gramaticaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(gramaticaParser.IDENT, i);
		}
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public CabeceraContext cabecera() {
			return getRuleContext(CabeceraContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gramaticaParser.EOF, 0); }
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrg(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__0);
			setState(109);
			match(IDENT);
			setState(110);
			match(SEMI);
			setState(111);
			((PrgContext)_localctx).dcllist = dcllist();
			setState(112);
			cabecera();
			setState(113);
			((PrgContext)_localctx).sentlist = sentlist();
			setState(114);
			match(T__1);
			setState(115);
			match(T__0);
			setState(116);
			match(IDENT);
			setState(117);
			subproglist();
			setState(118);
			match(EOF);

			         trad.getContexto().entrarMain();
			         trad.generarMain(((PrgContext)_localctx).dcllist.listaVars, ((PrgContext)_localctx).sentlist.codigo);
			         trad.getContexto().salir();
			         ((PrgContext)_localctx).codigo =  trad.generarPrograma();
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DcllistContext extends ParserRuleContext {
		public List<VariableDecl> listaVars;
		public DclContext dcl;
		public DcllistContext dcllist;
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDcllist(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				((DcllistContext)_localctx).dcl = dcl();
				setState(122);
				((DcllistContext)_localctx).dcllist = dcllist();

				         ((DcllistContext)_localctx).listaVars =  new ArrayList<>();
				         _localctx.listaVars.addAll(((DcllistContext)_localctx).dcl.listaVars);
				         _localctx.listaVars.addAll(((DcllistContext)_localctx).dcllist.listaVars);
				      
				}
				break;
			case T__4:
			case T__10:
			case T__11:
			case T__12:
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				 ((DcllistContext)_localctx).listaVars =  new ArrayList<>(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DclContext extends ParserRuleContext {
		public List<VariableDecl> listaVars;
		public TipoContext tipo;
		public DclpContext dclp;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DclpContext dclp() {
			return getRuleContext(DclpContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDcl(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((DclContext)_localctx).tipo = tipo();
			setState(129);
			((DclContext)_localctx).dclp = dclp();

			         ((DclContext)_localctx).listaVars =  ((DclContext)_localctx).dclp.listaVars;
			         for (VariableDecl v : _localctx.listaVars) {
			             v.tipo = ((DclContext)_localctx).tipo.tipoC;
			             if (((DclContext)_localctx).tipo.tipoC.equals("char") && ((DclContext)_localctx).tipo.long_ > 0)
			                 v.setDimension(((DclContext)_localctx).tipo.long_);
			         }
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DclpContext extends ParserRuleContext {
		public List<VariableDecl> listaVars;
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public VarlistContext varlist;
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public DclpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDclp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDclp(this);
		}
	}

	public final DclpContext dclp() throws RecognitionException {
		DclpContext _localctx = new DclpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dclp);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(COMMA);
				setState(133);
				match(T__2);
				setState(134);
				match(T__3);
				setState(135);
				((DclpContext)_localctx).IDENT = match(IDENT);
				setState(136);
				match(ASSIGN);
				setState(137);
				((DclpContext)_localctx).simpvalue = simpvalue();
				setState(138);
				ctelist();
				setState(139);
				match(SEMI);

				         trad.addDefine((((DclpContext)_localctx).IDENT!=null?((DclpContext)_localctx).IDENT.getText():null), ((DclpContext)_localctx).simpvalue.val);
				         ((DclpContext)_localctx).listaVars =  new ArrayList<>();
				      
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__3);
				setState(143);
				((DclpContext)_localctx).varlist = varlist();
				setState(144);
				match(SEMI);

				         ((DclpContext)_localctx).listaVars =  ((DclpContext)_localctx).varlist.lista;
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CabeceraContext extends ParserRuleContext {
		public CablistContext cablist() {
			return getRuleContext(CablistContext.class,0);
		}
		public CabeceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCabecera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCabecera(this);
		}
	}

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cabecera);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__4);
				setState(150);
				cablist();
				setState(151);
				match(T__1);
				setState(152);
				match(T__4);
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CablistContext extends ParserRuleContext {
		public Dec_elementoContext dec_elemento() {
			return getRuleContext(Dec_elementoContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public CablistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cablist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCablist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCablist(this);
		}
	}

	public final CablistContext cablist() throws RecognitionException {
		CablistContext _localctx = new CablistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cablist);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				dec_elemento();
				setState(158);
				decsubprog();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecsubprogContext extends ParserRuleContext {
		public Dec_elementoContext dec_elemento() {
			return getRuleContext(Dec_elementoContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecsubprogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decsubprog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDecsubprog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDecsubprog(this);
		}
	}

	public final DecsubprogContext decsubprog() throws RecognitionException {
		DecsubprogContext _localctx = new DecsubprogContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decsubprog);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				dec_elemento();
				setState(164);
				decsubprog();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_elementoContext extends ParserRuleContext {
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public Dec_elementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_elemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDec_elemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDec_elemento(this);
		}
	}

	public final Dec_elementoContext dec_elemento() throws RecognitionException {
		Dec_elementoContext _localctx = new Dec_elementoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dec_elemento);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				decproc();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				decfun();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public String tipoC;
		public int long_;
		public CharlengthContext charlength;
		public CharlengthContext charlength() {
			return getRuleContext(CharlengthContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__5);
				 ((TipoContext)_localctx).tipoC =  "int"; ((TipoContext)_localctx).long_ =  -1; 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__6);
				 ((TipoContext)_localctx).tipoC =  "float"; ((TipoContext)_localctx).long_ =  -1; 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(T__7);
				setState(178);
				((TipoContext)_localctx).charlength = charlength();

				         ((TipoContext)_localctx).tipoC =  "char";
				         ((TipoContext)_localctx).long_ =  ((TipoContext)_localctx).charlength.long_;
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharlengthContext extends ParserRuleContext {
		public int long_;
		public Token NUM_INT_CONST;
		public TerminalNode NUM_INT_CONST() { return getToken(gramaticaParser.NUM_INT_CONST, 0); }
		public CharlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCharlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCharlength(this);
		}
	}

	public final CharlengthContext charlength() throws RecognitionException {
		CharlengthContext _localctx = new CharlengthContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_charlength);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(T__8);
				setState(184);
				((CharlengthContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				setState(185);
				match(T__9);
				 ((CharlengthContext)_localctx).long_ =  Integer.parseInt((((CharlengthContext)_localctx).NUM_INT_CONST!=null?((CharlengthContext)_localctx).NUM_INT_CONST.getText():null)); 
				}
				break;
			case T__3:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				 ((CharlengthContext)_localctx).long_ =  -1; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public List<VariableDecl> lista;
		public Token IDENT;
		public InitContext init;
		public VarlistpContext varlistp;
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public VarlistpContext varlistp() {
			return getRuleContext(VarlistpContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarlist(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			((VarlistContext)_localctx).IDENT = match(IDENT);
			setState(191);
			((VarlistContext)_localctx).init = init();
			setState(192);
			((VarlistContext)_localctx).varlistp = varlistp();

			         ((VarlistContext)_localctx).lista =  new ArrayList<>();
			         VariableDecl v = new VariableDecl(null, (((VarlistContext)_localctx).IDENT!=null?((VarlistContext)_localctx).IDENT.getText():null));
			         if (((VarlistContext)_localctx).init.valor != null) v.setInit(((VarlistContext)_localctx).init.valor);
			         _localctx.lista.add(v);
			         _localctx.lista.addAll(((VarlistContext)_localctx).varlistp.lista);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistpContext extends ParserRuleContext {
		public List<VariableDecl> lista;
		public Token IDENT;
		public InitContext init;
		public VarlistpContext varlistp;
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public VarlistpContext varlistp() {
			return getRuleContext(VarlistpContext.class,0);
		}
		public VarlistpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlistp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarlistp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarlistp(this);
		}
	}

	public final VarlistpContext varlistp() throws RecognitionException {
		VarlistpContext _localctx = new VarlistpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varlistp);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(COMMA);
				setState(196);
				((VarlistpContext)_localctx).IDENT = match(IDENT);
				setState(197);
				((VarlistpContext)_localctx).init = init();
				setState(198);
				((VarlistpContext)_localctx).varlistp = varlistp();

				         ((VarlistpContext)_localctx).lista =  new ArrayList<>();
				         VariableDecl v = new VariableDecl(null, (((VarlistpContext)_localctx).IDENT!=null?((VarlistpContext)_localctx).IDENT.getText():null));
				         if (((VarlistpContext)_localctx).init.valor != null) v.setInit(((VarlistpContext)_localctx).init.valor);
				         _localctx.lista.add(v);
				         _localctx.lista.addAll(((VarlistpContext)_localctx).varlistp.lista);
				      
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				 ((VarlistpContext)_localctx).lista =  new ArrayList<>(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public String valor;
		public SimpvalueContext simpvalue;
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_init);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(ASSIGN);
				setState(205);
				((InitContext)_localctx).simpvalue = simpvalue();
				 ((InitContext)_localctx).valor =  ((InitContext)_localctx).simpvalue.val; 
				}
				break;
			case COMMA:
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				 ((InitContext)_localctx).valor =  null; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistContext extends ParserRuleContext {
		public String codigo;
		public SentContext sent;
		public SentlistpContext sentlistp;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistpContext sentlistp() {
			return getRuleContext(SentlistpContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentlist(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			((SentlistContext)_localctx).sent = sent();
			setState(212);
			((SentlistContext)_localctx).sentlistp = sentlistp();
			 ((SentlistContext)_localctx).codigo =  ((SentlistContext)_localctx).sent.codigo + ((SentlistContext)_localctx).sentlistp.codigo; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistpContext extends ParserRuleContext {
		public String codigo;
		public SentContext sent;
		public SentlistpContext sentlistp;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistpContext sentlistp() {
			return getRuleContext(SentlistpContext.class,0);
		}
		public SentlistpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlistp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentlistp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentlistp(this);
		}
	}

	public final SentlistpContext sentlistp() throws RecognitionException {
		SentlistpContext _localctx = new SentlistpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sentlistp);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				((SentlistpContext)_localctx).sent = sent();
				setState(216);
				((SentlistpContext)_localctx).sentlistp = sentlistp();
				 ((SentlistpContext)_localctx).codigo =  ((SentlistpContext)_localctx).sent.codigo + ((SentlistpContext)_localctx).sentlistp.codigo; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 ((SentlistpContext)_localctx).codigo =  ""; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public String codigo;
		public AsignacionContext asignacion;
		public Proc_callContext proc_call;
		public ExpcondContext expcond;
		public SentifContext sentif;
		public SentdoContext sentdo;
		public ExpContext exp;
		public CasosContext casos;
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public SentifContext sentif() {
			return getRuleContext(SentifContext.class,0);
		}
		public SentdoContext sentdo() {
			return getRuleContext(SentdoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSent(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sent);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				((SentContext)_localctx).asignacion = asignacion();
				 ((SentContext)_localctx).codigo =  ((SentContext)_localctx).asignacion.codigo + "\n"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				((SentContext)_localctx).proc_call = proc_call();
				setState(226);
				match(SEMI);
				 ((SentContext)_localctx).codigo =  ((SentContext)_localctx).proc_call.codigo + ";\n"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(T__10);
				setState(230);
				match(T__8);
				setState(231);
				((SentContext)_localctx).expcond = expcond();
				setState(232);
				match(T__9);
				setState(233);
				((SentContext)_localctx).sentif = sentif();
				 ((SentContext)_localctx).codigo =  "if(" + ((SentContext)_localctx).expcond.codigo + ") " + ((SentContext)_localctx).sentif.codigo + "\n"; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(T__11);
				setState(237);
				((SentContext)_localctx).sentdo = sentdo();
				 ((SentContext)_localctx).codigo =  ((SentContext)_localctx).sentdo.codigo + "\n"; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				match(T__12);
				setState(241);
				match(T__13);
				setState(242);
				match(T__8);
				setState(243);
				((SentContext)_localctx).exp = exp();
				setState(244);
				match(T__9);
				setState(245);
				((SentContext)_localctx).casos = casos();
				setState(246);
				match(T__1);
				setState(247);
				match(T__12);

				         ((SentContext)_localctx).codigo =  "switch(" + ((SentContext)_localctx).exp.codigo + ") {\n" +
				                   trad.indent(((SentContext)_localctx).casos.codigo) +
				                   "}\n";
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public String codigo;
		public Token IDENT;
		public ExpContext exp;
		public Proc_callContext proc_call;
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_asignacion);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				((AsignacionContext)_localctx).IDENT = match(IDENT);
				setState(253);
				match(ASSIGN);
				setState(254);
				((AsignacionContext)_localctx).exp = exp();
				setState(255);
				match(SEMI);

				         if (trad.getContexto().esAsignacionDeRetorno((((AsignacionContext)_localctx).IDENT!=null?((AsignacionContext)_localctx).IDENT.getText():null)))
				             ((AsignacionContext)_localctx).codigo =  "return " + ((AsignacionContext)_localctx).exp.codigo + ";";
				         else
				             ((AsignacionContext)_localctx).codigo =  (((AsignacionContext)_localctx).IDENT!=null?((AsignacionContext)_localctx).IDENT.getText():null) + " = " + ((AsignacionContext)_localctx).exp.codigo + ";";
				      
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				((AsignacionContext)_localctx).proc_call = proc_call();
				setState(259);
				match(SEMI);
				 ((AsignacionContext)_localctx).codigo =  ((AsignacionContext)_localctx).proc_call.codigo + ";"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentdoContext extends ParserRuleContext {
		public String codigo;
		public ExpcondContext expcond;
		public SentlistContext sentlist;
		public Token IDENT;
		public DovalContext d1;
		public DovalContext d2;
		public DovalContext d3;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(gramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gramaticaParser.COMMA, i);
		}
		public List<DovalContext> doval() {
			return getRuleContexts(DovalContext.class);
		}
		public DovalContext doval(int i) {
			return getRuleContext(DovalContext.class,i);
		}
		public SentdoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentdo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentdo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentdo(this);
		}
	}

	public final SentdoContext sentdo() throws RecognitionException {
		SentdoContext _localctx = new SentdoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sentdo);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(T__14);
				setState(265);
				match(T__8);
				setState(266);
				((SentdoContext)_localctx).expcond = expcond();
				setState(267);
				match(T__9);
				setState(268);
				((SentdoContext)_localctx).sentlist = sentlist();
				setState(269);
				match(T__15);

				         ((SentdoContext)_localctx).codigo =  "while(" + ((SentdoContext)_localctx).expcond.codigo + ") {\n" +
				                   trad.indent(((SentdoContext)_localctx).sentlist.codigo) +
				                   "}";
				      
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				((SentdoContext)_localctx).IDENT = match(IDENT);
				setState(273);
				match(ASSIGN);
				setState(274);
				((SentdoContext)_localctx).d1 = doval();
				setState(275);
				match(COMMA);
				setState(276);
				((SentdoContext)_localctx).d2 = doval();
				setState(277);
				match(COMMA);
				setState(278);
				((SentdoContext)_localctx).d3 = doval();
				setState(279);
				((SentdoContext)_localctx).sentlist = sentlist();
				setState(280);
				match(T__15);

				         String var = (((SentdoContext)_localctx).IDENT!=null?((SentdoContext)_localctx).IDENT.getText():null);
				         String ini = ((SentdoContext)_localctx).d1.val;
				         String fin = ((SentdoContext)_localctx).d2.val;
				         String inc = ((SentdoContext)_localctx).d3.val;

				         ((SentdoContext)_localctx).codigo =  "for(" + var + " = " + ini + "; " +
				                           var + " <= " + fin + "; " +
				                           var + " += " + inc + ") {\n" +
				                   trad.indent(((SentdoContext)_localctx).sentlist.codigo) +
				                   "}";
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentifContext extends ParserRuleContext {
		public String codigo;
		public SentContext sent;
		public SentlistContext sentlist;
		public SentthenContext sentthen;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SentthenContext sentthen() {
			return getRuleContext(SentthenContext.class,0);
		}
		public SentifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentif(this);
		}
	}

	public final SentifContext sentif() throws RecognitionException {
		SentifContext _localctx = new SentifContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sentif);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				((SentifContext)_localctx).sent = sent();
				 ((SentifContext)_localctx).codigo =  "{\n" + trad.indent(((SentifContext)_localctx).sent.codigo) + "}\n"; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(T__16);
				setState(289);
				((SentifContext)_localctx).sentlist = sentlist();
				setState(290);
				((SentifContext)_localctx).sentthen = sentthen();
				 ((SentifContext)_localctx).codigo =  "{\n" + trad.indent(((SentifContext)_localctx).sentlist.codigo) + "}" + ((SentifContext)_localctx).sentthen.codigo + "\n"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentthenContext extends ParserRuleContext {
		public String codigo;
		public SentlistContext sentlist;
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SentthenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentthen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentthen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentthen(this);
		}
	}

	public final SentthenContext sentthen() throws RecognitionException {
		SentthenContext _localctx = new SentthenContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sentthen);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(T__17);
				 ((SentthenContext)_localctx).codigo =  ""; 
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__18);
				setState(298);
				((SentthenContext)_localctx).sentlist = sentlist();
				setState(299);
				match(T__17);
				 ((SentthenContext)_localctx).codigo =  " else {\n" + trad.indent(((SentthenContext)_localctx).sentlist.codigo) + "}\n"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public String codigo;
		public FactorContext factor;
		public ExppContext expp;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExppContext expp() {
			return getRuleContext(ExppContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			((ExpContext)_localctx).factor = factor();
			setState(305);
			((ExpContext)_localctx).expp = expp();
			 ((ExpContext)_localctx).codigo =  ((ExpContext)_localctx).factor.codigo + ((ExpContext)_localctx).expp.codigo; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExppContext extends ParserRuleContext {
		public String codigo;
		public OpContext op;
		public FactorContext factor;
		public ExppContext expp;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExppContext expp() {
			return getRuleContext(ExppContext.class,0);
		}
		public ExppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpp(this);
		}
	}

	public final ExppContext expp() throws RecognitionException {
		ExppContext _localctx = new ExppContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expp);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				((ExppContext)_localctx).op = op();
				setState(309);
				((ExppContext)_localctx).factor = factor();
				setState(310);
				((ExppContext)_localctx).expp = expp();
				 ((ExppContext)_localctx).codigo =  (((ExppContext)_localctx).op!=null?_input.getText(((ExppContext)_localctx).op.start,((ExppContext)_localctx).op.stop):null) + ((ExppContext)_localctx).factor.codigo + ((ExppContext)_localctx).expp.codigo; 
				}
				break;
			case T__9:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case LT:
			case GT:
			case GE:
			case LE:
			case EQ:
			case NE:
			case COMMA:
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				 ((ExppContext)_localctx).codigo =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public OparitContext oparit() {
			return getRuleContext(OparitContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			oparit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OparitContext extends ParserRuleContext {
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOparit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOparit(this);
		}
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_oparit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public String codigo;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public Token IDENT;
		public FactorpContext factorp;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public FactorpContext factorp() {
			return getRuleContext(FactorpContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factor);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case CONST_BOOL:
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				((FactorContext)_localctx).simpvalue = simpvalue();
				 ((FactorContext)_localctx).codigo =  ((FactorContext)_localctx).simpvalue.val; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(T__8);
				setState(324);
				((FactorContext)_localctx).exp = exp();
				setState(325);
				match(T__9);
				 ((FactorContext)_localctx).codigo =  "(" + ((FactorContext)_localctx).exp.codigo + ")"; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				((FactorContext)_localctx).IDENT = match(IDENT);
				setState(329);
				((FactorContext)_localctx).factorp = factorp();
				 ((FactorContext)_localctx).codigo =  (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null) + ((FactorContext)_localctx).factorp.codigo; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorpContext extends ParserRuleContext {
		public String codigo;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public FactorpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactorp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactorp(this);
		}
	}

	public final FactorpContext factorp() throws RecognitionException {
		FactorpContext _localctx = new FactorpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factorp);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(T__8);
				setState(335);
				((FactorpContext)_localctx).exp = exp();
				setState(336);
				((FactorpContext)_localctx).explist = explist();
				setState(337);
				match(T__9);
				 ((FactorpContext)_localctx).codigo =  "(" + ((FactorpContext)_localctx).exp.codigo + ((FactorpContext)_localctx).explist.lista + ")"; 
				}
				break;
			case T__9:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case LT:
			case GT:
			case GE:
			case LE:
			case EQ:
			case NE:
			case COMMA:
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				 ((FactorpContext)_localctx).codigo =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistContext extends ParserRuleContext {
		public String lista;
		public ExpContext exp;
		public ExplistContext explist;
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExplist(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_explist);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(COMMA);
				setState(344);
				((ExplistContext)_localctx).exp = exp();
				setState(345);
				((ExplistContext)_localctx).explist = explist();
				 ((ExplistContext)_localctx).lista =  ", " + ((ExplistContext)_localctx).exp.codigo + ((ExplistContext)_localctx).explist.lista; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				 ((ExplistContext)_localctx).lista =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Proc_callContext extends ParserRuleContext {
		public String codigo;
		public Token IDENT;
		public SubparamlistContext subparamlist;
		public TerminalNode CALL() { return getToken(gramaticaParser.CALL, 0); }
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public SubparamlistContext subparamlist() {
			return getRuleContext(SubparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProc_call(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(CALL);
			setState(352);
			((Proc_callContext)_localctx).IDENT = match(IDENT);
			setState(353);
			((Proc_callContext)_localctx).subparamlist = subparamlist();

			         ((Proc_callContext)_localctx).codigo =  (((Proc_callContext)_localctx).IDENT!=null?((Proc_callContext)_localctx).IDENT.getText():null) + "(" + ((Proc_callContext)_localctx).subparamlist.lista + ")";
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubparamlistContext extends ParserRuleContext {
		public String lista;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSubparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSubparamlist(this);
		}
	}

	public final SubparamlistContext subparamlist() throws RecognitionException {
		SubparamlistContext _localctx = new SubparamlistContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_subparamlist);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(T__8);
				setState(357);
				((SubparamlistContext)_localctx).exp = exp();
				setState(358);
				((SubparamlistContext)_localctx).explist = explist();
				setState(359);
				match(T__9);
				 ((SubparamlistContext)_localctx).lista =  ((SubparamlistContext)_localctx).exp.codigo + ((SubparamlistContext)_localctx).explist.lista; 
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				 ((SubparamlistContext)_localctx).lista =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CtelistContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCtelist(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ctelist);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(COMMA);
				setState(366);
				match(IDENT);
				setState(367);
				match(ASSIGN);
				setState(368);
				simpvalue();
				setState(369);
				ctelist();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpvalueContext extends ParserRuleContext {
		public String val;
		public Token NUM_INT_CONST;
		public Token NUM_REAL_CONST;
		public Token STRING_CONST;
		public Token NUM_INT_CONST_B;
		public Token NUM_INT_CONST_O;
		public Token NUM_INT_CONST_H;
		public Token CONST_BOOL;
		public TerminalNode NUM_INT_CONST() { return getToken(gramaticaParser.NUM_INT_CONST, 0); }
		public TerminalNode NUM_REAL_CONST() { return getToken(gramaticaParser.NUM_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(gramaticaParser.STRING_CONST, 0); }
		public TerminalNode NUM_INT_CONST_B() { return getToken(gramaticaParser.NUM_INT_CONST_B, 0); }
		public TerminalNode NUM_INT_CONST_O() { return getToken(gramaticaParser.NUM_INT_CONST_O, 0); }
		public TerminalNode NUM_INT_CONST_H() { return getToken(gramaticaParser.NUM_INT_CONST_H, 0); }
		public TerminalNode CONST_BOOL() { return getToken(gramaticaParser.CONST_BOOL, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSimpvalue(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_simpvalue);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				((SimpvalueContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				 ((SimpvalueContext)_localctx).val =  (((SimpvalueContext)_localctx).NUM_INT_CONST!=null?((SimpvalueContext)_localctx).NUM_INT_CONST.getText():null); 
				}
				break;
			case NUM_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				((SimpvalueContext)_localctx).NUM_REAL_CONST = match(NUM_REAL_CONST);
				 ((SimpvalueContext)_localctx).val =  (((SimpvalueContext)_localctx).NUM_REAL_CONST!=null?((SimpvalueContext)_localctx).NUM_REAL_CONST.getText():null); 
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				 ((SimpvalueContext)_localctx).val =  toCLiteral((((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null)); 
				}
				break;
			case NUM_INT_CONST_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				((SimpvalueContext)_localctx).NUM_INT_CONST_B = match(NUM_INT_CONST_B);
				 ((SimpvalueContext)_localctx).val =  (((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null); 
				}
				break;
			case NUM_INT_CONST_O:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				((SimpvalueContext)_localctx).NUM_INT_CONST_O = match(NUM_INT_CONST_O);
				 ((SimpvalueContext)_localctx).val =  (((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null); 
				}
				break;
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(384);
				((SimpvalueContext)_localctx).NUM_INT_CONST_H = match(NUM_INT_CONST_H);
				 ((SimpvalueContext)_localctx).val =  (((SimpvalueContext)_localctx).NUM_INT_CONST_H!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_H.getText():null); 
				}
				break;
			case CONST_BOOL:
				enterOuterAlt(_localctx, 7);
				{
				setState(386);
				((SimpvalueContext)_localctx).CONST_BOOL = match(CONST_BOOL);
				 ((SimpvalueContext)_localctx).val =  (((SimpvalueContext)_localctx).CONST_BOOL!=null?((SimpvalueContext)_localctx).CONST_BOOL.getText():null); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpvaluepContext extends ParserRuleContext {
		public String val;
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public SimpvaluepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvaluep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSimpvaluep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSimpvaluep(this);
		}
	}

	public final SimpvaluepContext simpvaluep() throws RecognitionException {
		SimpvaluepContext _localctx = new SimpvaluepContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simpvaluep);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case CONST_BOOL:
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				((SimpvaluepContext)_localctx).simpvalue = simpvalue();
				 ((SimpvaluepContext)_localctx).val =  ((SimpvaluepContext)_localctx).simpvalue.val; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				 ((SimpvaluepContext)_localctx).val =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_paramlistContext extends ParserRuleContext {
		public List<Parametro> lista;
		public NomparamlistContext nomparamlist;
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFormal_paramlist(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_formal_paramlist);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(T__8);
				setState(397);
				((Formal_paramlistContext)_localctx).nomparamlist = nomparamlist();
				setState(398);
				match(T__9);
				 ((Formal_paramlistContext)_localctx).lista =  ((Formal_paramlistContext)_localctx).nomparamlist.lista; 
				}
				break;
			case T__1:
			case T__5:
			case T__6:
			case T__7:
			case T__10:
			case T__11:
			case T__12:
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				 ((Formal_paramlistContext)_localctx).lista =  new ArrayList<>(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NomparamlistContext extends ParserRuleContext {
		public List<Parametro> lista;
		public Token IDENT;
		public NomparamlistpContext nomparamlistp;
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public NomparamlistpContext nomparamlistp() {
			return getRuleContext(NomparamlistpContext.class,0);
		}
		public NomparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNomparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNomparamlist(this);
		}
	}

	public final NomparamlistContext nomparamlist() throws RecognitionException {
		NomparamlistContext _localctx = new NomparamlistContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_nomparamlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			((NomparamlistContext)_localctx).IDENT = match(IDENT);
			setState(405);
			((NomparamlistContext)_localctx).nomparamlistp = nomparamlistp();

			         ((NomparamlistContext)_localctx).lista =  new ArrayList<>();
			         _localctx.lista.add(new Parametro(null, (((NomparamlistContext)_localctx).IDENT!=null?((NomparamlistContext)_localctx).IDENT.getText():null), false));
			         _localctx.lista.addAll(((NomparamlistContext)_localctx).nomparamlistp.lista);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NomparamlistpContext extends ParserRuleContext {
		public List<Parametro> lista;
		public NomparamlistContext nomparamlist;
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public NomparamlistpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomparamlistp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNomparamlistp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNomparamlistp(this);
		}
	}

	public final NomparamlistpContext nomparamlistp() throws RecognitionException {
		NomparamlistpContext _localctx = new NomparamlistpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_nomparamlistp);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(COMMA);
				setState(409);
				((NomparamlistpContext)_localctx).nomparamlist = nomparamlist();
				 ((NomparamlistpContext)_localctx).lista =  ((NomparamlistpContext)_localctx).nomparamlist.lista; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				 ((NomparamlistpContext)_localctx).lista =  new ArrayList<>(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecprocContext extends ParserRuleContext {
		public Token IDENT;
		public Formal_paramlistContext formal_paramlist;
		public Dec_s_paramlistContext dec_s_paramlist;
		public List<TerminalNode> IDENT() { return getTokens(gramaticaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(gramaticaParser.IDENT, i);
		}
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public DecprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDecproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDecproc(this);
		}
	}

	public final DecprocContext decproc() throws RecognitionException {
		DecprocContext _localctx = new DecprocContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_decproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(T__23);
			setState(416);
			((DecprocContext)_localctx).IDENT = match(IDENT);
			setState(417);
			((DecprocContext)_localctx).formal_paramlist = formal_paramlist();
			setState(418);
			((DecprocContext)_localctx).dec_s_paramlist = dec_s_paramlist();
			setState(419);
			match(T__1);
			setState(420);
			match(T__23);
			setState(421);
			((DecprocContext)_localctx).IDENT = match(IDENT);

			         // Combinar nombres (formal_paramlist) con tipos (dec_s_paramlist)
			         List<Parametro> params = new ArrayList<>();

			         for (int i = 0; i < ((DecprocContext)_localctx).formal_paramlist.lista.size(); i++) {
			             Parametro p = ((DecprocContext)_localctx).formal_paramlist.lista.get(i);
			             Parametro q = ((DecprocContext)_localctx).dec_s_paramlist.lista.get(i);

			             p.tipo = q.tipo;
			             p.esCadena = q.esCadena;
			         }

			         trad.addDecFun("void", (((DecprocContext)_localctx).IDENT!=null?((DecprocContext)_localctx).IDENT.getText():null), ((DecprocContext)_localctx).formal_paramlist.lista);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_s_paramlistContext extends ParserRuleContext {
		public List<Parametro> lista;
		public TipoContext tipo;
		public Token IDENT;
		public Dec_s_paramlistContext dec_s_paramlist;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public TipoparamContext tipoparam() {
			return getRuleContext(TipoparamContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_s_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDec_s_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDec_s_paramlist(this);
		}
	}

	public final Dec_s_paramlistContext dec_s_paramlist() throws RecognitionException {
		Dec_s_paramlistContext _localctx = new Dec_s_paramlistContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dec_s_paramlist);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				((Dec_s_paramlistContext)_localctx).tipo = tipo();
				setState(425);
				match(COMMA);
				setState(426);
				match(T__24);
				setState(427);
				match(T__8);
				setState(428);
				tipoparam();
				setState(429);
				match(T__9);
				setState(430);
				((Dec_s_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(431);
				match(SEMI);
				setState(432);
				((Dec_s_paramlistContext)_localctx).dec_s_paramlist = dec_s_paramlist();

				         ((Dec_s_paramlistContext)_localctx).lista =  new ArrayList<>();
				         Parametro p;

				         if (((Dec_s_paramlistContext)_localctx).tipo.tipoC.equals("char") && ((Dec_s_paramlistContext)_localctx).tipo.long_ > 0)
				             p = new Parametro("char[" + ((Dec_s_paramlistContext)_localctx).tipo.long_ + "]", (((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null), true);
				         else
				             p = new Parametro(((Dec_s_paramlistContext)_localctx).tipo.tipoC, (((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null), true);

				         _localctx.lista.add(p);
				         _localctx.lista.addAll(((Dec_s_paramlistContext)_localctx).dec_s_paramlist.lista);
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 ((Dec_s_paramlistContext)_localctx).lista =  new ArrayList<>(); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoparamContext extends ParserRuleContext {
		public TipoparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTipoparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTipoparam(this);
		}
	}

	public final TipoparamContext tipoparam() throws RecognitionException {
		TipoparamContext _localctx = new TipoparamContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tipoparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecfunContext extends ParserRuleContext {
		public Token IDENT;
		public NomparamlistContext nomparamlist;
		public TipoContext tipo;
		public Dec_f_paramlistContext dec_f_paramlist;
		public List<TerminalNode> IDENT() { return getTokens(gramaticaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(gramaticaParser.IDENT, i);
		}
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public DecfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDecfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDecfun(this);
		}
	}

	public final DecfunContext decfun() throws RecognitionException {
		DecfunContext _localctx = new DecfunContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_decfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(T__28);
			setState(441);
			((DecfunContext)_localctx).IDENT = match(IDENT);
			setState(442);
			match(T__8);
			setState(443);
			((DecfunContext)_localctx).nomparamlist = nomparamlist();
			setState(444);
			match(T__9);
			setState(445);
			((DecfunContext)_localctx).tipo = tipo();
			setState(446);
			match(T__3);
			setState(447);
			((DecfunContext)_localctx).IDENT = match(IDENT);
			setState(448);
			match(SEMI);
			setState(449);
			((DecfunContext)_localctx).dec_f_paramlist = dec_f_paramlist();
			setState(450);
			match(T__1);
			setState(451);
			match(T__28);
			setState(452);
			((DecfunContext)_localctx).IDENT = match(IDENT);

			         List<Parametro> params = new ArrayList<>();

			         for (int i = 0; i < ((DecfunContext)_localctx).nomparamlist.lista.size(); i++) {
			             Parametro p = ((DecfunContext)_localctx).nomparamlist.lista.get(i);
			             Parametro q = ((DecfunContext)_localctx).dec_f_paramlist.lista.get(i);

			             p.tipo = q.tipo;
			             p.esCadena = q.esCadena;
			         }

			         trad.addDecFun(((DecfunContext)_localctx).tipo.tipoC, (((DecfunContext)_localctx).IDENT!=null?((DecfunContext)_localctx).IDENT.getText():null), ((DecfunContext)_localctx).nomparamlist.lista);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_f_paramlistContext extends ParserRuleContext {
		public List<Parametro> lista;
		public TipoContext tipo;
		public Token IDENT;
		public Dec_f_paramlistContext dec_f_paramlist;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_f_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDec_f_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDec_f_paramlist(this);
		}
	}

	public final Dec_f_paramlistContext dec_f_paramlist() throws RecognitionException {
		Dec_f_paramlistContext _localctx = new Dec_f_paramlistContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dec_f_paramlist);
		try {
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				((Dec_f_paramlistContext)_localctx).tipo = tipo();
				setState(456);
				match(COMMA);
				setState(457);
				match(T__24);
				setState(458);
				match(T__8);
				setState(459);
				match(T__25);
				setState(460);
				match(T__9);
				setState(461);
				((Dec_f_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(462);
				match(SEMI);
				setState(463);
				((Dec_f_paramlistContext)_localctx).dec_f_paramlist = dec_f_paramlist();

				         ((Dec_f_paramlistContext)_localctx).lista =  new ArrayList<>();
				         Parametro p;

				         if (((Dec_f_paramlistContext)_localctx).tipo.tipoC.equals("char") && ((Dec_f_paramlistContext)_localctx).tipo.long_ > 0)
				             p = new Parametro("char[" + ((Dec_f_paramlistContext)_localctx).tipo.long_ + "]", (((Dec_f_paramlistContext)_localctx).IDENT!=null?((Dec_f_paramlistContext)_localctx).IDENT.getText():null), true);
				         else
				             p = new Parametro(((Dec_f_paramlistContext)_localctx).tipo.tipoC, (((Dec_f_paramlistContext)_localctx).IDENT!=null?((Dec_f_paramlistContext)_localctx).IDENT.getText():null), true);

				         _localctx.lista.add(p);
				         _localctx.lista.addAll(((Dec_f_paramlistContext)_localctx).dec_f_paramlist.lista);
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 ((Dec_f_paramlistContext)_localctx).lista =  new ArrayList<>(); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubproglistContext extends ParserRuleContext {
		public CodprocContext codproc() {
			return getRuleContext(CodprocContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public CodfunContext codfun() {
			return getRuleContext(CodfunContext.class,0);
		}
		public SubproglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subproglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSubproglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSubproglist(this);
		}
	}

	public final SubproglistContext subproglist() throws RecognitionException {
		SubproglistContext _localctx = new SubproglistContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_subproglist);
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				codproc();
				setState(470);
				subproglist();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				codfun();
				setState(473);
				subproglist();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodprocContext extends ParserRuleContext {
		public String codigo;
		public Token IDENT;
		public Formal_paramlistContext formal_paramlist;
		public Dec_s_paramlistContext dec_s_paramlist;
		public DcllistContext dcllist;
		public SentlistContext sentlist;
		public List<TerminalNode> IDENT() { return getTokens(gramaticaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(gramaticaParser.IDENT, i);
		}
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public CodprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCodproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCodproc(this);
		}
	}

	public final CodprocContext codproc() throws RecognitionException {
		CodprocContext _localctx = new CodprocContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_codproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(T__23);
			setState(479);
			((CodprocContext)_localctx).IDENT = match(IDENT);
			setState(480);
			((CodprocContext)_localctx).formal_paramlist = formal_paramlist();
			setState(481);
			((CodprocContext)_localctx).dec_s_paramlist = dec_s_paramlist();
			setState(482);
			((CodprocContext)_localctx).dcllist = dcllist();
			setState(483);
			((CodprocContext)_localctx).sentlist = sentlist();
			setState(484);
			match(T__1);
			setState(485);
			match(T__23);
			setState(486);
			((CodprocContext)_localctx).IDENT = match(IDENT);

			         // Combinar nombres (formal_paramlist) con tipos (dec_s_paramlist)
			         for (int i = 0; i < ((CodprocContext)_localctx).formal_paramlist.lista.size(); i++) {
			             Parametro p = ((CodprocContext)_localctx).formal_paramlist.lista.get(i);
			             Parametro q = ((CodprocContext)_localctx).dec_s_paramlist.lista.get(i);

			             p.tipo = q.tipo;
			             p.esCadena = q.esCadena;
			         }

			         trad.getContexto().entrarProcedimiento((((CodprocContext)_localctx).IDENT!=null?((CodprocContext)_localctx).IDENT.getText():null));
			         trad.addProcedimiento((((CodprocContext)_localctx).IDENT!=null?((CodprocContext)_localctx).IDENT.getText():null), ((CodprocContext)_localctx).formal_paramlist.lista, ((CodprocContext)_localctx).dcllist.listaVars, ((CodprocContext)_localctx).sentlist.codigo);
			         trad.getContexto().salir();
			         ((CodprocContext)_localctx).codigo =  "";
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodfunContext extends ParserRuleContext {
		public String codigo;
		public Token IDENT;
		public NomparamlistContext nomparamlist;
		public TipoContext tipo;
		public Dec_f_paramlistContext dec_f_paramlist;
		public DcllistContext dcllist;
		public SentlistContext sentlist;
		public ExpContext exp;
		public List<TerminalNode> IDENT() { return getTokens(gramaticaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(gramaticaParser.IDENT, i);
		}
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(gramaticaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(gramaticaParser.SEMI, i);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CodfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCodfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCodfun(this);
		}
	}

	public final CodfunContext codfun() throws RecognitionException {
		CodfunContext _localctx = new CodfunContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_codfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(T__28);
			setState(490);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(491);
			match(T__8);
			setState(492);
			((CodfunContext)_localctx).nomparamlist = nomparamlist();
			setState(493);
			match(T__9);
			setState(494);
			((CodfunContext)_localctx).tipo = tipo();
			setState(495);
			match(T__3);
			setState(496);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(497);
			match(SEMI);
			setState(498);
			((CodfunContext)_localctx).dec_f_paramlist = dec_f_paramlist();
			setState(499);
			((CodfunContext)_localctx).dcllist = dcllist();
			setState(500);
			((CodfunContext)_localctx).sentlist = sentlist();
			setState(501);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(502);
			match(ASSIGN);
			setState(503);
			((CodfunContext)_localctx).exp = exp();
			setState(504);
			match(SEMI);
			setState(505);
			match(T__1);
			setState(506);
			match(T__28);
			setState(507);
			((CodfunContext)_localctx).IDENT = match(IDENT);

			         // Combinar nombres (nomparamlist) con tipos (dec_f_paramlist)
			         for (int i = 0; i < ((CodfunContext)_localctx).nomparamlist.lista.size(); i++) {
			             Parametro p = ((CodfunContext)_localctx).nomparamlist.lista.get(i);
			             Parametro q = ((CodfunContext)_localctx).dec_f_paramlist.lista.get(i);

			             p.tipo = q.tipo;
			             p.esCadena = q.esCadena;
			         }

			         trad.getContexto().entrarFuncion((((CodfunContext)_localctx).IDENT!=null?((CodfunContext)_localctx).IDENT.getText():null), ((CodfunContext)_localctx).tipo.tipoC);

			         String cuerpo = ((CodfunContext)_localctx).sentlist.codigo + "return " + ((CodfunContext)_localctx).exp.codigo + ";";

			         trad.addFuncion((((CodfunContext)_localctx).IDENT!=null?((CodfunContext)_localctx).IDENT.getText():null), ((CodfunContext)_localctx).tipo.tipoC, ((CodfunContext)_localctx).nomparamlist.lista, ((CodfunContext)_localctx).dcllist.listaVars, cuerpo);

			         trad.getContexto().salir();
			         ((CodfunContext)_localctx).codigo =  "";
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpcondContext extends ParserRuleContext {
		public String codigo;
		public FactorcondContext factorcond;
		public ExpcondpContext expcondp;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public ExpcondpContext expcondp() {
			return getRuleContext(ExpcondpContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpcond(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			((ExpcondContext)_localctx).factorcond = factorcond();
			setState(511);
			((ExpcondContext)_localctx).expcondp = expcondp();
			 ((ExpcondContext)_localctx).codigo =  ((ExpcondContext)_localctx).factorcond.codigo + ((ExpcondContext)_localctx).expcondp.codigo; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpcondpContext extends ParserRuleContext {
		public String codigo;
		public OplogContext oplog;
		public FactorcondContext factorcond;
		public ExpcondpContext expcondp;
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public ExpcondpContext expcondp() {
			return getRuleContext(ExpcondpContext.class,0);
		}
		public ExpcondpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcondp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpcondp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpcondp(this);
		}
	}

	public final ExpcondpContext expcondp() throws RecognitionException {
		ExpcondpContext _localctx = new ExpcondpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expcondp);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				((ExpcondpContext)_localctx).oplog = oplog();
				setState(515);
				((ExpcondpContext)_localctx).factorcond = factorcond();
				setState(516);
				((ExpcondpContext)_localctx).expcondp = expcondp();
				 ((ExpcondpContext)_localctx).codigo =  (((ExpcondpContext)_localctx).oplog!=null?_input.getText(((ExpcondpContext)_localctx).oplog.start,((ExpcondpContext)_localctx).oplog.stop):null) + ((ExpcondpContext)_localctx).factorcond.codigo + ((ExpcondpContext)_localctx).expcondp.codigo; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				 ((ExpcondpContext)_localctx).codigo =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OplogContext extends ParserRuleContext {
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOplog(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_oplog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorcondContext extends ParserRuleContext {
		public String codigo;
		public ExpContext e1;
		public OpcompContext opcomp;
		public ExpContext e2;
		public ExpcondContext expcond;
		public FactorcondContext factorcond;
		public Token CONST_BOOL;
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public TerminalNode CONST_BOOL() { return getToken(gramaticaParser.CONST_BOOL, 0); }
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactorcond(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_factorcond);
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				((FactorcondContext)_localctx).e1 = exp();
				setState(525);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(526);
				((FactorcondContext)_localctx).e2 = exp();
				 ((FactorcondContext)_localctx).codigo =  ((FactorcondContext)_localctx).e1.codigo + (((FactorcondContext)_localctx).opcomp!=null?_input.getText(((FactorcondContext)_localctx).opcomp.start,((FactorcondContext)_localctx).opcomp.stop):null) + ((FactorcondContext)_localctx).e2.codigo; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				match(T__8);
				setState(530);
				((FactorcondContext)_localctx).expcond = expcond();
				setState(531);
				match(T__9);
				 ((FactorcondContext)_localctx).codigo =  "(" + ((FactorcondContext)_localctx).expcond.codigo + ")"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				match(T__33);
				setState(535);
				((FactorcondContext)_localctx).factorcond = factorcond();
				 ((FactorcondContext)_localctx).codigo =  "!" + ((FactorcondContext)_localctx).factorcond.codigo; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(538);
				((FactorcondContext)_localctx).CONST_BOOL = match(CONST_BOOL);
				 ((FactorcondContext)_localctx).codigo =  (((FactorcondContext)_localctx).CONST_BOOL!=null?((FactorcondContext)_localctx).CONST_BOOL.getText():null); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpcompContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(gramaticaParser.LT, 0); }
		public TerminalNode GT() { return getToken(gramaticaParser.GT, 0); }
		public TerminalNode LE() { return getToken(gramaticaParser.LE, 0); }
		public TerminalNode GE() { return getToken(gramaticaParser.GE, 0); }
		public TerminalNode EQ() { return getToken(gramaticaParser.EQ, 0); }
		public TerminalNode NE() { return getToken(gramaticaParser.NE, 0); }
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOpcomp(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_opcomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17317308137472L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DovalContext extends ParserRuleContext {
		public String val;
		public Token NUM_INT_CONST;
		public Token IDENT;
		public TerminalNode NUM_INT_CONST() { return getToken(gramaticaParser.NUM_INT_CONST, 0); }
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public DovalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDoval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDoval(this);
		}
	}

	public final DovalContext doval() throws RecognitionException {
		DovalContext _localctx = new DovalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_doval);
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				((DovalContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				 ((DovalContext)_localctx).val =  (((DovalContext)_localctx).NUM_INT_CONST!=null?((DovalContext)_localctx).NUM_INT_CONST.getText():null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				((DovalContext)_localctx).IDENT = match(IDENT);
				 ((DovalContext)_localctx).val =  (((DovalContext)_localctx).IDENT!=null?((DovalContext)_localctx).IDENT.getText():null); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasosContext extends ParserRuleContext {
		public String codigo;
		public CasospContext casosp;
		public CasospContext casosp() {
			return getRuleContext(CasospContext.class,0);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCasos(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_casos);
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(T__13);
				setState(551);
				((CasosContext)_localctx).casosp = casosp();
				 ((CasosContext)_localctx).codigo =  ((CasosContext)_localctx).casosp.codigo; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				 ((CasosContext)_localctx).codigo =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasospContext extends ParserRuleContext {
		public String codigo;
		public EtiquetasContext etiquetas;
		public SentlistContext sentlist;
		public CasosContext casos;
		public EtiquetasContext etiquetas() {
			return getRuleContext(EtiquetasContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public CasospContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casosp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCasosp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCasosp(this);
		}
	}

	public final CasospContext casosp() throws RecognitionException {
		CasospContext _localctx = new CasospContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_casosp);
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(T__8);
				setState(558);
				((CasospContext)_localctx).etiquetas = etiquetas();
				setState(559);
				match(T__9);
				setState(560);
				((CasospContext)_localctx).sentlist = sentlist();
				setState(561);
				((CasospContext)_localctx).casos = casos();

				         List<String> lista = ((CasospContext)_localctx).etiquetas.lista;
				         StringBuilder sb = new StringBuilder();

				         for (String e : lista) {
				             sb.append("case ").append(e).append(":\n");
				         }

				         sb.append(trad.indent(((CasospContext)_localctx).sentlist.codigo));
				         sb.append("break;\n");
				         sb.append(((CasospContext)_localctx).casos.codigo);

				         ((CasospContext)_localctx).codigo =  sb.toString();
				      
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				match(T__34);
				setState(565);
				((CasospContext)_localctx).sentlist = sentlist();

				         ((CasospContext)_localctx).codigo =  "default:\n" +
				                   trad.indent(((CasospContext)_localctx).sentlist.codigo) +
				                   "break;\n";
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EtiquetasContext extends ParserRuleContext {
		public List<String> lista;
		public SimpvalueContext simpvalue;
		public EtiquetaspContext etiquetasp;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public EtiquetaspContext etiquetasp() {
			return getRuleContext(EtiquetaspContext.class,0);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public EtiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEtiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEtiquetas(this);
		}
	}

	public final EtiquetasContext etiquetas() throws RecognitionException {
		EtiquetasContext _localctx = new EtiquetasContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_etiquetas);
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case CONST_BOOL:
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();
				setState(571);
				((EtiquetasContext)_localctx).etiquetasp = etiquetasp();

				         ((EtiquetasContext)_localctx).lista =  new ArrayList<>();
				         _localctx.lista.addAll(expandCase(((EtiquetasContext)_localctx).simpvalue.val));
				         _localctx.lista.addAll(((EtiquetasContext)_localctx).etiquetasp.lista);
				      
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(COLON);
				setState(575);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();

				         ((EtiquetasContext)_localctx).lista =  expandCase(":" + ((EtiquetasContext)_localctx).simpvalue.val);
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EtiquetaspContext extends ParserRuleContext {
		public List<String> lista;
		public ListaetiquetasContext listaetiquetas;
		public SimpvaluepContext simpvaluep;
		public ListaetiquetasContext listaetiquetas() {
			return getRuleContext(ListaetiquetasContext.class,0);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public SimpvaluepContext simpvaluep() {
			return getRuleContext(SimpvaluepContext.class,0);
		}
		public EtiquetaspContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetasp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEtiquetasp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEtiquetasp(this);
		}
	}

	public final EtiquetaspContext etiquetasp() throws RecognitionException {
		EtiquetaspContext _localctx = new EtiquetaspContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_etiquetasp);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				((EtiquetaspContext)_localctx).listaetiquetas = listaetiquetas();
				 ((EtiquetaspContext)_localctx).lista =  ((EtiquetaspContext)_localctx).listaetiquetas.lista; 
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(COLON);
				setState(584);
				((EtiquetaspContext)_localctx).simpvaluep = simpvaluep();

				         ((EtiquetaspContext)_localctx).lista =  expandCase(((EtiquetaspContext)_localctx).simpvaluep.val);
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaetiquetasContext extends ParserRuleContext {
		public List<String> lista;
		public SimpvalueContext simpvalue;
		public ListaetiquetasContext listaetiquetas;
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ListaetiquetasContext listaetiquetas() {
			return getRuleContext(ListaetiquetasContext.class,0);
		}
		public ListaetiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaetiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaetiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaetiquetas(this);
		}
	}

	public final ListaetiquetasContext listaetiquetas() throws RecognitionException {
		ListaetiquetasContext _localctx = new ListaetiquetasContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_listaetiquetas);
		try {
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(COMMA);
				setState(590);
				((ListaetiquetasContext)_localctx).simpvalue = simpvalue();
				setState(591);
				((ListaetiquetasContext)_localctx).listaetiquetas = listaetiquetas();

				         ((ListaetiquetasContext)_localctx).lista =  new ArrayList<>();
				         _localctx.lista.addAll(expandCase(((ListaetiquetasContext)_localctx).simpvalue.val));
				         _localctx.lista.addAll(((ListaetiquetasContext)_localctx).listaetiquetas.lista);
				      
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				 ((ListaetiquetasContext)_localctx).lista =  new ArrayList<>(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u0256\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u007f\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0094\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009c\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a2\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a8\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00ac\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b6\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00bd\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00cb\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00d2\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00dd\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00fb\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0107\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u011c\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0126\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u012f\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u013b\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u014d\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0156\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u015e\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u016c\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0175\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0185\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u018b\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0193\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u019e"+
		"\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u01b5\b$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u01d4\b\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u01dd\b(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0209\b,\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u021d\b.\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00010\u00030\u0225\b0\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u022c\b1\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00032\u0239\b2\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00033\u0243\b3\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00034\u024c\b4\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00035\u0254\b5\u00015\u0000\u00006\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhj\u0000\u0004\u0001\u0000\u0014\u0017"+
		"\u0001\u0000\u001a\u001c\u0001\u0000\u001e!\u0001\u0000&+\u0251\u0000"+
		"l\u0001\u0000\u0000\u0000\u0002~\u0001\u0000\u0000\u0000\u0004\u0080\u0001"+
		"\u0000\u0000\u0000\u0006\u0093\u0001\u0000\u0000\u0000\b\u009b\u0001\u0000"+
		"\u0000\u0000\n\u00a1\u0001\u0000\u0000\u0000\f\u00a7\u0001\u0000\u0000"+
		"\u0000\u000e\u00ab\u0001\u0000\u0000\u0000\u0010\u00b5\u0001\u0000\u0000"+
		"\u0000\u0012\u00bc\u0001\u0000\u0000\u0000\u0014\u00be\u0001\u0000\u0000"+
		"\u0000\u0016\u00ca\u0001\u0000\u0000\u0000\u0018\u00d1\u0001\u0000\u0000"+
		"\u0000\u001a\u00d3\u0001\u0000\u0000\u0000\u001c\u00dc\u0001\u0000\u0000"+
		"\u0000\u001e\u00fa\u0001\u0000\u0000\u0000 \u0106\u0001\u0000\u0000\u0000"+
		"\"\u011b\u0001\u0000\u0000\u0000$\u0125\u0001\u0000\u0000\u0000&\u012e"+
		"\u0001\u0000\u0000\u0000(\u0130\u0001\u0000\u0000\u0000*\u013a\u0001\u0000"+
		"\u0000\u0000,\u013c\u0001\u0000\u0000\u0000.\u013e\u0001\u0000\u0000\u0000"+
		"0\u014c\u0001\u0000\u0000\u00002\u0155\u0001\u0000\u0000\u00004\u015d"+
		"\u0001\u0000\u0000\u00006\u015f\u0001\u0000\u0000\u00008\u016b\u0001\u0000"+
		"\u0000\u0000:\u0174\u0001\u0000\u0000\u0000<\u0184\u0001\u0000\u0000\u0000"+
		">\u018a\u0001\u0000\u0000\u0000@\u0192\u0001\u0000\u0000\u0000B\u0194"+
		"\u0001\u0000\u0000\u0000D\u019d\u0001\u0000\u0000\u0000F\u019f\u0001\u0000"+
		"\u0000\u0000H\u01b4\u0001\u0000\u0000\u0000J\u01b6\u0001\u0000\u0000\u0000"+
		"L\u01b8\u0001\u0000\u0000\u0000N\u01d3\u0001\u0000\u0000\u0000P\u01dc"+
		"\u0001\u0000\u0000\u0000R\u01de\u0001\u0000\u0000\u0000T\u01e9\u0001\u0000"+
		"\u0000\u0000V\u01fe\u0001\u0000\u0000\u0000X\u0208\u0001\u0000\u0000\u0000"+
		"Z\u020a\u0001\u0000\u0000\u0000\\\u021c\u0001\u0000\u0000\u0000^\u021e"+
		"\u0001\u0000\u0000\u0000`\u0224\u0001\u0000\u0000\u0000b\u022b\u0001\u0000"+
		"\u0000\u0000d\u0238\u0001\u0000\u0000\u0000f\u0242\u0001\u0000\u0000\u0000"+
		"h\u024b\u0001\u0000\u0000\u0000j\u0253\u0001\u0000\u0000\u0000lm\u0005"+
		"\u0001\u0000\u0000mn\u0005%\u0000\u0000no\u0005.\u0000\u0000op\u0003\u0002"+
		"\u0001\u0000pq\u0003\b\u0004\u0000qr\u0003\u001a\r\u0000rs\u0005\u0002"+
		"\u0000\u0000st\u0005\u0001\u0000\u0000tu\u0005%\u0000\u0000uv\u0003P("+
		"\u0000vw\u0005\u0000\u0000\u0001wx\u0006\u0000\uffff\uffff\u0000x\u0001"+
		"\u0001\u0000\u0000\u0000yz\u0003\u0004\u0002\u0000z{\u0003\u0002\u0001"+
		"\u0000{|\u0006\u0001\uffff\uffff\u0000|\u007f\u0001\u0000\u0000\u0000"+
		"}\u007f\u0006\u0001\uffff\uffff\u0000~y\u0001\u0000\u0000\u0000~}\u0001"+
		"\u0000\u0000\u0000\u007f\u0003\u0001\u0000\u0000\u0000\u0080\u0081\u0003"+
		"\u0010\b\u0000\u0081\u0082\u0003\u0006\u0003\u0000\u0082\u0083\u0006\u0002"+
		"\uffff\uffff\u0000\u0083\u0005\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"-\u0000\u0000\u0085\u0086\u0005\u0003\u0000\u0000\u0086\u0087\u0005\u0004"+
		"\u0000\u0000\u0087\u0088\u0005%\u0000\u0000\u0088\u0089\u0005/\u0000\u0000"+
		"\u0089\u008a\u0003<\u001e\u0000\u008a\u008b\u0003:\u001d\u0000\u008b\u008c"+
		"\u0005.\u0000\u0000\u008c\u008d\u0006\u0003\uffff\uffff\u0000\u008d\u0094"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0090"+
		"\u0003\u0014\n\u0000\u0090\u0091\u0005.\u0000\u0000\u0091\u0092\u0006"+
		"\u0003\uffff\uffff\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0084"+
		"\u0001\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0094\u0007"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0005\u0000\u0000\u0096\u0097"+
		"\u0003\n\u0005\u0000\u0097\u0098\u0005\u0002\u0000\u0000\u0098\u0099\u0005"+
		"\u0005\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u009c\u0001"+
		"\u0000\u0000\u0000\u009b\u0095\u0001\u0000\u0000\u0000\u009b\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\t\u0001\u0000\u0000\u0000\u009d\u009e\u0003\u000e"+
		"\u0007\u0000\u009e\u009f\u0003\f\u0006\u0000\u009f\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u000b\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0003\u000e\u0007\u0000\u00a4\u00a5\u0003\f\u0006\u0000"+
		"\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\r\u0001\u0000\u0000\u0000\u00a9\u00ac\u0003F#\u0000\u00aa\u00ac"+
		"\u0003L&\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u000f\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0006"+
		"\u0000\u0000\u00ae\u00b6\u0006\b\uffff\uffff\u0000\u00af\u00b0\u0005\u0007"+
		"\u0000\u0000\u00b0\u00b6\u0006\b\uffff\uffff\u0000\u00b1\u00b2\u0005\b"+
		"\u0000\u0000\u00b2\u00b3\u0003\u0012\t\u0000\u00b3\u00b4\u0006\b\uffff"+
		"\uffff\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b6\u0011\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\t\u0000"+
		"\u0000\u00b8\u00b9\u00054\u0000\u0000\u00b9\u00ba\u0005\n\u0000\u0000"+
		"\u00ba\u00bd\u0006\t\uffff\uffff\u0000\u00bb\u00bd\u0006\t\uffff\uffff"+
		"\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u0013\u0001\u0000\u0000\u0000\u00be\u00bf\u0005%\u0000\u0000"+
		"\u00bf\u00c0\u0003\u0018\f\u0000\u00c0\u00c1\u0003\u0016\u000b\u0000\u00c1"+
		"\u00c2\u0006\n\uffff\uffff\u0000\u00c2\u0015\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0005-\u0000\u0000\u00c4\u00c5\u0005%\u0000\u0000\u00c5\u00c6\u0003"+
		"\u0018\f\u0000\u00c6\u00c7\u0003\u0016\u000b\u0000\u00c7\u00c8\u0006\u000b"+
		"\uffff\uffff\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00cb\u0006"+
		"\u000b\uffff\uffff\u0000\u00ca\u00c3\u0001\u0000\u0000\u0000\u00ca\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u0017\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005/\u0000\u0000\u00cd\u00ce\u0003<\u001e\u0000\u00ce\u00cf\u0006\f"+
		"\uffff\uffff\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00d2\u0006"+
		"\f\uffff\uffff\u0000\u00d1\u00cc\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u0019\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003"+
		"\u001e\u000f\u0000\u00d4\u00d5\u0003\u001c\u000e\u0000\u00d5\u00d6\u0006"+
		"\r\uffff\uffff\u0000\u00d6\u001b\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003"+
		"\u001e\u000f\u0000\u00d8\u00d9\u0003\u001c\u000e\u0000\u00d9\u00da\u0006"+
		"\u000e\uffff\uffff\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00dd"+
		"\u0006\u000e\uffff\uffff\u0000\u00dc\u00d7\u0001\u0000\u0000\u0000\u00dc"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u001d\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0003 \u0010\u0000\u00df\u00e0\u0006\u000f\uffff\uffff\u0000\u00e0"+
		"\u00fb\u0001\u0000\u0000\u0000\u00e1\u00e2\u00036\u001b\u0000\u00e2\u00e3"+
		"\u0005.\u0000\u0000\u00e3\u00e4\u0006\u000f\uffff\uffff\u0000\u00e4\u00fb"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u000b\u0000\u0000\u00e6\u00e7"+
		"\u0005\t\u0000\u0000\u00e7\u00e8\u0003V+\u0000\u00e8\u00e9\u0005\n\u0000"+
		"\u0000\u00e9\u00ea\u0003$\u0012\u0000\u00ea\u00eb\u0006\u000f\uffff\uffff"+
		"\u0000\u00eb\u00fb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\f\u0000\u0000"+
		"\u00ed\u00ee\u0003\"\u0011\u0000\u00ee\u00ef\u0006\u000f\uffff\uffff\u0000"+
		"\u00ef\u00fb\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\r\u0000\u0000\u00f1"+
		"\u00f2\u0005\u000e\u0000\u0000\u00f2\u00f3\u0005\t\u0000\u0000\u00f3\u00f4"+
		"\u0003(\u0014\u0000\u00f4\u00f5\u0005\n\u0000\u0000\u00f5\u00f6\u0003"+
		"b1\u0000\u00f6\u00f7\u0005\u0002\u0000\u0000\u00f7\u00f8\u0005\r\u0000"+
		"\u0000\u00f8\u00f9\u0006\u000f\uffff\uffff\u0000\u00f9\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fa\u00de\u0001\u0000\u0000\u0000\u00fa\u00e1\u0001\u0000"+
		"\u0000\u0000\u00fa\u00e5\u0001\u0000\u0000\u0000\u00fa\u00ec\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f0\u0001\u0000\u0000\u0000\u00fb\u001f\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0005%\u0000\u0000\u00fd\u00fe\u0005/\u0000\u0000"+
		"\u00fe\u00ff\u0003(\u0014\u0000\u00ff\u0100\u0005.\u0000\u0000\u0100\u0101"+
		"\u0006\u0010\uffff\uffff\u0000\u0101\u0107\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u00036\u001b\u0000\u0103\u0104\u0005.\u0000\u0000\u0104\u0105\u0006"+
		"\u0010\uffff\uffff\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u00fc"+
		"\u0001\u0000\u0000\u0000\u0106\u0102\u0001\u0000\u0000\u0000\u0107!\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0005\u000f\u0000\u0000\u0109\u010a\u0005"+
		"\t\u0000\u0000\u010a\u010b\u0003V+\u0000\u010b\u010c\u0005\n\u0000\u0000"+
		"\u010c\u010d\u0003\u001a\r\u0000\u010d\u010e\u0005\u0010\u0000\u0000\u010e"+
		"\u010f\u0006\u0011\uffff\uffff\u0000\u010f\u011c\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0005%\u0000\u0000\u0111\u0112\u0005/\u0000\u0000\u0112\u0113"+
		"\u0003`0\u0000\u0113\u0114\u0005-\u0000\u0000\u0114\u0115\u0003`0\u0000"+
		"\u0115\u0116\u0005-\u0000\u0000\u0116\u0117\u0003`0\u0000\u0117\u0118"+
		"\u0003\u001a\r\u0000\u0118\u0119\u0005\u0010\u0000\u0000\u0119\u011a\u0006"+
		"\u0011\uffff\uffff\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0108"+
		"\u0001\u0000\u0000\u0000\u011b\u0110\u0001\u0000\u0000\u0000\u011c#\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0003\u001e\u000f\u0000\u011e\u011f\u0006"+
		"\u0012\uffff\uffff\u0000\u011f\u0126\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0005\u0011\u0000\u0000\u0121\u0122\u0003\u001a\r\u0000\u0122\u0123\u0003"+
		"&\u0013\u0000\u0123\u0124\u0006\u0012\uffff\uffff\u0000\u0124\u0126\u0001"+
		"\u0000\u0000\u0000\u0125\u011d\u0001\u0000\u0000\u0000\u0125\u0120\u0001"+
		"\u0000\u0000\u0000\u0126%\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0012"+
		"\u0000\u0000\u0128\u012f\u0006\u0013\uffff\uffff\u0000\u0129\u012a\u0005"+
		"\u0013\u0000\u0000\u012a\u012b\u0003\u001a\r\u0000\u012b\u012c\u0005\u0012"+
		"\u0000\u0000\u012c\u012d\u0006\u0013\uffff\uffff\u0000\u012d\u012f\u0001"+
		"\u0000\u0000\u0000\u012e\u0127\u0001\u0000\u0000\u0000\u012e\u0129\u0001"+
		"\u0000\u0000\u0000\u012f\'\u0001\u0000\u0000\u0000\u0130\u0131\u00030"+
		"\u0018\u0000\u0131\u0132\u0003*\u0015\u0000\u0132\u0133\u0006\u0014\uffff"+
		"\uffff\u0000\u0133)\u0001\u0000\u0000\u0000\u0134\u0135\u0003,\u0016\u0000"+
		"\u0135\u0136\u00030\u0018\u0000\u0136\u0137\u0003*\u0015\u0000\u0137\u0138"+
		"\u0006\u0015\uffff\uffff\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139"+
		"\u013b\u0006\u0015\uffff\uffff\u0000\u013a\u0134\u0001\u0000\u0000\u0000"+
		"\u013a\u0139\u0001\u0000\u0000\u0000\u013b+\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0003.\u0017\u0000\u013d-\u0001\u0000\u0000\u0000\u013e\u013f\u0007"+
		"\u0000\u0000\u0000\u013f/\u0001\u0000\u0000\u0000\u0140\u0141\u0003<\u001e"+
		"\u0000\u0141\u0142\u0006\u0018\uffff\uffff\u0000\u0142\u014d\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0005\t\u0000\u0000\u0144\u0145\u0003(\u0014"+
		"\u0000\u0145\u0146\u0005\n\u0000\u0000\u0146\u0147\u0006\u0018\uffff\uffff"+
		"\u0000\u0147\u014d\u0001\u0000\u0000\u0000\u0148\u0149\u0005%\u0000\u0000"+
		"\u0149\u014a\u00032\u0019\u0000\u014a\u014b\u0006\u0018\uffff\uffff\u0000"+
		"\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u0140\u0001\u0000\u0000\u0000"+
		"\u014c\u0143\u0001\u0000\u0000\u0000\u014c\u0148\u0001\u0000\u0000\u0000"+
		"\u014d1\u0001\u0000\u0000\u0000\u014e\u014f\u0005\t\u0000\u0000\u014f"+
		"\u0150\u0003(\u0014\u0000\u0150\u0151\u00034\u001a\u0000\u0151\u0152\u0005"+
		"\n\u0000\u0000\u0152\u0153\u0006\u0019\uffff\uffff\u0000\u0153\u0156\u0001"+
		"\u0000\u0000\u0000\u0154\u0156\u0006\u0019\uffff\uffff\u0000\u0155\u014e"+
		"\u0001\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u01563\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0005-\u0000\u0000\u0158\u0159\u0003(\u0014"+
		"\u0000\u0159\u015a\u00034\u001a\u0000\u015a\u015b\u0006\u001a\uffff\uffff"+
		"\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015e\u0006\u001a\uffff"+
		"\uffff\u0000\u015d\u0157\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000"+
		"\u0000\u0000\u015e5\u0001\u0000\u0000\u0000\u015f\u0160\u0005$\u0000\u0000"+
		"\u0160\u0161\u0005%\u0000\u0000\u0161\u0162\u00038\u001c\u0000\u0162\u0163"+
		"\u0006\u001b\uffff\uffff\u0000\u01637\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0005\t\u0000\u0000\u0165\u0166\u0003(\u0014\u0000\u0166\u0167\u0003"+
		"4\u001a\u0000\u0167\u0168\u0005\n\u0000\u0000\u0168\u0169\u0006\u001c"+
		"\uffff\uffff\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u016c\u0006"+
		"\u001c\uffff\uffff\u0000\u016b\u0164\u0001\u0000\u0000\u0000\u016b\u016a"+
		"\u0001\u0000\u0000\u0000\u016c9\u0001\u0000\u0000\u0000\u016d\u016e\u0005"+
		"-\u0000\u0000\u016e\u016f\u0005%\u0000\u0000\u016f\u0170\u0005/\u0000"+
		"\u0000\u0170\u0171\u0003<\u001e\u0000\u0171\u0172\u0003:\u001d\u0000\u0172"+
		"\u0175\u0001\u0000\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174"+
		"\u016d\u0001\u0000\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175"+
		";\u0001\u0000\u0000\u0000\u0176\u0177\u00054\u0000\u0000\u0177\u0185\u0006"+
		"\u001e\uffff\uffff\u0000\u0178\u0179\u00055\u0000\u0000\u0179\u0185\u0006"+
		"\u001e\uffff\uffff\u0000\u017a\u017b\u00056\u0000\u0000\u017b\u0185\u0006"+
		"\u001e\uffff\uffff\u0000\u017c\u017d\u00050\u0000\u0000\u017d\u0185\u0006"+
		"\u001e\uffff\uffff\u0000\u017e\u017f\u00051\u0000\u0000\u017f\u0185\u0006"+
		"\u001e\uffff\uffff\u0000\u0180\u0181\u00052\u0000\u0000\u0181\u0185\u0006"+
		"\u001e\uffff\uffff\u0000\u0182\u0183\u00053\u0000\u0000\u0183\u0185\u0006"+
		"\u001e\uffff\uffff\u0000\u0184\u0176\u0001\u0000\u0000\u0000\u0184\u0178"+
		"\u0001\u0000\u0000\u0000\u0184\u017a\u0001\u0000\u0000\u0000\u0184\u017c"+
		"\u0001\u0000\u0000\u0000\u0184\u017e\u0001\u0000\u0000\u0000\u0184\u0180"+
		"\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185=\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0003<\u001e\u0000\u0187\u0188\u0006\u001f"+
		"\uffff\uffff\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u018b\u0006"+
		"\u001f\uffff\uffff\u0000\u018a\u0186\u0001\u0000\u0000\u0000\u018a\u0189"+
		"\u0001\u0000\u0000\u0000\u018b?\u0001\u0000\u0000\u0000\u018c\u018d\u0005"+
		"\t\u0000\u0000\u018d\u018e\u0003B!\u0000\u018e\u018f\u0005\n\u0000\u0000"+
		"\u018f\u0190\u0006 \uffff\uffff\u0000\u0190\u0193\u0001\u0000\u0000\u0000"+
		"\u0191\u0193\u0006 \uffff\uffff\u0000\u0192\u018c\u0001\u0000\u0000\u0000"+
		"\u0192\u0191\u0001\u0000\u0000\u0000\u0193A\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0005%\u0000\u0000\u0195\u0196\u0003D\"\u0000\u0196\u0197\u0006"+
		"!\uffff\uffff\u0000\u0197C\u0001\u0000\u0000\u0000\u0198\u0199\u0005-"+
		"\u0000\u0000\u0199\u019a\u0003B!\u0000\u019a\u019b\u0006\"\uffff\uffff"+
		"\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019e\u0006\"\uffff\uffff"+
		"\u0000\u019d\u0198\u0001\u0000\u0000\u0000\u019d\u019c\u0001\u0000\u0000"+
		"\u0000\u019eE\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\u0018\u0000\u0000"+
		"\u01a0\u01a1\u0005%\u0000\u0000\u01a1\u01a2\u0003@ \u0000\u01a2\u01a3"+
		"\u0003H$\u0000\u01a3\u01a4\u0005\u0002\u0000\u0000\u01a4\u01a5\u0005\u0018"+
		"\u0000\u0000\u01a5\u01a6\u0005%\u0000\u0000\u01a6\u01a7\u0006#\uffff\uffff"+
		"\u0000\u01a7G\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003\u0010\b\u0000"+
		"\u01a9\u01aa\u0005-\u0000\u0000\u01aa\u01ab\u0005\u0019\u0000\u0000\u01ab"+
		"\u01ac\u0005\t\u0000\u0000\u01ac\u01ad\u0003J%\u0000\u01ad\u01ae\u0005"+
		"\n\u0000\u0000\u01ae\u01af\u0005%\u0000\u0000\u01af\u01b0\u0005.\u0000"+
		"\u0000\u01b0\u01b1\u0003H$\u0000\u01b1\u01b2\u0006$\uffff\uffff\u0000"+
		"\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3\u01b5\u0006$\uffff\uffff\u0000"+
		"\u01b4\u01a8\u0001\u0000\u0000\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b5I\u0001\u0000\u0000\u0000\u01b6\u01b7\u0007\u0001\u0000\u0000\u01b7"+
		"K\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\u001d\u0000\u0000\u01b9\u01ba"+
		"\u0005%\u0000\u0000\u01ba\u01bb\u0005\t\u0000\u0000\u01bb\u01bc\u0003"+
		"B!\u0000\u01bc\u01bd\u0005\n\u0000\u0000\u01bd\u01be\u0003\u0010\b\u0000"+
		"\u01be\u01bf\u0005\u0004\u0000\u0000\u01bf\u01c0\u0005%\u0000\u0000\u01c0"+
		"\u01c1\u0005.\u0000\u0000\u01c1\u01c2\u0003N\'\u0000\u01c2\u01c3\u0005"+
		"\u0002\u0000\u0000\u01c3\u01c4\u0005\u001d\u0000\u0000\u01c4\u01c5\u0005"+
		"%\u0000\u0000\u01c5\u01c6\u0006&\uffff\uffff\u0000\u01c6M\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c8\u0003\u0010\b\u0000\u01c8\u01c9\u0005-\u0000"+
		"\u0000\u01c9\u01ca\u0005\u0019\u0000\u0000\u01ca\u01cb\u0005\t\u0000\u0000"+
		"\u01cb\u01cc\u0005\u001a\u0000\u0000\u01cc\u01cd\u0005\n\u0000\u0000\u01cd"+
		"\u01ce\u0005%\u0000\u0000\u01ce\u01cf\u0005.\u0000\u0000\u01cf\u01d0\u0003"+
		"N\'\u0000\u01d0\u01d1\u0006\'\uffff\uffff\u0000\u01d1\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d4\u0006\'\uffff\uffff\u0000\u01d3\u01c7\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4O\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d6\u0003R)\u0000\u01d6\u01d7\u0003P(\u0000\u01d7\u01dd"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d9\u0003T*\u0000\u01d9\u01da\u0003P"+
		"(\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01dd\u0001\u0000\u0000"+
		"\u0000\u01dc\u01d5\u0001\u0000\u0000\u0000\u01dc\u01d8\u0001\u0000\u0000"+
		"\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01ddQ\u0001\u0000\u0000\u0000"+
		"\u01de\u01df\u0005\u0018\u0000\u0000\u01df\u01e0\u0005%\u0000\u0000\u01e0"+
		"\u01e1\u0003@ \u0000\u01e1\u01e2\u0003H$\u0000\u01e2\u01e3\u0003\u0002"+
		"\u0001\u0000\u01e3\u01e4\u0003\u001a\r\u0000\u01e4\u01e5\u0005\u0002\u0000"+
		"\u0000\u01e5\u01e6\u0005\u0018\u0000\u0000\u01e6\u01e7\u0005%\u0000\u0000"+
		"\u01e7\u01e8\u0006)\uffff\uffff\u0000\u01e8S\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ea\u0005\u001d\u0000\u0000\u01ea\u01eb\u0005%\u0000\u0000\u01eb\u01ec"+
		"\u0005\t\u0000\u0000\u01ec\u01ed\u0003B!\u0000\u01ed\u01ee\u0005\n\u0000"+
		"\u0000\u01ee\u01ef\u0003\u0010\b\u0000\u01ef\u01f0\u0005\u0004\u0000\u0000"+
		"\u01f0\u01f1\u0005%\u0000\u0000\u01f1\u01f2\u0005.\u0000\u0000\u01f2\u01f3"+
		"\u0003N\'\u0000\u01f3\u01f4\u0003\u0002\u0001\u0000\u01f4\u01f5\u0003"+
		"\u001a\r\u0000\u01f5\u01f6\u0005%\u0000\u0000\u01f6\u01f7\u0005/\u0000"+
		"\u0000\u01f7\u01f8\u0003(\u0014\u0000\u01f8\u01f9\u0005.\u0000\u0000\u01f9"+
		"\u01fa\u0005\u0002\u0000\u0000\u01fa\u01fb\u0005\u001d\u0000\u0000\u01fb"+
		"\u01fc\u0005%\u0000\u0000\u01fc\u01fd\u0006*\uffff\uffff\u0000\u01fdU"+
		"\u0001\u0000\u0000\u0000\u01fe\u01ff\u0003\\.\u0000\u01ff\u0200\u0003"+
		"X,\u0000\u0200\u0201\u0006+\uffff\uffff\u0000\u0201W\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0003Z-\u0000\u0203\u0204\u0003\\.\u0000\u0204\u0205"+
		"\u0003X,\u0000\u0205\u0206\u0006,\uffff\uffff\u0000\u0206\u0209\u0001"+
		"\u0000\u0000\u0000\u0207\u0209\u0006,\uffff\uffff\u0000\u0208\u0202\u0001"+
		"\u0000\u0000\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0209Y\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0007\u0002\u0000\u0000\u020b[\u0001\u0000\u0000"+
		"\u0000\u020c\u020d\u0003(\u0014\u0000\u020d\u020e\u0003^/\u0000\u020e"+
		"\u020f\u0003(\u0014\u0000\u020f\u0210\u0006.\uffff\uffff\u0000\u0210\u021d"+
		"\u0001\u0000\u0000\u0000\u0211\u0212\u0005\t\u0000\u0000\u0212\u0213\u0003"+
		"V+\u0000\u0213\u0214\u0005\n\u0000\u0000\u0214\u0215\u0006.\uffff\uffff"+
		"\u0000\u0215\u021d\u0001\u0000\u0000\u0000\u0216\u0217\u0005\"\u0000\u0000"+
		"\u0217\u0218\u0003\\.\u0000\u0218\u0219\u0006.\uffff\uffff\u0000\u0219"+
		"\u021d\u0001\u0000\u0000\u0000\u021a\u021b\u00053\u0000\u0000\u021b\u021d"+
		"\u0006.\uffff\uffff\u0000\u021c\u020c\u0001\u0000\u0000\u0000\u021c\u0211"+
		"\u0001\u0000\u0000\u0000\u021c\u0216\u0001\u0000\u0000\u0000\u021c\u021a"+
		"\u0001\u0000\u0000\u0000\u021d]\u0001\u0000\u0000\u0000\u021e\u021f\u0007"+
		"\u0003\u0000\u0000\u021f_\u0001\u0000\u0000\u0000\u0220\u0221\u00054\u0000"+
		"\u0000\u0221\u0225\u00060\uffff\uffff\u0000\u0222\u0223\u0005%\u0000\u0000"+
		"\u0223\u0225\u00060\uffff\uffff\u0000\u0224\u0220\u0001\u0000\u0000\u0000"+
		"\u0224\u0222\u0001\u0000\u0000\u0000\u0225a\u0001\u0000\u0000\u0000\u0226"+
		"\u0227\u0005\u000e\u0000\u0000\u0227\u0228\u0003d2\u0000\u0228\u0229\u0006"+
		"1\uffff\uffff\u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a\u022c\u0006"+
		"1\uffff\uffff\u0000\u022b\u0226\u0001\u0000\u0000\u0000\u022b\u022a\u0001"+
		"\u0000\u0000\u0000\u022cc\u0001\u0000\u0000\u0000\u022d\u022e\u0005\t"+
		"\u0000\u0000\u022e\u022f\u0003f3\u0000\u022f\u0230\u0005\n\u0000\u0000"+
		"\u0230\u0231\u0003\u001a\r\u0000\u0231\u0232\u0003b1\u0000\u0232\u0233"+
		"\u00062\uffff\uffff\u0000\u0233\u0239\u0001\u0000\u0000\u0000\u0234\u0235"+
		"\u0005#\u0000\u0000\u0235\u0236\u0003\u001a\r\u0000\u0236\u0237\u0006"+
		"2\uffff\uffff\u0000\u0237\u0239\u0001\u0000\u0000\u0000\u0238\u022d\u0001"+
		"\u0000\u0000\u0000\u0238\u0234\u0001\u0000\u0000\u0000\u0239e\u0001\u0000"+
		"\u0000\u0000\u023a\u023b\u0003<\u001e\u0000\u023b\u023c\u0003h4\u0000"+
		"\u023c\u023d\u00063\uffff\uffff\u0000\u023d\u0243\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\u0005,\u0000\u0000\u023f\u0240\u0003<\u001e\u0000\u0240\u0241"+
		"\u00063\uffff\uffff\u0000\u0241\u0243\u0001\u0000\u0000\u0000\u0242\u023a"+
		"\u0001\u0000\u0000\u0000\u0242\u023e\u0001\u0000\u0000\u0000\u0243g\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0003j5\u0000\u0245\u0246\u00064\uffff"+
		"\uffff\u0000\u0246\u024c\u0001\u0000\u0000\u0000\u0247\u0248\u0005,\u0000"+
		"\u0000\u0248\u0249\u0003>\u001f\u0000\u0249\u024a\u00064\uffff\uffff\u0000"+
		"\u024a\u024c\u0001\u0000\u0000\u0000\u024b\u0244\u0001\u0000\u0000\u0000"+
		"\u024b\u0247\u0001\u0000\u0000\u0000\u024ci\u0001\u0000\u0000\u0000\u024d"+
		"\u024e\u0005-\u0000\u0000\u024e\u024f\u0003<\u001e\u0000\u024f\u0250\u0003"+
		"j5\u0000\u0250\u0251\u00065\uffff\uffff\u0000\u0251\u0254\u0001\u0000"+
		"\u0000\u0000\u0252\u0254\u00065\uffff\uffff\u0000\u0253\u024d\u0001\u0000"+
		"\u0000\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0254k\u0001\u0000\u0000"+
		"\u0000%~\u0093\u009b\u00a1\u00a7\u00ab\u00b5\u00bc\u00ca\u00d1\u00dc\u00fa"+
		"\u0106\u011b\u0125\u012e\u013a\u014c\u0155\u015d\u016b\u0174\u0184\u018a"+
		"\u0192\u019d\u01b4\u01d3\u01dc\u0208\u021c\u0224\u022b\u0238\u0242\u024b"+
		"\u0253";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}