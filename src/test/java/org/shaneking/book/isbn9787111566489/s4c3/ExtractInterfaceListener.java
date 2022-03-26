package org.shaneking.book.isbn9787111566489.s4c3;

import org.antlr.v4.runtime.TokenStream;

public class ExtractInterfaceListener extends JavaParserBaseListener {
  JavaParser javaParser;

  public ExtractInterfaceListener(JavaParser javaParser) {
    this.javaParser = javaParser;
  }

  @Override
  public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
    System.out.println("interface I" + ctx.identifier().getText() + " {");
//    super.enterClassDeclaration(ctx);
  }

  @Override
  public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
    System.out.println("}");
//    super.exitClassDeclaration(ctx);
  }

  @Override
  public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
    TokenStream tokenStream = javaParser.getTokenStream();
    String type = tokenStream.getText(ctx.typeTypeOrVoid());
    System.out.println("\t" + tokenStream.getText(ctx.typeTypeOrVoid()) + " " + ctx.identifier().getText() + tokenStream.getText(ctx.formalParameters()) + ";");
//    super.enterMethodDeclaration(ctx);
  }
}
