import MIDL.MIDLLexer;
import MIDL.MIDLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class ExtractInterfaceTool {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CharStream input;
        try {
            System.err.print("输入待分析的文件名：\n>>>");
            String fileName = br.readLine();
            input = CharStreams.fromStream(new BufferedInputStream(new FileInputStream(fileName)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        MIDLLexer lexer = new MIDLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MIDLParser parser = new MIDLParser(tokens);
        ParseTree tree = parser.specification(); // parse
        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        ExtractInterfaceListener extractor = new ExtractInterfaceListener(parser);
        walker.walk(extractor, tree); // initiate walk of tree with listener
    }
}
