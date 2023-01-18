/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codiuf4;

import Objectes.Botella;
import Objectes.Vaso;

/**
 *
 * @author mabardaji
 */
public class CodiUf4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // funcionament màquina
        Botella bottle = new Botella(); /*constructor*/
        Vaso glass = new Vaso(); /*constructor*/
        Vaso glass1 = new Vaso();
        Vaso vas1 = new Vaso();
        Vaso vas2 = new Vaso("Vidrio");
        Vaso vas3 = new Vaso("Madera", 0);
        
        bottle.setCapacitat(1000);
        System.out.println(bottle.getCapacitat()+" ml");
    }
    
}
