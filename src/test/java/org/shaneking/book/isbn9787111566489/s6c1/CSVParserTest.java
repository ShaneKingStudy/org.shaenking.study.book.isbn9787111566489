package org.shaneking.book.isbn9787111566489.s6c1;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.shaneking.book.isbn9787111566489.s4c3.JavaParser;
import org.shaneking.book.isbn9787111566489.s4c5.XMLLexer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CSVParserTest {
  public static void main(String[] args) throws IOException {
    try (InputStream inputStream = Files.newInputStream(Paths.get("./src/test/java/org/shaneking/book/isbn9787111566489/s6c1/data.csv"))) {
      ANTLRInputStream antlrInputStream = new ANTLRInputStream(inputStream);
      CSVLexer csvLexer = new CSVLexer(antlrInputStream);
      System.out.println(csvLexer.getAllTokens());

      CommonTokenStream commonTokenStream = new CommonTokenStream(csvLexer);
      CSVParser csvParser = new CSVParser(commonTokenStream);
      ParseTree parseTree = csvParser.file();
      System.out.println(parseTree.toStringTree(csvParser));
    }
  }
}
