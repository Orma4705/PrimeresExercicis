/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursivitat;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Recursivitat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        System.out.println("Cuantes files te el arbre?");
       
        int files = sc.nextInt();
        int resultat = calculaBombetes(files);
        System.out.println("El nombre de bombetes que contindra es : "+ resultat);
        
        
    }
    public static int calculaBombetes(int fila){
       int tot_files;
       if (fila==1){
           tot_files=1;
           return tot_files;
       }
       else if (fila>1){
          int con = fila*2-1;
       tot_files= con+calculaBombetes(fila-1);
       return tot_files;
       } 
        return 0;
    }
}
