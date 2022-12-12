/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leerletras_contarlas;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class LeerLetras_Contarlas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = sc.nextLine();
        frase=frase.toUpperCase();
        int[] vocales = new int [5];
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)=='A'){
            vocales[0] = vocales[0]+1;
            }
            if (frase.charAt(i)=='E'){
            vocales[1] = vocales[1]+1;
            }
            if (frase.charAt(i)=='I'){
            vocales[2] = vocales[2]+1;
            }
            if (frase.charAt(i)=='O'){
            vocales[3] = vocales[3]+1;
            }
            if (frase.charAt(i)=='U'){
            vocales[4] = vocales[4]+1;
            }
        }
    }
    
}
