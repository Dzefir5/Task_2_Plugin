// Generated from D:/00001/Test_Plugin/buildSrc/antlrKotlin/Counter.g4 by ANTLR 4.13.1
package com.strumenta.antlrkotlin.parsers.generated

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced by [CounterParser].
 *
 * @param T The return type of the visit operation.
 *   Use [Unit] for operations with no return type
 */
public interface CounterVisitor<T> : ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by [CounterParser.kotlinFile].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitKotlinFile(ctx: CounterParser.KotlinFileContext): T

    /**
     * Visit a parse tree produced by [CounterParser.classDeclaration].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitClassDeclaration(ctx: CounterParser.ClassDeclarationContext): T

    /**
     * Visit a parse tree produced by [CounterParser.classBody].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitClassBody(ctx: CounterParser.ClassBodyContext): T

    /**
     * Visit a parse tree produced by [CounterParser.declaration].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitDeclaration(ctx: CounterParser.DeclarationContext): T

    /**
     * Visit a parse tree produced by [CounterParser.block].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitBlock(ctx: CounterParser.BlockContext): T

    /**
     * Visit a parse tree produced by [CounterParser.funDeclaration].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitFunDeclaration(ctx: CounterParser.FunDeclarationContext): T

    /**
     * Visit a parse tree produced by [CounterParser.valDeclaration].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitValDeclaration(ctx: CounterParser.ValDeclarationContext): T

    /**
     * Visit a parse tree produced by [CounterParser.varDeclaration].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitVarDeclaration(ctx: CounterParser.VarDeclarationContext): T

    /**
     * Visit a parse tree produced by [CounterParser.expressionStatement].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitExpressionStatement(ctx: CounterParser.ExpressionStatementContext): T

    /**
     * Visit a parse tree produced by [CounterParser.returnStatement].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitReturnStatement(ctx: CounterParser.ReturnStatementContext): T

    /**
     * Visit a parse tree produced by [CounterParser.statement].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitStatement(ctx: CounterParser.StatementContext): T

    /**
     * Visit a parse tree produced by [CounterParser.kotlinType].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitKotlinType(ctx: CounterParser.KotlinTypeContext): T

    /**
     * Visit a parse tree produced by [CounterParser.parameter].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitParameter(ctx: CounterParser.ParameterContext): T

    /**
     * Visit a parse tree produced by [CounterParser.expression].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitExpression(ctx: CounterParser.ExpressionContext): T

}
