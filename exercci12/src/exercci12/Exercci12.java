/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercci12;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exercci12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("El numero es ");
        numero = sc.nextInt();
        if (numero>=0){
            System.out.println("Es positivo");
        }
        else {
            System.out.println("Es negativo");
        }
    }
    
}
