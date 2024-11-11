// Generated from D:/00001/Test_Plugin/buildSrc/antlrJava/JavaCounter.g4 by ANTLR 4.13.1
package com.strumenta.antlrjava.parsers.generated

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by [JavaCounterParser].
 */
public interface JavaCounterListener : ParseTreeListener {
    /**
     * Enter a parse tree produced by [JavaCounterParser.javaFile].
     *
     * @param ctx The parse tree
     */
    public fun enterJavaFile(ctx: JavaCounterParser.JavaFileContext)

    /**
     * Exit a parse tree produced by [JavaCounterParser.javaFile].
     *
     * @param ctx The parse tree
     */
    public fun exitJavaFile(ctx: JavaCounterParser.JavaFileContext)

    /**
     * Enter a parse tree produced by [JavaCounterParser.classDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun enterClassDeclaration(ctx: JavaCounterParser.ClassDeclarationContext)

    /**
     * Exit a parse tree produced by [JavaCounterParser.classDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun exitClassDeclaration(ctx: JavaCounterParser.ClassDeclarationContext)

    /**
     * Enter a parse tree produced by [JavaCounterParser.classBody].
     *
     * @param ctx The parse tree
     */
    public fun enterClassBody(ctx: JavaCounterParser.ClassBodyContext)

    /**
     * Exit a parse tree produced by [JavaCounterParser.classBody].
     *
     * @param ctx The parse tree
     */
    public fun exitClassBody(ctx: JavaCounterParser.ClassBodyContext)

    /**
     * Enter a parse tree produced by [JavaCounterParser.declaration].
     *
     * @param ctx The parse tree
     */
    public fun enterDeclaration(ctx: JavaCounterParser.DeclarationContext)

    /**
     * Exit a parse tree produced by [JavaCounterParser.declaration].
     *
     * @param ctx The parse tree
     */
    public fun exitDeclaration(ctx: JavaCounterParser.DeclarationContext)

    /**
     * Enter a parse tree produced by [JavaCounterParser.block].
     *
     * @param ctx The parse tree
     */
    public fun enterBlock(ctx: JavaCounterParser.BlockContext)

    /**
     * Exit a parse tree produced by [JavaCounterParser.block].
     *
     * @param ctx The parse tree
     */
    public fun exitBlock(ctx: JavaCounterParser.BlockContext)

    /**
     * Enter a parse tree produced by [JavaCounterParser.functionDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun enterFunctionDeclaration(ctx: JavaCounterParser.FunctionDeclarationContext)

    /**
     * Exit a parse tree produced by [JavaCounterParser.functionDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun exitFunctionDeclaration(ctx: JavaCounterParser.FunctionDeclarationContext)

    /**
     * Enter a parse tree produced by [JavaCounterParser.variableDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun enterVariableDeclaration(ctx: JavaCounterParser.VariableDeclarationContext)

    /**
     * Exit a parse tree produced by [JavaCounterParser.variableDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun exitVariableDeclaration(ctx: JavaCounterParser.VariableDeclarationContext)

    /**
     * Enter a parse tree produced by [JavaCounterParser.expressionStatement].
     *
     * @param ctx The parse tree
     */
    public fun enterExpressionStatement(ctx: JavaCounterParser.ExpressionStatementContext)

    /**
     * Exit a parse tree produced by [JavaCounterParser.expressionStatement].
     *
     * @param ctx The parse tree
     */
    public fun exitExpressionStatement(ctx: JavaCounterParser.ExpressionStatementContext)

    /**
     * Enter a parse tree produced by [JavaCounterParser.returnStatement].
     *
     * @param ctx The parse tree
     */
    public fun enterReturnStatement(ctx: JavaCounterParser.ReturnStatementContext)

    /**
     * Exit a parse tree produced by [JavaCounterParser.returnStatement].
     *
     * @param ctx The parse tree
     */
    public fun exitReturnStatement(ctx: JavaCounterParser.ReturnStatementContext)

    /**
     * Enter a parse tree produced by [JavaCounterParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun enterStatement(ctx: JavaCounterParser.StatementContext)

    /**
     * Exit a parse tree produced by [JavaCounterParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun exitStatement(ctx: JavaCounterParser.StatementContext)

    /**
     * Enter a parse tree produced by [JavaCounterParser.javaType].
     *
     * @param ctx The parse tree
     */
    public fun enterJavaType(ctx: JavaCounterParser.JavaTypeContext)

    /**
     * Exit a parse tree produced by [JavaCounterParser.javaType].
     *
     * @param ctx The parse tree
     */
    public fun exitJavaType(ctx: JavaCounterParser.JavaTypeContext)

    /**
     * Enter a parse tree produced by [JavaCounterParser.parameter].
     *
     * @param ctx The parse tree
     */
    public fun enterParameter(ctx: JavaCounterParser.ParameterContext)

    /**
     * Exit a parse tree produced by [JavaCounterParser.parameter].
     *
     * @param ctx The parse tree
     */
    public fun exitParameter(ctx: JavaCounterParser.ParameterContext)

    /**
     * Enter a parse tree produced by [JavaCounterParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun enterExpression(ctx: JavaCounterParser.ExpressionContext)

    /**
     * Exit a parse tree produced by [JavaCounterParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun exitExpression(ctx: JavaCounterParser.ExpressionContext)

}
