/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author steve
 */
public class Script {
    
    private Transpiler transpiler;
    public Script(Transpiler transpiler) {
        this.transpiler = transpiler;
    }
    
    public String readScript(String script){
       String[] scriptSplited = splitString(script, "\n");
       String result = "";
        for (String expression : scriptSplited) {
            result += evaluateExpression(expression);
        }
        return result;
    }
    
    private String[] splitString(String string, String valueSplit){
        return string.split(valueSplit);
    }
    
    private String evaluateExpression(String expression){
        String[] expressionSplited = splitString(expression, " ");
        String key_word = expressionSplited[0];
        
        switch(key_word){
            case "class":   //Example: class name_class
                String nameClass = expressionSplited[1];
                return transpiler.translateClass(nameClass);
            
            case "var": //Example: var name_variable value_variable 
                String nameVar = expressionSplited[1];
                String valueVar = expressionSplited[2];
                return transpiler.translateVariable(nameVar, valueVar);
                
            case "funct":   //Example funct name_function param1 param2 ...
                String nameFunction = expressionSplited[1];
                String[] params = getParams(expressionSplited);
                return transpiler.translateFunction(nameFunction, params);
                
            case "if":  //Example: if value1 ==/!=/<=/>=/</> value2
                String value1 = expressionSplited[1];
                String value2 = expressionSplited[3];
                String conditional = expressionSplited[2];
                return transpiler.translateBifurcationIf(value1, value2, conditional);
                
            case "else": //Example: else
                return transpiler.translateBifurcationElse();
                
            case "while": //Example: while value1 ==/!=/<=/>=/</> value2
                value1 = expressionSplited[1];
                value2 = expressionSplited[3];
                conditional = expressionSplited[2];
                return transpiler.translateWhile(value1, value2, conditional);
                
            case "for": //Example for item array_list
                String item = expressionSplited[1];
                String arrayList = expressionSplited[2];
                return transpiler.translateFor(item, arrayList);
                
            case "import": //Example: import name_library
                String name_library = expressionSplited[1];
                return transpiler.translateImport(name_library);
              
            case "end":
                return transpiler.translateEnd();
            default:
                return "\n";
        }
    }
    
    private String[] getParams(String[] expressionSplited){
        if(expressionSplited.length < 2){
            return null;
        }
        else{
            return Arrays.copyOfRange(expressionSplited, 2, expressionSplited.length);
        }
    }
    
}
