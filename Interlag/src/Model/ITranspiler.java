/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

/**
 *
 * @author Estiven Fernández
 * This class is the base of our transpilers in interlag, this interface is 
 * implemented in tha abstract class Transpiler. The objective of this is that 
 * be a mandatory that all the new languages that we will implemented is going
 * to have all this functions, allowing the scalability
 */
public interface ITranspiler {
    
    public String translateVariable(String nameVar, String valueVar);
    
    public String translateDefineFunction(String nameFunction, String[] params);
    
    public String translateClass(String nameClass);
    
    public String translateBifurcationIf(String value1,String value2,String conditional);
    
    public String translateBifurcationElse();
    
    public String translateWhile(String value1,String value2,String conditional);
    
    public String translateFor(String item, String arrayList);
    
    public String translateImport(String name_library);
    
    public String translateEnd();
    
    /*
        We can add new function in our transpilers only adding this function here 
        and implemented the bahivior in the corresponding transpiler. For example
        we can do the next
    
    
        public String translateWhileDo(String value1,String value2,String conditional);
    
        public String translateUseVariable(String item, String arrayList);
    
        public String translateApplyFunctions(String name_library);
    */ 
}
