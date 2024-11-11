// Generated from D:/00001/Test_Plugin/buildSrc/antlrJava/JavaCounter.g4 by ANTLR 4.13.1
package com.strumenta.antlrjava.parsers.generated

import com.strumenta.antlrkotlin.runtime.JsName
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.misc.*
import org.antlr.v4.kotlinruntime.tree.*
import kotlin.jvm.JvmField

@Suppress(
    // This is required as we are using a custom JsName alias that is not recognized by the IDE.
    // No name clashes will happen tho.
    "JS_NAME_CLASH",
    "UNUSED_VARIABLE",
    "ClassName",
    "FunctionName",
    "LocalVariableName",
    "ConstPropertyName",
    "ConvertSecondaryConstructorToPrimary",
    "CanBeVal",
)
public open class JavaCounterParser(input: TokenStream) : Parser(input) {
    private companion object {
        init {
            RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.runtimeVersion)
        }

        private const val SERIALIZED_ATN: String =
            "\u0004\u0001\u0015\u00ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\u0008\u0007\u0008\u0002\u0009\u0007\u0009\u0002\u000a\u0007\u000a\u0002\u000b\u0007\u000b\u0002\u000c\u0007\u000c\u0001\u0000\u0001\u0000\u0005\u0000\u001d\u0008\u0000\u000a\u0000\u000c\u0000\u0020\u0009\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001\u0025\u0008\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u002d\u0008\u0001\u000a\u0001\u000c\u0001\u0030\u0009\u0001\u0003\u0001\u0032\u0008\u0001\u0001\u0001\u0003\u0001\u0035\u0008\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u003d\u0008\u0001\u000a\u0001\u000c\u0001\u0040\u0009\u0001\u0003\u0001\u0042\u0008\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0046\u0008\u0001\u0001\u0001\u0003\u0001\u0049\u0008\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u004d\u0008\u0002\u000a\u0002\u000c\u0002\u0050\u0009\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0057\u0008\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u005c\u0008\u0004\u000a\u0004\u000c\u0004\u005f\u0009\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005\u0064\u0008\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u006d\u0008\u0005\u000a\u0005\u000c\u0005\u0070\u0009\u0005\u0003\u0005\u0072\u0008\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0077\u0008\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u007f\u0008\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0009\u0001\u0009\u0003\u0009\u008c\u0008\u0009\u0001\u000a\u0001\u000a\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0094\u0008\u000b\u0001\u000c\u0001\u000c\u0001\u000c\u0001\u000c\u0003\u000c\u009a\u0008\u000c\u0001\u000c\u0001\u000c\u0001\u000c\u0001\u000c\u0001\u000c\u0001\u000c\u0005\u000c\u00a2\u0008\u000c\u000a\u000c\u000c\u000c\u00a5\u0009\u000c\u0001\u000c\u0005\u000c\u00a8\u0008\u000c\u000a\u000c\u000c\u000c\u00ab\u0009\u000c\u0001\u000c\u0000\u0001\u0018\u000d\u0000\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0002\u0000\u0010\u0010\u0013\u0013\u00ba\u0000\u001e\u0001\u0000\u0000\u0000\u0002\u0024\u0001\u0000\u0000\u0000\u0004\u004a\u0001\u0000\u0000\u0000\u0006\u0056\u0001\u0000\u0000\u0000\u0008\u0058\u0001\u0000\u0000\u0000\u000a\u0063\u0001\u0000\u0000\u0000\u000c\u007a\u0001\u0000\u0000\u0000\u000e\u0082\u0001\u0000\u0000\u0000\u0010\u0085\u0001\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014\u008d\u0001\u0000\u0000\u0000\u0016\u008f\u0001\u0000\u0000\u0000\u0018\u0099\u0001\u0000\u0000\u0000\u001a\u001d\u0003\u0006\u0003\u0000\u001b\u001d\u0003\u0012\u0009\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0020\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u0021\u0001\u0000\u0000\u0000\u0020\u001e\u0001\u0000\u0000\u0000\u0021\u0022\u0005\u0000\u0000\u0001\u0022\u0001\u0001\u0000\u0000\u0000\u0023\u0025\u0005\u000e\u0000\u0000\u0024\u0023\u0001\u0000\u0000\u0000\u0024\u0025\u0001\u0000\u0000\u0000\u0025\u0026\u0001\u0000\u0000\u0000\u0026\u0027\u0005\u000d\u0000\u0000\u0027\u0034\u0005\u0013\u0000\u0000\u0028\u0031\u0005\u0001\u0000\u0000\u0029\u002e\u0003\u0006\u0003\u0000\u002a\u002b\u0005\u0002\u0000\u0000\u002b\u002d\u0003\u0006\u0003\u0000\u002c\u002a\u0001\u0000\u0000\u0000\u002d\u0030\u0001\u0000\u0000\u0000\u002e\u002c\u0001\u0000\u0000\u0000\u002e\u002f\u0001\u0000\u0000\u0000\u002f\u0032\u0001\u0000\u0000\u0000\u0030\u002e\u0001\u0000\u0000\u0000\u0031\u0029\u0001\u0000\u0000\u0000\u0031\u0032\u0001\u0000\u0000\u0000\u0032\u0033\u0001\u0000\u0000\u0000\u0033\u0035\u0005\u0003\u0000\u0000\u0034\u0028\u0001\u0000\u0000\u0000\u0034\u0035\u0001\u0000\u0000\u0000\u0035\u0045\u0001\u0000\u0000\u0000\u0036\u0037\u0005\u0004\u0000\u0000\u0037\u0038\u0003\u0014\u000a\u0000\u0038\u0041\u0005\u0001\u0000\u0000\u0039\u003e\u0003\u0018\u000c\u0000\u003a\u003b\u0005\u0002\u0000\u0000\u003b\u003d\u0003\u0018\u000c\u0000\u003c\u003a\u0001\u0000\u0000\u0000\u003d\u0040\u0001\u0000\u0000\u0000\u003e\u003c\u0001\u0000\u0000\u0000\u003e\u003f\u0001\u0000\u0000\u0000\u003f\u0042\u0001\u0000\u0000\u0000\u0040\u003e\u0001\u0000\u0000\u0000\u0041\u0039\u0001\u0000\u0000\u0000\u0041\u0042\u0001\u0000\u0000\u0000\u0042\u0043\u0001\u0000\u0000\u0000\u0043\u0044\u0005\u0003\u0000\u0000\u0044\u0046\u0001\u0000\u0000\u0000\u0045\u0036\u0001\u0000\u0000\u0000\u0045\u0046\u0001\u0000\u0000\u0000\u0046\u0048\u0001\u0000\u0000\u0000\u0047\u0049\u0003\u0004\u0002\u0000\u0048\u0047\u0001\u0000\u0000\u0000\u0048\u0049\u0001\u0000\u0000\u0000\u0049\u0003\u0001\u0000\u0000\u0000\u004a\u004e\u0005\u0005\u0000\u0000\u004b\u004d\u0003\u0006\u0003\u0000\u004c\u004b\u0001\u0000\u0000\u0000\u004d\u0050\u0001\u0000\u0000\u0000\u004e\u004c\u0001\u0000\u0000\u0000\u004e\u004f\u0001\u0000\u0000\u0000\u004f\u0051\u0001\u0000\u0000\u0000\u0050\u004e\u0001\u0000\u0000\u0000\u0051\u0052\u0005\u0006\u0000\u0000\u0052\u0005\u0001\u0000\u0000\u0000\u0053\u0057\u0003\u0002\u0001\u0000\u0054\u0057\u0003\u000a\u0005\u0000\u0055\u0057\u0003\u000c\u0006\u0000\u0056\u0053\u0001\u0000\u0000\u0000\u0056\u0054\u0001\u0000\u0000\u0000\u0056\u0055\u0001\u0000\u0000\u0000\u0057\u0007\u0001\u0000\u0000\u0000\u0058\u005d\u0005\u0005\u0000\u0000\u0059\u005c\u0003\u0006\u0003\u0000\u005a\u005c\u0003\u0012\u0009\u0000\u005b\u0059\u0001\u0000\u0000\u0000\u005b\u005a\u0001\u0000\u0000\u0000\u005c\u005f\u0001\u0000\u0000\u0000\u005d\u005b\u0001\u0000\u0000\u0000\u005d\u005e\u0001\u0000\u0000\u0000\u005e\u0060\u0001\u0000\u0000\u0000\u005f\u005d\u0001\u0000\u0000\u0000\u0060\u0061\u0005\u0006\u0000\u0000\u0061\u0009\u0001\u0000\u0000\u0000\u0062\u0064\u0005\u000e\u0000\u0000\u0063\u0062\u0001\u0000\u0000\u0000\u0063\u0064\u0001\u0000\u0000\u0000\u0064\u0065\u0001\u0000\u0000\u0000\u0065\u0066\u0005\u000f\u0000\u0000\u0066\u0067\u0003\u0014\u000a\u0000\u0067\u0068\u0005\u0013\u0000\u0000\u0068\u0071\u0005\u0001\u0000\u0000\u0069\u006e\u0003\u0016\u000b\u0000\u006a\u006b\u0005\u0002\u0000\u0000\u006b\u006d\u0003\u0016\u000b\u0000\u006c\u006a\u0001\u0000\u0000\u0000\u006d\u0070\u0001\u0000\u0000\u0000\u006e\u006c\u0001\u0000\u0000\u0000\u006e\u006f\u0001\u0000\u0000\u0000\u006f\u0072\u0001\u0000\u0000\u0000\u0070\u006e\u0001\u0000\u0000\u0000\u0071\u0069\u0001\u0000\u0000\u0000\u0071\u0072\u0001\u0000\u0000\u0000\u0072\u0073\u0001\u0000\u0000\u0000\u0073\u0076\u0005\u0003\u0000\u0000\u0074\u0075\u0005\u0004\u0000\u0000\u0075\u0077\u0003\u0014\u000a\u0000\u0076\u0074\u0001\u0000\u0000\u0000\u0076\u0077\u0001\u0000\u0000\u0000\u0077\u0078\u0001\u0000\u0000\u0000\u0078\u0079\u0003\u0008\u0004\u0000\u0079\u000b\u0001\u0000\u0000\u0000\u007a\u007b\u0005\u0010\u0000\u0000\u007b\u007e\u0005\u0013\u0000\u0000\u007c\u007d\u0005\u0007\u0000\u0000\u007d\u007f\u0003\u0018\u000c\u0000\u007e\u007c\u0001\u0000\u0000\u0000\u007e\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0008\u0000\u0000\u0081\u000d\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u0018\u000c\u0000\u0083\u0084\u0005\u0008\u0000\u0000\u0084\u000f\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0012\u0000\u0000\u0086\u0087\u0003\u0018\u000c\u0000\u0087\u0088\u0005\u0008\u0000\u0000\u0088\u0011\u0001\u0000\u0000\u0000\u0089\u008c\u0003\u000e\u0007\u0000\u008a\u008c\u0003\u0010\u0008\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008e\u0007\u0000\u0000\u0000\u008e\u0015\u0001\u0000\u0000\u0000\u008f\u0090\u0003\u0014\u000a\u0000\u0090\u0093\u0005\u0013\u0000\u0000\u0091\u0092\u0005\u0007\u0000\u0000\u0092\u0094\u0003\u0018\u000c\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0017\u0001\u0000\u0000\u0000\u0095\u0096\u0006\u000c\uffff\uffff\u0000\u0096\u009a\u0005\u0014\u0000\u0000\u0097\u009a\u0005\u0013\u0000\u0000\u0098\u009a\u0005\u0011\u0000\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u00a9\u0001\u0000\u0000\u0000\u009b\u009c\u000a\u0001\u0000\u0000\u009c\u009d\u0005\u0009\u0000\u0000\u009d\u00a8\u0003\u0018\u000c\u0002\u009e\u009f\u000a\u0002\u0000\u0000\u009f\u00a3\u0005\u0001\u0000\u0000\u00a0\u00a2\u0003\u0018\u000c\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u0003\u0000\u0000\u00a7\u009b\u0001\u0000\u0000\u0000\u00a7\u009e\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u0019\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u0019\u001c\u001e\u0024\u002e\u0031\u0034\u003e\u0041\u0045\u0048\u004e\u0056\u005b\u005d\u0063\u006e\u0071\u0076\u007e\u008b\u0093\u0099\u00a3\u00a7\u00a9"

        private val ATN = ATNDeserializer().deserialize(SERIALIZED_ATN.toCharArray())

        private val DECISION_TO_DFA = Array(ATN.numberOfDecisions) {
            DFA(ATN.getDecisionState(it)!!, it)
        }

        private val SHARED_CONTEXT_CACHE = PredictionContextCache()
        private val RULE_NAMES: Array<String> = arrayOf(
            "javaFile", "classDeclaration", "classBody", "declaration", 
            "block", "functionDeclaration", "variableDeclaration", "expressionStatement", 
            "returnStatement", "statement", "javaType", "parameter", "expression"
        )

        private val LITERAL_NAMES: Array<String?> = arrayOf(
            null, "'('", "','", "')'", "':'", "'{'", "'}'", "'='", "';'", 
            "'.'", null, null, null, null, null, null, null, null, "'return'"
        )

        private val SYMBOLIC_NAMES: Array<String?> = arrayOf(
            null, null, null, null, null, null, null, null, null, null, 
            "LINE_COMMENT", "BLOCK_COMMENT", "PACKAGES", "JAVA_CLASS", "JAVA_ACCESS_MODIFIERS", 
            "JAVA_FUNCTION_MODIFIERS", "JAVA_TYPE", "STRING_LITERALS", "RETURN", 
            "IDENTIFIER", "VALUE", "WS"
        )

        private val VOCABULARY = VocabularyImpl(LITERAL_NAMES, SYMBOLIC_NAMES)

        private val TOKEN_NAMES: Array<String> = Array(SYMBOLIC_NAMES.size) {
            VOCABULARY.getLiteralName(it)
                ?: VOCABULARY.getSymbolicName(it)
                ?: "<INVALID>"
        }
    }

    public object Tokens {
        public const val EOF: Int = -1
        public const val T__0: Int = 1
        public const val T__1: Int = 2
        public const val T__2: Int = 3
        public const val T__3: Int = 4
        public const val T__4: Int = 5
        public const val T__5: Int = 6
        public const val T__6: Int = 7
        public const val T__7: Int = 8
        public const val T__8: Int = 9
        public const val LINE_COMMENT: Int = 10
        public const val BLOCK_COMMENT: Int = 11
        public const val PACKAGES: Int = 12
        public const val JAVA_CLASS: Int = 13
        public const val JAVA_ACCESS_MODIFIERS: Int = 14
        public const val JAVA_FUNCTION_MODIFIERS: Int = 15
        public const val JAVA_TYPE: Int = 16
        public const val STRING_LITERALS: Int = 17
        public const val RETURN: Int = 18
        public const val IDENTIFIER: Int = 19
        public const val VALUE: Int = 20
        public const val WS: Int = 21
    }

    public object Rules {
        public const val JavaFile: Int = 0
        public const val ClassDeclaration: Int = 1
        public const val ClassBody: Int = 2
        public const val Declaration: Int = 3
        public const val Block: Int = 4
        public const val FunctionDeclaration: Int = 5
        public const val VariableDeclaration: Int = 6
        public const val ExpressionStatement: Int = 7
        public const val ReturnStatement: Int = 8
        public const val Statement: Int = 9
        public const val JavaType: Int = 10
        public const val Parameter: Int = 11
        public const val Expression: Int = 12
    }

    override var interpreter: ParserATNSimulator =
        @Suppress("LeakingThis")
        ParserATNSimulator(this, ATN, DECISION_TO_DFA, SHARED_CONTEXT_CACHE)

    override val grammarFileName: String =
        "JavaCounter.g4"

    @Deprecated("Use vocabulary instead", replaceWith = ReplaceWith("vocabulary"))
    override val tokenNames: Array<String> =
        TOKEN_NAMES

    override val ruleNames: Array<String> =
        RULE_NAMES

    override val atn: ATN =
        ATN

    override val vocabulary: Vocabulary =
        VOCABULARY

    override val serializedATN: String =
        SERIALIZED_ATN

    /* Named actions */

    /* Funcs */
    public open class JavaFileContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.JavaFile

        public fun EOF(): TerminalNode = getToken(Tokens.EOF, 0)!!
        public fun declaration(): List<DeclarationContext> = getRuleContexts(DeclarationContext::class)
        public fun declaration(i: Int): DeclarationContext? = getRuleContext(DeclarationContext::class, i)
        public fun statement(): List<StatementContext> = getRuleContexts(StatementContext::class)
        public fun statement(i: Int): StatementContext? = getRuleContext(StatementContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.enterJavaFile(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.exitJavaFile(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is JavaCounterVisitor) {
                visitor.visitJavaFile(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun javaFile(): JavaFileContext {
        var _localctx = JavaFileContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 0, Rules.JavaFile)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 30
            errorHandler.sync(this)
            _la = _input.LA(1)

            while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 2088960L) != 0L)) {
                this.state = 28
                errorHandler.sync(this)

                when (_input.LA(1)) {
                    Tokens.JAVA_CLASS, Tokens.JAVA_ACCESS_MODIFIERS, Tokens.JAVA_FUNCTION_MODIFIERS, Tokens.JAVA_TYPE -> /*LL1AltBlock*/ {
                        this.state = 26
                        declaration()

                    }Tokens.STRING_LITERALS, Tokens.RETURN, Tokens.IDENTIFIER, Tokens.VALUE -> /*LL1AltBlock*/ {
                        this.state = 27
                        statement()

                    }
                    else -> throw NoViableAltException(this)
                }
                this.state = 32
                errorHandler.sync(this)
                _la = _input.LA(1)
            }
            this.state = 33
            match(Tokens.EOF)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class ClassDeclarationContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.ClassDeclaration

        public fun JAVA_CLASS(): TerminalNode = getToken(Tokens.JAVA_CLASS, 0)!!
        public fun IDENTIFIER(): TerminalNode = getToken(Tokens.IDENTIFIER, 0)!!
        public fun JAVA_ACCESS_MODIFIERS(): TerminalNode? = getToken(Tokens.JAVA_ACCESS_MODIFIERS, 0)
        public fun javaType(): JavaTypeContext? = getRuleContext(JavaTypeContext::class, 0)
        public fun classBody(): ClassBodyContext? = getRuleContext(ClassBodyContext::class, 0)
        public fun declaration(): List<DeclarationContext> = getRuleContexts(DeclarationContext::class)
        public fun declaration(i: Int): DeclarationContext? = getRuleContext(DeclarationContext::class, i)
        public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)
        public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.enterClassDeclaration(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.exitClassDeclaration(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is JavaCounterVisitor) {
                visitor.visitClassDeclaration(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun classDeclaration(): ClassDeclarationContext {
        var _localctx = ClassDeclarationContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 2, Rules.ClassDeclaration)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 36
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.JAVA_ACCESS_MODIFIERS) {
                this.state = 35
                match(Tokens.JAVA_ACCESS_MODIFIERS)

            }
            this.state = 38
            match(Tokens.JAVA_CLASS)

            this.state = 39
            match(Tokens.IDENTIFIER)

            this.state = 52
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__0) {
                this.state = 40
                match(Tokens.T__0)

                this.state = 49
                errorHandler.sync(this)
                _la = _input.LA(1)

                if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 122880L) != 0L)) {
                    this.state = 41
                    declaration()

                    this.state = 46
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.T__1) {
                        this.state = 42
                        match(Tokens.T__1)

                        this.state = 43
                        declaration()

                        this.state = 48
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                }
                this.state = 51
                match(Tokens.T__2)

            }
            this.state = 69
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__3) {
                this.state = 54
                match(Tokens.T__3)

                this.state = 55
                javaType()

                this.state = 56
                match(Tokens.T__0)

                this.state = 65
                errorHandler.sync(this)
                _la = _input.LA(1)

                if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 1703936L) != 0L)) {
                    this.state = 57
                    expression(0)

                    this.state = 62
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.T__1) {
                        this.state = 58
                        match(Tokens.T__1)

                        this.state = 59
                        expression(0)

                        this.state = 64
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                }
                this.state = 67
                match(Tokens.T__2)

            }
            this.state = 72
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__4) {
                this.state = 71
                classBody()

            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class ClassBodyContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.ClassBody

        public fun declaration(): List<DeclarationContext> = getRuleContexts(DeclarationContext::class)
        public fun declaration(i: Int): DeclarationContext? = getRuleContext(DeclarationContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.enterClassBody(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.exitClassBody(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is JavaCounterVisitor) {
                visitor.visitClassBody(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun classBody(): ClassBodyContext {
        var _localctx = ClassBodyContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 4, Rules.ClassBody)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 74
            match(Tokens.T__4)

            this.state = 78
            errorHandler.sync(this)
            _la = _input.LA(1)

            while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 122880L) != 0L)) {
                this.state = 75
                declaration()

                this.state = 80
                errorHandler.sync(this)
                _la = _input.LA(1)
            }
            this.state = 81
            match(Tokens.T__5)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class DeclarationContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Declaration

        public fun classDeclaration(): ClassDeclarationContext? = getRuleContext(ClassDeclarationContext::class, 0)
        public fun functionDeclaration(): FunctionDeclarationContext? = getRuleContext(FunctionDeclarationContext::class, 0)
        public fun variableDeclaration(): VariableDeclarationContext? = getRuleContext(VariableDeclarationContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.enterDeclaration(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.exitDeclaration(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is JavaCounterVisitor) {
                visitor.visitDeclaration(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun declaration(): DeclarationContext {
        var _localctx = DeclarationContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 6, Rules.Declaration)

        try {
            this.state = 86
            errorHandler.sync(this)

            when (interpreter.adaptivePredict(_input, 11, context)) {
                1 -> {
                    enterOuterAlt(_localctx, 1)
                    this.state = 83
                    classDeclaration()

                }2 -> {
                    enterOuterAlt(_localctx, 2)
                    this.state = 84
                    functionDeclaration()

                }3 -> {
                    enterOuterAlt(_localctx, 3)
                    this.state = 85
                    variableDeclaration()

                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class BlockContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Block

        public fun declaration(): List<DeclarationContext> = getRuleContexts(DeclarationContext::class)
        public fun declaration(i: Int): DeclarationContext? = getRuleContext(DeclarationContext::class, i)
        public fun statement(): List<StatementContext> = getRuleContexts(StatementContext::class)
        public fun statement(i: Int): StatementContext? = getRuleContext(StatementContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.enterBlock(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.exitBlock(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is JavaCounterVisitor) {
                visitor.visitBlock(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun block(): BlockContext {
        var _localctx = BlockContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 8, Rules.Block)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 88
            match(Tokens.T__4)

            this.state = 93
            errorHandler.sync(this)
            _la = _input.LA(1)

            while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 2088960L) != 0L)) {
                this.state = 91
                errorHandler.sync(this)

                when (_input.LA(1)) {
                    Tokens.JAVA_CLASS, Tokens.JAVA_ACCESS_MODIFIERS, Tokens.JAVA_FUNCTION_MODIFIERS, Tokens.JAVA_TYPE -> /*LL1AltBlock*/ {
                        this.state = 89
                        declaration()

                    }Tokens.STRING_LITERALS, Tokens.RETURN, Tokens.IDENTIFIER, Tokens.VALUE -> /*LL1AltBlock*/ {
                        this.state = 90
                        statement()

                    }
                    else -> throw NoViableAltException(this)
                }
                this.state = 95
                errorHandler.sync(this)
                _la = _input.LA(1)
            }
            this.state = 96
            match(Tokens.T__5)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class FunctionDeclarationContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.FunctionDeclaration

        public fun JAVA_FUNCTION_MODIFIERS(): TerminalNode = getToken(Tokens.JAVA_FUNCTION_MODIFIERS, 0)!!
        public fun javaType(): List<JavaTypeContext> = getRuleContexts(JavaTypeContext::class)
        public fun javaType(i: Int): JavaTypeContext? = getRuleContext(JavaTypeContext::class, i)
        public fun IDENTIFIER(): TerminalNode = getToken(Tokens.IDENTIFIER, 0)!!
        public fun block(): BlockContext = getRuleContext(BlockContext::class, 0)!!
        public fun JAVA_ACCESS_MODIFIERS(): TerminalNode? = getToken(Tokens.JAVA_ACCESS_MODIFIERS, 0)
        public fun parameter(): List<ParameterContext> = getRuleContexts(ParameterContext::class)
        public fun parameter(i: Int): ParameterContext? = getRuleContext(ParameterContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.enterFunctionDeclaration(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.exitFunctionDeclaration(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is JavaCounterVisitor) {
                visitor.visitFunctionDeclaration(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun functionDeclaration(): FunctionDeclarationContext {
        var _localctx = FunctionDeclarationContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 10, Rules.FunctionDeclaration)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 99
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.JAVA_ACCESS_MODIFIERS) {
                this.state = 98
                match(Tokens.JAVA_ACCESS_MODIFIERS)

            }
            this.state = 101
            match(Tokens.JAVA_FUNCTION_MODIFIERS)

            this.state = 102
            javaType()

            this.state = 103
            match(Tokens.IDENTIFIER)

            this.state = 104
            match(Tokens.T__0)

            this.state = 113
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.JAVA_TYPE || _la == Tokens.IDENTIFIER) {
                this.state = 105
                parameter()

                this.state = 110
                errorHandler.sync(this)
                _la = _input.LA(1)

                while (_la == Tokens.T__1) {
                    this.state = 106
                    match(Tokens.T__1)

                    this.state = 107
                    parameter()

                    this.state = 112
                    errorHandler.sync(this)
                    _la = _input.LA(1)
                }
            }
            this.state = 115
            match(Tokens.T__2)

            this.state = 118
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__3) {
                this.state = 116
                match(Tokens.T__3)

                this.state = 117
                javaType()

            }
            this.state = 120
            block()

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class VariableDeclarationContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.VariableDeclaration

        public fun JAVA_TYPE(): TerminalNode = getToken(Tokens.JAVA_TYPE, 0)!!
        public fun IDENTIFIER(): TerminalNode = getToken(Tokens.IDENTIFIER, 0)!!
        public fun expression(): ExpressionContext? = getRuleContext(ExpressionContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.enterVariableDeclaration(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.exitVariableDeclaration(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is JavaCounterVisitor) {
                visitor.visitVariableDeclaration(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun variableDeclaration(): VariableDeclarationContext {
        var _localctx = VariableDeclarationContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 12, Rules.VariableDeclaration)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 122
            match(Tokens.JAVA_TYPE)

            this.state = 123
            match(Tokens.IDENTIFIER)

            this.state = 126
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__6) {
                this.state = 124
                match(Tokens.T__6)

                this.state = 125
                expression(0)

            }
            this.state = 128
            match(Tokens.T__7)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class ExpressionStatementContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.ExpressionStatement

        public fun expression(): ExpressionContext = getRuleContext(ExpressionContext::class, 0)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.enterExpressionStatement(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.exitExpressionStatement(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is JavaCounterVisitor) {
                visitor.visitExpressionStatement(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun expressionStatement(): ExpressionStatementContext {
        var _localctx = ExpressionStatementContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 14, Rules.ExpressionStatement)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 130
            expression(0)

            this.state = 131
            match(Tokens.T__7)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class ReturnStatementContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.ReturnStatement

        public fun RETURN(): TerminalNode = getToken(Tokens.RETURN, 0)!!
        public fun expression(): ExpressionContext = getRuleContext(ExpressionContext::class, 0)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.enterReturnStatement(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.exitReturnStatement(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is JavaCounterVisitor) {
                visitor.visitReturnStatement(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun returnStatement(): ReturnStatementContext {
        var _localctx = ReturnStatementContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 16, Rules.ReturnStatement)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 133
            match(Tokens.RETURN)

            this.state = 134
            expression(0)

            this.state = 135
            match(Tokens.T__7)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class StatementContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Statement

        public fun expressionStatement(): ExpressionStatementContext? = getRuleContext(ExpressionStatementContext::class, 0)
        public fun returnStatement(): ReturnStatementContext? = getRuleContext(ReturnStatementContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.enterStatement(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.exitStatement(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is JavaCounterVisitor) {
                visitor.visitStatement(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun statement(): StatementContext {
        var _localctx = StatementContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 18, Rules.Statement)

        try {
            this.state = 139
            errorHandler.sync(this)

            when (_input.LA(1)) {
                Tokens.STRING_LITERALS, Tokens.IDENTIFIER, Tokens.VALUE -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    this.state = 137
                    expressionStatement()

                }Tokens.RETURN -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    this.state = 138
                    returnStatement()

                }
                else -> throw NoViableAltException(this)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class JavaTypeContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.JavaType

        public fun JAVA_TYPE(): TerminalNode? = getToken(Tokens.JAVA_TYPE, 0)
        public fun IDENTIFIER(): TerminalNode? = getToken(Tokens.IDENTIFIER, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.enterJavaType(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.exitJavaType(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is JavaCounterVisitor) {
                visitor.visitJavaType(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun javaType(): JavaTypeContext {
        var _localctx = JavaTypeContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 20, Rules.JavaType)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 141
            _la = _input.LA(1)

            if (!(_la == Tokens.JAVA_TYPE || _la == Tokens.IDENTIFIER)) {
                errorHandler.recoverInline(this)
            }
            else {
                if (_input.LA(1) == Tokens.EOF) {
                    isMatchedEOF = true
                }

                errorHandler.reportMatch(this)
                consume()
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class ParameterContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Parameter

        public fun javaType(): JavaTypeContext = getRuleContext(JavaTypeContext::class, 0)!!
        public fun IDENTIFIER(): TerminalNode = getToken(Tokens.IDENTIFIER, 0)!!
        public fun expression(): ExpressionContext? = getRuleContext(ExpressionContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.enterParameter(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.exitParameter(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is JavaCounterVisitor) {
                visitor.visitParameter(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun parameter(): ParameterContext {
        var _localctx = ParameterContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 22, Rules.Parameter)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 143
            javaType()

            this.state = 144
            match(Tokens.IDENTIFIER)

            this.state = 147
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__6) {
                this.state = 145
                match(Tokens.T__6)

                this.state = 146
                expression(0)

            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class ExpressionContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Expression

        public fun VALUE(): TerminalNode? = getToken(Tokens.VALUE, 0)
        public fun IDENTIFIER(): TerminalNode? = getToken(Tokens.IDENTIFIER, 0)
        public fun STRING_LITERALS(): TerminalNode? = getToken(Tokens.STRING_LITERALS, 0)
        public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)
        public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.enterExpression(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is JavaCounterListener) {
                listener.exitExpression(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is JavaCounterVisitor) {
                visitor.visitExpression(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun expression(): ExpressionContext {
        return expression(0)
    }

    private fun expression(_p: Int): ExpressionContext {
        var _parentctx = context
        var _parentState = state
        var _localctx = ExpressionContext(context, _parentState)
        var _prevctx = _localctx
        var _startState = 24
        var _token: Token?
        var _ctx: RuleContext?

        enterRecursionRule(_localctx, 24, Rules.Expression, _p)
        var _la: Int

        try {
            var _alt: Int
            enterOuterAlt(_localctx, 1)
            this.state = 153
            errorHandler.sync(this)

            when (_input.LA(1)) {
                Tokens.VALUE -> /*LL1AltBlock*/ {
                    this.state = 150
                    match(Tokens.VALUE)

                }Tokens.IDENTIFIER -> /*LL1AltBlock*/ {
                    this.state = 151
                    match(Tokens.IDENTIFIER)

                }Tokens.STRING_LITERALS -> /*LL1AltBlock*/ {
                    this.state = 152
                    match(Tokens.STRING_LITERALS)

                }
                else -> throw NoViableAltException(this)
            }
            context!!.stop = _input.LT(-1)
            this.state = 169
            errorHandler.sync(this)
            _alt = interpreter.adaptivePredict(_input, 24, context)

            while (_alt != 2 && _alt != INVALID_ALT_NUMBER) {
                if (_alt == 1 ) {
                    if (_parseListeners.isNotEmpty()) {
                        triggerExitRuleEvent()
                    }

                    _prevctx = _localctx
                    this.state = 167
                    errorHandler.sync(this)

                    when (interpreter.adaptivePredict(_input, 23, context)) {
                        1 -> {
                            _localctx = ExpressionContext(_parentctx, _parentState)
                            pushNewRecursionContext(_localctx, _startState, Rules.Expression)
                            this.state = 155

                            if (!(precpred(context!!, 1))) {
                                throw FailedPredicateException(this, "precpred(context!!, 1)")
                            }
                            this.state = 156
                            match(Tokens.T__8)

                            this.state = 157
                            expression(2)

                        }2 -> {
                            _localctx = ExpressionContext(_parentctx, _parentState)
                            pushNewRecursionContext(_localctx, _startState, Rules.Expression)
                            this.state = 158

                            if (!(precpred(context!!, 2))) {
                                throw FailedPredicateException(this, "precpred(context!!, 2)")
                            }
                            this.state = 159
                            match(Tokens.T__0)

                            this.state = 163
                            errorHandler.sync(this)
                            _la = _input.LA(1)

                            while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 1703936L) != 0L)) {
                                this.state = 160
                                expression(0)

                                this.state = 165
                                errorHandler.sync(this)
                                _la = _input.LA(1)
                            }
                            this.state = 166
                            match(Tokens.T__2)

                        }
                    } 
                }

                this.state = 171
                errorHandler.sync(this)
                _alt = interpreter.adaptivePredict(_input, 24, context)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            unrollRecursionContexts(_parentctx)
        }

        return _localctx
    }

    override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int): Boolean {
        when (ruleIndex) {
            12 -> return expression_sempred(_localctx as ExpressionContext?, predIndex)
        }

        return true
    }

    @Suppress("UNSAFE_CALL")
    private fun expression_sempred(_localctx: ExpressionContext?, predIndex: Int): Boolean {
        when (predIndex) {
            0 -> return (precpred(context!!, 1))
            1 -> return (precpred(context!!, 2))
        }

        return true
    }
}
