package org.shaneking.book.isbn9787111566489.s3c3;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.shaneking.book.isbn9787111566489.s3c1.ArrayInitLexer;
import org.shaneking.book.isbn9787111566489.s3c1.ArrayInitParser;

import java.io.IOException;

class Test {

  //  @Test
  public static void main(String[] args) throws IOException {
    ANTLRInputStream antlrInputStream = new ANTLRInputStream(System.in);
    ArrayInitLexer arrayInitLexer = new ArrayInitLexer(antlrInputStream);
    CommonTokenStream commonTokenStream = new CommonTokenStream(arrayInitLexer);
    ArrayInitParser arrayInitParser = new ArrayInitParser(commonTokenStream);
    ParseTree parseTree = arrayInitParser.init();
    System.out.println(parseTree.toStringTree(arrayInitParser));
  }
}
