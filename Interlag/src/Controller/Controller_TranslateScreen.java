/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.EnumProgrammingLanguages;
import Model.Enum_UI;
import View.TranslateScreen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 *
 * @author Estiven Fernández
 * This is the controller of the program screen, just here we found all the methods
 * that we use for interact with the screen and at the same time the comunications
 * that we have to use for move the information to the transpilers. The actions
 * that will do the buttons, the definitions of what languagues we can use in the
 * selectors, all those happen here.
 */
public class Controller_TranslateScreen {
    
    private TranslateScreen translate_screen;
    private Controller_Transpiler_TranslateScreen controller_transpiler_translateScreen;

    public Controller_TranslateScreen() {
        translate_screen = new TranslateScreen();
        fillProgrammingLanguagueSelector();
        fillGUISelector();
        translate_screen.buttonTranslate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = translate_screen.tx_area_input.getText();
                translate_screen.tx_area_output.setText(
                        getController_transpiler_translateScreen().execTranslate(getSelectedLanguague(), getSelectedGUI()
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
        JComboBox selector = this.getTranslate_screen().selectorLanguage;
        EnumProgrammingLanguages[] programmingLanguagues = EnumProgrammingLanguages.values();
        for(int i=0; i<programmingLanguagues.length; i++){
            selector.addItem(programmingLanguagues[i].toString());
        }
    }
    
    private void fillGUISelector(){
        JComboBox selector = this.getTranslate_screen().selectorGUI;
        Enum_UI[] GUIs = Enum_UI.values();
        for(int i=0; i<GUIs.length; i++){
            selector.addItem(GUIs[i].toString());
        }
    }
    
    public EnumProgrammingLanguages getSelectedLanguague(){
        return EnumProgrammingLanguages.valueOf(getItemSelected(translate_screen.selectorLanguage));
    }
    
    public Enum_UI getSelectedGUI(){
        return Enum_UI.valueOf(getItemSelected(translate_screen.selectorGUI));
    }
    
    public String getItemSelected(JComboBox<String> selector){
        int indexSelected = selector.getSelectedIndex();
        String itemSelected = selector.getItemAt(indexSelected);
        return itemSelected;
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
