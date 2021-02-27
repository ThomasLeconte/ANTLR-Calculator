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
		WS=25, ENTIER=26, FLOAT=27, TYPE=28, IDENTIFIANT=29, UNMATCH=30;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_instruction = 2, RULE_expression = 3, 
		RULE_operateur = 4, RULE_logique = 5, RULE_condition = 6, RULE_boucle = 7, 
		RULE_decl = 8, RULE_assignation = 9, RULE_bloc = 10, RULE_write = 11, 
		RULE_read = 12, RULE_finInstruction = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "instruction", "expression", "operateur", "logique", 
			"condition", "boucle", "decl", "assignation", "bloc", "write", "read", 
			"finInstruction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'*'", "'+'", "'-'", "'('", "')'", "'>'", "'>='", "'<'", 
			"'<='", "'=='", "'!='", "'&&'", "'||'", "'true'", "'false'", "'while('", 
			"'='", "'{'", "'}'", "'write('", "'read('", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NEWLINE", "WS", "ENTIER", "FLOAT", "TYPE", "IDENTIFIANT", "UNMATCH"
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
			setState(28);
			calcul();
			setState(29);
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
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(31);
				((CalculContext)_localctx).decl = decl();
				 _localctx.code += ((CalculContext)_localctx).decl.code; 
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(39);
				match(NEWLINE);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(45);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(52);
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				((InstructionContext)_localctx).expression = expression(0);
				setState(56);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				((InstructionContext)_localctx).assignation = assignation();
				setState(60);
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
		public Token ENTIER;
		public Token f;
		public WriteContext write;
		public ReadContext read;
		public BoucleContext boucle;
		public BlocContext bloc;
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
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(66);
				match(T__4);
				setState(67);
				((ExpressionContext)_localctx).e = expression(0);
				setState(68);
				match(T__5);
				((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).e.code;
				}
				break;
			case IDENTIFIANT:
				{
				setState(71);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				            AdresseType var = tableSymboles.getAdresseType((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				            ((ExpressionContext)_localctx).code =  "PUSHG "+var.adresse+"\n";
				        
				}
				break;
			case ENTIER:
				{
				setState(73);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) +"\n";
				        
				}
				break;
			case T__3:
				{
				setState(75);
				match(T__3);
				setState(76);
				((ExpressionContext)_localctx).f = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI 0\n";
				            _localctx.code += "PUSHI "+(((ExpressionContext)_localctx).f!=null?((ExpressionContext)_localctx).f.getText():null)+"\n";
				            _localctx.code += "SUB\n";
				        
				}
				break;
			case T__20:
				{
				setState(78);
				((ExpressionContext)_localctx).write = write();

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).write.code;
				        
				}
				break;
			case T__21:
				{
				setState(81);
				((ExpressionContext)_localctx).read = read();

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).read.code;
				        
				}
				break;
			case T__16:
				{
				setState(84);
				((ExpressionContext)_localctx).boucle = boucle();

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).boucle.code;
				        
				}
				break;
			case T__18:
				{
				setState(87);
				((ExpressionContext)_localctx).bloc = bloc();

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).bloc.code;
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(93);
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
						setState(94);
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
						setState(97);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(98);
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
						setState(99);
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
				setState(106);
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
		enterRule(_localctx, 8, RULE_operateur);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__6);
				 ((OperateurContext)_localctx).code =  "SUP\n"; 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__7);
				 ((OperateurContext)_localctx).code =  "SUPEQ\n"; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(T__8);
				 ((OperateurContext)_localctx).code =  "INF\n"; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(T__9);
				 ((OperateurContext)_localctx).code =  "INFEQ\n"; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(T__10);
				 ((OperateurContext)_localctx).code =  "EQUAL\n"; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				match(T__11);
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
		enterRule(_localctx, 10, RULE_logique);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__12);
				 ((LogiqueContext)_localctx).code =  "&&"; 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(T__13);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				{
				setState(128);
				match(T__14);
				}

				            ((ConditionContext)_localctx).code =  "PUSHI 1\n";
				        
				}
				break;
			case T__15:
				{
				{
				setState(130);
				match(T__15);
				}

				            ((ConditionContext)_localctx).code =  "PUSHI 0\n";
				        
				}
				break;
			case T__3:
			case T__4:
			case T__16:
			case T__18:
			case T__20:
			case T__21:
			case ENTIER:
			case IDENTIFIANT:
				{
				setState(132);
				((ConditionContext)_localctx).a = expression(0);
				setState(133);
				((ConditionContext)_localctx).operateur = operateur();
				setState(134);
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
			setState(146);
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
					setState(139);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(140);
					((ConditionContext)_localctx).logique = logique();
					setState(141);
					((ConditionContext)_localctx).d = condition(2);

					                      String condition2 = getNewLabel();
					                      String fin = getNewLabel();
					                      AdresseType test1 = tableSymboles.getAdresseType("test1"); 
					                      AdresseType test2 = tableSymboles.getAdresseType("test2");//on initialise les variables test à faux de base
					                      ((ConditionContext)_localctx).code =  "PUSHI 1"; 
					                      _localctx.code += "STOREG "+test1.adresse+"\n";
					                      ((ConditionContext)_localctx).code =  "PUSHI 2"; 
					                      _localctx.code += "STOREG "+test2.adresse+"\n";
					                      _localctx.code += ((ConditionContext)_localctx).c.code;
					                      if(((ConditionContext)_localctx).logique.code.equals("&&")){
					                          _localctx.code += "JUMPF "+fin+"\n"; // si c'est faux, on va direct à la fin
					                          _localctx.code += ((ConditionContext)_localctx).d.code;
					                          _localctx.code += "JUMPF "+fin+"\n"; 
					                          _localctx.code += "PUSHI 1" + "\n"; //si c'est vrai, on fait en sorte que le test de fin return true
					                          _localctx.code += "STOREG "+test2.adresse+"\n";               
					                      }else if(((ConditionContext)_localctx).logique.code.equals("||")){
					                          _localctx.code += "JUMPF "+condition2+"\n";
					                          _localctx.code += "PUSHI 2"+ "\n"; //si c'est vrai, on fait en sorte que le test de fin return true
					                          _localctx.code += "STOREG "+test1.adresse+"\n"; 
					                          _localctx.code += "JUMP " +fin+"\n";//si le premier est vrai, on va direct faire le test
					                          _localctx.code += "LABEL " + condition2 + "\n";
					                          _localctx.code += ((ConditionContext)_localctx).d.code;
					                          _localctx.code += "JUMPF "+fin+"\n";
					                          _localctx.code += "PUSHI 1" + "\n"; //si c'est vrai, on fait en sorte que le test de fin return true
					                          _localctx.code += "STOREG "+test2.adresse+"\n"; 
					                          _localctx.code += "JUMP " +fin+"\n";
					                      }else{
					                          // pour "!"
					                          //...
					                      }
					                      _localctx.code += "LABEL " + fin + "\n";
					                      _localctx.code += "PUSHG " + test1.adresse + "\n";
					                      _localctx.code += "PUSHG " + test2.adresse + "\n";
					                      _localctx.code += _localctx.code += "EQUAL\n";
					                  
					}
					} 
				}
				setState(148);
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
		public InstructionContext a;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
		enterRule(_localctx, 14, RULE_boucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__16);
			setState(150);
			((BoucleContext)_localctx).condition = condition(0);
			setState(151);
			match(T__5);
			setState(152);
			((BoucleContext)_localctx).a = instruction();

			            String boucle1 = getNewLabel();
			            String boucle2 = getNewLabel();
			            
			                ((BoucleContext)_localctx).code =  "LABEL " + boucle1 + "\n";
			                _localctx.code += ((BoucleContext)_localctx).condition.code;
			                _localctx.code += "JUMPF "+ boucle2 + "\n";            
			                _localctx.code += ((BoucleContext)_localctx).a.code;
			                _localctx.code += "JUMP "+ boucle1 + "\n";
			                _localctx.code += "LABEL "+ boucle2 + "\n";
			                _localctx.code += "WRITE \n";
			                _localctx.code += "POP \n";
			            
			        
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
		enterRule(_localctx, 16, RULE_decl);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(156);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(157);
				finInstruction();

				            ((DeclContext)_localctx).code =  "PUSHI 0\n";
				            tableSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(161);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(162);
				match(T__17);
				setState(163);
				((DeclContext)_localctx).expression = expression(0);
				setState(164);
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
		enterRule(_localctx, 18, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(170);
			match(T__17);
			setState(171);
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

	public static class BlocContext extends ParserRuleContext {
		public String code;
		public InstructionContext instruction;
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
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitBloc(this);
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__18);
			setState(175);
			match(NEWLINE);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(176);
				((BlocContext)_localctx).instruction = instruction();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(182);
				match(NEWLINE);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(T__19);

			            ((BlocContext)_localctx).code =  ((BlocContext)_localctx).instruction.code;
			        
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
		enterRule(_localctx, 22, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__20);
			setState(192);
			((WriteContext)_localctx).expression = expression(0);
			setState(193);
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
		enterRule(_localctx, 24, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__21);
			setState(197);
			((ReadContext)_localctx).expression = expression(0);
			setState(198);
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
		enterRule(_localctx, 26, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(201);
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
				setState(204); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		case 6:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00d1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\3\7\3%\n"+
		"\3\f\3\16\3(\13\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3\3\7\3\63\n\3\f"+
		"\3\16\3\66\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5i\n\5\f\5\16\5l\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6z\n\6\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u0093\n\b\f\b\16"+
		"\b\u0096\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u00aa\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7"+
		"\f\u00b4\n\f\f\f\16\f\u00b7\13\f\3\f\7\f\u00ba\n\f\f\f\16\f\u00bd\13\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\6\17\u00cd"+
		"\n\17\r\17\16\17\u00ce\3\17\2\4\b\16\20\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\2\5\3\2\3\4\3\2\5\6\3\2\31\32\2\u00dc\2\36\3\2\2\2\4&\3\2\2\2\6"+
		"A\3\2\2\2\b\\\3\2\2\2\ny\3\2\2\2\f\177\3\2\2\2\16\u008b\3\2\2\2\20\u0097"+
		"\3\2\2\2\22\u00a9\3\2\2\2\24\u00ab\3\2\2\2\26\u00b0\3\2\2\2\30\u00c1\3"+
		"\2\2\2\32\u00c6\3\2\2\2\34\u00cc\3\2\2\2\36\37\5\4\3\2\37 \7\2\2\3 \3"+
		"\3\2\2\2!\"\5\22\n\2\"#\b\3\1\2#%\3\2\2\2$!\3\2\2\2%(\3\2\2\2&$\3\2\2"+
		"\2&\'\3\2\2\2\',\3\2\2\2(&\3\2\2\2)+\7\32\2\2*)\3\2\2\2+.\3\2\2\2,*\3"+
		"\2\2\2,-\3\2\2\2-\64\3\2\2\2.,\3\2\2\2/\60\5\6\4\2\60\61\b\3\1\2\61\63"+
		"\3\2\2\2\62/\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3"+
		"\2\2\2\66\64\3\2\2\2\678\b\3\1\28\5\3\2\2\29:\5\b\5\2:;\5\34\17\2;<\b"+
		"\4\1\2<B\3\2\2\2=>\5\24\13\2>?\5\34\17\2?@\b\4\1\2@B\3\2\2\2A9\3\2\2\2"+
		"A=\3\2\2\2B\7\3\2\2\2CD\b\5\1\2DE\7\7\2\2EF\5\b\5\2FG\7\b\2\2GH\b\5\1"+
		"\2H]\3\2\2\2IJ\7\37\2\2J]\b\5\1\2KL\7\34\2\2L]\b\5\1\2MN\7\6\2\2NO\7\34"+
		"\2\2O]\b\5\1\2PQ\5\30\r\2QR\b\5\1\2R]\3\2\2\2ST\5\32\16\2TU\b\5\1\2U]"+
		"\3\2\2\2VW\5\20\t\2WX\b\5\1\2X]\3\2\2\2YZ\5\26\f\2Z[\b\5\1\2[]\3\2\2\2"+
		"\\C\3\2\2\2\\I\3\2\2\2\\K\3\2\2\2\\M\3\2\2\2\\P\3\2\2\2\\S\3\2\2\2\\V"+
		"\3\2\2\2\\Y\3\2\2\2]j\3\2\2\2^_\f\f\2\2_`\t\2\2\2`a\5\b\5\rab\b\5\1\2"+
		"bi\3\2\2\2cd\f\13\2\2de\t\3\2\2ef\5\b\5\ffg\b\5\1\2gi\3\2\2\2h^\3\2\2"+
		"\2hc\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\t\3\2\2\2lj\3\2\2\2mn\7\t"+
		"\2\2nz\b\6\1\2op\7\n\2\2pz\b\6\1\2qr\7\13\2\2rz\b\6\1\2st\7\f\2\2tz\b"+
		"\6\1\2uv\7\r\2\2vz\b\6\1\2wx\7\16\2\2xz\b\6\1\2ym\3\2\2\2yo\3\2\2\2yq"+
		"\3\2\2\2ys\3\2\2\2yu\3\2\2\2yw\3\2\2\2z\13\3\2\2\2{|\7\17\2\2|\u0080\b"+
		"\7\1\2}~\7\20\2\2~\u0080\b\7\1\2\177{\3\2\2\2\177}\3\2\2\2\u0080\r\3\2"+
		"\2\2\u0081\u0082\b\b\1\2\u0082\u0083\7\21\2\2\u0083\u008c\b\b\1\2\u0084"+
		"\u0085\7\22\2\2\u0085\u008c\b\b\1\2\u0086\u0087\5\b\5\2\u0087\u0088\5"+
		"\n\6\2\u0088\u0089\5\b\5\2\u0089\u008a\b\b\1\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0081\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0086\3\2\2\2\u008c\u0094\3\2"+
		"\2\2\u008d\u008e\f\3\2\2\u008e\u008f\5\f\7\2\u008f\u0090\5\16\b\4\u0090"+
		"\u0091\b\b\1\2\u0091\u0093\3\2\2\2\u0092\u008d\3\2\2\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\17\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0097\u0098\7\23\2\2\u0098\u0099\5\16\b\2\u0099\u009a\7\b\2\2"+
		"\u009a\u009b\5\6\4\2\u009b\u009c\b\t\1\2\u009c\21\3\2\2\2\u009d\u009e"+
		"\7\36\2\2\u009e\u009f\7\37\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\b\n\1"+
		"\2\u00a1\u00aa\3\2\2\2\u00a2\u00a3\7\36\2\2\u00a3\u00a4\7\37\2\2\u00a4"+
		"\u00a5\7\24\2\2\u00a5\u00a6\5\b\5\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8"+
		"\b\n\1\2\u00a8\u00aa\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9\u00a2\3\2\2\2\u00aa"+
		"\23\3\2\2\2\u00ab\u00ac\7\37\2\2\u00ac\u00ad\7\24\2\2\u00ad\u00ae\5\b"+
		"\5\2\u00ae\u00af\b\13\1\2\u00af\25\3\2\2\2\u00b0\u00b1\7\25\2\2\u00b1"+
		"\u00b5\7\32\2\2\u00b2\u00b4\5\6\4\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00bb\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00ba\7\32\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3"+
		"\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\7\26\2\2\u00bf\u00c0\b\f\1\2\u00c0\27\3\2\2"+
		"\2\u00c1\u00c2\7\27\2\2\u00c2\u00c3\5\b\5\2\u00c3\u00c4\7\b\2\2\u00c4"+
		"\u00c5\b\r\1\2\u00c5\31\3\2\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00c8\5\b\5"+
		"\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\b\16\1\2\u00ca\33\3\2\2\2\u00cb\u00cd"+
		"\t\4\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\35\3\2\2\2\21&,\64A\\hjy\177\u008b\u0094\u00a9\u00b5"+
		"\u00bb\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}