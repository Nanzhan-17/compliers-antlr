// Generated from C:/Users/hp/Desktop/compliers-antlr/src/main/antlr/simpleexpr\SimpleExpr.g4 by ANTLR 4.9.2
package main.antlr.simpleexpr;
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
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
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(SimpleExprParser.LeftParen, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RightParen() { return getToken(SimpleExprParser.RightParen, 0); }
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public TerminalNode INTCONST() { return getToken(SimpleExprParser.INTCONST, 0); }
		public TerminalNode Star() { return getToken(SimpleExprParser.Star, 0); }
		public TerminalNode Div() { return getToken(SimpleExprParser.Div, 0); }
		public TerminalNode Plus() { return getToken(SimpleExprParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleExprParser.Minus, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				{
				setState(23);
				match(LeftParen);
				setState(24);
				expr(0);
				setState(25);
				match(RightParen);
				}
				break;
			case ID:
				{
				setState(27);
				match(ID);
				}
				break;
			case INTCONST:
				{
				setState(28);
				match(INTCONST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(31);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(32);
						_la = _input.LA(1);
						if ( !(_la==Star || _la==Div) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(33);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(34);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(35);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(36);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3`-\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\27\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4 \n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4(\n\4\f\4\16\4+\13\4\3\4\2\3\6\5\2\4\6\2\4\4\2\66\6699\3\2\64\65"+
		"\2\60\2\13\3\2\2\2\4\26\3\2\2\2\6\37\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n"+
		"\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\16\3\2\2\2\r\13\3\2\2\2\16\17\7"+
		"\2\2\3\17\3\3\2\2\2\20\27\5\6\4\2\21\22\7%\2\2\22\23\7K\2\2\23\27\5\6"+
		"\4\2\24\25\7$\2\2\25\27\5\6\4\2\26\20\3\2\2\2\26\21\3\2\2\2\26\24\3\2"+
		"\2\2\27\5\3\2\2\2\30\31\b\4\1\2\31\32\7)\2\2\32\33\5\6\4\2\33\34\7*\2"+
		"\2\34 \3\2\2\2\35 \7%\2\2\36 \7&\2\2\37\30\3\2\2\2\37\35\3\2\2\2\37\36"+
		"\3\2\2\2 )\3\2\2\2!\"\f\7\2\2\"#\t\2\2\2#(\5\6\4\b$%\f\6\2\2%&\t\3\2\2"+
		"&(\5\6\4\7\'!\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\7\3\2"+
		"\2\2+)\3\2\2\2\7\13\26\37\')";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}