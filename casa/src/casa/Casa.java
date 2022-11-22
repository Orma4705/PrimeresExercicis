/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casa;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Casa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int minimo, maximo;
        System.out.println("Pon valor minimo");
        minimo = sc.nextInt();
        System.out.println("Pon valor maximo");
        maximo = sc.nextInt();
        for (int cont = minimo; cont <= maximo; cont++) {
            if (cont%2==0){
                System.out.println(+cont);
            }
                   
        }
    }
    
}
