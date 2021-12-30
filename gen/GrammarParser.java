// Generated from C:/Users/julia/Documents/LL3/grammar\Grammar.g4 by ANTLR 4.9.2
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
		TOKEN_ESPACIO=84, TOKEN_COMENTARIO=85;
	public static final int
		RULE_programa = 0, RULE_subproceso = 1, RULE_inicio_sub_proceso = 2, RULE_fin_sub_proceso = 3, 
		RULE_firma = 4, RULE_argumentos = 5, RULE_proceso = 6, RULE_inicio_proceso = 7, 
		RULE_fin_proceso = 8, RULE_comando = 9, RULE_declaracion = 10, RULE_tipo = 11, 
		RULE_asignacion = 12, RULE_asignacion1 = 13, RULE_llamada_subproceso = 14, 
		RULE_llamada_subproceso1 = 15, RULE_llamada_dimension = 16, RULE_llamada_dimension1 = 17, 
		RULE_dimension = 18, RULE_condicional_si = 19, RULE_bloque_si = 20, RULE_bloque_sino = 21, 
		RULE_ciclo_para = 22, RULE_ciclo_para1 = 23, RULE_bloque_para = 24, RULE_ciclo_mientras = 25, 
		RULE_bloque_mientras = 26, RULE_ciclo_repetir = 27, RULE_bloque_repetir = 28, 
		RULE_segun = 29, RULE_bloque_segun = 30, RULE_finsegun = 31, RULE_comando_especial = 32, 
		RULE_escribir = 33, RULE_esperar = 34, RULE_esperar1 = 35, RULE_medida = 36, 
		RULE_leer = 37, RULE_lista_leer_id = 38, RULE_lista_leer_id1 = 39, RULE_expresion = 40, 
		RULE_expresion1 = 41, RULE_t = 42, RULE_lista_e = 43, RULE_e = 44, RULE_operacion = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "subproceso", "inicio_sub_proceso", "fin_sub_proceso", "firma", 
			"argumentos", "proceso", "inicio_proceso", "fin_proceso", "comando", 
			"declaracion", "tipo", "asignacion", "asignacion1", "llamada_subproceso", 
			"llamada_subproceso1", "llamada_dimension", "llamada_dimension1", "dimension", 
			"condicional_si", "bloque_si", "bloque_sino", "ciclo_para", "ciclo_para1", 
			"bloque_para", "ciclo_mientras", "bloque_mientras", "ciclo_repetir", 
			"bloque_repetir", "segun", "bloque_segun", "finsegun", "comando_especial", 
			"escribir", "esperar", "esperar1", "medida", "leer", "lista_leer_id", 
			"lista_leer_id1", "expresion", "expresion1", "t", "lista_e", "e", "operacion"
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
			null, null, "'='", "'<'", "'<-'", "'<>'", "'<='", "'>'", "'>='", "'/'", 
			"'('", "')'", "'+'", "'-'", null, null, "']'", "'['", "'*'", null, "'^'", 
			"';'", "','", "':'"
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
			"TOKEN_COMENTARIO"
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
		public ProcesoContext proceso() {
			return getRuleContext(ProcesoContext.class,0);
		}
		public List<SubprocesoContext> subproceso() {
			return getRuleContexts(SubprocesoContext.class);
		}
		public SubprocesoContext subproceso(int i) {
			return getRuleContext(SubprocesoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUBPROCESO || _la==FUNCION) {
				{
				{
				setState(92);
				subproceso();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			proceso();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSubproceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSubproceso(this);
		}
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
			setState(100);
			inicio_sub_proceso();
			setState(101);
			match(TOKEN_ID);
			setState(102);
			firma();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
				{
				{
				setState(103);
				comando();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
		public Inicio_sub_procesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio_sub_proceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInicio_sub_proceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInicio_sub_proceso(this);
		}
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
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==SUBPROCESO || _la==FUNCION) ) {
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
		public Fin_sub_procesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin_sub_proceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFin_sub_proceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFin_sub_proceso(this);
		}
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
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==FINSUBPROCESO || _la==FINFUNCION) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFirma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFirma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFirma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirmaContext firma() throws RecognitionException {
		FirmaContext _localctx = new FirmaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_firma);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_ASIG:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(TOKEN_ASIG);
				setState(116);
				match(TOKEN_ID);
				setState(117);
				argumentos();
				}
				break;
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgumentos(this);
		}
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
			setState(122);
			match(TOKEN_PAR_IZQ);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOKEN_ID) {
				{
				setState(123);
				match(TOKEN_ID);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(124);
					match(TOKEN_COMA);
					setState(125);
					match(TOKEN_ID);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(133);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProceso(this);
		}
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
			setState(135);
			inicio_proceso();
			setState(136);
			match(TOKEN_ID);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
				{
				{
				setState(137);
				comando();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInicio_proceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInicio_proceso(this);
		}
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
			setState(145);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFin_proceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFin_proceso(this);
		}
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
			setState(147);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitComando(this);
		}
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
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				declaracion();
				}
				break;
			case TOKEN_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				asignacion();
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				dimension();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				condicional_si();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				ciclo_para();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				ciclo_mientras();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				ciclo_repetir();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
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
				setState(157);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclaracion(this);
		}
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
			setState(160);
			match(DEFINIR);
			setState(161);
			match(TOKEN_ID);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(162);
				match(TOKEN_COMA);
				setState(163);
				match(TOKEN_ID);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(COMO);
			setState(170);
			tipo();
			setState(171);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTipo(this);
		}
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
			setState(173);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAsignacion(this);
		}
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
			setState(175);
			match(TOKEN_ID);
			setState(176);
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
		public TerminalNode TOKEN_COR_IZQ() { return getToken(GrammarParser.TOKEN_COR_IZQ, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode TOKEN_COR_DER() { return getToken(GrammarParser.TOKEN_COR_DER, 0); }
		public TerminalNode TOKEN_ASIG() { return getToken(GrammarParser.TOKEN_ASIG, 0); }
		public TerminalNode TOKEN_PYC() { return getToken(GrammarParser.TOKEN_PYC, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(GrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(GrammarParser.TOKEN_COMA, i);
		}
		public Llamada_subproceso1Context llamada_subproceso1() {
			return getRuleContext(Llamada_subproceso1Context.class,0);
		}
		public Llamada_dimension1Context llamada_dimension1() {
			return getRuleContext(Llamada_dimension1Context.class,0);
		}
		public Asignacion1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAsignacion1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAsignacion1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAsignacion1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion1Context asignacion1() throws RecognitionException {
		Asignacion1Context _localctx = new Asignacion1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_asignacion1);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(TOKEN_COR_IZQ);
				setState(179);
				expresion();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(180);
					match(TOKEN_COMA);
					setState(181);
					expresion();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(TOKEN_COR_DER);
				setState(188);
				match(TOKEN_ASIG);
				setState(189);
				expresion();
				setState(190);
				match(TOKEN_PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(TOKEN_ASIG);
				setState(193);
				expresion();
				setState(194);
				match(TOKEN_PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				llamada_subproceso1();
				setState(197);
				match(TOKEN_PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				llamada_dimension1();
				setState(200);
				match(TOKEN_PYC);
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

	public static class Llamada_subprocesoContext extends ParserRuleContext {
		public TerminalNode TOKEN_ID() { return getToken(GrammarParser.TOKEN_ID, 0); }
		public Llamada_subproceso1Context llamada_subproceso1() {
			return getRuleContext(Llamada_subproceso1Context.class,0);
		}
		public Llamada_subprocesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_subproceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLlamada_subproceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLlamada_subproceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLlamada_subproceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_subprocesoContext llamada_subproceso() throws RecognitionException {
		Llamada_subprocesoContext _localctx = new Llamada_subprocesoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_llamada_subproceso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(TOKEN_ID);
			setState(205);
			llamada_subproceso1();
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

	public static class Llamada_subproceso1Context extends ParserRuleContext {
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
		public Llamada_subproceso1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_subproceso1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLlamada_subproceso1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLlamada_subproceso1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLlamada_subproceso1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_subproceso1Context llamada_subproceso1() throws RecognitionException {
		Llamada_subproceso1Context _localctx = new Llamada_subproceso1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_llamada_subproceso1);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(TOKEN_PAR_IZQ);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (VERDADERO - 10)) | (1L << (FALSO - 10)) | (1L << (TOKEN_REAL - 10)) | (1L << (TOKEN_ENTERO - 10)) | (1L << (TOKEN_CADENA - 10)) | (1L << (TOKEN_ID - 10)) | (1L << (TOKEN_NEG - 10)) | (1L << (TOKEN_PAR_IZQ - 10)) | (1L << (TOKEN_MENOS - 10)))) != 0)) {
					{
					setState(208);
					expresion();
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TOKEN_COMA) {
						{
						{
						setState(209);
						match(TOKEN_COMA);
						setState(210);
						expresion();
						}
						}
						setState(215);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(218);
				match(TOKEN_PAR_DER);
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
		public TerminalNode TOKEN_ID() { return getToken(GrammarParser.TOKEN_ID, 0); }
		public Llamada_dimension1Context llamada_dimension1() {
			return getRuleContext(Llamada_dimension1Context.class,0);
		}
		public Llamada_dimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLlamada_dimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLlamada_dimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLlamada_dimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_dimensionContext llamada_dimension() throws RecognitionException {
		Llamada_dimensionContext _localctx = new Llamada_dimensionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_llamada_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(TOKEN_ID);
			setState(223);
			llamada_dimension1();
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

	public static class Llamada_dimension1Context extends ParserRuleContext {
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
		public Llamada_dimension1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_dimension1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLlamada_dimension1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLlamada_dimension1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLlamada_dimension1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_dimension1Context llamada_dimension1() throws RecognitionException {
		Llamada_dimension1Context _localctx = new Llamada_dimension1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_llamada_dimension1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(TOKEN_COR_IZQ);
			setState(226);
			expresion();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(227);
				match(TOKEN_COMA);
				setState(228);
				expresion();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
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
		public List<Llamada_dimension1Context> llamada_dimension1() {
			return getRuleContexts(Llamada_dimension1Context.class);
		}
		public Llamada_dimension1Context llamada_dimension1(int i) {
			return getRuleContext(Llamada_dimension1Context.class,i);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(DIMENSION);
			setState(237);
			match(TOKEN_ID);
			setState(238);
			llamada_dimension1();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(239);
				match(TOKEN_COMA);
				setState(240);
				match(TOKEN_ID);
				setState(241);
				llamada_dimension1();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCondicional_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCondicional_si(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCondicional_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicional_siContext condicional_si() throws RecognitionException {
		Condicional_siContext _localctx = new Condicional_siContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condicional_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(SI);
			setState(250);
			expresion();
			setState(251);
			match(ENTONCES);
			setState(252);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBloque_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBloque_si(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBloque_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_siContext bloque_si() throws RecognitionException {
		Bloque_siContext _localctx = new Bloque_siContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bloque_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
				{
				{
				setState(254);
				comando();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBloque_sino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBloque_sino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBloque_sino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_sinoContext bloque_sino() throws RecognitionException {
		Bloque_sinoContext _localctx = new Bloque_sinoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bloque_sino);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(SINO);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
					{
					{
					setState(263);
					comando();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				match(FINSI);
				}
				break;
			case FINSI:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCiclo_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCiclo_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCiclo_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_paraContext ciclo_para() throws RecognitionException {
		Ciclo_paraContext _localctx = new Ciclo_paraContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ciclo_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(PARA);
			setState(274);
			match(TOKEN_ID);
			setState(275);
			match(TOKEN_ASIG);
			setState(276);
			expresion();
			setState(277);
			match(HASTA);
			setState(278);
			expresion();
			setState(279);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCiclo_para1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCiclo_para1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCiclo_para1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_para1Context ciclo_para1() throws RecognitionException {
		Ciclo_para1Context _localctx = new Ciclo_para1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_ciclo_para1);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CON:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(CON);
				setState(282);
				match(PASO);
				setState(283);
				expresion();
				setState(284);
				match(HACER);
				setState(285);
				bloque_para();
				}
				break;
			case HACER:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(HACER);
				setState(288);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBloque_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBloque_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBloque_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_paraContext bloque_para() throws RecognitionException {
		Bloque_paraContext _localctx = new Bloque_paraContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bloque_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
				{
				{
				setState(291);
				comando();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCiclo_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCiclo_mientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCiclo_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_mientrasContext ciclo_mientras() throws RecognitionException {
		Ciclo_mientrasContext _localctx = new Ciclo_mientrasContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ciclo_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(MIENTRAS);
			setState(300);
			expresion();
			setState(301);
			match(HACER);
			setState(302);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBloque_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBloque_mientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBloque_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_mientrasContext bloque_mientras() throws RecognitionException {
		Bloque_mientrasContext _localctx = new Bloque_mientrasContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bloque_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
				{
				{
				setState(304);
				comando();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCiclo_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCiclo_repetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCiclo_repetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_repetirContext ciclo_repetir() throws RecognitionException {
		Ciclo_repetirContext _localctx = new Ciclo_repetirContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ciclo_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(REPETIR);
			setState(313);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBloque_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBloque_repetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBloque_repetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_repetirContext bloque_repetir() throws RecognitionException {
		Bloque_repetirContext _localctx = new Bloque_repetirContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bloque_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
				{
				{
				setState(315);
				comando();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			match(HASTA);
			setState(322);
			match(QUE);
			setState(323);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSegun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSegun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegunContext segun() throws RecognitionException {
		SegunContext _localctx = new SegunContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_segun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(SEGUN);
			setState(326);
			expresion();
			setState(327);
			match(HACER);
			setState(328);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBloque_segun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBloque_segun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBloque_segun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_segunContext bloque_segun() throws RecognitionException {
		Bloque_segunContext _localctx = new Bloque_segunContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bloque_segun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(330);
				match(CASO);
				setState(331);
				expresion();
				setState(332);
				match(TOKEN_DOSP);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
					{
					{
					setState(333);
					comando();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASO );
			setState(343);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFinsegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFinsegun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFinsegun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinsegunContext finsegun() throws RecognitionException {
		FinsegunContext _localctx = new FinsegunContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_finsegun);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINSEGUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(FINSEGUN);
				}
				break;
			case DE:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(DE);
				setState(347);
				match(OTRO);
				setState(348);
				match(MODO);
				setState(349);
				match(TOKEN_DOSP);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARA) | (1L << DEFINIR) | (1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << REPETIR) | (1L << MIENTRAS) | (1L << SI) | (1L << SEGUN) | (1L << LIMPIAR) | (1L << BORRAR) | (1L << ESPERAR) | (1L << TOKEN_ID))) != 0)) {
					{
					{
					setState(350);
					comando();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterComando_especial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitComando_especial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitComando_especial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_especialContext comando_especial() throws RecognitionException {
		Comando_especialContext _localctx = new Comando_especialContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_comando_especial);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BORRAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(BORRAR);
				setState(360);
				match(PANTALLA);
				setState(361);
				match(TOKEN_PYC);
				}
				break;
			case LIMPIAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(LIMPIAR);
				setState(363);
				match(PANTALLA);
				setState(364);
				match(TOKEN_PYC);
				}
				break;
			case ESPERAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				esperar();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				leer();
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEscribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEscribir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEscribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscribirContext escribir() throws RecognitionException {
		EscribirContext _localctx = new EscribirContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_escribir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(ESCRIBIR);
			setState(371);
			expresion();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(372);
				match(TOKEN_COMA);
				setState(373);
				expresion();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEsperar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEsperar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEsperar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsperarContext esperar() throws RecognitionException {
		EsperarContext _localctx = new EsperarContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_esperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(ESPERAR);
			setState(382);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEsperar1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEsperar1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEsperar1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Esperar1Context esperar1() throws RecognitionException {
		Esperar1Context _localctx = new Esperar1Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_esperar1);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TECLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(TECLA);
				setState(385);
				match(TOKEN_PYC);
				}
				break;
			case VERDADERO:
			case FALSO:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
			case TOKEN_CADENA:
			case TOKEN_ID:
			case TOKEN_NEG:
			case TOKEN_PAR_IZQ:
			case TOKEN_MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				expresion();
				setState(387);
				medida();
				setState(388);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMedida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMedida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMedida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MedidaContext medida() throws RecognitionException {
		MedidaContext _localctx = new MedidaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_medida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(LEER);
			setState(395);
			lista_leer_id();
			setState(396);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLista_leer_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLista_leer_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLista_leer_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_leer_idContext lista_leer_id() throws RecognitionException {
		Lista_leer_idContext _localctx = new Lista_leer_idContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lista_leer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(TOKEN_ID);
			setState(399);
			lista_leer_id1();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(400);
				match(TOKEN_COMA);
				setState(401);
				match(TOKEN_ID);
				setState(402);
				lista_leer_id1();
				}
				}
				setState(407);
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
		public Llamada_dimension1Context llamada_dimension1() {
			return getRuleContext(Llamada_dimension1Context.class,0);
		}
		public Lista_leer_id1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_leer_id1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLista_leer_id1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLista_leer_id1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLista_leer_id1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_leer_id1Context lista_leer_id1() throws RecognitionException {
		Lista_leer_id1Context _localctx = new Lista_leer_id1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_lista_leer_id1);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_COR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				llamada_dimension1();
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
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Expresion1Context expresion1() {
			return getRuleContext(Expresion1Context.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			t();
			setState(413);
			expresion1();
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

	public static class Expresion1Context extends ParserRuleContext {
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Expresion1Context expresion1() {
			return getRuleContext(Expresion1Context.class,0);
		}
		public Expresion1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpresion1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpresion1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpresion1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion1Context expresion1() throws RecognitionException {
		Expresion1Context _localctx = new Expresion1Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_expresion1);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				operacion();
				setState(416);
				t();
				setState(417);
				expresion1();
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

	public static class TContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public Lista_eContext lista_e() {
			return getRuleContext(Lista_eContext.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			e();
			setState(423);
			lista_e();
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

	public static class Lista_eContext extends ParserRuleContext {
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public Lista_eContext lista_e() {
			return getRuleContext(Lista_eContext.class,0);
		}
		public Lista_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLista_e(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLista_e(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLista_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_eContext lista_e() throws RecognitionException {
		Lista_eContext _localctx = new Lista_eContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lista_e);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				operacion();
				setState(426);
				e();
				setState(427);
				lista_e();
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(GrammarParser.TOKEN_PAR_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(GrammarParser.TOKEN_PAR_DER, 0); }
		public Llamada_subprocesoContext llamada_subproceso() {
			return getRuleContext(Llamada_subprocesoContext.class,0);
		}
		public Llamada_dimensionContext llamada_dimension() {
			return getRuleContext(Llamada_dimensionContext.class,0);
		}
		public TerminalNode VERDADERO() { return getToken(GrammarParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(GrammarParser.FALSO, 0); }
		public TerminalNode TOKEN_REAL() { return getToken(GrammarParser.TOKEN_REAL, 0); }
		public TerminalNode TOKEN_ENTERO() { return getToken(GrammarParser.TOKEN_ENTERO, 0); }
		public TerminalNode TOKEN_CADENA() { return getToken(GrammarParser.TOKEN_CADENA, 0); }
		public TerminalNode TOKEN_NEG() { return getToken(GrammarParser.TOKEN_NEG, 0); }
		public TerminalNode TOKEN_MENOS() { return getToken(GrammarParser.TOKEN_MENOS, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_e);
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(TOKEN_PAR_IZQ);
				setState(433);
				expresion();
				setState(434);
				match(TOKEN_PAR_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				llamada_subproceso();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				llamada_dimension();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				match(VERDADERO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
				match(FALSO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(440);
				match(TOKEN_REAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(441);
				match(TOKEN_ENTERO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(442);
				match(TOKEN_CADENA);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(443);
				match(TOKEN_NEG);
				setState(444);
				expresion();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(445);
				match(TOKEN_MENOS);
				setState(446);
				expresion();
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

	public static class OperacionContext extends ParserRuleContext {
		public TerminalNode TOKEN_O() { return getToken(GrammarParser.TOKEN_O, 0); }
		public TerminalNode TOKEN_Y() { return getToken(GrammarParser.TOKEN_Y, 0); }
		public TerminalNode TOKEN_MAS() { return getToken(GrammarParser.TOKEN_MAS, 0); }
		public TerminalNode TOKEN_IGUAL() { return getToken(GrammarParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_DIF() { return getToken(GrammarParser.TOKEN_DIF, 0); }
		public TerminalNode TOKEN_MENOS() { return getToken(GrammarParser.TOKEN_MENOS, 0); }
		public TerminalNode TOKEN_MENOR() { return getToken(GrammarParser.TOKEN_MENOR, 0); }
		public TerminalNode TOKEN_MAYOR() { return getToken(GrammarParser.TOKEN_MAYOR, 0); }
		public TerminalNode TOKEN_MENOR_IGUAL() { return getToken(GrammarParser.TOKEN_MENOR_IGUAL, 0); }
		public TerminalNode TOKEN_MAYOR_IGUAL() { return getToken(GrammarParser.TOKEN_MAYOR_IGUAL, 0); }
		public TerminalNode TOKEN_MUL() { return getToken(GrammarParser.TOKEN_MUL, 0); }
		public TerminalNode TOKEN_DIV() { return getToken(GrammarParser.TOKEN_DIV, 0); }
		public TerminalNode TOKEN_POT() { return getToken(GrammarParser.TOKEN_POT, 0); }
		public TerminalNode TOKEN_MOD() { return getToken(GrammarParser.TOKEN_MOD, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (TOKEN_IGUAL - 62)) | (1L << (TOKEN_MENOR - 62)) | (1L << (TOKEN_DIF - 62)) | (1L << (TOKEN_MENOR_IGUAL - 62)) | (1L << (TOKEN_MAYOR - 62)) | (1L << (TOKEN_MAYOR_IGUAL - 62)) | (1L << (TOKEN_DIV - 62)) | (1L << (TOKEN_MAS - 62)) | (1L << (TOKEN_MENOS - 62)) | (1L << (TOKEN_Y - 62)) | (1L << (TOKEN_O - 62)) | (1L << (TOKEN_MUL - 62)) | (1L << (TOKEN_MOD - 62)) | (1L << (TOKEN_POT - 62)))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3W\u01c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\7\3k\n\3\f\3\16\3n\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\5\6{\n\6\3\7\3\7\3\7\3\7\7\7\u0081\n\7\f\7\16\7\u0084\13\7\5\7\u0086"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090\13\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a1\n"+
		"\13\3\f\3\f\3\f\3\f\7\f\u00a7\n\f\f\f\16\f\u00aa\13\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00b9\n\17\f\17\16\17"+
		"\u00bc\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00cd\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\7\21\u00d6\n\21\f\21\16\21\u00d9\13\21\5\21\u00db\n\21\3\21\3\21\5\21"+
		"\u00df\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00e8\n\23\f\23\16"+
		"\23\u00eb\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00f5\n\24"+
		"\f\24\16\24\u00f8\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\7\26\u0102"+
		"\n\26\f\26\16\26\u0105\13\26\3\26\3\26\3\27\3\27\7\27\u010b\n\27\f\27"+
		"\16\27\u010e\13\27\3\27\3\27\5\27\u0112\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0124\n\31"+
		"\3\32\7\32\u0127\n\32\f\32\16\32\u012a\13\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\7\34\u0134\n\34\f\34\16\34\u0137\13\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\7\36\u013f\n\36\f\36\16\36\u0142\13\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u0151\n \f \16 \u0154\13"+
		" \6 \u0156\n \r \16 \u0157\3 \3 \3!\3!\3!\3!\3!\3!\7!\u0162\n!\f!\16!"+
		"\u0165\13!\3!\5!\u0168\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0173"+
		"\n\"\3#\3#\3#\3#\7#\u0179\n#\f#\16#\u017c\13#\3#\3#\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\5%\u0189\n%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\7(\u0196\n"+
		"(\f(\16(\u0199\13(\3)\3)\5)\u019d\n)\3*\3*\3*\3+\3+\3+\3+\3+\5+\u01a7"+
		"\n+\3,\3,\3,\3-\3-\3-\3-\3-\5-\u01b1\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\5.\u01c2\n.\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\t\4\2((**\4\2"+
		"\60\60\62\62\3\2 !\3\2+,\3\2\4\13\3\29:\6\2@ACGJMPR\2\u01ce\2a\3\2\2\2"+
		"\4f\3\2\2\2\6q\3\2\2\2\bs\3\2\2\2\nz\3\2\2\2\f|\3\2\2\2\16\u0089\3\2\2"+
		"\2\20\u0093\3\2\2\2\22\u0095\3\2\2\2\24\u00a0\3\2\2\2\26\u00a2\3\2\2\2"+
		"\30\u00af\3\2\2\2\32\u00b1\3\2\2\2\34\u00cc\3\2\2\2\36\u00ce\3\2\2\2 "+
		"\u00de\3\2\2\2\"\u00e0\3\2\2\2$\u00e3\3\2\2\2&\u00ee\3\2\2\2(\u00fb\3"+
		"\2\2\2*\u0103\3\2\2\2,\u0111\3\2\2\2.\u0113\3\2\2\2\60\u0123\3\2\2\2\62"+
		"\u0128\3\2\2\2\64\u012d\3\2\2\2\66\u0135\3\2\2\28\u013a\3\2\2\2:\u0140"+
		"\3\2\2\2<\u0147\3\2\2\2>\u0155\3\2\2\2@\u0167\3\2\2\2B\u0172\3\2\2\2D"+
		"\u0174\3\2\2\2F\u017f\3\2\2\2H\u0188\3\2\2\2J\u018a\3\2\2\2L\u018c\3\2"+
		"\2\2N\u0190\3\2\2\2P\u019c\3\2\2\2R\u019e\3\2\2\2T\u01a6\3\2\2\2V\u01a8"+
		"\3\2\2\2X\u01b0\3\2\2\2Z\u01c1\3\2\2\2\\\u01c3\3\2\2\2^`\5\4\3\2_^\3\2"+
		"\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\5\16\b\2e\3\3"+
		"\2\2\2fg\5\6\4\2gh\7>\2\2hl\5\n\6\2ik\5\24\13\2ji\3\2\2\2kn\3\2\2\2lj"+
		"\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\5\b\5\2p\5\3\2\2\2qr\t\2\2\2"+
		"r\7\3\2\2\2st\t\3\2\2t\t\3\2\2\2uv\7B\2\2vw\7>\2\2w{\5\f\7\2x{\5\f\7\2"+
		"y{\3\2\2\2zu\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\13\3\2\2\2|\u0085\7H\2\2}\u0082"+
		"\7>\2\2~\177\7T\2\2\177\u0081\7>\2\2\u0080~\3\2\2\2\u0081\u0084\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085}\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\7I\2\2\u0088\r\3\2\2\2\u0089\u008a\5\20\t\2\u008a\u008e\7>\2\2"+
		"\u008b\u008d\5\24\13\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\5\22\n\2\u0092\17\3\2\2\2\u0093\u0094\t\4\2\2\u0094\21\3\2\2\2"+
		"\u0095\u0096\t\5\2\2\u0096\23\3\2\2\2\u0097\u00a1\5\26\f\2\u0098\u00a1"+
		"\5\32\16\2\u0099\u00a1\5&\24\2\u009a\u00a1\5(\25\2\u009b\u00a1\5.\30\2"+
		"\u009c\u00a1\5\64\33\2\u009d\u00a1\58\35\2\u009e\u00a1\5<\37\2\u009f\u00a1"+
		"\5B\"\2\u00a0\u0097\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u0099\3\2\2\2\u00a0"+
		"\u009a\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a3"+
		"\7\27\2\2\u00a3\u00a8\7>\2\2\u00a4\u00a5\7T\2\2\u00a5\u00a7\7>\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\31\2\2\u00ac"+
		"\u00ad\5\30\r\2\u00ad\u00ae\7S\2\2\u00ae\27\3\2\2\2\u00af\u00b0\t\6\2"+
		"\2\u00b0\31\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3\5\34\17\2\u00b3\33"+
		"\3\2\2\2\u00b4\u00b5\7O\2\2\u00b5\u00ba\5R*\2\u00b6\u00b7\7T\2\2\u00b7"+
		"\u00b9\5R*\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2"+
		"\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be"+
		"\7N\2\2\u00be\u00bf\7B\2\2\u00bf\u00c0\5R*\2\u00c0\u00c1\7S\2\2\u00c1"+
		"\u00cd\3\2\2\2\u00c2\u00c3\7B\2\2\u00c3\u00c4\5R*\2\u00c4\u00c5\7S\2\2"+
		"\u00c5\u00cd\3\2\2\2\u00c6\u00c7\5 \21\2\u00c7\u00c8\7S\2\2\u00c8\u00cd"+
		"\3\2\2\2\u00c9\u00ca\5$\23\2\u00ca\u00cb\7S\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00b4\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c9\3\2"+
		"\2\2\u00cd\35\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf\u00d0\5 \21\2\u00d0\37"+
		"\3\2\2\2\u00d1\u00da\7H\2\2\u00d2\u00d7\5R*\2\u00d3\u00d4\7T\2\2\u00d4"+
		"\u00d6\5R*\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2"+
		"\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00d2"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\7I\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00d1\3\2\2\2\u00de\u00dd\3\2\2\2\u00df!\3\2\2\2"+
		"\u00e0\u00e1\7>\2\2\u00e1\u00e2\5$\23\2\u00e2#\3\2\2\2\u00e3\u00e4\7O"+
		"\2\2\u00e4\u00e9\5R*\2\u00e5\u00e6\7T\2\2\u00e6\u00e8\5R*\2\u00e7\u00e5"+
		"\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7N\2\2\u00ed%\3\2\2\2\u00ee"+
		"\u00ef\7\35\2\2\u00ef\u00f0\7>\2\2\u00f0\u00f6\5$\23\2\u00f1\u00f2\7T"+
		"\2\2\u00f2\u00f3\7>\2\2\u00f3\u00f5\5$\23\2\u00f4\u00f1\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7S\2\2\u00fa\'\3\2\2\2\u00fb\u00fc"+
		"\7\"\2\2\u00fc\u00fd\5R*\2\u00fd\u00fe\7\34\2\2\u00fe\u00ff\5*\26\2\u00ff"+
		")\3\2\2\2\u0100\u0102\5\24\13\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2"+
		"\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0107\5,\27\2\u0107+\3\2\2\2\u0108\u010c\7#\2\2\u0109\u010b"+
		"\5\24\13\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2"+
		"\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0112"+
		"\7\3\2\2\u0110\u0112\7\3\2\2\u0111\u0108\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"-\3\2\2\2\u0113\u0114\7\22\2\2\u0114\u0115\7>\2\2\u0115\u0116\7B\2\2\u0116"+
		"\u0117\5R*\2\u0117\u0118\7\23\2\2\u0118\u0119\5R*\2\u0119\u011a\5\60\31"+
		"\2\u011a/\3\2\2\2\u011b\u011c\7\24\2\2\u011c\u011d\7\26\2\2\u011d\u011e"+
		"\5R*\2\u011e\u011f\7\30\2\2\u011f\u0120\5\62\32\2\u0120\u0124\3\2\2\2"+
		"\u0121\u0122\7\30\2\2\u0122\u0124\5\62\32\2\u0123\u011b\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\61\3\2\2\2\u0125\u0127\5\24\13\2\u0126\u0125\3\2"+
		"\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7/\2\2\u012c\63\3\2\2\2"+
		"\u012d\u012e\7\37\2\2\u012e\u012f\5R*\2\u012f\u0130\7\30\2\2\u0130\u0131"+
		"\5\66\34\2\u0131\65\3\2\2\2\u0132\u0134\5\24\13\2\u0133\u0132\3\2\2\2"+
		"\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7-\2\2\u0139\67\3\2\2\2\u013a"+
		"\u013b\7\36\2\2\u013b\u013c\5:\36\2\u013c9\3\2\2\2\u013d\u013f\5\24\13"+
		"\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7\23\2\2"+
		"\u0144\u0145\7\63\2\2\u0145\u0146\5R*\2\u0146;\3\2\2\2\u0147\u0148\7$"+
		"\2\2\u0148\u0149\5R*\2\u0149\u014a\7\30\2\2\u014a\u014b\5> \2\u014b=\3"+
		"\2\2\2\u014c\u014d\7\25\2\2\u014d\u014e\5R*\2\u014e\u0152\7U\2\2\u014f"+
		"\u0151\5\24\13\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3"+
		"\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u014c\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015a\5@!\2\u015a?\3\2\2\2\u015b\u0168"+
		"\7.\2\2\u015c\u015d\7%\2\2\u015d\u015e\7&\2\2\u015e\u015f\7\'\2\2\u015f"+
		"\u0163\7U\2\2\u0160\u0162\5\24\13\2\u0161\u0160\3\2\2\2\u0162\u0165\3"+
		"\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0168\7.\2\2\u0167\u015b\3\2\2\2\u0167\u015c\3\2"+
		"\2\2\u0168A\3\2\2\2\u0169\u016a\7\65\2\2\u016a\u016b\7\66\2\2\u016b\u0173"+
		"\7S\2\2\u016c\u016d\7\64\2\2\u016d\u016e\7\66\2\2\u016e\u0173\7S\2\2\u016f"+
		"\u0173\5F$\2\u0170\u0173\5L\'\2\u0171\u0173\5D#\2\u0172\u0169\3\2\2\2"+
		"\u0172\u016c\3\2\2\2\u0172\u016f\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0171"+
		"\3\2\2\2\u0173C\3\2\2\2\u0174\u0175\7\32\2\2\u0175\u017a\5R*\2\u0176\u0177"+
		"\7T\2\2\u0177\u0179\5R*\2\u0178\u0176\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017d\u017e\7S\2\2\u017eE\3\2\2\2\u017f\u0180\7\67\2\2\u0180\u0181"+
		"\5H%\2\u0181G\3\2\2\2\u0182\u0183\78\2\2\u0183\u0189\7S\2\2\u0184\u0185"+
		"\5R*\2\u0185\u0186\5J&\2\u0186\u0187\7S\2\2\u0187\u0189\3\2\2\2\u0188"+
		"\u0182\3\2\2\2\u0188\u0184\3\2\2\2\u0189I\3\2\2\2\u018a\u018b\t\7\2\2"+
		"\u018bK\3\2\2\2\u018c\u018d\7\33\2\2\u018d\u018e\5N(\2\u018e\u018f\7S"+
		"\2\2\u018fM\3\2\2\2\u0190\u0191\7>\2\2\u0191\u0197\5P)\2\u0192\u0193\7"+
		"T\2\2\u0193\u0194\7>\2\2\u0194\u0196\5P)\2\u0195\u0192\3\2\2\2\u0196\u0199"+
		"\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198O\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019d\5$\23\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019c\u019b\3\2\2\2\u019dQ\3\2\2\2\u019e\u019f\5V,\2\u019f\u01a0"+
		"\5T+\2\u01a0S\3\2\2\2\u01a1\u01a2\5\\/\2\u01a2\u01a3\5V,\2\u01a3\u01a4"+
		"\5T+\2\u01a4\u01a7\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a1\3\2\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7U\3\2\2\2\u01a8\u01a9\5Z.\2\u01a9\u01aa\5X-\2\u01aa"+
		"W\3\2\2\2\u01ab\u01ac\5\\/\2\u01ac\u01ad\5Z.\2\u01ad\u01ae\5X-\2\u01ae"+
		"\u01b1\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b0\u01af\3\2"+
		"\2\2\u01b1Y\3\2\2\2\u01b2\u01b3\7H\2\2\u01b3\u01b4\5R*\2\u01b4\u01b5\7"+
		"I\2\2\u01b5\u01c2\3\2\2\2\u01b6\u01c2\5\36\20\2\u01b7\u01c2\5\"\22\2\u01b8"+
		"\u01c2\7\f\2\2\u01b9\u01c2\7\r\2\2\u01ba\u01c2\7;\2\2\u01bb\u01c2\7<\2"+
		"\2\u01bc\u01c2\7=\2\2\u01bd\u01be\7?\2\2\u01be\u01c2\5R*\2\u01bf\u01c0"+
		"\7K\2\2\u01c0\u01c2\5R*\2\u01c1\u01b2\3\2\2\2\u01c1\u01b6\3\2\2\2\u01c1"+
		"\u01b7\3\2\2\2\u01c1\u01b8\3\2\2\2\u01c1\u01b9\3\2\2\2\u01c1\u01ba\3\2"+
		"\2\2\u01c1\u01bb\3\2\2\2\u01c1\u01bc\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c2[\3\2\2\2\u01c3\u01c4\t\b\2\2\u01c4]\3\2\2\2$alz\u0082"+
		"\u0085\u008e\u00a0\u00a8\u00ba\u00cc\u00d7\u00da\u00de\u00e9\u00f6\u0103"+
		"\u010c\u0111\u0123\u0128\u0135\u0140\u0152\u0157\u0163\u0167\u0172\u017a"+
		"\u0188\u0197\u019c\u01a6\u01b0\u01c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}