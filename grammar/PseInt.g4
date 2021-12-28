grammar PseInt;

inicio  : 'hola' ID (',' ID)* ;
ID : 	[a-zA-Z]+ ;
ESP : [ \t\r\n]+ -> skip ;

/*
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS, [COMANDO, LISTA_COMANDOS])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS, [epsilon])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS1, [COMANDO, LISTA_COMANDOS1])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS1, [epsilon])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS2, [COMANDO, LISTA_COMANDOS2])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS2, [epsilon])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS3, [COMANDO, LISTA_COMANDOS3])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS3, [epsilon])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS4, [COMANDO, LISTA_COMANDOS4])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS4, [epsilon])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS5, [COMANDO, LISTA_COMANDOS5])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS5, [epsilon])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS6, [COMANDO, LISTA_COMANDOS6])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS6, [epsilon])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS7, [COMANDO, LISTA_COMANDOS7])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS7, [epsilon])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS8, [COMANDO, LISTA_COMANDOS8])
newGrammar.addRuleToNonTerminal(LISTA_COMANDOS8, [epsilon])

newGrammar.addRuleToNonTerminal(LISTA_EXPRESION, [EXPRESION, LISTA_EXPRESION1])
newGrammar.addRuleToNonTerminal(LISTA_EXPRESION1, ["token_coma", EXPRESION, LISTA_EXPRESION1])
newGrammar.addRuleToNonTerminal(LISTA_EXPRESION1, [epsilon])

newGrammar.addRuleToNonTerminal(LISTA_EXPRESION_SUB, [EXPRESION, LISTA_EXPRESION_SUB1])
newGrammar.addRuleToNonTerminal(LISTA_EXPRESION_SUB, [epsilon])
newGrammar.addRuleToNonTerminal(LISTA_EXPRESION_SUB1, ["token_coma", EXPRESION, LISTA_EXPRESION_SUB1])
newGrammar.addRuleToNonTerminal(LISTA_EXPRESION_SUB1, [epsilon])

newGrammar.addRuleToNonTerminal(LISTA_LEER_ID, ["id", LISTA_LEER_ID1])
newGrammar.addRuleToNonTerminal(LISTA_LEER_ID1, [LISTA_LEER_ID2])
newGrammar.addRuleToNonTerminal(LISTA_LEER_ID1, [LLAMADA_DIMENSION, LISTA_LEER_ID2])
newGrammar.addRuleToNonTerminal(LISTA_LEER_ID2, ["token_coma", "id",LISTA_LEER_ID2])
newGrammar.addRuleToNonTerminal(LISTA_LEER_ID2, [epsilon])

newGrammar.addRuleToNonTerminal(LISTA_FIRMA_ID, ["id", LISTA_FIRMA_ID1])
newGrammar.addRuleToNonTerminal(LISTA_FIRMA_ID, [epsilon])
newGrammar.addRuleToNonTerminal(LISTA_FIRMA_ID1, ["token_coma", "id", LISTA_FIRMA_ID1])
newGrammar.addRuleToNonTerminal(LISTA_FIRMA_ID1, [epsilon])

newGrammar.addRuleToNonTerminal(LISTA_DECLARACION_ID, ["id", LISTA_DECLARACION_ID1])
newGrammar.addRuleToNonTerminal(LISTA_DECLARACION_ID1, ["token_coma", "id", LISTA_DECLARACION_ID1])
newGrammar.addRuleToNonTerminal(LISTA_DECLARACION_ID1, [epsilon])

newGrammar.addRuleToNonTerminal(LISTA_ARREGLOS, ["token_coma", "id", LLAMADA_DIMENSION, LISTA_ARREGLOS])
newGrammar.addRuleToNonTerminal(LISTA_ARREGLOS, [epsilon])

newGrammar.addRuleToNonTerminal(LISTA_CASO, ["caso", EXPRESION, "token_dosp", BLOQUE_CASO])
newGrammar.addRuleToNonTerminal(LISTA_CASO, [SEGUN1])


newGrammar.addRuleToNonTerminal(PROGRAMA, [LISTA_SUB_PROCESOS, PROCESO, "EOF"])
newGrammar.addRuleToNonTerminal(LISTA_SUB_PROCESOS, [SUB_PROCESO, LISTA_SUB_PROCESOS])
newGrammar.addRuleToNonTerminal(LISTA_SUB_PROCESOS, [epsilon])

newGrammar.addRuleToNonTerminal(PROCESO, [INICIO_PROCESO, "id", LISTA_COMANDOS, FIN_PROCESO])
newGrammar.addRuleToNonTerminal(INICIO_PROCESO, ["proceso"])
newGrammar.addRuleToNonTerminal(INICIO_PROCESO, ["algoritmo"])
newGrammar.addRuleToNonTerminal(FIN_PROCESO, ["finproceso"])
newGrammar.addRuleToNonTerminal(FIN_PROCESO, ["finalgoritmo"])

newGrammar.addRuleToNonTerminal(SUB_PROCESO, [INICIO_SUB_PROCESO, "id", FIRMA, LISTA_COMANDOS1, FIN_SUB_PROCESO])
newGrammar.addRuleToNonTerminal(INICIO_SUB_PROCESO, ["funcion"])
newGrammar.addRuleToNonTerminal(INICIO_SUB_PROCESO, ["subproceso"])
newGrammar.addRuleToNonTerminal(FIN_SUB_PROCESO, ["finfuncion"])
newGrammar.addRuleToNonTerminal(FIN_SUB_PROCESO, ["finsubproceso"])

newGrammar.addRuleToNonTerminal(FIRMA, ["token_asig", "id", FIRMA1])
newGrammar.addRuleToNonTerminal(FIRMA, [FIRMA1])
newGrammar.addRuleToNonTerminal(FIRMA1, ["token_par_izq", LISTA_FIRMA_ID, "token_par_der"])
newGrammar.addRuleToNonTerminal(FIRMA1, [epsilon])

newGrammar.addRuleToNonTerminal(COMANDO, [DECLARACION])
newGrammar.addRuleToNonTerminal(COMANDO, [ASIGNACION])
newGrammar.addRuleToNonTerminal(COMANDO, [DIMENSION])
newGrammar.addRuleToNonTerminal(COMANDO, [SI])
newGrammar.addRuleToNonTerminal(COMANDO, [CICLO_PARA])
newGrammar.addRuleToNonTerminal(COMANDO, [CICLO_MIENTRAS])
newGrammar.addRuleToNonTerminal(COMANDO, [CICLO_REPETIR])
newGrammar.addRuleToNonTerminal(COMANDO, [SEGUN])
newGrammar.addRuleToNonTerminal(COMANDO, [COMANDO_ESPECIAL])

newGrammar.addRuleToNonTerminal(DECLARACION, ["definir", LISTA_DECLARACION_ID, "como", TIPO, "token_pyc"])

newGrammar.addRuleToNonTerminal(TIPO, ["numero"])
newGrammar.addRuleToNonTerminal(TIPO, ["numerico"])
newGrammar.addRuleToNonTerminal(TIPO, ["entero"])
newGrammar.addRuleToNonTerminal(TIPO, ["real"])
newGrammar.addRuleToNonTerminal(TIPO, ["caracter"])
newGrammar.addRuleToNonTerminal(TIPO, ["texto"])
newGrammar.addRuleToNonTerminal(TIPO, ["cadena"])
newGrammar.addRuleToNonTerminal(TIPO, ["logico"])

newGrammar.addRuleToNonTerminal(ASIGNACION, ["id", ASIGNACION1])
newGrammar.addRuleToNonTerminal(ASIGNACION1, [ASIGNACION2])
newGrammar.addRuleToNonTerminal(ASIGNACION1, [LLAMADA_SUB1, "token_pyc"])
newGrammar.addRuleToNonTerminal(ASIGNACION2, ["token_cor_izq", LISTA_EXPRESION, "token_cor_der", "token_asig", EXPRESION, "token_pyc"])
newGrammar.addRuleToNonTerminal(ASIGNACION2, ["token_asig", EXPRESION, "token_pyc"])

newGrammar.addRuleToNonTerminal(LLAMADA_SUB, ["id", LLAMADA_SUB1])
newGrammar.addRuleToNonTerminal(LLAMADA_SUB1, [FIRMA_LLAMADO_SUB])
newGrammar.addRuleToNonTerminal(LLAMADA_SUB1, [LLAMADA_DIMENSION])
newGrammar.addRuleToNonTerminal(LLAMADA_SUB1, [epsilon])
newGrammar.addRuleToNonTerminal(FIRMA_LLAMADO_SUB, ["token_par_izq", LISTA_EXPRESION_SUB, "token_par_der"])
newGrammar.addRuleToNonTerminal(LLAMADA_DIMENSION, ["token_cor_izq", LISTA_EXPRESION, "token_cor_der"])

newGrammar.addRuleToNonTerminal(DIMENSION, ["dimension", "id", LLAMADA_DIMENSION, LISTA_ARREGLOS, "token_pyc"])

newGrammar.addRuleToNonTerminal(SI, ["si", EXPRESION, "entonces", BLOQUE_SI])
newGrammar.addRuleToNonTerminal(BLOQUE_SI, [LISTA_COMANDOS2, SI1])
newGrammar.addRuleToNonTerminal(SI1, ["sino", BLOQUE_SI1])
newGrammar.addRuleToNonTerminal(SI1, ["finsi"])
newGrammar.addRuleToNonTerminal(BLOQUE_SI1, [LISTA_COMANDOS3, "finsi"])

newGrammar.addRuleToNonTerminal(CICLO_PARA, ["para", "id", "token_asig", EXPRESION, "hasta", EXPRESION, CICLO_PARA1])
newGrammar.addRuleToNonTerminal(CICLO_PARA1, ["con", "paso", EXPRESION, "hacer", BLOQUE_PARA])
newGrammar.addRuleToNonTerminal(CICLO_PARA1, ["hacer", BLOQUE_PARA])
newGrammar.addRuleToNonTerminal(BLOQUE_PARA, [LISTA_COMANDOS4, "finpara"])

newGrammar.addRuleToNonTerminal(CICLO_MIENTRAS, ["mientras", EXPRESION, "hacer", BLOQUE_MIENTRAS])
newGrammar.addRuleToNonTerminal(BLOQUE_MIENTRAS, [LISTA_COMANDOS5, "finmientras"])

newGrammar.addRuleToNonTerminal(CICLO_REPETIR, ["repetir", BLOQUE_REPETIR])
newGrammar.addRuleToNonTerminal(BLOQUE_REPETIR, [LISTA_COMANDOS6, "hasta", "que", EXPRESION])

newGrammar.addRuleToNonTerminal(SEGUN, ["segun", EXPRESION, "hacer", LISTA_CASO])
newGrammar.addRuleToNonTerminal(SEGUN1, ["finsegun"])
newGrammar.addRuleToNonTerminal(SEGUN1, ["de", "otro", "modo", "token_dosp", BLOQUE_SEGUN1])
newGrammar.addRuleToNonTerminal(BLOQUE_SEGUN1, [LISTA_COMANDOS7, "finsegun"])
newGrammar.addRuleToNonTerminal(BLOQUE_CASO, [LISTA_COMANDOS8, LISTA_CASO])

newGrammar.addRuleToNonTerminal(COMANDO_ESPECIAL, ["borrar", "pantalla", "token_pyc"])
newGrammar.addRuleToNonTerminal(COMANDO_ESPECIAL, [ESCRIBIR])
newGrammar.addRuleToNonTerminal(COMANDO_ESPECIAL, [ESPERAR])
newGrammar.addRuleToNonTerminal(COMANDO_ESPECIAL, [LEER])
newGrammar.addRuleToNonTerminal(COMANDO_ESPECIAL, ["limpiar", "pantalla", "token_pyc"])

newGrammar.addRuleToNonTerminal(ESCRIBIR, ["escribir", LISTA_EXPRESION, "token_pyc"])
newGrammar.addRuleToNonTerminal(ESPERAR, ["esperar", ESPERAR1])
newGrammar.addRuleToNonTerminal(ESPERAR1, ["tecla", "token_pyc"])
newGrammar.addRuleToNonTerminal(ESPERAR1, [EXPRESION, MEDIDA, "token_pyc"])
newGrammar.addRuleToNonTerminal(MEDIDA, ["segundos"])
newGrammar.addRuleToNonTerminal(MEDIDA, ["milisegundos"])

newGrammar.addRuleToNonTerminal(LEER, ["leer", LISTA_LEER_ID, "token_pyc"])

newGrammar.addRuleToNonTerminal(EXPRESION, [T, EXPRESION1])
newGrammar.addRuleToNonTerminal(EXPRESION1, [OPERACION, T, EXPRESION1])
newGrammar.addRuleToNonTerminal(EXPRESION1, [epsilon])
newGrammar.addRuleToNonTerminal(T, [E, LISTA_E])
newGrammar.addRuleToNonTerminal(LISTA_E, [OPERACION, E, LISTA_E])
newGrammar.addRuleToNonTerminal(LISTA_E, [epsilon])
newGrammar.addRuleToNonTerminal(E, ["token_par_izq", EXPRESION, "token_par_der"])
newGrammar.addRuleToNonTerminal(E, [LLAMADA_SUB])
newGrammar.addRuleToNonTerminal(E, ["verdadero"])
newGrammar.addRuleToNonTerminal(E, ["falso"])
newGrammar.addRuleToNonTerminal(E, ["token_real"])
newGrammar.addRuleToNonTerminal(E, ["token_entero"])
newGrammar.addRuleToNonTerminal(E, ["token_cadena"])
newGrammar.addRuleToNonTerminal(E, ["token_neg", EXPRESION])
newGrammar.addRuleToNonTerminal(E, ["token_menos", EXPRESION])

newGrammar.addRuleToNonTerminal(OPERACION, ["token_o"])
newGrammar.addRuleToNonTerminal(OPERACION, ["token_y"])
newGrammar.addRuleToNonTerminal(OPERACION, ["token_mas"])
newGrammar.addRuleToNonTerminal(OPERACION, ["token_igual"])
newGrammar.addRuleToNonTerminal(OPERACION, ["token_dif"])
newGrammar.addRuleToNonTerminal(OPERACION, ["token_menos"])
newGrammar.addRuleToNonTerminal(OPERACION, ["token_menor"])
newGrammar.addRuleToNonTerminal(OPERACION, ["token_mayor"])
newGrammar.addRuleToNonTerminal(OPERACION, ["token_menor_igual"])
newGrammar.addRuleToNonTerminal(OPERACION, ["token_mayor_igual"])
newGrammar.addRuleToNonTerminal(OPERACION, ["token_mul"])
newGrammar.addRuleToNonTerminal(OPERACION, ["token_div"])
newGrammar.addRuleToNonTerminal(OPERACION, ["token_pot"])
newGrammar.addRuleToNonTerminal(OPERACION, ["token_mod"])

*/