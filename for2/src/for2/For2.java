/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package for2;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class For2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc=new Scanner(System.in);
      do {
          System.out.println("Pon numeros, para terminar escibe 0? ");
          num=sc.nextInt();
          System.out.println("Has escrito ->" + num);
      }while(num!=0);
        System.out.println("programa terminado");
    }
    
}
