import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * Basic ANTLR4 grammar
 *
 * See https://gist.github.com/pditommaso/82af6f5deb918e5d10b743e3aef6d2f8
 */
public class Hello {
    public static void main( String[] args) throws Exception
    {
        HelloLexer lexer = new HelloLexer( new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        HelloParser parser = new HelloParser( tokens );
        ParseTree tree = parser.r();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new HelloWalker(), tree );
    }
}