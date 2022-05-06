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
public class UI_JavaSwing extends UI_Generator{

    public UI_JavaSwing() {
        this.setLanguague(EnumProgrammingLanguages.JAVA);
        this.setUi_generator(Enum_UI.SWING);
    }

    @Override
    public String initLibrary() {
        return "javax.swing.*";
    }

    @Override
    public String createScreen(String variable_result, String name_screen) {
        return createStructureExpression("JFrame",name_screen , variable_result);
    }

    @Override
    public String createSelector(String variable_result) {
        return createStructureExpression("JComboBox", "", variable_result);
    }

    @Override
    public String createLabel(String variable_result, String label_text) {
        return createStructureExpression("JLabel",label_text , variable_result);
    }

    @Override
    public String createButton(String variable_result, String button_text) {
        return createStructureExpression("JButton", button_text, variable_result);
    }

    @Override
    public String createInput(String variable_result) {
        return createStructureExpression("JTextField", "", variable_result);
    }

    @Override
    public String createPanel(String variable_result) {
        return createStructureExpression("JPanel", "", variable_result);
    }
    
    public String createStructureExpression(String dataType, String params, String variable_result){
        String result = this.getIndent() + dataType + displaySpace() + 
                variable_result + " = new " + dataType + "(" + params + ");\n";
        return result;
    } 
}
