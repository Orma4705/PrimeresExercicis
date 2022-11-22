/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_multiplicar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Examen_multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        int  resultado, aleatori;
        Random rd = new Random();
        aleatori = rd.nextInt(9)+1;
        int respuesta; 
        int i, erradas = 0;
        do {
        for ( i = 1; i <= 10;i ++) {
            resultado=aleatori*i;
            System.out.print(aleatori+"*"+i+"=");
            respuesta = sc.nextInt();
            if (respuesta != resultado){
                erradas++;
                System.out.println(">> Incorrecte "+aleatori+"*"+i+" es igual a "+ resultado);
            }
        } //System.out.println(contador +"*"+i+"="+ resultado);
        }while (i==9);
        System.out.println("Has tingut un total de "+erradas+" erradas");
    }
    
}
