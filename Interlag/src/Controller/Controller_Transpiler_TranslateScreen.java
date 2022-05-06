/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.EnumProgrammingLanguages;
import Model.Enum_UI;
import Model.GUIFactory;
import Model.ProgrammingLanguageFactory;
import Model.Script;
import Model.Transpiler;

/**
 *
 * @author Estiven Fernández
 * This is the controller that connect the transpilers files with the graphic 
 * interface of the system. The main function is extract the information of the
 * screen and send it to the transpiler.
 */
public class Controller_Transpiler_TranslateScreen {
    private Transpiler transpiler;
    
    public String execTranslate(EnumProgrammingLanguages programmingLanguague, Enum_UI gui,String program){
        setTranspiler(ProgrammingLanguageFactory.instanceTranspiler(programmingLanguague));
        getTranspiler().setUI_generator(GUIFactory.instanceGUI(gui));
        if(getTranspiler().getUI_generator() != null){
            getTranspiler().getUI_generator().setIndent(getTranspiler().getIndent());
        }
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

    
    
    





    


