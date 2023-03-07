import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Start {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromString("1+2*3=7","wejście");

        // create a lexer that feeds off of input CharStream
        arithmeticLexer lexer = new arithmeticLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        arithmeticParser parser = new arithmeticParser(tokens);

        // start parsing at the program rule
        ParseTree tree = parser.file_();

        // create a visitor to traverse the parse tree
        myVisitor visitor = new myVisitor();
        Integer res = visitor.visit(tree);
        System.out.printf("Wynik: %d\n",res);
    }
}
