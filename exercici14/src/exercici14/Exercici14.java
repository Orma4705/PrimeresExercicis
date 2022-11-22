/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici14;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exercici14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("El numero 1 es ");
        num1 = sc.nextInt();
        System.out.println("El numero 2 es ");
        num2 = sc.nextInt();
        if (num1>=num2){
            if (num1==num2){
                System.out.println("Los numeros son iguales");
            }
            else {
                System.out.println("El mayor es " + num1);
            }
        }
        else {
            System.out.println("El mas grande es " + num2);
        }
    }
    
}
