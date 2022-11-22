/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenuf1;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class ExamenUf1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
         int dia, mes, any;
         System.out.println("Dia");
         dia = sc.nextInt();
         System.out.println("Mes");
         mes = sc.nextInt();
         System.out.println("Any");
         any = sc.nextInt();
         
         if (mes>=1900) {
             System.out.println("L'any es incorrecte:"+ any +" ha de ser superior a 1900");
         }
         else if (mes==2 && dia>28){
             System.out.println("El dia es incorrecte:"+ dia +" ha d'estar entre 0 i 28");
         }
         else if (mes==1 && dia>31) {
             System.out.println("El dia es incorrecte:"+ dia + " ha d'estar entre 0 i 31");
         }
          else if (mes==3 && dia>31) {
             System.out.println("El dia es incorrecte:"+ dia + " ha d'estar entre 0 i 31");
         } 
          else if (mes==4 && dia>30) {
             System.out.println("El dia es incorrecte:"+ dia + " ha d'estar entre 0 i 30");
         }
          else if (mes==5 && dia>31) {
             System.out.println("El dia es incorrecte:"+ dia + " ha d'estar entre 0 i 31");
         }
          else if (mes==6 && dia>30) {
             System.out.println("El dia es incorrecte:"+ dia + " ha d'estar entre 0 i 30");
         }
          else if (mes==7 && dia>31) {
             System.out.println("El dia es incorrecte:"+ dia + " ha d'estar entre 0 i 31");
         }
          else if (mes==8 && dia>31) {
             System.out.println("El dia es incorrecte:"+ dia + " ha d'estar entre 0 i 31");
         }
          else if (mes==9 && dia>30) {
             System.out.println("El dia es incorrecte:"+ dia + " ha d'estar entre 0 i 30");
         }
          else if (mes==10 && dia>31) {
             System.out.println("El dia es incorrecte:"+ dia + " ha d'estar entre 0 i 31");
         }
          else if (mes==11 && dia>30) {
             System.out.println("El dia es incorrecte:"+ dia + " ha d'estar entre 0 i 30");
         }
          else if (mes==12 && dia>31) {
             System.out.println("El dia es incorrecte:"+ dia + " ha d'estar entre 0 i 31");
         }
          else if (mes>12){
              System.out.println("El mes es incorrecte:"+ mes + " ha d'estar entre 1 i 12");
          }
          else if (dia<=0) {
              System.out.println("El dia es incorrecte:"+ dia + " ha de ser positiu");
          }
          else if (mes<=0) {
              System.out.println("El mes es incorrecte:"+ mes + " ha de ser positiu");
          }
          else if (any<=0) {
              System.out.println("El any es incorrecte:"+ any + " ha de ser positiu");
          }
          else {
       System.out.println("Dia "+ dia +" Mes "+ mes + " Any "+ any);
          }
    }
    
}
