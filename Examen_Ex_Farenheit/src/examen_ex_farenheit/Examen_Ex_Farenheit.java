/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_ex_farenheit;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Examen_Ex_Farenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
         int temp_max, temp_min;
         System.out.println("Quina es la temperatura minima?");
         temp_min=sc.nextInt();
         System.out.println("Quina es la temperatura maxima?");
         temp_max=sc.nextInt();
         double farenheit;
        int i ;  
     do{
          for ( i = temp_min; i <= temp_max; i++) {
             
          farenheit= (1.8*i)+32;
          System.out.println(" Celsius "+i+" Farenheit "+farenheit);
            }
        }while (i==temp_max);
    }
    
}
