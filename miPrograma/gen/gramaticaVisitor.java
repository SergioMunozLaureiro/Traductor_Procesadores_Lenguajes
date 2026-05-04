// Generated from //10.97.0.21/Home_VDI$/s.munozl.2023/Documents/miPrograma/src/gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(gramaticaParser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(gramaticaParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(gramaticaParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dclp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclp(gramaticaParser.DclpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cabecera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecera(gramaticaParser.CabeceraContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cablist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCablist(gramaticaParser.CablistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#decsubprog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecsubprog(gramaticaParser.DecsubprogContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dec_elemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_elemento(gramaticaParser.Dec_elementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentlistp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlistp(gramaticaParser.SentlistpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(gramaticaParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(gramaticaParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#charlength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharlength(gramaticaParser.CharlengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(gramaticaParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#varlistp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlistp(gramaticaParser.VarlistpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(gramaticaParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#decproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecproc(gramaticaParser.DecprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#formal_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramlist(gramaticaParser.Formal_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#nomparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomparamlist(gramaticaParser.NomparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#nomparamlistp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomparamlistp(gramaticaParser.NomparamlistpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_s_paramlist(gramaticaParser.Dec_s_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#tipoparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoparam(gramaticaParser.TipoparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#decfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecfun(gramaticaParser.DecfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_f_paramlist(gramaticaParser.Dec_f_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(gramaticaParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(gramaticaParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentdo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentdo(gramaticaParser.SentdoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentif(gramaticaParser.SentifContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentthen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentthen(gramaticaParser.SentthenContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(gramaticaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpp(gramaticaParser.ExppContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(gramaticaParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#oparit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOparit(gramaticaParser.OparitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#factorp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorp(gramaticaParser.FactorpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(gramaticaParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(gramaticaParser.Proc_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#subparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubparamlist(gramaticaParser.SubparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#subproglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubproglist(gramaticaParser.SubproglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#codproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodproc(gramaticaParser.CodprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#codfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodfun(gramaticaParser.CodfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond(gramaticaParser.ExpcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expcondp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcondp(gramaticaParser.ExpcondpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#oplog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplog(gramaticaParser.OplogContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#factorcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorcond(gramaticaParser.FactorcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#opcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomp(gramaticaParser.OpcompContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#doval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoval(gramaticaParser.DovalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasos(gramaticaParser.CasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#casosp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasosp(gramaticaParser.CasospContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#etiquetas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetas(gramaticaParser.EtiquetasContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#etiquetasp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetasp(gramaticaParser.EtiquetaspContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#simpvaluep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvaluep(gramaticaParser.SimpvaluepContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaetiquetas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaetiquetas(gramaticaParser.ListaetiquetasContext ctx);
}