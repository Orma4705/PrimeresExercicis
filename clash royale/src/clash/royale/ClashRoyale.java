/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clash.royale;

import objetos.CofreArgent;
import objetos.CofreOr;

/**
 *
 * @author orma4705
 */
public class ClashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CofreArgent silver = new CofreArgent();
        
        silver.obrirCofre();
        System.out.println(silver.mostrar_cofre());
        
        CofreOr gold= new CofreOr();
        gold.obrirCofre();
        System.out.println(gold.mostrar_cofre());
    }
    
}
