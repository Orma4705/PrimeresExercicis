/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1arraysstring;
import java.util.Scanner;
/**
 *
 * @author orma4705
 */
public class Ejercicio1ArraysString {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }
        String[] paraules = frase.split(" ");
        for (int i = 0; i < paraules.length; i++) {
            System.out.println(paraules[i]); 
        }
    }
}