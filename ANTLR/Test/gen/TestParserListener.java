// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TestParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TestParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TestParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TestParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(TestParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(TestParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TestParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TestParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(TestParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(TestParser.FuncContext ctx);
}