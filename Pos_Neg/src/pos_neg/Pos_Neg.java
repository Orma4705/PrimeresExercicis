/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pos_neg;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Pos_Neg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int num;
        int pos=0, neg=0;
        do{
            System.out.println("Pon numeros. Para terminar pon un 0");
            num=sc.nextInt();
            if (num>0){
                pos++;
            }
            else if (num<0){
               neg++; 
            }
        }while (num!=0);
        System.out.println("Cantidad de positivos "+ pos);
        System.out.println("Cantidad de negativos"+ neg);
        System.out.println("Fin del programa");
          
    }
    
}
