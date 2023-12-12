// Generated from D:/Program Files/projects/BTEJA/semPraceBteja/gramm.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammParser}.
 */
public interface grammListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(grammParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(grammParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(grammParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(grammParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(grammParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(grammParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(grammParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(grammParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(grammParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(grammParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(grammParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(grammParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(grammParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(grammParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(grammParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(grammParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(grammParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(grammParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(grammParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(grammParser.IdentifierContext ctx);
}