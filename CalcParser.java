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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, NEWLINE=29, WS=30, ENTIER=31, 
		FLOAT=32, TYPE=33, IDENTIFIANT=34, UNMATCH=35;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_instruction = 2, RULE_bloc = 3, 
		RULE_expression = 4, RULE_decl = 5, RULE_assignation = 6, RULE_operateur = 7, 
		RULE_logique = 8, RULE_condition = 9, RULE_boucle = 10, RULE_ifCondition = 11, 
		RULE_write = 12, RULE_read = 13, RULE_finInstruction = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "instruction", "bloc", "expression", "decl", "assignation", 
			"operateur", "logique", "condition", "boucle", "ifCondition", "write", 
			"read", "finInstruction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'/'", "'*'", "'+'", "'-'", "'('", "')'", "'='", 
			"'++'", "'--'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'&&'", 
			"'||'", "'true'", "'false'", "'!'", "'while('", "'if('", "'else'", "'write('", 
			"'read('", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NEWLINE", "WS", "ENTIER", "FLOAT", "TYPE", 
			"IDENTIFIANT", "UNMATCH"
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
			setState(30);
			calcul();
			setState(31);
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
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(33);
				((CalculContext)_localctx).decl = decl();
				 _localctx.code += ((CalculContext)_localctx).decl.code; 
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(41);
				match(NEWLINE);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(47);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(54);
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
		public WriteContext write;
		public ReadContext read;
		public BoucleContext boucle;
		public BlocContext bloc;
		public IfConditionContext ifCondition;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
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
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((InstructionContext)_localctx).expression = expression(0);
				setState(58);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((InstructionContext)_localctx).assignation = assignation();
				setState(62);
				finInstruction();
				 
						    ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				((InstructionContext)_localctx).write = write();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).write.code;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				((InstructionContext)_localctx).read = read();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).read.code;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				((InstructionContext)_localctx).boucle = boucle();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).boucle.code;
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				((InstructionContext)_localctx).bloc = bloc();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bloc.code;
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				((InstructionContext)_localctx).ifCondition = ifCondition();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).ifCondition.code;
				        
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
		enterRule(_localctx, 6, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__0);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				match(NEWLINE);
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(88);
				((BlocContext)_localctx).instruction = instruction();
				 _localctx.code += ((BlocContext)_localctx).instruction.code; 
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__1);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(97);
				match(NEWLINE);
				}
				}
				setState(102);
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

	public static class ExpressionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext a;
		public ExpressionContext c;
		public ExpressionContext e;
		public Token IDENTIFIANT;
		public Token ENTIER;
		public Token f;
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(104);
				match(T__6);
				setState(105);
				((ExpressionContext)_localctx).e = expression(0);
				setState(106);
				match(T__7);
				((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).e.code;
				}
				break;
			case IDENTIFIANT:
				{
				setState(109);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				            AdresseType var = tableSymboles.getAdresseType((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				            ((ExpressionContext)_localctx).code =  "PUSHG "+var.adresse+"\n";
				        
				}
				break;
			case ENTIER:
				{
				setState(111);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) +"\n";
				        
				}
				break;
			case T__5:
				{
				setState(113);
				match(T__5);
				setState(114);
				((ExpressionContext)_localctx).f = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI 0\n";
				            _localctx.code += "PUSHI "+(((ExpressionContext)_localctx).f!=null?((ExpressionContext)_localctx).f.getText():null)+"\n";
				            _localctx.code += "SUB\n";
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(119);
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
						setState(120);
						((ExpressionContext)_localctx).b = expression(7);

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
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						((ExpressionContext)_localctx).d = expression(6);

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
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 10, RULE_decl);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(134);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(135);
				finInstruction();

				            ((DeclContext)_localctx).code =  "PUSHI 0\n";
				            tableSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(139);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(140);
				match(T__8);
				setState(141);
				((DeclContext)_localctx).expression = expression(0);
				setState(142);
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
		public Token operator;
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
		enterRule(_localctx, 12, RULE_assignation);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(148);
				match(T__8);
				setState(149);
				((AssignationContext)_localctx).expression = expression(0);

				            AdresseType at = tableSymboles.getAdresseType((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null)); //On récupère l'@ de la variable X
				            ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code; //PUSHI x (qui peut aussi être le code de l'expression)
				            _localctx.code += "STOREG "+at.adresse+"\n"; //On stocke la valeur d'expression à l'@ de X
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(153);
				((AssignationContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
					((AssignationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				            AdresseType at = tableSymboles.getAdresseType((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  "PUSHG "+at.adresse+"\n";
				            if((((AssignationContext)_localctx).operator!=null?((AssignationContext)_localctx).operator.getText():null).equals("++")){
				                _localctx.code += "PUSHI 1\n";
				                _localctx.code += "ADD\n";
				                _localctx.code += "STOREG "+at.adresse+"\n"; //On stocke la valeur d'expression à l'@ de X
				            }else{
				                _localctx.code += "PUSHI 1\n";
				                _localctx.code += "SUB\n";
				                _localctx.code += "STOREG "+at.adresse+"\n"; //On stocke la valeur d'expression à l'@ de X
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
		enterRule(_localctx, 14, RULE_operateur);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__11);
				 ((OperateurContext)_localctx).code =  "SUP\n"; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__12);
				 ((OperateurContext)_localctx).code =  "SUPEQ\n"; 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(T__13);
				 ((OperateurContext)_localctx).code =  "INF\n"; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(T__14);
				 ((OperateurContext)_localctx).code =  "INFEQ\n"; 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(T__15);
				 ((OperateurContext)_localctx).code =  "EQUAL\n"; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				match(T__16);
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
		enterRule(_localctx, 16, RULE_logique);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__17);
				 ((LogiqueContext)_localctx).code =  "&&"; 
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__18);
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
		public ConditionContext condition;
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
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public LogiqueContext logique() {
			return getRuleContext(LogiqueContext.class,0);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				{
				setState(178);
				match(T__19);
				}

				            ((ConditionContext)_localctx).code =  "PUSHI 1\n";
				        
				}
				break;
			case 2:
				{
				{
				setState(180);
				match(T__20);
				}

				            ((ConditionContext)_localctx).code =  "PUSHI 0\n";
				        
				}
				break;
			case 3:
				{
				setState(182);
				((ConditionContext)_localctx).a = expression(0);
				setState(183);
				((ConditionContext)_localctx).operateur = operateur();
				setState(184);
				((ConditionContext)_localctx).b = expression(0);

				            String boucle1 = getNewLabel();
				            String exit = getNewLabel();
				            ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code;
				            _localctx.code += ((ConditionContext)_localctx).b.code;
				            _localctx.code += ((ConditionContext)_localctx).operateur.code;
				            _localctx.code += "JUMPF "+boucle1+"\n";
				            _localctx.code += "PUSHI 1\n";
				            _localctx.code += "JUMP "+exit+"\n";
				            _localctx.code += "LABEL "+ boucle1 + "\n";
				            _localctx.code += "PUSHI 0\n";
				            _localctx.code += "LABEL "+exit+"\n";

				        
				}
				break;
			case 4:
				{
				setState(187);
				match(T__21);
				setState(188);
				((ConditionContext)_localctx).condition = condition(2);

				            String boucle1 = getNewLabel();
				            String exit = getNewLabel();

				            ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).condition.code;
				            _localctx.code += "PUSHI 0\n"; //On test si la négation de condition est égale à 0 (false)
				            _localctx.code += "EQUAL \n";
				            _localctx.code += "JUMPF "+boucle1+"\n";
				            _localctx.code += "PUSHI 1\n";
				            _localctx.code += "JUMP "+exit+"\n";
				            _localctx.code += "LABEL "+ boucle1 + "\n";
				            _localctx.code += "PUSHI 0\n"; //false
				            _localctx.code += "LABEL "+exit+"\n";
				        
				}
				break;
			case 5:
				{
				setState(191);
				match(T__6);
				setState(192);
				((ConditionContext)_localctx).condition = condition(0);
				setState(193);
				match(T__7);
				 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).condition.code; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
					setState(198);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(199);
					((ConditionContext)_localctx).logique = logique();
					setState(200);
					((ConditionContext)_localctx).d = ((ConditionContext)_localctx).condition = condition(4);

					                      String boucle1 = getNewLabel();
					                      String exit = getNewLabel();

					                      if(((ConditionContext)_localctx).logique.code.equals("&&")){
					                          ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).c.code; //le code c renvoie en dernier 1 ou 0
					                          _localctx.code += "PUSHI 1\n";
					                          _localctx.code += "EQUAL\n";
					                          _localctx.code += "JUMPF "+boucle1+"\n";
					                          _localctx.code += ((ConditionContext)_localctx).d.code;
					                          _localctx.code += "PUSHI 1\n";
					                          _localctx.code += "EQUAL\n";
					                          _localctx.code += "JUMPF "+boucle1+"\n";
					                          _localctx.code += "PUSHI 1\n";
					                          _localctx.code += "JUMP "+exit+"\n"; 
					                      }else{ //OPERATEUR ||
					                          String or = getNewLabel();
					                          
					                          //on test le premier
					                          ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).c.code;
					                          _localctx.code += "PUSHI 1\n";
					                          _localctx.code += "EQUAL\n";
					                          _localctx.code += "JUMPF "+or+"\n"; //Si c'est faux on test la deuxième condition
					                          _localctx.code += "PUSHI 1\n"; //Sinon on s'arrête là et on renvoie 1
					                          _localctx.code += "JUMP "+exit+"\n";

					                          //on test le second
					                          _localctx.code += "LABEL "+or+"\n";
					                          _localctx.code += ((ConditionContext)_localctx).d.code;
					                          _localctx.code += "PUSHI 1\n";
					                          _localctx.code += "EQUAL\n"; //si c'est vrai on renvoie 1
					                          _localctx.code += "JUMPF "+boucle1+"\n"; //sinon on renvoie 0
					                          _localctx.code += "PUSHI 1\n";
					                          _localctx.code += "JUMP "+exit+"\n"; 
					                      }
					                      _localctx.code += "LABEL "+ boucle1 + "\n";
					                      _localctx.code += "PUSHI 0\n"; //false
					                      _localctx.code += "LABEL "+exit+"\n";
					                  
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 20, RULE_boucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__22);
			setState(209);
			((BoucleContext)_localctx).condition = condition(0);
			setState(210);
			match(T__7);
			setState(211);
			((BoucleContext)_localctx).a = instruction();

			            String boucle1 = getNewLabel();
			            String boucle2 = getNewLabel();
			            
			            ((BoucleContext)_localctx).code =  "LABEL " + boucle1 + "\n";
			            _localctx.code += ((BoucleContext)_localctx).condition.code;
			            _localctx.code += "JUMPF "+ boucle2 + "\n";
			            _localctx.code += ((BoucleContext)_localctx).a.code;
			            _localctx.code += "JUMP "+ boucle1 + "\n";
			            _localctx.code += "LABEL "+ boucle2 + "\n";
			        
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

	public static class IfConditionContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public InstructionContext a;
		public InstructionContext b;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitIfCondition(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifCondition);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(T__23);
				setState(215);
				((IfConditionContext)_localctx).condition = condition(0);
				setState(216);
				match(T__7);
				setState(217);
				((IfConditionContext)_localctx).a = instruction();
				setState(218);
				match(T__24);
				setState(219);
				((IfConditionContext)_localctx).b = instruction();

				            String elseArea = getNewLabel();
				            String exit = getNewLabel();

				            ((IfConditionContext)_localctx).code =  ((IfConditionContext)_localctx).condition.code;
				            _localctx.code += "JUMPF "+elseArea + "\n";
				            _localctx.code += ((IfConditionContext)_localctx).a.code;
				            _localctx.code += "JUMP "+exit+"\n";
				            _localctx.code += "LABEL "+elseArea + "\n";
				            _localctx.code += ((IfConditionContext)_localctx).b.code;
				            _localctx.code += "JUMP "+exit+"\n"; 
				            _localctx.code += "LABEL "+exit+"\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(T__23);
				setState(223);
				((IfConditionContext)_localctx).condition = condition(0);
				setState(224);
				match(T__7);
				setState(225);
				((IfConditionContext)_localctx).a = instruction();

				            String exit = getNewLabel();

				            ((IfConditionContext)_localctx).code =  ((IfConditionContext)_localctx).condition.code;
				            _localctx.code += "JUMPF "+exit + "\n";
				            _localctx.code += ((IfConditionContext)_localctx).a.code;
				            _localctx.code += "JUMP "+exit+"\n";
				            _localctx.code += "LABEL "+exit+"\n";
				        
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
		enterRule(_localctx, 24, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__25);
			setState(231);
			((WriteContext)_localctx).expression = expression(0);
			setState(232);
			match(T__7);

			            ((WriteContext)_localctx).code =  ((WriteContext)_localctx).expression.code;
			            _localctx.code += "WRITE\n";
			            _localctx.code += "POP\n";
			        
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
		enterRule(_localctx, 26, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__26);
			setState(236);
			((ReadContext)_localctx).expression = expression(0);
			setState(237);
			match(T__7);

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
		enterRule(_localctx, 28, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(240);
					_la = _input.LA(1);
					if ( !(_la==T__27 || _la==NEWLINE) ) {
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
				setState(243); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 9:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\3"+
		"\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4S\n\4\3"+
		"\5\3\5\6\5W\n\5\r\5\16\5X\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5\3\5\3\5"+
		"\7\5e\n\5\f\5\16\5h\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6w\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0083\n\6"+
		"\f\6\16\6\u0086\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0094\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\n\3\n\3\n\3\n\5\n"+
		"\u00b2\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c7\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00ce\n\13\f\13\16\13\u00d1\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e7\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u00f4\n\20"+
		"\r\20\16\20\u00f5\3\20\2\4\n\24\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\6\3\2\5\6\3\2\7\b\3\2\f\r\3\2\36\37\2\u0108\2 \3\2\2\2\4(\3\2\2"+
		"\2\6R\3\2\2\2\bT\3\2\2\2\nv\3\2\2\2\f\u0093\3\2\2\2\16\u009d\3\2\2\2\20"+
		"\u00ab\3\2\2\2\22\u00b1\3\2\2\2\24\u00c6\3\2\2\2\26\u00d2\3\2\2\2\30\u00e6"+
		"\3\2\2\2\32\u00e8\3\2\2\2\34\u00ed\3\2\2\2\36\u00f3\3\2\2\2 !\5\4\3\2"+
		"!\"\7\2\2\3\"\3\3\2\2\2#$\5\f\7\2$%\b\3\1\2%\'\3\2\2\2&#\3\2\2\2\'*\3"+
		"\2\2\2(&\3\2\2\2()\3\2\2\2).\3\2\2\2*(\3\2\2\2+-\7\37\2\2,+\3\2\2\2-\60"+
		"\3\2\2\2.,\3\2\2\2./\3\2\2\2/\66\3\2\2\2\60.\3\2\2\2\61\62\5\6\4\2\62"+
		"\63\b\3\1\2\63\65\3\2\2\2\64\61\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67"+
		"\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\b\3\1\2:\5\3\2\2\2;<\5\n\6\2<=\5\36"+
		"\20\2=>\b\4\1\2>S\3\2\2\2?@\5\16\b\2@A\5\36\20\2AB\b\4\1\2BS\3\2\2\2C"+
		"D\5\32\16\2DE\b\4\1\2ES\3\2\2\2FG\5\34\17\2GH\b\4\1\2HS\3\2\2\2IJ\5\26"+
		"\f\2JK\b\4\1\2KS\3\2\2\2LM\5\b\5\2MN\b\4\1\2NS\3\2\2\2OP\5\30\r\2PQ\b"+
		"\4\1\2QS\3\2\2\2R;\3\2\2\2R?\3\2\2\2RC\3\2\2\2RF\3\2\2\2RI\3\2\2\2RL\3"+
		"\2\2\2RO\3\2\2\2S\7\3\2\2\2TV\7\3\2\2UW\7\37\2\2VU\3\2\2\2WX\3\2\2\2X"+
		"V\3\2\2\2XY\3\2\2\2Y_\3\2\2\2Z[\5\6\4\2[\\\b\5\1\2\\^\3\2\2\2]Z\3\2\2"+
		"\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bf\7\4\2\2ce\7\37"+
		"\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\t\3\2\2\2hf\3\2\2\2ij\b"+
		"\6\1\2jk\7\t\2\2kl\5\n\6\2lm\7\n\2\2mn\b\6\1\2nw\3\2\2\2op\7$\2\2pw\b"+
		"\6\1\2qr\7!\2\2rw\b\6\1\2st\7\b\2\2tu\7!\2\2uw\b\6\1\2vi\3\2\2\2vo\3\2"+
		"\2\2vq\3\2\2\2vs\3\2\2\2w\u0084\3\2\2\2xy\f\b\2\2yz\t\2\2\2z{\5\n\6\t"+
		"{|\b\6\1\2|\u0083\3\2\2\2}~\f\7\2\2~\177\t\3\2\2\177\u0080\5\n\6\b\u0080"+
		"\u0081\b\6\1\2\u0081\u0083\3\2\2\2\u0082x\3\2\2\2\u0082}\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\13\3\2\2"+
		"\2\u0086\u0084\3\2\2\2\u0087\u0088\7#\2\2\u0088\u0089\7$\2\2\u0089\u008a"+
		"\5\36\20\2\u008a\u008b\b\7\1\2\u008b\u0094\3\2\2\2\u008c\u008d\7#\2\2"+
		"\u008d\u008e\7$\2\2\u008e\u008f\7\13\2\2\u008f\u0090\5\n\6\2\u0090\u0091"+
		"\5\36\20\2\u0091\u0092\b\7\1\2\u0092\u0094\3\2\2\2\u0093\u0087\3\2\2\2"+
		"\u0093\u008c\3\2\2\2\u0094\r\3\2\2\2\u0095\u0096\7$\2\2\u0096\u0097\7"+
		"\13\2\2\u0097\u0098\5\n\6\2\u0098\u0099\b\b\1\2\u0099\u009e\3\2\2\2\u009a"+
		"\u009b\7$\2\2\u009b\u009c\t\4\2\2\u009c\u009e\b\b\1\2\u009d\u0095\3\2"+
		"\2\2\u009d\u009a\3\2\2\2\u009e\17\3\2\2\2\u009f\u00a0\7\16\2\2\u00a0\u00ac"+
		"\b\t\1\2\u00a1\u00a2\7\17\2\2\u00a2\u00ac\b\t\1\2\u00a3\u00a4\7\20\2\2"+
		"\u00a4\u00ac\b\t\1\2\u00a5\u00a6\7\21\2\2\u00a6\u00ac\b\t\1\2\u00a7\u00a8"+
		"\7\22\2\2\u00a8\u00ac\b\t\1\2\u00a9\u00aa\7\23\2\2\u00aa\u00ac\b\t\1\2"+
		"\u00ab\u009f\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a5"+
		"\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\21\3\2\2\2\u00ad"+
		"\u00ae\7\24\2\2\u00ae\u00b2\b\n\1\2\u00af\u00b0\7\25\2\2\u00b0\u00b2\b"+
		"\n\1\2\u00b1\u00ad\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\23\3\2\2\2\u00b3"+
		"\u00b4\b\13\1\2\u00b4\u00b5\7\26\2\2\u00b5\u00c7\b\13\1\2\u00b6\u00b7"+
		"\7\27\2\2\u00b7\u00c7\b\13\1\2\u00b8\u00b9\5\n\6\2\u00b9\u00ba\5\20\t"+
		"\2\u00ba\u00bb\5\n\6\2\u00bb\u00bc\b\13\1\2\u00bc\u00c7\3\2\2\2\u00bd"+
		"\u00be\7\30\2\2\u00be\u00bf\5\24\13\4\u00bf\u00c0\b\13\1\2\u00c0\u00c7"+
		"\3\2\2\2\u00c1\u00c2\7\t\2\2\u00c2\u00c3\5\24\13\2\u00c3\u00c4\7\n\2\2"+
		"\u00c4\u00c5\b\13\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00b3\3\2\2\2\u00c6\u00b6"+
		"\3\2\2\2\u00c6\u00b8\3\2\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c7"+
		"\u00cf\3\2\2\2\u00c8\u00c9\f\5\2\2\u00c9\u00ca\5\22\n\2\u00ca\u00cb\5"+
		"\24\13\6\u00cb\u00cc\b\13\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00c8\3\2\2\2"+
		"\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\25"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\31\2\2\u00d3\u00d4\5\24\13"+
		"\2\u00d4\u00d5\7\n\2\2\u00d5\u00d6\5\6\4\2\u00d6\u00d7\b\f\1\2\u00d7\27"+
		"\3\2\2\2\u00d8\u00d9\7\32\2\2\u00d9\u00da\5\24\13\2\u00da\u00db\7\n\2"+
		"\2\u00db\u00dc\5\6\4\2\u00dc\u00dd\7\33\2\2\u00dd\u00de\5\6\4\2\u00de"+
		"\u00df\b\r\1\2\u00df\u00e7\3\2\2\2\u00e0\u00e1\7\32\2\2\u00e1\u00e2\5"+
		"\24\13\2\u00e2\u00e3\7\n\2\2\u00e3\u00e4\5\6\4\2\u00e4\u00e5\b\r\1\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00d8\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e7\31\3\2\2"+
		"\2\u00e8\u00e9\7\34\2\2\u00e9\u00ea\5\n\6\2\u00ea\u00eb\7\n\2\2\u00eb"+
		"\u00ec\b\16\1\2\u00ec\33\3\2\2\2\u00ed\u00ee\7\35\2\2\u00ee\u00ef\5\n"+
		"\6\2\u00ef\u00f0\7\n\2\2\u00f0\u00f1\b\17\1\2\u00f1\35\3\2\2\2\u00f2\u00f4"+
		"\t\5\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\37\3\2\2\2\24(.\66RX_fv\u0082\u0084\u0093\u009d\u00ab"+
		"\u00b1\u00c6\u00cf\u00e6\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}