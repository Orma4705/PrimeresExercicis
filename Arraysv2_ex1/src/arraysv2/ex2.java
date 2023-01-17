/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysv2;

/**
 *
 * @author orma4705
 */
public class ex2 {
    public static void main(String[] args) {
         final int files=10;
        final int colum=10;
        int [][] mapa = new int [files][colum];

        
         for (int col = 0; col < mapa.length; col++) {
        for (int i = 0; i < mapa[0].length; i++) {
             mapa[col][i]=(col+1)*(i+1);
             System.out.print(mapa[col][i]+"-");
       
        }
             System.out.println("");
        }
    }
}
