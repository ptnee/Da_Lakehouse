// Generated from org/apache/hudi/spark/sql/parser/HoodieSqlCommon.g4 by ANTLR 4.7
package org.apache.hudi.spark.sql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HoodieSqlCommonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LEFT_PAREN=3, RIGHT_PAREN=4, COMMA=5, DOT=6, ALL=7, AT=8, 
		CALL=9, COMPACTION=10, RUN=11, SCHEDULE=12, ON=13, SHOW=14, LIMIT=15, 
		MAP=16, NULL=17, TRUE=18, FALSE=19, INTERVAL=20, TO=21, CREATE=22, INDEX=23, 
		INDEXES=24, IF=25, NOT=26, EXISTS=27, TABLE=28, USING=29, OPTIONS=30, 
		DROP=31, FROM=32, IN=33, REFRESH=34, EQ=35, PLUS=36, MINUS=37, STRING=38, 
		BIGINT_LITERAL=39, SMALLINT_LITERAL=40, TINYINT_LITERAL=41, INTEGER_VALUE=42, 
		EXPONENT_VALUE=43, DECIMAL_VALUE=44, FLOAT_LITERAL=45, DOUBLE_LITERAL=46, 
		BIGDECIMAL_LITERAL=47, IDENTIFIER=48, BACKQUOTED_IDENTIFIER=49, SIMPLE_COMMENT=50, 
		BRACKETED_COMMENT=51, WS=52, UNRECOGNIZED=53;
	public static final int
		RULE_singleStatement = 0, RULE_statement = 1, RULE_compactionStatement = 2, 
		RULE_tableIdentifier = 3, RULE_callArgumentList = 4, RULE_callArgument = 5, 
		RULE_expression = 6, RULE_constant = 7, RULE_stringMap = 8, RULE_booleanValue = 9, 
		RULE_number = 10, RULE_multipartIdentifierPropertyList = 11, RULE_multipartIdentifierProperty = 12, 
		RULE_multipartIdentifier = 13, RULE_identifier = 14, RULE_quotedIdentifier = 15, 
		RULE_nonReserved = 16, RULE_propertyList = 17, RULE_property = 18, RULE_propertyKey = 19, 
		RULE_propertyValue = 20;
	public static final String[] ruleNames = {
		"singleStatement", "statement", "compactionStatement", "tableIdentifier", 
		"callArgumentList", "callArgument", "expression", "constant", "stringMap", 
		"booleanValue", "number", "multipartIdentifierPropertyList", "multipartIdentifierProperty", 
		"multipartIdentifier", "identifier", "quotedIdentifier", "nonReserved", 
		"propertyList", "property", "propertyKey", "propertyValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'=>'", "'('", "')'", "','", "'.'", "'ALL'", "'AT'", "'CALL'", 
		"'COMPACTION'", "'RUN'", "'SCHEDULE'", "'ON'", "'SHOW'", "'LIMIT'", "'MAP'", 
		"'NULL'", "'TRUE'", "'FALSE'", "'INTERVAL'", "'TO'", "'CREATE'", "'INDEX'", 
		"'INDEXES'", "'IF'", "'NOT'", "'EXISTS'", "'TABLE'", "'USING'", "'OPTIONS'", 
		"'DROP'", "'FROM'", "'IN'", "'REFRESH'", null, "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "LEFT_PAREN", "RIGHT_PAREN", "COMMA", "DOT", "ALL", 
		"AT", "CALL", "COMPACTION", "RUN", "SCHEDULE", "ON", "SHOW", "LIMIT", 
		"MAP", "NULL", "TRUE", "FALSE", "INTERVAL", "TO", "CREATE", "INDEX", "INDEXES", 
		"IF", "NOT", "EXISTS", "TABLE", "USING", "OPTIONS", "DROP", "FROM", "IN", 
		"REFRESH", "EQ", "PLUS", "MINUS", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
		"TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", "DECIMAL_VALUE", 
		"FLOAT_LITERAL", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
		"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
		"UNRECOGNIZED"
	};
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
	public String getGrammarFileName() { return "HoodieSqlCommon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HoodieSqlCommonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HoodieSqlCommonParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			statement();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(43);
				match(T__0);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends StatementContext {
		public TerminalNode CALL() { return getToken(HoodieSqlCommonParser.CALL, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshIndexContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(HoodieSqlCommonParser.REFRESH, 0); }
		public TerminalNode INDEX() { return getToken(HoodieSqlCommonParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(HoodieSqlCommonParser.TABLE, 0); }
		public RefreshIndexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterRefreshIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitRefreshIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitRefreshIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PassThroughContext extends StatementContext {
		public PassThroughContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterPassThrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitPassThrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitPassThrough(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowIndexesContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(HoodieSqlCommonParser.SHOW, 0); }
		public TerminalNode INDEXES() { return getToken(HoodieSqlCommonParser.INDEXES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(HoodieSqlCommonParser.FROM, 0); }
		public TerminalNode IN() { return getToken(HoodieSqlCommonParser.IN, 0); }
		public TerminalNode TABLE() { return getToken(HoodieSqlCommonParser.TABLE, 0); }
		public ShowIndexesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterShowIndexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitShowIndexes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitShowIndexes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateIndexContext extends StatementContext {
		public IdentifierContext indexType;
		public MultipartIdentifierPropertyListContext columns;
		public PropertyListContext indexOptions;
		public TerminalNode CREATE() { return getToken(HoodieSqlCommonParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(HoodieSqlCommonParser.INDEX, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(HoodieSqlCommonParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(HoodieSqlCommonParser.RIGHT_PAREN, 0); }
		public MultipartIdentifierPropertyListContext multipartIdentifierPropertyList() {
			return getRuleContext(MultipartIdentifierPropertyListContext.class,0);
		}
		public TerminalNode IF() { return getToken(HoodieSqlCommonParser.IF, 0); }
		public TerminalNode NOT() { return getToken(HoodieSqlCommonParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(HoodieSqlCommonParser.EXISTS, 0); }
		public TerminalNode TABLE() { return getToken(HoodieSqlCommonParser.TABLE, 0); }
		public TerminalNode USING() { return getToken(HoodieSqlCommonParser.USING, 0); }
		public TerminalNode OPTIONS() { return getToken(HoodieSqlCommonParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public CreateIndexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterCreateIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitCreateIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompactionCommandContext extends StatementContext {
		public CompactionStatementContext compactionStatement() {
			return getRuleContext(CompactionStatementContext.class,0);
		}
		public CompactionCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterCompactionCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitCompactionCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitCompactionCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropIndexContext extends StatementContext {
		public TerminalNode DROP() { return getToken(HoodieSqlCommonParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(HoodieSqlCommonParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(HoodieSqlCommonParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(HoodieSqlCommonParser.EXISTS, 0); }
		public TerminalNode TABLE() { return getToken(HoodieSqlCommonParser.TABLE, 0); }
		public DropIndexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterDropIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitDropIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new CompactionCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				compactionStatement();
				}
				break;
			case 2:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(CALL);
				setState(53);
				multipartIdentifier();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(54);
					callArgumentList();
					}
				}

				}
				break;
			case 3:
				_localctx = new CreateIndexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(CREATE);
				setState(58);
				match(INDEX);
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(59);
					match(IF);
					setState(60);
					match(NOT);
					setState(61);
					match(EXISTS);
					}
					break;
				}
				setState(64);
				identifier();
				setState(65);
				match(ON);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(66);
					match(TABLE);
					}
				}

				setState(69);
				tableIdentifier();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(70);
					match(USING);
					setState(71);
					((CreateIndexContext)_localctx).indexType = identifier();
					}
				}

				setState(74);
				match(LEFT_PAREN);
				setState(75);
				((CreateIndexContext)_localctx).columns = multipartIdentifierPropertyList();
				setState(76);
				match(RIGHT_PAREN);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(77);
					match(OPTIONS);
					setState(78);
					((CreateIndexContext)_localctx).indexOptions = propertyList();
					}
				}

				}
				break;
			case 4:
				_localctx = new DropIndexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match(DROP);
				setState(82);
				match(INDEX);
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(83);
					match(IF);
					setState(84);
					match(EXISTS);
					}
					break;
				}
				setState(87);
				identifier();
				setState(88);
				match(ON);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(89);
					match(TABLE);
					}
				}

				setState(92);
				tableIdentifier();
				}
				break;
			case 5:
				_localctx = new ShowIndexesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(SHOW);
				setState(95);
				match(INDEXES);
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(97);
					match(TABLE);
					}
				}

				setState(100);
				tableIdentifier();
				}
				break;
			case 6:
				_localctx = new RefreshIndexContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				match(REFRESH);
				setState(102);
				match(INDEX);
				setState(103);
				identifier();
				setState(104);
				match(ON);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(105);
					match(TABLE);
					}
				}

				setState(108);
				tableIdentifier();
				}
				break;
			case 7:
				_localctx = new PassThroughContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(110);
						matchWildcard();
						}
						} 
					}
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
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

	public static class CompactionStatementContext extends ParserRuleContext {
		public CompactionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compactionStatement; }
	 
		public CompactionStatementContext() { }
		public void copyFrom(CompactionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompactionOnPathContext extends CompactionStatementContext {
		public Token operation;
		public Token path;
		public Token instantTimestamp;
		public TerminalNode COMPACTION() { return getToken(HoodieSqlCommonParser.COMPACTION, 0); }
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TerminalNode STRING() { return getToken(HoodieSqlCommonParser.STRING, 0); }
		public TerminalNode RUN() { return getToken(HoodieSqlCommonParser.RUN, 0); }
		public TerminalNode SCHEDULE() { return getToken(HoodieSqlCommonParser.SCHEDULE, 0); }
		public TerminalNode AT() { return getToken(HoodieSqlCommonParser.AT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlCommonParser.INTEGER_VALUE, 0); }
		public CompactionOnPathContext(CompactionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterCompactionOnPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitCompactionOnPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitCompactionOnPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompactionOnTableContext extends CompactionStatementContext {
		public Token operation;
		public Token instantTimestamp;
		public TerminalNode COMPACTION() { return getToken(HoodieSqlCommonParser.COMPACTION, 0); }
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RUN() { return getToken(HoodieSqlCommonParser.RUN, 0); }
		public TerminalNode SCHEDULE() { return getToken(HoodieSqlCommonParser.SCHEDULE, 0); }
		public TerminalNode AT() { return getToken(HoodieSqlCommonParser.AT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlCommonParser.INTEGER_VALUE, 0); }
		public CompactionOnTableContext(CompactionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterCompactionOnTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitCompactionOnTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitCompactionOnTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCompactionOnPathContext extends CompactionStatementContext {
		public Token path;
		public Token limit;
		public TerminalNode SHOW() { return getToken(HoodieSqlCommonParser.SHOW, 0); }
		public TerminalNode COMPACTION() { return getToken(HoodieSqlCommonParser.COMPACTION, 0); }
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TerminalNode STRING() { return getToken(HoodieSqlCommonParser.STRING, 0); }
		public TerminalNode LIMIT() { return getToken(HoodieSqlCommonParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlCommonParser.INTEGER_VALUE, 0); }
		public ShowCompactionOnPathContext(CompactionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterShowCompactionOnPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitShowCompactionOnPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitShowCompactionOnPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCompactionOnTableContext extends CompactionStatementContext {
		public Token limit;
		public TerminalNode SHOW() { return getToken(HoodieSqlCommonParser.SHOW, 0); }
		public TerminalNode COMPACTION() { return getToken(HoodieSqlCommonParser.COMPACTION, 0); }
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(HoodieSqlCommonParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlCommonParser.INTEGER_VALUE, 0); }
		public ShowCompactionOnTableContext(CompactionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterShowCompactionOnTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitShowCompactionOnTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitShowCompactionOnTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompactionStatementContext compactionStatement() throws RecognitionException {
		CompactionStatementContext _localctx = new CompactionStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compactionStatement);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new CompactionOnTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((CompactionOnTableContext)_localctx).operation = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RUN || _la==SCHEDULE) ) {
					((CompactionOnTableContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(119);
				match(COMPACTION);
				setState(120);
				match(ON);
				setState(121);
				tableIdentifier();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(122);
					match(AT);
					setState(123);
					((CompactionOnTableContext)_localctx).instantTimestamp = match(INTEGER_VALUE);
					}
				}

				}
				break;
			case 2:
				_localctx = new CompactionOnPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				((CompactionOnPathContext)_localctx).operation = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RUN || _la==SCHEDULE) ) {
					((CompactionOnPathContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				match(COMPACTION);
				setState(128);
				match(ON);
				setState(129);
				((CompactionOnPathContext)_localctx).path = match(STRING);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(130);
					match(AT);
					setState(131);
					((CompactionOnPathContext)_localctx).instantTimestamp = match(INTEGER_VALUE);
					}
				}

				}
				break;
			case 3:
				_localctx = new ShowCompactionOnTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(SHOW);
				setState(135);
				match(COMPACTION);
				setState(136);
				match(ON);
				setState(137);
				tableIdentifier();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(138);
					match(LIMIT);
					setState(139);
					((ShowCompactionOnTableContext)_localctx).limit = match(INTEGER_VALUE);
					}
				}

				}
				break;
			case 4:
				_localctx = new ShowCompactionOnPathContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(SHOW);
				setState(143);
				match(COMPACTION);
				setState(144);
				match(ON);
				setState(145);
				((ShowCompactionOnPathContext)_localctx).path = match(STRING);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(146);
					match(LIMIT);
					setState(147);
					((ShowCompactionOnPathContext)_localctx).limit = match(INTEGER_VALUE);
					}
				}

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

	public static class TableIdentifierContext extends ParserRuleContext {
		public Token db;
		public Token table;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HoodieSqlCommonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HoodieSqlCommonParser.IDENTIFIER, i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(152);
				((TableIdentifierContext)_localctx).db = match(IDENTIFIER);
				setState(153);
				match(DOT);
				}
				break;
			}
			setState(156);
			((TableIdentifierContext)_localctx).table = match(IDENTIFIER);
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

	public static class CallArgumentListContext extends ParserRuleContext {
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterCallArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitCallArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitCallArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentListContext callArgumentList() throws RecognitionException {
		CallArgumentListContext _localctx = new CallArgumentListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_callArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(LEFT_PAREN);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << COMPACTION) | (1L << RUN) | (1L << SCHEDULE) | (1L << ON) | (1L << SHOW) | (1L << LIMIT) | (1L << MAP) | (1L << TRUE) | (1L << FALSE) | (1L << CREATE) | (1L << INDEX) | (1L << INDEXES) | (1L << IF) | (1L << NOT) | (1L << EXISTS) | (1L << TABLE) | (1L << USING) | (1L << OPTIONS) | (1L << DROP) | (1L << FROM) | (1L << IN) | (1L << REFRESH) | (1L << MINUS) | (1L << STRING) | (1L << BIGINT_LITERAL) | (1L << SMALLINT_LITERAL) | (1L << TINYINT_LITERAL) | (1L << INTEGER_VALUE) | (1L << EXPONENT_VALUE) | (1L << DECIMAL_VALUE) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BIGDECIMAL_LITERAL) | (1L << IDENTIFIER) | (1L << BACKQUOTED_IDENTIFIER))) != 0)) {
				{
				setState(159);
				callArgument();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(160);
					match(COMMA);
					setState(161);
					callArgument();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(169);
			match(RIGHT_PAREN);
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

	public static class CallArgumentContext extends ParserRuleContext {
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
	 
		public CallArgumentContext() { }
		public void copyFrom(CallArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionalArgumentContext extends CallArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionalArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentContext extends CallArgumentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_callArgument);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				identifier();
				setState(173);
				match(T__1);
				setState(174);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringMapContext stringMap() {
			return getRuleContext(StringMapContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case COMPACTION:
			case RUN:
			case SCHEDULE:
			case ON:
			case SHOW:
			case LIMIT:
			case TRUE:
			case FALSE:
			case CREATE:
			case INDEX:
			case INDEXES:
			case IF:
			case NOT:
			case EXISTS:
			case TABLE:
			case USING:
			case OPTIONS:
			case DROP:
			case FROM:
			case IN:
			case REFRESH:
			case MINUS:
			case STRING:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case EXPONENT_VALUE:
			case DECIMAL_VALUE:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case BIGDECIMAL_LITERAL:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				constant();
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				stringMap();
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(HoodieSqlCommonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HoodieSqlCommonParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(HoodieSqlCommonParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case EXPONENT_VALUE:
			case DECIMAL_VALUE:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case BIGDECIMAL_LITERAL:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				booleanValue();
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184);
					match(STRING);
					}
					}
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
			case CALL:
			case COMPACTION:
			case RUN:
			case SCHEDULE:
			case ON:
			case SHOW:
			case LIMIT:
			case CREATE:
			case INDEX:
			case INDEXES:
			case IF:
			case NOT:
			case EXISTS:
			case TABLE:
			case USING:
			case OPTIONS:
			case DROP:
			case FROM:
			case IN:
			case REFRESH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				identifier();
				setState(190);
				match(STRING);
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

	public static class StringMapContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(HoodieSqlCommonParser.MAP, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public StringMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterStringMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitStringMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitStringMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringMapContext stringMap() throws RecognitionException {
		StringMapContext _localctx = new StringMapContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(MAP);
			setState(195);
			match(LEFT_PAREN);
			setState(196);
			constant();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(197);
				match(COMMA);
				setState(198);
				constant();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(RIGHT_PAREN);
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(HoodieSqlCommonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HoodieSqlCommonParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(HoodieSqlCommonParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(HoodieSqlCommonParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(HoodieSqlCommonParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(HoodieSqlCommonParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(HoodieSqlCommonParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitExponentLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(HoodieSqlCommonParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlCommonParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(HoodieSqlCommonParser.FLOAT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(HoodieSqlCommonParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(HoodieSqlCommonParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(208);
					match(MINUS);
					}
				}

				setState(211);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(212);
					match(MINUS);
					}
				}

				setState(215);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(216);
					match(MINUS);
					}
				}

				setState(219);
				match(INTEGER_VALUE);
				}
				break;
			case 4:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(220);
					match(MINUS);
					}
				}

				setState(223);
				match(BIGINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(224);
					match(MINUS);
					}
				}

				setState(227);
				match(SMALLINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(228);
					match(MINUS);
					}
				}

				setState(231);
				match(TINYINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(232);
					match(MINUS);
					}
				}

				setState(235);
				match(DOUBLE_LITERAL);
				}
				break;
			case 8:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(236);
					match(MINUS);
					}
				}

				setState(239);
				match(FLOAT_LITERAL);
				}
				break;
			case 9:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(240);
					match(MINUS);
					}
				}

				setState(243);
				match(BIGDECIMAL_LITERAL);
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

	public static class MultipartIdentifierPropertyListContext extends ParserRuleContext {
		public List<MultipartIdentifierPropertyContext> multipartIdentifierProperty() {
			return getRuleContexts(MultipartIdentifierPropertyContext.class);
		}
		public MultipartIdentifierPropertyContext multipartIdentifierProperty(int i) {
			return getRuleContext(MultipartIdentifierPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HoodieSqlCommonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HoodieSqlCommonParser.COMMA, i);
		}
		public MultipartIdentifierPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierPropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterMultipartIdentifierPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitMultipartIdentifierPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitMultipartIdentifierPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierPropertyListContext multipartIdentifierPropertyList() throws RecognitionException {
		MultipartIdentifierPropertyListContext _localctx = new MultipartIdentifierPropertyListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multipartIdentifierPropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			multipartIdentifierProperty();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247);
				match(COMMA);
				setState(248);
				multipartIdentifierProperty();
				}
				}
				setState(253);
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

	public static class MultipartIdentifierPropertyContext extends ParserRuleContext {
		public PropertyListContext options;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(HoodieSqlCommonParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public MultipartIdentifierPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterMultipartIdentifierProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitMultipartIdentifierProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitMultipartIdentifierProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierPropertyContext multipartIdentifierProperty() throws RecognitionException {
		MultipartIdentifierPropertyContext _localctx = new MultipartIdentifierPropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multipartIdentifierProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			multipartIdentifier();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(255);
				match(OPTIONS);
				setState(256);
				((MultipartIdentifierPropertyContext)_localctx).options = propertyList();
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

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> parts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multipartIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			((MultipartIdentifierContext)_localctx).identifier = identifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).identifier);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(260);
				match(DOT);
				setState(261);
				((MultipartIdentifierContext)_localctx).identifier = identifier();
				((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).identifier);
				}
				}
				setState(266);
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends IdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(HoodieSqlCommonParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifier);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				quotedIdentifier();
				}
				break;
			case CALL:
			case COMPACTION:
			case RUN:
			case SCHEDULE:
			case ON:
			case SHOW:
			case LIMIT:
			case CREATE:
			case INDEX:
			case INDEXES:
			case IF:
			case NOT:
			case EXISTS:
			case TABLE:
			case USING:
			case OPTIONS:
			case DROP:
			case FROM:
			case IN:
			case REFRESH:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				nonReserved();
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(HoodieSqlCommonParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(BACKQUOTED_IDENTIFIER);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(HoodieSqlCommonParser.CALL, 0); }
		public TerminalNode COMPACTION() { return getToken(HoodieSqlCommonParser.COMPACTION, 0); }
		public TerminalNode CREATE() { return getToken(HoodieSqlCommonParser.CREATE, 0); }
		public TerminalNode DROP() { return getToken(HoodieSqlCommonParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(HoodieSqlCommonParser.EXISTS, 0); }
		public TerminalNode FROM() { return getToken(HoodieSqlCommonParser.FROM, 0); }
		public TerminalNode IN() { return getToken(HoodieSqlCommonParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(HoodieSqlCommonParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(HoodieSqlCommonParser.INDEXES, 0); }
		public TerminalNode IF() { return getToken(HoodieSqlCommonParser.IF, 0); }
		public TerminalNode LIMIT() { return getToken(HoodieSqlCommonParser.LIMIT, 0); }
		public TerminalNode NOT() { return getToken(HoodieSqlCommonParser.NOT, 0); }
		public TerminalNode ON() { return getToken(HoodieSqlCommonParser.ON, 0); }
		public TerminalNode OPTIONS() { return getToken(HoodieSqlCommonParser.OPTIONS, 0); }
		public TerminalNode REFRESH() { return getToken(HoodieSqlCommonParser.REFRESH, 0); }
		public TerminalNode RUN() { return getToken(HoodieSqlCommonParser.RUN, 0); }
		public TerminalNode SCHEDULE() { return getToken(HoodieSqlCommonParser.SCHEDULE, 0); }
		public TerminalNode SHOW() { return getToken(HoodieSqlCommonParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(HoodieSqlCommonParser.TABLE, 0); }
		public TerminalNode USING() { return getToken(HoodieSqlCommonParser.USING, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << COMPACTION) | (1L << RUN) | (1L << SCHEDULE) | (1L << ON) | (1L << SHOW) | (1L << LIMIT) | (1L << CREATE) | (1L << INDEX) | (1L << INDEXES) | (1L << IF) | (1L << NOT) | (1L << EXISTS) | (1L << TABLE) | (1L << USING) | (1L << OPTIONS) | (1L << DROP) | (1L << FROM) | (1L << IN) | (1L << REFRESH))) != 0)) ) {
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

	public static class PropertyListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(HoodieSqlCommonParser.LEFT_PAREN, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HoodieSqlCommonParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HoodieSqlCommonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HoodieSqlCommonParser.COMMA, i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(LEFT_PAREN);
			setState(277);
			property();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				property();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(RIGHT_PAREN);
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

	public static class PropertyContext extends ParserRuleContext {
		public PropertyKeyContext key;
		public PropertyValueContext value;
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(HoodieSqlCommonParser.EQ, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			((PropertyContext)_localctx).key = propertyKey();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << EQ) | (1L << STRING) | (1L << INTEGER_VALUE) | (1L << DECIMAL_VALUE))) != 0)) {
				{
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(288);
					match(EQ);
					}
				}

				setState(291);
				((PropertyContext)_localctx).value = propertyValue();
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

	public static class PropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(HoodieSqlCommonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HoodieSqlCommonParser.DOT, i);
		}
		public TerminalNode STRING() { return getToken(HoodieSqlCommonParser.STRING, 0); }
		public PropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterPropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitPropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitPropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyKeyContext propertyKey() throws RecognitionException {
		PropertyKeyContext _localctx = new PropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_propertyKey);
		int _la;
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case COMPACTION:
			case RUN:
			case SCHEDULE:
			case ON:
			case SHOW:
			case LIMIT:
			case CREATE:
			case INDEX:
			case INDEXES:
			case IF:
			case NOT:
			case EXISTS:
			case TABLE:
			case USING:
			case OPTIONS:
			case DROP:
			case FROM:
			case IN:
			case REFRESH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				identifier();
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(295);
					match(DOT);
					setState(296);
					identifier();
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(STRING);
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

	public static class PropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(HoodieSqlCommonParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(HoodieSqlCommonParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(HoodieSqlCommonParser.STRING, 0); }
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoodieSqlCommonListener ) ((HoodieSqlCommonListener)listener).exitPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HoodieSqlCommonVisitor ) return ((HoodieSqlCommonVisitor<? extends T>)visitor).visitPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_propertyValue);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				match(STRING);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u013a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\3\3\3\3\5\3A\n\3\3"+
		"\3\3\3\3\3\5\3F\n\3\3\3\3\3\3\3\5\3K\n\3\3\3\3\3\3\3\3\3\3\3\5\3R\n\3"+
		"\3\3\3\3\3\3\3\3\5\3X\n\3\3\3\3\3\3\3\5\3]\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3e\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3m\n\3\3\3\3\3\3\3\7\3r\n\3\f\3\16"+
		"\3u\13\3\5\3w\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\177\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u0087\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008f\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u0097\n\4\5\4\u0099\n\4\3\5\3\5\5\5\u009d\n\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\7\6\u00a5\n\6\f\6\16\6\u00a8\13\6\5\6\u00aa\n\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00b3\n\7\3\b\3\b\5\b\u00b7\n\b\3\t\3\t\3"+
		"\t\6\t\u00bc\n\t\r\t\16\t\u00bd\3\t\3\t\3\t\5\t\u00c3\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u00ca\n\n\f\n\16\n\u00cd\13\n\3\n\3\n\3\13\3\13\3\f\5\f\u00d4"+
		"\n\f\3\f\3\f\5\f\u00d8\n\f\3\f\3\f\5\f\u00dc\n\f\3\f\3\f\5\f\u00e0\n\f"+
		"\3\f\3\f\5\f\u00e4\n\f\3\f\3\f\5\f\u00e8\n\f\3\f\3\f\5\f\u00ec\n\f\3\f"+
		"\3\f\5\f\u00f0\n\f\3\f\3\f\5\f\u00f4\n\f\3\f\5\f\u00f7\n\f\3\r\3\r\3\r"+
		"\7\r\u00fc\n\r\f\r\16\r\u00ff\13\r\3\16\3\16\3\16\5\16\u0104\n\16\3\17"+
		"\3\17\3\17\7\17\u0109\n\17\f\17\16\17\u010c\13\17\3\20\3\20\3\20\5\20"+
		"\u0111\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u011b\n\23\f"+
		"\23\16\23\u011e\13\23\3\23\3\23\3\24\3\24\5\24\u0124\n\24\3\24\5\24\u0127"+
		"\n\24\3\25\3\25\3\25\7\25\u012c\n\25\f\25\16\25\u012f\13\25\3\25\5\25"+
		"\u0132\n\25\3\26\3\26\3\26\3\26\5\26\u0138\n\26\3\26\3s\2\27\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\6\3\2\"#\3\2\r\16\3\2\24\25\4\2"+
		"\13\21\30$\2\u0164\2,\3\2\2\2\4v\3\2\2\2\6\u0098\3\2\2\2\b\u009c\3\2\2"+
		"\2\n\u00a0\3\2\2\2\f\u00b2\3\2\2\2\16\u00b6\3\2\2\2\20\u00c2\3\2\2\2\22"+
		"\u00c4\3\2\2\2\24\u00d0\3\2\2\2\26\u00f6\3\2\2\2\30\u00f8\3\2\2\2\32\u0100"+
		"\3\2\2\2\34\u0105\3\2\2\2\36\u0110\3\2\2\2 \u0112\3\2\2\2\"\u0114\3\2"+
		"\2\2$\u0116\3\2\2\2&\u0121\3\2\2\2(\u0131\3\2\2\2*\u0137\3\2\2\2,\60\5"+
		"\4\3\2-/\7\3\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63"+
		"\3\2\2\2\62\60\3\2\2\2\63\64\7\2\2\3\64\3\3\2\2\2\65w\5\6\4\2\66\67\7"+
		"\13\2\2\679\5\34\17\28:\5\n\6\298\3\2\2\29:\3\2\2\2:w\3\2\2\2;<\7\30\2"+
		"\2<@\7\31\2\2=>\7\33\2\2>?\7\34\2\2?A\7\35\2\2@=\3\2\2\2@A\3\2\2\2AB\3"+
		"\2\2\2BC\5\36\20\2CE\7\17\2\2DF\7\36\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2"+
		"GJ\5\b\5\2HI\7\37\2\2IK\5\36\20\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\5"+
		"\2\2MN\5\30\r\2NQ\7\6\2\2OP\7 \2\2PR\5$\23\2QO\3\2\2\2QR\3\2\2\2Rw\3\2"+
		"\2\2ST\7!\2\2TW\7\31\2\2UV\7\33\2\2VX\7\35\2\2WU\3\2\2\2WX\3\2\2\2XY\3"+
		"\2\2\2YZ\5\36\20\2Z\\\7\17\2\2[]\7\36\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2"+
		"\2\2^_\5\b\5\2_w\3\2\2\2`a\7\20\2\2ab\7\32\2\2bd\t\2\2\2ce\7\36\2\2dc"+
		"\3\2\2\2de\3\2\2\2ef\3\2\2\2fw\5\b\5\2gh\7$\2\2hi\7\31\2\2ij\5\36\20\2"+
		"jl\7\17\2\2km\7\36\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\5\b\5\2ow\3\2\2"+
		"\2pr\13\2\2\2qp\3\2\2\2ru\3\2\2\2st\3\2\2\2sq\3\2\2\2tw\3\2\2\2us\3\2"+
		"\2\2v\65\3\2\2\2v\66\3\2\2\2v;\3\2\2\2vS\3\2\2\2v`\3\2\2\2vg\3\2\2\2v"+
		"s\3\2\2\2w\5\3\2\2\2xy\t\3\2\2yz\7\f\2\2z{\7\17\2\2{~\5\b\5\2|}\7\n\2"+
		"\2}\177\7,\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0099\3\2\2\2\u0080\u0081\t"+
		"\3\2\2\u0081\u0082\7\f\2\2\u0082\u0083\7\17\2\2\u0083\u0086\7(\2\2\u0084"+
		"\u0085\7\n\2\2\u0085\u0087\7,\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0099\3\2\2\2\u0088\u0089\7\20\2\2\u0089\u008a\7\f\2\2\u008a"+
		"\u008b\7\17\2\2\u008b\u008e\5\b\5\2\u008c\u008d\7\21\2\2\u008d\u008f\7"+
		",\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0099\3\2\2\2\u0090"+
		"\u0091\7\20\2\2\u0091\u0092\7\f\2\2\u0092\u0093\7\17\2\2\u0093\u0096\7"+
		"(\2\2\u0094\u0095\7\21\2\2\u0095\u0097\7,\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098x\3\2\2\2\u0098\u0080\3\2\2\2"+
		"\u0098\u0088\3\2\2\2\u0098\u0090\3\2\2\2\u0099\7\3\2\2\2\u009a\u009b\7"+
		"\62\2\2\u009b\u009d\7\b\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\7\62\2\2\u009f\t\3\2\2\2\u00a0\u00a9\7\5\2"+
		"\2\u00a1\u00a6\5\f\7\2\u00a2\u00a3\7\7\2\2\u00a3\u00a5\5\f\7\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\6\2\2\u00ac\13\3\2\2\2\u00ad\u00b3"+
		"\5\16\b\2\u00ae\u00af\5\36\20\2\u00af\u00b0\7\4\2\2\u00b0\u00b1\5\16\b"+
		"\2\u00b1\u00b3\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\r"+
		"\3\2\2\2\u00b4\u00b7\5\20\t\2\u00b5\u00b7\5\22\n\2\u00b6\u00b4\3\2\2\2"+
		"\u00b6\u00b5\3\2\2\2\u00b7\17\3\2\2\2\u00b8\u00c3\5\26\f\2\u00b9\u00c3"+
		"\5\24\13\2\u00ba\u00bc\7(\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c3\3\2\2\2\u00bf\u00c0"+
		"\5\36\20\2\u00c0\u00c1\7(\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00b8\3\2\2\2"+
		"\u00c2\u00b9\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\21"+
		"\3\2\2\2\u00c4\u00c5\7\22\2\2\u00c5\u00c6\7\5\2\2\u00c6\u00cb\5\20\t\2"+
		"\u00c7\u00c8\7\7\2\2\u00c8\u00ca\5\20\t\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7\6\2\2\u00cf\23\3\2\2\2\u00d0\u00d1\t\4\2"+
		"\2\u00d1\25\3\2\2\2\u00d2\u00d4\7\'\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00f7\7-\2\2\u00d6\u00d8\7\'\2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00f7\7."+
		"\2\2\u00da\u00dc\7\'\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00f7\7,\2\2\u00de\u00e0\7\'\2\2\u00df\u00de\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00f7\7)\2\2\u00e2"+
		"\u00e4\7\'\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00f7\7*\2\2\u00e6\u00e8\7\'\2\2\u00e7\u00e6\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f7\7+\2\2\u00ea\u00ec\7\'"+
		"\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00f7\7\60\2\2\u00ee\u00f0\7\'\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3"+
		"\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f7\7/\2\2\u00f2\u00f4\7\'\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\7\61"+
		"\2\2\u00f6\u00d3\3\2\2\2\u00f6\u00d7\3\2\2\2\u00f6\u00db\3\2\2\2\u00f6"+
		"\u00df\3\2\2\2\u00f6\u00e3\3\2\2\2\u00f6\u00e7\3\2\2\2\u00f6\u00eb\3\2"+
		"\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\27\3\2\2\2\u00f8\u00fd"+
		"\5\32\16\2\u00f9\u00fa\7\7\2\2\u00fa\u00fc\5\32\16\2\u00fb\u00f9\3\2\2"+
		"\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\31"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0103\5\34\17\2\u0101\u0102\7 \2\2"+
		"\u0102\u0104\5$\23\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\33"+
		"\3\2\2\2\u0105\u010a\5\36\20\2\u0106\u0107\7\b\2\2\u0107\u0109\5\36\20"+
		"\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\35\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0111\7\62\2\2\u010e"+
		"\u0111\5 \21\2\u010f\u0111\5\"\22\2\u0110\u010d\3\2\2\2\u0110\u010e\3"+
		"\2\2\2\u0110\u010f\3\2\2\2\u0111\37\3\2\2\2\u0112\u0113\7\63\2\2\u0113"+
		"!\3\2\2\2\u0114\u0115\t\5\2\2\u0115#\3\2\2\2\u0116\u0117\7\5\2\2\u0117"+
		"\u011c\5&\24\2\u0118\u0119\7\7\2\2\u0119\u011b\5&\24\2\u011a\u0118\3\2"+
		"\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7\6\2\2\u0120%\3\2\2\2"+
		"\u0121\u0126\5(\25\2\u0122\u0124\7%\2\2\u0123\u0122\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\5*\26\2\u0126\u0123\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\'\3\2\2\2\u0128\u012d\5\36\20\2\u0129\u012a\7\b\2"+
		"\2\u012a\u012c\5\36\20\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0132\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u0130\u0132\7(\2\2\u0131\u0128\3\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		")\3\2\2\2\u0133\u0138\7,\2\2\u0134\u0138\7.\2\2\u0135\u0138\5\24\13\2"+
		"\u0136\u0138\7(\2\2\u0137\u0133\3\2\2\2\u0137\u0134\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0136\3\2\2\2\u0138+\3\2\2\2/\609@EJQW\\dlsv~\u0086\u008e"+
		"\u0096\u0098\u009c\u00a6\u00a9\u00b2\u00b6\u00bd\u00c2\u00cb\u00d3\u00d7"+
		"\u00db\u00df\u00e3\u00e7\u00eb\u00ef\u00f3\u00f6\u00fd\u0103\u010a\u0110"+
		"\u011c\u0123\u0126\u012d\u0131\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}