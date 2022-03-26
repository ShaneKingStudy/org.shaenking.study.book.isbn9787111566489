// Generated from /Users/shaneking/sk.sync.disk.net/space/web/com/github/ShaneKingStudy/org.shaneking.book.isbn9787111566489/src/main/java/org/shaneking/book/isbn9787111566489/s3c1/ArrayInit.g4 by ANTLR 4.9.2
package org.shaneking.book.isbn9787111566489.s3c1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArrayInitParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArrayInitVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArrayInitParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(ArrayInitParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArrayInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ArrayInitParser.ValueContext ctx);
}