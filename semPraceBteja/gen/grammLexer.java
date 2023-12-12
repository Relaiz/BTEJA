// Generated from D:/Program Files/projects/BTEJA/semPraceBteja/gramm.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class grammLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ID=2, INTEGER=3, REAL=4, BOOLEAN=5, IF=6, THEN=7, ELSE=8, WHILE=9, 
		DO=10, BEGIN=11, END=12, RETURN=13, MODULE=14, DOT=15, COMMA=16, COLON=17, 
		SEMI=18, ASSIGN=19, LPAREN=20, RPAREN=21, ADDOP=22, MULOP=23, RELOP=24, 
		WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ID", "INTEGER", "REAL", "BOOLEAN", "IF", "THEN", "ELSE", "WHILE", 
			"DO", "BEGIN", "END", "RETURN", "MODULE", "DOT", "COMMA", "COLON", "SEMI", 
			"ASSIGN", "LPAREN", "RPAREN", "ADDOP", "MULOP", "RELOP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'VAR'", null, "'INTEGER'", "'REAL'", "'BOOLEAN'", "'IF'", "'THEN'", 
			"'ELSE'", "'WHILE'", "'DO'", "'BEGIN'", "'END'", "'RETURN'", "'MODULE'", 
			"'.'", "','", "':'", "';'", "':='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ID", "INTEGER", "REAL", "BOOLEAN", "IF", "THEN", "ELSE", 
			"WHILE", "DO", "BEGIN", "END", "RETURN", "MODULE", "DOT", "COMMA", "COLON", 
			"SEMI", "ASSIGN", "LPAREN", "RPAREN", "ADDOP", "MULOP", "RELOP", "WS"
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


	public grammLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramm.g4"; }

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
		"\u0004\u0000\u0019\u00a5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u009d\b\u0017\u0001\u0018\u0004\u0018\u00a0\b\u0018"+
		"\u000b\u0018\f\u0018\u00a1\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u0019\u0001\u0000\u0005\u0003\u0000AZ__az\u0004\u000009AZ__az"+
		"\u0002\u0000++--\u0002\u0000**//\u0003\u0000\t\n\r\r  \u00aa\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u0003"+
		"7\u0001\u0000\u0000\u0000\u0005>\u0001\u0000\u0000\u0000\u0007F\u0001"+
		"\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000bS\u0001\u0000\u0000"+
		"\u0000\rV\u0001\u0000\u0000\u0000\u000f[\u0001\u0000\u0000\u0000\u0011"+
		"`\u0001\u0000\u0000\u0000\u0013f\u0001\u0000\u0000\u0000\u0015i\u0001"+
		"\u0000\u0000\u0000\u0017o\u0001\u0000\u0000\u0000\u0019s\u0001\u0000\u0000"+
		"\u0000\u001bz\u0001\u0000\u0000\u0000\u001d\u0081\u0001\u0000\u0000\u0000"+
		"\u001f\u0083\u0001\u0000\u0000\u0000!\u0085\u0001\u0000\u0000\u0000#\u0087"+
		"\u0001\u0000\u0000\u0000%\u0089\u0001\u0000\u0000\u0000\'\u008c\u0001"+
		"\u0000\u0000\u0000)\u008e\u0001\u0000\u0000\u0000+\u0090\u0001\u0000\u0000"+
		"\u0000-\u0092\u0001\u0000\u0000\u0000/\u009c\u0001\u0000\u0000\u00001"+
		"\u009f\u0001\u0000\u0000\u000034\u0005V\u0000\u000045\u0005A\u0000\u0000"+
		"56\u0005R\u0000\u00006\u0002\u0001\u0000\u0000\u00007;\u0007\u0000\u0000"+
		"\u00008:\u0007\u0001\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0004"+
		"\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0005I\u0000\u0000"+
		"?@\u0005N\u0000\u0000@A\u0005T\u0000\u0000AB\u0005E\u0000\u0000BC\u0005"+
		"G\u0000\u0000CD\u0005E\u0000\u0000DE\u0005R\u0000\u0000E\u0006\u0001\u0000"+
		"\u0000\u0000FG\u0005R\u0000\u0000GH\u0005E\u0000\u0000HI\u0005A\u0000"+
		"\u0000IJ\u0005L\u0000\u0000J\b\u0001\u0000\u0000\u0000KL\u0005B\u0000"+
		"\u0000LM\u0005O\u0000\u0000MN\u0005O\u0000\u0000NO\u0005L\u0000\u0000"+
		"OP\u0005E\u0000\u0000PQ\u0005A\u0000\u0000QR\u0005N\u0000\u0000R\n\u0001"+
		"\u0000\u0000\u0000ST\u0005I\u0000\u0000TU\u0005F\u0000\u0000U\f\u0001"+
		"\u0000\u0000\u0000VW\u0005T\u0000\u0000WX\u0005H\u0000\u0000XY\u0005E"+
		"\u0000\u0000YZ\u0005N\u0000\u0000Z\u000e\u0001\u0000\u0000\u0000[\\\u0005"+
		"E\u0000\u0000\\]\u0005L\u0000\u0000]^\u0005S\u0000\u0000^_\u0005E\u0000"+
		"\u0000_\u0010\u0001\u0000\u0000\u0000`a\u0005W\u0000\u0000ab\u0005H\u0000"+
		"\u0000bc\u0005I\u0000\u0000cd\u0005L\u0000\u0000de\u0005E\u0000\u0000"+
		"e\u0012\u0001\u0000\u0000\u0000fg\u0005D\u0000\u0000gh\u0005O\u0000\u0000"+
		"h\u0014\u0001\u0000\u0000\u0000ij\u0005B\u0000\u0000jk\u0005E\u0000\u0000"+
		"kl\u0005G\u0000\u0000lm\u0005I\u0000\u0000mn\u0005N\u0000\u0000n\u0016"+
		"\u0001\u0000\u0000\u0000op\u0005E\u0000\u0000pq\u0005N\u0000\u0000qr\u0005"+
		"D\u0000\u0000r\u0018\u0001\u0000\u0000\u0000st\u0005R\u0000\u0000tu\u0005"+
		"E\u0000\u0000uv\u0005T\u0000\u0000vw\u0005U\u0000\u0000wx\u0005R\u0000"+
		"\u0000xy\u0005N\u0000\u0000y\u001a\u0001\u0000\u0000\u0000z{\u0005M\u0000"+
		"\u0000{|\u0005O\u0000\u0000|}\u0005D\u0000\u0000}~\u0005U\u0000\u0000"+
		"~\u007f\u0005L\u0000\u0000\u007f\u0080\u0005E\u0000\u0000\u0080\u001c"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005.\u0000\u0000\u0082\u001e\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005,\u0000\u0000\u0084 \u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005:\u0000\u0000\u0086\"\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005;\u0000\u0000\u0088$\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005:\u0000\u0000\u008a\u008b\u0005=\u0000\u0000\u008b&\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005(\u0000\u0000\u008d(\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005)\u0000\u0000\u008f*\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0007\u0002\u0000\u0000\u0091,\u0001\u0000\u0000\u0000\u0092\u0093\u0007"+
		"\u0003\u0000\u0000\u0093.\u0001\u0000\u0000\u0000\u0094\u009d\u0002<="+
		"\u0000\u0095\u0096\u0005<\u0000\u0000\u0096\u009d\u0005=\u0000\u0000\u0097"+
		"\u009d\u0005>\u0000\u0000\u0098\u0099\u0005>\u0000\u0000\u0099\u009d\u0005"+
		"=\u0000\u0000\u009a\u009b\u0005<\u0000\u0000\u009b\u009d\u0005>\u0000"+
		"\u0000\u009c\u0094\u0001\u0000\u0000\u0000\u009c\u0095\u0001\u0000\u0000"+
		"\u0000\u009c\u0097\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d0\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0007\u0004\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0006\u0018\u0000\u0000\u00a42\u0001\u0000\u0000\u0000\u0004"+
		"\u0000;\u009c\u00a1\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}