/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2022;

import objectes.Blazer;
import objectes.Corroc;

/**
 *
 * @author orma4705
 */
public class Invizimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Blazer bolt = new Blazer(100, 15);
        Corroc Wind = new Corroc(10, "Alpino");
        int vuelta=0;
        do{
           Wind.sprint();
           bolt.Sprint();
           vuelta++;
           if (vuelta%6==0){
               bolt.AugmentarResistencia(1);
           }
            System.out.println(Wind);
            System.out.println(bolt);
        }while(Wind.getDistancia_recorreguda()<500 && bolt.getDistancia_recorreguda()<500);
        
        if(bolt.getDistancia_recorreguda()>=500 && Wind.getDistancia_recorreguda()<500){
            System.out.println("Bolt ha ganado");
        }
        else if(Wind.getDistancia_recorreguda()>=500 && bolt.getDistancia_recorreguda()<500){
            System.out.println("Wind ha ganado");
        }
        else{
            System.out.println("Empate");
        }
    }
    
}
