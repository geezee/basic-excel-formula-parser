package visitor_example;

import parser.*;
import parser.ast.ASTNode;
import parser.ast.Binary;
import parser.ast.*;
import parser.ast.Number;

import javax.swing.text.html.parser.Parser;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VisitorExampleRunner {

    public static void main(String[] args) {

        ArrayList<ASTNode> funArgs = new ArrayList<>();

        funArgs.add(new parser.ast.Boolean(true));
        funArgs.add(new parser.ast.Binary(new parser.ast.Boolean(false), BinaryOp.PLUS, new parser.ast.Number<Double>(1.0)));
        funArgs.add(new CellRange(new Cell("A", 1), new Cell("B", 10)));

        ASTNode test = new FunctionCall(BasicFunction.IF, funArgs);

        ASTNode teoExpr = new Binary(new Number<>(5), BinaryOp.MULT, new Cell("A", 5));

        System.out.println(test.toString());

        System.out.println(teoExpr.accept(new TypeCheckingVisitor(null)));
    }

}
