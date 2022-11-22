/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorialrecursiu;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Suma_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        int solucion;
        System.out.println("Elige un numero");
        numero =sc.nextInt();
        solucion = Sumarecursiva(numero);
        System.out.println(solucion);
        
    }
    public static int Sumarecursiva(int suma){
        int resultado;
        if (suma<=1){
            return suma;
        }
            for (int i = 0; i <= suma; i++) {
              resultado = suma+Sumarecursiva(suma-1) ;
              return resultado;
            }
        return -1;
    }
}
