/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.UI_Generators.UI_JavaSwing;
import Model.UI_Generators.UI_PythonTKinter;

/**
 *
 * @author Estiven Fernández
 */
public class GUIFactory {
    
    public static UI_Generator instanceGUI(Enum_UI ui){
        switch(ui){
            case SWING:
                return new UI_JavaSwing();
                     
            case TKinter:
                return new UI_PythonTKinter();
            
            default:
                return null;
        }
    }
}
