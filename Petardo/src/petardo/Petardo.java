/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petardo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Petardo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        int pet1, pet2, pet3, petardo;
        Random rd = new Random();
        System.out.println("Que petardo quieres? (1-3)");
        petardo = sc.nextInt();
        pet1 = rd.nextInt(10)+1;
        pet2 = rd.nextInt(10)+1;
        pet3 = rd.nextInt(10)+1;
        if (petardo==1){
            if (pet1>=pet2 && pet1>=pet3){
                System.out.println("Has ganado");
            }
            else {
              System.out.println("Has perdido");
          }
        }
         if (petardo==2){
            if (pet2>pet1 && pet2>=pet3){
                System.out.println("Has ganado");
            }
            else {
              System.out.println("Has perdido");
          }
        }
          if (petardo==3){
            if (pet3>=pet1 && pet3>=pet2){
                System.out.println("Has ganado");
            }
            else {
              System.out.println("Has perdido");
         }
            
        }
          if (petardo>=4 || petardo <=0) {
              System.out.println("Numero equivocado");
          }
          
          for (int linia = 1; linia <=10; linia++) {
              if(linia<=pet1){
                  System.out.print(" * ");
              }
              else{
                  System.out.print(" - ");
              }
                Thread.sleep(500); 
                
            if(linia<=pet2){
                  System.out.print(" $ ");
              }
              else{
                  System.out.print(" / ");
              }
                Thread.sleep(500); 
                
            if(linia<=pet3){
                  System.out.print(" % ");
              }
              else{
                  System.out.print(" & ");
              }
                System.out.println("");
                       Thread.sleep(500);  
            
        }
      
        System.out.println("Petardo1: "+pet1+" Petardo2: "+pet2+" Petardo3: "+pet3);
    }
    
}
