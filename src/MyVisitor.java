import java.util.ArrayList;
import java.util.HashMap;

public class MyVisitor<T> extends GrammarBaseVisitor<T> {

    HashMap <String, HashMap <String, ArrayList<String>>> funArg = new HashMap<>();
    HashMap <String, HashMap <String, String>> funReturn = new HashMap<>();
    HashMap <String, HashMap <String, String>> funVar = new HashMap<>();
    ArrayList<String> tokensExpresionActual = new ArrayList<>();

    String procesoActual = "";
    boolean traduccion = false;
    String ComandoShift = "\t";

    String ExpExpr1Th = "";
    String Ciclo_para1Th = "";
    String SubProcesoTh = "";
    String Llamada_subproceso1Th = "";

    public String getTipoExpresion(){
        String tipo = "";

        int index = tokensExpresionActual.size() - 1;
        if(tokensExpresionActual.get(index).contains("OpBool") || tokensExpresionActual.get(index).contains("bool") || tokensExpresionActual.get(index).contains("bool*")){
            tipo += "bool";
        }else if(tokensExpresionActual.get(index).contains("float") || tokensExpresionActual.get(index).contains("OpDiv") || tokensExpresionActual.get(index).contains("float*")){
            tipo += "float";
        }else if(tokensExpresionActual.get(index).contains("cadena") || tokensExpresionActual.get(index).contains("cadena*")){
            tipo += "cadena";
        }else{
            tipo += "int";
        }
        return tipo;
    }

    @Override
    public T visitPrograma(GrammarParser.ProgramaContext ctx){
        String ProgramaTrad = "";

        ProgramaTrad += "#include <stdio.h>\n";
        ProgramaTrad += "#include <unistd.h>\n";
        ProgramaTrad += "#include <stdbool.h>\n";
        ProgramaTrad += "#include <math.h>\n\n";

        // PRIMER RECORRIDO DEL ARBOL
        for (int i = 0; i < ctx.subproceso().size(); i++){
            visitSubproceso(ctx.subproceso(i));
        }
        visitProceso(ctx.proceso());

        traduccion = true;

        // SEGUNDO RECORRIDO DEL ARBOL
        for (int i = 0; i < ctx.subproceso().size(); i++){
            ProgramaTrad += (String) visitSubproceso(ctx.subproceso(i));
        }
        ProgramaTrad += (String) visitProceso(ctx.proceso());
        System.out.print(ProgramaTrad);
        return null;
    }

    @Override
    public T visitSubproceso(GrammarParser.SubprocesoContext ctx) {
        String SubprocesoTrad = "";

        procesoActual = ctx.TOKEN_ID().getText();
        visitFirma(ctx.firma());

        if(traduccion){
            SubProcesoTh = "";
            for(int i = 0; i < ctx.comando().size(); i++){
                SubProcesoTh += (String) visitComando(ctx.comando().get(i)) + "\n";
            }
            procesoActual = ctx.TOKEN_ID().getText();
            SubprocesoTrad += (String) visitFirma(ctx.firma());

        }else{
            for(int i = 0; i < ctx.comando().size(); i++){
                visitComando(ctx.comando().get(i));
            }
        }

        return (T) SubprocesoTrad;
    }

    @Override
    public T visitFirma(GrammarParser.FirmaContext ctx) {
        String FirmaTrad = "";

        if(traduccion){
            String varReturn = "";
            if(ctx.TOKEN_ID() != null) {
                varReturn = procesoActual;
                procesoActual = ctx.TOKEN_ID().getText();
            }

            int numClones = 0;
            if(funArg.get(procesoActual).get("0") != null){
                numClones += funArg.get(procesoActual).get("0").size();
            }else if(ctx.argumentos() != null && ctx.argumentos().TOKEN_ID().size() == 0){
                numClones += 1;
            }else if(ctx.argumentos() == null){
                numClones += 1;
            }

            // IMPRESION DE CLONES
            for(int i = 0; i < numClones; i++){
                if(ctx.TOKEN_ID() != null) {
                    FirmaTrad += funVar.get(procesoActual).get(varReturn) + " ";
                }else {
                    FirmaTrad += "void ";
                }
                FirmaTrad += procesoActual + "_" + Integer.toString(i) + "(";

                if(ctx.argumentos() != null) {
                    int numVar = ctx.argumentos().TOKEN_ID().size();
                    for(int j = 0; j < numVar; j++){
                        FirmaTrad += funArg.get(procesoActual).get(Integer.toString(j)).get(i) + " ";
                        FirmaTrad += ctx.argumentos().TOKEN_ID().get(j).getText();
                        if(j != numVar - 1){
                            FirmaTrad += ",";
                        }
                    }
                }

                if(varReturn.equals("")) {
                    FirmaTrad += "){\n" + SubProcesoTh + "}\n";
                }else{
                    FirmaTrad += "){\n" + SubProcesoTh + "\treturn " + varReturn + ";\n" + "}\n";
                }
            }

        }else{
            String varReturn = "";
            if(ctx.TOKEN_ID() != null) {
                varReturn = procesoActual;
                procesoActual = ctx.TOKEN_ID().getText();
            }

            if (funVar.get(procesoActual) == null) {
                funReturn.put(procesoActual, new HashMap<>());
                funArg.put(procesoActual, new HashMap<>());
                funVar.put(procesoActual, new HashMap<>());
                funReturn.get(procesoActual).put(varReturn, "");
            }
        }
        return (T) FirmaTrad;
    }


    @Override
    public T visitProceso(GrammarParser.ProcesoContext ctx) {
        String ProcesoTrad = "";

        if(traduccion) {
            ProcesoTrad += "int main(){\n";
            for (int i = 0; i < ctx.comando().size(); i++) {
                ProcesoTrad += (String) visitComando(ctx.comando(i));
            }
            ProcesoTrad += "\n\treturn 0\n}\n";
        }else{
            for (int i = 0; i < ctx.comando().size(); i++) {
                visitComando(ctx.comando(i));
            }
        }

        return (T) ProcesoTrad;
    }


    // COMANDO
    @Override
    public T visitComando(GrammarParser.ComandoContext ctx){
        String ComandoTrad = ComandoShift;

        if(ctx.declaracion() != null){
            ComandoTrad += (String) visitDeclaracion(ctx.declaracion());
        }else if(ctx.asignacion() != null){
            ComandoTrad += (String) visitAsignacion(ctx.asignacion());
        }else if(ctx.dimension() != null){
            ComandoTrad += (String) visitDimension(ctx.dimension());
        }else if(ctx.condicional_si() != null){
            ComandoTrad += (String) visitCondicional_si(ctx.condicional_si());
        }else if(ctx.ciclo_para() != null){
            ComandoTrad += (String) visitCiclo_para(ctx.ciclo_para());
        }else if(ctx.ciclo_mientras() != null){
            ComandoTrad += (String) visitCiclo_mientras(ctx.ciclo_mientras());
        }else if(ctx.ciclo_repetir() != null){
            ComandoTrad += (String) visitCiclo_repetir(ctx.ciclo_repetir());
        }else if(ctx.segun() != null){
            ComandoTrad += (String) visitSegun(ctx.segun());
        }else if(ctx.comando_especial() != null){
            ComandoTrad += (String) visitComando_especial(ctx.comando_especial());
        }

        return (T) ComandoTrad;
    }


    // DECLARACION
    @Override
    public T visitDeclaracion(GrammarParser.DeclaracionContext ctx) {
        String DeclaracionTrad = "";

        if(traduccion){
            String tipoTrad = (String) visitTipo(ctx.tipo());
            String listaVar = "";
            boolean coma = false;

            for(int i = 0; i < ctx.TOKEN_ID().size(); i++){
                String tipoA = funVar.get(procesoActual).get(ctx.TOKEN_ID(i).getText());
                if(tipoA.charAt(tipoA.length() - 1) != '*'){
                    if (coma) {
                        listaVar += ",";
                    }
                    coma = true;
                    listaVar += (String) ctx.TOKEN_ID(i).getText();
                    if(tipoTrad.equals("cadena")){
                        listaVar += "[1000]";
                    }
                }
            }

            if(listaVar.length() != 0){
                if(tipoTrad.equals("cadena")){
                    tipoTrad = "char";
                }
                DeclaracionTrad = tipoTrad + " " + listaVar + ";";
            }
        }else{
            String tipoTrad = (String) visitTipo(ctx.tipo());
            for (int i = 0; i < ctx.TOKEN_ID().size(); i++) {
                if(funVar.get(procesoActual).get(ctx.TOKEN_ID(i).getText()) == null) {
                    funVar.get(procesoActual).put(ctx.TOKEN_ID(i).getText(), tipoTrad);
                }
                if(funReturn.get(procesoActual).get(ctx.TOKEN_ID(i).getText()) != null){
                    funReturn.get(procesoActual).put(ctx.TOKEN_ID(i).getText(), tipoTrad);
                }
            }
        }
        return (T) DeclaracionTrad;
    }

    @Override
    public T visitTipo(GrammarParser.TipoContext ctx) {
        String TipoTrad = "";

        if(ctx.NUMERICO() != null || ctx.NUMERO() != null || ctx.REAL() != null){
            TipoTrad += "float";
        }else if (ctx.CADENA() != null || ctx.TEXTO() != null){
            TipoTrad = "cadena";
        }else if (ctx.CARACTER() != null){
            TipoTrad += "char";
        }else if (ctx.ENTERO() != null){
            TipoTrad += "int";
        }else if (ctx.LOGICO() != null){
            TipoTrad = "bool";
        }

        return (T) TipoTrad;
    }


    // ASIGNACION
    @Override
    public T visitAsignacion(GrammarParser.AsignacionContext ctx){
        String AsignacionTrad = "";

        Llamada_subproceso1Th = ctx.TOKEN_ID().getText();
        AsignacionTrad += (String) visitAsignacion1(ctx.asignacion1());

        return (T) AsignacionTrad;
    }

    @Override
    public T visitAsignacion1(GrammarParser.Asignacion1Context ctx){
        String Asignacion1Trad = "";

        if(ctx.llamada_dimension() != null){
            Asignacion1Trad += Llamada_subproceso1Th;
            Asignacion1Trad += (String) visitLlamada_dimension(ctx.llamada_dimension());
            Asignacion1Trad += " = ";
            Asignacion1Trad += (String) visitExpresion(ctx.expresion()) + ";";
        }else if(ctx.llamada_subproceso() != null){

            int numClon = 0;
            if(traduccion) {
                if (funArg.get(Llamada_subproceso1Th).get("0") != null) {
                    for (int i = 0; i < funArg.get(Llamada_subproceso1Th).get("0").size(); i++) {
                        String tipo = funArg.get(Llamada_subproceso1Th).get("0").get(i);
                        if (tipo.charAt(tipo.length() - 1) != 'r') {
                            funArg.get(Llamada_subproceso1Th).get("0").set(i, tipo + "r");
                            break;
                        }
                        numClon++;
                    }
                }
            }

            Asignacion1Trad += Llamada_subproceso1Th + "_" + Integer.toString(numClon);
            String Llamada_subprocesoTrad = (String) visitLlamada_subproceso(ctx.llamada_subproceso());
            if(Llamada_subprocesoTrad.equals("")){
                Asignacion1Trad += "()";
            }
            Asignacion1Trad += Llamada_subprocesoTrad + ";";
        }else{
            Asignacion1Trad += Llamada_subproceso1Th;
            Asignacion1Trad += " = ";
            Asignacion1Trad += (String) visitExpresion(ctx.expresion()) + ";";
        }

        return (T) Asignacion1Trad;
    }


    // Llamada
    @Override
    public T visitLlamada_subproceso(GrammarParser.Llamada_subprocesoContext ctx){
        String Llamada_subprocesoTrad = "";

        if(traduccion){
            if(ctx.TOKEN_PAR_IZQ() != null){
                Llamada_subprocesoTrad += "(";
                for(int i = 0; i < ctx.logOrExpr().size(); i++){
                    Llamada_subprocesoTrad += (String) visitLogOrExpr(ctx.logOrExpr().get(i));
                    if(i != ctx.logOrExpr().size() - 1){
                        Llamada_subprocesoTrad += ",";
                    }
                }
                Llamada_subprocesoTrad += ")";
            }
        }else{
            String nomSubProceso = Llamada_subproceso1Th;
            for (int i = 0; i < ctx.logOrExpr().size(); i++) {
                visitLogOrExpr(ctx.logOrExpr().get(i));
                if (funArg.get(nomSubProceso).get(Integer.toString(i)) == null) {
                    funArg.get(nomSubProceso).put(Integer.toString(i), new ArrayList<>());
                }
                funArg.get(nomSubProceso).get(Integer.toString(i)).add(getTipoExpresion());

                int index = tokensExpresionActual.size() - 1;
                tokensExpresionActual.remove(index);
            }
        }

        return (T) Llamada_subprocesoTrad;
    }

    @Override
    public T visitLlamada_dimension(GrammarParser.Llamada_dimensionContext ctx){
        String Llamada_dimensionTrad = "";

        Llamada_dimensionTrad += "[";
        for(int i = 0; i < ctx.logOrExpr().size(); i++){
            Llamada_dimensionTrad += (String) visitLogOrExpr(ctx.logOrExpr().get(i));
            if(i != ctx.logOrExpr().size() - 1){
                Llamada_dimensionTrad += "][";
            }
            int index = tokensExpresionActual.size() - 1;
            tokensExpresionActual.remove(index);
        }
        Llamada_dimensionTrad += "]";

        return (T) Llamada_dimensionTrad;
    }


    // DIMENSION
    @Override
    public T visitDimension(GrammarParser.DimensionContext ctx){
        String DimensionTrad = "";

        if(traduccion){
            for (int i = 0; i < ctx.TOKEN_ID().size(); i++) {
                String tipoA = funVar.get(procesoActual).get(ctx.TOKEN_ID().get(i).getText());
                if(tipoA.equals("cadena*")){
                    tipoA = "char*";
                }

                DimensionTrad +=  tipoA.substring(0, tipoA.length() - 1) + " ";
                DimensionTrad += ctx.TOKEN_ID(i);
                DimensionTrad += (String) visitLlamada_dimension(ctx.llamada_dimension().get(i)) + ";\n";
            }
        }else{
            for (int i = 0; i < ctx.TOKEN_ID().size(); i++) {
                String Id = ctx.TOKEN_ID().get(i).getText();
                if(funVar.get(procesoActual).get(Id) != null){
                    funVar.get(procesoActual).put(Id, funVar.get(procesoActual).get(Id) + "*");
                }else{
                    System.out.print("Error semantico - No se ha declarado el tipo de la variable\n");
                }
            }
        }
        return (T) DimensionTrad;
    }


    // CONDICIONAL_SI
    @Override
    public T visitCondicional_si(GrammarParser.Condicional_siContext ctx){
        String Condicional_siTrad = "";

        String ExpresionTrad = (String) visitExpresion(ctx.expresion());
        Condicional_siTrad = "if(" + Condicional_siTrad + ExpresionTrad + "){ \n";
        Condicional_siTrad += (String) visitBloque_si(ctx.bloque_si());

        return (T) Condicional_siTrad;
    }

    @Override
    public T visitBloque_si(GrammarParser.Bloque_siContext ctx){
        String Bloque_siTrad = "";

        ComandoShift = ComandoShift + "\t";
        for(int i = 0; i < ctx.comando().size(); i++){
            Bloque_siTrad += (String) visitComando(ctx.comando(i)) + "\n";
        }
        Bloque_siTrad += (String) visitBloque_sino(ctx.bloque_sino());

        return (T) Bloque_siTrad;
    }

    @Override
    public T visitBloque_sino(GrammarParser.Bloque_sinoContext ctx){
        String Bloque_sinoTrad = "";

        ComandoShift = ComandoShift.substring(1);
        if(ctx.SINO() != null) {
            Bloque_sinoTrad += ComandoShift + "}else{ \n";
            ComandoShift = ComandoShift + "\t";
            for(int i = 0; i < ctx.comando().size(); i++){
                Bloque_sinoTrad += (String) visitComando(ctx.comando(i)) + "\n";
            }
            ComandoShift = ComandoShift.substring(1);
        }
        Bloque_sinoTrad += ComandoShift + "}";

        return (T) Bloque_sinoTrad;
    }


    // CICLO_PARA
    @Override
    public T visitCiclo_para(GrammarParser.Ciclo_paraContext ctx){
        String Ciclo_paraTrad = "";

        Ciclo_para1Th = ctx.TOKEN_ID().getText();
        Ciclo_paraTrad += "for(int " + Ciclo_para1Th + " = " + (String) visitExpresion(ctx.expresion().get(0)) + "; ";
        Ciclo_paraTrad += Ciclo_para1Th + " < " + (String) visitExpresion(ctx.expresion().get(1)) + "; ";
        Ciclo_paraTrad += (String) visitCiclo_para1(ctx.ciclo_para1());

        return (T) Ciclo_paraTrad;
    }

    @Override
    public T visitCiclo_para1(GrammarParser.Ciclo_para1Context ctx){
        String Ciclo_para1Trad = "";

        if(ctx.CON() != null){
            Ciclo_para1Trad += Ciclo_para1Th + " = " + Ciclo_para1Th + " + " + (String) visitExpresion(ctx.expresion()) + "){ \n";
        }else{
            Ciclo_para1Trad += Ciclo_para1Th + "++){ \n";
        }
        Ciclo_para1Trad += (String) visitBloque_para(ctx.bloque_para());

        return (T) Ciclo_para1Trad;
    }

    @Override
    public T visitBloque_para(GrammarParser.Bloque_paraContext ctx){
        String Bloque_paraTrad = "";

        ComandoShift = ComandoShift + "\t";
        for(int i = 0; i < ctx.comando().size(); i++){
            Bloque_paraTrad += (String) visitComando(ctx.comando().get(i)) + "\n";
        }
        ComandoShift = ComandoShift.substring(1);
        Bloque_paraTrad += ComandoShift + "}";

        return (T) Bloque_paraTrad;
    }


    // CICLO_MIENTRAS
    @Override
    public T visitCiclo_mientras(GrammarParser.Ciclo_mientrasContext ctx){
        String Ciclo_mientrasTrad = "";

        String ExpresionTrad = (String) visitExpresion(ctx.expresion());
        Ciclo_mientrasTrad += "while(" + ExpresionTrad + "){ \n";
        Ciclo_mientrasTrad += (String) visitBloque_mientras(ctx.bloque_mientras());

        return (T) Ciclo_mientrasTrad;
    }

    @Override
    public T visitBloque_mientras(GrammarParser.Bloque_mientrasContext ctx){
        String Bloque_mientrasTrad = "";

        ComandoShift = ComandoShift + "\t";
        for(int i = 0; i < ctx.comando().size(); i++){
            Bloque_mientrasTrad += (String) visitComando(ctx.comando(i)) + "\n";
        }
        ComandoShift = ComandoShift.substring(1);
        Bloque_mientrasTrad += ComandoShift + "}";

        return (T) Bloque_mientrasTrad;
    }


    // REPETIR
    @Override
    public T visitCiclo_repetir(GrammarParser.Ciclo_repetirContext ctx) {
        String Ciclo_repetirTrad = "";

        Ciclo_repetirTrad += "do{\n";
        Ciclo_repetirTrad += (String) visitBloque_repetir(ctx.bloque_repetir());

        return (T) Ciclo_repetirTrad;
    }

    @Override
    public T visitBloque_repetir(GrammarParser.Bloque_repetirContext ctx) {
        String Bloque_repetirTrad = "";

        ComandoShift = ComandoShift + "\t";
        for (int i = 0; i < ctx.comando().size(); i++) {
            Bloque_repetirTrad += (String) visitComando(ctx.comando(i)) + "\n";
        }
        ComandoShift = ComandoShift.substring(1);
        Bloque_repetirTrad += ComandoShift + "}while(";
        Bloque_repetirTrad += (String) visitExpresion(ctx.expresion());
        Bloque_repetirTrad += ");";

        return (T) Bloque_repetirTrad;
    }


    // Segun
    @Override
    public T visitSegun(GrammarParser.SegunContext ctx) {
        String SegunTrad = "";

        SegunTrad += "Switch(";
        SegunTrad += (String) visitExpresion(ctx.expresion());
        SegunTrad += "){\n";
        SegunTrad += (String) visitBloque_segun(ctx.bloque_segun());

        return (T) SegunTrad;
    }

    @Override
    public T visitBloque_segun(GrammarParser.Bloque_segunContext ctx) {
        String Bloque_segunTrad = "";

        ComandoShift = ComandoShift + "\t";
        for (int i = 0; i < ctx.expresion().size(); i++) {
            Bloque_segunTrad += ComandoShift + "case ";
            Bloque_segunTrad += (String) visitExpresion(ctx.expresion(i));
            Bloque_segunTrad += ":\n";
            ComandoShift = ComandoShift + "\t";
            for (int j = 0; j < ctx.comando().size(); j++) {
                Bloque_segunTrad += (String) visitComando(ctx.comando(j)) + "\n";
                if (j == ctx.comando().size() - 1) {
                    Bloque_segunTrad += ComandoShift + "break;\n";
                    ComandoShift = ComandoShift.substring(1);
                }
            }
        }
        Bloque_segunTrad += (String) visitFinsegun(ctx.finsegun());

        return (T) Bloque_segunTrad;
    }

    @Override
    public T visitFinsegun(GrammarParser.FinsegunContext ctx) {
        String FinsegunTrad = "";

        if (ctx.DE() != null){
            FinsegunTrad += ComandoShift + "default :\n";
            ComandoShift = ComandoShift + "\t";
            for (int i = 0; i < ctx.comando().size(); i++){
                FinsegunTrad += (String) visitComando(ctx.comando(i)) + "\n";
                if(i == ctx.comando().size()-1) {
                    FinsegunTrad += ComandoShift + "break;\n";
                    ComandoShift = ComandoShift.substring(1);
                }
            }
        }
        ComandoShift = ComandoShift.substring(1);
        FinsegunTrad += ComandoShift + "}";

        return (T) FinsegunTrad;
    }


    // COMANDO ESPECIAL
    @Override
    public T visitComando_especial(GrammarParser.Comando_especialContext ctx) {
        String Comando_especialTrad = "";

        if(ctx.BORRAR() != null || ctx.LIMPIAR() != null) {
            Comando_especialTrad = "system(\"@cls||clear\");\n";
        } else if (ctx.esperar() != null) {
            Comando_especialTrad = (String) visitEsperar(ctx.esperar());
        }else if (ctx.leer() != null) {
            Comando_especialTrad = (String) visitLeer(ctx.leer());
        } else {
            Comando_especialTrad = (String) visitEscribir(ctx.escribir());
        }

        return (T) Comando_especialTrad;
    }


    // ESCRIBIR
    @Override
    public T visitEscribir(GrammarParser.EscribirContext ctx){
        String EscribirTrad = "";

        String listaTipos = "";
        String listaVar = "";

        for (int i = 0; i < ctx.expresion().size(); i++){
            String ExpresionTrad = (String) visitExpresion(ctx.expresion().get(i));
            listaVar += ExpresionTrad;
            if(i != ctx.expresion().size() - 1){
                listaVar += ",";
            }

            String tipo = getTipoExpresion();
            if(tipo.equals("bool") || tipo.equals("int")) {
                listaTipos += "%d";
            }else if(tipo.equals("float")){
                listaTipos += "%f";
            }else{
                listaTipos += "%s";
            }
        }
        EscribirTrad += "printf(\"";
        EscribirTrad += listaTipos;
        EscribirTrad += "\", ";
        EscribirTrad += listaVar + ");";

        return (T) EscribirTrad;
    }


    // ESPERAR
    @Override
    public T visitEsperar(GrammarParser.EsperarContext ctx) {
        return visitEsperar1(ctx.esperar1());
    }

    @Override
    public T visitEsperar1(GrammarParser.Esperar1Context ctx) {
        String Esperar1Trad = "";

        if(ctx.TECLA() != null) {
            Esperar1Trad += "getchar();\n";
        }else if (ctx.expresion() != null) {
            Esperar1Trad = "sleep(("+ctx.expresion()+")";
            Esperar1Trad += (String) visitMedida(ctx.medida());
            Esperar1Trad += ");\n";
        }

        return (T) Esperar1Trad;
    }

    @Override
    public T visitMedida(GrammarParser.MedidaContext ctx) {
        String MedidaTrad = "";
        if (ctx.MILISEGUNDOS() != null){
            MedidaTrad += "/1000";
        }
        return (T) MedidaTrad;
    }


    // Leer
    @Override
    public T visitLeer(GrammarParser.LeerContext ctx){
        String LeerTrad = "";

        if(traduccion) {
            LeerTrad += (String) visitLista_leer_id(ctx.lista_leer_id());
        }
        return (T) LeerTrad;
    }

    @Override
    public T visitLista_leer_id(GrammarParser.Lista_leer_idContext ctx){
        String Lista_leer_idTrad = "";

        String listaTipos = "";
        String listaVar = "";
        String varBool1 = "";
        String varBool2 = "";

        for (int i = 0; i < ctx.TOKEN_ID().size(); i++) {
            String Llamada_dimensionTrad = (String) visitLista_leer_id1(ctx.lista_leer_id1(i));
            String Id = ctx.TOKEN_ID(i).getText();

            String tipo = funVar.get(procesoActual).get(Id);
            if(tipo.equals("int") || tipo.equals("int*")){
                listaTipos += "%d";
            }else if(tipo.equals("char") || tipo.equals("char*")){
                listaTipos += "%c";
            }else if(tipo.equals("float") || tipo.equals("float*")){
                listaTipos += "%f";
            }else if(tipo.equals("cadena") || tipo.equals("cadena*")){
                listaTipos += "%s";
            }else if(tipo.equals("bool") || tipo.equals("bool*")){
                varBool1 += "int " + Id + "Int = " + Id + Llamada_dimensionTrad + ";\n" + ComandoShift;
                varBool2 += ComandoShift + Id + Llamada_dimensionTrad + " = " + Id + "Int" + "; \n";
                listaTipos += "%d";
            }

            if(tipo.charAt(tipo.length() - 1) == '*' && Llamada_dimensionTrad.length() == 0){
                System.out.print("Error semantico - no se definido la posición del arreglo\n");
            }else if(tipo.charAt(tipo.length() - 1) != '*' && Llamada_dimensionTrad.length() != 0){
                    System.out.print("Error semantico - la variable no es un arreglo\n");
            }else{
                if(tipo.equals("bool") || tipo.equals("bool*")){
                    listaVar += " &" + Id + "Int";
                }else{
                    listaVar += " &" + Id + Llamada_dimensionTrad;
                }
            }

            if(i != ctx.TOKEN_ID().size() - 1){
                listaVar += ",";
            }
        }

        Lista_leer_idTrad += varBool1;
        Lista_leer_idTrad += "scanf(\"";
        Lista_leer_idTrad += listaTipos;
        Lista_leer_idTrad += "\",";
        Lista_leer_idTrad += listaVar;
        Lista_leer_idTrad += "); \n";
        Lista_leer_idTrad += varBool2;

        return (T) Lista_leer_idTrad;
    }

    @Override
    public T visitLista_leer_id1(GrammarParser.Lista_leer_id1Context ctx){
        String Lista_leer_id1Trad = "";

        if(ctx.llamada_dimension() != null){
            Lista_leer_id1Trad += (String) visitLlamada_dimension(ctx.llamada_dimension());
        }

        return (T) Lista_leer_id1Trad;
    }


    // EXPRESION
    @Override
    public T visitExpresion(GrammarParser.ExpresionContext ctx){
        String ExpresionTrad = (String) visitLogOrExpr(ctx.logOrExpr());
        tokensExpresionActual.clear();
        return (T) ExpresionTrad;
    }

    @Override
    public T visitLogOrExpr(GrammarParser.LogOrExprContext ctx){
        String LogOrExprTrad = "";

        tokensExpresionActual.add("");
        LogOrExprTrad += (String) visitLogAndExpr(ctx.logAndExpr());
        LogOrExprTrad += (String) visitLogOrExpr1(ctx.logOrExpr1());

        return (T) LogOrExprTrad;
    }

    @Override
    public T visitLogOrExpr1(GrammarParser.LogOrExpr1Context ctx){
        String LogOrExpr1Trad = "";

        if((ctx.TOKEN_O() != null) || (ctx.O() != null)) {
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "OpBool");
            LogOrExpr1Trad += " || ";
            LogOrExpr1Trad += (String) visitLogAndExpr(ctx.logAndExpr());
            LogOrExpr1Trad += (String) visitLogOrExpr1(ctx.logOrExpr1());
        }

        return (T) LogOrExpr1Trad;
    }

    @Override
    public T visitLogAndExpr(GrammarParser.LogAndExprContext ctx){
        String LogAndExprTrad = "";

        LogAndExprTrad += (String) visitEquExpr(ctx.equExpr());
        LogAndExprTrad += (String) visitLogAndExpr1(ctx.logAndExpr1());

        return (T) LogAndExprTrad;
    }

    @Override
    public T visitLogAndExpr1(GrammarParser.LogAndExpr1Context ctx){
        String LogAndExpr1Trad = "";

        if((ctx.TOKEN_Y() != null) || (ctx.Y() != null)) {
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "OpBool");
            LogAndExpr1Trad += " && ";
            LogAndExpr1Trad += (String) visitEquExpr(ctx.equExpr());
            LogAndExpr1Trad += (String) visitLogAndExpr1(ctx.logAndExpr1());
        }

        return (T) LogAndExpr1Trad;
    }

    @Override
    public T visitEquExpr(GrammarParser.EquExprContext ctx){
        String EquExprTrad = "";

        EquExprTrad += (String) visitRelExpr(ctx.relExpr());
        EquExprTrad += (String) visitEquExpr1(ctx.equExpr1());

        return (T) EquExprTrad;
    }

    @Override
    public T visitEquExpr1(GrammarParser.EquExpr1Context ctx){
        String EquExpr1Trad = "";

        if(ctx.operEqu() != null) {
            EquExpr1Trad += (String) visitOperEqu(ctx.operEqu());
            EquExpr1Trad += (String) visitRelExpr(ctx.relExpr());
            EquExpr1Trad += (String) visitEquExpr1(ctx.equExpr1());
        }

        return (T) EquExpr1Trad;
    }

    @Override
    public T visitRelExpr(GrammarParser.RelExprContext ctx){
        String RelExprTrad = "";

        RelExprTrad += (String) visitAddExpr(ctx.addExpr());
        RelExprTrad += (String) visitRelExpr1(ctx.relExpr1());

        return (T) RelExprTrad;
    }

    @Override
    public T visitRelExpr1(GrammarParser.RelExpr1Context ctx){
        String RelExpr1Trad = "";

        if(ctx.operRel() != null) {
            RelExpr1Trad += (String) visitOperRel(ctx.operRel());
            RelExpr1Trad += (String) visitAddExpr(ctx.addExpr());
            RelExpr1Trad += (String) visitRelExpr1(ctx.relExpr1());
        }

        return (T) RelExpr1Trad;
    }

    @Override
    public T visitAddExpr(GrammarParser.AddExprContext ctx){
        String AddExprTrad = "";

        AddExprTrad += (String) visitMulExpr(ctx.mulExpr());
        AddExprTrad += (String) visitAddExpr1(ctx.addExpr1());

        return (T) AddExprTrad;
    }

    @Override
    public T visitAddExpr1(GrammarParser.AddExpr1Context ctx){
        String AddExpr1Trad = "";

        if(ctx.operAdd() != null) {
            AddExpr1Trad += (String) visitOperAdd(ctx.operAdd());
            AddExpr1Trad += (String) visitMulExpr(ctx.mulExpr());
            AddExpr1Trad += (String) visitAddExpr1(ctx.addExpr1());
        }

        return (T) AddExpr1Trad;
    }

    @Override
    public T visitMulExpr(GrammarParser.MulExprContext ctx){
        String MulExprTrad = "";

        MulExprTrad += (String) visitExpExpr(ctx.expExpr());
        MulExprTrad += (String) visitMulExpr1(ctx.mulExpr1());

        return (T) MulExprTrad;
    }

    @Override
    public T visitMulExpr1(GrammarParser.MulExpr1Context ctx){
        String MulExpr1Trad = "";

        if(ctx.operMul() != null) {
            MulExpr1Trad += (String) visitOperMul(ctx.operMul());
            MulExpr1Trad += (String) visitExpExpr(ctx.expExpr());
            MulExpr1Trad += (String) visitMulExpr1(ctx.mulExpr1());
        }

        return (T) MulExpr1Trad;
    }

    @Override
    public T visitExpExpr(GrammarParser.ExpExprContext ctx){
        String ExpExprTrad = "";

        ExpExpr1Th = (String) visitPr(ctx.pr());
        ExpExprTrad += (String) visitExpExpr1(ctx.expExpr1());

        return (T) ExpExprTrad;
    }

    @Override
    public T visitExpExpr1(GrammarParser.ExpExpr1Context ctx){
        String ExpExpr1Trad = "";

        if(ctx.operExp() != null) {
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "OpPot");
            ExpExpr1Th = "pow(" + ExpExpr1Th + "," + (String) visitPr(ctx.pr()) + ")";
            ExpExpr1Trad += (String) visitExpExpr1(ctx.expExpr1());
        }else{
            ExpExpr1Trad += ExpExpr1Th;
        }

        return (T) ExpExpr1Trad;
    }

    @Override
    public T visitOperMul(GrammarParser.OperMulContext ctx){
        String OperMulTrad = "";

        if(ctx.TOKEN_MUL() != null){
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "OpMul");
            OperMulTrad += "*";
        }else if(ctx.TOKEN_DIV() != null){
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "OpDiv");
            OperMulTrad += "/";
        }else{
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "OpMod");
            OperMulTrad += " % ";
        }

        return (T) OperMulTrad;
    }

    @Override
    public T visitOperAdd(GrammarParser.OperAddContext ctx){
        String OperAddTrad = "";

        int index = tokensExpresionActual.size()-1;
        tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "OpMat");

        if(ctx.TOKEN_MAS() != null){
            OperAddTrad += " + ";
        }else {
            OperAddTrad += " - ";
        }

        return (T) OperAddTrad;
    }

    @Override
    public T visitOperRel(GrammarParser.OperRelContext ctx){
        String OperRelTrad = "";

        int index = tokensExpresionActual.size()-1;
        tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "OpBool");

        if(ctx.TOKEN_MENOR() != null){
            OperRelTrad += " < ";
        }else if(ctx.TOKEN_MAYOR() != null){
            OperRelTrad += " > ";
        }else if(ctx.TOKEN_MENOR_IGUAL() != null){
            OperRelTrad += " <= ";
        }else{
            OperRelTrad += " >= ";
        }

        return (T) OperRelTrad;
    }

    @Override
    public T visitOperEqu(GrammarParser.OperEquContext ctx){
        String OperEquTrad = "";

        int index = tokensExpresionActual.size()-1;
        tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "OpBool");

        if(ctx.TOKEN_IGUAL() != null){
            OperEquTrad += " == ";
        }else {
            OperEquTrad += " != ";
        }

        return (T) OperEquTrad;
    }

    @Override
    public T visitPr(GrammarParser.PrContext ctx){
        String PrTrad = "";

        if(ctx.FALSO() != null){
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "bool");
            PrTrad += "false";
        }else if(ctx.VERDADERO() != null){
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "bool");
            PrTrad += "true";
        }else if(ctx.TOKEN_ENTERO() != null){
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "int");
            PrTrad += ctx.TOKEN_ENTERO().getText();
        }else if(ctx.TOKEN_REAL() != null){
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "float");
            PrTrad += ctx.TOKEN_REAL().getText();
        }else if(ctx.TOKEN_CADENA() != null){
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "cadena");
            PrTrad += ctx.TOKEN_CADENA().getText();
        }else if(ctx.TOKEN_ID() != null){
            Llamada_subproceso1Th = ctx.TOKEN_ID().getText();
            String Expresion_llamadaTrad = (String) visitExpresion_llamada(ctx.expresion_llamada());

            if(ctx.expresion_llamada().llamada_subproceso() != null) {
                int numClon = 0;
                if(traduccion && ctx.expresion_llamada().llamada_subproceso().TOKEN_PAR_IZQ() != null) {
                    Llamada_subproceso1Th = ctx.TOKEN_ID().getText();
                    if(funArg.get(Llamada_subproceso1Th).get("0") != null) {
                        for (int i = 0; i < funArg.get(Llamada_subproceso1Th).get("0").size(); i++) {
                            String tipo = funArg.get(Llamada_subproceso1Th).get("0").get(i);
                            if (tipo.charAt(tipo.length() - 1) != 'r') {
                                funArg.get(Llamada_subproceso1Th).get("0").set(i, tipo + "r");
                                break;
                            }
                            numClon++;
                        }
                    }
                }
                PrTrad += ctx.TOKEN_ID().getText() + "_" + Integer.toString(numClon) + Expresion_llamadaTrad;
                if(funArg.get(ctx.TOKEN_ID().getText()) != null && Expresion_llamadaTrad.length() == 0){
                    PrTrad += "()";
                }
            }else{
                PrTrad += ctx.TOKEN_ID().getText() + Expresion_llamadaTrad;
            }

            // Almacenar los valores de retorno
            if(ctx.expresion_llamada().llamada_subproceso() != null){
                if(funArg.get(ctx.TOKEN_ID().getText()) != null){
                    for(String varReturn: funReturn.get(ctx.TOKEN_ID().getText()).keySet()){
                        int index = tokensExpresionActual.size()-1;
                        String tipoReturn = funReturn.get(ctx.TOKEN_ID().getText()).get(varReturn);
                        tokensExpresionActual.set(index, tokensExpresionActual.get(index) + tipoReturn);
                    }
                }else{
                    int index = tokensExpresionActual.size()-1;
                    String tipoVar = funVar.get(procesoActual).get(ctx.TOKEN_ID().getText());
                    tokensExpresionActual.set(index, tokensExpresionActual.get(index) + tipoVar);
                }
            }else{
                int index = tokensExpresionActual.size()-1;
                String tipoDimension = funVar.get(procesoActual).get(ctx.TOKEN_ID().getText());
                tokensExpresionActual.set(index, tokensExpresionActual.get(index) + tipoDimension);
            }

        }else if(ctx.TOKEN_MENOS() != null){
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "OpMat");
            PrTrad += "-" + (String) visitPr(ctx.pr());
        }else if(ctx.TOKEN_NEG() != null){
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "OpBool");
            PrTrad += "!" + (String) visitPr(ctx.pr());
        }else if(ctx.NO() != null){
            int index = tokensExpresionActual.size()-1;
            tokensExpresionActual.set(index, tokensExpresionActual.get(index) + "OpBool");
            PrTrad += "!" + (String) visitPr(ctx.pr());
        }else if(ctx.TOKEN_PAR_IZQ() != null){
            PrTrad += "(" + (String) visitLogOrExpr(ctx.logOrExpr()) + ")";
        }

        return (T) PrTrad;
    }

    @Override
    public T visitExpresion_llamada(GrammarParser.Expresion_llamadaContext ctx){
        String Expresion_llamadaTrad = "";

        if(ctx.llamada_subproceso() != null){
            Expresion_llamadaTrad += (String) visitLlamada_subproceso(ctx.llamada_subproceso());
        }else{
            Expresion_llamadaTrad += (String) visitLlamada_dimension(ctx.llamada_dimension());
        }

        return (T) Expresion_llamadaTrad;
    }

}




/*
        // IMPRESION DE TABLAS
        System.out.print("FUNARG\n");
        for(String fun: funArg.keySet()){
            System.out.print(fun + ":");
            for(String var: funArg.get(fun).keySet()){
                System.out.print("  " + var + ":" + funArg.get(fun).get(var));
            }
            System.out.print("\n");
        }

        System.out.print("FUNVAR\n");
        for(String fun: funVar.keySet()){
            System.out.print(fun + ":");
            for(String var: funVar.get(fun).keySet()){
                System.out.print("  " + var + ":" + funVar.get(fun).get(var));
            }
            System.out.print("\n");
        }
         */