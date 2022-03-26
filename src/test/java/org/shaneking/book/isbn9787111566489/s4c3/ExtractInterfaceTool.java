package org.shaneking.book.isbn9787111566489.s4c3;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExtractInterfaceTool {
  public static void main(String[] args) throws IOException {
    System.out.println(Paths.get(".").toAbsolutePath());
    try(InputStream inputStream = Files.newInputStream(Paths.get("./src/test/java/org/shaneking/book/isbn9787111566489/s4c3/Demo.java"))){
      ANTLRInputStream antlrInputStream = new ANTLRInputStream(inputStream);
      JavaLexer javaLexer = new JavaLexer(antlrInputStream);
      CommonTokenStream commonTokenStream = new CommonTokenStream(javaLexer);
      JavaParser javaParser = new JavaParser(commonTokenStream);
      ParseTree parseTree = javaParser.compilationUnit();

      ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
      ExtractInterfaceListener extractInterfaceListener = new ExtractInterfaceListener(javaParser);
      parseTreeWalker.walk(extractInterfaceListener, parseTree);
    }
  }
}
