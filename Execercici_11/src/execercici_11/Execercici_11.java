/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execercici_11;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Execercici_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero");
        int numero=sc.nextInt();
         multiplicacion(numero);
    }
     public static void multiplicacion(int num){
        
        for (int i = 1; i <= 10;i ++) {
            System.out.println(+i+"*"+num+"="+(i*num));
            }
        
     } 
}
