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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, DOUBLESLASHCOMMENT=33, SLASHSTARTCOMMENT=34, NEWLINE=35, WS=36, 
		RETURN=37, ENTIER=38, FLOAT=39, TYPE=40, IDENTIFIANT=41, UNMATCH=42;
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
			"'&&'", "'||'", "'true'", "'false'", "'!'", "'while'", "'repeat'", "'until'", 
			"'for'", "';'", "'if'", "'else'", "'write'", "'read'", null, null, null, 
			null, "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "DOUBLESLASHCOMMENT", 
			"SLASHSTARTCOMMENT", "NEWLINE", "WS", "RETURN", "ENTIER", "FLOAT", "TYPE", 
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
		public List<FinInstructionContext> finInstruction() {
			return getRuleContexts(FinInstructionContext.class);
		}
		public FinInstructionContext finInstruction(int i) {
			return getRuleContext(FinInstructionContext.class,i);
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
			 _localctx.code += "  JUMP Main\n"; 
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
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					((CalculContext)_localctx).fonction = fonction();
					 _localctx.code += ((CalculContext)_localctx).fonction.code; 
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					match(NEWLINE);
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			 _localctx.code += "LABEL Main\n"; 
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << DOUBLESLASHCOMMENT) | (1L << SLASHSTARTCOMMENT) | (1L << NEWLINE) | (1L << RETURN) | (1L << ENTIER) | (1L << FLOAT) | (1L << TYPE) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27 || _la==NEWLINE) {
					{
					setState(69);
					finInstruction();
					}
				}

				setState(72);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "  HALT\n"; 
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
		public DeclContext decl;
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
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				((InstructionContext)_localctx).expression = expression(0);
				setState(83);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((InstructionContext)_localctx).decl = decl();
				setState(87);
				finInstruction();
				 
						    ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).decl.code;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				((InstructionContext)_localctx).assignation = assignation();
				setState(91);
				finInstruction();
				 
						    ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				((InstructionContext)_localctx).write = write();
				setState(95);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).write.code;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				((InstructionContext)_localctx).read = read();
				setState(99);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).read.code;
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				((InstructionContext)_localctx).boucle = boucle();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).boucle.code;
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
				((InstructionContext)_localctx).bloc = bloc();
				setState(106);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bloc.code;
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				((InstructionContext)_localctx).ifCondition = ifCondition();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).ifCondition.code;
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(112);
				match(RETURN);
				setState(113);
				((InstructionContext)_localctx).expression = expression(0);
				setState(114);
				finInstruction();

				            ((InstructionContext)_localctx).code =  "PUSHI 0\n";
				            _localctx.code += ((InstructionContext)_localctx).expression.code;
				            tableSymboles.putVar("ReturnValue", "int"); //On sauvegarde la variable
				            AdresseType at = tableSymboles.getAdresseType("ReturnValue");
				            _localctx.code += "STOREL "+at.adresse+"\n";
				            _localctx.code += "RETURN\n";
				            _localctx.code += "RETURN\n";
				        
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitFonction(this);
		}
	}

	public final FonctionContext fonction() throws RecognitionException {
		FonctionContext _localctx = new FonctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fonction);
		 ((FonctionContext)_localctx).code =  new String(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((FonctionContext)_localctx).TYPE = match(TYPE);

			            _localctx.code += "PUSHI 0\n";
			        
			setState(121);
			((FonctionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(122);
			match(T__0);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(123);
				params();
				}
			}

			setState(126);
			match(T__1);

			            tableSymboles.putVar((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null), (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			            AdresseType at = tableSymboles.getAdresseType((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null));
			            
			            tableSymboles.newTableLocale();
			            _localctx.code += "LABEL "+(((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null)+"\n";
			            //On déclare la fonction pour pouvoir jump dessus plus tard
			            tableSymboles.newFunction((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null), (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			        
			setState(128);
			((FonctionContext)_localctx).bloc = bloc();

			            _localctx.code += ((FonctionContext)_localctx).bloc.code;
			            if(isLocalAdress(at)){
			                _localctx.code += "STOREL "+at.adresse+"\n";
			            }else{
			                _localctx.code += "STOREG "+at.adresse+"\n";
			            }
			        
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((ParamsContext)_localctx).TYPE = match(TYPE);
			setState(132);
			((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

			            tableSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null)); //On sauvegarde la variable
			        
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(134);
				match(T__2);
				setState(135);
				((ParamsContext)_localctx).TYPE = match(TYPE);
				setState(136);
				((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				                tableSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null)); //On sauvegarde la variable
				                // code java gérant une variable locale (argi)
				            
				}
				}
				setState(142);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		 ((ArgsContext)_localctx).code =  new String(); ((ArgsContext)_localctx).size =  0; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << DOUBLESLASHCOMMENT) | (1L << SLASHSTARTCOMMENT) | (1L << ENTIER) | (1L << FLOAT) | (1L << IDENTIFIANT))) != 0)) {
				{
				setState(143);
				((ArgsContext)_localctx).expression = expression(0);
				 
				        _localctx.code += ((ArgsContext)_localctx).expression.code;
				    
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(145);
					match(T__2);
					setState(146);
					((ArgsContext)_localctx).expression = expression(0);
					 
					        _localctx.code += ((ArgsContext)_localctx).expression.code;
					    
					}
					}
					setState(153);
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
		enterRule(_localctx, 12, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__3);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(157);
				match(NEWLINE);
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << DOUBLESLASHCOMMENT) | (1L << SLASHSTARTCOMMENT) | (1L << RETURN) | (1L << ENTIER) | (1L << FLOAT) | (1L << TYPE) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(160);
				((BlocContext)_localctx).instruction = instruction();
				 _localctx.code += ((BlocContext)_localctx).instruction.code; 
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(T__4);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(169);
					match(NEWLINE);
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public String type;
		public ExpressionContext a;
		public ExpressionContext c;
		public ExpressionContext e;
		public Token IDENTIFIANT;
		public Token ENTIER;
		public Token FLOAT;
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
		public TerminalNode FLOAT() { return getToken(CalcParser.FLOAT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode SLASHSTARTCOMMENT() { return getToken(CalcParser.SLASHSTARTCOMMENT, 0); }
		public TerminalNode DOUBLESLASHCOMMENT() { return getToken(CalcParser.DOUBLESLASHCOMMENT, 0); }
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		 ((ExpressionContext)_localctx).code =  new String(); ((ExpressionContext)_localctx).type =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(176);
				match(T__0);
				setState(177);
				((ExpressionContext)_localctx).e = expression(0);
				setState(178);
				match(T__1);
				((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).e.code;
				}
				break;
			case 2:
				{
				setState(181);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				            AdresseType var = tableSymboles.getAdresseType((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				            if(var.type == "float"){
				                ((ExpressionContext)_localctx).type =  "float";
				            }
				            System.out.println(_localctx.type);
				            if(isLocalAdress(var)){
				                ((ExpressionContext)_localctx).code =  "PUSHL "+var.adresse+"\n";
				            }else{
				                ((ExpressionContext)_localctx).code =  "PUSHG "+var.adresse+"\n";
				            }
				        
				}
				break;
			case 3:
				{
				setState(183);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) +"\n";
				        
				}
				break;
			case 4:
				{
				setState(185);
				match(T__8);
				setState(186);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI 0\n";
				            _localctx.code += "PUSHI "+(((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null)+"\n";
				            _localctx.code += "SUB\n";
				        
				}
				break;
			case 5:
				{
				setState(188);
				((ExpressionContext)_localctx).FLOAT = match(FLOAT);

				            ((ExpressionContext)_localctx).type =  "float";
				            ((ExpressionContext)_localctx).code =  "PUSHF "+(((ExpressionContext)_localctx).FLOAT!=null?((ExpressionContext)_localctx).FLOAT.getText():null)+"\n";
				        
				}
				break;
			case 6:
				{
				setState(190);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(191);
				match(T__0);
				setState(192);
				((ExpressionContext)_localctx).args = args();
				setState(193);
				match(T__1);

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).args.code;
				            String var = tableSymboles.getFunction((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null)); //retourne le type de la fonction
				            _localctx.code += "CALL "+(((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null)+"\n";
				        
				}
				break;
			case 7:
				{
				setState(196);
				match(SLASHSTARTCOMMENT);
				}
				break;
			case 8:
				{
				setState(197);
				match(DOUBLESLASHCOMMENT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(201);
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
						setState(202);
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
						setState(205);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(206);
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
						setState(207);
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
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 16, RULE_decl);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(216);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(217);
				finInstruction();

				            if((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null) == "int"){
				                ((DeclContext)_localctx).code =  "PUSHI 0\n";
				            }else{
				                ((DeclContext)_localctx).code =  "PUSHI 0\n";
				                ((DeclContext)_localctx).code =  "PUSHI 0\n";
				            }
				            tableSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(221);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(222);
				match(T__9);
				setState(223);
				((DeclContext)_localctx).expression = expression(0);
				setState(224);
				finInstruction();

				            if((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null) == "int"){
				                ((DeclContext)_localctx).code =  "PUSHI 0\n";
				            }else{
				                ((DeclContext)_localctx).code =  "PUSHI 0\n";
				                ((DeclContext)_localctx).code =  "PUSHI 0\n";
				            }
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
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(230);
				match(T__9);
				setState(231);
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
				setState(234);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(235);
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
		enterRule(_localctx, 20, RULE_operateur);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(T__12);
				 ((OperateurContext)_localctx).code =  "SUP\n"; 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(T__13);
				 ((OperateurContext)_localctx).code =  "SUPEQ\n"; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(T__14);
				 ((OperateurContext)_localctx).code =  "INF\n"; 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(T__15);
				 ((OperateurContext)_localctx).code =  "INFEQ\n"; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				match(T__16);
				 ((OperateurContext)_localctx).code =  "EQUAL\n"; 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(249);
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
		enterRule(_localctx, 22, RULE_logique);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(T__18);
				 ((LogiqueContext)_localctx).code =  "&&"; 
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				{
				setState(260);
				match(T__20);
				}

				            ((ConditionContext)_localctx).code =  "PUSHI 1\n";
				        
				}
				break;
			case 2:
				{
				{
				setState(262);
				match(T__21);
				}

				            ((ConditionContext)_localctx).code =  "PUSHI 0\n";
				        
				}
				break;
			case 3:
				{
				setState(264);
				((ConditionContext)_localctx).a = expression(0);
				setState(265);
				((ConditionContext)_localctx).operateur = operateur();
				setState(266);
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
				setState(269);
				match(T__22);
				setState(270);
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
				setState(273);
				match(T__0);
				setState(274);
				((ConditionContext)_localctx).condition = condition(0);
				setState(275);
				match(T__1);
				 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).condition.code; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
					setState(280);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(281);
					((ConditionContext)_localctx).logique = logique();
					setState(282);
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
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public InstructionContext d;
		public ConditionContext e;
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
		enterRule(_localctx, 26, RULE_boucle);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(T__23);
				setState(291);
				match(T__0);
				setState(292);
				((BoucleContext)_localctx).condition = condition(0);
				setState(293);
				match(T__1);
				setState(294);
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
				setState(297);
				match(T__24);
				setState(298);
				((BoucleContext)_localctx).d = instruction();
				setState(299);
				match(T__25);
				setState(300);
				match(T__0);
				setState(301);
				((BoucleContext)_localctx).e = condition(0);
				setState(302);
				match(T__1);

				            String debutRepeat = getNewLabel();
				            String finBoucle = getNewLabel();

				            ((BoucleContext)_localctx).code =   "LABEL " + debutRepeat + "\n";
				            _localctx.code += ((BoucleContext)_localctx).d.code;
				            _localctx.code += ((BoucleContext)_localctx).e.code;
				            _localctx.code += "JUMPF "+ debutRepeat + "\n";
				            _localctx.code += "JUMP "+ finBoucle + "\n";
				            _localctx.code += "LABEL "+ finBoucle + "\n";
				        
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(T__26);
				setState(306);
				match(T__0);
				setState(307);
				((BoucleContext)_localctx).c = assignation();
				setState(308);
				match(T__27);
				setState(309);
				((BoucleContext)_localctx).condition = condition(0);
				setState(310);
				match(T__27);
				setState(311);
				((BoucleContext)_localctx).b = assignation();
				setState(312);
				match(T__1);
				setState(313);
				((BoucleContext)_localctx).instruction = instruction();

				            String debutFor = getNewLabel();
				            String exit = getNewLabel();

				            ((BoucleContext)_localctx).code =  ((BoucleContext)_localctx).c.code;
				            _localctx.code += "LABEL " + debutFor + "\n";
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
		enterRule(_localctx, 28, RULE_ifCondition);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(T__28);
				setState(319);
				match(T__0);
				setState(320);
				((IfConditionContext)_localctx).condition = condition(0);
				setState(321);
				match(T__1);
				setState(322);
				((IfConditionContext)_localctx).a = instruction();
				setState(323);
				match(T__29);
				setState(324);
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
				setState(327);
				match(T__28);
				setState(328);
				match(T__0);
				setState(329);
				((IfConditionContext)_localctx).condition = condition(0);
				setState(330);
				match(T__1);
				setState(331);
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
		enterRule(_localctx, 30, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__30);
			setState(337);
			match(T__0);
			setState(338);
			((WriteContext)_localctx).expression = expression(0);
			setState(339);
			match(T__1);

			            ((WriteContext)_localctx).code =  ((WriteContext)_localctx).expression.code;
			            if(((WriteContext)_localctx).expression.type == "float"){
			                _localctx.code += "WRITEF\n";
			                _localctx.code += "POP \n";
			                _localctx.code += "POP \n"; //2 pop si c'est un float  
			            }else{
			                _localctx.code += "WRITE\n";
			                _localctx.code += "POP \n";
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

	public static class ReadContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public TerminalNode IDENTIFIANT() { return getToken(CalcParser.IDENTIFIANT, 0); }
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
		enterRule(_localctx, 32, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__31);
			setState(343);
			match(T__0);
			setState(344);
			((ReadContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(345);
			match(T__1);

			            AdresseType at = tableSymboles.getAdresseType((((ReadContext)_localctx).IDENTIFIANT!=null?((ReadContext)_localctx).IDENTIFIANT.getText():null));
			            if(at.type == "float"){
			                ((ReadContext)_localctx).code =  "READF\n";
			            }else{
			                ((ReadContext)_localctx).code =  "READ\n";
			            }
			            if(at.adresse >= 0){
			                _localctx.code += "STOREG " + at.adresse + "\n";
			            }else{
			                _localctx.code += "STOREL " + at.adresse + "\n";
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
		enterRule(_localctx, 34, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(348);
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
				setState(351); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0164\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\7"+
		"\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\7\3"+
		"B\n\3\f\3\16\3E\13\3\3\3\3\3\5\3I\n\3\3\3\3\3\3\3\7\3N\n\3\f\3\16\3Q\13"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4x\n\4\3\5\3\5\3\5\3\5\3\5\5\5\177\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u0098\n\7\f\7\16\7\u009b\13\7\5\7\u009d\n\7\3\b"+
		"\3\b\5\b\u00a1\n\b\3\b\3\b\3\b\7\b\u00a6\n\b\f\b\16\b\u00a9\13\b\3\b\3"+
		"\b\7\b\u00ad\n\b\f\b\16\b\u00b0\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c9\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d5\n\t\f\t\16\t\u00d8"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e6\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f0\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fe\n\f\3\r\3\r\3\r\3\r\5\r\u0104"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0119\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0120\n\16\f\16\16\16\u0123\13\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u013f\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0151\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\6\23"+
		"\u0160\n\23\r\23\16\23\u0161\3\23\2\4\20\32\24\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$\2\6\3\2\b\t\3\2\n\13\3\2\r\16\4\2\36\36%%\2\u0180"+
		"\2&\3\2\2\2\4.\3\2\2\2\6w\3\2\2\2\by\3\2\2\2\n\u0085\3\2\2\2\f\u009c\3"+
		"\2\2\2\16\u009e\3\2\2\2\20\u00c8\3\2\2\2\22\u00e5\3\2\2\2\24\u00ef\3\2"+
		"\2\2\26\u00fd\3\2\2\2\30\u0103\3\2\2\2\32\u0118\3\2\2\2\34\u013e\3\2\2"+
		"\2\36\u0150\3\2\2\2 \u0152\3\2\2\2\"\u0158\3\2\2\2$\u015f\3\2\2\2&\'\5"+
		"\4\3\2\'(\7\2\2\3(\3\3\2\2\2)*\5\22\n\2*+\b\3\1\2+-\3\2\2\2,)\3\2\2\2"+
		"-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\65\b\3\1\2"+
		"\62\64\7%\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2"+
		"\66=\3\2\2\2\67\65\3\2\2\289\5\b\5\29:\b\3\1\2:<\3\2\2\2;8\3\2\2\2<?\3"+
		"\2\2\2=;\3\2\2\2=>\3\2\2\2>C\3\2\2\2?=\3\2\2\2@B\7%\2\2A@\3\2\2\2BE\3"+
		"\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FO\b\3\1\2GI\5$\23\2HG\3"+
		"\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\5\6\4\2KL\b\3\1\2LN\3\2\2\2MH\3\2\2\2NQ\3"+
		"\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\b\3\1\2S\5\3\2\2\2TU"+
		"\5\20\t\2UV\5$\23\2VW\b\4\1\2Wx\3\2\2\2XY\5\22\n\2YZ\5$\23\2Z[\b\4\1\2"+
		"[x\3\2\2\2\\]\5\24\13\2]^\5$\23\2^_\b\4\1\2_x\3\2\2\2`a\5 \21\2ab\5$\23"+
		"\2bc\b\4\1\2cx\3\2\2\2de\5\"\22\2ef\5$\23\2fg\b\4\1\2gx\3\2\2\2hi\5\34"+
		"\17\2ij\b\4\1\2jx\3\2\2\2kl\5\16\b\2lm\5$\23\2mn\b\4\1\2nx\3\2\2\2op\5"+
		"\36\20\2pq\b\4\1\2qx\3\2\2\2rs\7\'\2\2st\5\20\t\2tu\5$\23\2uv\b\4\1\2"+
		"vx\3\2\2\2wT\3\2\2\2wX\3\2\2\2w\\\3\2\2\2w`\3\2\2\2wd\3\2\2\2wh\3\2\2"+
		"\2wk\3\2\2\2wo\3\2\2\2wr\3\2\2\2x\7\3\2\2\2yz\7*\2\2z{\b\5\1\2{|\7+\2"+
		"\2|~\7\3\2\2}\177\5\n\6\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\7\4\2\2\u0081\u0082\b\5\1\2\u0082\u0083\5\16\b\2\u0083\u0084\b"+
		"\5\1\2\u0084\t\3\2\2\2\u0085\u0086\7*\2\2\u0086\u0087\7+\2\2\u0087\u008e"+
		"\b\6\1\2\u0088\u0089\7\5\2\2\u0089\u008a\7*\2\2\u008a\u008b\7+\2\2\u008b"+
		"\u008d\b\6\1\2\u008c\u0088\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\13\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092"+
		"\5\20\t\2\u0092\u0099\b\7\1\2\u0093\u0094\7\5\2\2\u0094\u0095\5\20\t\2"+
		"\u0095\u0096\b\7\1\2\u0096\u0098\3\2\2\2\u0097\u0093\3\2\2\2\u0098\u009b"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u0091\3\2\2\2\u009c\u009d\3\2\2\2\u009d\r\3\2\2\2"+
		"\u009e\u00a0\7\6\2\2\u009f\u00a1\7%\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a7\3\2\2\2\u00a2\u00a3\5\6\4\2\u00a3\u00a4\b\b\1\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ae\7\7\2\2\u00ab\u00ad\7%\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\17\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b2\b\t\1\2\u00b2\u00b3\7\3\2\2\u00b3\u00b4\5\20\t\2"+
		"\u00b4\u00b5\7\4\2\2\u00b5\u00b6\b\t\1\2\u00b6\u00c9\3\2\2\2\u00b7\u00b8"+
		"\7+\2\2\u00b8\u00c9\b\t\1\2\u00b9\u00ba\7(\2\2\u00ba\u00c9\b\t\1\2\u00bb"+
		"\u00bc\7\13\2\2\u00bc\u00bd\7(\2\2\u00bd\u00c9\b\t\1\2\u00be\u00bf\7)"+
		"\2\2\u00bf\u00c9\b\t\1\2\u00c0\u00c1\7+\2\2\u00c1\u00c2\7\3\2\2\u00c2"+
		"\u00c3\5\f\7\2\u00c3\u00c4\7\4\2\2\u00c4\u00c5\b\t\1\2\u00c5\u00c9\3\2"+
		"\2\2\u00c6\u00c9\7$\2\2\u00c7\u00c9\7#\2\2\u00c8\u00b1\3\2\2\2\u00c8\u00b7"+
		"\3\2\2\2\u00c8\u00b9\3\2\2\2\u00c8\u00bb\3\2\2\2\u00c8\u00be\3\2\2\2\u00c8"+
		"\u00c0\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00d6\3\2"+
		"\2\2\u00ca\u00cb\f\f\2\2\u00cb\u00cc\t\2\2\2\u00cc\u00cd\5\20\t\r\u00cd"+
		"\u00ce\b\t\1\2\u00ce\u00d5\3\2\2\2\u00cf\u00d0\f\13\2\2\u00d0\u00d1\t"+
		"\3\2\2\u00d1\u00d2\5\20\t\f\u00d2\u00d3\b\t\1\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00ca\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\21\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da"+
		"\7*\2\2\u00da\u00db\7+\2\2\u00db\u00dc\5$\23\2\u00dc\u00dd\b\n\1\2\u00dd"+
		"\u00e6\3\2\2\2\u00de\u00df\7*\2\2\u00df\u00e0\7+\2\2\u00e0\u00e1\7\f\2"+
		"\2\u00e1\u00e2\5\20\t\2\u00e2\u00e3\5$\23\2\u00e3\u00e4\b\n\1\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e5\u00de\3\2\2\2\u00e6\23\3\2\2"+
		"\2\u00e7\u00e8\7+\2\2\u00e8\u00e9\7\f\2\2\u00e9\u00ea\5\20\t\2\u00ea\u00eb"+
		"\b\13\1\2\u00eb\u00f0\3\2\2\2\u00ec\u00ed\7+\2\2\u00ed\u00ee\t\4\2\2\u00ee"+
		"\u00f0\b\13\1\2\u00ef\u00e7\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0\25\3\2\2"+
		"\2\u00f1\u00f2\7\17\2\2\u00f2\u00fe\b\f\1\2\u00f3\u00f4\7\20\2\2\u00f4"+
		"\u00fe\b\f\1\2\u00f5\u00f6\7\21\2\2\u00f6\u00fe\b\f\1\2\u00f7\u00f8\7"+
		"\22\2\2\u00f8\u00fe\b\f\1\2\u00f9\u00fa\7\23\2\2\u00fa\u00fe\b\f\1\2\u00fb"+
		"\u00fc\7\24\2\2\u00fc\u00fe\b\f\1\2\u00fd\u00f1\3\2\2\2\u00fd\u00f3\3"+
		"\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\27\3\2\2\2\u00ff\u0100\7\25\2\2\u0100\u0104\b\r\1"+
		"\2\u0101\u0102\7\26\2\2\u0102\u0104\b\r\1\2\u0103\u00ff\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\31\3\2\2\2\u0105\u0106\b\16\1\2\u0106\u0107\7\27"+
		"\2\2\u0107\u0119\b\16\1\2\u0108\u0109\7\30\2\2\u0109\u0119\b\16\1\2\u010a"+
		"\u010b\5\20\t\2\u010b\u010c\5\26\f\2\u010c\u010d\5\20\t\2\u010d\u010e"+
		"\b\16\1\2\u010e\u0119\3\2\2\2\u010f\u0110\7\31\2\2\u0110\u0111\5\32\16"+
		"\4\u0111\u0112\b\16\1\2\u0112\u0119\3\2\2\2\u0113\u0114\7\3\2\2\u0114"+
		"\u0115\5\32\16\2\u0115\u0116\7\4\2\2\u0116\u0117\b\16\1\2\u0117\u0119"+
		"\3\2\2\2\u0118\u0105\3\2\2\2\u0118\u0108\3\2\2\2\u0118\u010a\3\2\2\2\u0118"+
		"\u010f\3\2\2\2\u0118\u0113\3\2\2\2\u0119\u0121\3\2\2\2\u011a\u011b\f\5"+
		"\2\2\u011b\u011c\5\30\r\2\u011c\u011d\5\32\16\6\u011d\u011e\b\16\1\2\u011e"+
		"\u0120\3\2\2\2\u011f\u011a\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\33\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125"+
		"\7\32\2\2\u0125\u0126\7\3\2\2\u0126\u0127\5\32\16\2\u0127\u0128\7\4\2"+
		"\2\u0128\u0129\5\6\4\2\u0129\u012a\b\17\1\2\u012a\u013f\3\2\2\2\u012b"+
		"\u012c\7\33\2\2\u012c\u012d\5\6\4\2\u012d\u012e\7\34\2\2\u012e\u012f\7"+
		"\3\2\2\u012f\u0130\5\32\16\2\u0130\u0131\7\4\2\2\u0131\u0132\b\17\1\2"+
		"\u0132\u013f\3\2\2\2\u0133\u0134\7\35\2\2\u0134\u0135\7\3\2\2\u0135\u0136"+
		"\5\24\13\2\u0136\u0137\7\36\2\2\u0137\u0138\5\32\16\2\u0138\u0139\7\36"+
		"\2\2\u0139\u013a\5\24\13\2\u013a\u013b\7\4\2\2\u013b\u013c\5\6\4\2\u013c"+
		"\u013d\b\17\1\2\u013d\u013f\3\2\2\2\u013e\u0124\3\2\2\2\u013e\u012b\3"+
		"\2\2\2\u013e\u0133\3\2\2\2\u013f\35\3\2\2\2\u0140\u0141\7\37\2\2\u0141"+
		"\u0142\7\3\2\2\u0142\u0143\5\32\16\2\u0143\u0144\7\4\2\2\u0144\u0145\5"+
		"\6\4\2\u0145\u0146\7 \2\2\u0146\u0147\5\6\4\2\u0147\u0148\b\20\1\2\u0148"+
		"\u0151\3\2\2\2\u0149\u014a\7\37\2\2\u014a\u014b\7\3\2\2\u014b\u014c\5"+
		"\32\16\2\u014c\u014d\7\4\2\2\u014d\u014e\5\6\4\2\u014e\u014f\b\20\1\2"+
		"\u014f\u0151\3\2\2\2\u0150\u0140\3\2\2\2\u0150\u0149\3\2\2\2\u0151\37"+
		"\3\2\2\2\u0152\u0153\7!\2\2\u0153\u0154\7\3\2\2\u0154\u0155\5\20\t\2\u0155"+
		"\u0156\7\4\2\2\u0156\u0157\b\21\1\2\u0157!\3\2\2\2\u0158\u0159\7\"\2\2"+
		"\u0159\u015a\7\3\2\2\u015a\u015b\7+\2\2\u015b\u015c\7\4\2\2\u015c\u015d"+
		"\b\22\1\2\u015d#\3\2\2\2\u015e\u0160\t\5\2\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162%\3\2\2\2"+
		"\34.\65=CHOw~\u008e\u0099\u009c\u00a0\u00a7\u00ae\u00c8\u00d4\u00d6\u00e5"+
		"\u00ef\u00fd\u0103\u0118\u0121\u013e\u0150\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}