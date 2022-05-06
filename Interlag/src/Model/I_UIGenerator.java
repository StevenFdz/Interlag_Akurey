/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

/**
 *
 * @author Estiven Fernández
 * This interface is the way in how interlag implement the GUIs for the languagues.
 * In short, all new GUI must implemented this methods that currently are very
 * basics but when we will want implemented all the functionalities of a GUI
 * only we will have to add a new function here and all the sub classes that 
 * define the behavior of the languages must implement the new function
 */
public interface I_UIGenerator {

    public String initLibrary();
    
    public String createScreen(String variable_result, String name_screen);
    
    public String createLabel(String variable_result, String label_text);
    
    public String createButton(String variable_result, String button_text);
    
    public String createInput(String variable_result);
    
    public String createSelector(String variable_result);
    
    public String createPanel(String variable_result);   
}
