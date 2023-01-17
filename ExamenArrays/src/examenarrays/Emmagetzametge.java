/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenarrays;
import java.util.Random;

/**
 *
 * @author orma4705
 */
public class Emmagetzametge {
    public static void main(String[] args) {
        int[] numeros = new int [15];
         System.out.println("Datos mostrados");
        inicialitzarDades(numeros);
        mostrarArray(numeros);
        System.out.println("Datos cambiados");
        CanviarDades(numeros);
        mostrarArray(numeros);
        System.out.println("El 12 cambiado");
        mostrarArray(numeros);
        canviarValor(numeros);
        mostrarArray(numeros);
    }
    /*
    Poses les dades amb un valor aleatori
    */
    public static void inicialitzarDades(int[]numeros){
        Random rd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= rd.nextInt(0,16);
        }
    }
    /*
    canvies els numeros del 1 al 13 per 0
    */
    public static void CanviarDades(int[]numeros){
        for (int i = 6; i < 13; i++) {
            numeros[i]=0;
        }
    }
    /*
    mostres array
    */
    public static void mostrarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i+1)+"="+ numeros[i]+" ");
            }
    }
    /*
    Aqui esta mal el bucle per no encuentro otra forma 
    Lo que hace es con un for passar por todo el array y despues en un bucle y un contador que al llegar a q se para el bucle
    El bucle se para cuando encuentra una superior a 12 y entonces el contador sube a 1 i en teoria para
    Pero no lo hace 
    */
    public static void canviarValor (int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            int cont = 0;
            do{
           if (numeros[i]>12){
               cont++;
               numeros[i]=-1;
           } 
           }while(cont==1);
        }
    }}
