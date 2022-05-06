/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author steve
 */
public abstract class Transpiler implements ITranspiler {
    protected I_UIGenerator UI_generator;
    protected String indent = "";

 
    public I_UIGenerator getUI_generator() {
        return UI_generator;
    }

    public void setUI_generator(I_UIGenerator UI_generator) {
        this.UI_generator = UI_generator;
    }

    public String getIndent() {
        return indent;
    }

    public void setIndent(String indent) {
        this.indent = indent;
    }
    
    public String displaySpace(){
        return " ";
    }
    
    public void deleteOneIndent(){
        this.setIndent(this.getIndent().substring(0, this.getIndent().length()-1));
        if(this.getIndent() == null){
            this.setIndent("");
        }
    }
    
    public void addTab(){
        this.setIndent(this.getIndent() + "\t");
    }
    
    public String getStructParams(String[] params){
        String result = "";
        if(params != null){
            for(int i=0;i < params.length; i++){
                if(i != params.length - 1){
                    result += params[i] + ", ";
                }
                else{
                    result += params[i];
                }
            }
        }
        return result;
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
