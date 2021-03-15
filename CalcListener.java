// Generated from Calc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#calcul}.
	 * @param ctx the parse tree
	 */
	void enterCalcul(CalcParser.CalculContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#calcul}.
	 * @param ctx the parse tree
	 */
	void exitCalcul(CalcParser.CalculContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CalcParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CalcParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#fonction}.
	 * @param ctx the parse tree
	 */
	void enterFonction(CalcParser.FonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#fonction}.
	 * @param ctx the parse tree
	 */
	void exitFonction(CalcParser.FonctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CalcParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CalcParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CalcParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CalcParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#bloc}.
	 * @param ctx the parse tree
	 */
	void enterBloc(CalcParser.BlocContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#bloc}.
	 * @param ctx the parse tree
	 */
	void exitBloc(CalcParser.BlocContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalcParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalcParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CalcParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CalcParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(CalcParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(CalcParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#operateur}.
	 * @param ctx the parse tree
	 */
	void enterOperateur(CalcParser.OperateurContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#operateur}.
	 * @param ctx the parse tree
	 */
	void exitOperateur(CalcParser.OperateurContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#logique}.
	 * @param ctx the parse tree
	 */
	void enterLogique(CalcParser.LogiqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#logique}.
	 * @param ctx the parse tree
	 */
	void exitLogique(CalcParser.LogiqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CalcParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CalcParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#boucle}.
	 * @param ctx the parse tree
	 */
	void enterBoucle(CalcParser.BoucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#boucle}.
	 * @param ctx the parse tree
	 */
	void exitBoucle(CalcParser.BoucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(CalcParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(CalcParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(CalcParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(CalcParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(CalcParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(CalcParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(CalcParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(CalcParser.FinInstructionContext ctx);
}