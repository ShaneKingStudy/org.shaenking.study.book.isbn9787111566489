package org.shaneking.book.isbn9787111566489.s6c2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Paths;

class JSONParserTest {
  public static void main(String[] args) throws IOException {
    JSONLexer jsonLexer = new JSONLexer(CharStreams.fromPath(Paths.get("./src/test/java/org/shaneking/book/isbn9787111566489/s6c2/t.json")));
    System.out.println(jsonLexer.getAllTokens());

    CommonTokenStream commonTokenStream = new CommonTokenStream(jsonLexer);
    JSONParser jsonParser = new JSONParser(commonTokenStream);
    ParseTree parseTree = jsonParser.json();
    System.out.println(parseTree.toStringTree(jsonParser));
  }
}
