// Generated from C:/Users/julia/Documents/LL3/grammar\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#subproceso}.
	 * @param ctx the parse tree
	 */
	void enterSubproceso(GrammarParser.SubprocesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#subproceso}.
	 * @param ctx the parse tree
	 */
	void exitSubproceso(GrammarParser.SubprocesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inicio_sub_proceso}.
	 * @param ctx the parse tree
	 */
	void enterInicio_sub_proceso(GrammarParser.Inicio_sub_procesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inicio_sub_proceso}.
	 * @param ctx the parse tree
	 */
	void exitInicio_sub_proceso(GrammarParser.Inicio_sub_procesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fin_sub_proceso}.
	 * @param ctx the parse tree
	 */
	void enterFin_sub_proceso(GrammarParser.Fin_sub_procesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fin_sub_proceso}.
	 * @param ctx the parse tree
	 */
	void exitFin_sub_proceso(GrammarParser.Fin_sub_procesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#firma}.
	 * @param ctx the parse tree
	 */
	void enterFirma(GrammarParser.FirmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#firma}.
	 * @param ctx the parse tree
	 */
	void exitFirma(GrammarParser.FirmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(GrammarParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(GrammarParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#proceso}.
	 * @param ctx the parse tree
	 */
	void enterProceso(GrammarParser.ProcesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#proceso}.
	 * @param ctx the parse tree
	 */
	void exitProceso(GrammarParser.ProcesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inicio_proceso}.
	 * @param ctx the parse tree
	 */
	void enterInicio_proceso(GrammarParser.Inicio_procesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inicio_proceso}.
	 * @param ctx the parse tree
	 */
	void exitInicio_proceso(GrammarParser.Inicio_procesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fin_proceso}.
	 * @param ctx the parse tree
	 */
	void enterFin_proceso(GrammarParser.Fin_procesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fin_proceso}.
	 * @param ctx the parse tree
	 */
	void exitFin_proceso(GrammarParser.Fin_procesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GrammarParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GrammarParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(GrammarParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(GrammarParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GrammarParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GrammarParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(GrammarParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(GrammarParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#asignacion1}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion1(GrammarParser.Asignacion1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#asignacion1}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion1(GrammarParser.Asignacion1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#llamada_subproceso}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_subproceso(GrammarParser.Llamada_subprocesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#llamada_subproceso}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_subproceso(GrammarParser.Llamada_subprocesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#llamada_subproceso1}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_subproceso1(GrammarParser.Llamada_subproceso1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#llamada_subproceso1}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_subproceso1(GrammarParser.Llamada_subproceso1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#llamada_dimension}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_dimension(GrammarParser.Llamada_dimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#llamada_dimension}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_dimension(GrammarParser.Llamada_dimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#llamada_dimension1}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_dimension1(GrammarParser.Llamada_dimension1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#llamada_dimension1}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_dimension1(GrammarParser.Llamada_dimension1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(GrammarParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(GrammarParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condicional_si}.
	 * @param ctx the parse tree
	 */
	void enterCondicional_si(GrammarParser.Condicional_siContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condicional_si}.
	 * @param ctx the parse tree
	 */
	void exitCondicional_si(GrammarParser.Condicional_siContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bloque_si}.
	 * @param ctx the parse tree
	 */
	void enterBloque_si(GrammarParser.Bloque_siContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloque_si}.
	 * @param ctx the parse tree
	 */
	void exitBloque_si(GrammarParser.Bloque_siContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bloque_sino}.
	 * @param ctx the parse tree
	 */
	void enterBloque_sino(GrammarParser.Bloque_sinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloque_sino}.
	 * @param ctx the parse tree
	 */
	void exitBloque_sino(GrammarParser.Bloque_sinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ciclo_para}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_para(GrammarParser.Ciclo_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ciclo_para}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_para(GrammarParser.Ciclo_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ciclo_para1}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_para1(GrammarParser.Ciclo_para1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ciclo_para1}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_para1(GrammarParser.Ciclo_para1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bloque_para}.
	 * @param ctx the parse tree
	 */
	void enterBloque_para(GrammarParser.Bloque_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloque_para}.
	 * @param ctx the parse tree
	 */
	void exitBloque_para(GrammarParser.Bloque_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_mientras(GrammarParser.Ciclo_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_mientras(GrammarParser.Ciclo_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bloque_mientras}.
	 * @param ctx the parse tree
	 */
	void enterBloque_mientras(GrammarParser.Bloque_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloque_mientras}.
	 * @param ctx the parse tree
	 */
	void exitBloque_mientras(GrammarParser.Bloque_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ciclo_repetir}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_repetir(GrammarParser.Ciclo_repetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ciclo_repetir}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_repetir(GrammarParser.Ciclo_repetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bloque_repetir}.
	 * @param ctx the parse tree
	 */
	void enterBloque_repetir(GrammarParser.Bloque_repetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloque_repetir}.
	 * @param ctx the parse tree
	 */
	void exitBloque_repetir(GrammarParser.Bloque_repetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#segun}.
	 * @param ctx the parse tree
	 */
	void enterSegun(GrammarParser.SegunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#segun}.
	 * @param ctx the parse tree
	 */
	void exitSegun(GrammarParser.SegunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bloque_segun}.
	 * @param ctx the parse tree
	 */
	void enterBloque_segun(GrammarParser.Bloque_segunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloque_segun}.
	 * @param ctx the parse tree
	 */
	void exitBloque_segun(GrammarParser.Bloque_segunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#finsegun}.
	 * @param ctx the parse tree
	 */
	void enterFinsegun(GrammarParser.FinsegunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#finsegun}.
	 * @param ctx the parse tree
	 */
	void exitFinsegun(GrammarParser.FinsegunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#comando_especial}.
	 * @param ctx the parse tree
	 */
	void enterComando_especial(GrammarParser.Comando_especialContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#comando_especial}.
	 * @param ctx the parse tree
	 */
	void exitComando_especial(GrammarParser.Comando_especialContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#escribir}.
	 * @param ctx the parse tree
	 */
	void enterEscribir(GrammarParser.EscribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#escribir}.
	 * @param ctx the parse tree
	 */
	void exitEscribir(GrammarParser.EscribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#esperar}.
	 * @param ctx the parse tree
	 */
	void enterEsperar(GrammarParser.EsperarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#esperar}.
	 * @param ctx the parse tree
	 */
	void exitEsperar(GrammarParser.EsperarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#esperar1}.
	 * @param ctx the parse tree
	 */
	void enterEsperar1(GrammarParser.Esperar1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#esperar1}.
	 * @param ctx the parse tree
	 */
	void exitEsperar1(GrammarParser.Esperar1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#medida}.
	 * @param ctx the parse tree
	 */
	void enterMedida(GrammarParser.MedidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#medida}.
	 * @param ctx the parse tree
	 */
	void exitMedida(GrammarParser.MedidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(GrammarParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(GrammarParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lista_leer_id}.
	 * @param ctx the parse tree
	 */
	void enterLista_leer_id(GrammarParser.Lista_leer_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lista_leer_id}.
	 * @param ctx the parse tree
	 */
	void exitLista_leer_id(GrammarParser.Lista_leer_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lista_leer_id1}.
	 * @param ctx the parse tree
	 */
	void enterLista_leer_id1(GrammarParser.Lista_leer_id1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lista_leer_id1}.
	 * @param ctx the parse tree
	 */
	void exitLista_leer_id1(GrammarParser.Lista_leer_id1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(GrammarParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(GrammarParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expresion1}.
	 * @param ctx the parse tree
	 */
	void enterExpresion1(GrammarParser.Expresion1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expresion1}.
	 * @param ctx the parse tree
	 */
	void exitExpresion1(GrammarParser.Expresion1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(GrammarParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(GrammarParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lista_e}.
	 * @param ctx the parse tree
	 */
	void enterLista_e(GrammarParser.Lista_eContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lista_e}.
	 * @param ctx the parse tree
	 */
	void exitLista_e(GrammarParser.Lista_eContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(GrammarParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(GrammarParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(GrammarParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(GrammarParser.OperacionContext ctx);
}