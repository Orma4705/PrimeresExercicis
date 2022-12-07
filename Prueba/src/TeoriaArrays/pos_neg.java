/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TeoriaArrays;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class pos_neg {
    public static void main(String[] args) {
    final int TAMANY = 6;
        int [] numeros = new int[TAMANY];
        introducirDatosArray(numeros);
        Funcions.mostrarArray(numeros);
        int positivo = 0, negativo = 0;
        for (int index = 0; index < numeros.length; index++) {
            if (numeros[index]>positivo){
                positivo++;
            }
            if (numeros[index]<negativo){
                negativo++ ;
            }            
        }
        System.out.println("La cantidad de positivos es "+ positivo);
        System.out.println("La cantidad de positivos es "+ negativo);
    }
     private static void introducirDatosArray(int[] numeros) {
       Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce valor "+ (i+1) + " = ");
            numeros[i] = sc.nextInt();
        }
     }
}
