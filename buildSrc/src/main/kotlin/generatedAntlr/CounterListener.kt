// Generated from D:/00001/Test_Plugin/buildSrc/antlrKotlin/Counter.g4 by ANTLR 4.13.1
package com.strumenta.antlrkotlin.parsers.generated

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by [CounterParser].
 */
public interface CounterListener : ParseTreeListener {
    /**
     * Enter a parse tree produced by [CounterParser.kotlinFile].
     *
     * @param ctx The parse tree
     */
    public fun enterKotlinFile(ctx: CounterParser.KotlinFileContext)

    /**
     * Exit a parse tree produced by [CounterParser.kotlinFile].
     *
     * @param ctx The parse tree
     */
    public fun exitKotlinFile(ctx: CounterParser.KotlinFileContext)

    /**
     * Enter a parse tree produced by [CounterParser.classDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun enterClassDeclaration(ctx: CounterParser.ClassDeclarationContext)

    /**
     * Exit a parse tree produced by [CounterParser.classDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun exitClassDeclaration(ctx: CounterParser.ClassDeclarationContext)

    /**
     * Enter a parse tree produced by [CounterParser.classBody].
     *
     * @param ctx The parse tree
     */
    public fun enterClassBody(ctx: CounterParser.ClassBodyContext)

    /**
     * Exit a parse tree produced by [CounterParser.classBody].
     *
     * @param ctx The parse tree
     */
    public fun exitClassBody(ctx: CounterParser.ClassBodyContext)

    /**
     * Enter a parse tree produced by [CounterParser.declaration].
     *
     * @param ctx The parse tree
     */
    public fun enterDeclaration(ctx: CounterParser.DeclarationContext)

    /**
     * Exit a parse tree produced by [CounterParser.declaration].
     *
     * @param ctx The parse tree
     */
    public fun exitDeclaration(ctx: CounterParser.DeclarationContext)

    /**
     * Enter a parse tree produced by [CounterParser.block].
     *
     * @param ctx The parse tree
     */
    public fun enterBlock(ctx: CounterParser.BlockContext)

    /**
     * Exit a parse tree produced by [CounterParser.block].
     *
     * @param ctx The parse tree
     */
    public fun exitBlock(ctx: CounterParser.BlockContext)

    /**
     * Enter a parse tree produced by [CounterParser.funDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun enterFunDeclaration(ctx: CounterParser.FunDeclarationContext)

    /**
     * Exit a parse tree produced by [CounterParser.funDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun exitFunDeclaration(ctx: CounterParser.FunDeclarationContext)

    /**
     * Enter a parse tree produced by [CounterParser.valDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun enterValDeclaration(ctx: CounterParser.ValDeclarationContext)

    /**
     * Exit a parse tree produced by [CounterParser.valDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun exitValDeclaration(ctx: CounterParser.ValDeclarationContext)

    /**
     * Enter a parse tree produced by [CounterParser.varDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun enterVarDeclaration(ctx: CounterParser.VarDeclarationContext)

    /**
     * Exit a parse tree produced by [CounterParser.varDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun exitVarDeclaration(ctx: CounterParser.VarDeclarationContext)

    /**
     * Enter a parse tree produced by [CounterParser.expressionStatement].
     *
     * @param ctx The parse tree
     */
    public fun enterExpressionStatement(ctx: CounterParser.ExpressionStatementContext)

    /**
     * Exit a parse tree produced by [CounterParser.expressionStatement].
     *
     * @param ctx The parse tree
     */
    public fun exitExpressionStatement(ctx: CounterParser.ExpressionStatementContext)

    /**
     * Enter a parse tree produced by [CounterParser.returnStatement].
     *
     * @param ctx The parse tree
     */
    public fun enterReturnStatement(ctx: CounterParser.ReturnStatementContext)

    /**
     * Exit a parse tree produced by [CounterParser.returnStatement].
     *
     * @param ctx The parse tree
     */
    public fun exitReturnStatement(ctx: CounterParser.ReturnStatementContext)

    /**
     * Enter a parse tree produced by [CounterParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun enterStatement(ctx: CounterParser.StatementContext)

    /**
     * Exit a parse tree produced by [CounterParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun exitStatement(ctx: CounterParser.StatementContext)

    /**
     * Enter a parse tree produced by [CounterParser.kotlinType].
     *
     * @param ctx The parse tree
     */
    public fun enterKotlinType(ctx: CounterParser.KotlinTypeContext)

    /**
     * Exit a parse tree produced by [CounterParser.kotlinType].
     *
     * @param ctx The parse tree
     */
    public fun exitKotlinType(ctx: CounterParser.KotlinTypeContext)

    /**
     * Enter a parse tree produced by [CounterParser.parameter].
     *
     * @param ctx The parse tree
     */
    public fun enterParameter(ctx: CounterParser.ParameterContext)

    /**
     * Exit a parse tree produced by [CounterParser.parameter].
     *
     * @param ctx The parse tree
     */
    public fun exitParameter(ctx: CounterParser.ParameterContext)

    /**
     * Enter a parse tree produced by [CounterParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun enterExpression(ctx: CounterParser.ExpressionContext)

    /**
     * Exit a parse tree produced by [CounterParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun exitExpression(ctx: CounterParser.ExpressionContext)

}
