/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packkage_math;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exercici9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         int edad;
         System.out.println("La edad es  ");
         edad=ProvesmetodesPropis.pedirValorPositivo();
         if (edad>=18) {
                System.out.println("Eres mayor de edad  ");
    }
    else
         { System.out.println("Eres menor de edad"); }
}
}
