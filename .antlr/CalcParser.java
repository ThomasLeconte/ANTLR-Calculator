// Generated from d:\Licence 3\Semestre 2\language compilation\TP\TP5\Calc.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, NEWLINE=31, 
		WS=32, RETURN=33, ENTIER=34, FLOAT=35, TYPE=36, IDENTIFIANT=37, UNMATCH=38;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_instruction = 2, RULE_fonction = 3, 
		RULE_params = 4, RULE_args = 5, RULE_bloc = 6, RULE_expression = 7, RULE_decl = 8, 
		RULE_assignation = 9, RULE_operateur = 10, RULE_logique = 11, RULE_condition = 12, 
		RULE_boucle = 13, RULE_ifCondition = 14, RULE_write = 15, RULE_read = 16, 
		RULE_finInstruction = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "instruction", "fonction", "params", "args", "bloc", 
			"expression", "decl", "assignation", "operateur", "logique", "condition", 
			"boucle", "ifCondition", "write", "read", "finInstruction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'{'", "'}'", "'/'", "'*'", "'+'", "'-'", 
			"'='", "'++'", "'--'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", 
			"'&&'", "'||'", "'true'", "'false'", "'!'", "'while('", "'for('", "';'", 
			"'if('", "'else'", "'write('", "'read('", null, null, "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NEWLINE", "WS", "RETURN", 
			"ENTIER", "FLOAT", "TYPE", "IDENTIFIANT", "UNMATCH"
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


	            private TablesSymboles tableSymboles = new TablesSymboles();
	            private int _cur_label = 1;
	            /** générateur de nom d'étiquettes pour les boucles */
	            private String getNewLabel() { return "B" +(_cur_label++); }
	            private boolean isLocalAdress(AdresseType at){
	                if(at.adresse >= 0){
	                    return false;
	                }else{
	                    return true;
	                }
	            }
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
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			calcul();
			setState(37);
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
		public FonctionContext fonction;
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
		public List<FonctionContext> fonction() {
			return getRuleContexts(FonctionContext.class);
		}
		public FonctionContext fonction(int i) {
			return getRuleContext(FonctionContext.class,i);
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
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					((CalculContext)_localctx).decl = decl();
					 _localctx.code += ((CalculContext)_localctx).decl.code; 
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			 _localctx.code += "JUMP Main\n"; 
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					match(NEWLINE);
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(54);
				((CalculContext)_localctx).fonction = fonction();
				 _localctx.code += ((CalculContext)_localctx).fonction.code; 
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(62);
				match(NEWLINE);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "LABEL Main\n"; 
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << RETURN) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(69);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(76);
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
		public TerminalNode RETURN() { return getToken(CalcParser.RETURN, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((InstructionContext)_localctx).expression = expression(0);
				setState(80);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				((InstructionContext)_localctx).assignation = assignation();
				setState(84);
				finInstruction();
				 
						    ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				((InstructionContext)_localctx).write = write();
				setState(88);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).write.code;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				((InstructionContext)_localctx).read = read();
				setState(92);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).read.code;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				((InstructionContext)_localctx).boucle = boucle();
				setState(96);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).boucle.code;
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				((InstructionContext)_localctx).bloc = bloc();
				setState(100);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bloc.code;
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				((InstructionContext)_localctx).ifCondition = ifCondition();
				setState(104);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).ifCondition.code;
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(107);
				match(RETURN);
				setState(108);
				expression(0);
				setState(109);
				finInstruction();

				        
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

	public static class FonctionContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public BlocContext bloc;
		public TerminalNode TYPE() { return getToken(CalcParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalcParser.IDENTIFIANT, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonction; }
	}

	public final FonctionContext fonction() throws RecognitionException {
		FonctionContext _localctx = new FonctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fonction);
		 ((FonctionContext)_localctx).code =  new String(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((FonctionContext)_localctx).TYPE = match(TYPE);

			            _localctx.code += "PUSHI 0\n";
			        
			setState(116);
			((FonctionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(117);
			match(T__0);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(118);
				params();
				}
			}

			setState(121);
			match(T__1);

			            tableSymboles.putVar((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null), (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			            AdresseType at = tableSymboles.getAdresseType((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null));
			            if(isLocalAdress(at)){
			                _localctx.code += "STOREL "+at.adresse+"\n";
			            }else{
			                _localctx.code += "STOREG "+at.adresse+"\n";
			            }

			            tableSymboles.newTableLocale();
			            _localctx.code += "LABEL "+(((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null)+"\n";
			            //On déclare la fonction pour pouvoir jump dessus plus tard
			            tableSymboles.newFunction((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null), (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			        
			setState(123);
			((FonctionContext)_localctx).bloc = bloc();

			            _localctx.code += ((FonctionContext)_localctx).bloc.code;
			            if(isLocalAdress(at)){
			                _localctx.code += "STOREL "+at.adresse+"\n";
			            }else{
			                _localctx.code += "STOREG "+at.adresse+"\n";
			            }
			            _localctx.code += "RETURN\n";
			            _localctx.code += "RETURN\n";
			        
			}
			_ctx.stop = _input.LT(-1);
			 tableSymboles.dropTableLocale(); 
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

	public static class ParamsContext extends ParserRuleContext {
		public Token TYPE;
		public Token IDENTIFIANT;
		public List<TerminalNode> TYPE() { return getTokens(CalcParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CalcParser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIANT() { return getTokens(CalcParser.IDENTIFIANT); }
		public TerminalNode IDENTIFIANT(int i) {
			return getToken(CalcParser.IDENTIFIANT, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((ParamsContext)_localctx).TYPE = match(TYPE);
			setState(127);
			((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

			            tableSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null)); //On sauvegarde la variable
			        
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(129);
				match(T__2);
				setState(130);
				((ParamsContext)_localctx).TYPE = match(TYPE);
				setState(131);
				((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				                tableSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null)); //On sauvegarde la variable
				                // code java gérant une variable locale (argi)
				            
				}
				}
				setState(137);
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

	public static class ArgsContext extends ParserRuleContext {
		public String code;
		public int size;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		 ((ArgsContext)_localctx).code =  new String(); ((ArgsContext)_localctx).size =  0; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
				{
				setState(138);
				((ArgsContext)_localctx).expression = expression(0);
				 
				        _localctx.code += ((ArgsContext)_localctx).expression.code;
				    
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(140);
					match(T__2);
					setState(141);
					((ArgsContext)_localctx).expression = expression(0);
					 
					        _localctx.code += ((ArgsContext)_localctx).expression.code;
					    
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__3);
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152);
				match(NEWLINE);
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << RETURN) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(157);
				((BlocContext)_localctx).instruction = instruction();
				 _localctx.code += ((BlocContext)_localctx).instruction.code; 
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(T__4);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					match(NEWLINE);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public ArgsContext args;
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
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(173);
				match(T__0);
				setState(174);
				((ExpressionContext)_localctx).e = expression(0);
				setState(175);
				match(T__1);
				((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).e.code;
				}
				break;
			case 2:
				{
				setState(178);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				            AdresseType var = tableSymboles.getAdresseType((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				            if(isLocalAdress(var)){
				                ((ExpressionContext)_localctx).code =  "PUSHL "+var.adresse+"\n";
				            }else{
				                ((ExpressionContext)_localctx).code =  "PUSHG "+var.adresse+"\n";
				            }

				        
				}
				break;
			case 3:
				{
				setState(180);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) +"\n";
				        
				}
				break;
			case 4:
				{
				setState(182);
				match(T__8);
				setState(183);
				((ExpressionContext)_localctx).f = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI 0\n";
				            _localctx.code += "PUSHI "+(((ExpressionContext)_localctx).f!=null?((ExpressionContext)_localctx).f.getText():null)+"\n";
				            _localctx.code += "SUB\n";
				        
				}
				break;
			case 5:
				{
				setState(185);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(186);
				match(T__0);
				setState(187);
				((ExpressionContext)_localctx).args = args();
				setState(188);
				match(T__1);

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).args.code;
				            String var = tableSymboles.getFunction((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null)); //retourne le type de la fonction
				            _localctx.code += "CALL "+(((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null)+"\n";
				        
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
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(194);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						((ExpressionContext)_localctx).b = expression(8);

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
						setState(198);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(199);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(200);
						((ExpressionContext)_localctx).d = expression(7);

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
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decl);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(209);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(210);
				finInstruction();

				            ((DeclContext)_localctx).code =  "PUSHI 0\n";
				            tableSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(214);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(215);
				match(T__9);
				setState(216);
				((DeclContext)_localctx).expression = expression(0);
				setState(217);
				finInstruction();

				            ((DeclContext)_localctx).code =  "PUSHI 0\n";
				            _localctx.code += ((DeclContext)_localctx).expression.code; //PUSHI x
				            tableSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null)); //On sauvegarde la variable
				            AdresseType at = tableSymboles.getAdresseType((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null));
				            if(isLocalAdress(at)){
				                _localctx.code += "STOREL "+at.adresse+"\n";
				            }else{
				                _localctx.code += "STOREG "+at.adresse+"\n";
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
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignation);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(223);
				match(T__9);
				setState(224);
				((AssignationContext)_localctx).expression = expression(0);

				            AdresseType at = tableSymboles.getAdresseType((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null)); //On récupère l'@ de la variable X
				            ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code; //PUSHI x (qui peut aussi être le code de l'expression)
				            if(isLocalAdress(at)){
				                _localctx.code += "STOREL "+at.adresse+"\n"; //On stocke la valeur d'expression à l'@ de X
				            }else{
				                _localctx.code += "STOREG "+at.adresse+"\n"; //On stocke la valeur d'expression à l'@ de X
				            }

				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(228);
				((AssignationContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
					((AssignationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				            AdresseType at = tableSymboles.getAdresseType((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            if(isLocalAdress(at)){
				                ((AssignationContext)_localctx).code =  "PUSHL "+at.adresse+"\n";
				            }else{
				                ((AssignationContext)_localctx).code =  "PUSHG "+at.adresse+"\n";
				            }
				            ((AssignationContext)_localctx).code =  "PUSHG "+at.adresse+"\n";
				            if((((AssignationContext)_localctx).operator!=null?((AssignationContext)_localctx).operator.getText():null).equals("++")){
				                _localctx.code += "PUSHI 1\n";
				                _localctx.code += "ADD\n";
				            }else{
				                _localctx.code += "PUSHI 1\n";
				                _localctx.code += "SUB\n";
				            }
				            if(isLocalAdress(at)){
				                _localctx.code += "STOREL "+at.adresse+"\n"; //On stocke la valeur d'expression à l'@ de X
				            }else{
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
	}

	public final OperateurContext operateur() throws RecognitionException {
		OperateurContext _localctx = new OperateurContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operateur);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(T__12);
				 ((OperateurContext)_localctx).code =  "SUP\n"; 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(T__13);
				 ((OperateurContext)_localctx).code =  "SUPEQ\n"; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(T__14);
				 ((OperateurContext)_localctx).code =  "INF\n"; 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				match(T__15);
				 ((OperateurContext)_localctx).code =  "INFEQ\n"; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				match(T__16);
				 ((OperateurContext)_localctx).code =  "EQUAL\n"; 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(T__17);
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
	}

	public final LogiqueContext logique() throws RecognitionException {
		LogiqueContext _localctx = new LogiqueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logique);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__18);
				 ((LogiqueContext)_localctx).code =  "&&"; 
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__19);
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
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				{
				setState(253);
				match(T__20);
				}

				            ((ConditionContext)_localctx).code =  "PUSHI 1\n";
				        
				}
				break;
			case 2:
				{
				{
				setState(255);
				match(T__21);
				}

				            ((ConditionContext)_localctx).code =  "PUSHI 0\n";
				        
				}
				break;
			case 3:
				{
				setState(257);
				((ConditionContext)_localctx).a = expression(0);
				setState(258);
				((ConditionContext)_localctx).operateur = operateur();
				setState(259);
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
				setState(262);
				match(T__22);
				setState(263);
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
				setState(266);
				match(T__0);
				setState(267);
				((ConditionContext)_localctx).condition = condition(0);
				setState(268);
				match(T__1);
				 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).condition.code; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
					setState(273);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(274);
					((ConditionContext)_localctx).logique = logique();
					setState(275);
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
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public AssignationContext c;
		public AssignationContext b;
		public InstructionContext instruction;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<AssignationContext> assignation() {
			return getRuleContexts(AssignationContext.class);
		}
		public AssignationContext assignation(int i) {
			return getRuleContext(AssignationContext.class,i);
		}
		public BoucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucle; }
	}

	public final BoucleContext boucle() throws RecognitionException {
		BoucleContext _localctx = new BoucleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boucle);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(T__23);
				setState(284);
				((BoucleContext)_localctx).condition = condition(0);
				setState(285);
				match(T__1);
				setState(286);
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
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(T__24);
				setState(290);
				((BoucleContext)_localctx).c = assignation();
				setState(291);
				match(T__25);
				setState(292);
				((BoucleContext)_localctx).condition = condition(0);
				setState(293);
				match(T__25);
				setState(294);
				((BoucleContext)_localctx).b = assignation();
				setState(295);
				match(T__1);
				setState(296);
				((BoucleContext)_localctx).instruction = instruction();

				            String debutFor = getNewLabel();
				            String exit = getNewLabel();

				            _localctx.code += ((BoucleContext)_localctx).c.code;
				            ((BoucleContext)_localctx).code =  "LABEL " + debutFor + "\n";
				            _localctx.code += ((BoucleContext)_localctx).condition.code;
				            _localctx.code += "JUMPF "+ exit + "\n";
				            _localctx.code += ((BoucleContext)_localctx).instruction.code;
				            _localctx.code += ((BoucleContext)_localctx).b.code;
				            _localctx.code += "JUMP "+ debutFor + "\n";
				            _localctx.code += "LABEL "+ exit + "\n";
				        
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
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifCondition);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(T__26);
				setState(302);
				((IfConditionContext)_localctx).condition = condition(0);
				setState(303);
				match(T__1);
				setState(304);
				((IfConditionContext)_localctx).a = instruction();
				setState(305);
				match(T__27);
				setState(306);
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
				setState(309);
				match(T__26);
				setState(310);
				((IfConditionContext)_localctx).condition = condition(0);
				setState(311);
				match(T__1);
				setState(312);
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
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__28);
			setState(318);
			((WriteContext)_localctx).expression = expression(0);
			setState(319);
			match(T__1);

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
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__29);
			setState(323);
			((ReadContext)_localctx).expression = expression(0);
			setState(324);
			match(T__1);

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
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(327);
					_la = _input.LA(1);
					if ( !(_la==T__25 || _la==NEWLINE) ) {
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
				setState(330); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 12:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u014f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\7"+
		"\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\7\3"+
		"B\n\3\f\3\16\3E\13\3\3\3\3\3\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4s\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\5\5z\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u0088\n\6\f\6\16\6\u008b\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u0093\n\7\f\7\16\7\u0096\13\7\5\7\u0098\n\7\3\b\3\b\6\b\u009c\n\b\r\b"+
		"\16\b\u009d\3\b\3\b\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6\13\b\3\b\3\b\7\b"+
		"\u00aa\n\b\f\b\16\b\u00ad\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c2\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u00ce\n\t\f\t\16\t\u00d1\13\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00df\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00e9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00f7\n\f\3\r\3\r\3\r\3\r\5\r\u00fd\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0112\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u0119\n\16\f"+
		"\16\16\16\u011c\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u012e\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u013e\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\6\23\u014b\n\23\r\23\16"+
		"\23\u014c\3\23\2\4\20\32\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$\2\6\3\2\b\t\3\2\n\13\3\2\r\16\4\2\34\34!!\2\u0165\2&\3\2\2\2\4.\3\2"+
		"\2\2\6r\3\2\2\2\bt\3\2\2\2\n\u0080\3\2\2\2\f\u0097\3\2\2\2\16\u0099\3"+
		"\2\2\2\20\u00c1\3\2\2\2\22\u00de\3\2\2\2\24\u00e8\3\2\2\2\26\u00f6\3\2"+
		"\2\2\30\u00fc\3\2\2\2\32\u0111\3\2\2\2\34\u012d\3\2\2\2\36\u013d\3\2\2"+
		"\2 \u013f\3\2\2\2\"\u0144\3\2\2\2$\u014a\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3"+
		"(\3\3\2\2\2)*\5\22\n\2*+\b\3\1\2+-\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2"+
		"\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\65\b\3\1\2\62\64\7!\2\2\63\62"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66=\3\2\2\2\67\65\3"+
		"\2\2\289\5\b\5\29:\b\3\1\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3"+
		"\2\2\2>C\3\2\2\2?=\3\2\2\2@B\7!\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3"+
		"\2\2\2DF\3\2\2\2EC\3\2\2\2FL\b\3\1\2GH\5\6\4\2HI\b\3\1\2IK\3\2\2\2JG\3"+
		"\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\b\3\1\2P\5"+
		"\3\2\2\2QR\5\20\t\2RS\5$\23\2ST\b\4\1\2Ts\3\2\2\2UV\5\24\13\2VW\5$\23"+
		"\2WX\b\4\1\2Xs\3\2\2\2YZ\5 \21\2Z[\5$\23\2[\\\b\4\1\2\\s\3\2\2\2]^\5\""+
		"\22\2^_\5$\23\2_`\b\4\1\2`s\3\2\2\2ab\5\34\17\2bc\5$\23\2cd\b\4\1\2ds"+
		"\3\2\2\2ef\5\16\b\2fg\5$\23\2gh\b\4\1\2hs\3\2\2\2ij\5\36\20\2jk\5$\23"+
		"\2kl\b\4\1\2ls\3\2\2\2mn\7#\2\2no\5\20\t\2op\5$\23\2pq\b\4\1\2qs\3\2\2"+
		"\2rQ\3\2\2\2rU\3\2\2\2rY\3\2\2\2r]\3\2\2\2ra\3\2\2\2re\3\2\2\2ri\3\2\2"+
		"\2rm\3\2\2\2s\7\3\2\2\2tu\7&\2\2uv\b\5\1\2vw\7\'\2\2wy\7\3\2\2xz\5\n\6"+
		"\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\4\2\2|}\b\5\1\2}~\5\16\b\2~\177\b"+
		"\5\1\2\177\t\3\2\2\2\u0080\u0081\7&\2\2\u0081\u0082\7\'\2\2\u0082\u0089"+
		"\b\6\1\2\u0083\u0084\7\5\2\2\u0084\u0085\7&\2\2\u0085\u0086\7\'\2\2\u0086"+
		"\u0088\b\6\1\2\u0087\u0083\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\13\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d"+
		"\5\20\t\2\u008d\u0094\b\7\1\2\u008e\u008f\7\5\2\2\u008f\u0090\5\20\t\2"+
		"\u0090\u0091\b\7\1\2\u0091\u0093\3\2\2\2\u0092\u008e\3\2\2\2\u0093\u0096"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u008c\3\2\2\2\u0097\u0098\3\2\2\2\u0098\r\3\2\2\2"+
		"\u0099\u009b\7\6\2\2\u009a\u009c\7!\2\2\u009b\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a4\3\2\2\2\u009f"+
		"\u00a0\5\6\4\2\u00a0\u00a1\b\b\1\2\u00a1\u00a3\3\2\2\2\u00a2\u009f\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ab\7\7\2\2\u00a8\u00aa\7!"+
		"\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\17\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\b\t\1"+
		"\2\u00af\u00b0\7\3\2\2\u00b0\u00b1\5\20\t\2\u00b1\u00b2\7\4\2\2\u00b2"+
		"\u00b3\b\t\1\2\u00b3\u00c2\3\2\2\2\u00b4\u00b5\7\'\2\2\u00b5\u00c2\b\t"+
		"\1\2\u00b6\u00b7\7$\2\2\u00b7\u00c2\b\t\1\2\u00b8\u00b9\7\13\2\2\u00b9"+
		"\u00ba\7$\2\2\u00ba\u00c2\b\t\1\2\u00bb\u00bc\7\'\2\2\u00bc\u00bd\7\3"+
		"\2\2\u00bd\u00be\5\f\7\2\u00be\u00bf\7\4\2\2\u00bf\u00c0\b\t\1\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00ae\3\2\2\2\u00c1\u00b4\3\2\2\2\u00c1\u00b6\3\2"+
		"\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c2\u00cf\3\2\2\2\u00c3"+
		"\u00c4\f\t\2\2\u00c4\u00c5\t\2\2\2\u00c5\u00c6\5\20\t\n\u00c6\u00c7\b"+
		"\t\1\2\u00c7\u00ce\3\2\2\2\u00c8\u00c9\f\b\2\2\u00c9\u00ca\t\3\2\2\u00ca"+
		"\u00cb\5\20\t\t\u00cb\u00cc\b\t\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00c3\3"+
		"\2\2\2\u00cd\u00c8\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\21\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7&\2\2"+
		"\u00d3\u00d4\7\'\2\2\u00d4\u00d5\5$\23\2\u00d5\u00d6\b\n\1\2\u00d6\u00df"+
		"\3\2\2\2\u00d7\u00d8\7&\2\2\u00d8\u00d9\7\'\2\2\u00d9\u00da\7\f\2\2\u00da"+
		"\u00db\5\20\t\2\u00db\u00dc\5$\23\2\u00dc\u00dd\b\n\1\2\u00dd\u00df\3"+
		"\2\2\2\u00de\u00d2\3\2\2\2\u00de\u00d7\3\2\2\2\u00df\23\3\2\2\2\u00e0"+
		"\u00e1\7\'\2\2\u00e1\u00e2\7\f\2\2\u00e2\u00e3\5\20\t\2\u00e3\u00e4\b"+
		"\13\1\2\u00e4\u00e9\3\2\2\2\u00e5\u00e6\7\'\2\2\u00e6\u00e7\t\4\2\2\u00e7"+
		"\u00e9\b\13\1\2\u00e8\u00e0\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\25\3\2\2"+
		"\2\u00ea\u00eb\7\17\2\2\u00eb\u00f7\b\f\1\2\u00ec\u00ed\7\20\2\2\u00ed"+
		"\u00f7\b\f\1\2\u00ee\u00ef\7\21\2\2\u00ef\u00f7\b\f\1\2\u00f0\u00f1\7"+
		"\22\2\2\u00f1\u00f7\b\f\1\2\u00f2\u00f3\7\23\2\2\u00f3\u00f7\b\f\1\2\u00f4"+
		"\u00f5\7\24\2\2\u00f5\u00f7\b\f\1\2\u00f6\u00ea\3\2\2\2\u00f6\u00ec\3"+
		"\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\27\3\2\2\2\u00f8\u00f9\7\25\2\2\u00f9\u00fd\b\r\1"+
		"\2\u00fa\u00fb\7\26\2\2\u00fb\u00fd\b\r\1\2\u00fc\u00f8\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\31\3\2\2\2\u00fe\u00ff\b\16\1\2\u00ff\u0100\7\27"+
		"\2\2\u0100\u0112\b\16\1\2\u0101\u0102\7\30\2\2\u0102\u0112\b\16\1\2\u0103"+
		"\u0104\5\20\t\2\u0104\u0105\5\26\f\2\u0105\u0106\5\20\t\2\u0106\u0107"+
		"\b\16\1\2\u0107\u0112\3\2\2\2\u0108\u0109\7\31\2\2\u0109\u010a\5\32\16"+
		"\4\u010a\u010b\b\16\1\2\u010b\u0112\3\2\2\2\u010c\u010d\7\3\2\2\u010d"+
		"\u010e\5\32\16\2\u010e\u010f\7\4\2\2\u010f\u0110\b\16\1\2\u0110\u0112"+
		"\3\2\2\2\u0111\u00fe\3\2\2\2\u0111\u0101\3\2\2\2\u0111\u0103\3\2\2\2\u0111"+
		"\u0108\3\2\2\2\u0111\u010c\3\2\2\2\u0112\u011a\3\2\2\2\u0113\u0114\f\5"+
		"\2\2\u0114\u0115\5\30\r\2\u0115\u0116\5\32\16\6\u0116\u0117\b\16\1\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0113\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\33\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e"+
		"\7\32\2\2\u011e\u011f\5\32\16\2\u011f\u0120\7\4\2\2\u0120\u0121\5\6\4"+
		"\2\u0121\u0122\b\17\1\2\u0122\u012e\3\2\2\2\u0123\u0124\7\33\2\2\u0124"+
		"\u0125\5\24\13\2\u0125\u0126\7\34\2\2\u0126\u0127\5\32\16\2\u0127\u0128"+
		"\7\34\2\2\u0128\u0129\5\24\13\2\u0129\u012a\7\4\2\2\u012a\u012b\5\6\4"+
		"\2\u012b\u012c\b\17\1\2\u012c\u012e\3\2\2\2\u012d\u011d\3\2\2\2\u012d"+
		"\u0123\3\2\2\2\u012e\35\3\2\2\2\u012f\u0130\7\35\2\2\u0130\u0131\5\32"+
		"\16\2\u0131\u0132\7\4\2\2\u0132\u0133\5\6\4\2\u0133\u0134\7\36\2\2\u0134"+
		"\u0135\5\6\4\2\u0135\u0136\b\20\1\2\u0136\u013e\3\2\2\2\u0137\u0138\7"+
		"\35\2\2\u0138\u0139\5\32\16\2\u0139\u013a\7\4\2\2\u013a\u013b\5\6\4\2"+
		"\u013b\u013c\b\20\1\2\u013c\u013e\3\2\2\2\u013d\u012f\3\2\2\2\u013d\u0137"+
		"\3\2\2\2\u013e\37\3\2\2\2\u013f\u0140\7\37\2\2\u0140\u0141\5\20\t\2\u0141"+
		"\u0142\7\4\2\2\u0142\u0143\b\21\1\2\u0143!\3\2\2\2\u0144\u0145\7 \2\2"+
		"\u0145\u0146\5\20\t\2\u0146\u0147\7\4\2\2\u0147\u0148\b\22\1\2\u0148#"+
		"\3\2\2\2\u0149\u014b\t\5\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d%\3\2\2\2\33.\65=CLry\u0089\u0094"+
		"\u0097\u009d\u00a4\u00ab\u00c1\u00cd\u00cf\u00de\u00e8\u00f6\u00fc\u0111"+
		"\u011a\u012d\u013d\u014c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}