/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.ProgrammingLanguagues;

import Model.Transpiler;

/**
 *
 * @author steve
 */
public class TranspilerPython extends Transpiler{

    @Override
    public void translate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String translateVariable(String nameVar, String valueVar) {
        return this.getIndent() + nameVar + " = " + valueVar + "\n";
    }

    @Override
    public String translateFunction(String nameFunction, String[] params) {
        String result = this.getIndent() + "def " + 
                nameFunction + "(" + this.getStructParams(params) + "):\n";
        addTab();
        return result;
    }

    @Override
    public String translateClass(String nameClass) {
        String result = this.getIndent() + "class " + nameClass + " :\n";
        addTab();
        return result;
    }

    @Override
    public String translateImport(String name_library) {
        String result = this.getIndent() + "import " + name_library + ";\n";
        return result;
    }

    @Override
    public String translateEnd() {
        this.deleteOneIndent();
        return "";
    }

    @Override
    public String translateBifurcationIf(String value1, String value2, String conditional) {
        String result = this.getIndent() + "if " + value1 + displaySpace() +
                conditional + displaySpace() + value2 + " :\n";
        addTab();
        return result;
    }

    @Override
    public String translateBifurcationElse() {
        String result = this.getIndent() + "else:\n";
        addTab();
        return result;
    }

    @Override
    public String translateWhile(String value1, String value2, String conditional) {
        String result = this.getIndent() + "while " + value1 + displaySpace() +
                conditional + displaySpace() + value2 + " :\n";
        addTab();
        return result;
    }

    @Override
    public String translateFor(String item, String arrayList) {
        String result = this.getIndent() + "for " + item  +
                " in "  + arrayList + " :\n";
        addTab();
        return result;
    }

    
    
}
