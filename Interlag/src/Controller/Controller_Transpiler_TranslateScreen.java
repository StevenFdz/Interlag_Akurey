/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.EnumProgrammingLanguagues;
import Model.ProgrammingLanguageFactory;
import Model.Script;
import Model.Transpiler;

/**
 *
 * @author steve
 */
public class Controller_Transpiler_TranslateScreen {
    private Transpiler transpiler;
    
    public String execTranslate(EnumProgrammingLanguagues programmingLanguague, String program){
        setTranspiler(ProgrammingLanguageFactory.instanceTranspiler(programmingLanguague));
        Script scriptGenerator = new Script(this.getTranspiler());
        return scriptGenerator.readScript(program);
    }
    
    public Transpiler getTranspiler() {
        return transpiler;
    }

    public void setTranspiler(Transpiler transpiler) {
        this.transpiler = transpiler;
    }
        
        
 }

    
    
    





    


