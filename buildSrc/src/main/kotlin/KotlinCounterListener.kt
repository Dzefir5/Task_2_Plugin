import com.strumenta.antlrkotlin.parsers.generated.CounterListener
import com.strumenta.antlrkotlin.parsers.generated.CounterParser
import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.tree.ErrorNode
import org.antlr.v4.kotlinruntime.tree.TerminalNode


class KotlinCounterListener : CounterListener{
    var classCount = 0
    var methodsCount = 0
    override fun enterKotlinFile(ctx: CounterParser.KotlinFileContext) {
    }

    override fun exitKotlinFile(ctx: CounterParser.KotlinFileContext) {
    }

    override fun enterClassDeclaration(ctx: CounterParser.ClassDeclarationContext) {
    }

    override fun exitClassDeclaration(ctx: CounterParser.ClassDeclarationContext) {
    }

    override fun enterClassBody(ctx: CounterParser.ClassBodyContext) {
    }

    override fun exitClassBody(ctx: CounterParser.ClassBodyContext) {
    }

    override fun enterDeclaration(ctx: CounterParser.DeclarationContext) {
    }

    override fun exitDeclaration(ctx: CounterParser.DeclarationContext) {
    }

    override fun enterBlock(ctx: CounterParser.BlockContext) {
    }

    override fun exitBlock(ctx: CounterParser.BlockContext) {

    }

    override fun enterFunDeclaration(ctx: CounterParser.FunDeclarationContext) {

    }

    override fun exitFunDeclaration(ctx: CounterParser.FunDeclarationContext) {

    }

    override fun enterValDeclaration(ctx: CounterParser.ValDeclarationContext) {

    }

    override fun exitValDeclaration(ctx: CounterParser.ValDeclarationContext) {

    }

    override fun enterVarDeclaration(ctx: CounterParser.VarDeclarationContext) {

    }

    override fun exitVarDeclaration(ctx: CounterParser.VarDeclarationContext) {

    }

    override fun enterExpressionStatement(ctx: CounterParser.ExpressionStatementContext) {

    }

    override fun exitExpressionStatement(ctx: CounterParser.ExpressionStatementContext) {

    }

    override fun enterReturnStatement(ctx: CounterParser.ReturnStatementContext) {

    }

    override fun exitReturnStatement(ctx: CounterParser.ReturnStatementContext) {

    }

    override fun enterStatement(ctx: CounterParser.StatementContext) {

    }

    override fun exitStatement(ctx: CounterParser.StatementContext) {

    }

    override fun enterKotlinType(ctx: CounterParser.KotlinTypeContext) {

    }

    override fun exitKotlinType(ctx: CounterParser.KotlinTypeContext) {

    }

    override fun enterParameter(ctx: CounterParser.ParameterContext) {

    }

    override fun exitParameter(ctx: CounterParser.ParameterContext) {

    }

    override fun enterExpression(ctx: CounterParser.ExpressionContext) {

    }

    override fun exitExpression(ctx: CounterParser.ExpressionContext) {

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