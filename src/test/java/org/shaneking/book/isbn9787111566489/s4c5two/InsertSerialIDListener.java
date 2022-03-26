package org.shaneking.book.isbn9787111566489.s4c5two;

import org.antlr.v4.runtime.TokenStreamRewriter;
import org.shaneking.book.isbn9787111566489.s4c3.JavaParser;
import org.shaneking.book.isbn9787111566489.s4c3.JavaParserBaseListener;

public class InsertSerialIDListener extends JavaParserBaseListener {
  TokenStreamRewriter tokenStreamRewriter;

  public InsertSerialIDListener(TokenStreamRewriter tokenStreamRewriter) {
    this.tokenStreamRewriter = tokenStreamRewriter;
  }

  @Override
  public void enterClassBody(JavaParser.ClassBodyContext ctx) {
    String field = "\n\t//tokenStreamRewriter.insertBefore(ctx.start, field);";
    tokenStreamRewriter.insertAfter(ctx.start, field);
//    super.enterClassBody(ctx);
  }
}
