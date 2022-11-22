/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg10.bucle;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exercici10Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
         int nota;
         boolean diez_acum=false ;
         do {
             System.out.println("Escribe la nota");
             nota=sc.nextInt();
              if (nota==10){
             diez_acum=true;
                    }    
             
         } while (nota!=-1); 
        
          if (diez_acum = true)  {
              System.out.println("Hay un diez");
              
          } 
          else {
              System.out.println("No hay un diez");
          }              
          
         
            
    }
    
}
