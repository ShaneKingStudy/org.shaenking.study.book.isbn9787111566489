package org.shaneking.book.isbn9787111566489.s4c2;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
  Map<String, Integer> memory = new HashMap<>();

  @Override
  public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
    int value = visit(ctx.expr());
    System.out.println(value);
    return 0;
//    return super.visitPrintExpr(ctx);
  }

  @Override
  public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
    String id = ctx.ID().getText();
    int value = visit(ctx.expr());
    memory.put(id, value);
    return value;
//    return super.visitAssign(ctx);
  }

  @Override
  public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
    int left = visit(ctx.expr(0));
    int right = visit(ctx.expr(1));
    if (ctx.op.getType() == LabeledExprParser.MUL) return left * right;
    return left / right;
//    return super.visitMulDiv(ctx);
  }

  @Override
  public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) {
    int left = visit(ctx.expr(0));
    int right = visit(ctx.expr(1));
    if (ctx.op.getType() == LabeledExprParser.ADD) return left + right;
    return left - right;
//    return super.visitAddSub(ctx);
  }

  @Override
  public Integer visitId(LabeledExprParser.IdContext ctx) {
    String id = ctx.ID().getText();
    if( memory.containsKey(id)) return memory.get(id);
    return 0;
//    return super.visitId(ctx);
  }

  @Override
  public Integer visitInt(LabeledExprParser.IntContext ctx) {
    return Integer.valueOf(ctx.INT().getText());
//    return super.visitInt(ctx);
  }

  @Override
  public Integer visitParens(LabeledExprParser.ParensContext ctx) {
    return visit(ctx.expr());
//    return super.visitParens(ctx);
  }
}
