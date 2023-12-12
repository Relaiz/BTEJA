// Generated from D:/Program Files/projects/BTEJA/semPraceBteja/gramm.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class grammParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ID=2, INTEGER=3, REAL=4, BOOLEAN=5, IF=6, THEN=7, ELSE=8, WHILE=9, 
		DO=10, BEGIN=11, END=12, RETURN=13, MODULE=14, DOT=15, COMMA=16, COLON=17, 
		SEMI=18, ASSIGN=19, LPAREN=20, RPAREN=21, ADDOP=22, MULOP=23, RELOP=24, 
		WS=25;
	public static final int
		RULE_module = 0, RULE_declaration = 1, RULE_variable_declaration = 2, 
		RULE_type = 3, RULE_statement = 4, RULE_expression = 5, RULE_simple_expression = 6, 
		RULE_term = 7, RULE_factor = 8, RULE_identifier = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "declaration", "variable_declaration", "type", "statement", 
			"expression", "simple_expression", "term", "factor", "identifier"
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

	@Override
	public String getGrammarFileName() { return "gramm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(grammParser.MODULE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(grammParser.SEMI, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(grammParser.BEGIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode END() { return getToken(grammParser.END, 0); }
		public TerminalNode DOT() { return getToken(grammParser.DOT, 0); }
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammVisitor ) return ((grammVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(MODULE);
			setState(21);
			identifier();
			setState(22);
			match(SEMI);
			setState(23);
			declaration();
			setState(24);
			match(BEGIN);
			setState(25);
			statement();
			setState(26);
			match(END);
			setState(27);
			identifier();
			setState(28);
			match(DOT);
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
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammVisitor ) return ((grammVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(30);
				variable_declaration();
				}
				}
				setState(35);
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
	public static class Variable_declarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(grammParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(grammParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(grammParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(grammParser.COMMA, i);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammVisitor ) return ((grammVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			identifier();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(38);
				match(COMMA);
				setState(39);
				identifier();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(COLON);
			setState(46);
			type();
			setState(47);
			match(SEMI);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(grammParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(grammParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(grammParser.BOOLEAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammVisitor ) return ((grammVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(grammParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(grammParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(grammParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(grammParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(grammParser.DO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(grammParser.ASSIGN, 0); }
		public TerminalNode BEGIN() { return getToken(grammParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(grammParser.END, 0); }
		public TerminalNode LPAREN() { return getToken(grammParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(grammParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(grammParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(grammParser.COMMA, i);
		}
		public TerminalNode RETURN() { return getToken(grammParser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammVisitor ) return ((grammVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(IF);
				setState(52);
				expression();
				setState(53);
				match(THEN);
				setState(54);
				statement();
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(55);
					match(ELSE);
					setState(56);
					statement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(WHILE);
				setState(60);
				expression();
				setState(61);
				match(DO);
				setState(62);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				identifier();
				setState(65);
				match(ASSIGN);
				setState(66);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(BEGIN);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10820L) != 0)) {
					{
					{
					setState(69);
					statement();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				identifier();
				setState(77);
				match(LPAREN);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1048588L) != 0)) {
					{
					setState(78);
					expression();
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(79);
						match(COMMA);
						setState(80);
						expression();
						}
						}
						setState(85);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(88);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				match(RETURN);
				setState(91);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(grammParser.RELOP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammVisitor ) return ((grammVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			simple_expression();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RELOP) {
				{
				setState(95);
				match(RELOP);
				setState(96);
				simple_expression();
				}
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
	public static class Simple_expressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADDOP() { return getTokens(grammParser.ADDOP); }
		public TerminalNode ADDOP(int i) {
			return getToken(grammParser.ADDOP, i);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammVisitor ) return ((grammVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simple_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			term();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDOP) {
				{
				{
				setState(100);
				match(ADDOP);
				setState(101);
				term();
				}
				}
				setState(106);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULOP() { return getTokens(grammParser.MULOP); }
		public TerminalNode MULOP(int i) {
			return getToken(grammParser.MULOP, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammVisitor ) return ((grammVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			factor();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULOP) {
				{
				{
				setState(108);
				match(MULOP);
				setState(109);
				factor();
				}
				}
				setState(114);
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
	public static class FactorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(grammParser.INTEGER, 0); }
		public TerminalNode LPAREN() { return getToken(grammParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(grammParser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammVisitor ) return ((grammVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_factor);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				identifier();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(INTEGER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(LPAREN);
				setState(118);
				expression();
				setState(119);
				match(RPAREN);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammVisitor ) return ((grammVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019~\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002\n\u0002\f\u0002"+
		",\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004:\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004G\b\u0004\n\u0004\f\u0004J\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004R\b\u0004\n\u0004\f\u0004U\t\u0004\u0003\u0004W\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006g\b\u0006\n\u0006\f\u0006j\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007o\b\u0007\n\u0007\f\u0007r\t"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bz\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0000\u0001\u0001\u0000\u0003\u0005\u0083\u0000\u0014\u0001\u0000"+
		"\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000"+
		"\u00061\u0001\u0000\u0000\u0000\b\\\u0001\u0000\u0000\u0000\n^\u0001\u0000"+
		"\u0000\u0000\fc\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000\u0000"+
		"\u0010y\u0001\u0000\u0000\u0000\u0012{\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0005\u000e\u0000\u0000\u0015\u0016\u0003\u0012\t\u0000\u0016\u0017\u0005"+
		"\u0012\u0000\u0000\u0017\u0018\u0003\u0002\u0001\u0000\u0018\u0019\u0005"+
		"\u000b\u0000\u0000\u0019\u001a\u0003\b\u0004\u0000\u001a\u001b\u0005\f"+
		"\u0000\u0000\u001b\u001c\u0003\u0012\t\u0000\u001c\u001d\u0005\u000f\u0000"+
		"\u0000\u001d\u0001\u0001\u0000\u0000\u0000\u001e \u0003\u0004\u0002\u0000"+
		"\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f"+
		"\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0003\u0001\u0000"+
		"\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%*\u0003"+
		"\u0012\t\u0000&\'\u0005\u0010\u0000\u0000\')\u0003\u0012\t\u0000(&\u0001"+
		"\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000-.\u0005\u0011\u0000\u0000./\u0003\u0006\u0003\u0000/0\u0005\u0012"+
		"\u0000\u00000\u0005\u0001\u0000\u0000\u000012\u0007\u0000\u0000\u0000"+
		"2\u0007\u0001\u0000\u0000\u000034\u0005\u0006\u0000\u000045\u0003\n\u0005"+
		"\u000056\u0005\u0007\u0000\u000069\u0003\b\u0004\u000078\u0005\b\u0000"+
		"\u00008:\u0003\b\u0004\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:]\u0001\u0000\u0000\u0000;<\u0005\t\u0000\u0000<=\u0003\n\u0005"+
		"\u0000=>\u0005\n\u0000\u0000>?\u0003\b\u0004\u0000?]\u0001\u0000\u0000"+
		"\u0000@A\u0003\u0012\t\u0000AB\u0005\u0013\u0000\u0000BC\u0003\n\u0005"+
		"\u0000C]\u0001\u0000\u0000\u0000DH\u0005\u000b\u0000\u0000EG\u0003\b\u0004"+
		"\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000K]\u0005\f\u0000\u0000LM\u0003\u0012\t\u0000MV\u0005"+
		"\u0014\u0000\u0000NS\u0003\n\u0005\u0000OP\u0005\u0010\u0000\u0000PR\u0003"+
		"\n\u0005\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VN\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000XY\u0005\u0015\u0000\u0000Y]\u0001\u0000"+
		"\u0000\u0000Z[\u0005\r\u0000\u0000[]\u0003\n\u0005\u0000\\3\u0001\u0000"+
		"\u0000\u0000\\;\u0001\u0000\u0000\u0000\\@\u0001\u0000\u0000\u0000\\D"+
		"\u0001\u0000\u0000\u0000\\L\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000]\t\u0001\u0000\u0000\u0000^a\u0003\f\u0006\u0000_`\u0005\u0018"+
		"\u0000\u0000`b\u0003\f\u0006\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b\u000b\u0001\u0000\u0000\u0000ch\u0003\u000e\u0007\u0000"+
		"de\u0005\u0016\u0000\u0000eg\u0003\u000e\u0007\u0000fd\u0001\u0000\u0000"+
		"\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000i\r\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kp\u0003"+
		"\u0010\b\u0000lm\u0005\u0017\u0000\u0000mo\u0003\u0010\b\u0000nl\u0001"+
		"\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000q\u000f\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000sz\u0003\u0012\t\u0000tz\u0005\u0003\u0000\u0000uv\u0005\u0014"+
		"\u0000\u0000vw\u0003\n\u0005\u0000wx\u0005\u0015\u0000\u0000xz\u0001\u0000"+
		"\u0000\u0000ys\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000yu\u0001"+
		"\u0000\u0000\u0000z\u0011\u0001\u0000\u0000\u0000{|\u0005\u0002\u0000"+
		"\u0000|\u0013\u0001\u0000\u0000\u0000\u000b!*9HSV\\ahpy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}