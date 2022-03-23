package main.antlr.simpleexpr;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SimpleExprTest {
    public static void main(String[] args) throws IOException{
        InputStream is = System.in;
        String file;
        if(args.length > 0){
            file = args[0];
            is = new FileInputStream(file);
        }

        CharStream input = CharStreams.fromStream(is);
        main.antlr.simpleexpr.SimpleExprLexer lexer = new main.antlr.simpleexpr.SimpleExprLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        main.antlr.simpleexpr.SimpleExprParser parser = new main.antlr.simpleexpr.SimpleExprParser(tokens);
        org.antlr.v4.runtime.tree.ParseTree tree = parser.prog();

        for(Token token : tokens.getTokens()){
            System.out.println(token);
        }
        System.out.println(tree.toStringTree(parser));
    }
}
