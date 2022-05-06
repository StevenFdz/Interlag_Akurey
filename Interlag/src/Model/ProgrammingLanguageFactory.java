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
 * @author steve
 */
public class ProgrammingLanguageFactory {
    
    public static Transpiler instanceTranspiler(EnumProgrammingLanguagues programmingLanguague){
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
