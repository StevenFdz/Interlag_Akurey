/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Arrays;

/**
 *
 * @author Estiven Fernández
 * In this file we found the class that has the responsability of interprete
 * the input from the user, all the relation about the reading of the input
 * and the evaluations of the expressions work from here. The exceptions have not
 * implemented yet then only work with correct syntax in the inputs
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
                return transpiler.translateDefineFunction(nameFunction, params);
                
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
              
            case "end": //Example: end
                return transpiler.translateEnd();
                
            case "initGUI": //Example initGUI
                return transpiler.translateImport(
                        transpiler.getUI_generator().initLibrary());
                
            case "GUI": //Example: GUI ... ... ...
                return evaluateGUIExpression(
                        Arrays.copyOfRange(expressionSplited, 1, expressionSplited.length));
                
            //Adding more cases we can create new functionalities in our program
     
            default:
                return "\n";
        }
    }
    private String evaluateGUIExpression(String[] splitedExpression){
       
        String key_word = splitedExpression[0]; 
        String result_variable = splitedExpression[1];
        
        switch(key_word){
            case "screen":  //Example: screen result_variable name_screen
                String text_component = splitedExpression[2];
                return transpiler.getIndent() + transpiler.getUI_generator().createScreen(result_variable, text_component);
                
            case "button": //Example: button result_variable button_text
                text_component = splitedExpression[2];
                return transpiler.getIndent() + transpiler.getUI_generator().createButton(result_variable, text_component);
                
            case "label": //Example: label result_variable label_text
                text_component = splitedExpression[2];
                return transpiler.getIndent() + transpiler.getUI_generator().createLabel(result_variable, text_component);
                
            case "input": //Example: input result_variable
                return transpiler.getIndent() + transpiler.getUI_generator().createInput(result_variable);
                
            case "selector": //Example: selector result_variable
                return transpiler.getIndent() + transpiler.getUI_generator().createSelector(result_variable);
               
            case "panel": //Example: panel result_variable
                return transpiler.getIndent() + transpiler.getUI_generator().createPanel(result_variable);
                
            default:
                return "\n";  
            //Adding more cases we can create new functionalities in our program
            // in reference with the GUI aspects
        }
    }
    private String[] getParams(String[] expressionSplited){ //This function take the expression and return the params for that the function or other method can use them
        if(expressionSplited.length < 2){
            return null;
        }
        else{
            return Arrays.copyOfRange(expressionSplited, 2, expressionSplited.length);
        }
    }
}
