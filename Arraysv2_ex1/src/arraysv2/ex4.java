/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysv2;

import java.util.Random;

/**
 *
 * @author orma4705
 */
public class ex4 {
    public static void main(String[] args) {
        final int files=4;
        final int colum=5;
        int [][] notas = new int [files][colum];
        System.out.println("Poniendo todo valores aleatorios");
        Random rd=new Random();
        for (int col = 0; col < notas.length; col++) {
        for (int i = 0; i < notas[0].length; i++) {
            notas[col][i]=rd.nextInt(10)+1;
        }
        }
         for (int col = 0; col < notas.length; col++) {
        for (int i = 0; i < notas[0].length; i++) {
            System.out.print(notas[col][i]+"-");
        }
            System.out.println("");
        }
         int minima;
        for (int i = 0; i < files; i++) {
            minima= notas[i][0];
            for (int j = 0; j < colum; j++) {
               if(minima>notas[i][j]){
                   minima = notas[i][j];
               } 
            }
            System.out.println("La nota minima de "+(i+1)+" es "+ minima);
        }
    }
}
