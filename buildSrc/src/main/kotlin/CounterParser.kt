// Generated from D:/00001/Test_Plugin/antlr/Counter.g4 by ANTLR 4.13.1
package com.strumenta.antlrkotlin.parsers.generated

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
public open class CounterParser(input: TokenStream) : Parser(input) {
    private companion object {
        init {
            RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.runtimeVersion)
        }

        private const val SERIALIZED_ATN: String =
            "\u0004\u0001\u0015\u00a1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\u0008\u0007\u0008\u0002\u0009\u0007\u0009\u0002\u000a\u0007\u000a\u0002\u000b\u0007\u000b\u0002\u000c\u0007\u000c\u0002\u000d\u0007\u000d\u0001\u0000\u0001\u0000\u0005\u0000\u001f\u0008\u0000\u000a\u0000\u000c\u0000\u0022\u0009\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u002c\u0008\u0001\u000a\u0001\u000c\u0001\u002f\u0009\u0001\u0003\u0001\u0031\u0008\u0001\u0001\u0001\u0003\u0001\u0034\u0008\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u003c\u0008\u0001\u000a\u0001\u000c\u0001\u003f\u0009\u0001\u0003\u0001\u0041\u0008\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0045\u0008\u0001\u0001\u0001\u0003\u0001\u0048\u0008\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u004c\u0008\u0002\u000a\u0002\u000c\u0002\u004f\u0009\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0057\u0008\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u005c\u0008\u0004\u000a\u0004\u000c\u0004\u005f\u0009\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0069\u0008\u0005\u000a\u0005\u000c\u0005\u006c\u0009\u0005\u0003\u0005\u006e\u0008\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0073\u0008\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u007b\u0008\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u007f\u0008\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0085\u0008\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0089\u0008\u0007\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0009\u0001\u0009\u0001\u0009\u0001\u0009\u0001\u000a\u0001\u000a\u0003\u000a\u0094\u0008\u000a\u0001\u000b\u0001\u000b\u0001\u000c\u0001\u000c\u0001\u000c\u0001\u000c\u0001\u000c\u0003\u000c\u009d\u0008\u000c\u0001\u000d\u0001\u000d\u0001\u000d\u0000\u0000\u000e\u0000\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0001\u0002\u0000\u0011\u0011\u0014\u0014\u00aa\u0000\u0020\u0001\u0000\u0000\u0000\u0002\u0025\u0001\u0000\u0000\u0000\u0004\u0049\u0001\u0000\u0000\u0000\u0006\u0056\u0001\u0000\u0000\u0000\u0008\u0058\u0001\u0000\u0000\u0000\u000a\u0062\u0001\u0000\u0000\u0000\u000c\u0076\u0001\u0000\u0000\u0000\u000e\u0080\u0001\u0000\u0000\u0000\u0010\u008a\u0001\u0000\u0000\u0000\u0012\u008d\u0001\u0000\u0000\u0000\u0014\u0093\u0001\u0000\u0000\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018\u0097\u0001\u0000\u0000\u0000\u001a\u009e\u0001\u0000\u0000\u0000\u001c\u001f\u0003\u0006\u0003\u0000\u001d\u001f\u0003\u0014\u000a\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\u0022\u0001\u0000\u0000\u0000\u0020\u001e\u0001\u0000\u0000\u0000\u0020\u0021\u0001\u0000\u0000\u0000\u0021\u0023\u0001\u0000\u0000\u0000\u0022\u0020\u0001\u0000\u0000\u0000\u0023\u0024\u0005\u0000\u0000\u0001\u0024\u0001\u0001\u0000\u0000\u0000\u0025\u0026\u0005\u000c\u0000\u0000\u0026\u0033\u0005\u0014\u0000\u0000\u0027\u0030\u0005\u0001\u0000\u0000\u0028\u002d\u0003\u0006\u0003\u0000\u0029\u002a\u0005\u0002\u0000\u0000\u002a\u002c\u0003\u0006\u0003\u0000\u002b\u0029\u0001\u0000\u0000\u0000\u002c\u002f\u0001\u0000\u0000\u0000\u002d\u002b\u0001\u0000\u0000\u0000\u002d\u002e\u0001\u0000\u0000\u0000\u002e\u0031\u0001\u0000\u0000\u0000\u002f\u002d\u0001\u0000\u0000\u0000\u0030\u0028\u0001\u0000\u0000\u0000\u0030\u0031\u0001\u0000\u0000\u0000\u0031\u0032\u0001\u0000\u0000\u0000\u0032\u0034\u0005\u0003\u0000\u0000\u0033\u0027\u0001\u0000\u0000\u0000\u0033\u0034\u0001\u0000\u0000\u0000\u0034\u0044\u0001\u0000\u0000\u0000\u0035\u0036\u0005\u0004\u0000\u0000\u0036\u0037\u0003\u0016\u000b\u0000\u0037\u0040\u0005\u0001\u0000\u0000\u0038\u003d\u0003\u001a\u000d\u0000\u0039\u003a\u0005\u0002\u0000\u0000\u003a\u003c\u0003\u001a\u000d\u0000\u003b\u0039\u0001\u0000\u0000\u0000\u003c\u003f\u0001\u0000\u0000\u0000\u003d\u003b\u0001\u0000\u0000\u0000\u003d\u003e\u0001\u0000\u0000\u0000\u003e\u0041\u0001\u0000\u0000\u0000\u003f\u003d\u0001\u0000\u0000\u0000\u0040\u0038\u0001\u0000\u0000\u0000\u0040\u0041\u0001\u0000\u0000\u0000\u0041\u0042\u0001\u0000\u0000\u0000\u0042\u0043\u0005\u0003\u0000\u0000\u0043\u0045\u0001\u0000\u0000\u0000\u0044\u0035\u0001\u0000\u0000\u0000\u0044\u0045\u0001\u0000\u0000\u0000\u0045\u0047\u0001\u0000\u0000\u0000\u0046\u0048\u0003\u0004\u0002\u0000\u0047\u0046\u0001\u0000\u0000\u0000\u0047\u0048\u0001\u0000\u0000\u0000\u0048\u0003\u0001\u0000\u0000\u0000\u0049\u004d\u0005\u0005\u0000\u0000\u004a\u004c\u0003\u0006\u0003\u0000\u004b\u004a\u0001\u0000\u0000\u0000\u004c\u004f\u0001\u0000\u0000\u0000\u004d\u004b\u0001\u0000\u0000\u0000\u004d\u004e\u0001\u0000\u0000\u0000\u004e\u0050\u0001\u0000\u0000\u0000\u004f\u004d\u0001\u0000\u0000\u0000\u0050\u0051\u0005\u0006\u0000\u0000\u0051\u0005\u0001\u0000\u0000\u0000\u0052\u0057\u0003\u0002\u0001\u0000\u0053\u0057\u0003\u000a\u0005\u0000\u0054\u0057\u0003\u000c\u0006\u0000\u0055\u0057\u0003\u000e\u0007\u0000\u0056\u0052\u0001\u0000\u0000\u0000\u0056\u0053\u0001\u0000\u0000\u0000\u0056\u0054\u0001\u0000\u0000\u0000\u0056\u0055\u0001\u0000\u0000\u0000\u0057\u0007\u0001\u0000\u0000\u0000\u0058\u005d\u0005\u0005\u0000\u0000\u0059\u005c\u0003\u0006\u0003\u0000\u005a\u005c\u0003\u0014\u000a\u0000\u005b\u0059\u0001\u0000\u0000\u0000\u005b\u005a\u0001\u0000\u0000\u0000\u005c\u005f\u0001\u0000\u0000\u0000\u005d\u005b\u0001\u0000\u0000\u0000\u005d\u005e\u0001\u0000\u0000\u0000\u005e\u0060\u0001\u0000\u0000\u0000\u005f\u005d\u0001\u0000\u0000\u0000\u0060\u0061\u0005\u0006\u0000\u0000\u0061\u0009\u0001\u0000\u0000\u0000\u0062\u0063\u0005\u000d\u0000\u0000\u0063\u0064\u0005\u0014\u0000\u0000\u0064\u006d\u0005\u0001\u0000\u0000\u0065\u006a\u0003\u0018\u000c\u0000\u0066\u0067\u0005\u0002\u0000\u0000\u0067\u0069\u0003\u0018\u000c\u0000\u0068\u0066\u0001\u0000\u0000\u0000\u0069\u006c\u0001\u0000\u0000\u0000\u006a\u0068\u0001\u0000\u0000\u0000\u006a\u006b\u0001\u0000\u0000\u0000\u006b\u006e\u0001\u0000\u0000\u0000\u006c\u006a\u0001\u0000\u0000\u0000\u006d\u0065\u0001\u0000\u0000\u0000\u006d\u006e\u0001\u0000\u0000\u0000\u006e\u006f\u0001\u0000\u0000\u0000\u006f\u0072\u0005\u0003\u0000\u0000\u0070\u0071\u0005\u0004\u0000\u0000\u0071\u0073\u0003\u0016\u000b\u0000\u0072\u0070\u0001\u0000\u0000\u0000\u0072\u0073\u0001\u0000\u0000\u0000\u0073\u0074\u0001\u0000\u0000\u0000\u0074\u0075\u0003\u0008\u0004\u0000\u0075\u000b\u0001\u0000\u0000\u0000\u0076\u0077\u0005\u000e\u0000\u0000\u0077\u007a\u0005\u0014\u0000\u0000\u0078\u0079\u0005\u0004\u0000\u0000\u0079\u007b\u0003\u0016\u000b\u0000\u007a\u0078\u0001\u0000\u0000\u0000\u007a\u007b\u0001\u0000\u0000\u0000\u007b\u007e\u0001\u0000\u0000\u0000\u007c\u007d\u0005\u0007\u0000\u0000\u007d\u007f\u0003\u001a\u000d\u0000\u007e\u007c\u0001\u0000\u0000\u0000\u007e\u007f\u0001\u0000\u0000\u0000\u007f\u000d\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u000f\u0000\u0000\u0081\u0084\u0005\u0014\u0000\u0000\u0082\u0083\u0005\u0004\u0000\u0000\u0083\u0085\u0003\u0016\u000b\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0007\u0000\u0000\u0087\u0089\u0003\u001a\u000d\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u000f\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u001a\u000d\u0000\u008b\u008c\u0005\u0008\u0000\u0000\u008c\u0011\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0013\u0000\u0000\u008e\u008f\u0003\u001a\u000d\u0000\u008f\u0090\u0005\u0008\u0000\u0000\u0090\u0013\u0001\u0000\u0000\u0000\u0091\u0094\u0003\u0010\u0008\u0000\u0092\u0094\u0003\u0012\u0009\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0015\u0001\u0000\u0000\u0000\u0095\u0096\u0007\u0000\u0000\u0000\u0096\u0017\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0014\u0000\u0000\u0098\u0099\u0005\u0004\u0000\u0000\u0099\u009c\u0003\u0016\u000b\u0000\u009a\u009b\u0005\u0007\u0000\u0000\u009b\u009d\u0003\u001a\u000d\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u0019\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0014\u0000\u0000\u009f\u001b\u0001\u0000\u0000\u0000\u0016\u001e\u0020\u002d\u0030\u0033\u003d\u0040\u0044\u0047\u004d\u0056\u005b\u005d\u006a\u006d\u0072\u007a\u007e\u0084\u0088\u0093\u009c"

        private val ATN = ATNDeserializer().deserialize(SERIALIZED_ATN.toCharArray())

        private val DECISION_TO_DFA = Array(ATN.numberOfDecisions) {
            DFA(ATN.getDecisionState(it)!!, it)
        }

        private val SHARED_CONTEXT_CACHE = PredictionContextCache()
        private val RULE_NAMES: Array<String> = arrayOf(
            "kotlinFile", "classDeclaration", "classBody", "declaration", 
            "block", "funDeclaration", "valDeclaration", "varDeclaration", 
            "expressionStatement", "returnStatement", "statement", "kotlinType", 
            "parameter", "expression"
        )

        private val LITERAL_NAMES: Array<String?> = arrayOf(
            null, "'('", "','", "')'", "':'", "'{'", "'}'", "'='", "';'", 
            null, null, null, "'class'", "'fun'", "'val'", "'var'", "'interface'", 
            null, null, "'return'"
        )

        private val SYMBOLIC_NAMES: Array<String?> = arrayOf(
            null, null, null, null, null, null, null, null, null, "LINE_COMMENT", 
            "BLOCK_COMMENT", "PACKAGES", "KOTLIN_CLASS", "KOTLIN_FUN", "KOTLIN_VAL", 
            "KOTLIN_VAR", "KOTLIN_INTERFACE_IDENTIFIER", "KOTLIN_TYPE", 
            "STRING_LITERALS", "RETURN", "IDENTIFIER", "WS"
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
        public const val LINE_COMMENT: Int = 9
        public const val BLOCK_COMMENT: Int = 10
        public const val PACKAGES: Int = 11
        public const val KOTLIN_CLASS: Int = 12
        public const val KOTLIN_FUN: Int = 13
        public const val KOTLIN_VAL: Int = 14
        public const val KOTLIN_VAR: Int = 15
        public const val KOTLIN_INTERFACE_IDENTIFIER: Int = 16
        public const val KOTLIN_TYPE: Int = 17
        public const val STRING_LITERALS: Int = 18
        public const val RETURN: Int = 19
        public const val IDENTIFIER: Int = 20
        public const val WS: Int = 21
    }

    public object Rules {
        public const val KotlinFile: Int = 0
        public const val ClassDeclaration: Int = 1
        public const val ClassBody: Int = 2
        public const val Declaration: Int = 3
        public const val Block: Int = 4
        public const val FunDeclaration: Int = 5
        public const val ValDeclaration: Int = 6
        public const val VarDeclaration: Int = 7
        public const val ExpressionStatement: Int = 8
        public const val ReturnStatement: Int = 9
        public const val Statement: Int = 10
        public const val KotlinType: Int = 11
        public const val Parameter: Int = 12
        public const val Expression: Int = 13
    }

    override var interpreter: ParserATNSimulator =
        @Suppress("LeakingThis")
        ParserATNSimulator(this, ATN, DECISION_TO_DFA, SHARED_CONTEXT_CACHE)

    override val grammarFileName: String =
        "Counter.g4"

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
    public open class KotlinFileContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.KotlinFile

        public fun EOF(): TerminalNode = getToken(Tokens.EOF, 0)!!
        public fun declaration(): List<DeclarationContext> = getRuleContexts(DeclarationContext::class)
        public fun declaration(i: Int): DeclarationContext? = getRuleContext(DeclarationContext::class, i)
        public fun statement(): List<StatementContext> = getRuleContexts(StatementContext::class)
        public fun statement(i: Int): StatementContext? = getRuleContext(StatementContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.enterKotlinFile(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitKotlinFile(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
                visitor.visitKotlinFile(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun kotlinFile(): KotlinFileContext {
        var _localctx = KotlinFileContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 0, Rules.KotlinFile)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 32
            errorHandler.sync(this)
            _la = _input.LA(1)

            while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 1634304L) != 0L)) {
                this.state = 30
                errorHandler.sync(this)

                when (_input.LA(1)) {
                    Tokens.KOTLIN_CLASS, Tokens.KOTLIN_FUN, Tokens.KOTLIN_VAL, Tokens.KOTLIN_VAR -> /*LL1AltBlock*/ {
                        this.state = 28
                        declaration()

                    }Tokens.RETURN, Tokens.IDENTIFIER -> /*LL1AltBlock*/ {
                        this.state = 29
                        statement()

                    }
                    else -> throw NoViableAltException(this)
                }
                this.state = 34
                errorHandler.sync(this)
                _la = _input.LA(1)
            }
            this.state = 35
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

        public fun KOTLIN_CLASS(): TerminalNode = getToken(Tokens.KOTLIN_CLASS, 0)!!
        public fun IDENTIFIER(): TerminalNode = getToken(Tokens.IDENTIFIER, 0)!!
        public fun kotlinType(): KotlinTypeContext? = getRuleContext(KotlinTypeContext::class, 0)
        public fun classBody(): ClassBodyContext? = getRuleContext(ClassBodyContext::class, 0)
        public fun declaration(): List<DeclarationContext> = getRuleContexts(DeclarationContext::class)
        public fun declaration(i: Int): DeclarationContext? = getRuleContext(DeclarationContext::class, i)
        public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)
        public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.enterClassDeclaration(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitClassDeclaration(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
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
            this.state = 37
            match(Tokens.KOTLIN_CLASS)

            this.state = 38
            match(Tokens.IDENTIFIER)

            this.state = 51
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__0) {
                this.state = 39
                match(Tokens.T__0)

                this.state = 48
                errorHandler.sync(this)
                _la = _input.LA(1)

                if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 61440L) != 0L)) {
                    this.state = 40
                    declaration()

                    this.state = 45
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.T__1) {
                        this.state = 41
                        match(Tokens.T__1)

                        this.state = 42
                        declaration()

                        this.state = 47
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                }
                this.state = 50
                match(Tokens.T__2)

            }
            this.state = 68
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__3) {
                this.state = 53
                match(Tokens.T__3)

                this.state = 54
                kotlinType()

                this.state = 55
                match(Tokens.T__0)

                this.state = 64
                errorHandler.sync(this)
                _la = _input.LA(1)

                if (_la == Tokens.IDENTIFIER) {
                    this.state = 56
                    expression()

                    this.state = 61
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.T__1) {
                        this.state = 57
                        match(Tokens.T__1)

                        this.state = 58
                        expression()

                        this.state = 63
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                }
                this.state = 66
                match(Tokens.T__2)

            }
            this.state = 71
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__4) {
                this.state = 70
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
            if (listener is CounterListener) {
                listener.enterClassBody(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitClassBody(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
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
            this.state = 73
            match(Tokens.T__4)

            this.state = 77
            errorHandler.sync(this)
            _la = _input.LA(1)

            while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 61440L) != 0L)) {
                this.state = 74
                declaration()

                this.state = 79
                errorHandler.sync(this)
                _la = _input.LA(1)
            }
            this.state = 80
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
        public fun funDeclaration(): FunDeclarationContext? = getRuleContext(FunDeclarationContext::class, 0)
        public fun valDeclaration(): ValDeclarationContext? = getRuleContext(ValDeclarationContext::class, 0)
        public fun varDeclaration(): VarDeclarationContext? = getRuleContext(VarDeclarationContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.enterDeclaration(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitDeclaration(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
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

            when (_input.LA(1)) {
                Tokens.KOTLIN_CLASS -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    this.state = 82
                    classDeclaration()

                }Tokens.KOTLIN_FUN -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    this.state = 83
                    funDeclaration()

                }Tokens.KOTLIN_VAL -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 3)
                    this.state = 84
                    valDeclaration()

                }Tokens.KOTLIN_VAR -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 4)
                    this.state = 85
                    varDeclaration()

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

    public open class BlockContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Block

        public fun declaration(): List<DeclarationContext> = getRuleContexts(DeclarationContext::class)
        public fun declaration(i: Int): DeclarationContext? = getRuleContext(DeclarationContext::class, i)
        public fun statement(): List<StatementContext> = getRuleContexts(StatementContext::class)
        public fun statement(i: Int): StatementContext? = getRuleContext(StatementContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.enterBlock(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitBlock(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
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

            while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 1634304L) != 0L)) {
                this.state = 91
                errorHandler.sync(this)

                when (_input.LA(1)) {
                    Tokens.KOTLIN_CLASS, Tokens.KOTLIN_FUN, Tokens.KOTLIN_VAL, Tokens.KOTLIN_VAR -> /*LL1AltBlock*/ {
                        this.state = 89
                        declaration()

                    }Tokens.RETURN, Tokens.IDENTIFIER -> /*LL1AltBlock*/ {
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

    public open class FunDeclarationContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.FunDeclaration

        public fun KOTLIN_FUN(): TerminalNode = getToken(Tokens.KOTLIN_FUN, 0)!!
        public fun IDENTIFIER(): TerminalNode = getToken(Tokens.IDENTIFIER, 0)!!
        public fun block(): BlockContext = getRuleContext(BlockContext::class, 0)!!
        public fun parameter(): List<ParameterContext> = getRuleContexts(ParameterContext::class)
        public fun parameter(i: Int): ParameterContext? = getRuleContext(ParameterContext::class, i)
        public fun kotlinType(): KotlinTypeContext? = getRuleContext(KotlinTypeContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.enterFunDeclaration(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitFunDeclaration(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
                visitor.visitFunDeclaration(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun funDeclaration(): FunDeclarationContext {
        var _localctx = FunDeclarationContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 10, Rules.FunDeclaration)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 98
            match(Tokens.KOTLIN_FUN)

            this.state = 99
            match(Tokens.IDENTIFIER)

            this.state = 100
            match(Tokens.T__0)

            this.state = 109
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.IDENTIFIER) {
                this.state = 101
                parameter()

                this.state = 106
                errorHandler.sync(this)
                _la = _input.LA(1)

                while (_la == Tokens.T__1) {
                    this.state = 102
                    match(Tokens.T__1)

                    this.state = 103
                    parameter()

                    this.state = 108
                    errorHandler.sync(this)
                    _la = _input.LA(1)
                }
            }
            this.state = 111
            match(Tokens.T__2)

            this.state = 114
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__3) {
                this.state = 112
                match(Tokens.T__3)

                this.state = 113
                kotlinType()

            }
            this.state = 116
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

    public open class ValDeclarationContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.ValDeclaration

        public fun KOTLIN_VAL(): TerminalNode = getToken(Tokens.KOTLIN_VAL, 0)!!
        public fun IDENTIFIER(): TerminalNode = getToken(Tokens.IDENTIFIER, 0)!!
        public fun kotlinType(): KotlinTypeContext? = getRuleContext(KotlinTypeContext::class, 0)
        public fun expression(): ExpressionContext? = getRuleContext(ExpressionContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.enterValDeclaration(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitValDeclaration(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
                visitor.visitValDeclaration(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun valDeclaration(): ValDeclarationContext {
        var _localctx = ValDeclarationContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 12, Rules.ValDeclaration)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 118
            match(Tokens.KOTLIN_VAL)

            this.state = 119
            match(Tokens.IDENTIFIER)

            this.state = 122
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__3) {
                this.state = 120
                match(Tokens.T__3)

                this.state = 121
                kotlinType()

            }
            this.state = 126
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__6) {
                this.state = 124
                match(Tokens.T__6)

                this.state = 125
                expression()

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

    public open class VarDeclarationContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.VarDeclaration

        public fun KOTLIN_VAR(): TerminalNode = getToken(Tokens.KOTLIN_VAR, 0)!!
        public fun IDENTIFIER(): TerminalNode = getToken(Tokens.IDENTIFIER, 0)!!
        public fun kotlinType(): KotlinTypeContext? = getRuleContext(KotlinTypeContext::class, 0)
        public fun expression(): ExpressionContext? = getRuleContext(ExpressionContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.enterVarDeclaration(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitVarDeclaration(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
                visitor.visitVarDeclaration(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun varDeclaration(): VarDeclarationContext {
        var _localctx = VarDeclarationContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 14, Rules.VarDeclaration)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 128
            match(Tokens.KOTLIN_VAR)

            this.state = 129
            match(Tokens.IDENTIFIER)

            this.state = 132
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__3) {
                this.state = 130
                match(Tokens.T__3)

                this.state = 131
                kotlinType()

            }
            this.state = 136
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__6) {
                this.state = 134
                match(Tokens.T__6)

                this.state = 135
                expression()

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

    public open class ExpressionStatementContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.ExpressionStatement

        public fun expression(): ExpressionContext = getRuleContext(ExpressionContext::class, 0)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.enterExpressionStatement(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitExpressionStatement(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
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

        enterRule(_localctx, 16, Rules.ExpressionStatement)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 138
            expression()

            this.state = 139
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
            if (listener is CounterListener) {
                listener.enterReturnStatement(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitReturnStatement(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
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

        enterRule(_localctx, 18, Rules.ReturnStatement)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 141
            match(Tokens.RETURN)

            this.state = 142
            expression()

            this.state = 143
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
            if (listener is CounterListener) {
                listener.enterStatement(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitStatement(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
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

        enterRule(_localctx, 20, Rules.Statement)

        try {
            this.state = 147
            errorHandler.sync(this)

            when (_input.LA(1)) {
                Tokens.IDENTIFIER -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    this.state = 145
                    expressionStatement()

                }Tokens.RETURN -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    this.state = 146
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

    public open class KotlinTypeContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.KotlinType

        public fun KOTLIN_TYPE(): TerminalNode? = getToken(Tokens.KOTLIN_TYPE, 0)
        public fun IDENTIFIER(): TerminalNode? = getToken(Tokens.IDENTIFIER, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.enterKotlinType(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitKotlinType(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
                visitor.visitKotlinType(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun kotlinType(): KotlinTypeContext {
        var _localctx = KotlinTypeContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 22, Rules.KotlinType)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 149
            _la = _input.LA(1)

            if (!(_la == Tokens.KOTLIN_TYPE || _la == Tokens.IDENTIFIER)) {
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

        public fun IDENTIFIER(): TerminalNode = getToken(Tokens.IDENTIFIER, 0)!!
        public fun kotlinType(): KotlinTypeContext = getRuleContext(KotlinTypeContext::class, 0)!!
        public fun expression(): ExpressionContext? = getRuleContext(ExpressionContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.enterParameter(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitParameter(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
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

        enterRule(_localctx, 24, Rules.Parameter)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 151
            match(Tokens.IDENTIFIER)

            this.state = 152
            match(Tokens.T__3)

            this.state = 153
            kotlinType()

            this.state = 156
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.T__6) {
                this.state = 154
                match(Tokens.T__6)

                this.state = 155
                expression()

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

        public fun IDENTIFIER(): TerminalNode = getToken(Tokens.IDENTIFIER, 0)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.enterExpression(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is CounterListener) {
                listener.exitExpression(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is CounterVisitor) {
                visitor.visitExpression(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun expression(): ExpressionContext {
        var _localctx = ExpressionContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 26, Rules.Expression)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 158
            match(Tokens.IDENTIFIER)

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
}
