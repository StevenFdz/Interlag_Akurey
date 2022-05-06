/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.UI_Generators;

import Model.EnumProgrammingLanguages;
import Model.Enum_UI;
import Model.UI_Generator;

/**
 *
 * @author Estiven Fernández
 */
public class UI_PythonTKinter extends UI_Generator{

    public UI_PythonTKinter() {
        this.setLanguague(EnumProgrammingLanguages.PYTHON);
        this.setUi_generator(Enum_UI.TKinter);
    }

    @Override
    public String initLibrary() {
        return "tkinter";
    }

    @Override
    public String createScreen(String variable_Result, String name_screen) {
        return "This method has not implemented yet";
    }
    
    @Override
    public String createLabel(String variable_result, String label_text) {
        return "This method has not implemented yet";
    }

    @Override
    public String createButton(String variable_result, String button_text) {
        return "This method has not implemented yet";
    }

    @Override
    public String createInput(String variable_result) {
        return "This method has not implemented yet";
    }

    @Override
    public String createPanel(String variable_result) {
        return "This method has not implemented yet";
    }

    @Override
    public String createSelector(String variable_result) {
        return "This method has not implemented yet";
    }
    
}
