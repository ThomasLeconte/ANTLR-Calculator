// Generated from Calc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, NEWLINE=24, 
		WS=25, ENTIER=26, TYPE=27, IDENTIFIANT=28, UNMATCH=29;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_instruction = 2, RULE_expression = 3, 
		RULE_write = 4, RULE_read = 5, RULE_operateur = 6, RULE_logique = 7, RULE_condition = 8, 
		RULE_boucle = 9, RULE_decl = 10, RULE_assignation = 11, RULE_finInstruction = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "instruction", "expression", "write", "read", "operateur", 
			"logique", "condition", "boucle", "decl", "assignation", "finInstruction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'*'", "'+'", "'-'", "'('", "')'", "'write('", "'read('", 
			"'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'true'", 
			"'1'", "'false'", "'0'", "'while('", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NEWLINE", "WS", "ENTIER", "TYPE", "IDENTIFIANT", "UNMATCH"
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
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	            private TableSymboles tableSymboles = new TableSymboles(); 
	            private int _cur_label = 1;
	            /** générateur de nom d'étiquettes pour les boucles */
	            private String getNewLabel() { return "B" +(_cur_label++); }
	            // ...
	        
	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalcParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			calcul();
			setState(27);
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

	public static class CalculContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public InstructionContext instruction;
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalcParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalcParser.NEWLINE, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterCalcul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitCalcul(this);
		}
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(29);
				((CalculContext)_localctx).decl = decl();
				 _localctx.code += ((CalculContext)_localctx).decl.code; 
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(37);
				match(NEWLINE);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__20) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(43);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "HALT\n"; 
			}
			_ctx.stop = _input.LT(-1);
			 System.out.println(_localctx.code); 
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

	public static class InstructionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public AssignationContext assignation;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				((InstructionContext)_localctx).expression = expression(0);
				setState(54);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				((InstructionContext)_localctx).assignation = assignation();
				setState(58);
				finInstruction();
				 
						    ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code;
				        
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
		public String code;
		public ExpressionContext a;
		public ExpressionContext c;
		public ExpressionContext e;
		public Token IDENTIFIANT;
		public Token f;
		public WriteContext write;
		public ReadContext read;
		public BoucleContext boucle;
		public AssignationContext assignation;
		public Token op;
		public ExpressionContext b;
		public ExpressionContext d;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIANT() { return getToken(CalcParser.IDENTIFIANT, 0); }
		public TerminalNode ENTIER() { return getToken(CalcParser.ENTIER, 0); }
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public BoucleContext boucle() {
			return getRuleContext(BoucleContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(64);
				match(T__4);
				setState(65);
				((ExpressionContext)_localctx).e = expression(0);
				setState(66);
				match(T__5);
				((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).e.code;
				}
				break;
			case 2:
				{
				setState(69);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				            AdresseType var = tableSymboles.getAdresseType((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				            ((ExpressionContext)_localctx).code =  "PUSHG "+var.adresse+"\n";
				        
				}
				break;
			case 3:
				{
				setState(71);
				((ExpressionContext)_localctx).f = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI " + (((ExpressionContext)_localctx).f!=null?((ExpressionContext)_localctx).f.getText():null) +"\n";
				        
				}
				break;
			case 4:
				{
				setState(73);
				match(T__3);
				setState(74);
				((ExpressionContext)_localctx).f = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI 0\n";
				            _localctx.code += "PUSHI "+(((ExpressionContext)_localctx).f!=null?((ExpressionContext)_localctx).f.getText():null)+"\n";
				            _localctx.code += "SUB\n";
				        
				}
				break;
			case 5:
				{
				setState(76);
				((ExpressionContext)_localctx).write = write();

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).write.code;
				        
				}
				break;
			case 6:
				{
				setState(79);
				((ExpressionContext)_localctx).read = read();

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).read.code;
				        
				}
				break;
			case 7:
				{
				setState(82);
				((ExpressionContext)_localctx).boucle = boucle();

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).boucle.code;
				        
				}
				break;
			case 8:
				{
				setState(85);
				((ExpressionContext)_localctx).assignation = assignation();

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).assignation.code;
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(91);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(92);
						((ExpressionContext)_localctx).b = expression(11);
						if((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).equals("/")){
						                      ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "DIV\n"; 
						                  }else{ 
						                      ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "MUL\n";
						                  }
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.c = _prevctx;
						_localctx.c = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(96);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(97);
						((ExpressionContext)_localctx).d = expression(10);
						if((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).equals("+")){
						                      ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).c.code + ((ExpressionContext)_localctx).d.code + "ADD\n"; 
						                  }else{ 
						                      ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).c.code + ((ExpressionContext)_localctx).d.code + "SUB\n";
						                  }
						}
						break;
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class WriteContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__6);
			setState(106);
			((WriteContext)_localctx).expression = expression(0);
			setState(107);
			match(T__5);

			            ((WriteContext)_localctx).code =  ((WriteContext)_localctx).expression.code;
			            _localctx.code += "WRITE\n";
			        
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

	public static class ReadContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__7);
			setState(111);
			((ReadContext)_localctx).expression = expression(0);
			setState(112);
			match(T__5);

			            ((ReadContext)_localctx).code =  ((ReadContext)_localctx).expression.code;
			        
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

	public static class OperateurContext extends ParserRuleContext {
		public String code;
		public OperateurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operateur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterOperateur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitOperateur(this);
		}
	}

	public final OperateurContext operateur() throws RecognitionException {
		OperateurContext _localctx = new OperateurContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operateur);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(T__8);
				 ((OperateurContext)_localctx).code =  "SUP\n"; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__9);
				 ((OperateurContext)_localctx).code =  "SUPEQ\n"; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(T__10);
				 ((OperateurContext)_localctx).code =  "INF\n"; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(T__11);
				 ((OperateurContext)_localctx).code =  "INFEQ\n"; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(T__12);
				 ((OperateurContext)_localctx).code =  "EQUAL\n"; 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				match(T__13);
				 ((OperateurContext)_localctx).code =  "NEQ\n"; 
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

	public static class LogiqueContext extends ParserRuleContext {
		public String code;
		public LogiqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterLogique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitLogique(this);
		}
	}

	public final LogiqueContext logique() throws RecognitionException {
		LogiqueContext _localctx = new LogiqueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logique);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__14);
				 ((LogiqueContext)_localctx).code =  "&&"; 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__15);
				((LogiqueContext)_localctx).code =  "||"; 
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

	public static class ConditionContext extends ParserRuleContext {
		public String code;
		public ConditionContext c;
		public ExpressionContext a;
		public OperateurContext operateur;
		public ExpressionContext b;
		public LogiqueContext logique;
		public ConditionContext d;
		public OperateurContext operateur() {
			return getRuleContext(OperateurContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogiqueContext logique() {
			return getRuleContext(LogiqueContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
				{
				setState(136);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				            ((ConditionContext)_localctx).code =  "PUSHI 1\n";
				            _localctx.code += "PUSHI 1\n";
				            _localctx.code += "EQUAL\n";
				        
				}
				break;
			case T__18:
			case T__19:
				{
				setState(138);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				            ((ConditionContext)_localctx).code =  "PUSHI 0\n";
				            _localctx.code += "PUSHI 0\n";
				            _localctx.code += "EQUAL\n";
				        
				}
				break;
			case T__3:
			case T__4:
			case T__6:
			case T__7:
			case T__20:
			case ENTIER:
			case IDENTIFIANT:
				{
				setState(140);
				((ConditionContext)_localctx).a = expression(0);
				setState(141);
				((ConditionContext)_localctx).operateur = operateur();
				setState(142);
				((ConditionContext)_localctx).b = expression(0);

				            ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code;
				            _localctx.code += ((ConditionContext)_localctx).b.code;
				            _localctx.code += ((ConditionContext)_localctx).operateur.code;
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					_localctx.c = _prevctx;
					_localctx.c = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(147);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(148);
					((ConditionContext)_localctx).logique = logique();
					setState(149);
					((ConditionContext)_localctx).d = condition(2);

					                      ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).c.code;
					                      if(((ConditionContext)_localctx).logique.code.equals("&&")){
					                          //...
					                      }else if(((ConditionContext)_localctx).logique.code.equals("||")){
					                          //...
					                      }else{
					                          // pour "!"
					                          //...
					                      }
					                  
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class BoucleContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public ExpressionContext a;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterBoucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitBoucle(this);
		}
	}

	public final BoucleContext boucle() throws RecognitionException {
		BoucleContext _localctx = new BoucleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__20);
			setState(158);
			((BoucleContext)_localctx).condition = condition(0);
			setState(159);
			match(T__5);
			setState(160);
			((BoucleContext)_localctx).a = expression(0);

			            String boucle1 = getNewLabel();
			            String boucle2 = getNewLabel();
			            ((BoucleContext)_localctx).code =  "LABEL " + boucle1 + "\n";
			            _localctx.code += ((BoucleContext)_localctx).condition.code;
			            _localctx.code += "JUMPF "+ boucle2 + "\n";            
			            _localctx.code += ((BoucleContext)_localctx).a.code;
			            _localctx.code += "JUMP "+ boucle1 + "\n";
			            _localctx.code += "LABEL "+ boucle2 + "\n";
			            _localctx.code += "WRITE \n";
			        
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

	public static class DeclContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public TerminalNode TYPE() { return getToken(CalcParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalcParser.IDENTIFIANT, 0); }
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decl);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(164);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(165);
				finInstruction();

				            ((DeclContext)_localctx).code =  "PUSHI 0\n";
				            tableSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(169);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(170);
				match(T__21);
				setState(171);
				((DeclContext)_localctx).expression = expression(0);
				setState(172);
				finInstruction();

				            ((DeclContext)_localctx).code =  "PUSHI 0\n";
				            _localctx.code += ((DeclContext)_localctx).expression.code; //PUSHI x
				            tableSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null)); //On sauvegarde la variable
				            AdresseType at = tableSymboles.getAdresseType((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null));
				            _localctx.code += "STOREG "+at.adresse+"\n";
				        
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

	public static class AssignationContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIANT() { return getToken(CalcParser.IDENTIFIANT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(178);
			match(T__21);
			setState(179);
			((AssignationContext)_localctx).expression = expression(0);

			            AdresseType at = tableSymboles.getAdresseType((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null)); //On récupère l'@ de la variable X
			            ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code; //PUSHI x (qui peut aussi être le code de l'expression)
			            _localctx.code += "STOREG "+at.adresse+"\n"; //On stocke la valeur d'expression à l'@ de X
			        
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

	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CalcParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalcParser.NEWLINE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterFinInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitFinInstruction(this);
		}
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(182);
					_la = _input.LA(1);
					if ( !(_la==T__22 || _la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 8:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5[\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5g\n"+
		"\5\f\5\16\5j\13\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\t\3\t\3\t\3\t\5\t"+
		"\u0088\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0094\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u009b\n\n\f\n\16\n\u009e\13\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b2\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\6\16\u00ba\n\16\r\16\16\16\u00bb\3\16\2\4\b"+
		"\22\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\7\3\2\3\4\3\2\5\6\3\2\23\24"+
		"\3\2\25\26\3\2\31\32\2\u00c8\2\34\3\2\2\2\4$\3\2\2\2\6?\3\2\2\2\bZ\3\2"+
		"\2\2\nk\3\2\2\2\fp\3\2\2\2\16\u0081\3\2\2\2\20\u0087\3\2\2\2\22\u0093"+
		"\3\2\2\2\24\u009f\3\2\2\2\26\u00b1\3\2\2\2\30\u00b3\3\2\2\2\32\u00b9\3"+
		"\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \5\26\f\2 !\b\3\1\2"+
		"!#\3\2\2\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%*\3\2\2\2&$\3\2"+
		"\2\2\')\7\32\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\62\3\2\2\2"+
		",*\3\2\2\2-.\5\6\4\2./\b\3\1\2/\61\3\2\2\2\60-\3\2\2\2\61\64\3\2\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\b\3\1\2\66"+
		"\5\3\2\2\2\678\5\b\5\289\5\32\16\29:\b\4\1\2:@\3\2\2\2;<\5\30\r\2<=\5"+
		"\32\16\2=>\b\4\1\2>@\3\2\2\2?\67\3\2\2\2?;\3\2\2\2@\7\3\2\2\2AB\b\5\1"+
		"\2BC\7\7\2\2CD\5\b\5\2DE\7\b\2\2EF\b\5\1\2F[\3\2\2\2GH\7\36\2\2H[\b\5"+
		"\1\2IJ\7\34\2\2J[\b\5\1\2KL\7\6\2\2LM\7\34\2\2M[\b\5\1\2NO\5\n\6\2OP\b"+
		"\5\1\2P[\3\2\2\2QR\5\f\7\2RS\b\5\1\2S[\3\2\2\2TU\5\24\13\2UV\b\5\1\2V"+
		"[\3\2\2\2WX\5\30\r\2XY\b\5\1\2Y[\3\2\2\2ZA\3\2\2\2ZG\3\2\2\2ZI\3\2\2\2"+
		"ZK\3\2\2\2ZN\3\2\2\2ZQ\3\2\2\2ZT\3\2\2\2ZW\3\2\2\2[h\3\2\2\2\\]\f\f\2"+
		"\2]^\t\2\2\2^_\5\b\5\r_`\b\5\1\2`g\3\2\2\2ab\f\13\2\2bc\t\3\2\2cd\5\b"+
		"\5\fde\b\5\1\2eg\3\2\2\2f\\\3\2\2\2fa\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2i\t\3\2\2\2jh\3\2\2\2kl\7\t\2\2lm\5\b\5\2mn\7\b\2\2no\b\6\1\2o\13"+
		"\3\2\2\2pq\7\n\2\2qr\5\b\5\2rs\7\b\2\2st\b\7\1\2t\r\3\2\2\2uv\7\13\2\2"+
		"v\u0082\b\b\1\2wx\7\f\2\2x\u0082\b\b\1\2yz\7\r\2\2z\u0082\b\b\1\2{|\7"+
		"\16\2\2|\u0082\b\b\1\2}~\7\17\2\2~\u0082\b\b\1\2\177\u0080\7\20\2\2\u0080"+
		"\u0082\b\b\1\2\u0081u\3\2\2\2\u0081w\3\2\2\2\u0081y\3\2\2\2\u0081{\3\2"+
		"\2\2\u0081}\3\2\2\2\u0081\177\3\2\2\2\u0082\17\3\2\2\2\u0083\u0084\7\21"+
		"\2\2\u0084\u0088\b\t\1\2\u0085\u0086\7\22\2\2\u0086\u0088\b\t\1\2\u0087"+
		"\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088\21\3\2\2\2\u0089\u008a\b\n\1"+
		"\2\u008a\u008b\t\4\2\2\u008b\u0094\b\n\1\2\u008c\u008d\t\5\2\2\u008d\u0094"+
		"\b\n\1\2\u008e\u008f\5\b\5\2\u008f\u0090\5\16\b\2\u0090\u0091\5\b\5\2"+
		"\u0091\u0092\b\n\1\2\u0092\u0094\3\2\2\2\u0093\u0089\3\2\2\2\u0093\u008c"+
		"\3\2\2\2\u0093\u008e\3\2\2\2\u0094\u009c\3\2\2\2\u0095\u0096\f\3\2\2\u0096"+
		"\u0097\5\20\t\2\u0097\u0098\5\22\n\4\u0098\u0099\b\n\1\2\u0099\u009b\3"+
		"\2\2\2\u009a\u0095\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\23\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\27\2"+
		"\2\u00a0\u00a1\5\22\n\2\u00a1\u00a2\7\b\2\2\u00a2\u00a3\5\b\5\2\u00a3"+
		"\u00a4\b\13\1\2\u00a4\25\3\2\2\2\u00a5\u00a6\7\35\2\2\u00a6\u00a7\7\36"+
		"\2\2\u00a7\u00a8\5\32\16\2\u00a8\u00a9\b\f\1\2\u00a9\u00b2\3\2\2\2\u00aa"+
		"\u00ab\7\35\2\2\u00ab\u00ac\7\36\2\2\u00ac\u00ad\7\30\2\2\u00ad\u00ae"+
		"\5\b\5\2\u00ae\u00af\5\32\16\2\u00af\u00b0\b\f\1\2\u00b0\u00b2\3\2\2\2"+
		"\u00b1\u00a5\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b2\27\3\2\2\2\u00b3\u00b4"+
		"\7\36\2\2\u00b4\u00b5\7\30\2\2\u00b5\u00b6\5\b\5\2\u00b6\u00b7\b\r\1\2"+
		"\u00b7\31\3\2\2\2\u00b8\u00ba\t\6\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\33\3\2\2\2\17$"+
		"*\62?Zfh\u0081\u0087\u0093\u009c\u00b1\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}