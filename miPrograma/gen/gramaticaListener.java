// Generated from //10.97.0.21/Home_VDI$/s.munozl.2023/Documents/miPrograma/src/gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(gramaticaParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(gramaticaParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(gramaticaParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(gramaticaParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(gramaticaParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(gramaticaParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dclp}.
	 * @param ctx the parse tree
	 */
	void enterDclp(gramaticaParser.DclpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dclp}.
	 * @param ctx the parse tree
	 */
	void exitDclp(gramaticaParser.DclpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void enterCabecera(gramaticaParser.CabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void exitCabecera(gramaticaParser.CabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cablist}.
	 * @param ctx the parse tree
	 */
	void enterCablist(gramaticaParser.CablistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cablist}.
	 * @param ctx the parse tree
	 */
	void exitCablist(gramaticaParser.CablistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#decsubprog}.
	 * @param ctx the parse tree
	 */
	void enterDecsubprog(gramaticaParser.DecsubprogContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#decsubprog}.
	 * @param ctx the parse tree
	 */
	void exitDecsubprog(gramaticaParser.DecsubprogContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dec_elemento}.
	 * @param ctx the parse tree
	 */
	void enterDec_elemento(gramaticaParser.Dec_elementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dec_elemento}.
	 * @param ctx the parse tree
	 */
	void exitDec_elemento(gramaticaParser.Dec_elementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentlistp}.
	 * @param ctx the parse tree
	 */
	void enterSentlistp(gramaticaParser.SentlistpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentlistp}.
	 * @param ctx the parse tree
	 */
	void exitSentlistp(gramaticaParser.SentlistpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(gramaticaParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(gramaticaParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(gramaticaParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(gramaticaParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#charlength}.
	 * @param ctx the parse tree
	 */
	void enterCharlength(gramaticaParser.CharlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#charlength}.
	 * @param ctx the parse tree
	 */
	void exitCharlength(gramaticaParser.CharlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(gramaticaParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(gramaticaParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#varlistp}.
	 * @param ctx the parse tree
	 */
	void enterVarlistp(gramaticaParser.VarlistpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#varlistp}.
	 * @param ctx the parse tree
	 */
	void exitVarlistp(gramaticaParser.VarlistpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(gramaticaParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(gramaticaParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#decproc}.
	 * @param ctx the parse tree
	 */
	void enterDecproc(gramaticaParser.DecprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#decproc}.
	 * @param ctx the parse tree
	 */
	void exitDecproc(gramaticaParser.DecprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(gramaticaParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(gramaticaParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#nomparamlist}.
	 * @param ctx the parse tree
	 */
	void enterNomparamlist(gramaticaParser.NomparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#nomparamlist}.
	 * @param ctx the parse tree
	 */
	void exitNomparamlist(gramaticaParser.NomparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#nomparamlistp}.
	 * @param ctx the parse tree
	 */
	void enterNomparamlistp(gramaticaParser.NomparamlistpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#nomparamlistp}.
	 * @param ctx the parse tree
	 */
	void exitNomparamlistp(gramaticaParser.NomparamlistpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterDec_s_paramlist(gramaticaParser.Dec_s_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitDec_s_paramlist(gramaticaParser.Dec_s_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipoparam}.
	 * @param ctx the parse tree
	 */
	void enterTipoparam(gramaticaParser.TipoparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipoparam}.
	 * @param ctx the parse tree
	 */
	void exitTipoparam(gramaticaParser.TipoparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#decfun}.
	 * @param ctx the parse tree
	 */
	void enterDecfun(gramaticaParser.DecfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#decfun}.
	 * @param ctx the parse tree
	 */
	void exitDecfun(gramaticaParser.DecfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterDec_f_paramlist(gramaticaParser.Dec_f_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitDec_f_paramlist(gramaticaParser.Dec_f_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(gramaticaParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(gramaticaParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(gramaticaParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(gramaticaParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentdo}.
	 * @param ctx the parse tree
	 */
	void enterSentdo(gramaticaParser.SentdoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentdo}.
	 * @param ctx the parse tree
	 */
	void exitSentdo(gramaticaParser.SentdoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentif}.
	 * @param ctx the parse tree
	 */
	void enterSentif(gramaticaParser.SentifContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentif}.
	 * @param ctx the parse tree
	 */
	void exitSentif(gramaticaParser.SentifContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentthen}.
	 * @param ctx the parse tree
	 */
	void enterSentthen(gramaticaParser.SentthenContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentthen}.
	 * @param ctx the parse tree
	 */
	void exitSentthen(gramaticaParser.SentthenContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(gramaticaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(gramaticaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expp}.
	 * @param ctx the parse tree
	 */
	void enterExpp(gramaticaParser.ExppContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expp}.
	 * @param ctx the parse tree
	 */
	void exitExpp(gramaticaParser.ExppContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(gramaticaParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(gramaticaParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#oparit}.
	 * @param ctx the parse tree
	 */
	void enterOparit(gramaticaParser.OparitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#oparit}.
	 * @param ctx the parse tree
	 */
	void exitOparit(gramaticaParser.OparitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#factorp}.
	 * @param ctx the parse tree
	 */
	void enterFactorp(gramaticaParser.FactorpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#factorp}.
	 * @param ctx the parse tree
	 */
	void exitFactorp(gramaticaParser.FactorpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(gramaticaParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(gramaticaParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(gramaticaParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(gramaticaParser.Proc_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubparamlist(gramaticaParser.SubparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubparamlist(gramaticaParser.SubparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#subproglist}.
	 * @param ctx the parse tree
	 */
	void enterSubproglist(gramaticaParser.SubproglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#subproglist}.
	 * @param ctx the parse tree
	 */
	void exitSubproglist(gramaticaParser.SubproglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#codproc}.
	 * @param ctx the parse tree
	 */
	void enterCodproc(gramaticaParser.CodprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#codproc}.
	 * @param ctx the parse tree
	 */
	void exitCodproc(gramaticaParser.CodprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#codfun}.
	 * @param ctx the parse tree
	 */
	void enterCodfun(gramaticaParser.CodfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#codfun}.
	 * @param ctx the parse tree
	 */
	void exitCodfun(gramaticaParser.CodfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(gramaticaParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(gramaticaParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expcondp}.
	 * @param ctx the parse tree
	 */
	void enterExpcondp(gramaticaParser.ExpcondpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expcondp}.
	 * @param ctx the parse tree
	 */
	void exitExpcondp(gramaticaParser.ExpcondpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#oplog}.
	 * @param ctx the parse tree
	 */
	void enterOplog(gramaticaParser.OplogContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#oplog}.
	 * @param ctx the parse tree
	 */
	void exitOplog(gramaticaParser.OplogContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void enterFactorcond(gramaticaParser.FactorcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void exitFactorcond(gramaticaParser.FactorcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void enterOpcomp(gramaticaParser.OpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void exitOpcomp(gramaticaParser.OpcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#doval}.
	 * @param ctx the parse tree
	 */
	void enterDoval(gramaticaParser.DovalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#doval}.
	 * @param ctx the parse tree
	 */
	void exitDoval(gramaticaParser.DovalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasos(gramaticaParser.CasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasos(gramaticaParser.CasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#casosp}.
	 * @param ctx the parse tree
	 */
	void enterCasosp(gramaticaParser.CasospContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#casosp}.
	 * @param ctx the parse tree
	 */
	void exitCasosp(gramaticaParser.CasospContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetas(gramaticaParser.EtiquetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetas(gramaticaParser.EtiquetasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#etiquetasp}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetasp(gramaticaParser.EtiquetaspContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#etiquetasp}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetasp(gramaticaParser.EtiquetaspContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#simpvaluep}.
	 * @param ctx the parse tree
	 */
	void enterSimpvaluep(gramaticaParser.SimpvaluepContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#simpvaluep}.
	 * @param ctx the parse tree
	 */
	void exitSimpvaluep(gramaticaParser.SimpvaluepContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaetiquetas}.
	 * @param ctx the parse tree
	 */
	void enterListaetiquetas(gramaticaParser.ListaetiquetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaetiquetas}.
	 * @param ctx the parse tree
	 */
	void exitListaetiquetas(gramaticaParser.ListaetiquetasContext ctx);
}