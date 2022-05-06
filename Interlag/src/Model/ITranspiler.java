/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

/**
 *
 * @author steve
 */
public interface ITranspiler {
    
    public void translate();
    
    public String translateVariable(String nameVar, String valueVar);
    
    public String translateFunction(String nameFunction, String[] params);
    
    public String translateClass(String nameClass);
    
    public String translateBifurcationIf(String value1,String value2,String conditional);
    
    public String translateBifurcationElse();
    
    public String translateWhile(String value1,String value2,String conditional);
    
    public String translateFor(String item, String arrayList);
    
    public String translateImport(String expression);
    
    public String translateEnd();
}
