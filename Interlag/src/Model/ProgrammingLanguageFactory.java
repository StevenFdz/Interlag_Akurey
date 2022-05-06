/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.ProgrammingLanguagues.TranspilerC_Sharp;
import Model.ProgrammingLanguagues.TranspilerJava;
import Model.ProgrammingLanguagues.TranspilerPython;
import Model.ProgrammingLanguagues.TranspilerTypeScript;

/**
 *
 * @author Estiven Fernández
 * In this file we instance the type of language that we are going to use
 * only is neccesary send the enum of the programming language and the calss
 * return us one instance of the object that we request
 */
public class ProgrammingLanguageFactory {
    
    public static Transpiler instanceTranspiler(EnumProgrammingLanguages programmingLanguague){
        switch(programmingLanguague){
            case C_SHARP:
                return new TranspilerC_Sharp();
                     
            case JAVA:
                return new TranspilerJava();
            
            case PYTHON:
                return new TranspilerPython();
                
            case TYPESCRIPT:
                return new TranspilerTypeScript();
                
            default:
                return null;
        }
    }
}
