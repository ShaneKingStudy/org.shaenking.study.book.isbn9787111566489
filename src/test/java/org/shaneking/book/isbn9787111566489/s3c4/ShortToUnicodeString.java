package org.shaneking.book.isbn9787111566489.s3c4;

import org.shaneking.book.isbn9787111566489.s3c1.ArrayInitBaseListener;
import org.shaneking.book.isbn9787111566489.s3c1.ArrayInitParser;

public class ShortToUnicodeString extends ArrayInitBaseListener {
  @Override
  public void enterInit(ArrayInitParser.InitContext ctx) {
    System.out.print('"');
  }

  @Override
  public void exitInit(ArrayInitParser.InitContext ctx) {
    System.out.print('"');
  }

  @Override
  public void enterValue(ArrayInitParser.ValueContext ctx) {
    System.out.printf("\\u%04x", Integer.valueOf(ctx.INT().getText()));
  }
}
