/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuapp;

import Objetos.Menu;
import Objetos.OptionItem;

/**
 *
 * @author orma4705
 */
public class MenuApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu Fifa = new Menu("Fifa 23");
        Fifa.AddOption(new OptionItem("Settings"));
        
    }
    
}
