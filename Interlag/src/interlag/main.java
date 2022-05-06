package interlag;

import Controller.Controller_TranslateScreen;
import Controller.Controller_Transpiler_TranslateScreen;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author steve
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller_Transpiler_TranslateScreen controller_transpiler_translateScreen = new Controller_Transpiler_TranslateScreen();
        Controller_TranslateScreen controller_translateScreen = new Controller_TranslateScreen();
        controller_translateScreen.setController_transpiler_translateScreen(controller_transpiler_translateScreen);
        controller_translateScreen.showScreen();
    }
    
}
