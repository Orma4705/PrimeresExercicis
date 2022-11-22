/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
              int fact;
         System.out.println("Pon el numero y calculare su factorial");
          fact=sc.nextInt();
          int acum_factorial=1;
          int contador;
          for(contador = 1; contador<=fact; contador++){
            acum_factorial= contador*acum_factorial;
              System.out.println(contador+"*");
        }
          System.out.println("Factorial seria "+ acum_factorial);
            
    }
    
}
