/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int lado;
        System.out.println("Pon la longitud del lado ");
        lado = sc.nextInt();
        int area = lado*lado;
        System.out.println("el lado mide " + lado);
        System.out.println("el area mide " + area);
        
    }
    
}
