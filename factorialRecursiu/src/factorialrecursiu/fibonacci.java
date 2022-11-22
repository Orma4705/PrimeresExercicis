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
public class fibonacci {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       int mes;
        System.out.println("Dime en que mes quieres saber cuantos conejos tendras?");
        mes = sc.nextInt();
        int conejos = ConejosFibonacci(mes);
        System.out.println("En el mes "+ mes + " tendras "+ conejos +" conejos!");
    }
    public static int ConejosFibonacci(int mes){
        int resultado;
     if (mes<=1){
         return 1;
     }
     else if (mes>1){
         resultado = ConejosFibonacci(mes-1)+ ConejosFibonacci(mes-2);
         return resultado;
     }
      return -1; 
    }
}
