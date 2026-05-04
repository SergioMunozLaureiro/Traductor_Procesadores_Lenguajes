// Generated from //10.97.0.21/Home_VDI$/s.munozl.2023/Documents/miPrograma/src/gramatica.g4 by ANTLR 4.13.2
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
		RULE_cablist = 5, RULE_decsubprog = 6, RULE_dec_elemento = 7, RULE_sentlist = 8, 
		RULE_sentlistp = 9, RULE_ctelist = 10, RULE_simpvalue = 11, RULE_tipo = 12, 
		RULE_charlength = 13, RULE_varlist = 14, RULE_varlistp = 15, RULE_init = 16, 
		RULE_decproc = 17, RULE_formal_paramlist = 18, RULE_nomparamlist = 19, 
		RULE_nomparamlistp = 20, RULE_dec_s_paramlist = 21, RULE_tipoparam = 22, 
		RULE_decfun = 23, RULE_dec_f_paramlist = 24, RULE_sent = 25, RULE_asignacion = 26, 
		RULE_sentdo = 27, RULE_sentif = 28, RULE_sentthen = 29, RULE_exp = 30, 
		RULE_expp = 31, RULE_op = 32, RULE_oparit = 33, RULE_factor = 34, RULE_factorp = 35, 
		RULE_explist = 36, RULE_proc_call = 37, RULE_subparamlist = 38, RULE_subproglist = 39, 
		RULE_codproc = 40, RULE_codfun = 41, RULE_expcond = 42, RULE_expcondp = 43, 
		RULE_oplog = 44, RULE_factorcond = 45, RULE_opcomp = 46, RULE_doval = 47, 
		RULE_casos = 48, RULE_casosp = 49, RULE_etiquetas = 50, RULE_etiquetasp = 51, 
		RULE_simpvaluep = 52, RULE_listaetiquetas = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "dcllist", "dcl", "dclp", "cabecera", "cablist", "decsubprog", 
			"dec_elemento", "sentlist", "sentlistp", "ctelist", "simpvalue", "tipo", 
			"charlength", "varlist", "varlistp", "init", "decproc", "formal_paramlist", 
			"nomparamlist", "nomparamlistp", "dec_s_paramlist", "tipoparam", "decfun", 
			"dec_f_paramlist", "sent", "asignacion", "sentdo", "sentif", "sentthen", 
			"exp", "expp", "op", "oparit", "factor", "factorp", "explist", "proc_call", 
			"subparamlist", "subproglist", "codproc", "codfun", "expcond", "expcondp", 
			"oplog", "factorcond", "opcomp", "doval", "casos", "casosp", "etiquetas", 
			"etiquetasp", "simpvaluep", "listaetiquetas"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'END'", "'PARAMETER'", "'::'", "'INTERFACE'", "'INTEGER'", 
			"'REAL'", "'CHARACTER'", "'('", "')'", "'SUBROUTINE'", "'INTENT'", "'IN'", 
			"'OUT'", "'INOUT'", "'FUNCTION'", "'IF'", "'DO'", "'SELECT'", "'CASE'", 
			"'WHILE'", "'ENDDO'", "'THEN'", "'ENDIF'", "'ELSE'", "'+'", "'-'", "'*'", 
			"'/'", "'.OR.'", "'.AND.'", "'.EQV.'", "'.NEQV.'", "'.NOT.'", "'DEFAULT'", 
			"'CALL'", null, "'<'", "'>'", "'>='", "'<='", "'=='", "'/='", "':'", 
			"','", "';'", "'='"
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

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrgContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
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
			dcllist();
			setState(112);
			cabecera();
			setState(113);
			sentlist();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				dcl();
				setState(121);
				dcllist();
				}
				break;
			case T__4:
			case T__16:
			case T__17:
			case T__18:
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
	public static class DclContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			tipo();
			setState(127);
			dclp();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDclp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclpContext dclp() throws RecognitionException {
		DclpContext _localctx = new DclpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dclp);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(COMMA);
				setState(130);
				match(T__2);
				setState(131);
				match(T__3);
				setState(132);
				match(IDENT);
				setState(133);
				match(ASSIGN);
				setState(134);
				simpvalue();
				setState(135);
				ctelist();
				setState(136);
				match(SEMI);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__3);
				setState(139);
				varlist();
				setState(140);
				match(SEMI);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCabecera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cabecera);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(T__4);
				setState(145);
				cablist();
				setState(146);
				match(T__1);
				setState(147);
				match(T__4);
				}
				break;
			case T__16:
			case T__17:
			case T__18:
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCablist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CablistContext cablist() throws RecognitionException {
		CablistContext _localctx = new CablistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cablist);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				dec_elemento();
				setState(153);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDecsubprog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecsubprogContext decsubprog() throws RecognitionException {
		DecsubprogContext _localctx = new DecsubprogContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decsubprog);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				dec_elemento();
				setState(159);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDec_elemento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_elementoContext dec_elemento() throws RecognitionException {
		Dec_elementoContext _localctx = new Dec_elementoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dec_elemento);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				decproc();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
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
	public static class SentlistContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			sent();
			setState(169);
			sentlistp();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentlistp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistpContext sentlistp() throws RecognitionException {
		SentlistpContext _localctx = new SentlistpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentlistp);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				sent();
				setState(172);
				sentlistp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ctelist);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(COMMA);
				setState(178);
				match(IDENT);
				setState(179);
				match(ASSIGN);
				setState(180);
				simpvalue();
				setState(181);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 35747322042253312L) != 0)) ) {
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
	public static class TipoContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(T__7);
				setState(191);
				charlength();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCharlength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharlengthContext charlength() throws RecognitionException {
		CharlengthContext _localctx = new CharlengthContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_charlength);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(T__8);
				setState(195);
				match(NUM_INT_CONST);
				setState(196);
				match(T__9);
				}
				break;
			case T__3:
			case COMMA:
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
	public static class VarlistContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(IDENT);
			setState(201);
			init();
			setState(202);
			varlistp();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarlistp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistpContext varlistp() throws RecognitionException {
		VarlistpContext _localctx = new VarlistpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varlistp);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(COMMA);
				setState(205);
				match(IDENT);
				setState(206);
				init();
				setState(207);
				varlistp();
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
	public static class InitContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_init);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(ASSIGN);
				setState(213);
				simpvalue();
				}
				break;
			case COMMA:
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
	public static class DecprocContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDecproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecprocContext decproc() throws RecognitionException {
		DecprocContext _localctx = new DecprocContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_decproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__10);
			setState(218);
			match(IDENT);
			setState(219);
			formal_paramlist();
			setState(220);
			dec_s_paramlist();
			setState(221);
			match(T__1);
			setState(222);
			match(T__10);
			setState(223);
			match(IDENT);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFormal_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formal_paramlist);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(T__8);
				setState(226);
				nomparamlist();
				setState(227);
				match(T__9);
				}
				break;
			case T__1:
			case T__5:
			case T__6:
			case T__7:
			case T__16:
			case T__17:
			case T__18:
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
	public static class NomparamlistContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNomparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomparamlistContext nomparamlist() throws RecognitionException {
		NomparamlistContext _localctx = new NomparamlistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nomparamlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(IDENT);
			setState(233);
			nomparamlistp();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNomparamlistp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomparamlistpContext nomparamlistp() throws RecognitionException {
		NomparamlistpContext _localctx = new NomparamlistpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nomparamlistp);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(COMMA);
				setState(236);
				nomparamlist();
				}
				break;
			case T__9:
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
	public static class Dec_s_paramlistContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDec_s_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_s_paramlistContext dec_s_paramlist() throws RecognitionException {
		Dec_s_paramlistContext _localctx = new Dec_s_paramlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dec_s_paramlist);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				tipo();
				setState(241);
				match(COMMA);
				setState(242);
				match(T__11);
				setState(243);
				match(T__8);
				setState(244);
				tipoparam();
				setState(245);
				match(T__9);
				setState(246);
				match(IDENT);
				setState(247);
				match(SEMI);
				setState(248);
				dec_s_paramlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTipoparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoparamContext tipoparam() throws RecognitionException {
		TipoparamContext _localctx = new TipoparamContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tipoparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDecfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecfunContext decfun() throws RecognitionException {
		DecfunContext _localctx = new DecfunContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_decfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__15);
			setState(256);
			match(IDENT);
			setState(257);
			match(T__8);
			setState(258);
			nomparamlist();
			setState(259);
			match(T__9);
			setState(260);
			tipo();
			setState(261);
			match(T__3);
			setState(262);
			match(IDENT);
			setState(263);
			match(SEMI);
			setState(264);
			dec_f_paramlist();
			setState(265);
			match(T__1);
			setState(266);
			match(T__15);
			setState(267);
			match(IDENT);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDec_f_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_f_paramlistContext dec_f_paramlist() throws RecognitionException {
		Dec_f_paramlistContext _localctx = new Dec_f_paramlistContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dec_f_paramlist);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				tipo();
				setState(270);
				match(COMMA);
				setState(271);
				match(T__11);
				setState(272);
				match(T__8);
				setState(273);
				match(T__12);
				setState(274);
				match(T__9);
				setState(275);
				match(IDENT);
				setState(276);
				match(SEMI);
				setState(277);
				dec_f_paramlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sent);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				asignacion();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(T__16);
				setState(284);
				match(T__8);
				setState(285);
				expcond();
				setState(286);
				match(T__9);
				setState(287);
				sentif();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(T__17);
				setState(290);
				sentdo();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				match(T__18);
				setState(292);
				match(T__19);
				setState(293);
				match(T__8);
				setState(294);
				exp();
				setState(295);
				match(T__9);
				setState(296);
				casos();
				setState(297);
				match(T__1);
				setState(298);
				match(T__18);
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
	public static class AsignacionContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_asignacion);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(IDENT);
				setState(303);
				match(ASSIGN);
				setState(304);
				exp();
				setState(305);
				match(SEMI);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				proc_call();
				setState(308);
				match(SEMI);
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
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public List<DovalContext> doval() {
			return getRuleContexts(DovalContext.class);
		}
		public DovalContext doval(int i) {
			return getRuleContext(DovalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gramaticaParser.COMMA, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentdo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentdoContext sentdo() throws RecognitionException {
		SentdoContext _localctx = new SentdoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sentdo);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(T__20);
				setState(313);
				match(T__8);
				setState(314);
				expcond();
				setState(315);
				match(T__9);
				setState(316);
				sentlist();
				setState(317);
				match(T__21);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(IDENT);
				setState(320);
				match(ASSIGN);
				setState(321);
				doval();
				setState(322);
				match(COMMA);
				setState(323);
				doval();
				setState(324);
				match(COMMA);
				setState(325);
				doval();
				setState(326);
				sentlist();
				setState(327);
				match(T__21);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentifContext sentif() throws RecognitionException {
		SentifContext _localctx = new SentifContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sentif);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				sent();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(T__22);
				setState(333);
				sentlist();
				setState(334);
				sentthen();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentthen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentthenContext sentthen() throws RecognitionException {
		SentthenContext _localctx = new SentthenContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sentthen);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(T__24);
				setState(340);
				sentlist();
				setState(341);
				match(T__23);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			factor();
			setState(346);
			expp();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExppContext expp() throws RecognitionException {
		ExppContext _localctx = new ExppContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expp);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				op();
				setState(349);
				factor();
				setState(350);
				expp();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOparit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_oparit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_factor);
		try {
			setState(366);
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
				setState(359);
				simpvalue();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(T__8);
				setState(361);
				exp();
				setState(362);
				match(T__9);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(IDENT);
				setState(365);
				factorp();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFactorp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorpContext factorp() throws RecognitionException {
		FactorpContext _localctx = new FactorpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_factorp);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(T__8);
				setState(369);
				exp();
				setState(370);
				explist();
				setState(371);
				match(T__9);
				}
				break;
			case T__9:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_explist);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(COMMA);
				setState(377);
				exp();
				setState(378);
				explist();
				}
				break;
			case T__9:
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
	public static class Proc_callContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(CALL);
			setState(384);
			match(IDENT);
			setState(385);
			subparamlist();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSubparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubparamlistContext subparamlist() throws RecognitionException {
		SubparamlistContext _localctx = new SubparamlistContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_subparamlist);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(T__8);
				setState(388);
				exp();
				setState(389);
				explist();
				setState(390);
				match(T__9);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSubproglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubproglistContext subproglist() throws RecognitionException {
		SubproglistContext _localctx = new SubproglistContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_subproglist);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				codproc();
				setState(396);
				subproglist();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				codfun();
				setState(399);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCodproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodprocContext codproc() throws RecognitionException {
		CodprocContext _localctx = new CodprocContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_codproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__10);
			setState(405);
			match(IDENT);
			setState(406);
			formal_paramlist();
			setState(407);
			dec_s_paramlist();
			setState(408);
			dcllist();
			setState(409);
			sentlist();
			setState(410);
			match(T__1);
			setState(411);
			match(T__10);
			setState(412);
			match(IDENT);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCodfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodfunContext codfun() throws RecognitionException {
		CodfunContext _localctx = new CodfunContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_codfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__15);
			setState(415);
			match(IDENT);
			setState(416);
			match(T__8);
			setState(417);
			nomparamlist();
			setState(418);
			match(T__9);
			setState(419);
			tipo();
			setState(420);
			match(T__3);
			setState(421);
			match(IDENT);
			setState(422);
			match(SEMI);
			setState(423);
			dec_f_paramlist();
			setState(424);
			dcllist();
			setState(425);
			sentlist();
			setState(426);
			match(IDENT);
			setState(427);
			match(ASSIGN);
			setState(428);
			exp();
			setState(429);
			match(SEMI);
			setState(430);
			match(T__1);
			setState(431);
			match(T__15);
			setState(432);
			match(IDENT);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			factorcond();
			setState(435);
			expcondp();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpcondp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondpContext expcondp() throws RecognitionException {
		ExpcondpContext _localctx = new ExpcondpContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expcondp);
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				oplog();
				setState(438);
				factorcond();
				setState(439);
				expcondp();
				}
				break;
			case T__9:
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_oplog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
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
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFactorcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_factorcond);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				exp();
				setState(447);
				opcomp();
				setState(448);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(T__8);
				setState(451);
				expcond();
				setState(452);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				match(T__33);
				setState(455);
				factorcond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				match(CONST_BOOL);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_opcomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDoval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DovalContext doval() throws RecognitionException {
		DovalContext _localctx = new DovalContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_doval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !(_la==IDENT || _la==NUM_INT_CONST) ) {
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
	public static class CasosContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_casos);
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(T__19);
				setState(464);
				casosp();
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
	public static class CasospContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCasosp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasospContext casosp() throws RecognitionException {
		CasospContext _localctx = new CasospContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_casosp);
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(T__8);
				setState(469);
				etiquetas();
				setState(470);
				match(T__9);
				setState(471);
				sentlist();
				setState(472);
				casos();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(T__34);
				setState(475);
				sentlist();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitEtiquetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtiquetasContext etiquetas() throws RecognitionException {
		EtiquetasContext _localctx = new EtiquetasContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_etiquetas);
		try {
			setState(483);
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
				setState(478);
				simpvalue();
				setState(479);
				etiquetasp();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(COLON);
				setState(482);
				simpvalue();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitEtiquetasp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtiquetaspContext etiquetasp() throws RecognitionException {
		EtiquetaspContext _localctx = new EtiquetaspContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_etiquetasp);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				listaetiquetas();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(COLON);
				setState(487);
				simpvaluep();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSimpvaluep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvaluepContext simpvaluep() throws RecognitionException {
		SimpvaluepContext _localctx = new SimpvaluepContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_simpvaluep);
		try {
			setState(492);
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
				setState(490);
				simpvalue();
				}
				break;
			case T__9:
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
	public static class ListaetiquetasContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaetiquetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaetiquetasContext listaetiquetas() throws RecognitionException {
		ListaetiquetasContext _localctx = new ListaetiquetasContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_listaetiquetas);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(COMMA);
				setState(495);
				simpvalue();
				setState(496);
				listaetiquetas();
				}
				break;
			case T__9:
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

	public static final String _serializedATN =
		"\u0004\u00018\u01f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001}\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u008f\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0097\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009d\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a3\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00a7\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b0\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b9\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c1\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00c7\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00d3\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00d8\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e7\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00ef\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00fc\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0119\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u012d\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0137\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u014a\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0151\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0158\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0162\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u016f\b\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u0177\b#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u017e\b$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u018a\b&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0003\'\u0193\b\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u01bb\b+\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u01ca\b-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00010\u00030\u01d3"+
		"\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u01dd"+
		"\b1\u00012\u00012\u00012\u00012\u00012\u00032\u01e4\b2\u00013\u00013\u0001"+
		"3\u00033\u01e9\b3\u00014\u00014\u00034\u01ed\b4\u00015\u00015\u00015\u0001"+
		"5\u00015\u00035\u01f4\b5\u00015\u0000\u00006\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhj\u0000\u0006\u0001\u000006\u0001\u0000\r"+
		"\u000f\u0001\u0000\u001a\u001d\u0001\u0000\u001e!\u0001\u0000&+\u0002"+
		"\u0000%%44\u01e9\u0000l\u0001\u0000\u0000\u0000\u0002|\u0001\u0000\u0000"+
		"\u0000\u0004~\u0001\u0000\u0000\u0000\u0006\u008e\u0001\u0000\u0000\u0000"+
		"\b\u0096\u0001\u0000\u0000\u0000\n\u009c\u0001\u0000\u0000\u0000\f\u00a2"+
		"\u0001\u0000\u0000\u0000\u000e\u00a6\u0001\u0000\u0000\u0000\u0010\u00a8"+
		"\u0001\u0000\u0000\u0000\u0012\u00af\u0001\u0000\u0000\u0000\u0014\u00b8"+
		"\u0001\u0000\u0000\u0000\u0016\u00ba\u0001\u0000\u0000\u0000\u0018\u00c0"+
		"\u0001\u0000\u0000\u0000\u001a\u00c6\u0001\u0000\u0000\u0000\u001c\u00c8"+
		"\u0001\u0000\u0000\u0000\u001e\u00d2\u0001\u0000\u0000\u0000 \u00d7\u0001"+
		"\u0000\u0000\u0000\"\u00d9\u0001\u0000\u0000\u0000$\u00e6\u0001\u0000"+
		"\u0000\u0000&\u00e8\u0001\u0000\u0000\u0000(\u00ee\u0001\u0000\u0000\u0000"+
		"*\u00fb\u0001\u0000\u0000\u0000,\u00fd\u0001\u0000\u0000\u0000.\u00ff"+
		"\u0001\u0000\u0000\u00000\u0118\u0001\u0000\u0000\u00002\u012c\u0001\u0000"+
		"\u0000\u00004\u0136\u0001\u0000\u0000\u00006\u0149\u0001\u0000\u0000\u0000"+
		"8\u0150\u0001\u0000\u0000\u0000:\u0157\u0001\u0000\u0000\u0000<\u0159"+
		"\u0001\u0000\u0000\u0000>\u0161\u0001\u0000\u0000\u0000@\u0163\u0001\u0000"+
		"\u0000\u0000B\u0165\u0001\u0000\u0000\u0000D\u016e\u0001\u0000\u0000\u0000"+
		"F\u0176\u0001\u0000\u0000\u0000H\u017d\u0001\u0000\u0000\u0000J\u017f"+
		"\u0001\u0000\u0000\u0000L\u0189\u0001\u0000\u0000\u0000N\u0192\u0001\u0000"+
		"\u0000\u0000P\u0194\u0001\u0000\u0000\u0000R\u019e\u0001\u0000\u0000\u0000"+
		"T\u01b2\u0001\u0000\u0000\u0000V\u01ba\u0001\u0000\u0000\u0000X\u01bc"+
		"\u0001\u0000\u0000\u0000Z\u01c9\u0001\u0000\u0000\u0000\\\u01cb\u0001"+
		"\u0000\u0000\u0000^\u01cd\u0001\u0000\u0000\u0000`\u01d2\u0001\u0000\u0000"+
		"\u0000b\u01dc\u0001\u0000\u0000\u0000d\u01e3\u0001\u0000\u0000\u0000f"+
		"\u01e8\u0001\u0000\u0000\u0000h\u01ec\u0001\u0000\u0000\u0000j\u01f3\u0001"+
		"\u0000\u0000\u0000lm\u0005\u0001\u0000\u0000mn\u0005%\u0000\u0000no\u0005"+
		".\u0000\u0000op\u0003\u0002\u0001\u0000pq\u0003\b\u0004\u0000qr\u0003"+
		"\u0010\b\u0000rs\u0005\u0002\u0000\u0000st\u0005\u0001\u0000\u0000tu\u0005"+
		"%\u0000\u0000uv\u0003N\'\u0000vw\u0005\u0000\u0000\u0001w\u0001\u0001"+
		"\u0000\u0000\u0000xy\u0003\u0004\u0002\u0000yz\u0003\u0002\u0001\u0000"+
		"z}\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|x\u0001\u0000\u0000"+
		"\u0000|{\u0001\u0000\u0000\u0000}\u0003\u0001\u0000\u0000\u0000~\u007f"+
		"\u0003\u0018\f\u0000\u007f\u0080\u0003\u0006\u0003\u0000\u0080\u0005\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005-\u0000\u0000\u0082\u0083\u0005\u0003"+
		"\u0000\u0000\u0083\u0084\u0005\u0004\u0000\u0000\u0084\u0085\u0005%\u0000"+
		"\u0000\u0085\u0086\u0005/\u0000\u0000\u0086\u0087\u0003\u0016\u000b\u0000"+
		"\u0087\u0088\u0003\u0014\n\u0000\u0088\u0089\u0005.\u0000\u0000\u0089"+
		"\u008f\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0004\u0000\u0000\u008b"+
		"\u008c\u0003\u001c\u000e\u0000\u008c\u008d\u0005.\u0000\u0000\u008d\u008f"+
		"\u0001\u0000\u0000\u0000\u008e\u0081\u0001\u0000\u0000\u0000\u008e\u008a"+
		"\u0001\u0000\u0000\u0000\u008f\u0007\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\u0005\u0000\u0000\u0091\u0092\u0003\n\u0005\u0000\u0092\u0093\u0005"+
		"\u0002\u0000\u0000\u0093\u0094\u0005\u0005\u0000\u0000\u0094\u0097\u0001"+
		"\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0090\u0001"+
		"\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\t\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0003\u000e\u0007\u0000\u0099\u009a\u0003\f\u0006"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000"+
		"\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u000b\u0001\u0000\u0000\u0000\u009e\u009f\u0003\u000e\u0007"+
		"\u0000\u009f\u00a0\u0003\f\u0006\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\r\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a7\u0003\"\u0011\u0000\u00a5\u00a7\u0003.\u0017\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u000f"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u00032\u0019\u0000\u00a9\u00aa\u0003"+
		"\u0012\t\u0000\u00aa\u0011\u0001\u0000\u0000\u0000\u00ab\u00ac\u00032"+
		"\u0019\u0000\u00ac\u00ad\u0003\u0012\t\u0000\u00ad\u00b0\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000"+
		"\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u0013\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005-\u0000\u0000\u00b2\u00b3\u0005%\u0000\u0000\u00b3"+
		"\u00b4\u0005/\u0000\u0000\u00b4\u00b5\u0003\u0016\u000b\u0000\u00b5\u00b6"+
		"\u0003\u0014\n\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b1\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u0015\u0001\u0000\u0000\u0000\u00ba\u00bb\u0007"+
		"\u0000\u0000\u0000\u00bb\u0017\u0001\u0000\u0000\u0000\u00bc\u00c1\u0005"+
		"\u0006\u0000\u0000\u00bd\u00c1\u0005\u0007\u0000\u0000\u00be\u00bf\u0005"+
		"\b\u0000\u0000\u00bf\u00c1\u0003\u001a\r\u0000\u00c0\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c1\u0019\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\t\u0000"+
		"\u0000\u00c3\u00c4\u00054\u0000\u0000\u00c4\u00c7\u0005\n\u0000\u0000"+
		"\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u001b\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0005%\u0000\u0000\u00c9\u00ca\u0003 \u0010\u0000\u00ca\u00cb"+
		"\u0003\u001e\u000f\u0000\u00cb\u001d\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005-\u0000\u0000\u00cd\u00ce\u0005%\u0000\u0000\u00ce\u00cf\u0003 "+
		"\u0010\u0000\u00cf\u00d0\u0003\u001e\u000f\u0000\u00d0\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u001f\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005/\u0000\u0000\u00d5\u00d8\u0003\u0016\u000b"+
		"\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8!\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0005\u000b\u0000\u0000\u00da\u00db\u0005%\u0000\u0000\u00db"+
		"\u00dc\u0003$\u0012\u0000\u00dc\u00dd\u0003*\u0015\u0000\u00dd\u00de\u0005"+
		"\u0002\u0000\u0000\u00de\u00df\u0005\u000b\u0000\u0000\u00df\u00e0\u0005"+
		"%\u0000\u0000\u00e0#\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\t\u0000"+
		"\u0000\u00e2\u00e3\u0003&\u0013\u0000\u00e3\u00e4\u0005\n\u0000\u0000"+
		"\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e1\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7%\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005%\u0000\u0000\u00e9\u00ea"+
		"\u0003(\u0014\u0000\u00ea\'\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005"+
		"-\u0000\u0000\u00ec\u00ef\u0003&\u0013\u0000\u00ed\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef)\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003\u0018\f\u0000"+
		"\u00f1\u00f2\u0005-\u0000\u0000\u00f2\u00f3\u0005\f\u0000\u0000\u00f3"+
		"\u00f4\u0005\t\u0000\u0000\u00f4\u00f5\u0003,\u0016\u0000\u00f5\u00f6"+
		"\u0005\n\u0000\u0000\u00f6\u00f7\u0005%\u0000\u0000\u00f7\u00f8\u0005"+
		".\u0000\u0000\u00f8\u00f9\u0003*\u0015\u0000\u00f9\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f0\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc+\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0007\u0001\u0000\u0000\u00fe-\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0005\u0010\u0000\u0000\u0100\u0101\u0005%\u0000\u0000\u0101\u0102"+
		"\u0005\t\u0000\u0000\u0102\u0103\u0003&\u0013\u0000\u0103\u0104\u0005"+
		"\n\u0000\u0000\u0104\u0105\u0003\u0018\f\u0000\u0105\u0106\u0005\u0004"+
		"\u0000\u0000\u0106\u0107\u0005%\u0000\u0000\u0107\u0108\u0005.\u0000\u0000"+
		"\u0108\u0109\u00030\u0018\u0000\u0109\u010a\u0005\u0002\u0000\u0000\u010a"+
		"\u010b\u0005\u0010\u0000\u0000\u010b\u010c\u0005%\u0000\u0000\u010c/\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0003\u0018\f\u0000\u010e\u010f\u0005-"+
		"\u0000\u0000\u010f\u0110\u0005\f\u0000\u0000\u0110\u0111\u0005\t\u0000"+
		"\u0000\u0111\u0112\u0005\r\u0000\u0000\u0112\u0113\u0005\n\u0000\u0000"+
		"\u0113\u0114\u0005%\u0000\u0000\u0114\u0115\u0005.\u0000\u0000\u0115\u0116"+
		"\u00030\u0018\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0119\u0001"+
		"\u0000\u0000\u0000\u0118\u010d\u0001\u0000\u0000\u0000\u0118\u0117\u0001"+
		"\u0000\u0000\u0000\u01191\u0001\u0000\u0000\u0000\u011a\u012d\u00034\u001a"+
		"\u0000\u011b\u011c\u0005\u0011\u0000\u0000\u011c\u011d\u0005\t\u0000\u0000"+
		"\u011d\u011e\u0003T*\u0000\u011e\u011f\u0005\n\u0000\u0000\u011f\u0120"+
		"\u00038\u001c\u0000\u0120\u012d\u0001\u0000\u0000\u0000\u0121\u0122\u0005"+
		"\u0012\u0000\u0000\u0122\u012d\u00036\u001b\u0000\u0123\u0124\u0005\u0013"+
		"\u0000\u0000\u0124\u0125\u0005\u0014\u0000\u0000\u0125\u0126\u0005\t\u0000"+
		"\u0000\u0126\u0127\u0003<\u001e\u0000\u0127\u0128\u0005\n\u0000\u0000"+
		"\u0128\u0129\u0003`0\u0000\u0129\u012a\u0005\u0002\u0000\u0000\u012a\u012b"+
		"\u0005\u0013\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u011a"+
		"\u0001\u0000\u0000\u0000\u012c\u011b\u0001\u0000\u0000\u0000\u012c\u0121"+
		"\u0001\u0000\u0000\u0000\u012c\u0123\u0001\u0000\u0000\u0000\u012d3\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0005%\u0000\u0000\u012f\u0130\u0005/\u0000"+
		"\u0000\u0130\u0131\u0003<\u001e\u0000\u0131\u0132\u0005.\u0000\u0000\u0132"+
		"\u0137\u0001\u0000\u0000\u0000\u0133\u0134\u0003J%\u0000\u0134\u0135\u0005"+
		".\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u012e\u0001\u0000"+
		"\u0000\u0000\u0136\u0133\u0001\u0000\u0000\u0000\u01375\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005\u0015\u0000\u0000\u0139\u013a\u0005\t\u0000\u0000"+
		"\u013a\u013b\u0003T*\u0000\u013b\u013c\u0005\n\u0000\u0000\u013c\u013d"+
		"\u0003\u0010\b\u0000\u013d\u013e\u0005\u0016\u0000\u0000\u013e\u014a\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0005%\u0000\u0000\u0140\u0141\u0005/\u0000"+
		"\u0000\u0141\u0142\u0003^/\u0000\u0142\u0143\u0005-\u0000\u0000\u0143"+
		"\u0144\u0003^/\u0000\u0144\u0145\u0005-\u0000\u0000\u0145\u0146\u0003"+
		"^/\u0000\u0146\u0147\u0003\u0010\b\u0000\u0147\u0148\u0005\u0016\u0000"+
		"\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149\u0138\u0001\u0000\u0000"+
		"\u0000\u0149\u013f\u0001\u0000\u0000\u0000\u014a7\u0001\u0000\u0000\u0000"+
		"\u014b\u0151\u00032\u0019\u0000\u014c\u014d\u0005\u0017\u0000\u0000\u014d"+
		"\u014e\u0003\u0010\b\u0000\u014e\u014f\u0003:\u001d\u0000\u014f\u0151"+
		"\u0001\u0000\u0000\u0000\u0150\u014b\u0001\u0000\u0000\u0000\u0150\u014c"+
		"\u0001\u0000\u0000\u0000\u01519\u0001\u0000\u0000\u0000\u0152\u0158\u0005"+
		"\u0018\u0000\u0000\u0153\u0154\u0005\u0019\u0000\u0000\u0154\u0155\u0003"+
		"\u0010\b\u0000\u0155\u0156\u0005\u0018\u0000\u0000\u0156\u0158\u0001\u0000"+
		"\u0000\u0000\u0157\u0152\u0001\u0000\u0000\u0000\u0157\u0153\u0001\u0000"+
		"\u0000\u0000\u0158;\u0001\u0000\u0000\u0000\u0159\u015a\u0003D\"\u0000"+
		"\u015a\u015b\u0003>\u001f\u0000\u015b=\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0003@ \u0000\u015d\u015e\u0003D\"\u0000\u015e\u015f\u0003>\u001f\u0000"+
		"\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000"+
		"\u0161\u015c\u0001\u0000\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000"+
		"\u0162?\u0001\u0000\u0000\u0000\u0163\u0164\u0003B!\u0000\u0164A\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0007\u0002\u0000\u0000\u0166C\u0001\u0000"+
		"\u0000\u0000\u0167\u016f\u0003\u0016\u000b\u0000\u0168\u0169\u0005\t\u0000"+
		"\u0000\u0169\u016a\u0003<\u001e\u0000\u016a\u016b\u0005\n\u0000\u0000"+
		"\u016b\u016f\u0001\u0000\u0000\u0000\u016c\u016d\u0005%\u0000\u0000\u016d"+
		"\u016f\u0003F#\u0000\u016e\u0167\u0001\u0000\u0000\u0000\u016e\u0168\u0001"+
		"\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016fE\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0005\t\u0000\u0000\u0171\u0172\u0003<\u001e"+
		"\u0000\u0172\u0173\u0003H$\u0000\u0173\u0174\u0005\n\u0000\u0000\u0174"+
		"\u0177\u0001\u0000\u0000\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176"+
		"\u0170\u0001\u0000\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177"+
		"G\u0001\u0000\u0000\u0000\u0178\u0179\u0005-\u0000\u0000\u0179\u017a\u0003"+
		"<\u001e\u0000\u017a\u017b\u0003H$\u0000\u017b\u017e\u0001\u0000\u0000"+
		"\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u0178\u0001\u0000\u0000"+
		"\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017eI\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005$\u0000\u0000\u0180\u0181\u0005%\u0000\u0000\u0181\u0182"+
		"\u0003L&\u0000\u0182K\u0001\u0000\u0000\u0000\u0183\u0184\u0005\t\u0000"+
		"\u0000\u0184\u0185\u0003<\u001e\u0000\u0185\u0186\u0003H$\u0000\u0186"+
		"\u0187\u0005\n\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u018a"+
		"\u0001\u0000\u0000\u0000\u0189\u0183\u0001\u0000\u0000\u0000\u0189\u0188"+
		"\u0001\u0000\u0000\u0000\u018aM\u0001\u0000\u0000\u0000\u018b\u018c\u0003"+
		"P(\u0000\u018c\u018d\u0003N\'\u0000\u018d\u0193\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\u0003R)\u0000\u018f\u0190\u0003N\'\u0000\u0190\u0193\u0001"+
		"\u0000\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u018b\u0001"+
		"\u0000\u0000\u0000\u0192\u018e\u0001\u0000\u0000\u0000\u0192\u0191\u0001"+
		"\u0000\u0000\u0000\u0193O\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u000b"+
		"\u0000\u0000\u0195\u0196\u0005%\u0000\u0000\u0196\u0197\u0003$\u0012\u0000"+
		"\u0197\u0198\u0003*\u0015\u0000\u0198\u0199\u0003\u0002\u0001\u0000\u0199"+
		"\u019a\u0003\u0010\b\u0000\u019a\u019b\u0005\u0002\u0000\u0000\u019b\u019c"+
		"\u0005\u000b\u0000\u0000\u019c\u019d\u0005%\u0000\u0000\u019dQ\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0005\u0010\u0000\u0000\u019f\u01a0\u0005%\u0000"+
		"\u0000\u01a0\u01a1\u0005\t\u0000\u0000\u01a1\u01a2\u0003&\u0013\u0000"+
		"\u01a2\u01a3\u0005\n\u0000\u0000\u01a3\u01a4\u0003\u0018\f\u0000\u01a4"+
		"\u01a5\u0005\u0004\u0000\u0000\u01a5\u01a6\u0005%\u0000\u0000\u01a6\u01a7"+
		"\u0005.\u0000\u0000\u01a7\u01a8\u00030\u0018\u0000\u01a8\u01a9\u0003\u0002"+
		"\u0001\u0000\u01a9\u01aa\u0003\u0010\b\u0000\u01aa\u01ab\u0005%\u0000"+
		"\u0000\u01ab\u01ac\u0005/\u0000\u0000\u01ac\u01ad\u0003<\u001e\u0000\u01ad"+
		"\u01ae\u0005.\u0000\u0000\u01ae\u01af\u0005\u0002\u0000\u0000\u01af\u01b0"+
		"\u0005\u0010\u0000\u0000\u01b0\u01b1\u0005%\u0000\u0000\u01b1S\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b3\u0003Z-\u0000\u01b3\u01b4\u0003V+\u0000\u01b4"+
		"U\u0001\u0000\u0000\u0000\u01b5\u01b6\u0003X,\u0000\u01b6\u01b7\u0003"+
		"Z-\u0000\u01b7\u01b8\u0003V+\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000"+
		"\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba\u01b5\u0001\u0000\u0000\u0000"+
		"\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bbW\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0007\u0003\u0000\u0000\u01bdY\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0003<\u001e\u0000\u01bf\u01c0\u0003\\.\u0000\u01c0\u01c1\u0003<\u001e"+
		"\u0000\u01c1\u01ca\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\t\u0000\u0000"+
		"\u01c3\u01c4\u0003T*\u0000\u01c4\u01c5\u0005\n\u0000\u0000\u01c5\u01ca"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005\"\u0000\u0000\u01c7\u01ca\u0003"+
		"Z-\u0000\u01c8\u01ca\u00053\u0000\u0000\u01c9\u01be\u0001\u0000\u0000"+
		"\u0000\u01c9\u01c2\u0001\u0000\u0000\u0000\u01c9\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca[\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0007\u0004\u0000\u0000\u01cc]\u0001\u0000\u0000\u0000\u01cd"+
		"\u01ce\u0007\u0005\u0000\u0000\u01ce_\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0005\u0014\u0000\u0000\u01d0\u01d3\u0003b1\u0000\u01d1\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d2\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d3a\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005\t\u0000"+
		"\u0000\u01d5\u01d6\u0003d2\u0000\u01d6\u01d7\u0005\n\u0000\u0000\u01d7"+
		"\u01d8\u0003\u0010\b\u0000\u01d8\u01d9\u0003`0\u0000\u01d9\u01dd\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\u0005#\u0000\u0000\u01db\u01dd\u0003\u0010"+
		"\b\u0000\u01dc\u01d4\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01ddc\u0001\u0000\u0000\u0000\u01de\u01df\u0003\u0016\u000b\u0000"+
		"\u01df\u01e0\u0003f3\u0000\u01e0\u01e4\u0001\u0000\u0000\u0000\u01e1\u01e2"+
		"\u0005,\u0000\u0000\u01e2\u01e4\u0003\u0016\u000b\u0000\u01e3\u01de\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4e\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e9\u0003j5\u0000\u01e6\u01e7\u0005,\u0000\u0000"+
		"\u01e7\u01e9\u0003h4\u0000\u01e8\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e9g\u0001\u0000\u0000\u0000\u01ea\u01ed\u0003"+
		"\u0016\u000b\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01edi\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ef\u0005-\u0000\u0000\u01ef\u01f0\u0003\u0016\u000b"+
		"\u0000\u01f0\u01f1\u0003j5\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f3\u01ee\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f4k\u0001\u0000\u0000\u0000#|\u008e"+
		"\u0096\u009c\u00a2\u00a6\u00af\u00b8\u00c0\u00c6\u00d2\u00d7\u00e6\u00ee"+
		"\u00fb\u0118\u012c\u0136\u0149\u0150\u0157\u0161\u016e\u0176\u017d\u0189"+
		"\u0192\u01ba\u01c9\u01d2\u01dc\u01e3\u01e8\u01ec\u01f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}