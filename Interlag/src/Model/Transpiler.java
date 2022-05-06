/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Estiven Fernández
 * This is the base of all the transpilers that Interlag would have, every that
 * we will implement must extends of this class. It is an abstract class
 * because the attribute UI_generator is a characteristic that all the languagues
 * must implemented, at the same time some syntax in the programming languagues
 * is similar for example Java and C++/# so in this class we can implemented
 * the typical struct about an if or while that is same in this languages, this
 * for avoid the code repeated
 */
public abstract class Transpiler extends StructCode implements ITranspiler {
    protected UI_Generator UI_generator;

    public UI_Generator getUI_generator() {
        return UI_generator;
    }

    public void setUI_generator(UI_Generator UI_generator) {
        this.UI_generator = UI_generator;
    }

    @Override
    public String translateBifurcationIf(String value1, String value2, String conditional) {
        String result = this.getIndent() + "if( " + value1 + displaySpace() +
                conditional + displaySpace() + value2 + " ){\n";
        addTab();
        return result;
    }

    @Override
    public String translateBifurcationElse() {
        String result = this.getIndent() + "else{\n";
        addTab();
        return result;
    }
    
    @Override
    public String translateWhile(String value1, String value2, String conditional) {
        String result = this.getIndent() + "while( " + value1 + displaySpace() +
                conditional + displaySpace() + value2 + " ){\n";
        addTab();
        return result;
    }
    
    @Override
    public String translateEnd() {
        this.deleteOneIndent();
        String result = this.getIndent() + "}\n";
        return result;
    }
    
    @Override
    public String translateClass(String nameClass) {
        String result = this.getIndent() + "class " + nameClass + " {\n";
        addTab();
        return result;
    }   
}
