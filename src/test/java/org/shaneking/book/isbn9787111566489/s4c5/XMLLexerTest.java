package org.shaneking.book.isbn9787111566489.s4c5;

import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

class XMLLexerTest {
  public static void main(String[] args) throws IOException {
    try (InputStream inputStream = Files.newInputStream(Paths.get("./src/test/java/org/shaneking/book/isbn9787111566489/s4c5/tools.xml"))) {
      ANTLRInputStream antlrInputStream = new ANTLRInputStream(inputStream);
      XMLLexer xmlLexer = new XMLLexer(antlrInputStream);
      System.out.println(xmlLexer.getAllTokens());
    }
  }
}
