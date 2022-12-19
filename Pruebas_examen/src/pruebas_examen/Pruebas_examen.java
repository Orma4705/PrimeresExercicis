/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas_examen;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author oriol
 */
public class Pruebas_examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int [4];
        int[] numeros1 = new int [4];
        random(numeros1);
        Omplir_Array(numeros);
        int[] numeros2 = join(numeros, numeros1) ;
        Ordenar_array(numeros2);
    }
    public static void random(int[] numeros1){
        Random rd = new Random();
        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i] = rd.nextInt(99)+1;
        }
    }
     public static void Omplir_Array(int[] numeros) {
         Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Pon numeros a cada array "+ (i+1) +": ");
            numeros[i] = sc.nextInt();
        }
    }
     public static void Ordenar_array(int[] numeros2){
         Arrays.sort(numeros2);
         for (int i = numeros2.length-1; i >= 0; i--) {
             System.out.print(numeros2[i]+"  ");
         }
         System.out.println("");
     }
     public static int[] join(int[] a, int[] b)
{
    return IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                    .toArray();
}
    
}
