// Generated from D:/00001/Test_Plugin/buildSrc/antlrJava/JavaCounter.g4 by ANTLR 4.13.1
package com.strumenta.antlrjava.parsers.generated

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced by [JavaCounterParser].
 *
 * @param T The return type of the visit operation.
 *   Use [Unit] for operations with no return type
 */
public interface JavaCounterVisitor<T> : ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by [JavaCounterParser.javaFile].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitJavaFile(ctx: JavaCounterParser.JavaFileContext): T

    /**
     * Visit a parse tree produced by [JavaCounterParser.classDeclaration].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitClassDeclaration(ctx: JavaCounterParser.ClassDeclarationContext): T

    /**
     * Visit a parse tree produced by [JavaCounterParser.classBody].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitClassBody(ctx: JavaCounterParser.ClassBodyContext): T

    /**
     * Visit a parse tree produced by [JavaCounterParser.declaration].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitDeclaration(ctx: JavaCounterParser.DeclarationContext): T

    /**
     * Visit a parse tree produced by [JavaCounterParser.block].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitBlock(ctx: JavaCounterParser.BlockContext): T

    /**
     * Visit a parse tree produced by [JavaCounterParser.functionDeclaration].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitFunctionDeclaration(ctx: JavaCounterParser.FunctionDeclarationContext): T

    /**
     * Visit a parse tree produced by [JavaCounterParser.variableDeclaration].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitVariableDeclaration(ctx: JavaCounterParser.VariableDeclarationContext): T

    /**
     * Visit a parse tree produced by [JavaCounterParser.expressionStatement].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitExpressionStatement(ctx: JavaCounterParser.ExpressionStatementContext): T

    /**
     * Visit a parse tree produced by [JavaCounterParser.returnStatement].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitReturnStatement(ctx: JavaCounterParser.ReturnStatementContext): T

    /**
     * Visit a parse tree produced by [JavaCounterParser.statement].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitStatement(ctx: JavaCounterParser.StatementContext): T

    /**
     * Visit a parse tree produced by [JavaCounterParser.javaType].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitJavaType(ctx: JavaCounterParser.JavaTypeContext): T

    /**
     * Visit a parse tree produced by [JavaCounterParser.parameter].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitParameter(ctx: JavaCounterParser.ParameterContext): T

    /**
     * Visit a parse tree produced by [JavaCounterParser.expression].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitExpression(ctx: JavaCounterParser.ExpressionContext): T

}
