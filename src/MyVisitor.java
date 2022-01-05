import java.util.HashMap;

public class MyVisitor<T> extends GrammarBaseVisitor<T> {

    HashMap<String, Object> table = new HashMap<>();

    String ExpExpr1Th = "";
    String Ciclo_para1Th = "";
    String ComandoShift = "";

    @Override
    public T visitPrograma(GrammarParser.ProgramaContext ctx){
        String esto = (String) visitComando(ctx.comando());
        System.out.print(esto);
        return null;
    }


    // COMANDO
    @Override
    public T visitComando(GrammarParser.ComandoContext ctx){
        String ComandoTrad = ComandoShift;

        if(ctx.declaracion() != null){
            ComandoTrad = ComandoTrad + (String) visitDeclaracion(ctx.declaracion());
        }else if(ctx.asignacion() != null){
            ComandoTrad = ComandoTrad + (String) visitAsignacion(ctx.asignacion());
        }else if(ctx.dimension() != null){
            ComandoTrad = ComandoTrad + (String) visitDimension(ctx.dimension());
        }else if(ctx.condicional_si() != null){
            ComandoTrad = ComandoTrad + (String) visitCondicional_si(ctx.condicional_si());
        }else if(ctx.ciclo_para() != null){
            ComandoTrad = ComandoTrad + (String) visitCiclo_para(ctx.ciclo_para());
        }else if(ctx.ciclo_mientras() != null){
            ComandoTrad = ComandoTrad + (String) visitCiclo_mientras(ctx.ciclo_mientras());
        }else if(ctx.ciclo_repetir() != null){
            ComandoTrad = ComandoTrad + (String) visitCiclo_repetir(ctx.ciclo_repetir());
        }else if(ctx.segun() != null){
            ComandoTrad = ComandoTrad + (String) visitSegun(ctx.segun());
        }else if(ctx.comando_especial() != null){
            ComandoTrad = ComandoTrad + (String) visitComando_especial(ctx.comando_especial());
        }

        return (T) ComandoTrad;
    }

    // CICLO_PARA
    @Override
    public T visitCiclo_para(GrammarParser.Ciclo_paraContext ctx){
        String Ciclo_paraTrad = "";

        Ciclo_para1Th = ctx.TOKEN_ID().getText();
        Ciclo_paraTrad = "for(int " + Ciclo_para1Th + " = " + (String) visitExpresion(ctx.expresion().get(0)) + "; ";
        Ciclo_paraTrad = Ciclo_paraTrad + Ciclo_para1Th + " < " + (String) visitExpresion(ctx.expresion().get(1)) + "; ";
        Ciclo_paraTrad = Ciclo_paraTrad + (String) visitCiclo_para1(ctx.ciclo_para1());

        return (T) Ciclo_paraTrad;
    }

    @Override
    public T visitCiclo_para1(GrammarParser.Ciclo_para1Context ctx){
        String Ciclo_para1Trad = "";

        if(ctx.CON() != null){
            Ciclo_para1Trad = Ciclo_para1Th + " = " + Ciclo_para1Th + " + " + (String) visitExpresion(ctx.expresion()) + "){ \n";
        }else{
            Ciclo_para1Trad = Ciclo_para1Th + "++){ \n";
        }
        Ciclo_para1Trad = Ciclo_para1Trad + (String) visitBloque_para(ctx.bloque_para());

        return (T) Ciclo_para1Trad;
    }

    @Override
    public T visitBloque_para(GrammarParser.Bloque_paraContext ctx){
        String Bloque_paraTrad = "";

        ComandoShift = ComandoShift + "\t";
        int numCom = ctx.comando().size();
        for(int i = 0; i < numCom; i++){
            Bloque_paraTrad = Bloque_paraTrad + (String) visitComando(ctx.comando().get(i)) + "\n";
        }
        ComandoShift = ComandoShift.substring(1);
        Bloque_paraTrad = Bloque_paraTrad + ComandoShift + "}";

        return (T) Bloque_paraTrad;
    }


    // CICLO_MIENTRAS
    @Override
    public T visitCiclo_mientras(GrammarParser.Ciclo_mientrasContext ctx){
        String Ciclo_mientrasTrad = "";

        String ExpresionTrad = (String) visitExpresion(ctx.expresion());
        Ciclo_mientrasTrad = "while(" + ExpresionTrad + "){ \n";
        Ciclo_mientrasTrad = Ciclo_mientrasTrad + (String) visitBloque_mientras(ctx.bloque_mientras());

        return (T) Ciclo_mientrasTrad;
    }

    @Override
    public T visitBloque_mientras(GrammarParser.Bloque_mientrasContext ctx){
        String Bloque_mientrasTrad = "";

        ComandoShift = ComandoShift + "\t";
        int numCom = ctx.comando().size();
        for(int i = 0; i < numCom; i++){
            Bloque_mientrasTrad = Bloque_mientrasTrad + "\t" + (String) visitComando(ctx.comando().get(i)) + "\n";
        }
        ComandoShift = ComandoShift.substring(1);
        Bloque_mientrasTrad = Bloque_mientrasTrad + ComandoShift + "}";

        return (T) Bloque_mientrasTrad;
    }


    // CONDICIONAL_SI
    @Override
    public T visitCondicional_si(GrammarParser.Condicional_siContext ctx){
        String Condicional_siTrad = "";

        String ExpresionTrad = (String) visitExpresion(ctx.expresion());
        Condicional_siTrad = "if(" + Condicional_siTrad + ExpresionTrad + "){ \n";
        Condicional_siTrad = Condicional_siTrad + (String) visitBloque_si(ctx.bloque_si());

        return (T) Condicional_siTrad;
    }

    @Override
    public T visitBloque_si(GrammarParser.Bloque_siContext ctx){
        String Bloque_siTrad = "";

        ComandoShift = ComandoShift + "\t";
        int numCom = ctx.comando().size();
        for(int i = 0; i < numCom; i++){
            Bloque_siTrad = Bloque_siTrad + (String) visitComando(ctx.comando().get(i)) + "\n";
        }
        Bloque_siTrad = Bloque_siTrad + (String) visitBloque_sino(ctx.bloque_sino());

        return (T) Bloque_siTrad;
    }

    @Override
    public T visitBloque_sino(GrammarParser.Bloque_sinoContext ctx){
        String Bloque_sinoTrad = "";

        ComandoShift = ComandoShift.substring(1);
        if(ctx.SINO() != null) {
            Bloque_sinoTrad = ComandoShift + "}else{ \n";

            ComandoShift = ComandoShift + "\t";
            int numCom = ctx.comando().size();
            for(int i = 0; i < numCom; i++){
                Bloque_sinoTrad = Bloque_sinoTrad + (String) visitComando(ctx.comando().get(i)) + "\n";
            }
            ComandoShift = ComandoShift.substring(1);
        }
        Bloque_sinoTrad = Bloque_sinoTrad + ComandoShift + "}";

        return (T) Bloque_sinoTrad;
    }


    //EXPRESION
    @Override
    public T visitLlamada_subproceso(GrammarParser.Llamada_subprocesoContext ctx){
        String Llamada_subprocesoTrad = "";
        if(ctx.TOKEN_PAR_IZQ() != null) {
            Llamada_subprocesoTrad = Llamada_subprocesoTrad + "(";
            if(ctx.expresion() != null){
                int numExpr = ctx.expresion().size();
                for(int i = 0; i < numExpr; i++){
                    Llamada_subprocesoTrad = Llamada_subprocesoTrad + (String) visitExpresion(ctx.expresion().get(i));
                    if(i != numExpr - 1){
                        Llamada_subprocesoTrad = Llamada_subprocesoTrad + ",";
                    }
                }
            }
            Llamada_subprocesoTrad = Llamada_subprocesoTrad + ")";
        }
        return (T) Llamada_subprocesoTrad;
    }

    @Override
    public T visitLlamada_dimension(GrammarParser.Llamada_dimensionContext ctx){
        String Llamada_dimensionTrad = "";
        Llamada_dimensionTrad = Llamada_dimensionTrad + "[";
        int numExpr = ctx.expresion().size();
        for(int i = 0; i < numExpr; i++){
            Llamada_dimensionTrad = Llamada_dimensionTrad + (String) visitExpresion(ctx.expresion().get(i));
            if(i != numExpr - 1){
                Llamada_dimensionTrad = Llamada_dimensionTrad + "][";
            }
        }
        Llamada_dimensionTrad = Llamada_dimensionTrad + "]";

        return (T) Llamada_dimensionTrad;
    }

    @Override
    public T visitExpresion(GrammarParser.ExpresionContext ctx){
        String ExpresionTrad = (String) visitLogOrExpr(ctx.logOrExpr());
        return (T) ExpresionTrad;
    }

    @Override
    public T visitLogOrExpr(GrammarParser.LogOrExprContext ctx){
        String LogOrExprTrad = "";

        LogOrExprTrad = (String) visitLogAndExpr(ctx.logAndExpr());
        LogOrExprTrad = LogOrExprTrad + (String) visitLogOrExpr1(ctx.logOrExpr1());

        return (T) LogOrExprTrad;
    }

    @Override
    public T visitLogOrExpr1(GrammarParser.LogOrExpr1Context ctx){
        String LogOrExpr1Trad = "";
        if((ctx.TOKEN_O() != null) || (ctx.O() != null)) {
            LogOrExpr1Trad = " || ";
            LogOrExpr1Trad = LogOrExpr1Trad + (String) visitLogAndExpr(ctx.logAndExpr());
            LogOrExpr1Trad = LogOrExpr1Trad + (String) visitLogOrExpr1(ctx.logOrExpr1());
        }
        return (T) LogOrExpr1Trad;
    }

    @Override
    public T visitLogAndExpr(GrammarParser.LogAndExprContext ctx){
        String LogAndExprTrad = "";

        LogAndExprTrad = (String) visitEquExpr(ctx.equExpr());
        LogAndExprTrad = LogAndExprTrad + (String) visitLogAndExpr1(ctx.logAndExpr1());

        return (T) LogAndExprTrad;
    }

    @Override
    public T visitLogAndExpr1(GrammarParser.LogAndExpr1Context ctx){
        String LogAndExpr1Trad = "";
        if((ctx.TOKEN_Y() != null) || (ctx.Y() != null)) {
            LogAndExpr1Trad = " && ";
            LogAndExpr1Trad = LogAndExpr1Trad + (String) visitEquExpr(ctx.equExpr());
            LogAndExpr1Trad = LogAndExpr1Trad + (String) visitLogAndExpr1(ctx.logAndExpr1());
        }
        return (T) LogAndExpr1Trad;
    }

    @Override
    public T visitEquExpr(GrammarParser.EquExprContext ctx){
        String EquExprTrad = "";

        EquExprTrad = (String) visitRelExpr(ctx.relExpr());
        EquExprTrad = EquExprTrad + (String) visitEquExpr1(ctx.equExpr1());

        return (T) EquExprTrad;
    }

    @Override
    public T visitEquExpr1(GrammarParser.EquExpr1Context ctx){
        String EquExpr1Trad = "";
        if(ctx.operEqu() != null) {
            EquExpr1Trad = (String) visitOperEqu(ctx.operEqu());
            EquExpr1Trad = EquExpr1Trad + (String) visitRelExpr(ctx.relExpr());
            EquExpr1Trad = EquExpr1Trad + (String) visitEquExpr1(ctx.equExpr1());
        }
        return (T) EquExpr1Trad;
    }

    @Override
    public T visitRelExpr(GrammarParser.RelExprContext ctx){
        String RelExprTrad = "";

        RelExprTrad = (String) visitAddExpr(ctx.addExpr());
        RelExprTrad = RelExprTrad + (String) visitRelExpr1(ctx.relExpr1());

        return (T) RelExprTrad;
    }

    @Override
    public T visitRelExpr1(GrammarParser.RelExpr1Context ctx){
        String RelExpr1Trad = "";
        if(ctx.operRel() != null) {
            RelExpr1Trad = (String) visitOperRel(ctx.operRel());
            RelExpr1Trad = RelExpr1Trad + (String) visitAddExpr(ctx.addExpr());
            RelExpr1Trad = RelExpr1Trad + (String) visitRelExpr1(ctx.relExpr1());
        }
        return (T) RelExpr1Trad;
    }

    @Override
    public T visitAddExpr(GrammarParser.AddExprContext ctx){
        String AddExprTrad = "";

        AddExprTrad = (String) visitMulExpr(ctx.mulExpr());
        AddExprTrad = AddExprTrad + (String) visitAddExpr1(ctx.addExpr1());

        return (T) AddExprTrad;
    }

    @Override
    public T visitAddExpr1(GrammarParser.AddExpr1Context ctx){
        String AddExpr1Trad = "";
        if(ctx.operAdd() != null) {
            AddExpr1Trad = (String) visitOperAdd(ctx.operAdd());
            AddExpr1Trad = AddExpr1Trad + (String) visitMulExpr(ctx.mulExpr());
            AddExpr1Trad = AddExpr1Trad + (String) visitAddExpr1(ctx.addExpr1());
        }
        return (T) AddExpr1Trad;
    }

    @Override
    public T visitMulExpr(GrammarParser.MulExprContext ctx){
        String MulExprTrad = "";

        MulExprTrad = (String) visitExpExpr(ctx.expExpr());
        MulExprTrad = MulExprTrad + (String) visitMulExpr1(ctx.mulExpr1());

        return (T) MulExprTrad;
    }

    @Override
    public T visitMulExpr1(GrammarParser.MulExpr1Context ctx){
        String MulExpr1Trad = "";
        if(ctx.operMul() != null) {
            MulExpr1Trad = (String) visitOperMul(ctx.operMul());
            MulExpr1Trad = MulExpr1Trad + (String) visitExpExpr(ctx.expExpr());
            MulExpr1Trad = MulExpr1Trad + (String) visitMulExpr1(ctx.mulExpr1());
        }
        return (T) MulExpr1Trad;
    }

    @Override
    public T visitExpExpr(GrammarParser.ExpExprContext ctx){
        String ExpExprTrad = "";

        ExpExpr1Th = (String) visitPr(ctx.pr());
        ExpExprTrad = (String) visitExpExpr1(ctx.expExpr1());

        return (T) ExpExprTrad;
    }

    @Override
    public T visitExpExpr1(GrammarParser.ExpExpr1Context ctx){
        String ExpExpr1Trad = "";

        if(ctx.operExp() != null) {
            ExpExpr1Th = "pow(" + ExpExpr1Th + "," + (String) visitPr(ctx.pr()) + ")";
            ExpExpr1Trad = (String) visitExpExpr1(ctx.expExpr1());
        }else{
            ExpExpr1Trad = ExpExpr1Th;
        }

        return (T) ExpExpr1Trad;
    }

    @Override
    public T visitOperMul(GrammarParser.OperMulContext ctx){
        String OperMulTrad = "";

        if(ctx.TOKEN_MUL() != null){
            OperMulTrad = "*";
        }else if(ctx.TOKEN_DIV() != null){
            OperMulTrad = "/";
        }else{
            OperMulTrad = " % ";
        }

        return (T) OperMulTrad;
    }

    @Override
    public T visitOperAdd(GrammarParser.OperAddContext ctx){
        String OperAddTrad = "";

        if(ctx.TOKEN_MAS() != null){
            OperAddTrad = " + ";
        }else {
            OperAddTrad = " - ";
        }

        return (T) OperAddTrad;
    }

    @Override
    public T visitOperRel(GrammarParser.OperRelContext ctx){
        String OperRelTrad = "";

        if(ctx.TOKEN_MENOR() != null){
            OperRelTrad = " < ";
        }else if(ctx.TOKEN_MAYOR() != null){
            OperRelTrad = " > ";
        }else if(ctx.TOKEN_MENOR_IGUAL() != null){
            OperRelTrad = " <= ";
        }else{
            OperRelTrad = " >= ";
        }

        return (T) OperRelTrad;
    }

    @Override
    public T visitOperEqu(GrammarParser.OperEquContext ctx){
        String OperEquTrad = "";

        if(ctx.TOKEN_IGUAL() != null){
            OperEquTrad = " == ";
        }else {
            OperEquTrad = " != ";
        }

        return (T) OperEquTrad;
    }

    @Override
    public T visitPr(GrammarParser.PrContext ctx){
        String PrTrad = "";

        if(ctx.FALSO() != null){
            PrTrad = "false";
        }else if(ctx.VERDADERO() != null){
            PrTrad = "true";
        }else if(ctx.TOKEN_ENTERO() != null){
            PrTrad = ctx.TOKEN_ENTERO().getText();
        }else if(ctx.TOKEN_REAL() != null){
            PrTrad = ctx.TOKEN_REAL().getText();
        }else if(ctx.TOKEN_CADENA() != null){
            PrTrad = ctx.TOKEN_CADENA().getText();
        }else if(ctx.TOKEN_ID() != null){
            String Expresion_llamadaTrad = (String) visitExpresion_llamada(ctx.expresion_llamada());
            PrTrad = ctx.TOKEN_ID().getText() + Expresion_llamadaTrad;
        }else if(ctx.TOKEN_MENOS() != null){
            PrTrad = "-" + (String) visitPr(ctx.pr());
        }else if(ctx.TOKEN_NEG() != null){
            PrTrad = "!" + (String) visitPr(ctx.pr());
        }else if(ctx.NO() != null){
            PrTrad = "!" + (String) visitPr(ctx.pr());
        }else if(ctx.TOKEN_PAR_IZQ() != null){
            PrTrad = "(" + (String) visitExpresion(ctx.expresion()) + ")";
        }
        return (T) PrTrad;
    }

    @Override
    public T visitExpresion_llamada(GrammarParser.Expresion_llamadaContext ctx){
        String Expresion_llamadaTrad = "";
        if(ctx.llamada_subproceso() != null){
            Expresion_llamadaTrad = (String) visitLlamada_subproceso(ctx.llamada_subproceso());
        }else{
            Expresion_llamadaTrad = (String) visitLlamada_dimension(ctx.llamada_dimension());
        }
        return (T) Expresion_llamadaTrad;
    }

}