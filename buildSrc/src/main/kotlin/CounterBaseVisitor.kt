// Generated from D:/00001/Test_Plugin/antlr/Counter.g4 by ANTLR 4.13.1
package com.strumenta.antlrkotlin.parsers.generated

import org.antlr.v4.kotlinruntime.tree.AbstractParseTreeVisitor

/**
 * This class provides an empty implementation of [CounterVisitor],
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param T The return type of the visit operation.
 *   Use [Unit] for operations with no return type
 */
public abstract class CounterBaseVisitor<T> : AbstractParseTreeVisitor<T>(), CounterVisitor<T> {
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitKotlinFile(ctx: CounterParser.KotlinFileContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitClassDeclaration(ctx: CounterParser.ClassDeclarationContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitClassBody(ctx: CounterParser.ClassBodyContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitDeclaration(ctx: CounterParser.DeclarationContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitBlock(ctx: CounterParser.BlockContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitFunDeclaration(ctx: CounterParser.FunDeclarationContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitValDeclaration(ctx: CounterParser.ValDeclarationContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitVarDeclaration(ctx: CounterParser.VarDeclarationContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitExpressionStatement(ctx: CounterParser.ExpressionStatementContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitReturnStatement(ctx: CounterParser.ReturnStatementContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitStatement(ctx: CounterParser.StatementContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitKotlinType(ctx: CounterParser.KotlinTypeContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitParameter(ctx: CounterParser.ParameterContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitExpression(ctx: CounterParser.ExpressionContext): T {
        return this.visitChildren(ctx)
    }
}
