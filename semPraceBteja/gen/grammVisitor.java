// Generated from D:/Program Files/projects/BTEJA/semPraceBteja/gramm.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(grammParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(grammParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(grammParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(grammParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(grammParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(grammParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(grammParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(grammParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(grammParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(grammParser.IdentifierContext ctx);
}