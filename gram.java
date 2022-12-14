// Generated from gram.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gram extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW=1, CLASS=2, METHOD=3, WHILE=4, IF=5, ELSE=6, OP=7, SP=8, DATATYPE=9, 
		OPSQBRAC=10, CLSQBRAC=11, OPBLOCK=12, CLBLOCK=13, OPPAR=14, CLPAR=15, 
		OPANG=16, CLANG=17, ID=18, INT=19, FLOAT=20, SINGLELINECOMMENT=21, MULTILINECOMMENT=22, 
		DQS=23, SQS=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KW", "CLASS", "METHOD", "WHILE", "IF", "ELSE", "OP", "SP", "DATATYPE", 
			"OPSQBRAC", "CLSQBRAC", "OPBLOCK", "CLBLOCK", "OPPAR", "CLPAR", "OPANG", 
			"CLANG", "ID", "INT", "FLOAT", "SINGLELINECOMMENT", "MULTILINECOMMENT", 
			"DQS", "SQS", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Console'", "'Write'", "'while'", "'if'", "'else'", null, 
			null, null, "'['", "']'", "'{'", "'}'", "'('", "')'", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW", "CLASS", "METHOD", "WHILE", "IF", "ELSE", "OP", "SP", "DATATYPE", 
			"OPSQBRAC", "CLSQBRAC", "OPBLOCK", "CLBLOCK", "OPPAR", "CLPAR", "OPANG", 
			"CLANG", "ID", "INT", "FLOAT", "SINGLELINECOMMENT", "MULTILINECOMMENT", 
			"DQS", "SQS", "WS"
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


	public gram(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gram.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			KW_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			CLASS_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			METHOD_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			OP_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			DATATYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			OPSQBRAC_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			CLSQBRAC_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			OPBLOCK_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			CLBLOCK_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			OPPAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			CLPAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			OPANG_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			CLANG_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			FLOAT_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			SINGLELINECOMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			MULTILINECOMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			DQS_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			SQS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void KW_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("< Keyword, 'using' >");
			break;
		case 1:
			System.out.println("< Keyword, 'System' >");
			break;
		case 2:
			System.out.println("< Keyword, 'namespace' >");
			break;
		case 3:
			System.out.println("< Keyword, 'class' >");
			break;
		case 4:
			System.out.println("< Keyword, 'static' >");
			break;
		case 5:
			System.out.println("< Keyword>, 'Main' >");
			break;
		case 6:
			System.out.println("< Keyword, 'agrs' >");
			break;
		case 7:
			System.out.println("< Keyword, 'public' >");
			break;
		case 8:
			System.out.println("< Keyword, 'parse' >");
			break;
		case 9:
			System.out.println("< Keyword, 'ReadLine' >");
			break;
		case 10:
			System.out.println("< KEYWORD, for >");
			break;
		case 11:
			System.out.println("< KEYWORD, break >");
			break;
		case 12:
			System.out.println("< KEYWORD, flag >");
			break;
		}
	}
	private void CLASS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			System.out.println("< CLASS, Console >");
			break;
		}
	}
	private void METHOD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			System.out.println("< METHOD, Write >");
			break;
		}
	}
	private void WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			System.out.println("< WHILE >");
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			System.out.println("< IF >");
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			System.out.println("< ELSE >");
			break;
		}
	}
	private void OP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			System.out.println("< Operator, + >");
			break;
		case 19:
			System.out.println("< Operator, - >");
			break;
		case 20:
			System.out.println("< Operator, / >");
			break;
		case 21:
			System.out.println("< Operator, % >");
			break;
		case 22:
			System.out.println("< Operator, & >");
			break;
		case 23:
			System.out.println("< Operator, ++ >");
			break;
		case 24:
			System.out.println("< Operator, -- >");
			break;
		case 25:
			System.out.println("< Operator, ! >");
			break;
		case 26:
			System.out.println("< Operator, = >");
			break;
		case 27:
			System.out.println("< Operator, * >");
			break;
		case 28:
			System.out.println("< Operator, && >");
			break;
		case 29:
			System.out.println("< Operator, <= >");
			break;
		case 30:
			System.out.println("< Operator, == >");
			break;
		case 31:
			System.out.println("< Operator, != >");
			break;
		case 32:
			System.out.println("< Operator, >= >");
			break;
		}
	}
	private void DATATYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33:
			System.out.println("< DATATYPE, char >");
			break;
		case 34:
			System.out.println("< DATATYPE, bool >");
			break;
		case 35:
			System.out.println("< DATATYPE, long >");
			break;
		case 36:
			System.out.println("< DATATYPE, double >");
			break;
		case 37:
			System.out.println("< DATATYPE, string >");
			break;
		case 38:
			System.out.println("< DATATYPE, void >");
			break;
		case 39:
			System.out.println("< DATATYPE, int>");
			break;
		case 40:
			System.out.println("< DATATYPE, float >");
			break;
		}
	}
	private void OPSQBRAC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41:
			System.out.println("< Square Bracket - Open, [ >");
			break;
		}
	}
	private void CLSQBRAC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42:
			System.out.println("< Square Bracket - Close, ] >");
			break;
		}
	}
	private void OPBLOCK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43:
			System.out.println("< Curly Bracket - Open, { >");
			break;
		}
	}
	private void CLBLOCK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 44:
			System.out.println("< Curly Bracket - Close, } >");
			break;
		}
	}
	private void OPPAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45:
			System.out.println("< Parentheses - Open, ( >");
			break;
		}
	}
	private void CLPAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 46:
			System.out.println("< Parentheses - Close, ) >");
			break;
		}
	}
	private void OPANG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 47:
			System.out.println("< Angle-Open, < >");
			break;
		}
	}
	private void CLANG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 48:
			System.out.println("< Angle-Close, < >");
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 49:
			System.out.println("< Identifier >");
			break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 50:
			System.out.println("< Positive Integer (number) >");
			break;
		case 51:
			System.out.println("< Negative Integer (number) >");
			break;
		}
	}
	private void FLOAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 52:
			System.out.println("< Positive Float (number) >");
			break;
		case 53:
			System.out.println("< Negative Float (number) >");
			break;
		}
	}
	private void SINGLELINECOMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 54:
			System.out.println("< Single Line Comment >");
			break;
		}
	}
	private void MULTILINECOMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 55:
			System.out.println("< Multi Line Comment >");
			break;
		}
	}
	private void DQS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 56:
			System.out.println("< Double Q str >");
			break;
		}
	}
	private void SQS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 57:
			System.out.println("< Single Q str >");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u01a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0096\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ea\n\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0122"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\7\23\u013e"+
		"\n\23\f\23\16\23\u0141\13\23\3\23\3\23\3\24\6\24\u0146\n\24\r\24\16\24"+
		"\u0147\3\24\3\24\3\24\6\24\u014d\n\24\r\24\16\24\u014e\3\24\5\24\u0152"+
		"\n\24\3\25\6\25\u0155\n\25\r\25\16\25\u0156\3\25\3\25\6\25\u015b\n\25"+
		"\r\25\16\25\u015c\3\25\3\25\3\25\6\25\u0162\n\25\r\25\16\25\u0163\3\25"+
		"\3\25\6\25\u0168\n\25\r\25\16\25\u0169\3\25\5\25\u016d\n\25\3\26\3\26"+
		"\6\26\u0171\n\26\r\26\16\26\u0172\3\26\7\26\u0176\n\26\f\26\16\26\u0179"+
		"\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0181\n\27\f\27\16\27\u0184"+
		"\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\6\30\u018d\n\30\r\30\16\30\u018e"+
		"\3\30\3\30\3\30\3\31\3\31\6\31\u0196\n\31\r\31\16\31\u0197\3\31\3\31\3"+
		"\31\3\32\6\32\u019e\n\32\r\32\16\32\u019f\3\32\3\32\2\2\33\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\n\5\2..\60\60==\5\2C\\aac|\6"+
		"\2\62;C\\aac|\3\2\62;\4\2\f\f\17\17\3\2$$\3\2))\5\2\13\f\17\17\"\"\2\u01d2"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\3\u0095\3\2\2\2\5\u0097\3\2\2\2\7\u00a1\3"+
		"\2\2\2\t\u00a9\3\2\2\2\13\u00b1\3\2\2\2\r\u00b6\3\2\2\2\17\u00e9\3\2\2"+
		"\2\21\u00eb\3\2\2\2\23\u0121\3\2\2\2\25\u0123\3\2\2\2\27\u0126\3\2\2\2"+
		"\31\u0129\3\2\2\2\33\u012c\3\2\2\2\35\u012f\3\2\2\2\37\u0132\3\2\2\2!"+
		"\u0135\3\2\2\2#\u0138\3\2\2\2%\u013b\3\2\2\2\'\u0151\3\2\2\2)\u016c\3"+
		"\2\2\2+\u0170\3\2\2\2-\u017c\3\2\2\2/\u018a\3\2\2\2\61\u0193\3\2\2\2\63"+
		"\u019d\3\2\2\2\65\66\7w\2\2\66\67\7u\2\2\678\7k\2\289\7p\2\29:\7i\2\2"+
		":;\3\2\2\2;\u0096\b\2\2\2<=\7U\2\2=>\7{\2\2>?\7u\2\2?@\7v\2\2@A\7g\2\2"+
		"AB\7o\2\2BC\3\2\2\2C\u0096\b\2\3\2DE\7p\2\2EF\7c\2\2FG\7o\2\2GH\7g\2\2"+
		"HI\7u\2\2IJ\7r\2\2JK\7c\2\2KL\7e\2\2LM\7g\2\2MN\3\2\2\2N\u0096\b\2\4\2"+
		"OP\7e\2\2PQ\7n\2\2QR\7c\2\2RS\7u\2\2ST\7u\2\2TU\3\2\2\2U\u0096\b\2\5\2"+
		"VW\7u\2\2WX\7v\2\2XY\7c\2\2YZ\7v\2\2Z[\7k\2\2[\\\7e\2\2\\]\3\2\2\2]\u0096"+
		"\b\2\6\2^_\7O\2\2_`\7c\2\2`a\7k\2\2ab\7p\2\2bc\3\2\2\2c\u0096\b\2\7\2"+
		"de\7c\2\2ef\7t\2\2fg\7i\2\2gh\7u\2\2hi\3\2\2\2i\u0096\b\2\b\2jk\7r\2\2"+
		"kl\7w\2\2lm\7d\2\2mn\7n\2\2no\7k\2\2op\7e\2\2pq\3\2\2\2q\u0096\b\2\t\2"+
		"rs\7r\2\2st\7c\2\2tu\7t\2\2uv\7u\2\2vw\7g\2\2wx\3\2\2\2x\u0096\b\2\n\2"+
		"yz\7T\2\2z{\7g\2\2{|\7c\2\2|}\7f\2\2}~\7N\2\2~\177\7k\2\2\177\u0080\7"+
		"p\2\2\u0080\u0081\7g\2\2\u0081\u0082\3\2\2\2\u0082\u0096\b\2\13\2\u0083"+
		"\u0084\7h\2\2\u0084\u0085\7q\2\2\u0085\u0086\7t\2\2\u0086\u0087\3\2\2"+
		"\2\u0087\u0096\b\2\f\2\u0088\u0089\7d\2\2\u0089\u008a\7t\2\2\u008a\u008b"+
		"\7g\2\2\u008b\u008c\7c\2\2\u008c\u008d\7m\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0096\b\2\r\2\u008f\u0090\7h\2\2\u0090\u0091\7n\2\2\u0091\u0092\7c\2"+
		"\2\u0092\u0093\7i\2\2\u0093\u0094\3\2\2\2\u0094\u0096\b\2\16\2\u0095\65"+
		"\3\2\2\2\u0095<\3\2\2\2\u0095D\3\2\2\2\u0095O\3\2\2\2\u0095V\3\2\2\2\u0095"+
		"^\3\2\2\2\u0095d\3\2\2\2\u0095j\3\2\2\2\u0095r\3\2\2\2\u0095y\3\2\2\2"+
		"\u0095\u0083\3\2\2\2\u0095\u0088\3\2\2\2\u0095\u008f\3\2\2\2\u0096\4\3"+
		"\2\2\2\u0097\u0098\7E\2\2\u0098\u0099\7q\2\2\u0099\u009a\7p\2\2\u009a"+
		"\u009b\7u\2\2\u009b\u009c\7q\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\u00a0\b\3\17\2\u00a0\6\3\2\2\2\u00a1\u00a2"+
		"\7Y\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\4\20\2\u00a8\b\3\2\2\2"+
		"\u00a9\u00aa\7y\2\2\u00aa\u00ab\7j\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad"+
		"\7n\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\5\21\2\u00b0"+
		"\n\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\b\6\22\2\u00b5\f\3\2\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7n\2\2"+
		"\u00b8\u00b9\7u\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\b\7\23\2\u00bc\16\3\2\2\2\u00bd\u00be\7-\2\2\u00be\u00ea\b\b\24\2\u00bf"+
		"\u00c0\7/\2\2\u00c0\u00ea\b\b\25\2\u00c1\u00c2\7\61\2\2\u00c2\u00ea\b"+
		"\b\26\2\u00c3\u00c4\7\'\2\2\u00c4\u00ea\b\b\27\2\u00c5\u00c6\7(\2\2\u00c6"+
		"\u00ea\b\b\30\2\u00c7\u00c8\7-\2\2\u00c8\u00c9\7-\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00ea\b\b\31\2\u00cb\u00cc\7/\2\2\u00cc\u00cd\7/\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00ea\b\b\32\2\u00cf\u00d0\7#\2\2\u00d0\u00ea\b\b"+
		"\33\2\u00d1\u00d2\7?\2\2\u00d2\u00ea\b\b\34\2\u00d3\u00d4\7,\2\2\u00d4"+
		"\u00ea\b\b\35\2\u00d5\u00d6\7(\2\2\u00d6\u00d7\7(\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00ea\b\b\36\2\u00d9\u00da\7>\2\2\u00da\u00db\7?\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00ea\b\b\37\2\u00dd\u00de\7?\2\2\u00de\u00df\7?"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00ea\b\b \2\u00e1\u00e2\7#\2\2\u00e2\u00e3"+
		"\7?\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00ea\b\b!\2\u00e5\u00e6\7@\2\2\u00e6"+
		"\u00e7\7?\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\b\b\"\2\u00e9\u00bd\3\2"+
		"\2\2\u00e9\u00bf\3\2\2\2\u00e9\u00c1\3\2\2\2\u00e9\u00c3\3\2\2\2\u00e9"+
		"\u00c5\3\2\2\2\u00e9\u00c7\3\2\2\2\u00e9\u00cb\3\2\2\2\u00e9\u00cf\3\2"+
		"\2\2\u00e9\u00d1\3\2\2\2\u00e9\u00d3\3\2\2\2\u00e9\u00d5\3\2\2\2\u00e9"+
		"\u00d9\3\2\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e5\3\2"+
		"\2\2\u00ea\20\3\2\2\2\u00eb\u00ec\t\2\2\2\u00ec\22\3\2\2\2\u00ed\u00ee"+
		"\7e\2\2\u00ee\u00ef\7j\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7t\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u0122\b\n#\2\u00f3\u00f4\7d\2\2\u00f4\u00f5\7q\2"+
		"\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0122"+
		"\b\n$\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7p\2\2\u00fc"+
		"\u00fd\7i\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0122\b\n%\2\u00ff\u0100\7f\2"+
		"\2\u0100\u0101\7q\2\2\u0101\u0102\7w\2\2\u0102\u0103\7d\2\2\u0103\u0104"+
		"\7n\2\2\u0104\u0105\7g\2\2\u0105\u0106\3\2\2\2\u0106\u0122\b\n&\2\u0107"+
		"\u0108\7u\2\2\u0108\u0109\7v\2\2\u0109\u010a\7t\2\2\u010a\u010b\7k\2\2"+
		"\u010b\u010c\7p\2\2\u010c\u010d\7i\2\2\u010d\u010e\3\2\2\2\u010e\u0122"+
		"\b\n\'\2\u010f\u0110\7x\2\2\u0110\u0111\7q\2\2\u0111\u0112\7k\2\2\u0112"+
		"\u0113\7f\2\2\u0113\u0114\3\2\2\2\u0114\u0122\b\n(\2\u0115\u0116\7k\2"+
		"\2\u0116\u0117\7p\2\2\u0117\u0118\7v\2\2\u0118\u0119\3\2\2\2\u0119\u0122"+
		"\b\n)\2\u011a\u011b\7h\2\2\u011b\u011c\7n\2\2\u011c\u011d\7q\2\2\u011d"+
		"\u011e\7c\2\2\u011e\u011f\7v\2\2\u011f\u0120\3\2\2\2\u0120\u0122\b\n*"+
		"\2\u0121\u00ed\3\2\2\2\u0121\u00f3\3\2\2\2\u0121\u00f9\3\2\2\2\u0121\u00ff"+
		"\3\2\2\2\u0121\u0107\3\2\2\2\u0121\u010f\3\2\2\2\u0121\u0115\3\2\2\2\u0121"+
		"\u011a\3\2\2\2\u0122\24\3\2\2\2\u0123\u0124\7]\2\2\u0124\u0125\b\13+\2"+
		"\u0125\26\3\2\2\2\u0126\u0127\7_\2\2\u0127\u0128\b\f,\2\u0128\30\3\2\2"+
		"\2\u0129\u012a\7}\2\2\u012a\u012b\b\r-\2\u012b\32\3\2\2\2\u012c\u012d"+
		"\7\177\2\2\u012d\u012e\b\16.\2\u012e\34\3\2\2\2\u012f\u0130\7*\2\2\u0130"+
		"\u0131\b\17/\2\u0131\36\3\2\2\2\u0132\u0133\7+\2\2\u0133\u0134\b\20\60"+
		"\2\u0134 \3\2\2\2\u0135\u0136\7>\2\2\u0136\u0137\b\21\61\2\u0137\"\3\2"+
		"\2\2\u0138\u0139\7@\2\2\u0139\u013a\b\22\62\2\u013a$\3\2\2\2\u013b\u013f"+
		"\t\3\2\2\u013c\u013e\t\4\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0142\u0143\b\23\63\2\u0143&\3\2\2\2\u0144\u0146\t\5\2\2\u0145\u0144"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0152\b\24\64\2\u014a\u014c\7/\2\2\u014b\u014d\t"+
		"\5\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\b\24\65\2\u0151\u0145\3"+
		"\2\2\2\u0151\u014a\3\2\2\2\u0152(\3\2\2\2\u0153\u0155\t\5\2\2\u0154\u0153"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\7\60\2\2\u0159\u015b\t\5\2\2\u015a\u0159\3"+
		"\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u016d\b\25\66\2\u015f\u0161\7/\2\2\u0160\u0162\t"+
		"\5\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\7\60\2\2\u0166\u0168\t"+
		"\5\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\b\25\67\2\u016c\u0154\3"+
		"\2\2\2\u016c\u015f\3\2\2\2\u016d*\3\2\2\2\u016e\u016f\7\61\2\2\u016f\u0171"+
		"\7\61\2\2\u0170\u016e\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2"+
		"\u0172\u0173\3\2\2\2\u0173\u0177\3\2\2\2\u0174\u0176\n\6\2\2\u0175\u0174"+
		"\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\b\268\2\u017b,\3\2\2\2"+
		"\u017c\u017d\7\61\2\2\u017d\u017e\7,\2\2\u017e\u0182\3\2\2\2\u017f\u0181"+
		"\13\2\2\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2"+
		"\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186"+
		"\7,\2\2\u0186\u0187\7\61\2\2\u0187\u0188\3\2\2\2\u0188\u0189\b\279\2\u0189"+
		".\3\2\2\2\u018a\u018c\7$\2\2\u018b\u018d\n\7\2\2\u018c\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0191\7$\2\2\u0191\u0192\b\30:\2\u0192\60\3\2\2\2\u0193\u0195"+
		"\7)\2\2\u0194\u0196\n\b\2\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\7)"+
		"\2\2\u019a\u019b\b\31;\2\u019b\62\3\2\2\2\u019c\u019e\t\t\2\2\u019d\u019c"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a2\b\32<\2\u01a2\64\3\2\2\2\25\2\u0095\u00e9\u0121"+
		"\u013f\u0147\u014e\u0151\u0156\u015c\u0163\u0169\u016c\u0172\u0177\u0182"+
		"\u018e\u0197\u019f=\3\2\2\3\2\3\3\2\4\3\2\5\3\2\6\3\2\7\3\2\b\3\2\t\3"+
		"\2\n\3\2\13\3\2\f\3\2\r\3\2\16\3\3\17\3\4\20\3\5\21\3\6\22\3\7\23\3\b"+
		"\24\3\b\25\3\b\26\3\b\27\3\b\30\3\b\31\3\b\32\3\b\33\3\b\34\3\b\35\3\b"+
		"\36\3\b\37\3\b \3\b!\3\b\"\3\n#\3\n$\3\n%\3\n&\3\n\'\3\n(\3\n)\3\n*\3"+
		"\13+\3\f,\3\r-\3\16.\3\17/\3\20\60\3\21\61\3\22\62\3\23\63\3\24\64\3\24"+
		"\65\3\25\66\3\25\67\3\268\3\279\3\30:\3\31;\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}