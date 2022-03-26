package org.shaneking.book.isbn9787111566489.s4c2;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Calc {
  public static void main(String[] args) throws IOException {
    ANTLRInputStream antlrInputStream = new ANTLRInputStream(System.in);
    LabeledExprLexer labeledExprLexer = new LabeledExprLexer(antlrInputStream);
    CommonTokenStream commonTokenStream = new CommonTokenStream(labeledExprLexer);
    LabeledExprParser labeledExprParser = new LabeledExprParser(commonTokenStream);
    ParseTree parseTree = labeledExprParser.prog();

    EvalVisitor evalVisitor = new EvalVisitor();
    evalVisitor.visit(parseTree);
  }
}
