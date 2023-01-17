/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysv2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class ex3 {
    public static void main(String[] args) {
        final int files;
        final int colum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce files");
        files = sc.nextInt();
        System.out.println("Introduce columnas");
        colum = sc.nextInt();
        int [][] mapa = new int [files][colum];
        System.out.println("Poniendo todo valores aleatorios");
        Random rd=new Random();
        for (int col = 0; col < mapa.length; col++) {
        for (int i = 0; i < mapa[0].length; i++) {
            mapa[col][i]=rd.nextInt(10)+1;
        }
        }
          for (int col = 0; col < mapa.length; col++) {
        for (int i = 0; i < mapa[0].length; i++) {
            System.out.print(mapa[col][i]+"-");
        }
            System.out.println("");
        }
          int cont = 0;
          int conta= 0;
          int contad=0;
       for (int col = 0; col < mapa.length; col++) {
        for (int i = 0; i < mapa[0].length; i++) {
            if (mapa[col][i]==5){   
                cont++;
            }
            if (mapa[col][i]<5){
                conta++;
            }
            if (mapa[col][i]>5){
               contad++; 
            }
        }
        }
        System.out.println("Mayores que 5: "+conta);
        System.out.println("Menores que 5: "+contad);
        System.out.println("Iguales que 5: "+ cont);
    }
}
