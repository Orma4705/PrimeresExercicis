/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale.correfgido;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class CLASHROYALECORREFGIDO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        int copas;
         System.out.println("Cuantes copes tens? ");
        copas = sc.nextInt();
        System.out.println("escoge una carta");
        char carta;
        if (copas<2000) {
            System.out.println("M-mago electrico"); 
            System.out.println("E-esbirro mega");
            System.out.println("escoge una carta");
            carta = sc.nextLine().charAt(0);
            switch (carta) {
                case 'm':
                case 'M':
                    System.out.println("Has escogido mago electrico");
                    break;
                case 'e':
                case 'E':
                    System.out.println("Has escogio esbirro mega");
            }
        }
        else if (copas>=2000 && copas<=3000) {
            System.out.println("C-Cavallero"); 
            System.out.println("B-Bandida");
            System.out.println("escoge una carta");
            carta = sc.nextLine().charAt(0);
            switch (carta) {
                case 'c':
                case 'C':
                    System.out.println("Has escogido Cavallero");
                    break;
                case 'b':
                case 'B':
                    System.out.println("Has escogio Bandida");
        }
    }
        else if (copas>=3000) {
            System.out.println("G-Gigante"); 
            System.out.println("K-Ejercito de esqueletos");
            System.out.println("escoge una carta");
            carta = sc.nextLine().charAt(0);
            switch (carta) {
                case 'g':
                case 'G':
                    System.out.println("Has escogido Gigante");
                    break;
                case 'k':
                case 'K':
                    System.out.println("Has escogio Ejercito de esqueletos");
        } 
        }
    }   
}
