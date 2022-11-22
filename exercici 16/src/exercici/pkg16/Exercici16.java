/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg16;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exercici16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Teclado = new Scanner(System.in);
         double nota;
         System.out.println("Tu nota es "); 
         nota = Teclado.nextDouble();
         if (nota>=0 && nota<3) {
             System.out.println("Muy deficiente");
         } else if (nota>=3 && nota<5) {
            System.out.println("Insuficiente");
        }
         else if (nota>=5 && nota <6){
             System.out.println("Bien");
         }
         else if (nota>=6 && nota <9){
             System.out.println("Notable");
         }
         else if (nota>=9 && nota<=10){
             System.out.println("Excelente");
         }
         else{
             System.out.println("La nota debe estar entre 0 y 10. Tu has puesto "+ nota);
         }
    }
    
    
}
