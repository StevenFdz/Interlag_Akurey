/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Estiven Fernández
 * This class is the base of the GUI, all the GUIs that we implemented must 
 * extendes this class, the most important is the interface that it implements,
 * the reason behind of the abstract class is mainly for the attributes,
 * ui_generator define through an enum what GUI is and by the other hand,
 * language define the programming language that this interface belongs. 
 * This last is not important right now but in the future for a validation we could
 * use
 */
public abstract class UI_Generator extends StructCode implements I_UIGenerator{
    
    protected EnumProgrammingLanguages languague;
    protected Enum_UI ui_generator;

    public EnumProgrammingLanguages getLanguague() {
        return languague;
    }

    public void setLanguague(EnumProgrammingLanguages languague) {
        this.languague = languague;
    }

    public Enum_UI getUi_generator() {
        return ui_generator;
    }

    public void setUi_generator(Enum_UI ui_generator) {
        this.ui_generator = ui_generator;
    }   
    
}
