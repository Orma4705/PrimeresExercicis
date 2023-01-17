/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class TeoriaBidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int files=3;
        final int colum=4;
        int [][] mapa = new int [files][colum];
        
        mapa[0][0] = 4;
        mapa[0][1] = 14;
        mapa[0][2] = 24;
        mapa[0][3] = 34;
        
        
        mapa[1][0] = 5;
        mapa[1][1] = 15;
        mapa[1][2] = 24;
        mapa[1][3] = 34;

        
        
        mapa[2][0] = 6;
        mapa[2][1] = 16;
        mapa[2][2] = 26;
        mapa[2][3] = 36;
        
        for (int col = 0; col < mapa.length; col++) {
        for (int i = 0; i < mapa[0].length; i++) {
            System.out.print(mapa[col][i]+"-");
        }
            System.out.println("");
        }
        System.out.println("Poniendo todo valores aleatorios");
        Random rd=new Random();
        for (int col = 0; col < mapa.length; col++) {
        for (int i = 0; i < mapa[0].length; i++) {
            mapa[col][i]=rd.nextInt(100)+1;
        }
        }
        
        for (int col = 0; col < mapa.length; col++) {
        for (int i = 0; i < mapa[0].length; i++) {
            System.out.print(mapa[col][i]+"-");
        }
            System.out.println("");
        }
        
        Scanner sc = new Scanner(System.in);
        for (int col = 0; col < mapa.length; col++) {
        for (int i = 0; i < mapa[col].length; i++) {
            System.out.println("Pon valor para "+ i + "-" + col);
            mapa[col][i] = sc.nextInt();
        }
            System.out.println("");
        }
        
         for (int col = 0; col < mapa.length; col++) {
        for (int i = 0; i < mapa[col].length; i++) {
            System.out.print(mapa[col][i]+"-");
        }
            System.out.println("");
        }
    }
    
}
