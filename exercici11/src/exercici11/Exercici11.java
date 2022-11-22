/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici11;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1, num2 ;
        System.out.println("El numero 1 es ");
        num1 = sc.nextInt();
        System.out.println("El numero 2 es ");
        num2 = sc.nextInt();
        
        if (num1>num2){
            System.out.println("El numero 1 es mas grande");
        }
        else {
            System.out.println("El numero 2 es mas grande");
        }
    }
    
}
