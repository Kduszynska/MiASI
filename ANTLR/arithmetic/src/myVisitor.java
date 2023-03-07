
import org.antlr.v4.runtime.tree.TerminalNode;
public class myVisitor extends arithmeticBaseVisitor<Integer> {
    @Override
    public Integer visitFile_(arithmeticParser.File_Context ctx) {
        return super.visitFile_(ctx);
    }

    @Override
    public Integer visitExpression(arithmeticParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Integer visitEquation(arithmeticParser.EquationContext ctx) {
        return super.visitEquation(ctx);
    }

    @Override
    public Integer visitAtom(arithmeticParser.AtomContext ctx) {
        return super.visitAtom(ctx);
    }

    @Override
    public Integer visitScientific(arithmeticParser.ScientificContext ctx) {
        return super.visitScientific(ctx);
    }

    @Override
    public Integer visitVariable(arithmeticParser.VariableContext ctx) {
        return super.visitVariable(ctx);
    }

    @Override
    public Integer visitRelop(arithmeticParser.RelopContext ctx) {
        return super.visitRelop(ctx);
    }
}
