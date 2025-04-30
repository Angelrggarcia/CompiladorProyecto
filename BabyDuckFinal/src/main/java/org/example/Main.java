package org.example;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromString(
                "program test;\n" +
                        "func int suma(int a, int b) {\n" +
                        "    var int x, y;\n" +
                        "    x = a;\n" +
                        "    y = b;\n" +
                        "    return x + y;\n" +
                        "}\n" +
                        "main {\n" +
                        "    var int result;\n" +
                        "    result = suma(3, 4);\n" +
                        "    print(\"Result:\", result);\n" +
                        "}\n" +
                        "end;");

        scannerLexer lexer = new scannerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        scannerParser parser = new scannerParser(tokens);

        // Add error listener for better diagnostics
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                System.err.println("Syntax error at line " + line + ":" + charPositionInLine + " " + msg);
            }
        });

        ParseTree tree = parser.programa();
        System.out.println(tree.toStringTree(parser));
    }
}