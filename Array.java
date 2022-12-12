/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oriol
 */
public class Array {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        int[] targetas = new int [4];
        int posicio_escollida, premis, acum_diners = 0;       
        do{
            Omplir_Array(targetas);
            Tarjeta_Vermella(targetas);
            posicio_escollida = Pos_Escollida();
            System.out.println("-> " + posicio_escollida);
            premis = Buscar_Premio(targetas, posicio_escollida);
            if(premis!=-1){
                acum_diners = acum_diners + premis;
                System.out.println("Has ganado " + premis + " llevas " +  acum_diners);
            }
            else{
                System.out.println("Tarjeta Roja");
            }
        }while((premis!=-1) && Acabar_Bucle());
    }
    public static void Omplir_Array(int[] targetas) {
        for (int i = 0; i < targetas.length; i++) {
            targetas[i] = Premio();
        }
    }
    public static int Premio() {
        Random r = new Random();
        return (r.nextInt(20)+1);
    }
    public static void Mostrar_Array(int[] targetas) {
        for (int i = 0; i < targetas.length; i++) {
            System.out.println("Indice: " + i + " = " + targetas[i]);
        }
    }
    public static void Tarjeta_Vermella(int[] targetas) {
        Random r = new Random();
        int posicion = r.nextInt(targetas.length);
        targetas[posicion] = -1;
    }
    public static int Pos_Escollida() {
        Scanner sc = new Scanner(System.in);
        int posicion;
        do{
        System.out.println("Escoge una targeta [1], [2], [3], [4]: ");
        posicion = sc.nextInt();
        }while(!(posicion>=1 && posicion<=4));
        return (posicion-1);
    }
    public static int Buscar_Premio(int[] targetas, int posicion_escoge) {
        return targetas[posicion_escoge];
    }
    public static boolean Acabar_Bucle() {
        Scanner sc = new Scanner(System.in);
        char respuesta;
        do{
            System.out.println("Te plantas? (s/n)");
            respuesta =  sc.nextLine().charAt(0);
        }while(!(respuesta=='s' || respuesta=='n' || respuesta=='S' || respuesta=='N'));
        if(respuesta=='s' || respuesta=='S'){
            return false;
        }
        else{
            return true;
        }
    }
}
