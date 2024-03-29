// Generated from C:/Users/oviquez/Documents/00.Cursos/Compiladores (IC-5701)/2024/I Semestre/tests/Parser1/ElScanner.g4 by ANTLR 4.13.1
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ElScanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, ASSIGN=2, PIZQ=3, PDER=4, VIR=5, DOSPUN=6, SUM=7, SUB=8, MUL=9, 
		DIV=10, COMA=11, IF=12, WHILE=13, LET=14, THEN=15, ELSE=16, IN=17, DO=18, 
		BEGIN=19, END=20, CONST=21, VAR=22, ID=23, NUM=24, LINE_COMMENT=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PyCOMA", "ASSIGN", "PIZQ", "PDER", "VIR", "DOSPUN", "SUM", "SUB", "MUL", 
			"DIV", "COMA", "IF", "WHILE", "LET", "THEN", "ELSE", "IN", "DO", "BEGIN", 
			"END", "CONST", "VAR", "ID", "NUM", "LETTER", "DIGIT", "LINE_COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'('", "')'", "'~'", "':'", "'+'", "'-'", "'*'", 
			"'/'", "','", "'if'", "'while'", "'let'", "'then'", "'else'", "'in'", 
			"'do'", "'begin'", "'end'", "'const'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "ASSIGN", "PIZQ", "PDER", "VIR", "DOSPUN", "SUM", "SUB", 
			"MUL", "DIV", "COMA", "IF", "WHILE", "LET", "THEN", "ELSE", "IN", "DO", 
			"BEGIN", "END", "CONST", "VAR", "ID", "NUM", "LINE_COMMENT", "WS"
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


	public ElScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ElScanner.g4"; }

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
		"\u0004\u0000\u001a\u00a9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0084\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u008a\b\u0016\n\u0016\f\u0016\u008d\t\u0016\u0001\u0017\u0004\u0017\u0090"+
		"\b\u0017\u000b\u0017\f\u0017\u0091\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u009c\b\u001a\n\u001a\f\u001a\u009f\t\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0004\u001b\u00a4\b\u001b\u000b\u001b\f\u001b\u00a5\u0001\u001b"+
		"\u0001\u001b\u0000\u0000\u001c\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00003\u00005\u00197\u001a\u0001"+
		"\u0000\u0003\u0002\u0000AZaz\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r "+
		" \u00ad\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007"+
		"\u0001\u0000\u0000\u0000\u00019\u0001\u0000\u0000\u0000\u0003;\u0001\u0000"+
		"\u0000\u0000\u0005>\u0001\u0000\u0000\u0000\u0007@\u0001\u0000\u0000\u0000"+
		"\tB\u0001\u0000\u0000\u0000\u000bD\u0001\u0000\u0000\u0000\rF\u0001\u0000"+
		"\u0000\u0000\u000fH\u0001\u0000\u0000\u0000\u0011J\u0001\u0000\u0000\u0000"+
		"\u0013L\u0001\u0000\u0000\u0000\u0015N\u0001\u0000\u0000\u0000\u0017P"+
		"\u0001\u0000\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001bY\u0001\u0000"+
		"\u0000\u0000\u001d]\u0001\u0000\u0000\u0000\u001fb\u0001\u0000\u0000\u0000"+
		"!g\u0001\u0000\u0000\u0000#j\u0001\u0000\u0000\u0000%m\u0001\u0000\u0000"+
		"\u0000\'s\u0001\u0000\u0000\u0000)w\u0001\u0000\u0000\u0000+}\u0001\u0000"+
		"\u0000\u0000-\u0083\u0001\u0000\u0000\u0000/\u008f\u0001\u0000\u0000\u0000"+
		"1\u0093\u0001\u0000\u0000\u00003\u0095\u0001\u0000\u0000\u00005\u0097"+
		"\u0001\u0000\u0000\u00007\u00a3\u0001\u0000\u0000\u00009:\u0005;\u0000"+
		"\u0000:\u0002\u0001\u0000\u0000\u0000;<\u0005:\u0000\u0000<=\u0005=\u0000"+
		"\u0000=\u0004\u0001\u0000\u0000\u0000>?\u0005(\u0000\u0000?\u0006\u0001"+
		"\u0000\u0000\u0000@A\u0005)\u0000\u0000A\b\u0001\u0000\u0000\u0000BC\u0005"+
		"~\u0000\u0000C\n\u0001\u0000\u0000\u0000DE\u0005:\u0000\u0000E\f\u0001"+
		"\u0000\u0000\u0000FG\u0005+\u0000\u0000G\u000e\u0001\u0000\u0000\u0000"+
		"HI\u0005-\u0000\u0000I\u0010\u0001\u0000\u0000\u0000JK\u0005*\u0000\u0000"+
		"K\u0012\u0001\u0000\u0000\u0000LM\u0005/\u0000\u0000M\u0014\u0001\u0000"+
		"\u0000\u0000NO\u0005,\u0000\u0000O\u0016\u0001\u0000\u0000\u0000PQ\u0005"+
		"i\u0000\u0000QR\u0005f\u0000\u0000R\u0018\u0001\u0000\u0000\u0000ST\u0005"+
		"w\u0000\u0000TU\u0005h\u0000\u0000UV\u0005i\u0000\u0000VW\u0005l\u0000"+
		"\u0000WX\u0005e\u0000\u0000X\u001a\u0001\u0000\u0000\u0000YZ\u0005l\u0000"+
		"\u0000Z[\u0005e\u0000\u0000[\\\u0005t\u0000\u0000\\\u001c\u0001\u0000"+
		"\u0000\u0000]^\u0005t\u0000\u0000^_\u0005h\u0000\u0000_`\u0005e\u0000"+
		"\u0000`a\u0005n\u0000\u0000a\u001e\u0001\u0000\u0000\u0000bc\u0005e\u0000"+
		"\u0000cd\u0005l\u0000\u0000de\u0005s\u0000\u0000ef\u0005e\u0000\u0000"+
		"f \u0001\u0000\u0000\u0000gh\u0005i\u0000\u0000hi\u0005n\u0000\u0000i"+
		"\"\u0001\u0000\u0000\u0000jk\u0005d\u0000\u0000kl\u0005o\u0000\u0000l"+
		"$\u0001\u0000\u0000\u0000mn\u0005b\u0000\u0000no\u0005e\u0000\u0000op"+
		"\u0005g\u0000\u0000pq\u0005i\u0000\u0000qr\u0005n\u0000\u0000r&\u0001"+
		"\u0000\u0000\u0000st\u0005e\u0000\u0000tu\u0005n\u0000\u0000uv\u0005d"+
		"\u0000\u0000v(\u0001\u0000\u0000\u0000wx\u0005c\u0000\u0000xy\u0005o\u0000"+
		"\u0000yz\u0005n\u0000\u0000z{\u0005s\u0000\u0000{|\u0005t\u0000\u0000"+
		"|*\u0001\u0000\u0000\u0000}~\u0005v\u0000\u0000~\u007f\u0005a\u0000\u0000"+
		"\u007f\u0080\u0005r\u0000\u0000\u0080,\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0005_\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u008b\u00031\u0018\u0000\u0086\u008a\u00031\u0018"+
		"\u0000\u0087\u008a\u00033\u0019\u0000\u0088\u008a\u0005_\u0000\u0000\u0089"+
		"\u0086\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		".\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u00033\u0019\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u00920\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0000"+
		"\u0000\u0000\u00942\u0001\u0000\u0000\u0000\u0095\u0096\u000209\u0000"+
		"\u00964\u0001\u0000\u0000\u0000\u0097\u0098\u0005/\u0000\u0000\u0098\u0099"+
		"\u0005/\u0000\u0000\u0099\u009d\u0001\u0000\u0000\u0000\u009a\u009c\b"+
		"\u0001\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0006\u001a\u0000\u0000\u00a16\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a4\u0007\u0002\u0000\u0000\u00a3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0006\u001b\u0000\u0000\u00a88\u0001\u0000\u0000"+
		"\u0000\u0007\u0000\u0083\u0089\u008b\u0091\u009d\u00a5\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}