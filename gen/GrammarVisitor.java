// Generated from C:/Users/julia/Documents/LL3/grammar\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GrammarParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#subproceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubproceso(GrammarParser.SubprocesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#inicio_sub_proceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio_sub_proceso(GrammarParser.Inicio_sub_procesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fin_sub_proceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFin_sub_proceso(GrammarParser.Fin_sub_procesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#firma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirma(GrammarParser.FirmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(GrammarParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#proceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProceso(GrammarParser.ProcesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#inicio_proceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio_proceso(GrammarParser.Inicio_procesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fin_proceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFin_proceso(GrammarParser.Fin_procesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(GrammarParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(GrammarParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GrammarParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(GrammarParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#asignacion1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion1(GrammarParser.Asignacion1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#llamada_subproceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_subproceso(GrammarParser.Llamada_subprocesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#llamada_subproceso1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_subproceso1(GrammarParser.Llamada_subproceso1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#llamada_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_dimension(GrammarParser.Llamada_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#llamada_dimension1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_dimension1(GrammarParser.Llamada_dimension1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(GrammarParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#condicional_si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional_si(GrammarParser.Condicional_siContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bloque_si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_si(GrammarParser.Bloque_siContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bloque_sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_sino(GrammarParser.Bloque_sinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ciclo_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_para(GrammarParser.Ciclo_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ciclo_para1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_para1(GrammarParser.Ciclo_para1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bloque_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_para(GrammarParser.Bloque_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_mientras(GrammarParser.Ciclo_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bloque_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_mientras(GrammarParser.Bloque_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ciclo_repetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_repetir(GrammarParser.Ciclo_repetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bloque_repetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_repetir(GrammarParser.Bloque_repetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#segun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegun(GrammarParser.SegunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bloque_segun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_segun(GrammarParser.Bloque_segunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#finsegun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinsegun(GrammarParser.FinsegunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#comando_especial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_especial(GrammarParser.Comando_especialContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#escribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribir(GrammarParser.EscribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#esperar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsperar(GrammarParser.EsperarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#esperar1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsperar1(GrammarParser.Esperar1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#medida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedida(GrammarParser.MedidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(GrammarParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lista_leer_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_leer_id(GrammarParser.Lista_leer_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lista_leer_id1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_leer_id1(GrammarParser.Lista_leer_id1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(GrammarParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expresion1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion1(GrammarParser.Expresion1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(GrammarParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lista_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_e(GrammarParser.Lista_eContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(GrammarParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(GrammarParser.OperacionContext ctx);
}