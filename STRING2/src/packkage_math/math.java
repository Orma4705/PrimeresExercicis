/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packkage_math;

/**
 *
 * @author orma4705
 */
public class math {
     public static void main(String[] args) {
         int n1=15;
         int n2=7;
         int maxim = Math.max(n1, n2);
         System.out.println("Maxim es " + maxim);
         double decimales = 345.678;
         long partentera = Math.round(decimales);
         System.out.println(partentera);
        int numaleatori = (int) (Math.random()*10);
         System.out.println("aleatori "+ numaleatori);
         int negativo =Math.negateExact(6);
         System.out.println("En negativo es "+negativo);
         double exponent = Math.pow(5, 3);
         System.out.println("5 elevado a 3 es "+ exponent);
     }
    
}
