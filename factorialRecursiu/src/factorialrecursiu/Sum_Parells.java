/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorialrecursiu;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Sum_Parells {
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int numero;
       System.out.println("Elige un numero");
       numero = sc.nextInt();
       int solucion = SumaParells(numero);
       System.out.println("La suma dels parells es "+ solucion);
     }
     public static int SumaParells(int num){
         int resultado;
         if (num==2){
             return num;
         }
         else if (num%2==1) {
             return -1;
         }
         else {
             resultado = num + SumaParells(num-2);
             return resultado;
         }
     }
}