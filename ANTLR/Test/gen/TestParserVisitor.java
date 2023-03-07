// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TestParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(TestParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(TestParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TestParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(TestParser.FuncContext ctx);
}