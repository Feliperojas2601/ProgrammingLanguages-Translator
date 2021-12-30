// Generated from C:/Users/julia/Documents/LL3/grammar\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FINSI", "CARACTER", "REAL", "ENTERO", "NUMERICO", "NUMERO", "LOGICO", 
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2W\u02ba\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\3:"+
		"\3:\3:\7:\u0254\n:\f:\16:\u0257\13:\3;\6;\u025a\n;\r;\16;\u025b\3<\3<"+
		"\7<\u0260\n<\f<\16<\u0263\13<\3<\3<\3=\3=\7=\u0269\n=\f=\16=\u026c\13"+
		"=\3>\3>\5>\u0270\n>\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3E\3"+
		"E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\5K\u0290\nK\3L\3L\5L\u0294\n"+
		"L\3M\3M\3N\3N\3O\3O\3P\3P\5P\u029e\nP\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\6U\u02a9"+
		"\nU\rU\16U\u02aa\3U\3U\3V\3V\3V\7V\u02b2\nV\fV\16V\u02b5\13V\3V\3V\3V"+
		"\3V\4\u0261\u02b3\2W\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\3\2\35\4\2HHhh\4\2"+
		"KKkk\4\2PPpp\4\2UUuu\4\2EEee\4\2CCcc\4\2TTtt\4\2VVvv\4\2GGgg\4\2NNnn\4"+
		"\2QQqq\4\2WWww\4\2OOoo\4\2IIii\4\2ZZzz\4\2FFff\4\2XXxx\4\2[[{{\4\2RRr"+
		"r\4\2JJjj\4\2DDdd\4\2SSss\4\2$$))\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17"+
		"\17\"\"\3\2\f\f\2\u02c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\3\u00ad\3\2\2\2\5\u00b3"+
		"\3\2\2\2\7\u00bc\3\2\2\2\t\u00c1\3\2\2\2\13\u00c8\3\2\2\2\r\u00d1\3\2"+
		"\2\2\17\u00d8\3\2\2\2\21\u00df\3\2\2\2\23\u00e5\3\2\2\2\25\u00ec\3\2\2"+
		"\2\27\u00f6\3\2\2\2\31\u00fc\3\2\2\2\33\u00fe\3\2\2\2\35\u0100\3\2\2\2"+
		"\37\u0103\3\2\2\2!\u0107\3\2\2\2#\u010c\3\2\2\2%\u0112\3\2\2\2\'\u0116"+
		"\3\2\2\2)\u011b\3\2\2\2+\u0120\3\2\2\2-\u0128\3\2\2\2/\u012e\3\2\2\2\61"+
		"\u0133\3\2\2\2\63\u013c\3\2\2\2\65\u0141\3\2\2\2\67\u014a\3\2\2\29\u0154"+
		"\3\2\2\2;\u015c\3\2\2\2=\u0165\3\2\2\2?\u016f\3\2\2\2A\u0177\3\2\2\2C"+
		"\u017a\3\2\2\2E\u017f\3\2\2\2G\u0185\3\2\2\2I\u0188\3\2\2\2K\u018d\3\2"+
		"\2\2M\u0192\3\2\2\2O\u019d\3\2\2\2Q\u01aa\3\2\2\2S\u01b2\3\2\2\2U\u01bd"+
		"\3\2\2\2W\u01ca\3\2\2\2Y\u01d6\3\2\2\2[\u01df\3\2\2\2]\u01e7\3\2\2\2_"+
		"\u01f5\3\2\2\2a\u0205\3\2\2\2c\u0210\3\2\2\2e\u0214\3\2\2\2g\u021c\3\2"+
		"\2\2i\u0223\3\2\2\2k\u022c\3\2\2\2m\u0234\3\2\2\2o\u023a\3\2\2\2q\u0243"+
		"\3\2\2\2s\u0250\3\2\2\2u\u0259\3\2\2\2w\u025d\3\2\2\2y\u0266\3\2\2\2{"+
		"\u026f\3\2\2\2}\u0271\3\2\2\2\177\u0273\3\2\2\2\u0081\u0275\3\2\2\2\u0083"+
		"\u0278\3\2\2\2\u0085\u027b\3\2\2\2\u0087\u027e\3\2\2\2\u0089\u0280\3\2"+
		"\2\2\u008b\u0283\3\2\2\2\u008d\u0285\3\2\2\2\u008f\u0287\3\2\2\2\u0091"+
		"\u0289\3\2\2\2\u0093\u028b\3\2\2\2\u0095\u028f\3\2\2\2\u0097\u0293\3\2"+
		"\2\2\u0099\u0295\3\2\2\2\u009b\u0297\3\2\2\2\u009d\u0299\3\2\2\2\u009f"+
		"\u029d\3\2\2\2\u00a1\u029f\3\2\2\2\u00a3\u02a1\3\2\2\2\u00a5\u02a3\3\2"+
		"\2\2\u00a7\u02a5\3\2\2\2\u00a9\u02a8\3\2\2\2\u00ab\u02ae\3\2\2\2\u00ad"+
		"\u00ae\t\2\2\2\u00ae\u00af\t\3\2\2\u00af\u00b0\t\4\2\2\u00b0\u00b1\t\5"+
		"\2\2\u00b1\u00b2\t\3\2\2\u00b2\4\3\2\2\2\u00b3\u00b4\t\6\2\2\u00b4\u00b5"+
		"\t\7\2\2\u00b5\u00b6\t\b\2\2\u00b6\u00b7\t\7\2\2\u00b7\u00b8\t\6\2\2\u00b8"+
		"\u00b9\t\t\2\2\u00b9\u00ba\t\n\2\2\u00ba\u00bb\t\b\2\2\u00bb\6\3\2\2\2"+
		"\u00bc\u00bd\t\b\2\2\u00bd\u00be\t\n\2\2\u00be\u00bf\t\7\2\2\u00bf\u00c0"+
		"\t\13\2\2\u00c0\b\3\2\2\2\u00c1\u00c2\t\n\2\2\u00c2\u00c3\t\4\2\2\u00c3"+
		"\u00c4\t\t\2\2\u00c4\u00c5\t\n\2\2\u00c5\u00c6\t\b\2\2\u00c6\u00c7\t\f"+
		"\2\2\u00c7\n\3\2\2\2\u00c8\u00c9\t\4\2\2\u00c9\u00ca\t\r\2\2\u00ca\u00cb"+
		"\t\16\2\2\u00cb\u00cc\t\n\2\2\u00cc\u00cd\t\b\2\2\u00cd\u00ce\t\3\2\2"+
		"\u00ce\u00cf\t\6\2\2\u00cf\u00d0\t\f\2\2\u00d0\f\3\2\2\2\u00d1\u00d2\t"+
		"\4\2\2\u00d2\u00d3\t\r\2\2\u00d3\u00d4\t\16\2\2\u00d4\u00d5\t\n\2\2\u00d5"+
		"\u00d6\t\b\2\2\u00d6\u00d7\t\f\2\2\u00d7\16\3\2\2\2\u00d8\u00d9\t\13\2"+
		"\2\u00d9\u00da\t\f\2\2\u00da\u00db\t\17\2\2\u00db\u00dc\t\3\2\2\u00dc"+
		"\u00dd\t\6\2\2\u00dd\u00de\t\f\2\2\u00de\20\3\2\2\2\u00df\u00e0\t\t\2"+
		"\2\u00e0\u00e1\t\n\2\2\u00e1\u00e2\t\20\2\2\u00e2\u00e3\t\t\2\2\u00e3"+
		"\u00e4\t\f\2\2\u00e4\22\3\2\2\2\u00e5\u00e6\t\6\2\2\u00e6\u00e7\t\7\2"+
		"\2\u00e7\u00e8\t\21\2\2\u00e8\u00e9\t\n\2\2\u00e9\u00ea\t\4\2\2\u00ea"+
		"\u00eb\t\7\2\2\u00eb\24\3\2\2\2\u00ec\u00ed\t\22\2\2\u00ed\u00ee\t\n\2"+
		"\2\u00ee\u00ef\t\b\2\2\u00ef\u00f0\t\21\2\2\u00f0\u00f1\t\7\2\2\u00f1"+
		"\u00f2\t\21\2\2\u00f2\u00f3\t\n\2\2\u00f3\u00f4\t\b\2\2\u00f4\u00f5\t"+
		"\f\2\2\u00f5\26\3\2\2\2\u00f6\u00f7\t\2\2\2\u00f7\u00f8\t\7\2\2\u00f8"+
		"\u00f9\t\13\2\2\u00f9\u00fa\t\5\2\2\u00fa\u00fb\t\f\2\2\u00fb\30\3\2\2"+
		"\2\u00fc\u00fd\t\23\2\2\u00fd\32\3\2\2\2\u00fe\u00ff\t\f\2\2\u00ff\34"+
		"\3\2\2\2\u0100\u0101\t\4\2\2\u0101\u0102\t\f\2\2\u0102\36\3\2\2\2\u0103"+
		"\u0104\t\16\2\2\u0104\u0105\t\f\2\2\u0105\u0106\t\21\2\2\u0106 \3\2\2"+
		"\2\u0107\u0108\t\24\2\2\u0108\u0109\t\7\2\2\u0109\u010a\t\b\2\2\u010a"+
		"\u010b\t\7\2\2\u010b\"\3\2\2\2\u010c\u010d\t\25\2\2\u010d\u010e\t\7\2"+
		"\2\u010e\u010f\t\5\2\2\u010f\u0110\t\t\2\2\u0110\u0111\t\7\2\2\u0111$"+
		"\3\2\2\2\u0112\u0113\t\6\2\2\u0113\u0114\t\f\2\2\u0114\u0115\t\4\2\2\u0115"+
		"&\3\2\2\2\u0116\u0117\t\6\2\2\u0117\u0118\t\7\2\2\u0118\u0119\t\5\2\2"+
		"\u0119\u011a\t\f\2\2\u011a(\3\2\2\2\u011b\u011c\t\24\2\2\u011c\u011d\t"+
		"\7\2\2\u011d\u011e\t\5\2\2\u011e\u011f\t\f\2\2\u011f*\3\2\2\2\u0120\u0121"+
		"\t\21\2\2\u0121\u0122\t\n\2\2\u0122\u0123\t\2\2\2\u0123\u0124\t\3\2\2"+
		"\u0124\u0125\t\4\2\2\u0125\u0126\t\3\2\2\u0126\u0127\t\b\2\2\u0127,\3"+
		"\2\2\2\u0128\u0129\t\25\2\2\u0129\u012a\t\7\2\2\u012a\u012b\t\6\2\2\u012b"+
		"\u012c\t\n\2\2\u012c\u012d\t\b\2\2\u012d.\3\2\2\2\u012e\u012f\t\6\2\2"+
		"\u012f\u0130\t\f\2\2\u0130\u0131\t\16\2\2\u0131\u0132\t\f\2\2\u0132\60"+
		"\3\2\2\2\u0133\u0134\t\n\2\2\u0134\u0135\t\5\2\2\u0135\u0136\t\6\2\2\u0136"+
		"\u0137\t\b\2\2\u0137\u0138\t\3\2\2\u0138\u0139\t\26\2\2\u0139\u013a\t"+
		"\3\2\2\u013a\u013b\t\b\2\2\u013b\62\3\2\2\2\u013c\u013d\t\13\2\2\u013d"+
		"\u013e\t\n\2\2\u013e\u013f\t\n\2\2\u013f\u0140\t\b\2\2\u0140\64\3\2\2"+
		"\2\u0141\u0142\t\n\2\2\u0142\u0143\t\4\2\2\u0143\u0144\t\t\2\2\u0144\u0145"+
		"\t\f\2\2\u0145\u0146\t\4\2\2\u0146\u0147\t\6\2\2\u0147\u0148\t\n\2\2\u0148"+
		"\u0149\t\5\2\2\u0149\66\3\2\2\2\u014a\u014b\t\21\2\2\u014b\u014c\t\3\2"+
		"\2\u014c\u014d\t\16\2\2\u014d\u014e\t\n\2\2\u014e\u014f\t\4\2\2\u014f"+
		"\u0150\t\5\2\2\u0150\u0151\t\3\2\2\u0151\u0152\t\f\2\2\u0152\u0153\t\4"+
		"\2\2\u01538\3\2\2\2\u0154\u0155\t\b\2\2\u0155\u0156\t\n\2\2\u0156\u0157"+
		"\t\24\2\2\u0157\u0158\t\n\2\2\u0158\u0159\t\t\2\2\u0159\u015a\t\3\2\2"+
		"\u015a\u015b\t\b\2\2\u015b:\3\2\2\2\u015c\u015d\t\16\2\2\u015d\u015e\t"+
		"\3\2\2\u015e\u015f\t\n\2\2\u015f\u0160\t\4\2\2\u0160\u0161\t\t\2\2\u0161"+
		"\u0162\t\b\2\2\u0162\u0163\t\7\2\2\u0163\u0164\t\5\2\2\u0164<\3\2\2\2"+
		"\u0165\u0166\t\7\2\2\u0166\u0167\t\13\2\2\u0167\u0168\t\17\2\2\u0168\u0169"+
		"\t\f\2\2\u0169\u016a\t\b\2\2\u016a\u016b\t\3\2\2\u016b\u016c\t\t\2\2\u016c"+
		"\u016d\t\16\2\2\u016d\u016e\t\f\2\2\u016e>\3\2\2\2\u016f\u0170\t\24\2"+
		"\2\u0170\u0171\t\b\2\2\u0171\u0172\t\f\2\2\u0172\u0173\t\6\2\2\u0173\u0174"+
		"\t\n\2\2\u0174\u0175\t\5\2\2\u0175\u0176\t\f\2\2\u0176@\3\2\2\2\u0177"+
		"\u0178\t\5\2\2\u0178\u0179\t\3\2\2\u0179B\3\2\2\2\u017a\u017b\t\5\2\2"+
		"\u017b\u017c\t\3\2\2\u017c\u017d\t\4\2\2\u017d\u017e\t\f\2\2\u017eD\3"+
		"\2\2\2\u017f\u0180\t\5\2\2\u0180\u0181\t\n\2\2\u0181\u0182\t\17\2\2\u0182"+
		"\u0183\t\r\2\2\u0183\u0184\t\4\2\2\u0184F\3\2\2\2\u0185\u0186\t\21\2\2"+
		"\u0186\u0187\t\n\2\2\u0187H\3\2\2\2\u0188\u0189\t\f\2\2\u0189\u018a\t"+
		"\t\2\2\u018a\u018b\t\b\2\2\u018b\u018c\t\f\2\2\u018cJ\3\2\2\2\u018d\u018e"+
		"\t\16\2\2\u018e\u018f\t\f\2\2\u018f\u0190\t\21\2\2\u0190\u0191\t\f\2\2"+
		"\u0191L\3\2\2\2\u0192\u0193\t\5\2\2\u0193\u0194\t\r\2\2\u0194\u0195\t"+
		"\26\2\2\u0195\u0196\t\24\2\2\u0196\u0197\t\b\2\2\u0197\u0198\t\f\2\2\u0198"+
		"\u0199\t\6\2\2\u0199\u019a\t\n\2\2\u019a\u019b\t\5\2\2\u019b\u019c\t\f"+
		"\2\2\u019cN\3\2\2\2\u019d\u019e\t\5\2\2\u019e\u019f\t\r\2\2\u019f\u01a0"+
		"\t\26\2\2\u01a0\u01a1\t\7\2\2\u01a1\u01a2\t\13\2\2\u01a2\u01a3\t\17\2"+
		"\2\u01a3\u01a4\t\f\2\2\u01a4\u01a5\t\b\2\2\u01a5\u01a6\t\3\2\2\u01a6\u01a7"+
		"\t\t\2\2\u01a7\u01a8\t\16\2\2\u01a8\u01a9\t\f\2\2\u01a9P\3\2\2\2\u01aa"+
		"\u01ab\t\2\2\2\u01ab\u01ac\t\r\2\2\u01ac\u01ad\t\4\2\2\u01ad\u01ae\t\6"+
		"\2\2\u01ae\u01af\t\3\2\2\u01af\u01b0\t\f\2\2\u01b0\u01b1\t\4\2\2\u01b1"+
		"R\3\2\2\2\u01b2\u01b3\t\2\2\2\u01b3\u01b4\t\3\2\2\u01b4\u01b5\t\4\2\2"+
		"\u01b5\u01b6\t\24\2\2\u01b6\u01b7\t\b\2\2\u01b7\u01b8\t\f\2\2\u01b8\u01b9"+
		"\t\6\2\2\u01b9\u01ba\t\n\2\2\u01ba\u01bb\t\5\2\2\u01bb\u01bc\t\f\2\2\u01bc"+
		"T\3\2\2\2\u01bd\u01be\t\2\2\2\u01be\u01bf\t\3\2\2\u01bf\u01c0\t\4\2\2"+
		"\u01c0\u01c1\t\7\2\2\u01c1\u01c2\t\13\2\2\u01c2\u01c3\t\17\2\2\u01c3\u01c4"+
		"\t\f\2\2\u01c4\u01c5\t\b\2\2\u01c5\u01c6\t\3\2\2\u01c6\u01c7\t\t\2\2\u01c7"+
		"\u01c8\t\16\2\2\u01c8\u01c9\t\f\2\2\u01c9V\3\2\2\2\u01ca\u01cb\t\2\2\2"+
		"\u01cb\u01cc\t\3\2\2\u01cc\u01cd\t\4\2\2\u01cd\u01ce\t\16\2\2\u01ce\u01cf"+
		"\t\3\2\2\u01cf\u01d0\t\n\2\2\u01d0\u01d1\t\4\2\2\u01d1\u01d2\t\t\2\2\u01d2"+
		"\u01d3\t\b\2\2\u01d3\u01d4\t\7\2\2\u01d4\u01d5\t\5\2\2\u01d5X\3\2\2\2"+
		"\u01d6\u01d7\t\2\2\2\u01d7\u01d8\t\3\2\2\u01d8\u01d9\t\4\2\2\u01d9\u01da"+
		"\t\5\2\2\u01da\u01db\t\n\2\2\u01db\u01dc\t\17\2\2\u01dc\u01dd\t\r\2\2"+
		"\u01dd\u01de\t\4\2\2\u01deZ\3\2\2\2\u01df\u01e0\t\2\2\2\u01e0\u01e1\t"+
		"\3\2\2\u01e1\u01e2\t\4\2\2\u01e2\u01e3\t\24\2\2\u01e3\u01e4\t\7\2\2\u01e4"+
		"\u01e5\t\b\2\2\u01e5\u01e6\t\7\2\2\u01e6\\\3\2\2\2\u01e7\u01e8\t\2\2\2"+
		"\u01e8\u01e9\t\3\2\2\u01e9\u01ea\t\4\2\2\u01ea\u01eb\t\5\2\2\u01eb\u01ec"+
		"\t\r\2\2\u01ec\u01ed\t\26\2\2\u01ed\u01ee\t\24\2\2\u01ee\u01ef\t\b\2\2"+
		"\u01ef\u01f0\t\f\2\2\u01f0\u01f1\t\6\2\2\u01f1\u01f2\t\n\2\2\u01f2\u01f3"+
		"\t\5\2\2\u01f3\u01f4\t\f\2\2\u01f4^\3\2\2\2\u01f5\u01f6\t\2\2\2\u01f6"+
		"\u01f7\t\3\2\2\u01f7\u01f8\t\4\2\2\u01f8\u01f9\t\5\2\2\u01f9\u01fa\t\r"+
		"\2\2\u01fa\u01fb\t\26\2\2\u01fb\u01fc\t\7\2\2\u01fc\u01fd\t\13\2\2\u01fd"+
		"\u01fe\t\17\2\2\u01fe\u01ff\t\f\2\2\u01ff\u0200\t\b\2\2\u0200\u0201\t"+
		"\3\2\2\u0201\u0202\t\t\2\2\u0202\u0203\t\16\2\2\u0203\u0204\t\f\2\2\u0204"+
		"`\3\2\2\2\u0205\u0206\t\2\2\2\u0206\u0207\t\3\2\2\u0207\u0208\t\4\2\2"+
		"\u0208\u0209\t\2\2\2\u0209\u020a\t\r\2\2\u020a\u020b\t\4\2\2\u020b\u020c"+
		"\t\6\2\2\u020c\u020d\t\3\2\2\u020d\u020e\t\f\2\2\u020e\u020f\t\4\2\2\u020f"+
		"b\3\2\2\2\u0210\u0211\t\27\2\2\u0211\u0212\t\r\2\2\u0212\u0213\t\n\2\2"+
		"\u0213d\3\2\2\2\u0214\u0215\t\13\2\2\u0215\u0216\t\3\2\2\u0216\u0217\t"+
		"\16\2\2\u0217\u0218\t\24\2\2\u0218\u0219\t\3\2\2\u0219\u021a\t\7\2\2\u021a"+
		"\u021b\t\b\2\2\u021bf\3\2\2\2\u021c\u021d\t\26\2\2\u021d\u021e\t\f\2\2"+
		"\u021e\u021f\t\b\2\2\u021f\u0220\t\b\2\2\u0220\u0221\t\7\2\2\u0221\u0222"+
		"\t\b\2\2\u0222h\3\2\2\2\u0223\u0224\t\24\2\2\u0224\u0225\t\7\2\2\u0225"+
		"\u0226\t\4\2\2\u0226\u0227\t\t\2\2\u0227\u0228\t\7\2\2\u0228\u0229\t\13"+
		"\2\2\u0229\u022a\t\13\2\2\u022a\u022b\t\7\2\2\u022bj\3\2\2\2\u022c\u022d"+
		"\t\n\2\2\u022d\u022e\t\5\2\2\u022e\u022f\t\24\2\2\u022f\u0230\t\n\2\2"+
		"\u0230\u0231\t\b\2\2\u0231\u0232\t\7\2\2\u0232\u0233\t\b\2\2\u0233l\3"+
		"\2\2\2\u0234\u0235\t\t\2\2\u0235\u0236\t\n\2\2\u0236\u0237\t\6\2\2\u0237"+
		"\u0238\t\13\2\2\u0238\u0239\t\7\2\2\u0239n\3\2\2\2\u023a\u023b\t\5\2\2"+
		"\u023b\u023c\t\n\2\2\u023c\u023d\t\17\2\2\u023d\u023e\t\r\2\2\u023e\u023f"+
		"\t\4\2\2\u023f\u0240\t\21\2\2\u0240\u0241\t\f\2\2\u0241\u0242\t\5\2\2"+
		"\u0242p\3\2\2\2\u0243\u0244\t\16\2\2\u0244\u0245\t\3\2\2\u0245\u0246\t"+
		"\13\2\2\u0246\u0247\t\3\2\2\u0247\u0248\t\5\2\2\u0248\u0249\t\n\2\2\u0249"+
		"\u024a\t\17\2\2\u024a\u024b\t\r\2\2\u024b\u024c\t\4\2\2\u024c\u024d\t"+
		"\21\2\2\u024d\u024e\t\f\2\2\u024e\u024f\t\5\2\2\u024fr\3\2\2\2\u0250\u0251"+
		"\5u;\2\u0251\u0255\7\60\2\2\u0252\u0254\5u;\2\u0253\u0252\3\2\2\2\u0254"+
		"\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256t\3\2\2\2"+
		"\u0257\u0255\3\2\2\2\u0258\u025a\4\62;\2\u0259\u0258\3\2\2\2\u025a\u025b"+
		"\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025cv\3\2\2\2\u025d"+
		"\u0261\t\30\2\2\u025e\u0260\13\2\2\2\u025f\u025e\3\2\2\2\u0260\u0263\3"+
		"\2\2\2\u0261\u0262\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0264\3\2\2\2\u0263"+
		"\u0261\3\2\2\2\u0264\u0265\t\30\2\2\u0265x\3\2\2\2\u0266\u026a\t\31\2"+
		"\2\u0267\u0269\t\32\2\2\u0268\u0267\3\2\2\2\u0269\u026c\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026bz\3\2\2\2\u026c\u026a\3\2\2\2"+
		"\u026d\u0270\7\u0080\2\2\u026e\u0270\5\35\17\2\u026f\u026d\3\2\2\2\u026f"+
		"\u026e\3\2\2\2\u0270|\3\2\2\2\u0271\u0272\7?\2\2\u0272~\3\2\2\2\u0273"+
		"\u0274\7>\2\2\u0274\u0080\3\2\2\2\u0275\u0276\7>\2\2\u0276\u0277\7/\2"+
		"\2\u0277\u0082\3\2\2\2\u0278\u0279\7>\2\2\u0279\u027a\7@\2\2\u027a\u0084"+
		"\3\2\2\2\u027b\u027c\7>\2\2\u027c\u027d\7?\2\2\u027d\u0086\3\2\2\2\u027e"+
		"\u027f\7@\2\2\u027f\u0088\3\2\2\2\u0280\u0281\7@\2\2\u0281\u0282\7?\2"+
		"\2\u0282\u008a\3\2\2\2\u0283\u0284\7\61\2\2\u0284\u008c\3\2\2\2\u0285"+
		"\u0286\7*\2\2\u0286\u008e\3\2\2\2\u0287\u0288\7+\2\2\u0288\u0090\3\2\2"+
		"\2\u0289\u028a\7-\2\2\u028a\u0092\3\2\2\2\u028b\u028c\7/\2\2\u028c\u0094"+
		"\3\2\2\2\u028d\u0290\7(\2\2\u028e\u0290\5\31\r\2\u028f\u028d\3\2\2\2\u028f"+
		"\u028e\3\2\2\2\u0290\u0096\3\2\2\2\u0291\u0294\7~\2\2\u0292\u0294\5\33"+
		"\16\2\u0293\u0291\3\2\2\2\u0293\u0292\3\2\2\2\u0294\u0098\3\2\2\2\u0295"+
		"\u0296\7_\2\2\u0296\u009a\3\2\2\2\u0297\u0298\7]\2\2\u0298\u009c\3\2\2"+
		"\2\u0299\u029a\7,\2\2\u029a\u009e\3\2\2\2\u029b\u029e\7\'\2\2\u029c\u029e"+
		"\5\37\20\2\u029d\u029b\3\2\2\2\u029d\u029c\3\2\2\2\u029e\u00a0\3\2\2\2"+
		"\u029f\u02a0\7`\2\2\u02a0\u00a2\3\2\2\2\u02a1\u02a2\7=\2\2\u02a2\u00a4"+
		"\3\2\2\2\u02a3\u02a4\7.\2\2\u02a4\u00a6\3\2\2\2\u02a5\u02a6\7<\2\2\u02a6"+
		"\u00a8\3\2\2\2\u02a7\u02a9\t\33\2\2\u02a8\u02a7\3\2\2\2\u02a9\u02aa\3"+
		"\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02ad\bU\2\2\u02ad\u00aa\3\2\2\2\u02ae\u02af\7\61\2\2\u02af\u02b3\7\61"+
		"\2\2\u02b0\u02b2\13\2\2\2\u02b1\u02b0\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3\3\2"+
		"\2\2\u02b6\u02b7\t\34\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\bV\2\2\u02b9"+
		"\u00ac\3\2\2\2\r\2\u0255\u025b\u0261\u026a\u026f\u028f\u0293\u029d\u02aa"+
		"\u02b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}