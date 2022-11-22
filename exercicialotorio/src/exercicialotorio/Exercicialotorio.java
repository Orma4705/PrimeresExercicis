/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicialotorio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exercicialotorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Random rd = new Random();
        int num;
        int aleatori;
       aleatori = rd.nextInt(51)+50;
        do {
        System.out.println("Dime un nuemro y te dire si acertaste");
        num = sc.nextInt();
            if (num>aleatori){
                System.out.println("El numero es mes petit");
            }
            else if (num<aleatori){
                System.out.println("El numero es mes gran ");
            }
            else if (aleatori==num){
                System.out.println("Has acertat");
            }
        }while (aleatori!=num);
                            
       }
}
