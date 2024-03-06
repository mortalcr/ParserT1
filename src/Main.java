import generated.ElParser;
import generated.ElScanner;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import parserManual.ParserManual;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ElScanner inst = null;
        ElParser parser = null;
        ParserManual pm ;

        ParseTree tree=null;

        CharStream input=null;
        CommonTokenStream tokens = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new ElScanner(input);
            tokens = new CommonTokenStream(inst);
            parser = new ElParser(tokens);

            pm = new ParserManual(inst);

            try {
                //tree = parser.program();
                pm.parseProgram();
                System.out.println("Compilación Terminada!!\n");
                //java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                //treeGUI.get().setVisible(true);
            }
            catch(RecognitionException e){
                System.out.println("Error!!!");
                e.printStackTrace();
            }
        }
        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}
    }
}
