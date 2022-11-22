/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicic13;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exercicic13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int minim=0, maxim=100, mitad;
        char respuesta;
        do{
        mitad = (maxim+minim)/2;
        System.out.println("El numero es "+ mitad);
        System.out.println("He acertado?(i,m,n)");
        respuesta = sc.next().charAt(0);
        if (respuesta=='m'){
            minim=mitad;
        }
        else if (respuesta=='n'){
            maxim=mitad;
        }
        }while (respuesta!='i');
        System.out.println("Acertaste");
    }
    
}
