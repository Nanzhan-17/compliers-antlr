// Generated from c:\Users\hp\Desktop\compliers-antlr\src\main\antlr\simpleexpr\SimpleExpr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Auto=1, Break=2, Case=3, Char=4, Const=5, Continue=6, Default=7, Do=8, 
		Double=9, Else=10, Enum=11, Extern=12, Float=13, For=14, Goto=15, Inline=16, 
		Int=17, Long=18, Register=19, Restrict=20, Return=21, Short=22, Signed=23, 
		Sizeof=24, Static=25, Struct=26, Switch=27, Typedef=28, Union=29, Unsigned=30, 
		Void=31, Volatile=32, While=33, IF=34, ID=35, INTCONST=36, FLOATCONST=37, 
		WS=38, LeftParen=39, RightParen=40, LeftBracket=41, RightBracket=42, LeftBrace=43, 
		RightBrace=44, Arrow=45, Dot=46, PlusPlus=47, MinusMinus=48, And=49, Plus=50, 
		Minus=51, Star=52, Not=53, Tilde=54, Div=55, Mod=56, Less=57, LessEqual=58, 
		Greater=59, GreaterEqual=60, LeftShift=61, RightShift=62, Equal=63, NotEqual=64, 
		Or=65, AndAnd=66, OrOr=67, Caret=68, Question=69, Colon=70, Semi=71, Ellipsis=72, 
		Assign=73, StarAssign=74, DivAssign=75, ModAssign=76, PlusAssign=77, MinusAssign=78, 
		LeftShiftAssign=79, RightShiftAssign=80, AndAssign=81, XorAssign=82, OrAssign=83, 
		Comma=84, Exegesis=85, ExegesisExegesis=86, LessColon=87, ColonMore=88, 
		LessMod=89, ModMore=90, ModColon=91, ModColonModColon=92, LCOMMENT=93, 
		MLCOMMENT=94;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'auto'", "'break'", "'case'", "'char'", "'const'", "'continue'", 
			"'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", 
			"'for'", "'goto'", "'inline'", "'int'", "'long'", "'register'", "'restrict'", 
			"'return'", "'short'", "'signed'", "'sizeof'", "'static'", "'struct'", 
			"'switch'", "'typedef'", "'union'", "'unsigned'", "'void'", "'volatile'", 
			"'while'", "'if'", null, null, null, null, "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'->'", "'.'", "'++'", "'--'", "'&'", "'+'", "'-'", "'*'", 
			"'!'", "'~'", "'/'", "'%'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", 
			"'=='", "'!='", "'|'", "'&&'", "'||'", "'^'", "'?'", "':'", "';'", "'...'", 
			"'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", 
			"'^='", "'|='", "','", "'#'", "'##'", "'<:'", "':>'", "'<%'", "'%>'", 
			"'%:'", "'%:%:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Auto", "Break", "Case", "Char", "Const", "Continue", "Default", 
			"Do", "Double", "Else", "Enum", "Extern", "Float", "For", "Goto", "Inline", 
			"Int", "Long", "Register", "Restrict", "Return", "Short", "Signed", "Sizeof", 
			"Static", "Struct", "Switch", "Typedef", "Union", "Unsigned", "Void", 
			"Volatile", "While", "IF", "ID", "INTCONST", "FLOATCONST", "WS", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Arrow", "Dot", "PlusPlus", "MinusMinus", "And", "Plus", "Minus", "Star", 
			"Not", "Tilde", "Div", "Mod", "Less", "LessEqual", "Greater", "GreaterEqual", 
			"LeftShift", "RightShift", "Equal", "NotEqual", "Or", "AndAnd", "OrOr", 
			"Caret", "Question", "Colon", "Semi", "Ellipsis", "Assign", "StarAssign", 
			"DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", 
			"RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", "Comma", "Exegesis", 
			"ExegesisExegesis", "LessColon", "ColonMore", "LessMod", "ModMore", "ModColon", 
			"ModColonModColon", "LCOMMENT", "MLCOMMENT"
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
	public String getGrammarFileName() { return "SimpleExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleExprParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ID) | (1L << INTCONST) | (1L << LeftParen))) != 0)) {
				{
				{
				setState(6);
				stat();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
			match(EOF);
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

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public TerminalNode Assign() { return getToken(SimpleExprParser.Assign, 0); }
		public TerminalNode IF() { return getToken(SimpleExprParser.IF, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(ID);
				setState(16);
				match(Assign);
				setState(17);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(IF);
				setState(19);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_lo