// Generated from D:/00001/Test_Plugin/buildSrc/antlrJava/JavaCounter.g4 by ANTLR 4.13.1
package com.strumenta.antlrjava.parsers.generated

import org.antlr.v4.kotlinruntime.tree.AbstractParseTreeVisitor

/**
 * This class provides an empty implementation of [JavaCounterVisitor],
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param T The return type of the visit operation.
 *   Use [Unit] for operations with no return type
 */
public abstract class JavaCounterBaseVisitor<T> : AbstractParseTreeVisitor<T>(), JavaCounterVisitor<T> {
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitJavaFile(ctx: JavaCounterParser.JavaFileContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitClassDeclaration(ctx: JavaCounterParser.ClassDeclarationContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitClassBody(ctx: JavaCounterParser.ClassBodyContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitDeclaration(ctx: JavaCounterParser.DeclarationContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitBlock(ctx: JavaCounterParser.BlockContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitFunctionDeclaration(ctx: JavaCounterParser.FunctionDeclarationContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitVariableDeclaration(ctx: JavaCounterParser.VariableDeclarationContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitExpressionStatement(ctx: JavaCounterParser.ExpressionStatementContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitReturnStatement(ctx: JavaCounterParser.ReturnStatementContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitStatement(ctx: JavaCounterParser.StatementContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitJavaType(ctx: JavaCounterParser.JavaTypeContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitParameter(ctx: JavaCounterParser.ParameterContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitExpression(ctx: JavaCounterParser.ExpressionContext): T {
        return this.visitChildren(ctx)
    }
}
