/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici_9;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exercici_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
       int num1, num2, num3;
        System.out.print("Pon el numero 1: ");
        num1=sc.nextInt();
        System.out.print("Pon el numero 2: ");
        num2=sc.nextInt();
        System.out.print("Pon el numero 3: ");
        num3=sc.nextInt();
        int mayor, mayor_2;
        mayor = num_grande(num1, num2);
        mayor_2 = num_grande_2(mayor,num3);
        System.out.println("El mas grande es "+mayor_2);
    }
    public static int num_grande(int v1, int v2){
        int grande;
        if (v1<v2){
            grande = v2;
        }
        else {
            grande = v1;
        }
        return grande;
    }
    public static int num_grande_2(int grande, int v3){
        int grande_2;
        if (grande<v3){
            grande_2=v3;
        }
        else{
            grande_2=grande;
        }
        return grande_2;
    }
}
