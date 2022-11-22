/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici17;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exercici17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int hora, minutos, sec;
        System.out.println("Hora");
         hora= sc.nextInt();
         System.out.println("Minutos");
         minutos = sc.nextInt();
         System.out.println("Segundos");
         sec = sc.nextInt();
         
        sec = sec+1;
        
        if (sec == 60) {
            sec=0;
            minutos = minutos+1;
            
        
         if (minutos == 60) {
            hora= hora+1;
            minutos = 0;
           
         }
         if (hora == 24){
             hora = 0;
             minutos = 0;
                     
             sec = 0;
         }
        }
            System.out.println("Hora " + hora );
            System.out.println("Minutos " + minutos );
            System.out.println("Segundos " + sec);
        
    
    }
    
}
