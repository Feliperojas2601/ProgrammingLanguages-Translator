grammar Grammar;

// REGLAS GRAMATICALES
programa: (subproceso)* proceso;

subproceso: inicio_sub_proceso TOKEN_ID firma (comando)* fin_sub_proceso;
inicio_sub_proceso: FUNCION | SUBPROCESO | SUBALGORITMO;
fin_sub_proceso: FINFUNCION | FINSUBPROCESO | FINSUBALGORITMO;

firma: TOKEN_ASIG TOKEN_ID (argumentos)? | argumentos | ;
argumentos: TOKEN_PAR_IZQ (TOKEN_ID (TOKEN_COMA TOKEN_ID)*)? TOKEN_PAR_DER;

proceso: inicio_proceso TOKEN_ID (comando)* fin_proceso;
inicio_proceso: PROCESO | ALGORITMO;
fin_proceso: FINPROCESO | FINALGORITMO;

comando: declaracion
        | asignacion
        | dimension
        | condicional_si
        | ciclo_para
        | ciclo_mientras
        | ciclo_repetir
        | segun
        | comando_especial;

declaracion: DEFINIR TOKEN_ID (TOKEN_COMA TOKEN_ID)* COMO tipo TOKEN_PYC;
tipo: NUMERO
     | NUMERICO
     | ENTERO
     | REAL
     | CARACTER
     | TEXTO
     | CADENA
     | LOGICO;

asignacion: TOKEN_ID asignacion1;
asignacion1: TOKEN_ASIG expresion TOKEN_PYC
            | llamada_dimension TOKEN_ASIG expresion TOKEN_PYC
            | llamada_subproceso TOKEN_PYC;

llamada_subproceso: TOKEN_PAR_IZQ (expresion (TOKEN_COMA expresion)*)? TOKEN_PAR_DER | ;
llamada_dimension: TOKEN_COR_IZQ expresion_mat (TOKEN_COMA expresion_mat)* TOKEN_COR_DER;

dimension: DIMENSION TOKEN_ID llamada_dimension (TOKEN_COMA TOKEN_ID llamada_dimension)* TOKEN_PYC;

condicional_si: SI expresion ENTONCES bloque_si;
bloque_si: (comando)* bloque_sino;
bloque_sino: SINO (comando)* FINSI | FINSI;

ciclo_para: PARA TOKEN_ID TOKEN_ASIG expresion_mat HASTA expresion_mat ciclo_para1;
ciclo_para1: CON PASO expresion_mat HACER bloque_para | HACER bloque_para;
bloque_para: (comando)* FINPARA;

ciclo_mientras: MIENTRAS expresion HACER bloque_mientras;
bloque_mientras: (comando)* FINMIENTRAS;

ciclo_repetir: REPETIR bloque_repetir;
bloque_repetir: (comando)* HASTA QUE expresion;

segun: SEGUN expresion_mat HACER bloque_segun;
bloque_segun: (CASO expresion TOKEN_DOSP (comando)*)* finsegun;
finsegun: FINSEGUN | DE OTRO MODO TOKEN_DOSP (comando)* FINSEGUN;

comando_especial: BORRAR PANTALLA TOKEN_PYC
                 | LIMPIAR PANTALLA TOKEN_PYC
                 | esperar
                 | leer
                 | escribir;

escribir: ESCRIBIR expresion (TOKEN_COMA expresion)* TOKEN_PYC;

esperar: ESPERAR esperar1;
esperar1: TECLA TOKEN_PYC | expresion medida TOKEN_PYC;
medida: SEGUNDOS | MILISEGUNDOS;

leer: LEER lista_leer_id TOKEN_PYC;
lista_leer_id: TOKEN_ID lista_leer_id1 (TOKEN_COMA TOKEN_ID lista_leer_id1)*;
lista_leer_id1: llamada_dimension | ;

expresion: expresion TOKEN_O expresion
          | expresion TOKEN_Y expresion
          | expresion TOKEN_MAS expresion
          | expresion TOKEN_IGUAL expresion
          | expresion TOKEN_DIF expresion
          | expresion TOKEN_MUL expresion
          | expresion TOKEN_DIV expresion
          | expresion TOKEN_POT expresion
          | expresion TOKEN_MOD expresion
          | expresion TOKEN_MENOS expresion
          | expresion TOKEN_MENOR expresion
          | expresion TOKEN_MAYOR expresion
          | expresion TOKEN_MENOR_IGUAL expresion
          | expresion TOKEN_MAYOR_IGUAL expresion
          | TOKEN_PAR_IZQ expresion TOKEN_PAR_DER
          | TOKEN_MENOS expresion
          | TOKEN_NEG expresion
          | VERDADERO
          | FALSO
          | TOKEN_REAL
          | TOKEN_ENTERO
          | TOKEN_CADENA
          | TOKEN_ID expresion_llamada;

expresion_mat: expresion_mat TOKEN_MAS expresion_mat
              | expresion_mat TOKEN_MENOS expresion_mat
              | expresion_mat TOKEN_MUL expresion_mat
              | expresion_mat TOKEN_DIV expresion_mat
              | expresion_mat TOKEN_POT expresion_mat
              | expresion_mat TOKEN_MOD expresion_mat
              | TOKEN_PAR_IZQ expresion_mat TOKEN_PAR_DER
              | TOKEN_MENOS expresion_mat
              | TOKEN_REAL
              | TOKEN_ENTERO
              | TOKEN_ID expresion_llamada;

expresion_llamada: llamada_subproceso | llamada_dimension;

// PALABRAS RESERVADAS
FINSI: [fF][iI][nN][sS][iI];
CARACTER: [cC][aA][rR][aA][cC][tT][eE][rR];
REAL: [rR][eE][aA][lL];
ENTERO: [eE][nN][tT][eE][rR][oO];
NUMERICO: [nN][uU][mM][eE][rR][iI][cC][oO];
NUMERO: [nN][uU][mM][eE][rR][oO];
LOGICO: [lL][oO][gG][iI][cC][oO];
TEXTO: [tT][eE][xX][tT][oO];
CADENA: [cC][aA][dD][eE][nN][aA];
VERDADERO: [vV][eE][rR][dD][aA][dD][eE][rR][oO];
FALSO: [fF][aA][lL][sS][oO];
Y: [yY];
O: [oO];
NO: [nN][oO];
MOD: [mM][oO][dD];
PARA: [pP][aA][rR][aA];
HASTA: [hH][aA][sS][tT][aA];
CON: [cC][oO][nN];
CASO: [cC][aA][sS][oO];
PASO: [pP][aA][sS][oO];
DEFINIR: [dD][eE][fF][iI][nN][iI][rR];
HACER: [hH][aA][cC][eE][rR];
COMO: [cC][oO][mM][oO];
ESCRIBIR: [eE][sS][cC][rR][iI][bB][iI][rR];
LEER: [lL][eE][eE][rR];
ENTONCES: [eE][nN][tT][oO][nN][cC][eE][sS];
DIMENSION: [dD][iI][mM][eE][nN][sS][iI][oO][nN];
REPETIR: [rR][eE][pP][eE][tT][iI][rR];
MIENTRAS: [mM][iI][eE][nN][tT][rR][aA][sS];
ALGORITMO: [aA][lL][gG][oO][rR][iI][tT][mM][oO];
PROCESO: [pP][rR][oO][cC][eE][sS][oO];
SI: [sS][iI];
SINO: [sS][iI][nN][oO];
SEGUN: [sS][eE][gG][uU][nN];
DE: [dD][eE];
OTRO: [oO][tT][rR][oO];
MODO: [mM][oO][dD][oO];
SUBPROCESO: [sS][uU][bB][pP][rR][oO][cC][eE][sS][oO];
SUBALGORITMO: [sS][uU][bB][aA][lL][gG][oO][rR][iI][tT][mM][oO];
FUNCION: [fF][uU][nN][cC][iI][oO][nN];
FINPROCESO: [fF][iI][nN][pP][rR][oO][cC][eE][sS][oO];
FINALGORITMO: [fF][iI][nN][aA][lL][gG][oO][rR][iI][tT][mM][oO];
FINMIENTRAS: [fF][iI][nN][mM][iI][eE][nN][tT][rR][aA][sS];
FINSEGUN: [fF][iI][nN][sS][eE][gG][uU][nN];
FINPARA: [fF][iI][nN][pP][aA][rR][aA];
FINSUBPROCESO: [fF][iI][nN][sS][uU][bB][pP][rR][oO][cC][eE][sS][oO];
FINSUBALGORITMO: [fF][iI][nN][sS][uU][bB][aA][lL][gG][oO][rR][iI][tT][mM][oO];
FINFUNCION: [fF][iI][nN][fF][uU][nN][cC][iI][oO][nN];
QUE: [qQ][uU][eE];
LIMPIAR: [lL][iI][mM][pP][iI][aA][rR];
BORRAR: [bB][oO][rR][rR][aA][rR];
PANTALLA: [pP][aA][nN][tT][aA][lL][lL][aA];
ESPERAR: [eE][sS][pP][eE][rR][aA][rR];
TECLA: [tT][eE][cC][lL][aA];
SEGUNDOS: [sS][eE][gG][uU][nN][dD][oO][sS];
MILISEGUNDOS: [mM][iI][lL][iI][sS][eE][gG][uU][nN][dD][oO][sS];


// REGLAS LEXICAS
TOKEN_REAL: TOKEN_ENTERO ('.'(TOKEN_ENTERO)*);
TOKEN_ENTERO:'0'..'9'+;
TOKEN_CADENA: ['"](.*?)['"] ;
TOKEN_ID: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
TOKEN_NEG: '~' | NO;
TOKEN_IGUAL: '=';
TOKEN_MENOR: '<';
TOKEN_ASIG: '<-';
TOKEN_DIF: '<>';
TOKEN_MENOR_IGUAL: '<=';
TOKEN_MAYOR: '>';
TOKEN_MAYOR_IGUAL: '>=';
TOKEN_DIV: '/';
TOKEN_PAR_IZQ: '(';
TOKEN_PAR_DER: ')';
TOKEN_MAS: '+';
TOKEN_MENOS: '-';
TOKEN_Y: '&' | Y;
TOKEN_O: '|' | O;
TOKEN_COR_DER: ']';
TOKEN_COR_IZQ: '[';
TOKEN_MUL: '*';
TOKEN_MOD: '%' | MOD;
TOKEN_POT: '^';
TOKEN_PYC: ';';
TOKEN_COMA: ',';
TOKEN_DOSP: ':';

TOKEN_ESPACIO: [ \t\r\n]+ -> skip;
TOKEN_LINIA_COMENTARIO: '//' ~[\r\n]* -> skip;
TOKEN_COMENTARIO: '/*' .*? '*/' -> skip;