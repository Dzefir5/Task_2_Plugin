import com.strumenta.antlrjava.parsers.generated.JavaCounterListener
import com.strumenta.antlrjava.parsers.generated.JavaCounterParser
import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.tree.ErrorNode
import org.antlr.v4.kotlinruntime.tree.TerminalNode


class JavaCounterListener : JavaCounterListener {
    var classCount = 0
    var methodsCount = 0
    override fun enterJavaFile(ctx: JavaCounterParser.JavaFileContext) {

    }

    override fun exitJavaFile(ctx: JavaCounterParser.JavaFileContext) {

    }

    override fun enterClassDeclaration(ctx: JavaCounterParser.ClassDeclarationContext) {

    }

    override fun exitClassDeclaration(ctx: JavaCounterParser.ClassDeclarationContext) {

    }

    override fun enterClassBody(ctx: JavaCounterParser.ClassBodyContext) {
        classCount++
    }

    override fun exitClassBody(ctx: JavaCounterParser.ClassBodyContext) {
    }

    override fun enterDeclaration(ctx: JavaCounterParser.DeclarationContext) {
    }

    override fun exitDeclaration(ctx: JavaCounterParser.DeclarationContext) {
    }

    override fun enterBlock(ctx: JavaCounterParser.BlockContext) {
    }

    override fun exitBlock(ctx: JavaCounterParser.BlockContext) {
    }

    override fun enterFunctionDeclaration(ctx: JavaCounterParser.FunctionDeclarationContext) {
    }

    override fun exitFunctionDeclaration(ctx: JavaCounterParser.FunctionDeclarationContext) {
        methodsCount++
    }

    override fun enterVariableDeclaration(ctx: JavaCounterParser.VariableDeclarationContext) {
    }

    override fun exitVariableDeclaration(ctx: JavaCounterParser.VariableDeclarationContext) {
    }

    override fun enterExpressionStatement(ctx: JavaCounterParser.ExpressionStatementContext) {
    }

    override fun exitExpressionStatement(ctx: JavaCounterParser.ExpressionStatementContext) {
    }

    override fun enterReturnStatement(ctx: JavaCounterParser.ReturnStatementContext) {
    }

    override fun exitReturnStatement(ctx: JavaCounterParser.ReturnStatementContext) {
    }

    override fun enterStatement(ctx: JavaCounterParser.StatementContext) {
    }

    override fun exitStatement(ctx: JavaCounterParser.StatementContext) {
    }

    override fun enterJavaType(ctx: JavaCounterParser.JavaTypeContext) {
    }

    override fun exitJavaType(ctx: JavaCounterParser.JavaTypeContext) {
    }

    override fun enterParameter(ctx: JavaCounterParser.ParameterContext) {
    }

    override fun exitParameter(ctx: JavaCounterParser.ParameterContext) {
    }

    override fun enterExpression(ctx: JavaCounterParser.ExpressionContext) {
    }

    override fun exitExpression(ctx: JavaCounterParser.ExpressionContext) {
    }

    override fun enterEveryRule(ctx: ParserRuleContext) {
    }

    override fun exitEveryRule(ctx: ParserRuleContext) {
    }

    override fun visitErrorNode(node: ErrorNode) {
    }

    override fun visitTerminal(node: TerminalNode) {
    }

}