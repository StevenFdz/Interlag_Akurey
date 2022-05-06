/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.EnumProgrammingLanguagues;
import View.TranslateScreen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 *
 * @author steve
 */
public class Controller_TranslateScreen {
    
    private TranslateScreen translate_screen;
    private Controller_Transpiler_TranslateScreen controller_transpiler_translateScreen;

    public Controller_TranslateScreen() {
        translate_screen = new TranslateScreen();
        fillProgrammingLanguagueSelector();
        translate_screen.buttonTranslate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = translate_screen.tx_area_input.getText();
                translate_screen.tx_area_output.setText(
                        getController_transpiler_translateScreen().execTranslate(getSelectedLanguague()
                        , input));
            }
        });
    }
    
    public void showScreen(){
        translate_screen.setVisible(true);
    }
    
    public String getInput(){
        return this.getTranslate_screen().tx_area_input.getText();
    }
    
    public void setOutPut(String output){
        this.getTranslate_screen().tx_area_output.setText(output);
    }
    
    private void fillProgrammingLanguagueSelector(){
        JComboBox selector = this.getTranslate_screen().selectorLanguague;
        EnumProgrammingLanguagues[] programmingLanguagues = EnumProgrammingLanguagues.values();
        for(int i=0; i<programmingLanguagues.length; i++){
            selector.addItem(programmingLanguagues[i].toString());
        }
    }
    
    public EnumProgrammingLanguagues getSelectedLanguague(){
        int indexSelected = translate_screen.selectorLanguague.getSelectedIndex();
        String itemSelected = translate_screen.selectorLanguague.getItemAt(indexSelected);
        return EnumProgrammingLanguagues.valueOf(itemSelected);
    }

    public TranslateScreen getTranslate_screen() {
        return translate_screen;
    }

    public void setTranslate_screen(TranslateScreen translate_screen) {
        this.translate_screen = translate_screen;
    }

    public Controller_Transpiler_TranslateScreen getController_transpiler_translateScreen() {
        return controller_transpiler_translateScreen;
    }

    public void setController_transpiler_translateScreen(Controller_Transpiler_TranslateScreen controller_transpiler_translateScreen) {
        this.controller_transpiler_translateScreen = controller_transpiler_translateScreen;
    }
    
    
    
    
}
