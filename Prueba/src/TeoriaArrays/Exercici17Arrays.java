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
public class Exercici17Arrays {
    public static void main(String[] args){
       int[] numeros = new int [3];
       int[] numeros2 = new int [3];
       ponerValores(numeros);
       Funcions.mostrarArray(numeros);
       ponerValores(numeros2);       
       Funcions.mostrarArray(numeros2);
       boolean igual = validacionIguales(numeros,numeros2); 
    }
    public static void ponerValores(int[]numeros){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Pon valor "+ (i+1));
            numeros[i]=sc.nextInt();
        }
    }
    private static boolean validacionIguales(int[]valores1,int[]valores2){
        for (int i = 0; i < valores1.length; i++) {
            if(valores1[i]!=valores2[i]){
                return false;
            }
        }
        return true;
    }
}
