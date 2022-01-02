import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            GrammarLexer lexer;
            if (args.length>0)
                lexer = new GrammarLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new GrammarLexer(CharStreams.fromStream(System.in));

            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto correspondiente al analizador sintáctico que se alimenta a partir del buffer de tokens
            GrammarParser parser = new GrammarParser(tokens);

            ParseTree tree = parser.programa();
            //System.out.println(tree.toStringTree(parser));

            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            walker.walk(new PseIntToC(), tree);
            System.out.println(); // print a \n after translation

    } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}
