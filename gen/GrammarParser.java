// Generated from C:/Users/Hp Probook 440/Desktop/Gabriela/Lenguajes/ProgrammingLanguages-Translator/grammar\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FINSI=1, CARACTER=2, REAL=3, ENTERO=4, NUMERICO=5, NUMERO=6, LOGICO=7, 
		TEXTO=8, CADENA=9, VERDADERO=10, FALSO=11, Y=12, O=13, NO=14, MOD=15, 
		PARA=16, HASTA=17, CON=18, CASO=19, PASO=20, DEFINIR=21, HACER=22, COMO=23, 
		ESCRIBIR=24, LEER=25, ENTONCES=26, DIMENSION=27, REPETIR=28, MIENTRAS=29, 
		ALGORITMO=30, PROCESO=31, SI=32, SINO=33, SEGUN=34, DE=35, OTRO=36, MODO=37, 
		SUBPROCESO=38, SUBALGORITMO=39, FUNCION=40, FINPROCESO=41, FINALGORITMO=42, 
		FINMIENTRAS=43, FINSEGUN=44, FINPARA=45, FINSUBPROCESO=46, FINSUBALGORITMO=47, 
		FINFUNCION=48, QUE=49, LIMPIAR=50, BORRAR=51, PANTALLA=52, ESPERAR=53, 
		TECLA=54, SEGUNDOS=55, MILISEGUNDOS=56, TOKEN_REAL=57, TOKEN_ENTERO=58, 
		TOKEN_CADENA=59, TOKEN_ID=60, TOKEN_NEG=61, TOKEN_IGUAL=62, TOKEN_MENOR=63, 
		TOKEN_ASIG=64, TOKEN_DIF=65, TOKEN_MENOR_IGUAL=66, TOKEN_MAYOR=67, TOKEN_MAYOR_IGUAL=68, 
		TOKEN_DIV=69, TOKEN_PAR_IZQ=70, TOKEN_PAR_DER=71, TOKEN_MAS=72, TOKEN_MENOS=73, 
		TOKEN_Y=74, TOKEN_O=75, TOKEN_COR_DER=76, TOKEN_COR_IZQ=77, TOKEN_MUL=78, 
		TOKEN_MOD=79, TOKEN_POT=80, TOKEN_PYC=81, TOKEN_COMA=82, TOKEN_DOSP=83, 
		TOKEN_ESPACIO=84, TOKEN_LINIA_COMENTARIO=85, TOKEN_COMENTARIO=86;
	public static final int
		RULE_programa = 0, RULE_subproceso = 1, RULE_inicio_sub_proceso = 2, RULE_fin_sub_proceso = 3, 
		RULE_firma = 4, RULE_argumentos = 5, RULE_proceso = 6, RULE_inicio_proceso = 7, 
		RULE_fin_proceso = 8, RULE_comando = 9, RULE_declaracion = 10, RULE_tipo = 11, 
		RULE_asignacion = 12, RULE_asignacion1 = 13, RULE_llamada_subproceso = 14, 
		RULE_llamada_dimension = 15, RULE_dimension = 16, RULE_condicional_si = 17, 
		RULE_bloque_si = 18, RULE_bloque_sino = 19, RULE_ciclo_para = 20, RULE_ciclo_para1 = 21, 
		RULE_bloque_para = 22, RULE_ciclo_mientras = 23, RULE_bloque_mientras = 24, 
		RULE_ciclo_repetir = 25, RULE_bloque_repetir = 26, RULE_segun = 27, RULE_bloque_segun = 28, 
		RULE_finsegun = 29, RULE_comando_especial = 30, RULE_escribir = 31, RULE_esperar = 32, 
		RULE_esperar1 = 33, RULE_medida = 34, RULE_leer = 35, RULE_lista_leer_id = 36, 
		RULE_lista_leer_id1 = 37, RULE_expresion = 38, RULE_logOrExpr = 39, RULE_logOrExpr1 = 40, 
		RULE_logAndExpr = 41, RULE_logAndExpr1 = 42, RULE_equExpr = 43, RULE_equExpr1 = 44, 
		RULE_relExpr = 45, RULE_relExpr1 = 46, RULE_addExpr = 47, RULE_addExpr1 = 48, 
		RULE_mulExpr = 49, RULE_mulExpr1 = 50, RULE_expExpr = 51, RULE_expExpr1 = 52, 
		RULE_operEqu = 53, RULE_operRel = 54, RULE_operAdd = 55, RULE_operMul = 56, 
		RULE_operExp = 57, RULE_pr = 58, RULE_expresion_llamada = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "subproceso", "inicio_sub_proceso", "fin_sub_proceso", "firma", 
			"argumentos", "proceso", "inicio_proceso", "fin_proceso", "comando", 
			"declaracion", "tipo", "asignacion", "asignacion1", "llamada_subproceso", 
			"llamada_dimension", "dimension", "condicional_si", "bloque_si", "bloque_sino", 
			"ciclo_para", "ciclo_para1", "bloque_para", "ciclo_mientras", "bloque_mientras", 
			"ciclo_repetir", "bloque_repetir", "segun", "bloque_segun", "finsegun", 
			"comando_especial", "escribir", "esperar", "esperar1", "medida", "leer", 
			"lista_leer_id", "lista_leer_id1", "expresion", "logOrExpr", "logOrExpr1", 
			"logAndExpr", "logAndExpr1", "equExpr", "equExpr1", "relExpr", "relExpr1", 
			"addExpr", "addExpr1", "mulExpr", "mulExpr1", "expExpr", "expExpr1", 
			"operEqu", "operRel", "operAdd", "operMul", "operExp", "pr", "expresion_llamada"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'~'", "'='", "'<'", "'<-'", "'<>'", "'<='", "'>'", "'>='", "'/'", 
			"'('", "')'", "'+'", "'-'", "'&'", "'|'", "']'", "'['", "'*'", "'%'", 
			"'^'", "';'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FINSI", "CARACTER", "REAL", "ENTERO", "NUMERICO", "NUMERO", "LOGICO", 
			"TEXTO", "CADENA", "VERDADERO", "FALSO", "Y", "O", "NO", "MOD", "PARA", 
			"HASTA", "CON", "CASO", "PASO", "DEFINIR", "HACER", "COMO", "ESCRIBIR", 
			"LEER", "ENTONCES", "DIMENSION", "REPETIR", "MIENTRAS", "ALGORITMO", 
			"PROCESO", "SI", "SINO", "SEGUN", "DE", "OTRO", "MODO", "SUBPROCESO", 
			"SUBALGORITMO", "FUNCION", "FINPROCESO", "FINALGORITMO", "FINMIENTRAS", 
			"FINSEGUN", "FINPARA", "FINSUBPROCESO", "FINSUBALGORITMO", "FINFUNCION", 
			"QUE", "LIMPIAR", "BORRAR", "PANTALLA", "ESPERAR", "TECLA", "SEGUNDOS", 
			"MILISEGUNDOS", "TOKEN_REAL", "TOKEN_ENTERO", "TOKEN_CADENA", "TOKEN_ID", 
			"TOKEN_NEG", "TOKEN_IGUAL", "TOKEN_MENOR", "TOKEN_ASIG", "TOKEN_DIF", 
			"TOKEN_MENOR_IGUAL", "TOKEN_MAYOR", "TOKEN_MAYOR_IGUAL", "TOKEN_DIV", 
			"TOKEN_PAR_IZQ", "TOKEN_PAR_DER", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_Y", 
			"TOKEN_O", "TOKEN_COR_DER", "TOKEN_COR_IZQ", "TOKEN_MUL", "TOKEN_MOD", 
			"TOKEN_POT", "TOKEN_PYC", "TOKEN_COMA", "TOKEN_DOSP", "TOKEN_ESPACIO", 
			"TOKEN_LINIA_COMENTARIO", "TOKEN_COMENTARIO"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			asignacion();
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

	public static class SubprocesoContext extends ParserRuleContext {
		public Inicio_sub_procesoContext inicio_sub_proceso() {
			return getRuleContext(Inicio_sub_procesoContext.class,0);
		}
		public TerminalNode TOKEN_ID() { return getToken(GrammarParser.TOKEN_ID, 0); }
		public FirmaContext firma() {
			return getRuleContext(FirmaContext.class,0);
		}
		public Fin_sub_procesoContext fin_sub_proceso() {
			return getRuleContext(Fin_sub_procesoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SubprocesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subproceso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSubproceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprocesoContext subproceso() throws RecognitionException {
		SubprocesoContext _localctx = new SubprocesoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subproceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			inicio_sub_proceso();
			setState(123);
			match(TOKEN_ID);
			setState(124);
			firma();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
				{
				{
				setState(125);
				comando();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			fin_sub_proceso();
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

	public static class Inicio_sub_procesoContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(GrammarParser.FUNCION, 0); }
		public TerminalNode SUBPROCESO() { return getToken(GrammarParser.SUBPROCESO, 0); }
		public TerminalNode SUBALGORITMO() { return getToken(GrammarParser.SUBALGORITMO, 0); }
		public Inicio_sub_procesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio_sub_proceso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInicio_sub_proceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inicio_sub_procesoContext inicio_sub_proceso() throws RecognitionException {
		Inicio_sub_procesoContext _localctx = new Inicio_sub_procesoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inicio_sub_proceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUBPROCESO) | (1L << SUBALGORITMO) | (1L << FUNCION))) != 0)) ) {
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

	public static class Fin_sub_procesoContext extends ParserRuleContext {
		public TerminalNode FINFUNCION() { return getToken(GrammarParser.FINFUNCION, 0); }
		public TerminalNode FINSUBPROCESO() { return getToken(GrammarParser.FINSUBPROCESO, 0); }
		public TerminalNode FINSUBALGORITMO() { return getToken(GrammarParser.FINSUBALGORITMO, 0); }
		public Fin_sub_procesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin_sub_proceso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFin_sub_proceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fin_sub_procesoContext fin_sub_proceso() throws RecognitionException {
		Fin_sub_procesoContext _localctx = new Fin_sub_procesoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fin_sub_proceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINSUBPROCESO) | (1L << FINSUBALGORITMO) | (1L << FINFUNCION))) != 0)) ) {
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

	public static class FirmaContext extends ParserRuleContext {
		public TerminalNode TOKEN_ASIG() { return getToken(GrammarParser.TOKEN_ASIG, 0); }
		public TerminalNode TOKEN_ID() { return getToken(GrammarParser.TOKEN_ID, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public FirmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFirma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirmaContext firma() throws RecognitionException {
		FirmaContext _localctx = new FirmaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_firma);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_ASIG:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(TOKEN_ASIG);
				setState(138);
				match(TOKEN_ID);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TOKEN_PAR_IZQ) {
					{
					setState(139);
					argumentos();
					}
				}

				}
				break;
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				argumentos();
				}
				break;
			case PARA:
			case DEFINIR:
			case ESCRIBIR:
			case LEER:
			case DIMENSION:
			case REPETIR:
			case MIENTRAS:
			case SI:
			case SEGUN:
			case FINSUBPROCESO:
			case FINSUBALGORITMO:
			case FINFUNCION:
			case LIMPIAR:
			case BORRAR:
			case ESPERAR:
			case TOKEN_ID:
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

	public static class ArgumentosContext extends ParserRuleContext {
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(GrammarParser.TOKEN_PAR_IZQ, 0); }
		public TerminalNode TOKEN_PAR_DER() { return getToken(GrammarParser.TOKEN_PAR_DER, 0); }
		public List<TerminalNode> TOKEN_ID() { return getTokens(GrammarParser.TOKEN_ID); }
		public TerminalNode TOKEN_ID(int i) {
			return getToken(GrammarParser.TOKEN_ID, i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(GrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(GrammarParser.TOKEN_COMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(TOKEN_PAR_IZQ);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOKEN_ID) {
				{
				setState(147);
				match(TOKEN_ID);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(148);
					match(TOKEN_COMA);
					setState(149);
					match(TOKEN_ID);
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(157);
			match(TOKEN_PAR_DER);
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

	public static class ProcesoContext extends ParserRuleContext {
		public Inicio_procesoContext inicio_proceso() {
			return getRuleContext(Inicio_procesoContext.class,0);
		}
		public TerminalNode TOKEN_ID() { return getToken(GrammarParser.TOKEN_ID, 0); }
		public Fin_procesoContext fin_proceso() {
			return getRuleContext(Fin_procesoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProcesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proceso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcesoContext proceso() throws RecognitionException {
		ProcesoContext _localctx = new ProcesoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_proceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			inicio_proceso();
			setState(160);
			match(TOKEN_ID);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
				{
				{
				setState(161);
				comando();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			fin_proceso();
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

	public static class Inicio_procesoContext extends ParserRuleContext {
		public TerminalNode PROCESO() { return getToken(GrammarParser.PROCESO, 0); }
		public TerminalNode ALGORITMO() { return getToken(GrammarParser.ALGORITMO, 0); }
		public Inicio_procesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio_proceso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInicio_proceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inicio_procesoContext inicio_proceso() throws RecognitionException {
		Inicio_procesoContext _localctx = new Inicio_procesoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inicio_proceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==ALGORITMO || _la==PROCESO) ) {
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

	public static class Fin_procesoContext extends ParserRuleContext {
		public TerminalNode FINPROCESO() { return getToken(GrammarParser.FINPROCESO, 0); }
		public TerminalNode FINALGORITMO() { return getToken(GrammarParser.FINALGORITMO, 0); }
		public Fin_procesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin_proceso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFin_proceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fin_procesoContext fin_proceso() throws RecognitionException {
		Fin_procesoContext _localctx = new Fin_procesoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fin_proceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==FINPROCESO || _la==FINALGORITMO) ) {
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

	public static class ComandoContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public Condicional_siContext condicional_si() {
			return getRuleContext(Condicional_siContext.class,0);
		}
		public Ciclo_paraContext ciclo_para() {
			return getRuleContext(Ciclo_paraContext.class,0);
		}
		public Ciclo_mientrasContext ciclo_mientras() {
			return getRuleContext(Ciclo_mientrasContext.class,0);
		}
		public Ciclo_repetirContext ciclo_repetir() {
			return getRuleContext(Ciclo_repetirContext.class,0);
		}
		public SegunContext segun() {
			return getRuleContext(SegunContext.class,0);
		}
		public Comando_especialContext comando_especial() {
			return getRuleContext(Comando_especialContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				declaracion();
				}
				break;
			case TOKEN_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				asignacion();
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				dimension();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				condicional_si();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				ciclo_para();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				ciclo_mientras();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				ciclo_repetir();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				segun();
				}
				break;
			case ESCRIBIR:
			case LEER:
			case LIMPIAR:
			case BORRAR:
			case ESPERAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(181);
				comando_especial();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode DEFINIR() { return getToken(GrammarParser.DEFINIR, 0); }
		public List<TerminalNode> TOKEN_ID() { return getTokens(GrammarParser.TOKEN_ID); }
		public TerminalNode TOKEN_ID(int i) {
			return getToken(GrammarParser.TOKEN_ID, i);
		}
		public TerminalNode COMO() { return getToken(GrammarParser.COMO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(GrammarParser.TOKEN_PYC, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(GrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(GrammarParser.TOKEN_COMA, i);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(DEFINIR);
			setState(185);
			match(TOKEN_ID);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(186);
				match(TOKEN_COMA);
				setState(187);
				match(TOKEN_ID);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(COMO);
			setState(194);
			tipo();
			setState(195);
			match(TOKEN_PYC);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(GrammarParser.NUMERO, 0); }
		public TerminalNode NUMERICO() { return getToken(GrammarParser.NUMERICO, 0); }
		public TerminalNode ENTERO() { return getToken(GrammarParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(GrammarParser.REAL, 0); }
		public TerminalNode CARACTER() { return getToken(GrammarParser.CARACTER, 0); }
		public TerminalNode TEXTO() { return getToken(GrammarParser.TEXTO, 0); }
		public TerminalNode CADENA() { return getToken(GrammarParser.CADENA, 0); }
		public TerminalNode LOGICO() { return getToken(GrammarParser.LOGICO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARACTER) | (1L << REAL) | (1L << ENTERO) | (1L << NUMERICO) | (1L << NUMERO) | (1L << LOGICO) | (1L << TEXTO) | (1L << CADENA))) != 0)) ) {
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode TOKEN_ID() { return getToken(GrammarParser.TOKEN_ID, 0); }
		public Asignacion1Context asignacion1() {
			return getRuleContext(Asignacion1Context.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(TOKEN_ID);
			setState(200);
			asignacion1();
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

	public static class Asignacion1Context extends ParserRuleContext {
		public TerminalNode TOKEN_ASIG() { return getToken(GrammarParser.TOKEN_ASIG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(GrammarParser.TOKEN_PYC, 0); }
		public Llamada_dimensionContext llamada_dimension() {
			return getRuleContext(Llamada_dimensionContext.class,0);
		}
		public Llamada_subprocesoContext llamada_subproceso() {
			return getRuleContext(Llamada_subprocesoContext.class,0);
		}
		public Asignacion1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAsignacion1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion1Context asignacion1() throws RecognitionException {
		Asignacion1Context _localctx = new Asignacion1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_asignacion1);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_ASIG:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(TOKEN_ASIG);
				setState(203);
				expresion();
				setState(204);
				match(TOKEN_PYC);
				}
				break;
			case TOKEN_COR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				llamada_dimension();
				setState(207);
				match(TOKEN_ASIG);
				setState(208);
				expresion();
				setState(209);
				match(TOKEN_PYC);
				}
				break;
			case TOKEN_PAR_IZQ:
			case TOKEN_PYC:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				llamada_subproceso();
				setState(212);
				match(TOKEN_PYC);
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

	public static class Llamada_subprocesoContext extends ParserRuleContext {
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(GrammarParser.TOKEN_PAR_IZQ, 0); }
		public TerminalNode TOKEN_PAR_DER() { return getToken(GrammarParser.TOKEN_PAR_DER, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(GrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(GrammarParser.TOKEN_COMA, i);
		}
		public Llamada_subprocesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_subproceso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLlamada_subproceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_subprocesoContext llamada_subproceso() throws RecognitionException {
		Llamada_subprocesoContext _localctx = new Llamada_subprocesoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_llamada_subproceso);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(TOKEN_PAR_IZQ);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (VERDADERO - 10)) | (1L << (FALSO - 10)) | (1L << (NO - 10)) | (1L << (TOKEN_REAL - 10)) | (1L << (TOKEN_ENTERO - 10)) | (1L << (TOKEN_CADENA - 10)) | (1L << (TOKEN_ID - 10)) | (1L << (TOKEN_NEG - 10)) | (1L << (TOKEN_PAR_IZQ - 10)) | (1L << (TOKEN_MENOS - 10)))) != 0)) {
					{
					setState(217);
					expresion();
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TOKEN_COMA) {
						{
						{
						setState(218);
						match(TOKEN_COMA);
						setState(219);
						expresion();
						}
						}
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(227);
				match(TOKEN_PAR_DER);
				}
				break;
			case FINSI:
			case Y:
			case O:
			case MOD:
			case PARA:
			case HASTA:
			case CON:
			case CASO:
			case DEFINIR:
			case HACER:
			case ESCRIBIR:
			case LEER:
			case ENTONCES:
			case DIMENSION:
			case REPETIR:
			case MIENTRAS:
			case SI:
			case SINO:
			case SEGUN:
			case DE:
			case FINPROCESO:
			case FINALGORITMO:
			case FINMIENTRAS:
			case FINSEGUN:
			case FINPARA:
			case FINSUBPROCESO:
			case FINSUBALGORITMO:
			case FINFUNCION:
			case LIMPIAR:
			case BORRAR:
			case ESPERAR:
			case SEGUNDOS:
			case MILISEGUNDOS:
			case TOKEN_ID:
			case TOKEN_IGUAL:
			case TOKEN_MENOR:
			case TOKEN_DIF:
			case TOKEN_MENOR_IGUAL:
			case TOKEN_MAYOR:
			case TOKEN_MAYOR_IGUAL:
			case TOKEN_DIV:
			case TOKEN_PAR_DER:
			case TOKEN_MAS:
			case TOKEN_MENOS:
			case TOKEN_Y:
			case TOKEN_O:
			case TOKEN_COR_DER:
			case TOKEN_MUL:
			case TOKEN_MOD:
			case TOKEN_POT:
			case TOKEN_PYC:
			case TOKEN_COMA:
			case TOKEN_DOSP:
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

	public static class Llamada_dimensionContext extends ParserRuleContext {
		public TerminalNode TOKEN_COR_IZQ() { return getToken(GrammarParser.TOKEN_COR_IZQ, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode TOKEN_COR_DER() { return getToken(GrammarParser.TOKEN_COR_DER, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(GrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(GrammarParser.TOKEN_COMA, i);
		}
		public Llamada_dimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_dimension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLlamada_dimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_dimensionContext llamada_dimension() throws RecognitionException {
		Llamada_dimensionContext _localctx = new Llamada_dimensionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_llamada_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(TOKEN_COR_IZQ);
			setState(232);
			expresion();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(233);
				match(TOKEN_COMA);
				setState(234);
				expresion();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(TOKEN_COR_DER);
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

	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(GrammarParser.DIMENSION, 0); }
		public List<TerminalNode> TOKEN_ID() { return getTokens(GrammarParser.TOKEN_ID); }
		public TerminalNode TOKEN_ID(int i) {
			return getToken(GrammarParser.TOKEN_ID, i);
		}
		public List<Llamada_dimensionContext> llamada_dimension() {
			return getRuleContexts(Llamada_dimensionContext.class);
		}
		public Llamada_dimensionContext llamada_dimension(int i) {
			return getRuleContext(Llamada_dimensionContext.class,i);
		}
		public TerminalNode TOKEN_PYC() { return getToken(GrammarParser.TOKEN_PYC, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(GrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(GrammarParser.TOKEN_COMA, i);
		}
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(DIMENSION);
			setState(243);
			match(TOKEN_ID);
			setState(244);
			llamada_dimension();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(245);
				match(TOKEN_COMA);
				setState(246);
				match(TOKEN_ID);
				setState(247);
				llamada_dimension();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(TOKEN_PYC);
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

	public static class Condicional_siContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(GrammarParser.SI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(GrammarParser.ENTONCES, 0); }
		public Bloque_siContext bloque_si() {
			return getRuleContext(Bloque_siContext.class,0);
		}
		public Condicional_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional_si; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCondicional_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicional_siContext condicional_si() throws RecognitionException {
		Condicional_siContext _localctx = new Condicional_siContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condicional_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(SI);
			setState(256);
			expresion();
			setState(257);
			match(ENTONCES);
			setState(258);
			bloque_si();
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

	public static class Bloque_siContext extends ParserRuleContext {
		public Bloque_sinoContext bloque_sino() {
			return getRuleContext(Bloque_sinoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Bloque_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_si; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBloque_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_siContext bloque_si() throws RecognitionException {
		Bloque_siContext _localctx = new Bloque_siContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bloque_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
				{
				{
				setState(260);
				comando();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			bloque_sino();
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

	public static class Bloque_sinoContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(GrammarParser.SINO, 0); }
		public TerminalNode FINSI() { return getToken(GrammarParser.FINSI, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Bloque_sinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_sino; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBloque_sino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_sinoContext bloque_sino() throws RecognitionException {
		Bloque_sinoContext _localctx = new Bloque_sinoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bloque_sino);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(SINO);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
					{
					{
					setState(269);
					comando();
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(275);
				match(FINSI);
				}
				break;
			case FINSI:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(FINSI);
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

	public static class Ciclo_paraContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(GrammarParser.PARA, 0); }
		public TerminalNode TOKEN_ID() { return getToken(GrammarParser.TOKEN_ID, 0); }
		public TerminalNode TOKEN_ASIG() { return getToken(GrammarParser.TOKEN_ASIG, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode HASTA() { return getToken(GrammarParser.HASTA, 0); }
		public Ciclo_para1Context ciclo_para1() {
			return getRuleContext(Ciclo_para1Context.class,0);
		}
		public Ciclo_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_para; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCiclo_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_paraContext ciclo_para() throws RecognitionException {
		Ciclo_paraContext _localctx = new Ciclo_paraContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ciclo_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(PARA);
			setState(280);
			match(TOKEN_ID);
			setState(281);
			match(TOKEN_ASIG);
			setState(282);
			expresion();
			setState(283);
			match(HASTA);
			setState(284);
			expresion();
			setState(285);
			ciclo_para1();
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

	public static class Ciclo_para1Context extends ParserRuleContext {
		public TerminalNode CON() { return getToken(GrammarParser.CON, 0); }
		public TerminalNode PASO() { return getToken(GrammarParser.PASO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode HACER() { return getToken(GrammarParser.HACER, 0); }
		public Bloque_paraContext bloque_para() {
			return getRuleContext(Bloque_paraContext.class,0);
		}
		public Ciclo_para1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_para1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCiclo_para1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_para1Context ciclo_para1() throws RecognitionException {
		Ciclo_para1Context _localctx = new Ciclo_para1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_ciclo_para1);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CON:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(CON);
				setState(288);
				match(PASO);
				setState(289);
				expresion();
				setState(290);
				match(HACER);
				setState(291);
				bloque_para();
				}
				break;
			case HACER:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(HACER);
				setState(294);
				bloque_para();
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

	public static class Bloque_paraContext extends ParserRuleContext {
		public TerminalNode FINPARA() { return getToken(GrammarParser.FINPARA, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Bloque_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_para; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBloque_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_paraContext bloque_para() throws RecognitionException {
		Bloque_paraContext _localctx = new Bloque_paraContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bloque_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
				{
				{
				setState(297);
				comando();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(FINPARA);
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

	public static class Ciclo_mientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(GrammarParser.MIENTRAS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode HACER() { return getToken(GrammarParser.HACER, 0); }
		public Bloque_mientrasContext bloque_mientras() {
			return getRuleContext(Bloque_mientrasContext.class,0);
		}
		public Ciclo_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCiclo_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_mientrasContext ciclo_mientras() throws RecognitionException {
		Ciclo_mientrasContext _localctx = new Ciclo_mientrasContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ciclo_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(MIENTRAS);
			setState(306);
			expresion();
			setState(307);
			match(HACER);
			setState(308);
			bloque_mientras();
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

	public static class Bloque_mientrasContext extends ParserRuleContext {
		public TerminalNode FINMIENTRAS() { return getToken(GrammarParser.FINMIENTRAS, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Bloque_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBloque_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_mientrasContext bloque_mientras() throws RecognitionException {
		Bloque_mientrasContext _localctx = new Bloque_mientrasContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bloque_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
				{
				{
				setState(310);
				comando();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(FINMIENTRAS);
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

	public static class Ciclo_repetirContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(GrammarParser.REPETIR, 0); }
		public Bloque_repetirContext bloque_repetir() {
			return getRuleContext(Bloque_repetirContext.class,0);
		}
		public Ciclo_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_repetir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCiclo_repetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_repetirContext ciclo_repetir() throws RecognitionException {
		Ciclo_repetirContext _localctx = new Ciclo_repetirContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ciclo_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(REPETIR);
			setState(319);
			bloque_repetir();
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

	public static class Bloque_repetirContext extends ParserRuleContext {
		public TerminalNode HASTA() { return getToken(GrammarParser.HASTA, 0); }
		public TerminalNode QUE() { return getToken(GrammarParser.QUE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Bloque_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_repetir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBloque_repetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_repetirContext bloque_repetir() throws RecognitionException {
		Bloque_repetirContext _localctx = new Bloque_repetirContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bloque_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
				{
				{
				setState(321);
				comando();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			match(HASTA);
			setState(328);
			match(QUE);
			setState(329);
			expresion();
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

	public static class SegunContext extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(GrammarParser.SEGUN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode HACER() { return getToken(GrammarParser.HACER, 0); }
		public Bloque_segunContext bloque_segun() {
			return getRuleContext(Bloque_segunContext.class,0);
		}
		public SegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSegun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegunContext segun() throws RecognitionException {
		SegunContext _localctx = new SegunContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_segun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(SEGUN);
			setState(332);
			expresion();
			setState(333);
			match(HACER);
			setState(334);
			bloque_segun();
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

	public static class Bloque_segunContext extends ParserRuleContext {
		public FinsegunContext finsegun() {
			return getRuleContext(FinsegunContext.class,0);
		}
		public List<TerminalNode> CASO() { return getTokens(GrammarParser.CASO); }
		public TerminalNode CASO(int i) {
			return getToken(GrammarParser.CASO, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> TOKEN_DOSP() { return getTokens(GrammarParser.TOKEN_DOSP); }
		public TerminalNode TOKEN_DOSP(int i) {
			return getToken(GrammarParser.TOKEN_DOSP, i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Bloque_segunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_segun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBloque_segun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_segunContext bloque_segun() throws RecognitionException {
		Bloque_segunContext _localctx = new Bloque_segunContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bloque_segun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASO) {
				{
				{
				setState(336);
				match(CASO);
				setState(337);
				expresion();
				setState(338);
				match(TOKEN_DOSP);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
					{
					{
					setState(339);
					comando();
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			finsegun();
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

	public static class FinsegunContext extends ParserRuleContext {
		public TerminalNode FINSEGUN() { return getToken(GrammarParser.FINSEGUN, 0); }
		public TerminalNode DE() { return getToken(GrammarParser.DE, 0); }
		public TerminalNode OTRO() { return getToken(GrammarParser.OTRO, 0); }
		public TerminalNode MODO() { return getToken(GrammarParser.MODO, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(GrammarParser.TOKEN_DOSP, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public FinsegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finsegun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFinsegun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinsegunContext finsegun() throws RecognitionException {
		FinsegunContext _localctx = new FinsegunContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_finsegun);
		int _la;
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINSEGUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(FINSEGUN);
				}
				break;
			case DE:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(DE);
				setState(354);
				match(OTRO);
				setState(355);
				match(MODO);
				setState(356);
				match(TOKEN_DOSP);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
					{
					{
					setState(357);
					comando();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(FINSEGUN);
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

	public static class Comando_especialContext extends ParserRuleContext {
		public TerminalNode BORRAR() { return getToken(GrammarParser.BORRAR, 0); }
		public TerminalNode PANTALLA() { return getToken(GrammarParser.PANTALLA, 0); }
		public TerminalNode TOKEN_PYC() { return getToken(GrammarParser.TOKEN_PYC, 0); }
		public TerminalNode LIMPIAR() { return getToken(GrammarParser.LIMPIAR, 0); }
		public EsperarContext esperar() {
			return getRuleContext(EsperarContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public EscribirContext escribir() {
			return getRuleContext(EscribirContext.class,0);
		}
		public Comando_especialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_especial; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitComando_especial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_especialContext comando_especial() throws RecognitionException {
		Comando_especialContext _localctx = new Comando_especialContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_comando_especial);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BORRAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(BORRAR);
				setState(367);
				match(PANTALLA);
				setState(368);
				match(TOKEN_PYC);
				}
				break;
			case LIMPIAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(LIMPIAR);
				setState(370);
				match(PANTALLA);
				setState(371);
				match(TOKEN_PYC);
				}
				break;
			case ESPERAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				esperar();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				leer();
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				escribir();
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

	public static class EscribirContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(GrammarParser.ESCRIBIR, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode TOKEN_PYC() { return getToken(GrammarParser.TOKEN_PYC, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(GrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(GrammarParser.TOKEN_COMA, i);
		}
		public EscribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEscribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscribirContext escribir() throws RecognitionException {
		EscribirContext _localctx = new EscribirContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_escribir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(ESCRIBIR);
			setState(378);
			expresion();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(379);
				match(TOKEN_COMA);
				setState(380);
				expresion();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(TOKEN_PYC);
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

	public static class EsperarContext extends ParserRuleContext {
		public TerminalNode ESPERAR() { return getToken(GrammarParser.ESPERAR, 0); }
		public Esperar1Context esperar1() {
			return getRuleContext(Esperar1Context.class,0);
		}
		public EsperarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esperar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEsperar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsperarContext esperar() throws RecognitionException {
		EsperarContext _localctx = new EsperarContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_esperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(ESPERAR);
			setState(389);
			esperar1();
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

	public static class Esperar1Context extends ParserRuleContext {
		public TerminalNode TECLA() { return getToken(GrammarParser.TECLA, 0); }
		public TerminalNode TOKEN_PYC() { return getToken(GrammarParser.TOKEN_PYC, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public MedidaContext medida() {
			return getRuleContext(MedidaContext.class,0);
		}
		public Esperar1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esperar1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEsperar1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Esperar1Context esperar1() throws RecognitionException {
		Esperar1Context _localctx = new Esperar1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_esperar1);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TECLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(TECLA);
				setState(392);
				match(TOKEN_PYC);
				}
				break;
			case VERDADERO:
			case FALSO:
			case NO:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
			case TOKEN_CADENA:
			case TOKEN_ID:
			case TOKEN_NEG:
			case TOKEN_PAR_IZQ:
			case TOKEN_MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				expresion();
				setState(394);
				medida();
				setState(395);
				match(TOKEN_PYC);
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

	public static class MedidaContext extends ParserRuleContext {
		public TerminalNode SEGUNDOS() { return getToken(GrammarParser.SEGUNDOS, 0); }
		public TerminalNode MILISEGUNDOS() { return getToken(GrammarParser.MILISEGUNDOS, 0); }
		public MedidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_medida; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMedida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MedidaContext medida() throws RecognitionException {
		MedidaContext _localctx = new MedidaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_medida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_la = _input.LA(1);
			if ( !(_la==SEGUNDOS || _la==MILISEGUNDOS) ) {
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(GrammarParser.LEER, 0); }
		public Lista_leer_idContext lista_leer_id() {
			return getRuleContext(Lista_leer_idContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(GrammarParser.TOKEN_PYC, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(LEER);
			setState(402);
			lista_leer_id();
			setState(403);
			match(TOKEN_PYC);
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

	public static class Lista_leer_idContext extends ParserRuleContext {
		public List<TerminalNode> TOKEN_ID() { return getTokens(GrammarParser.TOKEN_ID); }
		public TerminalNode TOKEN_ID(int i) {
			return getToken(GrammarParser.TOKEN_ID, i);
		}
		public List<Lista_leer_id1Context> lista_leer_id1() {
			return getRuleContexts(Lista_leer_id1Context.class);
		}
		public Lista_leer_id1Context lista_leer_id1(int i) {
			return getRuleContext(Lista_leer_id1Context.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(GrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(GrammarParser.TOKEN_COMA, i);
		}
		public Lista_leer_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_leer_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLista_leer_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_leer_idContext lista_leer_id() throws RecognitionException {
		Lista_leer_idContext _localctx = new Lista_leer_idContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_lista_leer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(TOKEN_ID);
			setState(406);
			lista_leer_id1();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(407);
				match(TOKEN_COMA);
				setState(408);
				match(TOKEN_ID);
				setState(409);
				lista_leer_id1();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Lista_leer_id1Context extends ParserRuleContext {
		public Llamada_dimensionContext llamada_dimension() {
			return getRuleContext(Llamada_dimensionContext.class,0);
		}
		public Lista_leer_id1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_leer_id1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLista_leer_id1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_leer_id1Context lista_leer_id1() throws RecognitionException {
		Lista_leer_id1Context _localctx = new Lista_leer_id1Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_lista_leer_id1);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_COR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				llamada_dimension();
				}
				break;
			case TOKEN_PYC:
			case TOKEN_COMA:
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

	public static class ExpresionContext extends ParserRuleContext {
		public LogOrExprContext logOrExpr() {
			return getRuleContext(LogOrExprContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			logOrExpr();
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

	public static class LogOrExprContext extends ParserRuleContext {
		public LogAndExprContext logAndExpr() {
			return getRuleContext(LogAndExprContext.class,0);
		}
		public LogOrExpr1Context logOrExpr1() {
			return getRuleContext(LogOrExpr1Context.class,0);
		}
		public LogOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logOrExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLogOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogOrExprContext logOrExpr() throws RecognitionException {
		LogOrExprContext _localctx = new LogOrExprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_logOrExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			logAndExpr();
			setState(422);
			logOrExpr1();
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

	public static class LogOrExpr1Context extends ParserRuleContext {
		public LogAndExprContext logAndExpr() {
			return getRuleContext(LogAndExprContext.class,0);
		}
		public LogOrExpr1Context logOrExpr1() {
			return getRuleContext(LogOrExpr1Context.class,0);
		}
		public TerminalNode TOKEN_O() { return getToken(GrammarParser.TOKEN_O, 0); }
		public TerminalNode O() { return getToken(GrammarParser.O, 0); }
		public LogOrExpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logOrExpr1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLogOrExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogOrExpr1Context logOrExpr1() throws RecognitionException {
		LogOrExpr1Context _localctx = new LogOrExpr1Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_logOrExpr1);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case O:
			case TOKEN_O:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				_la = _input.LA(1);
				if ( !(_la==O || _la==TOKEN_O) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(425);
				logAndExpr();
				setState(426);
				logOrExpr1();
				}
				break;
			case FINSI:
			case PARA:
			case HASTA:
			case CON:
			case CASO:
			case DEFINIR:
			case HACER:
			case ESCRIBIR:
			case LEER:
			case ENTONCES:
			case DIMENSION:
			case REPETIR:
			case MIENTRAS:
			case SI:
			case SINO:
			case SEGUN:
			case DE:
			case FINPROCESO:
			case FINALGORITMO:
			case FINMIENTRAS:
			case FINSEGUN:
			case FINPARA:
			case FINSUBPROCESO:
			case FINSUBALGORITMO:
			case FINFUNCION:
			case LIMPIAR:
			case BORRAR:
			case ESPERAR:
			case SEGUNDOS:
			case MILISEGUNDOS:
			case TOKEN_ID:
			case TOKEN_PAR_DER:
			case TOKEN_COR_DER:
			case TOKEN_PYC:
			case TOKEN_COMA:
			case TOKEN_DOSP:
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

	public static class LogAndExprContext extends ParserRuleContext {
		public EquExprContext equExpr() {
			return getRuleContext(EquExprContext.class,0);
		}
		public LogAndExpr1Context logAndExpr1() {
			return getRuleContext(LogAndExpr1Context.class,0);
		}
		public LogAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logAndExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLogAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogAndExprContext logAndExpr() throws RecognitionException {
		LogAndExprContext _localctx = new LogAndExprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_logAndExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			equExpr();
			setState(432);
			logAndExpr1();
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

	public static class LogAndExpr1Context extends ParserRuleContext {
		public EquExprContext equExpr() {
			return getRuleContext(EquExprContext.class,0);
		}
		public LogAndExpr1Context logAndExpr1() {
			return getRuleContext(LogAndExpr1Context.class,0);
		}
		public TerminalNode TOKEN_Y() { return getToken(GrammarParser.TOKEN_Y, 0); }
		public TerminalNode Y() { return getToken(GrammarParser.Y, 0); }
		public LogAndExpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logAndExpr1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLogAndExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogAndExpr1Context logAndExpr1() throws RecognitionException {
		LogAndExpr1Context _localctx = new LogAndExpr1Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_logAndExpr1);
		int _la;
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Y:
			case TOKEN_Y:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				_la = _input.LA(1);
				if ( !(_la==Y || _la==TOKEN_Y) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(435);
				equExpr();
				setState(436);
				logAndExpr1();
				}
				break;
			case FINSI:
			case O:
			case PARA:
			case HASTA:
			case CON:
			case CASO:
			case DEFINIR:
			case HACER:
			case ESCRIBIR:
			case LEER:
			case ENTONCES:
			case DIMENSION:
			case REPETIR:
			case MIENTRAS:
			case SI:
			case SINO:
			case SEGUN:
			case DE:
			case FINPROCESO:
			case FINALGORITMO:
			case FINMIENTRAS:
			case FINSEGUN:
			case FINPARA:
			case FINSUBPROCESO:
			case FINSUBALGORITMO:
			case FINFUNCION:
			case LIMPIAR:
			case BORRAR:
			case ESPERAR:
			case SEGUNDOS:
			case MILISEGUNDOS:
			case TOKEN_ID:
			case TOKEN_PAR_DER:
			case TOKEN_O:
			case TOKEN_COR_DER:
			case TOKEN_PYC:
			case TOKEN_COMA:
			case TOKEN_DOSP:
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

	public static class EquExprContext extends ParserRuleContext {
		public RelExprContext relExpr() {
			return getRuleContext(RelExprContext.class,0);
		}
		public EquExpr1Context equExpr1() {
			return getRuleContext(EquExpr1Context.class,0);
		}
		public EquExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEquExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquExprContext equExpr() throws RecognitionException {
		EquExprContext _localctx = new EquExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_equExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			relExpr();
			setState(442);
			equExpr1();
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

	public static class EquExpr1Context extends ParserRuleContext {
		public OperEquContext operEqu() {
			return getRuleContext(OperEquContext.class,0);
		}
		public RelExprContext relExpr() {
			return getRuleContext(RelExprContext.class,0);
		}
		public EquExpr1Context equExpr1() {
			return getRuleContext(EquExpr1Context.class,0);
		}
		public EquExpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equExpr1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEquExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquExpr1Context equExpr1() throws RecognitionException {
		EquExpr1Context _localctx = new EquExpr1Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_equExpr1);
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_IGUAL:
			case TOKEN_DIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				operEqu();
				setState(445);
				relExpr();
				setState(446);
				equExpr1();
				}
				break;
			case FINSI:
			case Y:
			case O:
			case PARA:
			case HASTA:
			case CON:
			case CASO:
			case DEFINIR:
			case HACER:
			case ESCRIBIR:
			case LEER:
			case ENTONCES:
			case DIMENSION:
			case REPETIR:
			case MIENTRAS:
			case SI:
			case SINO:
			case SEGUN:
			case DE:
			case FINPROCESO:
			case FINALGORITMO:
			case FINMIENTRAS:
			case FINSEGUN:
			case FINPARA:
			case FINSUBPROCESO:
			case FINSUBALGORITMO:
			case FINFUNCION:
			case LIMPIAR:
			case BORRAR:
			case ESPERAR:
			case SEGUNDOS:
			case MILISEGUNDOS:
			case TOKEN_ID:
			case TOKEN_PAR_DER:
			case TOKEN_Y:
			case TOKEN_O:
			case TOKEN_COR_DER:
			case TOKEN_PYC:
			case TOKEN_COMA:
			case TOKEN_DOSP:
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

	public static class RelExprContext extends ParserRuleContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public RelExpr1Context relExpr1() {
			return getRuleContext(RelExpr1Context.class,0);
		}
		public RelExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRelExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExprContext relExpr() throws RecognitionException {
		RelExprContext _localctx = new RelExprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_relExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			addExpr();
			setState(452);
			relExpr1();
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

	public static class RelExpr1Context extends ParserRuleContext {
		public OperRelContext operRel() {
			return getRuleContext(OperRelContext.class,0);
		}
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public RelExpr1Context relExpr1() {
			return getRuleContext(RelExpr1Context.class,0);
		}
		public RelExpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpr1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRelExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExpr1Context relExpr1() throws RecognitionException {
		RelExpr1Context _localctx = new RelExpr1Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_relExpr1);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_MENOR:
			case TOKEN_MENOR_IGUAL:
			case TOKEN_MAYOR:
			case TOKEN_MAYOR_IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				operRel();
				setState(455);
				addExpr();
				setState(456);
				relExpr1();
				}
				break;
			case FINSI:
			case Y:
			case O:
			case PARA:
			case HASTA:
			case CON:
			case CASO:
			case DEFINIR:
			case HACER:
			case ESCRIBIR:
			case LEER:
			case ENTONCES:
			case DIMENSION:
			case REPETIR:
			case MIENTRAS:
			case SI:
			case SINO:
			case SEGUN:
			case DE:
			case FINPROCESO:
			case FINALGORITMO:
			case FINMIENTRAS:
			case FINSEGUN:
			case FINPARA:
			case FINSUBPROCESO:
			case FINSUBALGORITMO:
			case FINFUNCION:
			case LIMPIAR:
			case BORRAR:
			case ESPERAR:
			case SEGUNDOS:
			case MILISEGUNDOS:
			case TOKEN_ID:
			case TOKEN_IGUAL:
			case TOKEN_DIF:
			case TOKEN_PAR_DER:
			case TOKEN_Y:
			case TOKEN_O:
			case TOKEN_COR_DER:
			case TOKEN_PYC:
			case TOKEN_COMA:
			case TOKEN_DOSP:
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

	public static class AddExprContext extends ParserRuleContext {
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public AddExpr1Context addExpr1() {
			return getRuleContext(AddExpr1Context.class,0);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_addExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			mulExpr();
			setState(462);
			addExpr1();
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

	public static class AddExpr1Context extends ParserRuleContext {
		public OperAddContext operAdd() {
			return getRuleContext(OperAddContext.class,0);
		}
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public AddExpr1Context addExpr1() {
			return getRuleContext(AddExpr1Context.class,0);
		}
		public AddExpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAddExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpr1Context addExpr1() throws RecognitionException {
		AddExpr1Context _localctx = new AddExpr1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_addExpr1);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_MAS:
			case TOKEN_MENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				operAdd();
				setState(465);
				mulExpr();
				setState(466);
				addExpr1();
				}
				break;
			case FINSI:
			case Y:
			case O:
			case PARA:
			case HASTA:
			case CON:
			case CASO:
			case DEFINIR:
			case HACER:
			case ESCRIBIR:
			case LEER:
			case ENTONCES:
			case DIMENSION:
			case REPETIR:
			case MIENTRAS:
			case SI:
			case SINO:
			case SEGUN:
			case DE:
			case FINPROCESO:
			case FINALGORITMO:
			case FINMIENTRAS:
			case FINSEGUN:
			case FINPARA:
			case FINSUBPROCESO:
			case FINSUBALGORITMO:
			case FINFUNCION:
			case LIMPIAR:
			case BORRAR:
			case ESPERAR:
			case SEGUNDOS:
			case MILISEGUNDOS:
			case TOKEN_ID:
			case TOKEN_IGUAL:
			case TOKEN_MENOR:
			case TOKEN_DIF:
			case TOKEN_MENOR_IGUAL:
			case TOKEN_MAYOR:
			case TOKEN_MAYOR_IGUAL:
			case TOKEN_PAR_DER:
			case TOKEN_Y:
			case TOKEN_O:
			case TOKEN_COR_DER:
			case TOKEN_PYC:
			case TOKEN_COMA:
			case TOKEN_DOSP:
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

	public static class MulExprContext extends ParserRuleContext {
		public ExpExprContext expExpr() {
			return getRuleContext(ExpExprContext.class,0);
		}
		public MulExpr1Context mulExpr1() {
			return getRuleContext(MulExpr1Context.class,0);
		}
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_mulExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			expExpr();
			setState(472);
			mulExpr1();
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

	public static class MulExpr1Context extends ParserRuleContext {
		public OperMulContext operMul() {
			return getRuleContext(OperMulContext.class,0);
		}
		public ExpExprContext expExpr() {
			return getRuleContext(ExpExprContext.class,0);
		}
		public MulExpr1Context mulExpr1() {
			return getRuleContext(MulExpr1Context.class,0);
		}
		public MulExpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMulExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExpr1Context mulExpr1() throws RecognitionException {
		MulExpr1Context _localctx = new MulExpr1Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_mulExpr1);
		try {
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOD:
			case TOKEN_DIV:
			case TOKEN_MUL:
			case TOKEN_MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				operMul();
				setState(475);
				expExpr();
				setState(476);
				mulExpr1();
				}
				break;
			case FINSI:
			case Y:
			case O:
			case PARA:
			case HASTA:
			case CON:
			case CASO:
			case DEFINIR:
			case HACER:
			case ESCRIBIR:
			case LEER:
			case ENTONCES:
			case DIMENSION:
			case REPETIR:
			case MIENTRAS:
			case SI:
			case SINO:
			case SEGUN:
			case DE:
			case FINPROCESO:
			case FINALGORITMO:
			case FINMIENTRAS:
			case FINSEGUN:
			case FINPARA:
			case FINSUBPROCESO:
			case FINSUBALGORITMO:
			case FINFUNCION:
			case LIMPIAR:
			case BORRAR:
			case ESPERAR:
			case SEGUNDOS:
			case MILISEGUNDOS:
			case TOKEN_ID:
			case TOKEN_IGUAL:
			case TOKEN_MENOR:
			case TOKEN_DIF:
			case TOKEN_MENOR_IGUAL:
			case TOKEN_MAYOR:
			case TOKEN_MAYOR_IGUAL:
			case TOKEN_PAR_DER:
			case TOKEN_MAS:
			case TOKEN_MENOS:
			case TOKEN_Y:
			case TOKEN_O:
			case TOKEN_COR_DER:
			case TOKEN_PYC:
			case TOKEN_COMA:
			case TOKEN_DOSP:
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

	public static class ExpExprContext extends ParserRuleContext {
		public PrContext pr() {
			return getRuleContext(PrContext.class,0);
		}
		public ExpExpr1Context expExpr1() {
			return getRuleContext(ExpExpr1Context.class,0);
		}
		public ExpExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpExprContext expExpr() throws RecognitionException {
		ExpExprContext _localctx = new ExpExprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			pr();
			setState(482);
			expExpr1();
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

	public static class ExpExpr1Context extends ParserRuleContext {
		public OperExpContext operExp() {
			return getRuleContext(OperExpContext.class,0);
		}
		public PrContext pr() {
			return getRuleContext(PrContext.class,0);
		}
		public ExpExpr1Context expExpr1() {
			return getRuleContext(ExpExpr1Context.class,0);
		}
		public ExpExpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expExpr1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpExpr1Context expExpr1() throws RecognitionException {
		ExpExpr1Context _localctx = new ExpExpr1Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_expExpr1);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_POT:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				operExp();
				setState(485);
				pr();
				setState(486);
				expExpr1();
				}
				break;
			case FINSI:
			case Y:
			case O:
			case MOD:
			case PARA:
			case HASTA:
			case CON:
			case CASO:
			case DEFINIR:
			case HACER:
			case ESCRIBIR:
			case LEER:
			case ENTONCES:
			case DIMENSION:
			case REPETIR:
			case MIENTRAS:
			case SI:
			case SINO:
			case SEGUN:
			case DE:
			case FINPROCESO:
			case FINALGORITMO:
			case FINMIENTRAS:
			case FINSEGUN:
			case FINPARA:
			case FINSUBPROCESO:
			case FINSUBALGORITMO:
			case FINFUNCION:
			case LIMPIAR:
			case BORRAR:
			case ESPERAR:
			case SEGUNDOS:
			case MILISEGUNDOS:
			case TOKEN_ID:
			case TOKEN_IGUAL:
			case TOKEN_MENOR:
			case TOKEN_DIF:
			case TOKEN_MENOR_IGUAL:
			case TOKEN_MAYOR:
			case TOKEN_MAYOR_IGUAL:
			case TOKEN_DIV:
			case TOKEN_PAR_DER:
			case TOKEN_MAS:
			case TOKEN_MENOS:
			case TOKEN_Y:
			case TOKEN_O:
			case TOKEN_COR_DER:
			case TOKEN_MUL:
			case TOKEN_MOD:
			case TOKEN_PYC:
			case TOKEN_COMA:
			case TOKEN_DOSP:
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

	public static class OperEquContext extends ParserRuleContext {
		public TerminalNode TOKEN_IGUAL() { return getToken(GrammarParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_DIF() { return getToken(GrammarParser.TOKEN_DIF, 0); }
		public OperEquContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operEqu; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOperEqu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperEquContext operEqu() throws RecognitionException {
		OperEquContext _localctx = new OperEquContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_operEqu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_IGUAL || _la==TOKEN_DIF) ) {
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

	public static class OperRelContext extends ParserRuleContext {
		public TerminalNode TOKEN_MENOR() { return getToken(GrammarParser.TOKEN_MENOR, 0); }
		public TerminalNode TOKEN_MAYOR() { return getToken(GrammarParser.TOKEN_MAYOR, 0); }
		public TerminalNode TOKEN_MENOR_IGUAL() { return getToken(GrammarParser.TOKEN_MENOR_IGUAL, 0); }
		public TerminalNode TOKEN_MAYOR_IGUAL() { return getToken(GrammarParser.TOKEN_MAYOR_IGUAL, 0); }
		public OperRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operRel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOperRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperRelContext operRel() throws RecognitionException {
		OperRelContext _localctx = new OperRelContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_operRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (TOKEN_MENOR - 63)) | (1L << (TOKEN_MENOR_IGUAL - 63)) | (1L << (TOKEN_MAYOR - 63)) | (1L << (TOKEN_MAYOR_IGUAL - 63)))) != 0)) ) {
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

	public static class OperAddContext extends ParserRuleContext {
		public TerminalNode TOKEN_MAS() { return getToken(GrammarParser.TOKEN_MAS, 0); }
		public TerminalNode TOKEN_MENOS() { return getToken(GrammarParser.TOKEN_MENOS, 0); }
		public OperAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operAdd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOperAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperAddContext operAdd() throws RecognitionException {
		OperAddContext _localctx = new OperAddContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_operAdd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_MAS || _la==TOKEN_MENOS) ) {
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

	public static class OperMulContext extends ParserRuleContext {
		public TerminalNode TOKEN_MUL() { return getToken(GrammarParser.TOKEN_MUL, 0); }
		public TerminalNode TOKEN_DIV() { return getToken(GrammarParser.TOKEN_DIV, 0); }
		public TerminalNode TOKEN_MOD() { return getToken(GrammarParser.TOKEN_MOD, 0); }
		public TerminalNode MOD() { return getToken(GrammarParser.MOD, 0); }
		public OperMulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operMul; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOperMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperMulContext operMul() throws RecognitionException {
		OperMulContext _localctx = new OperMulContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_operMul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_la = _input.LA(1);
			if ( !(_la==MOD || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TOKEN_DIV - 69)) | (1L << (TOKEN_MUL - 69)) | (1L << (TOKEN_MOD - 69)))) != 0)) ) {
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

	public static class OperExpContext extends ParserRuleContext {
		public TerminalNode TOKEN_POT() { return getToken(GrammarParser.TOKEN_POT, 0); }
		public OperExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOperExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperExpContext operExp() throws RecognitionException {
		OperExpContext _localctx = new OperExpContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_operExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(TOKEN_POT);
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

	public static class PrContext extends ParserRuleContext {
		public TerminalNode FALSO() { return getToken(GrammarParser.FALSO, 0); }
		public TerminalNode VERDADERO() { return getToken(GrammarParser.VERDADERO, 0); }
		public TerminalNode TOKEN_ENTERO() { return getToken(GrammarParser.TOKEN_ENTERO, 0); }
		public TerminalNode TOKEN_REAL() { return getToken(GrammarParser.TOKEN_REAL, 0); }
		public TerminalNode TOKEN_CADENA() { return getToken(GrammarParser.TOKEN_CADENA, 0); }
		public TerminalNode TOKEN_ID() { return getToken(GrammarParser.TOKEN_ID, 0); }
		public Expresion_llamadaContext expresion_llamada() {
			return getRuleContext(Expresion_llamadaContext.class,0);
		}
		public TerminalNode TOKEN_MENOS() { return getToken(GrammarParser.TOKEN_MENOS, 0); }
		public PrContext pr() {
			return getRuleContext(PrContext.class,0);
		}
		public TerminalNode TOKEN_NEG() { return getToken(GrammarParser.TOKEN_NEG, 0); }
		public TerminalNode NO() { return getToken(GrammarParser.NO, 0); }
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(GrammarParser.TOKEN_PAR_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(GrammarParser.TOKEN_PAR_DER, 0); }
		public PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrContext pr() throws RecognitionException {
		PrContext _localctx = new PrContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_pr);
		int _la;
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				match(FALSO);
				}
				break;
			case VERDADERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(VERDADERO);
				}
				break;
			case TOKEN_ENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				match(TOKEN_ENTERO);
				}
				break;
			case TOKEN_REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(504);
				match(TOKEN_REAL);
				}
				break;
			case TOKEN_CADENA:
				enterOuterAlt(_localctx, 5);
				{
				setState(505);
				match(TOKEN_CADENA);
				}
				break;
			case TOKEN_ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(506);
				match(TOKEN_ID);
				setState(507);
				expresion_llamada();
				}
				break;
			case TOKEN_MENOS:
				enterOuterAlt(_localctx, 7);
				{
				setState(508);
				match(TOKEN_MENOS);
				setState(509);
				pr();
				}
				break;
			case NO:
			case TOKEN_NEG:
				enterOuterAlt(_localctx, 8);
				{
				setState(510);
				_la = _input.LA(1);
				if ( !(_la==NO || _la==TOKEN_NEG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(511);
				pr();
				}
				break;
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(512);
				match(TOKEN_PAR_IZQ);
				setState(513);
				expresion();
				setState(514);
				match(TOKEN_PAR_DER);
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

	public static class Expresion_llamadaContext extends ParserRuleContext {
		public Llamada_subprocesoContext llamada_subproceso() {
			return getRuleContext(Llamada_subprocesoContext.class,0);
		}
		public Llamada_dimensionContext llamada_dimension() {
			return getRuleContext(Llamada_dimensionContext.class,0);
		}
		public Expresion_llamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_llamada; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpresion_llamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_llamadaContext expresion_llamada() throws RecognitionException {
		Expresion_llamadaContext _localctx = new Expresion_llamadaContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expresion_llamada);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINSI:
			case Y:
			case O:
			case MOD:
			case PARA:
			case HASTA:
			case CON:
			case CASO:
			case DEFINIR:
			case HACER:
			case ESCRIBIR:
			case LEER:
			case ENTONCES:
			case DIMENSION:
			case REPETIR:
			case MIENTRAS:
			case SI:
			case SINO:
			case SEGUN:
			case DE:
			case FINPROCESO:
			case FINALGORITMO:
			case FINMIENTRAS:
			case FINSEGUN:
			case FINPARA:
			case FINSUBPROCESO:
			case FINSUBALGORITMO:
			case FINFUNCION:
			case LIMPIAR:
			case BORRAR:
			case ESPERAR:
			case SEGUNDOS:
			case MILISEGUNDOS:
			case TOKEN_ID:
			case TOKEN_IGUAL:
			case TOKEN_MENOR:
			case TOKEN_DIF:
			case TOKEN_MENOR_IGUAL:
			case TOKEN_MAYOR:
			case TOKEN_MAYOR_IGUAL:
			case TOKEN_DIV:
			case TOKEN_PAR_IZQ:
			case TOKEN_PAR_DER:
			case TOKEN_MAS:
			case TOKEN_MENOS:
			case TOKEN_Y:
			case TOKEN_O:
			case TOKEN_COR_DER:
			case TOKEN_MUL:
			case TOKEN_MOD:
			case TOKEN_POT:
			case TOKEN_PYC:
			case TOKEN_COMA:
			case TOKEN_DOSP:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				llamada_subproceso();
				}
				break;
			case TOKEN_COR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				llamada_dimension();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3X\u020d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0081\n\3\f\3\16\3\u0084\13\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\5\6\u008f\n\6\3\6\3\6\5\6\u0093\n\6\3\7\3\7\3"+
		"\7\3\7\7\7\u0099\n\7\f\7\16\7\u009c\13\7\5\7\u009e\n\7\3\7\3\7\3\b\3\b"+
		"\3\b\7\b\u00a5\n\b\f\b\16\b\u00a8\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b9\n\13\3\f\3\f\3\f\3\f"+
		"\7\f\u00bf\n\f\f\f\16\f\u00c2\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d9"+
		"\n\17\3\20\3\20\3\20\3\20\7\20\u00df\n\20\f\20\16\20\u00e2\13\20\5\20"+
		"\u00e4\n\20\3\20\3\20\5\20\u00e8\n\20\3\21\3\21\3\21\3\21\7\21\u00ee\n"+
		"\21\f\21\16\21\u00f1\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u00fb\n\22\f\22\16\22\u00fe\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\7\24\u0108\n\24\f\24\16\24\u010b\13\24\3\24\3\24\3\25\3\25\7\25"+
		"\u0111\n\25\f\25\16\25\u0114\13\25\3\25\3\25\5\25\u0118\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u012a\n\27\3\30\7\30\u012d\n\30\f\30\16\30\u0130\13\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\7\32\u013a\n\32\f\32\16\32\u013d\13\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\7\34\u0145\n\34\f\34\16\34\u0148\13\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36"+
		"\u0157\n\36\f\36\16\36\u015a\13\36\7\36\u015c\n\36\f\36\16\36\u015f\13"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0169\n\37\f\37\16\37"+
		"\u016c\13\37\3\37\5\37\u016f\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u017a"+
		"\n \3!\3!\3!\3!\7!\u0180\n!\f!\16!\u0183\13!\3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\5#\u0190\n#\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\7&\u019d\n&\f"+
		"&\16&\u01a0\13&\3\'\3\'\5\'\u01a4\n\'\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\5"+
		"*\u01b0\n*\3+\3+\3+\3,\3,\3,\3,\3,\5,\u01ba\n,\3-\3-\3-\3.\3.\3.\3.\3"+
		".\5.\u01c4\n.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\5\60\u01ce\n\60\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\62\5\62\u01d8\n\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u01e2\n\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u01ec\n\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0207\n<\3=\3=\5=\u020b\n=\3=\2\2>"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvx\2\17\3\2(*\3\2\60\62\3\2 !\3\2+,\3\2\4\13\3"+
		"\29:\4\2\17\17MM\4\2\16\16LL\4\2@@CC\4\2AADF\3\2JK\5\2\21\21GGPQ\4\2\20"+
		"\20??\2\u020a\2z\3\2\2\2\4|\3\2\2\2\6\u0087\3\2\2\2\b\u0089\3\2\2\2\n"+
		"\u0092\3\2\2\2\f\u0094\3\2\2\2\16\u00a1\3\2\2\2\20\u00ab\3\2\2\2\22\u00ad"+
		"\3\2\2\2\24\u00b8\3\2\2\2\26\u00ba\3\2\2\2\30\u00c7\3\2\2\2\32\u00c9\3"+
		"\2\2\2\34\u00d8\3\2\2\2\36\u00e7\3\2\2\2 \u00e9\3\2\2\2\"\u00f4\3\2\2"+
		"\2$\u0101\3\2\2\2&\u0109\3\2\2\2(\u0117\3\2\2\2*\u0119\3\2\2\2,\u0129"+
		"\3\2\2\2.\u012e\3\2\2\2\60\u0133\3\2\2\2\62\u013b\3\2\2\2\64\u0140\3\2"+
		"\2\2\66\u0146\3\2\2\28\u014d\3\2\2\2:\u015d\3\2\2\2<\u016e\3\2\2\2>\u0179"+
		"\3\2\2\2@\u017b\3\2\2\2B\u0186\3\2\2\2D\u018f\3\2\2\2F\u0191\3\2\2\2H"+
		"\u0193\3\2\2\2J\u0197\3\2\2\2L\u01a3\3\2\2\2N\u01a5\3\2\2\2P\u01a7\3\2"+
		"\2\2R\u01af\3\2\2\2T\u01b1\3\2\2\2V\u01b9\3\2\2\2X\u01bb\3\2\2\2Z\u01c3"+
		"\3\2\2\2\\\u01c5\3\2\2\2^\u01cd\3\2\2\2`\u01cf\3\2\2\2b\u01d7\3\2\2\2"+
		"d\u01d9\3\2\2\2f\u01e1\3\2\2\2h\u01e3\3\2\2\2j\u01eb\3\2\2\2l\u01ed\3"+
		"\2\2\2n\u01ef\3\2\2\2p\u01f1\3\2\2\2r\u01f3\3\2\2\2t\u01f5\3\2\2\2v\u0206"+
		"\3\2\2\2x\u020a\3\2\2\2z{\5\32\16\2{\3\3\2\2\2|}\5\6\4\2}~\7>\2\2~\u0082"+
		"\5\n\6\2\177\u0081\5\24\13\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0086\5\b\5\2\u0086\5\3\2\2\2\u0087\u0088\t\2\2\2\u0088\7\3"+
		"\2\2\2\u0089\u008a\t\3\2\2\u008a\t\3\2\2\2\u008b\u008c\7B\2\2\u008c\u008e"+
		"\7>\2\2\u008d\u008f\5\f\7\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0093\3\2\2\2\u0090\u0093\5\f\7\2\u0091\u0093\3\2\2\2\u0092\u008b\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\13\3\2\2\2\u0094\u009d"+
		"\7H\2\2\u0095\u009a\7>\2\2\u0096\u0097\7T\2\2\u0097\u0099\7>\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u0095\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7I\2\2\u00a0\r\3\2\2\2"+
		"\u00a1\u00a2\5\20\t\2\u00a2\u00a6\7>\2\2\u00a3\u00a5\5\24\13\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\5\22\n\2\u00aa\17\3\2\2"+
		"\2\u00ab\u00ac\t\4\2\2\u00ac\21\3\2\2\2\u00ad\u00ae\t\5\2\2\u00ae\23\3"+
		"\2\2\2\u00af\u00b9\5\26\f\2\u00b0\u00b9\5\32\16\2\u00b1\u00b9\5\"\22\2"+
		"\u00b2\u00b9\5$\23\2\u00b3\u00b9\5*\26\2\u00b4\u00b9\5\60\31\2\u00b5\u00b9"+
		"\5\64\33\2\u00b6\u00b9\58\35\2\u00b7\u00b9\5> \2\u00b8\u00af\3\2\2\2\u00b8"+
		"\u00b0\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b3\3\2"+
		"\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\25\3\2\2\2\u00ba\u00bb\7\27\2\2\u00bb\u00c0\7>\2"+
		"\2\u00bc\u00bd\7T\2\2\u00bd\u00bf\7>\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c2"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\7\31\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\7"+
		"S\2\2\u00c6\27\3\2\2\2\u00c7\u00c8\t\6\2\2\u00c8\31\3\2\2\2\u00c9\u00ca"+
		"\7>\2\2\u00ca\u00cb\5\34\17\2\u00cb\33\3\2\2\2\u00cc\u00cd\7B\2\2\u00cd"+
		"\u00ce\5N(\2\u00ce\u00cf\7S\2\2\u00cf\u00d9\3\2\2\2\u00d0\u00d1\5 \21"+
		"\2\u00d1\u00d2\7B\2\2\u00d2\u00d3\5N(\2\u00d3\u00d4\7S\2\2\u00d4\u00d9"+
		"\3\2\2\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\7S\2\2\u00d7\u00d9\3\2\2\2"+
		"\u00d8\u00cc\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\35"+
		"\3\2\2\2\u00da\u00e3\7H\2\2\u00db\u00e0\5N(\2\u00dc\u00dd\7T\2\2\u00dd"+
		"\u00df\5N(\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2"+
		"\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00db"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\7I\2\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00da\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\37\3\2\2"+
		"\2\u00e9\u00ea\7O\2\2\u00ea\u00ef\5N(\2\u00eb\u00ec\7T\2\2\u00ec\u00ee"+
		"\5N(\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7N"+
		"\2\2\u00f3!\3\2\2\2\u00f4\u00f5\7\35\2\2\u00f5\u00f6\7>\2\2\u00f6\u00fc"+
		"\5 \21\2\u00f7\u00f8\7T\2\2\u00f8\u00f9\7>\2\2\u00f9\u00fb\5 \21\2\u00fa"+
		"\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7S\2\2\u0100"+
		"#\3\2\2\2\u0101\u0102\7\"\2\2\u0102\u0103\5N(\2\u0103\u0104\7\34\2\2\u0104"+
		"\u0105\5&\24\2\u0105%\3\2\2\2\u0106\u0108\5\24\13\2\u0107\u0106\3\2\2"+
		"\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\5(\25\2\u010d\'\3\2\2\2\u010e"+
		"\u0112\7#\2\2\u010f\u0111\5\24\13\2\u0110\u010f\3\2\2\2\u0111\u0114\3"+
		"\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0118\7\3\2\2\u0116\u0118\7\3\2\2\u0117\u010e\3\2"+
		"\2\2\u0117\u0116\3\2\2\2\u0118)\3\2\2\2\u0119\u011a\7\22\2\2\u011a\u011b"+
		"\7>\2\2\u011b\u011c\7B\2\2\u011c\u011d\5N(\2\u011d\u011e\7\23\2\2\u011e"+
		"\u011f\5N(\2\u011f\u0120\5,\27\2\u0120+\3\2\2\2\u0121\u0122\7\24\2\2\u0122"+
		"\u0123\7\26\2\2\u0123\u0124\5N(\2\u0124\u0125\7\30\2\2\u0125\u0126\5."+
		"\30\2\u0126\u012a\3\2\2\2\u0127\u0128\7\30\2\2\u0128\u012a\5.\30\2\u0129"+
		"\u0121\3\2\2\2\u0129\u0127\3\2\2\2\u012a-\3\2\2\2\u012b\u012d\5\24\13"+
		"\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7/\2\2\u0132"+
		"/\3\2\2\2\u0133\u0134\7\37\2\2\u0134\u0135\5N(\2\u0135\u0136\7\30\2\2"+
		"\u0136\u0137\5\62\32\2\u0137\61\3\2\2\2\u0138\u013a\5\24\13\2\u0139\u0138"+
		"\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7-\2\2\u013f\63\3\2\2\2"+
		"\u0140\u0141\7\36\2\2\u0141\u0142\5\66\34\2\u0142\65\3\2\2\2\u0143\u0145"+
		"\5\24\13\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a"+
		"\7\23\2\2\u014a\u014b\7\63\2\2\u014b\u014c\5N(\2\u014c\67\3\2\2\2\u014d"+
		"\u014e\7$\2\2\u014e\u014f\5N(\2\u014f\u0150\7\30\2\2\u0150\u0151\5:\36"+
		"\2\u01519\3\2\2\2\u0152\u0153\7\25\2\2\u0153\u0154\5N(\2\u0154\u0158\7"+
		"U\2\2\u0155\u0157\5\24\13\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015b\u0152\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\5<"+
		"\37\2\u0161;\3\2\2\2\u0162\u016f\7.\2\2\u0163\u0164\7%\2\2\u0164\u0165"+
		"\7&\2\2\u0165\u0166\7\'\2\2\u0166\u016a\7U\2\2\u0167\u0169\5\24\13\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016f\7.\2\2\u016e"+
		"\u0162\3\2\2\2\u016e\u0163\3\2\2\2\u016f=\3\2\2\2\u0170\u0171\7\65\2\2"+
		"\u0171\u0172\7\66\2\2\u0172\u017a\7S\2\2\u0173\u0174\7\64\2\2\u0174\u0175"+
		"\7\66\2\2\u0175\u017a\7S\2\2\u0176\u017a\5B\"\2\u0177\u017a\5H%\2\u0178"+
		"\u017a\5@!\2\u0179\u0170\3\2\2\2\u0179\u0173\3\2\2\2\u0179\u0176\3\2\2"+
		"\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a?\3\2\2\2\u017b\u017c"+
		"\7\32\2\2\u017c\u0181\5N(\2\u017d\u017e\7T\2\2\u017e\u0180\5N(\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7S\2\2\u0185"+
		"A\3\2\2\2\u0186\u0187\7\67\2\2\u0187\u0188\5D#\2\u0188C\3\2\2\2\u0189"+
		"\u018a\78\2\2\u018a\u0190\7S\2\2\u018b\u018c\5N(\2\u018c\u018d\5F$\2\u018d"+
		"\u018e\7S\2\2\u018e\u0190\3\2\2\2\u018f\u0189\3\2\2\2\u018f\u018b\3\2"+
		"\2\2\u0190E\3\2\2\2\u0191\u0192\t\7\2\2\u0192G\3\2\2\2\u0193\u0194\7\33"+
		"\2\2\u0194\u0195\5J&\2\u0195\u0196\7S\2\2\u0196I\3\2\2\2\u0197\u0198\7"+
		">\2\2\u0198\u019e\5L\'\2\u0199\u019a\7T\2\2\u019a\u019b\7>\2\2\u019b\u019d"+
		"\5L\'\2\u019c\u0199\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019fK\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a4\5 \21\2"+
		"\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4M\3"+
		"\2\2\2\u01a5\u01a6\5P)\2\u01a6O\3\2\2\2\u01a7\u01a8\5T+\2\u01a8\u01a9"+
		"\5R*\2\u01a9Q\3\2\2\2\u01aa\u01ab\t\b\2\2\u01ab\u01ac\5T+\2\u01ac\u01ad"+
		"\5R*\2\u01ad\u01b0\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01aa\3\2\2\2\u01af"+
		"\u01ae\3\2\2\2\u01b0S\3\2\2\2\u01b1\u01b2\5X-\2\u01b2\u01b3\5V,\2\u01b3"+
		"U\3\2\2\2\u01b4\u01b5\t\t\2\2\u01b5\u01b6\5X-\2\u01b6\u01b7\5V,\2\u01b7"+
		"\u01ba\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b4\3\2\2\2\u01b9\u01b8\3\2"+
		"\2\2\u01baW\3\2\2\2\u01bb\u01bc\5\\/\2\u01bc\u01bd\5Z.\2\u01bdY\3\2\2"+
		"\2\u01be\u01bf\5l\67\2\u01bf\u01c0\5\\/\2\u01c0\u01c1\5Z.\2\u01c1\u01c4"+
		"\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01be\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4"+
		"[\3\2\2\2\u01c5\u01c6\5`\61\2\u01c6\u01c7\5^\60\2\u01c7]\3\2\2\2\u01c8"+
		"\u01c9\5n8\2\u01c9\u01ca\5`\61\2\u01ca\u01cb\5^\60\2\u01cb\u01ce\3\2\2"+
		"\2\u01cc\u01ce\3\2\2\2\u01cd\u01c8\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce_"+
		"\3\2\2\2\u01cf\u01d0\5d\63\2\u01d0\u01d1\5b\62\2\u01d1a\3\2\2\2\u01d2"+
		"\u01d3\5p9\2\u01d3\u01d4\5d\63\2\u01d4\u01d5\5b\62\2\u01d5\u01d8\3\2\2"+
		"\2\u01d6\u01d8\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8c"+
		"\3\2\2\2\u01d9\u01da\5h\65\2\u01da\u01db\5f\64\2\u01dbe\3\2\2\2\u01dc"+
		"\u01dd\5r:\2\u01dd\u01de\5h\65\2\u01de\u01df\5f\64\2\u01df\u01e2\3\2\2"+
		"\2\u01e0\u01e2\3\2\2\2\u01e1\u01dc\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2g"+
		"\3\2\2\2\u01e3\u01e4\5v<\2\u01e4\u01e5\5j\66\2\u01e5i\3\2\2\2\u01e6\u01e7"+
		"\5t;\2\u01e7\u01e8\5v<\2\u01e8\u01e9\5j\66\2\u01e9\u01ec\3\2\2\2\u01ea"+
		"\u01ec\3\2\2\2\u01eb\u01e6\3\2\2\2\u01eb\u01ea\3\2\2\2\u01eck\3\2\2\2"+
		"\u01ed\u01ee\t\n\2\2\u01eem\3\2\2\2\u01ef\u01f0\t\13\2\2\u01f0o\3\2\2"+
		"\2\u01f1\u01f2\t\f\2\2\u01f2q\3\2\2\2\u01f3\u01f4\t\r\2\2\u01f4s\3\2\2"+
		"\2\u01f5\u01f6\7R\2\2\u01f6u\3\2\2\2\u01f7\u0207\7\r\2\2\u01f8\u0207\7"+
		"\f\2\2\u01f9\u0207\7<\2\2\u01fa\u0207\7;\2\2\u01fb\u0207\7=\2\2\u01fc"+
		"\u01fd\7>\2\2\u01fd\u0207\5x=\2\u01fe\u01ff\7K\2\2\u01ff\u0207\5v<\2\u0200"+
		"\u0201\t\16\2\2\u0201\u0207\5v<\2\u0202\u0203\7H\2\2\u0203\u0204\5N(\2"+
		"\u0204\u0205\7I\2\2\u0205\u0207\3\2\2\2\u0206\u01f7\3\2\2\2\u0206\u01f8"+
		"\3\2\2\2\u0206\u01f9\3\2\2\2\u0206\u01fa\3\2\2\2\u0206\u01fb\3\2\2\2\u0206"+
		"\u01fc\3\2\2\2\u0206\u01fe\3\2\2\2\u0206\u0200\3\2\2\2\u0206\u0202\3\2"+
		"\2\2\u0207w\3\2\2\2\u0208\u020b\5\36\20\2\u0209\u020b\5 \21\2\u020a\u0208"+
		"\3\2\2\2\u020a\u0209\3\2\2\2\u020by\3\2\2\2)\u0082\u008e\u0092\u009a\u009d"+
		"\u00a6\u00b8\u00c0\u00d8\u00e0\u00e3\u00e7\u00ef\u00fc\u0109\u0112\u0117"+
		"\u0129\u012e\u013b\u0146\u0158\u015d\u016a\u016e\u0179\u0181\u018f\u019e"+
		"\u01a3\u01af\u01b9\u01c3\u01cd\u01d7\u01e1\u01eb\u0206\u020a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}