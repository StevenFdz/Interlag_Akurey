/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.ProgrammingLanguagues;

import Model.ItypeLanguage;
import Model.Transpiler;

/**
 *
 * @author Estiven Fernández
 */
public class TranspilerJava extends Transpiler implements ItypeLanguage{
    
    @Override
    public String translateVariable(String nameVar, String valueVar) {
        String result = this.getIndent() + defineType(valueVar) + displaySpace() + nameVar + " = " + valueVar + ";\n";
        return result;
    }

    @Override
    public String translateDefineFunction(String nameFunction, String[] params) {
        String result = this.getIndent() + defineTypeFunction() + displaySpace() + 
                nameFunction + "(" + this.getStructParams(params) + "){\n";
        addTab();
        return result;
    }

    @Override
    public String translateImport(String name_library) {
        String result = this.getIndent() + "import " + name_library + ";\n";
        return result;
    }

    @Override
    public String translateFor(String item, String arrayList) {
        String result = this.getIndent() + "for( " + item  +
                " : "  + arrayList + " ){\n";
        addTab();
        return result;
    }
    
    @Override
    public String defineType(String data) {
        /*
            This method is not implemented, only is a reference of something
            that must be out of the skeleton program.
            Its functionality is determine what is the datatype for a specific
            data
        */
        return "typeData";
    }

    @Override
    public String defineTypeFunction() {
        /*
            This method is not implemented, only is a reference of something
            that must be out of the skeleton program.
            Its functionality is determine what is the datatype for a specific
            function
            It require the addition of params in base to the solution that
            in the future the developers will think
        */
        return "typeFunction";
    }
    /*
        The type languages must do a override of this functions because
        the normal working of the function returns the params without the typeData
        so for change this behavior we need to do a override in the function
    */
    @Override
    public String getStructParams(String[] params){ 
        String result = "";
        if(params != null){
            for(int i=0;i < params.length; i++){
                if(i != params.length - 1){
                    result += defineType(params[i]) + this.displaySpace()+ params[i] + ", ";
                }
                else{
                    result += defineType(params[i]) + this.displaySpace() + params[i];
                }
            }
        }
        return result;
    }
}
