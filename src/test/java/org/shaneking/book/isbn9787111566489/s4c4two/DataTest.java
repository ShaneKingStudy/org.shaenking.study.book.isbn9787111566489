package org.shaneking.book.isbn9787111566489.s4c4two;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

class DataTest {
  public static void main(String[] args) throws IOException {
    ANTLRInputStream antlrInputStream = new ANTLRInputStream(System.in);
    DataLexer dataLexer = new DataLexer(antlrInputStream);
    CommonTokenStream commonTokenStream = new CommonTokenStream(dataLexer);
    DataParser dataParser = new DataParser(commonTokenStream);
    ParseTree parseTree = dataParser.file();
    System.out.println(parseTree.toStringTree(dataParser));
  }
}
