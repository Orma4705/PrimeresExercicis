/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysv2;

/**
 *
 * @author orma4705
 */
public class Arraysv2_ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int files=5;
        final int colum=5;
        int [][] mapa = new int [files][colum];
        int var = 1;
         for (int col = 0; col < mapa.length; col++) {
        for (int i = 0; i < mapa[0].length; i++) {
           
            mapa[col][i]=var;
            
            System.out.print(mapa[col][i]+"-");
            var++;
        }
            System.out.println("");
        }
    }
    
}
