// Generated from C:/Users/oviquez/Documents/00.Cursos/Compiladores (IC-5701)/2024/I Semestre/tests/Parser1/ElParser.g4 by ANTLR 4.13.1
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ElParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, ASSIGN=2, PIZQ=3, PDER=4, VIR=5, DOSPUN=6, SUM=7, SUB=8, MUL=9, 
		DIV=10, COMA=11, IF=12, WHILE=13, LET=14, THEN=15, ELSE=16, IN=17, DO=18, 
		BEGIN=19, END=20, CONST=21, VAR=22, ID=23, NUM=24, LINE_COMMENT=25, WS=26;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_singleCommand = 2, RULE_declaration = 3, 
		RULE_singleDeclaration = 4, RULE_typeDenoter = 5, RULE_expression = 6, 
		RULE_primaryExpression = 7, RULE_operator = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "singleCommand", "declaration", "singleDeclaration", 
			"typeDenoter", "expression", "primaryExpression", "operator"
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

	@Override
	public String getGrammarFileName() { return "ElParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ElParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			singleCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(ElParser.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(ElParser.PyCOMA, i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			singleCommand();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(21);
				match(PyCOMA);
				setState(22);
				singleCommand();
				}
				}
				setState(27);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SingleCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ElParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ElParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(ElParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(ElParser.PDER, 0); }
		public TerminalNode IF() { return getToken(ElParser.IF, 0); }
		public TerminalNode THEN() { return getToken(ElParser.THEN, 0); }
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ElParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(ElParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(ElParser.DO, 0); }
		public TerminalNode LET() { return getToken(ElParser.LET, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(ElParser.IN, 0); }
		public TerminalNode BEGIN() { return getToken(ElParser.BEGIN, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode END() { return getToken(ElParser.END, 0); }
		public SingleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCommand; }
	}

	public final SingleCommandContext singleCommand() throws RecognitionException {
		SingleCommandContext _localctx = new SingleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleCommand);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(ID);
				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(29);
					match(ASSIGN);
					setState(30);
					expression();
					}
					break;
				case PIZQ:
					{
					setState(31);
					match(PIZQ);
					setState(32);
					expression();
					setState(33);
					match(PDER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(IF);
				setState(38);
				expression();
				setState(39);
				match(THEN);
				setState(40);
				singleCommand();
				setState(41);
				match(ELSE);
				setState(42);
				singleCommand();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(WHILE);
				setState(45);
				expression();
				setState(46);
				match(DO);
				setState(47);
				singleCommand();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				match(LET);
				setState(50);
				declaration();
				setState(51);
				match(IN);
				setState(52);
				singleCommand();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				match(BEGIN);
				setState(55);
				command();
				setState(56);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public List<SingleDeclarationContext> singleDeclaration() {
			return getRuleContexts(SingleDeclarationContext.class);
		}
		public SingleDeclarationContext singleDeclaration(int i) {
			return getRuleContext(SingleDeclarationContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(ElParser.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(ElParser.PyCOMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			singleDeclaration();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(61);
				match(PyCOMA);
				setState(62);
				singleDeclaration();
				}
				}
				setState(67);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SingleDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ElParser.CONST, 0); }
		public TerminalNode ID() { return getToken(ElParser.ID, 0); }
		public TerminalNode VIR() { return getToken(ElParser.VIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ElParser.VAR, 0); }
		public TerminalNode DOSPUN() { return getToken(ElParser.DOSPUN, 0); }
		public TypeDenoterContext typeDenoter() {
			return getRuleContext(TypeDenoterContext.class,0);
		}
		public SingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeclaration; }
	}

	public final SingleDeclarationContext singleDeclaration() throws RecognitionException {
		SingleDeclarationContext _localctx = new SingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDeclaration);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(CONST);
				setState(69);
				match(ID);
				setState(70);
				match(VIR);
				setState(71);
				expression();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(VAR);
				setState(73);
				match(ID);
				setState(74);
				match(DOSPUN);
				setState(75);
				typeDenoter();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDenoterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ElParser.ID, 0); }
		public TypeDenoterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDenoter; }
	}

	public final TypeDenoterContext typeDenoter() throws RecognitionException {
		TypeDenoterContext _localctx = new TypeDenoterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeDenoter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			primaryExpression();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) {
				{
				{
				setState(81);
				operator();
				setState(82);
				primaryExpression();
				}
				}
				setState(88);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ElParser.NUM, 0); }
		public TerminalNode ID() { return getToken(ElParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(ElParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(ElParser.PDER, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primaryExpression);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(ID);
				}
				break;
			case PIZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(PIZQ);
				setState(92);
				expression();
				setState(93);
				match(PDER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(ElParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(ElParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(ElParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ElParser.DIV, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
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
		"\u0004\u0001\u001ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002$\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002;\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003@\b\u0003\n\u0003"+
		"\f\u0003C\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004M\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006U\b\u0006\n\u0006\f\u0006X\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007`\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0000\u0001\u0001\u0000\u0007\ne\u0000\u0012\u0001\u0000\u0000\u0000"+
		"\u0002\u0014\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000\u0000\u0006"+
		"<\u0001\u0000\u0000\u0000\bL\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000"+
		"\u0000\fP\u0001\u0000\u0000\u0000\u000e_\u0001\u0000\u0000\u0000\u0010"+
		"a\u0001\u0000\u0000\u0000\u0012\u0013\u0003\u0004\u0002\u0000\u0013\u0001"+
		"\u0001\u0000\u0000\u0000\u0014\u0019\u0003\u0004\u0002\u0000\u0015\u0016"+
		"\u0005\u0001\u0000\u0000\u0016\u0018\u0003\u0004\u0002\u0000\u0017\u0015"+
		"\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0003"+
		"\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c#\u0005"+
		"\u0017\u0000\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e$\u0003\f"+
		"\u0006\u0000\u001f \u0005\u0003\u0000\u0000 !\u0003\f\u0006\u0000!\"\u0005"+
		"\u0004\u0000\u0000\"$\u0001\u0000\u0000\u0000#\u001d\u0001\u0000\u0000"+
		"\u0000#\u001f\u0001\u0000\u0000\u0000$;\u0001\u0000\u0000\u0000%&\u0005"+
		"\f\u0000\u0000&\'\u0003\f\u0006\u0000\'(\u0005\u000f\u0000\u0000()\u0003"+
		"\u0004\u0002\u0000)*\u0005\u0010\u0000\u0000*+\u0003\u0004\u0002\u0000"+
		"+;\u0001\u0000\u0000\u0000,-\u0005\r\u0000\u0000-.\u0003\f\u0006\u0000"+
		"./\u0005\u0012\u0000\u0000/0\u0003\u0004\u0002\u00000;\u0001\u0000\u0000"+
		"\u000012\u0005\u000e\u0000\u000023\u0003\u0006\u0003\u000034\u0005\u0011"+
		"\u0000\u000045\u0003\u0004\u0002\u00005;\u0001\u0000\u0000\u000067\u0005"+
		"\u0013\u0000\u000078\u0003\u0002\u0001\u000089\u0005\u0014\u0000\u0000"+
		"9;\u0001\u0000\u0000\u0000:\u001c\u0001\u0000\u0000\u0000:%\u0001\u0000"+
		"\u0000\u0000:,\u0001\u0000\u0000\u0000:1\u0001\u0000\u0000\u0000:6\u0001"+
		"\u0000\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<A\u0003\b\u0004\u0000"+
		"=>\u0005\u0001\u0000\u0000>@\u0003\b\u0004\u0000?=\u0001\u0000\u0000\u0000"+
		"@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000B\u0007\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005"+
		"\u0015\u0000\u0000EF\u0005\u0017\u0000\u0000FG\u0005\u0005\u0000\u0000"+
		"GM\u0003\f\u0006\u0000HI\u0005\u0016\u0000\u0000IJ\u0005\u0017\u0000\u0000"+
		"JK\u0005\u0006\u0000\u0000KM\u0003\n\u0005\u0000LD\u0001\u0000\u0000\u0000"+
		"LH\u0001\u0000\u0000\u0000M\t\u0001\u0000\u0000\u0000NO\u0005\u0017\u0000"+
		"\u0000O\u000b\u0001\u0000\u0000\u0000PV\u0003\u000e\u0007\u0000QR\u0003"+
		"\u0010\b\u0000RS\u0003\u000e\u0007\u0000SU\u0001\u0000\u0000\u0000TQ\u0001"+
		"\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000W\r\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000Y`\u0005\u0018\u0000\u0000Z`\u0005\u0017\u0000\u0000[\\\u0005\u0003"+
		"\u0000\u0000\\]\u0003\f\u0006\u0000]^\u0005\u0004\u0000\u0000^`\u0001"+
		"\u0000\u0000\u0000_Y\u0001\u0000\u0000\u0000_Z\u0001\u0000\u0000\u0000"+
		"_[\u0001\u0000\u0000\u0000`\u000f\u0001\u0000\u0000\u0000ab\u0007\u0000"+
		"\u0000\u0000b\u0011\u0001\u0000\u0000\u0000\u0007\u0019#:ALV_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}