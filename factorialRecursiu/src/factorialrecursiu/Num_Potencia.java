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
public class Num_Potencia {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int base, potencia;
         System.out.println("Elige la base");
         base = sc.nextInt();
         System.out.println("Elige la potencia");
         potencia = sc.nextInt();
         int calculo = ResultadoPotencia(potencia, base);
         System.out.println("EL resultado es "+ calculo);      
     }
     public static int ResultadoPotencia(int potencia1, int base1 ){
         int resultado;
         if (potencia1==0){
             return 1;
         }
         else if (potencia1>=1){
             resultado = base1*ResultadoPotencia(potencia1-1, base1);
             return resultado;
         }         
       return -1;          
     }
}
