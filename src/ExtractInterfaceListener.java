import MIDL.MIDLBaseListener;
import MIDL.MIDLParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;

public class ExtractInterfaceListener extends MIDLBaseListener {

    /**
     * 构造符号表
     */
    public void insertSymbol(Element e) {
        switch (e.name) {
            case ";":
            case "{":
            case "}":
                return;//剔除无用的标识符，通过相同的类型声明保留字来确定作用域
            default:
                symbolTable.add(e);

        }

    }

    /**
     * 通过符号表进行语义检查
     */
    public void iniCheck() {
        /**
         * struct未定义检查
         */
        ArrayList<String> tol = new ArrayList<>();
        ArrayList<String> sl = new ArrayList<>();
        /**
         * 同名id检查
         */
        HashSet<String> id = new HashSet<>();
        String lm = " ";
        String nm = " ";
        String ls = " ";
        String ns = " ";
        String ID = " ";
        for (int i = 0; i < symbolTable.size(); i++) {

            /**
             * 命名检察
             */
            switch (symbolTable.get(i).name) {
                case "module":
                    if (nm.equals(symbolTable.get(i + 1).name)) {
                        warnName(nm);

//                        System.err.println(symbolTable.get(i + 1).name);
                    } else {
                        lm = " ";
                        nm = symbolTable.get(i + 1).name;
//                        System.err.println(nm);
                        /**
                         * struct声明迁移
                         */
                        tol.add(nm);

//                        tol.add(String.valueOf(sl.size()));
//                        System.out.println(lm);
//                        System.out.println(String.valueOf(sl.size()));
//                        for (String s:sl) {
//                            tol.add(s);
//                            System.out.println(s);
//                        }
//                        System.out.println("slslslsllssl");
//                        System.out.println(sl.toString());
                        sl.clear();
                        id.clear();
                    }
                    break;
                case "struct":

                    if (lm.equals(nm)
                            && ns.equals(symbolTable.get(i + 1).name)) {
                        System.out.println("位置：" + '\n'
                                + "module :" + nm);
                        warnName(ns);
//                        System.err.println(symbolTable.get(i + 1).name);
                    } else if (lm.equals(" ") && ns.equals(symbolTable.get(i + 1).name)) {

                        System.out.println("位置：" + '\n'
                                + "module :" + nm);
                        warnName(ns);
                    } else {
                        ls = " ";
                        ns = symbolTable.get(i + 1).name;
                        sl.add(ns);
                        tol.add(ns);
//                        System.out.println("++++++++++++++++++++++++");
//                        System.out.println(lm);
//                        System.out.println(nm);
//                        System.out.println(ls);
//                        System.out.println(ns);
//                        System.out.println(id.toString());
                        id.clear();
//                        System.err.println(ns);
                    }
                    break;
                /**
                 * 基本类型声明
                 */
                case "boolean":
                case "short":
                case "long":
                case "unsigned":
                case "int8":
                case "int16":
                case "int32":
                case "int64":
                case "uint8":
                case "uint16":
                case "uint32":
                case "uint64":
                case "char":
                case "string":
                case "float":
                case "double":
                case "true":
                case "false":
//                    ID = symbolTable.get(i + 1).name;
                    if ((lm.equals(nm) && ls.equals(ns)) || (lm.equals(" ") && ls.equals(" "))) {
                        int bef = id.size();
//                        System.out.println(id.toString());
                        id.add(symbolTable.get(i + 1).name);
                        if (id.size() == bef) {
                            System.out.println("位置：" + '\n'
                                    + "module :" + nm + '\n'
                                    + "struct :" + ns + '\t');
                            warnName(symbolTable.get(i + 1).name);
                        }
                    } else {
                        id.add(symbolTable.get(i + 1).name);
                    }
            }

            /**
             * 未定义检查
             */
            if (symbolTable.get(i).type.equals("Scoped_name") && !symbolTable.get(i + 1).type.equals("Scoped_name") && !symbolTable.get(i - 1).type.equals("Scoped_name")) {
//                System.out.println("******");
                boolean pass = false;
                for (String name : sl) {
//                    System.out.println(name);
                    if (name.equals(symbolTable.get(i).name)) {
                        pass = true;
                        break;
                    }
                }
                if (!pass) {
                    warnDef(symbolTable.get(i).name);
                }
            }
            if (symbolTable.get(i).type.equals("Scoped_name") && symbolTable.get(i + 1).name.equals("::")) {
                boolean pass = false;
                int start = 0;
//                System.out.println("sdjghnikalsdnfijaknweijf");
//                System.out.println(nm);
                for (int t = 0; t < tol.size(); t++) {
//                    System.out.println(tol.get(t));
                    if (tol.get(t).equals(nm)) {
                        start = t;
//                        System.out.println(t);
                        break;
                    }
                }
                for (int t = start - 1; t < tol.size(); t++) {
//                    System.out.println(tol.get(t));
                    if (symbolTable.get(i + 2).name.equals(tol.get(t))) {
                        pass = true;
                        break;
                    }
                }
                if (!pass) {
                    warnDef(symbolTable.get(i + 2).name);
                }
            }
            /**
             * 字面量检查
             */
            if (symbolTable.get(i).type.equals("Literal")) {
                Element tmp = symbolTable.get(i);
//                System.out.println(symbolTable.get(i-3).name);
                switch (symbolTable.get(i - 3).name) {
                    case "short":
                        if (!(Double.parseDouble(tmp.name) == Integer.parseInt(tmp.name)) || !(Integer.parseInt(tmp.name) < Math.pow(2, 15) - 1)) {
                            warnZ(symbolTable.get(i - 2).name);
                        }
                        break;
                    case "[":
                        if (symbolTable.get(i).name.equals(",")) break;
                        boolean go = true;
                        for (int j = i - 3; j < 2 * Integer.parseInt(tmp.name) + i - 3 + 1; j++) {
                            if (!(Double.parseDouble(symbolTable.get(j).name) == Integer.parseInt(symbolTable.get(j).name)) || !(Integer.parseInt(symbolTable.get(j).name) < Math.pow(2, 15) - 1)) {
                                go = false;
                            }
                        }
                        if (!go) warnZ(symbolTable.get(i - 4).name);
                }
            }
        }
    }

    /**
     * 命名冲突
     */
    public void warnName(String name) {
        System.out.println("命名冲突：" + name);
    }

    /**
     * 未定义
     *
     * @param name
     */
    public void warnDef(String name) {
        System.out.println("未定义struct：" + name);
    }

    /**
     * 字面错误
     *
     * @param name
     */
    public void warnZ(String name) {
        System.out.println("错误类型：" + name);
    }

    public class Element {
        public String type;
        public String name;

        public Element(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public boolean equals(Element e) {
            if (e.type.equals(this.type))
                if (e.name.equals(this.name))
                    return true;
            return false;
        }
    }

    /**
     * 符号表
     */
    ArrayList<Element> symbolTable = new ArrayList<>();
    /**
     * 词法
     */
    MIDLParser parser;
    /**
     * 控制台读入流
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String fileName;

    /**
     * 匿名方法
     */ {
        try {
            System.err.print("文件保存为:\n>>>");
            fileName = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 文件及输出流
     */
//    String fileName = "SyntaxOut.txt";
    File file = new File(fileName);
    FileWriter fw;

    /**
     * 匿名方法
     */ {
        try {
            fw = new FileWriter(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 节点深度
     */
    static int depth = 0;
    /**
     * 结果字符串
     */
    String res = "";

    /**
     * @param parser
     */
    public ExtractInterfaceListener(MIDLParser parser) {
        this.parser = parser;
    }

    public void insert(Element e) {

    }

    @Override
    public void enterSpecification(MIDLParser.SpecificationContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Specification", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Specification" + temp + "\t\n";
//        System.out.println(ctx.children.get(1).get);
        super.enterSpecification(ctx);
    }

    /**
     * 函数出口，输出结果
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitSpecification(MIDLParser.SpecificationContext ctx) {
        super.exitSpecification(ctx);
        iniCheck();
//        for (Element e:symbolTable) {
//            System.out.println(e.type+"\t"+e.name);
//        }
        generate();
        symbolTable.clear();
        try {
            fw.write(res);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * 代码生成
     */
    public void generate() {
        String file = "out.hxx";
        String modulen = "";
//        for (Element e : symbolTable) {
//            System.out.println(e.type + "\t" + e.name);
//        }
        try (FileWriter fw = new FileWriter(new File(file))) {
            fw.write("#ifndef MIDL_h\n" +
                    "#define MIDL_h\n" +
                    "\n" +
                    "#ifndef rti_me_cpp_hxx\n" +
                    "#include \"rti_me_cpp.hxx\"\n" +
                    "#endif\n" +
                    "\n" +
                    "#ifdef NDDS_USER_DLL_EXPORT\n" +
                    "#if (defined(RTI_WIN32) || defined(RTI_WINCE))\n" +
                    "#undef NDDSUSERDllExport\n" +
                    "#define NDDSUSERDllExport __declspec(dllexport)\n" +
                    "#endif\n" +
                    "#else\n" +
                    "#undef NDDSUSERDllExport\n" +
                    "#define NDDSUSERDllExport\n" +
                    "#endif\n");
            for (int i = 0; i < symbolTable.size(); i++) {
                Element e = symbolTable.get(i);
                switch (e.name) {
                    case "module":
                        String tmp = symbolTable.get(i + 1).name;
                        modulen = tmp;
                        fw.write("struct " + tmp + "_ASeq;\n" +
                                "class " + tmp + "_ATypeSupport;\n" +
                                "class " + tmp + "_ADataWriter;\n" +
                                "class " + tmp + "_ADataReader;");
                        if (i != 0) fw.write("}");
                        fw.write("class ");
                        fw.write(symbolTable.get(i + 1).name + "{" + '\n' + "public :" + "\n");
                        i++;
                        break;
                    case "struct":
                        if (i != 0) {
                            if (!symbolTable.get(i - 1).type.equals("Module"))
                                fw.write("}");
                        }
                        fw.write("typrdef struct " + symbolTable.get(i - 1).name + "_Aseq Seq;" + '\n');
                        fw.write("typrdef struct " + symbolTable.get(i - 1).name + "_ATypeSupport TypeSupport;" + '\n');
                        fw.write("typrdef struct " + symbolTable.get(i - 1).name + "_ADataReader DataReader;" + '\n');
                        i++;
                        break;
                    case "Literal":
                        fw.write(e.name + " ");
                        if (i == symbolTable.size() - 1) fw.write("};\n};");
                        else if (symbolTable.get(i + 1).name.equals("module") || symbolTable.get(i + 1).name.equals("struct"))
                            fw.write("}");
                    case "Signed_int":
                        fw.write("CDR_struct" + e.name + " ");
                    default:
                        fw.write(e.name + " ");
                        if (e.type.equals("Literal")) fw.write(";");
                        if (i == symbolTable.size() - 1) fw.write("\n};");
                }
            }
            fw.write("extern const char *module" + modulen + "_ATYPENAME;\n" +
                    "\n" +
                    "REDA_DEFINE_SEQUENCE_STRUCT(module" + modulen + "_ASeq, module后紧跟的名称_A);\n" +
                    "\n" +
                    "REDA_DEFINE_SEQUENCE_IN_C(module" + modulen + "_ASeq, module后紧跟的名称_A);\n" +
                    "\n" +
                    "NDDSUSERDllExport extern RTI_BOOL\n");

            fw.write("#ifdef NDDS_USER_DLL_EXPORT\n" +
                    "#if (defined(RTI_WIN32) || defined(RTI_WINCE))\n" +
                    "#undef NDDSUSERDllExport\n" +
                    "#define NDDSUSERDllExport\n" +
                    "#endif\n" +
                    "#endif\n" +
                    "\n" +
                    "#endif\n");
            try {
                fw.flush();
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void enterDefinition(MIDLParser.DefinitionContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("definition", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "definition" + temp + "\t\n";
//        System.out.println(ctx.children.get(1).toString()); // type : org.antlr.v4.runtime.tree.TerminalNodeImpl
        super.enterDefinition(ctx);
    }

    @Override
    public void exitDefinition(MIDLParser.DefinitionContext ctx) {
        super.exitDefinition(ctx);
    }

    @Override
    public void enterModule(MIDLParser.ModuleContext ctx) {
        String temp = "";
        String tab = "";

        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Module", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Module" + temp + "\t\n";
        super.enterModule(ctx);
    }

    @Override
    public void enterStruct_type(MIDLParser.Struct_typeContext ctx) {
        String temp = "";
        String tab = "";

        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Struct_type", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Struct_type" + temp + "\t\n";
        super.enterStruct_type(ctx);
    }

    @Override
    public void enterMember_list(MIDLParser.Member_listContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Member_list", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Member_list" + temp + "\t\n";
        super.enterMember_list(ctx);
    }


    @Override
    public void enterType_spec(MIDLParser.Type_specContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Type_spec", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Type_spec" + temp + "\t\n";
        super.enterType_spec(ctx);
    }


    @Override
    public void enterScoped_name(MIDLParser.Scoped_nameContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Scoped_name", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Scoped_name" + temp + "\t\n";
        super.enterScoped_name(ctx);
    }

    @Override
    public void enterBase_type_spec(MIDLParser.Base_type_specContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Base_type_spec", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Base_type_spec" + temp + "\t\n";
//        ctx.children.toString();
        super.enterBase_type_spec(ctx);
//        ctx.children.toString();
    }


    @Override
    public void exitBase_type_spec(MIDLParser.Base_type_specContext ctx) {
//        ctx.children.toString();
        super.exitBase_type_spec(ctx);
//        ctx.toString();
    }

    @Override
    public void enterFloating_pt_type(MIDLParser.Floating_pt_typeContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Floating_pt_type", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Floating_pt_type" + temp + "\t\n";
        super.enterFloating_pt_type(ctx);
    }

    @Override
    public void enterSigned_int(MIDLParser.Signed_intContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Signed_int", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Signed_int" + temp + "\t\n";
//        System.out.println(ctx.children.get(0).getClass().getName());
        super.enterSigned_int(ctx);
    }

    @Override
    public void exitSigned_int(MIDLParser.Signed_intContext ctx) {
//        ctx.children.toString();
        super.exitSigned_int(ctx);
    }

    @Override
    public void enterInteger_type(MIDLParser.Integer_typeContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Integer_type", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Integer_type" + temp + "\t\n";
        super.enterInteger_type(ctx);
    }


    @Override
    public void enterUnsigned_int(MIDLParser.Unsigned_intContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Unsigned_int", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Unsigned_int" + temp + "\t\n";
        super.enterUnsigned_int(ctx);
    }

    @Override
    public void enterSimple_declarator(MIDLParser.Simple_declaratorContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Simple_declarator", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Simple_declarator" + temp + "\t\n";
        super.enterSimple_declarator(ctx);
    }

    @Override
    public void enterDeclarators(MIDLParser.DeclaratorsContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Declarators", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Declarators" + temp + "\t\n";
        super.enterDeclarators(ctx);
    }

    @Override
    public void enterDeclarator(MIDLParser.DeclaratorContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Declarator", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Declarator" + temp + "\t\n";
        super.enterDeclarator(ctx);
    }


    @Override
    public void enterArray_declarator(MIDLParser.Array_declaratorContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Array_declarator", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Array_declarator" + temp + "\t\n";
        super.enterArray_declarator(ctx);
    }

    @Override
    public void enterShift_expr(MIDLParser.Shift_exprContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Shift_expr", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Shift_expr" + temp + "\t\n";
        super.enterShift_expr(ctx);
    }

    @Override
    public void enterExp_list(MIDLParser.Exp_listContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Exp_list", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }

        res += tab + "Exp_list" + temp + "\t\n";
        super.enterExp_list(ctx);
    }

    @Override
    public void enterOr_expr(MIDLParser.Or_exprContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Or_list", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Or_list" + temp + "\t\n";
        super.enterOr_expr(ctx);
    }

    @Override
    public void enterXor_expr(MIDLParser.Xor_exprContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Xor_list", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Xor_list" + temp + "\t\n";
        super.enterXor_expr(ctx);
    }

    @Override
    public void enterAdd_expr(MIDLParser.Add_exprContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Add_expr", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Add_expr" + temp + "\t\n";
        super.enterAdd_expr(ctx);
    }


    @Override
    public void enterAnd_expr(MIDLParser.And_exprContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("And_expr", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "And_expr" + temp + "\t\n";
        super.enterAnd_expr(ctx);
    }


    @Override
    public void enterLiteral(MIDLParser.LiteralContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();

                Element e = new Element("Literal", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Literal" + temp + "\t\n";
        super.enterLiteral(ctx);
    }

    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    @Override
    public void enterMult_expr(MIDLParser.Mult_exprContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Mult_expr", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Mult_expr" + temp + "\t\n";
        super.enterMult_expr(ctx);
    }

    @Override
    public void enterUnary_expr(MIDLParser.Unary_exprContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Unary_expr", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Unary_expr" + temp + "\t\n";
        super.enterUnary_expr(ctx);
    }


    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        depth++;
        super.enterEveryRule(ctx);

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

        depth--;

//        if (depth == 0) {
//            System.out.println(res);
//        }
        super.exitEveryRule(ctx);
    }

    @Override
    public void enterType_decl(MIDLParser.Type_declContext ctx) {
        String temp = "";
        String tab = "";
        for (int i = 1; i < depth; i++) {
            tab += "\t";
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")) {
                temp += '\n' + tab + '\t' + ctx.children.get(i).toString();
                Element e = new Element("Type_spec", ctx.children.get(i).toString());
                insertSymbol(e);
            }
        }
        res += tab + "Type_decl" + temp + "\t\n";
        super.enterType_decl(ctx);
    }

    @Override
    public void exitType_decl(MIDLParser.Type_declContext ctx) {
        super.exitType_decl(ctx);
    }
}
