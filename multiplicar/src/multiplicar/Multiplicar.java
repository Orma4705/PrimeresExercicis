/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicar;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int contador, resultado;
        System.out.println("Escribe un numero");
        
            contador = sc.nextInt();
        for (int i = 1; i <= 10;i ++) {
            resultado=contador*i;
            System.out.println(contador +"*"+i+"="+ resultado);
        }
    }
    
}
