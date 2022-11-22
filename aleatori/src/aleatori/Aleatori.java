/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleatori;

import java.util.Random;

/**
 *
 * @author orma4705
 */
public class Aleatori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        int aleatori;
        System.out.println("Del 1 al 10");
        for (int i = 0; i < 10; i++) {
            aleatori = rd.nextInt(10)+1;
            System.out.println(aleatori +"*");
            
        }
        System.out.println("");
        System.out.println("Del 5 al 15");
        for (int i = 0; i < 10; i++) {
            aleatori = rd.nextInt(11)+5;
            System.out.println(aleatori +"-");
        }
    }
    
}
