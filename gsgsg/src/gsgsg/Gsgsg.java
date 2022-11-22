/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gsgsg;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Gsgsg {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int millas;
     double km;
     System.out.println("Escribe las millas que quieres passar a kilometros?"); 
     millas=sc.nextInt();
     km =millas_a_kilometros(millas);
    } 
 public static double millas_a_kilometros(int millas){
     double kil ;
     kil = millas * 1.60934;
     return kil;
 }
}
    

