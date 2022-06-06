// Generated from C:/Users/XingWcheng/Desktop/JavaProject/exp2/lab2/src\MIDL.g4 by ANTLR 4.10.1
package MIDL;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MIDLParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, WS = 4, KW_MODULE = 5, KW_STRUCT = 6, KW_BOOLEAN = 7,
            KW_SHORT = 8, KW_LONG = 9, KW_UNSIGNED = 10, KW_INT8 = 11, KW_INT16 = 12, KW_INT32 = 13,
            KW_INT64 = 14, KW_UINT8 = 15, KW_UINT16 = 16, KW_UINT32 = 17, KW_UINT64 = 18, KW_CHAR = 19,
            KW_STRING = 20, KW_FLOAT = 21, KW_DOUBLE = 22, KW_TRUE = 23, KW_FALSE = 24, LEFT_BRACE = 25,
            RIGHT_BRACE = 26, LEFT_SQUARE_BRACKET = 27, RIGHT_SQUARE_BRACKET = 28, SEMICOLON = 29,
            COMMA = 30, PLUS = 31, MINUS = 32, SLASH = 33, STAR = 34, PERCENT = 35, RIGHT_SHIFT = 36,
            LEFT_SHIFT = 37, EQUAL = 38, AMPERSAND = 39, PIPE = 40, TILDE = 41, CARET = 42, COLON = 43,
            DOUBLE_COLON = 44, ID = 45, LETTER = 46, UNDERLINE = 47, INTEGER_TYPE_SUFFIX = 48,
            FLOATING_PT = 49, INTEGER = 50, DIGIT = 51, EXPONENT = 52, FLOAT_TYPE_SUFFIX = 53,
            ESCAPE_SEQUENCE = 54, CHAR = 55, STRING = 56, BOOLEAN = 57;
    public static final int
            RULE_specification = 0, RULE_definition = 1, RULE_module = 2, RULE_type_decl = 3,
            RULE_struct_type = 4, RULE_member_list = 5, RULE_type_spec = 6, RULE_scoped_name = 7,
            RULE_base_type_spec = 8, RULE_floating_pt_type = 9, RULE_integer_type = 10,
            RULE_signed_int = 11, RULE_unsigned_int = 12, RULE_declarators = 13, RULE_declarator = 14,
            RULE_simple_declarator = 15, RULE_array_declarator = 16, RULE_exp_list = 17,
            RULE_or_expr = 18, RULE_xor_expr = 19, RULE_and_expr = 20, RULE_shift_expr = 21,
            RULE_add_expr = 22, RULE_mult_expr = 23, RULE_unary_expr = 24, RULE_literal = 25;

    private static String[] makeRuleNames() {
        return new String[]{
                "specification", "definition", "module", "type_decl", "struct_type",
                "member_list", "type_spec", "scoped_name", "base_type_spec", "floating_pt_type",
                "integer_type", "signed_int", "unsigned_int", "declarators", "declarator",
                "simple_declarator", "array_declarator", "exp_list", "or_expr", "xor_expr",
                "and_expr", "shift_expr", "add_expr", "mult_expr", "unary_expr", "literal"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'long double'", "'uint16 '", "'uint32 '", null, "'module'", "'struct'",
                "'boolean'", "'short'", "'long'", "'unsigned'", "'int8'", "'int16'",
                "'int32'", "'int64'", "'uint8'", "'uint16'", "'uint32'", "'uint64'",
                "'char'", "'string'", "'float'", "'double'", "'true'", "'false'", "'{'",
                "'}'", "'['", "']'", "';'", "','", "'+'", "'-'", "'/'", "'*'", "'%'",
                "'>>'", "'<<'", "'='", "'&'", "'|'", "'~'", "'^'", "':'", "'::'", null,
                null, "'_'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, "WS", "KW_MODULE", "KW_STRUCT", "KW_BOOLEAN",
                "KW_SHORT", "KW_LONG", "KW_UNSIGNED", "KW_INT8", "KW_INT16", "KW_INT32",
                "KW_INT64", "KW_UINT8", "KW_UINT16", "KW_UINT32", "KW_UINT64", "KW_CHAR",
                "KW_STRING", "KW_FLOAT", "KW_DOUBLE", "KW_TRUE", "KW_FALSE", "LEFT_BRACE",
                "RIGHT_BRACE", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "SEMICOLON",
                "COMMA", "PLUS", "MINUS", "SLASH", "STAR", "PERCENT", "RIGHT_SHIFT",
                "LEFT_SHIFT", "EQUAL", "AMPERSAND", "PIPE", "TILDE", "CARET", "COLON",
                "DOUBLE_COLON", "ID", "LETTER", "UNDERLINE", "INTEGER_TYPE_SUFFIX", "FLOATING_PT",
                "INTEGER", "DIGIT", "EXPONENT", "FLOAT_TYPE_SUFFIX", "ESCAPE_SEQUENCE",
                "CHAR", "STRING", "BOOLEAN"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "MIDL.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public MIDLParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class SpecificationContext extends ParserRuleContext {
        public List<DefinitionContext> definition() {
            return getRuleContexts(DefinitionContext.class);
        }

        public DefinitionContext definition(int i) {
            return getRuleContext(DefinitionContext.class, i);
        }

        public SpecificationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_specification;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterSpecification(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitSpecification(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitSpecification(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SpecificationContext specification() throws RecognitionException {
        SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_specification);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(53);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(52);
                            definition();
                        }
                    }
                    setState(55);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == KW_MODULE || _la == KW_STRUCT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DefinitionContext extends ParserRuleContext {
        public Type_declContext type_decl() {
            return getRuleContext(Type_declContext.class, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(MIDLParser.SEMICOLON, 0);
        }

        public ModuleContext module() {
            return getRuleContext(ModuleContext.class, 0);
        }

        public DefinitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterDefinition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitDefinition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitDefinition(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DefinitionContext definition() throws RecognitionException {
        DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_definition);
        try {
            setState(63);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case KW_STRUCT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(57);
                    type_decl();
                    setState(58);
                    match(SEMICOLON);
                }
                break;
                case KW_MODULE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(60);
                    module();
                    setState(61);
                    match(SEMICOLON);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ModuleContext extends ParserRuleContext {
        public TerminalNode KW_MODULE() {
            return getToken(MIDLParser.KW_MODULE, 0);
        }

        public TerminalNode ID() {
            return getToken(MIDLParser.ID, 0);
        }

        public TerminalNode LEFT_BRACE() {
            return getToken(MIDLParser.LEFT_BRACE, 0);
        }

        public TerminalNode RIGHT_BRACE() {
            return getToken(MIDLParser.RIGHT_BRACE, 0);
        }

        public List<DefinitionContext> definition() {
            return getRuleContexts(DefinitionContext.class);
        }

        public DefinitionContext definition(int i) {
            return getRuleContext(DefinitionContext.class, i);
        }

        public ModuleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_module;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterModule(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitModule(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitModule(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ModuleContext module() throws RecognitionException {
        ModuleContext _localctx = new ModuleContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_module);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(65);
                match(KW_MODULE);
                setState(66);
                match(ID);
                setState(67);
                match(LEFT_BRACE);
                setState(69);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(68);
                            definition();
                        }
                    }
                    setState(71);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == KW_MODULE || _la == KW_STRUCT);
                setState(73);
                match(RIGHT_BRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Type_declContext extends ParserRuleContext {
        public Struct_typeContext struct_type() {
            return getRuleContext(Struct_typeContext.class, 0);
        }

        public TerminalNode KW_STRUCT() {
            return getToken(MIDLParser.KW_STRUCT, 0);
        }

        public TerminalNode ID() {
            return getToken(MIDLParser.ID, 0);
        }

        public Type_declContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type_decl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterType_decl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitType_decl(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitType_decl(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Type_declContext type_decl() throws RecognitionException {
        Type_declContext _localctx = new Type_declContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_type_decl);
        try {
            setState(78);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(75);
                    struct_type();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(76);
                    match(KW_STRUCT);
                    setState(77);
                    match(ID);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Struct_typeContext extends ParserRuleContext {
        public TerminalNode KW_STRUCT() {
            return getToken(MIDLParser.KW_STRUCT, 0);
        }

        public TerminalNode ID() {
            return getToken(MIDLParser.ID, 0);
        }

        public TerminalNode LEFT_BRACE() {
            return getToken(MIDLParser.LEFT_BRACE, 0);
        }

        public Member_listContext member_list() {
            return getRuleContext(Member_listContext.class, 0);
        }

        public TerminalNode RIGHT_BRACE() {
            return getToken(MIDLParser.RIGHT_BRACE, 0);
        }

        public Struct_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_struct_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterStruct_type(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitStruct_type(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitStruct_type(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Struct_typeContext struct_type() throws RecognitionException {
        Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_struct_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(80);
                match(KW_STRUCT);
                setState(81);
                match(ID);
                setState(82);
                match(LEFT_BRACE);
                setState(83);
                member_list();
                setState(84);
                match(RIGHT_BRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Member_listContext extends ParserRuleContext {
        public List<Type_specContext> type_spec() {
            return getRuleContexts(Type_specContext.class);
        }

        public Type_specContext type_spec(int i) {
            return getRuleContext(Type_specContext.class, i);
        }

        public List<DeclaratorsContext> declarators() {
            return getRuleContexts(DeclaratorsContext.class);
        }

        public DeclaratorsContext declarators(int i) {
            return getRuleContext(DeclaratorsContext.class, i);
        }

        public List<TerminalNode> SEMICOLON() {
            return getTokens(MIDLParser.SEMICOLON);
        }

        public TerminalNode SEMICOLON(int i) {
            return getToken(MIDLParser.SEMICOLON, i);
        }

        public Member_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_member_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterMember_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitMember_list(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitMember_list(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Member_listContext member_list() throws RecognitionException {
        Member_listContext _localctx = new Member_listContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_member_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << KW_STRUCT) | (1L << KW_BOOLEAN) | (1L << KW_SHORT) | (1L << KW_LONG) | (1L << KW_UNSIGNED) | (1L << KW_INT8) | (1L << KW_INT16) | (1L << KW_INT32) | (1L << KW_INT64) | (1L << KW_UINT8) | (1L << KW_UINT64) | (1L << KW_CHAR) | (1L << KW_STRING) | (1L << KW_FLOAT) | (1L << KW_DOUBLE) | (1L << DOUBLE_COLON) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(86);
                            type_spec();
                            setState(87);
                            declarators();
                            setState(88);
                            match(SEMICOLON);
                        }
                    }
                    setState(94);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Type_specContext extends ParserRuleContext {
        public Scoped_nameContext scoped_name() {
            return getRuleContext(Scoped_nameContext.class, 0);
        }

        public Base_type_specContext base_type_spec() {
            return getRuleContext(Base_type_specContext.class, 0);
        }

        public Struct_typeContext struct_type() {
            return getRuleContext(Struct_typeContext.class, 0);
        }

        public Type_specContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type_spec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterType_spec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitType_spec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitType_spec(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Type_specContext type_spec() throws RecognitionException {
        Type_specContext _localctx = new Type_specContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_type_spec);
        try {
            setState(98);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case DOUBLE_COLON:
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(95);
                    scoped_name();
                }
                break;
                case T__0:
                case T__1:
                case T__2:
                case KW_BOOLEAN:
                case KW_SHORT:
                case KW_LONG:
                case KW_UNSIGNED:
                case KW_INT8:
                case KW_INT16:
                case KW_INT32:
                case KW_INT64:
                case KW_UINT8:
                case KW_UINT64:
                case KW_CHAR:
                case KW_STRING:
                case KW_FLOAT:
                case KW_DOUBLE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(96);
                    base_type_spec();
                }
                break;
                case KW_STRUCT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(97);
                    struct_type();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Scoped_nameContext extends ParserRuleContext {
        public List<TerminalNode> ID() {
            return getTokens(MIDLParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(MIDLParser.ID, i);
        }

        public List<TerminalNode> DOUBLE_COLON() {
            return getTokens(MIDLParser.DOUBLE_COLON);
        }

        public TerminalNode DOUBLE_COLON(int i) {
            return getToken(MIDLParser.DOUBLE_COLON, i);
        }

        public Scoped_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_scoped_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterScoped_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitScoped_name(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitScoped_name(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Scoped_nameContext scoped_name() throws RecognitionException {
        Scoped_nameContext _localctx = new Scoped_nameContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_scoped_name);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(104);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(101);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == DOUBLE_COLON) {
                                    {
                                        setState(100);
                                        match(DOUBLE_COLON);
                                    }
                                }

                                setState(103);
                                match(ID);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(106);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Base_type_specContext extends ParserRuleContext {
        public Floating_pt_typeContext floating_pt_type() {
            return getRuleContext(Floating_pt_typeContext.class, 0);
        }

        public Integer_typeContext integer_type() {
            return getRuleContext(Integer_typeContext.class, 0);
        }

        public TerminalNode KW_CHAR() {
            return getToken(MIDLParser.KW_CHAR, 0);
        }

        public TerminalNode KW_STRING() {
            return getToken(MIDLParser.KW_STRING, 0);
        }

        public TerminalNode KW_BOOLEAN() {
            return getToken(MIDLParser.KW_BOOLEAN, 0);
        }

        public Base_type_specContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_base_type_spec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterBase_type_spec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitBase_type_spec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitBase_type_spec(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Base_type_specContext base_type_spec() throws RecognitionException {
        Base_type_specContext _localctx = new Base_type_specContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_base_type_spec);
        try {
            setState(113);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__0:
                case KW_FLOAT:
                case KW_DOUBLE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(108);
                    floating_pt_type();
                }
                break;
                case T__1:
                case T__2:
                case KW_SHORT:
                case KW_LONG:
                case KW_UNSIGNED:
                case KW_INT8:
                case KW_INT16:
                case KW_INT32:
                case KW_INT64:
                case KW_UINT8:
                case KW_UINT64:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(109);
                    integer_type();
                }
                break;
                case KW_CHAR:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(110);
                    match(KW_CHAR);
                }
                break;
                case KW_STRING:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(111);
                    match(KW_STRING);
                }
                break;
                case KW_BOOLEAN:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(112);
                    match(KW_BOOLEAN);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Floating_pt_typeContext extends ParserRuleContext {
        public TerminalNode KW_FLOAT() {
            return getToken(MIDLParser.KW_FLOAT, 0);
        }

        public TerminalNode KW_DOUBLE() {
            return getToken(MIDLParser.KW_DOUBLE, 0);
        }

        public Floating_pt_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_floating_pt_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterFloating_pt_type(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitFloating_pt_type(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitFloating_pt_type(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Floating_pt_typeContext floating_pt_type() throws RecognitionException {
        Floating_pt_typeContext _localctx = new Floating_pt_typeContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_floating_pt_type);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(115);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << KW_FLOAT) | (1L << KW_DOUBLE))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Integer_typeContext extends ParserRuleContext {
        public Signed_intContext signed_int() {
            return getRuleContext(Signed_intContext.class, 0);
        }

        public Unsigned_intContext unsigned_int() {
            return getRuleContext(Unsigned_intContext.class, 0);
        }

        public Integer_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_integer_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterInteger_type(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitInteger_type(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitInteger_type(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Integer_typeContext integer_type() throws RecognitionException {
        Integer_typeContext _localctx = new Integer_typeContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_integer_type);
        try {
            setState(119);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case KW_SHORT:
                case KW_LONG:
                case KW_INT8:
                case KW_INT16:
                case KW_INT32:
                case KW_INT64:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(117);
                    signed_int();
                }
                break;
                case T__1:
                case T__2:
                case KW_UNSIGNED:
                case KW_UINT8:
                case KW_UINT64:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(118);
                    unsigned_int();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Signed_intContext extends ParserRuleContext {
        public TerminalNode KW_SHORT() {
            return getToken(MIDLParser.KW_SHORT, 0);
        }

        public TerminalNode KW_INT16() {
            return getToken(MIDLParser.KW_INT16, 0);
        }

        public List<TerminalNode> KW_LONG() {
            return getTokens(MIDLParser.KW_LONG);
        }

        public TerminalNode KW_LONG(int i) {
            return getToken(MIDLParser.KW_LONG, i);
        }

        public TerminalNode KW_INT32() {
            return getToken(MIDLParser.KW_INT32, 0);
        }

        public TerminalNode KW_INT64() {
            return getToken(MIDLParser.KW_INT64, 0);
        }

        public TerminalNode KW_INT8() {
            return getToken(MIDLParser.KW_INT8, 0);
        }

        public Signed_intContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_signed_int;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterSigned_int(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitSigned_int(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitSigned_int(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Signed_intContext signed_int() throws RecognitionException {
        Signed_intContext _localctx = new Signed_intContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_signed_int);
        int _la;
        try {
            setState(129);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(121);
                    _la = _input.LA(1);
                    if (!(_la == KW_SHORT || _la == KW_INT16)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(122);
                    _la = _input.LA(1);
                    if (!(_la == KW_LONG || _la == KW_INT32)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(126);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case KW_LONG: {
                            setState(123);
                            match(KW_LONG);
                            setState(124);
                            match(KW_LONG);
                        }
                        break;
                        case KW_INT64: {
                            setState(125);
                            match(KW_INT64);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(128);
                    match(KW_INT8);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Unsigned_intContext extends ParserRuleContext {
        public TerminalNode KW_UNSIGNED() {
            return getToken(MIDLParser.KW_UNSIGNED, 0);
        }

        public TerminalNode KW_SHORT() {
            return getToken(MIDLParser.KW_SHORT, 0);
        }

        public List<TerminalNode> KW_LONG() {
            return getTokens(MIDLParser.KW_LONG);
        }

        public TerminalNode KW_LONG(int i) {
            return getToken(MIDLParser.KW_LONG, i);
        }

        public TerminalNode KW_UINT64() {
            return getToken(MIDLParser.KW_UINT64, 0);
        }

        public TerminalNode KW_UINT8() {
            return getToken(MIDLParser.KW_UINT8, 0);
        }

        public Unsigned_intContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unsigned_int;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterUnsigned_int(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitUnsigned_int(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitUnsigned_int(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Unsigned_intContext unsigned_int() throws RecognitionException {
        Unsigned_intContext _localctx = new Unsigned_intContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_unsigned_int);
        try {
            setState(148);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(134);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case KW_UNSIGNED: {
                            setState(131);
                            match(KW_UNSIGNED);
                            setState(132);
                            match(KW_SHORT);
                        }
                        break;
                        case T__1: {
                            setState(133);
                            match(T__1);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(139);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case KW_UNSIGNED: {
                            setState(136);
                            match(KW_UNSIGNED);
                            setState(137);
                            match(KW_LONG);
                        }
                        break;
                        case T__2: {
                            setState(138);
                            match(T__2);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(145);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case KW_UNSIGNED: {
                            setState(141);
                            match(KW_UNSIGNED);
                            setState(142);
                            match(KW_LONG);
                            setState(143);
                            match(KW_LONG);
                        }
                        break;
                        case KW_UINT64: {
                            setState(144);
                            match(KW_UINT64);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(147);
                    match(KW_UINT8);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DeclaratorsContext extends ParserRuleContext {
        public List<DeclaratorContext> declarator() {
            return getRuleContexts(DeclaratorContext.class);
        }

        public DeclaratorContext declarator(int i) {
            return getRuleContext(DeclaratorContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(MIDLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(MIDLParser.COMMA, i);
        }

        public DeclaratorsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declarators;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterDeclarators(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitDeclarators(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitDeclarators(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DeclaratorsContext declarators() throws RecognitionException {
        DeclaratorsContext _localctx = new DeclaratorsContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_declarators);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(150);
                declarator();
                setState(155);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(151);
                            match(COMMA);
                            setState(152);
                            declarator();
                        }
                    }
                    setState(157);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DeclaratorContext extends ParserRuleContext {
        public Simple_declaratorContext simple_declarator() {
            return getRuleContext(Simple_declaratorContext.class, 0);
        }

        public Array_declaratorContext array_declarator() {
            return getRuleContext(Array_declaratorContext.class, 0);
        }

        public DeclaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterDeclarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitDeclarator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitDeclarator(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DeclaratorContext declarator() throws RecognitionException {
        DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_declarator);
        try {
            setState(160);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(158);
                    simple_declarator();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(159);
                    array_declarator();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Simple_declaratorContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(MIDLParser.ID, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(MIDLParser.EQUAL, 0);
        }

        public Or_exprContext or_expr() {
            return getRuleContext(Or_exprContext.class, 0);
        }

        public Simple_declaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_simple_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterSimple_declarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitSimple_declarator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor)
                return ((MIDLVisitor<? extends T>) visitor).visitSimple_declarator(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Simple_declaratorContext simple_declarator() throws RecognitionException {
        Simple_declaratorContext _localctx = new Simple_declaratorContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_simple_declarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(162);
                match(ID);
                setState(165);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EQUAL) {
                    {
                        setState(163);
                        match(EQUAL);
                        setState(164);
                        or_expr();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Array_declaratorContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(MIDLParser.ID, 0);
        }

        public TerminalNode LEFT_SQUARE_BRACKET() {
            return getToken(MIDLParser.LEFT_SQUARE_BRACKET, 0);
        }

        public Or_exprContext or_expr() {
            return getRuleContext(Or_exprContext.class, 0);
        }

        public TerminalNode RIGHT_SQUARE_BRACKET() {
            return getToken(MIDLParser.RIGHT_SQUARE_BRACKET, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(MIDLParser.EQUAL, 0);
        }

        public Exp_listContext exp_list() {
            return getRuleContext(Exp_listContext.class, 0);
        }

        public Array_declaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterArray_declarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitArray_declarator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitArray_declarator(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Array_declaratorContext array_declarator() throws RecognitionException {
        Array_declaratorContext _localctx = new Array_declaratorContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_array_declarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(167);
                match(ID);
                setState(168);
                match(LEFT_SQUARE_BRACKET);
                setState(169);
                or_expr();
                setState(170);
                match(RIGHT_SQUARE_BRACKET);
                setState(173);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EQUAL) {
                    {
                        setState(171);
                        match(EQUAL);
                        setState(172);
                        exp_list();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Exp_listContext extends ParserRuleContext {
        public TerminalNode LEFT_SQUARE_BRACKET() {
            return getToken(MIDLParser.LEFT_SQUARE_BRACKET, 0);
        }

        public List<Or_exprContext> or_expr() {
            return getRuleContexts(Or_exprContext.class);
        }

        public Or_exprContext or_expr(int i) {
            return getRuleContext(Or_exprContext.class, i);
        }

        public TerminalNode RIGHT_SQUARE_BRACKET() {
            return getToken(MIDLParser.RIGHT_SQUARE_BRACKET, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(MIDLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(MIDLParser.COMMA, i);
        }

        public Exp_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exp_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterExp_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitExp_list(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitExp_list(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Exp_listContext exp_list() throws RecognitionException {
        Exp_listContext _localctx = new Exp_listContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_exp_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(175);
                match(LEFT_SQUARE_BRACKET);
                setState(176);
                or_expr();
                setState(181);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(177);
                            match(COMMA);
                            setState(178);
                            or_expr();
                        }
                    }
                    setState(183);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(184);
                match(RIGHT_SQUARE_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Or_exprContext extends ParserRuleContext {
        public List<Xor_exprContext> xor_expr() {
            return getRuleContexts(Xor_exprContext.class);
        }

        public Xor_exprContext xor_expr(int i) {
            return getRuleContext(Xor_exprContext.class, i);
        }

        public List<TerminalNode> PIPE() {
            return getTokens(MIDLParser.PIPE);
        }

        public TerminalNode PIPE(int i) {
            return getToken(MIDLParser.PIPE, i);
        }

        public Or_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_or_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterOr_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitOr_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitOr_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Or_exprContext or_expr() throws RecognitionException {
        Or_exprContext _localctx = new Or_exprContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_or_expr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(186);
                xor_expr();
                setState(191);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == PIPE) {
                    {
                        {
                            setState(187);
                            match(PIPE);
                            setState(188);
                            xor_expr();
                        }
                    }
                    setState(193);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xor_exprContext extends ParserRuleContext {
        public List<And_exprContext> and_expr() {
            return getRuleContexts(And_exprContext.class);
        }

        public And_exprContext and_expr(int i) {
            return getRuleContext(And_exprContext.class, i);
        }

        public List<TerminalNode> CARET() {
            return getTokens(MIDLParser.CARET);
        }

        public TerminalNode CARET(int i) {
            return getToken(MIDLParser.CARET, i);
        }

        public Xor_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_xor_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterXor_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitXor_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitXor_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Xor_exprContext xor_expr() throws RecognitionException {
        Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_xor_expr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(194);
                and_expr();
                setState(199);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == CARET) {
                    {
                        {
                            setState(195);
                            match(CARET);
                            setState(196);
                            and_expr();
                        }
                    }
                    setState(201);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class And_exprContext extends ParserRuleContext {
        public List<Shift_exprContext> shift_expr() {
            return getRuleContexts(Shift_exprContext.class);
        }

        public Shift_exprContext shift_expr(int i) {
            return getRuleContext(Shift_exprContext.class, i);
        }

        public List<TerminalNode> AMPERSAND() {
            return getTokens(MIDLParser.AMPERSAND);
        }

        public TerminalNode AMPERSAND(int i) {
            return getToken(MIDLParser.AMPERSAND, i);
        }

        public And_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_and_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterAnd_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitAnd_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitAnd_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final And_exprContext and_expr() throws RecognitionException {
        And_exprContext _localctx = new And_exprContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_and_expr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(202);
                shift_expr();
                setState(207);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == AMPERSAND) {
                    {
                        {
                            setState(203);
                            match(AMPERSAND);
                            setState(204);
                            shift_expr();
                        }
                    }
                    setState(209);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Shift_exprContext extends ParserRuleContext {
        public List<Add_exprContext> add_expr() {
            return getRuleContexts(Add_exprContext.class);
        }

        public Add_exprContext add_expr(int i) {
            return getRuleContext(Add_exprContext.class, i);
        }

        public List<TerminalNode> RIGHT_SHIFT() {
            return getTokens(MIDLParser.RIGHT_SHIFT);
        }

        public TerminalNode RIGHT_SHIFT(int i) {
            return getToken(MIDLParser.RIGHT_SHIFT, i);
        }

        public List<TerminalNode> LEFT_SHIFT() {
            return getTokens(MIDLParser.LEFT_SHIFT);
        }

        public TerminalNode LEFT_SHIFT(int i) {
            return getToken(MIDLParser.LEFT_SHIFT, i);
        }

        public Shift_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_shift_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterShift_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitShift_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitShift_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Shift_exprContext shift_expr() throws RecognitionException {
        Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_shift_expr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(210);
                add_expr();
                setState(215);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == RIGHT_SHIFT || _la == LEFT_SHIFT) {
                    {
                        {
                            setState(211);
                            _la = _input.LA(1);
                            if (!(_la == RIGHT_SHIFT || _la == LEFT_SHIFT)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(212);
                            add_expr();
                        }
                    }
                    setState(217);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Add_exprContext extends ParserRuleContext {
        public List<Mult_exprContext> mult_expr() {
            return getRuleContexts(Mult_exprContext.class);
        }

        public Mult_exprContext mult_expr(int i) {
            return getRuleContext(Mult_exprContext.class, i);
        }

        public List<TerminalNode> PLUS() {
            return getTokens(MIDLParser.PLUS);
        }

        public TerminalNode PLUS(int i) {
            return getToken(MIDLParser.PLUS, i);
        }

        public List<TerminalNode> MINUS() {
            return getTokens(MIDLParser.MINUS);
        }

        public TerminalNode MINUS(int i) {
            return getToken(MIDLParser.MINUS, i);
        }

        public Add_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_add_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterAdd_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitAdd_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitAdd_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Add_exprContext add_expr() throws RecognitionException {
        Add_exprContext _localctx = new Add_exprContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_add_expr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(218);
                mult_expr();
                setState(223);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == PLUS || _la == MINUS) {
                    {
                        {
                            setState(219);
                            _la = _input.LA(1);
                            if (!(_la == PLUS || _la == MINUS)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(220);
                            mult_expr();
                        }
                    }
                    setState(225);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Mult_exprContext extends ParserRuleContext {
        public List<Unary_exprContext> unary_expr() {
            return getRuleContexts(Unary_exprContext.class);
        }

        public Unary_exprContext unary_expr(int i) {
            return getRuleContext(Unary_exprContext.class, i);
        }

        public List<TerminalNode> STAR() {
            return getTokens(MIDLParser.STAR);
        }

        public TerminalNode STAR(int i) {
            return getToken(MIDLParser.STAR, i);
        }

        public List<TerminalNode> SLASH() {
            return getTokens(MIDLParser.SLASH);
        }

        public TerminalNode SLASH(int i) {
            return getToken(MIDLParser.SLASH, i);
        }

        public List<TerminalNode> PERCENT() {
            return getTokens(MIDLParser.PERCENT);
        }

        public TerminalNode PERCENT(int i) {
            return getToken(MIDLParser.PERCENT, i);
        }

        public Mult_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mult_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterMult_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitMult_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitMult_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Mult_exprContext mult_expr() throws RecognitionException {
        Mult_exprContext _localctx = new Mult_exprContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_mult_expr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(226);
                unary_expr();
                setState(231);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0)) {
                    {
                        {
                            setState(227);
                            _la = _input.LA(1);
                            if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0))) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(228);
                            unary_expr();
                        }
                    }
                    setState(233);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Unary_exprContext extends ParserRuleContext {
        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public TerminalNode MINUS() {
            return getToken(MIDLParser.MINUS, 0);
        }

        public TerminalNode PLUS() {
            return getToken(MIDLParser.PLUS, 0);
        }

        public TerminalNode TILDE() {
            return getToken(MIDLParser.TILDE, 0);
        }

        public Unary_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unary_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterUnary_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitUnary_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitUnary_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Unary_exprContext unary_expr() throws RecognitionException {
        Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_unary_expr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(235);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0)) {
                    {
                        setState(234);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(237);
                literal();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LiteralContext extends ParserRuleContext {
        public TerminalNode INTEGER() {
            return getToken(MIDLParser.INTEGER, 0);
        }

        public TerminalNode FLOATING_PT() {
            return getToken(MIDLParser.FLOATING_PT, 0);
        }

        public TerminalNode CHAR() {
            return getToken(MIDLParser.CHAR, 0);
        }

        public TerminalNode STRING() {
            return getToken(MIDLParser.STRING, 0);
        }

        public TerminalNode BOOLEAN() {
            return getToken(MIDLParser.BOOLEAN, 0);
        }

        public LiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_literal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).enterLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLListener) ((MIDLListener) listener).exitLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLVisitor) return ((MIDLVisitor<? extends T>) visitor).visitLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LiteralContext literal() throws RecognitionException {
        LiteralContext _localctx = new LiteralContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_literal);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(239);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOATING_PT) | (1L << INTEGER) | (1L << CHAR) | (1L << STRING) | (1L << BOOLEAN))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\u0004\u00019\u00f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
                    "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012" +
                    "\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015" +
                    "\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018" +
                    "\u0002\u0019\u0007\u0019\u0001\u0000\u0004\u00006\b\u0000\u000b\u0000" +
                    "\f\u00007\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0003\u0001@\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0004\u0002F\b\u0002\u000b\u0002\f\u0002G\u0001\u0002\u0001" +
                    "\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001" +
                    "\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005[\b\u0005\n\u0005" +
                    "\f\u0005^\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006c\b\u0006" +
                    "\u0001\u0007\u0003\u0007f\b\u0007\u0001\u0007\u0004\u0007i\b\u0007\u000b" +
                    "\u0007\f\u0007j\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\br\b\b\u0001" +
                    "\t\u0001\t\u0001\n\u0001\n\u0003\nx\b\n\u0001\u000b\u0001\u000b\u0001" +
                    "\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u007f\b\u000b\u0001\u000b\u0003" +
                    "\u000b\u0082\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u0087\b\f\u0001\f" +
                    "\u0001\f\u0001\f\u0003\f\u008c\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003" +
                    "\f\u0092\b\f\u0001\f\u0003\f\u0095\b\f\u0001\r\u0001\r\u0001\r\u0005\r" +
                    "\u009a\b\r\n\r\f\r\u009d\t\r\u0001\u000e\u0001\u000e\u0003\u000e\u00a1" +
                    "\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a6\b\u000f" +
                    "\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010" +
                    "\u0003\u0010\u00ae\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011" +
                    "\u0005\u0011\u00b4\b\u0011\n\u0011\f\u0011\u00b7\t\u0011\u0001\u0011\u0001" +
                    "\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00be\b\u0012\n" +
                    "\u0012\f\u0012\u00c1\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005" +
                    "\u0013\u00c6\b\u0013\n\u0013\f\u0013\u00c9\t\u0013\u0001\u0014\u0001\u0014" +
                    "\u0001\u0014\u0005\u0014\u00ce\b\u0014\n\u0014\f\u0014\u00d1\t\u0014\u0001" +
                    "\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00d6\b\u0015\n\u0015\f\u0015" +
                    "\u00d9\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00de\b" +
                    "\u0016\n\u0016\f\u0016\u00e1\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017" +
                    "\u0005\u0017\u00e6\b\u0017\n\u0017\f\u0017\u00e9\t\u0017\u0001\u0018\u0003" +
                    "\u0018\u00ec\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001" +
                    "\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012" +
                    "\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\b\u0002\u0000\u0001" +
                    "\u0001\u0015\u0016\u0002\u0000\b\b\f\f\u0002\u0000\t\t\r\r\u0001\u0000" +
                    "$%\u0001\u0000\u001f \u0001\u0000!#\u0002\u0000\u001f ))\u0002\u00001" +
                    "279\u00fb\u00005\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000" +
                    "\u0004A\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\bP\u0001" +
                    "\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\fb\u0001\u0000\u0000\u0000" +
                    "\u000eh\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012s" +
                    "\u0001\u0000\u0000\u0000\u0014w\u0001\u0000\u0000\u0000\u0016\u0081\u0001" +
                    "\u0000\u0000\u0000\u0018\u0094\u0001\u0000\u0000\u0000\u001a\u0096\u0001" +
                    "\u0000\u0000\u0000\u001c\u00a0\u0001\u0000\u0000\u0000\u001e\u00a2\u0001" +
                    "\u0000\u0000\u0000 \u00a7\u0001\u0000\u0000\u0000\"\u00af\u0001\u0000" +
                    "\u0000\u0000$\u00ba\u0001\u0000\u0000\u0000&\u00c2\u0001\u0000\u0000\u0000" +
                    "(\u00ca\u0001\u0000\u0000\u0000*\u00d2\u0001\u0000\u0000\u0000,\u00da" +
                    "\u0001\u0000\u0000\u0000.\u00e2\u0001\u0000\u0000\u00000\u00eb\u0001\u0000" +
                    "\u0000\u00002\u00ef\u0001\u0000\u0000\u000046\u0003\u0002\u0001\u0000" +
                    "54\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000" +
                    "\u000078\u0001\u0000\u0000\u00008\u0001\u0001\u0000\u0000\u00009:\u0003" +
                    "\u0006\u0003\u0000:;\u0005\u001d\u0000\u0000;@\u0001\u0000\u0000\u0000" +
                    "<=\u0003\u0004\u0002\u0000=>\u0005\u001d\u0000\u0000>@\u0001\u0000\u0000" +
                    "\u0000?9\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000@\u0003\u0001" +
                    "\u0000\u0000\u0000AB\u0005\u0005\u0000\u0000BC\u0005-\u0000\u0000CE\u0005" +
                    "\u0019\u0000\u0000DF\u0003\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000" +
                    "FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000" +
                    "\u0000HI\u0001\u0000\u0000\u0000IJ\u0005\u001a\u0000\u0000J\u0005\u0001" +
                    "\u0000\u0000\u0000KO\u0003\b\u0004\u0000LM\u0005\u0006\u0000\u0000MO\u0005" +
                    "-\u0000\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000O\u0007" +
                    "\u0001\u0000\u0000\u0000PQ\u0005\u0006\u0000\u0000QR\u0005-\u0000\u0000" +
                    "RS\u0005\u0019\u0000\u0000ST\u0003\n\u0005\u0000TU\u0005\u001a\u0000\u0000" +
                    "U\t\u0001\u0000\u0000\u0000VW\u0003\f\u0006\u0000WX\u0003\u001a\r\u0000" +
                    "XY\u0005\u001d\u0000\u0000Y[\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000" +
                    "\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000" +
                    "\u0000\u0000]\u000b\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000" +
                    "_c\u0003\u000e\u0007\u0000`c\u0003\u0010\b\u0000ac\u0003\b\u0004\u0000" +
                    "b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000" +
                    "\u0000c\r\u0001\u0000\u0000\u0000df\u0005,\u0000\u0000ed\u0001\u0000\u0000" +
                    "\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0005-\u0000" +
                    "\u0000he\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000" +
                    "\u0000\u0000jk\u0001\u0000\u0000\u0000k\u000f\u0001\u0000\u0000\u0000" +
                    "lr\u0003\u0012\t\u0000mr\u0003\u0014\n\u0000nr\u0005\u0013\u0000\u0000" +
                    "or\u0005\u0014\u0000\u0000pr\u0005\u0007\u0000\u0000ql\u0001\u0000\u0000" +
                    "\u0000qm\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000qo\u0001\u0000" +
                    "\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0011\u0001\u0000\u0000\u0000" +
                    "st\u0007\u0000\u0000\u0000t\u0013\u0001\u0000\u0000\u0000ux\u0003\u0016" +
                    "\u000b\u0000vx\u0003\u0018\f\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000" +
                    "\u0000\u0000x\u0015\u0001\u0000\u0000\u0000y\u0082\u0007\u0001\u0000\u0000" +
                    "z\u0082\u0007\u0002\u0000\u0000{|\u0005\t\u0000\u0000|\u007f\u0005\t\u0000" +
                    "\u0000}\u007f\u0005\u000e\u0000\u0000~{\u0001\u0000\u0000\u0000~}\u0001" +
                    "\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080\u0082\u0005" +
                    "\u000b\u0000\u0000\u0081y\u0001\u0000\u0000\u0000\u0081z\u0001\u0000\u0000" +
                    "\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000" +
                    "\u0082\u0017\u0001\u0000\u0000\u0000\u0083\u0084\u0005\n\u0000\u0000\u0084" +
                    "\u0087\u0005\b\u0000\u0000\u0085\u0087\u0005\u0002\u0000\u0000\u0086\u0083" +
                    "\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0095" +
                    "\u0001\u0000\u0000\u0000\u0088\u0089\u0005\n\u0000\u0000\u0089\u008c\u0005" +
                    "\t\u0000\u0000\u008a\u008c\u0005\u0003\u0000\u0000\u008b\u0088\u0001\u0000" +
                    "\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u0095\u0001\u0000" +
                    "\u0000\u0000\u008d\u008e\u0005\n\u0000\u0000\u008e\u008f\u0005\t\u0000" +
                    "\u0000\u008f\u0092\u0005\t\u0000\u0000\u0090\u0092\u0005\u0012\u0000\u0000" +
                    "\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000" +
                    "\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0095\u0005\u000f\u0000\u0000" +
                    "\u0094\u0086\u0001\u0000\u0000\u0000\u0094\u008b\u0001\u0000\u0000\u0000" +
                    "\u0094\u0091\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000" +
                    "\u0095\u0019\u0001\u0000\u0000\u0000\u0096\u009b\u0003\u001c\u000e\u0000" +
                    "\u0097\u0098\u0005\u001e\u0000\u0000\u0098\u009a\u0003\u001c\u000e\u0000" +
                    "\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000" +
                    "\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000" +
                    "\u009c\u001b\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000" +
                    "\u009e\u00a1\u0003\u001e\u000f\u0000\u009f\u00a1\u0003 \u0010\u0000\u00a0" +
                    "\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1" +
                    "\u001d\u0001\u0000\u0000\u0000\u00a2\u00a5\u0005-\u0000\u0000\u00a3\u00a4" +
                    "\u0005&\u0000\u0000\u00a4\u00a6\u0003$\u0012\u0000\u00a5\u00a3\u0001\u0000" +
                    "\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u001f\u0001\u0000" +
                    "\u0000\u0000\u00a7\u00a8\u0005-\u0000\u0000\u00a8\u00a9\u0005\u001b\u0000" +
                    "\u0000\u00a9\u00aa\u0003$\u0012\u0000\u00aa\u00ad\u0005\u001c\u0000\u0000" +
                    "\u00ab\u00ac\u0005&\u0000\u0000\u00ac\u00ae\u0003\"\u0011\u0000\u00ad" +
                    "\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae" +
                    "!\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u001b\u0000\u0000\u00b0\u00b5" +
                    "\u0003$\u0012\u0000\u00b1\u00b2\u0005\u001e\u0000\u0000\u00b2\u00b4\u0003" +
                    "$\u0012\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000" +
                    "\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000" +
                    "\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000" +
                    "\u0000\u0000\u00b8\u00b9\u0005\u001c\u0000\u0000\u00b9#\u0001\u0000\u0000" +
                    "\u0000\u00ba\u00bf\u0003&\u0013\u0000\u00bb\u00bc\u0005(\u0000\u0000\u00bc" +
                    "\u00be\u0003&\u0013\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c1" +
                    "\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0" +
                    "\u0001\u0000\u0000\u0000\u00c0%\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001" +
                    "\u0000\u0000\u0000\u00c2\u00c7\u0003(\u0014\u0000\u00c3\u00c4\u0005*\u0000" +
                    "\u0000\u00c4\u00c6\u0003(\u0014\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000" +
                    "\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000" +
                    "\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\'\u0001\u0000\u0000\u0000\u00c9" +
                    "\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cf\u0003*\u0015\u0000\u00cb\u00cc" +
                    "\u0005\'\u0000\u0000\u00cc\u00ce\u0003*\u0015\u0000\u00cd\u00cb\u0001" +
                    "\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001" +
                    "\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0)\u0001\u0000" +
                    "\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d7\u0003,\u0016" +
                    "\u0000\u00d3\u00d4\u0007\u0003\u0000\u0000\u00d4\u00d6\u0003,\u0016\u0000" +
                    "\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000" +
                    "\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000" +
                    "\u00d8+\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da" +
                    "\u00df\u0003.\u0017\u0000\u00db\u00dc\u0007\u0004\u0000\u0000\u00dc\u00de" +
                    "\u0003.\u0017\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00e1\u0001" +
                    "\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001" +
                    "\u0000\u0000\u0000\u00e0-\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000" +
                    "\u0000\u0000\u00e2\u00e7\u00030\u0018\u0000\u00e3\u00e4\u0007\u0005\u0000" +
                    "\u0000\u00e4\u00e6\u00030\u0018\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000" +
                    "\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000" +
                    "\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8/\u0001\u0000\u0000\u0000\u00e9" +
                    "\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ec\u0007\u0006\u0000\u0000\u00eb" +
                    "\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec" +
                    "\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u00032\u0019\u0000\u00ee1\u0001" +
                    "\u0000\u0000\u0000\u00ef\u00f0\u0007\u0007\u0000\u0000\u00f03\u0001\u0000" +
                    "\u0000\u0000\u001c7?GN\\bejqw~\u0081\u0086\u008b\u0091\u0094\u009b\u00a0" +
                    "\u00a5\u00ad\u00b5\u00bf\u00c7\u00cf\u00d7\u00df\u00e7\u00eb";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}