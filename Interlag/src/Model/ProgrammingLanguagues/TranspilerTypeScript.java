/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.ProgrammingLanguagues;

import Model.ItypeLanguage;
import Model.Transpiler;

/**
 *
 * @author steve
 */
public class TranspilerTypeScript extends Transpiler implements ItypeLanguage{

    @Override
    public void translate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String translateVariable(String nameVar, String valueVar) {
        String result = this.getIndent() + "var " + nameVar + ":" + 
                defineType(valueVar) +" = " + valueVar + ";\n";
        return result;
    }

    @Override
    public String translateFunction(String nameFunction, String[] params) {
        String result = this.getIndent() + nameFunction +"(" + 
                this.getStructParams(params) + "): " +defineTypeFunction() +
                "{\n";
        addTab();
        return result;
    }


    @Override
    public String translateImport(String name_library) {
        String result = this.getIndent() + "import * from " + name_library + ";\n";
        return result;
    }

    
    @Override
    public String translateFor(String item, String arrayList) {
        String result = this.getIndent() + "for( var " + item  +
                " of "  + arrayList + " ){\n";
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

   
    
}
