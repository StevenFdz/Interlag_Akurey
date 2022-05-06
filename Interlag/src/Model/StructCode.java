/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Estiven Fernández
 * This is a primitive class that is used for define this functions that are 
 * frecuently used in other classes for the parsed of the input
 */
public abstract class StructCode {
    protected String indent = "";
    
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
}
    
