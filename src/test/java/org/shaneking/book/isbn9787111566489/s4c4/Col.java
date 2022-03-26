package org.shaneking.book.isbn9787111566489.s4c4;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.shaneking.book.isbn9787111566489.s4c3.ExtractInterfaceListener;
import org.shaneking.book.isbn9787111566489.s4c3.JavaLexer;
import org.shaneking.book.isbn9787111566489.s4c3.JavaParser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Col {
  public static void main(String[] args) throws IOException {
    try(InputStream inputStream = Files.newInputStream(Paths.get("./src/test/java/org/shaneking/book/isbn9787111566489/s4c4/rows.txt"))){
      ANTLRInputStream antlrInputStream = new ANTLRInputStream(inputStream);
      RowsLexer rowsLexer = new RowsLexer(antlrInputStream);
      CommonTokenStream commonTokenStream = new CommonTokenStream(rowsLexer);
      RowsParser rowsParser = new RowsParser(commonTokenStream, 2);// col index 0
      rowsParser.setBuildParseTree(false);  //not need build parse tree
      ParseTree parseTree = rowsParser.file();
    }
  }
}
