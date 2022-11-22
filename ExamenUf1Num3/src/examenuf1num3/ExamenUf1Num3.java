/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenuf1num3;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class ExamenUf1Num3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int entrades, adults, menors, tot_adults, tot_menors, total_preu;
        double preu_desc_final, entrades_desc = 0,preu_desc;
        System.out.println("Quantes entrades son?");
         entrades = sc.nextInt();
        System.out.println("Quants menors son?");
         menors = sc.nextInt();
         adults=entrades-menors;
          tot_adults=adults*20;
         tot_menors=menors*10;
         total_preu=tot_adults+tot_menors;
       
         if (entrades>=10 && entrades<25) {
             preu_desc = (int) (total_preu*0.75);
             System.out.println("Adults:"+ adults +" Menors:"+ menors +" Total a pagar:"+ preu_desc);
         }
         if (entrades>=25){
             if (adults==0){
                 entrades_desc=total_preu-10;
                
             }
             if (adults>0){
                 entrades_desc=total_preu-20;
                 
             }
             if (entrades>=10) {
             preu_desc_final = (double) (0.75*entrades_desc);
             System.out.println("Adults:"+ adults +" Menors:"+ menors +" Total a pagar:"+ preu_desc_final);
              }
            
            }
         if (entrades<10){
             System.out.println("Adults:"+ adults +" Menors:"+ menors +" Total a pagar:"+ total_preu);
         }
         
    }
    
}
