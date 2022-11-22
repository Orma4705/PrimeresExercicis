/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.uf1.num2;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class ExamenUf1Num2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Escriu un numero");
        num = sc.nextInt();
        if (num%2==0){
            if (num%3==0){
                System.out.println("Numero parell i divisible entre 3");
            }
            else {
                System.out.println("Numero parell i no divisible entre 3");
            }
        }
        else {
            System.out.println("Numero senar");
        }
    }
    
}
