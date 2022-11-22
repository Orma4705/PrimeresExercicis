/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadrado;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Dime el lado?");
             int lado = sc.nextInt();
             int solucion = cuadrado(lado);
             System.out.println("La suma de todos los costados es "+ solucion);

        }
    public static int cuadrado (int lado){
        int resultado;
        if (lado==1){
            resultado = 4;
           return resultado;
        }
        else {
        resultado=(4*lado)+(4*cuadrado(lado/2));
        return resultado;
        }
    }
    
}
