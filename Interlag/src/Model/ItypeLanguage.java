/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

/**
 *
 * @author Estiven Fernández
 * This interface must implement all these typed languages, the objective is 
 * get a way to understand the type data of the variables of functions in this
 * languagues, this because if we won't define a variable with its type
 * this return us an error, and for allow that all the classes have a similar 
 * behavior I decided create this interface
 */
public interface ItypeLanguage {
    
    String defineType(String data);
    
    String defineTypeFunction();
}
