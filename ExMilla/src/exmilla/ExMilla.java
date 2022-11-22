/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exmilla;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class ExMilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float milla, metro, metrostotales;
        System.out.println("Las Millas son ");
        milla = sc.nextFloat();
        metro = 1852;
        metrostotales = milla * metro;
        System.out.println("metros totales " + metrostotales);
    }
    
}
