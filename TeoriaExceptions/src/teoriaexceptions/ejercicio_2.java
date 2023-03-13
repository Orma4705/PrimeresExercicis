/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class ejercicio_2 {
    public static void main(String[] args) {
        try{
            Pedir();
        }
        catch (InputMismatchException e){
            System.out.println("No has puesto un entero");
        }
        catch(ArithmeticException r){
            System.out.println("No se puede dividir");
        }
    }
    public static void Pedir(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Pon un valor");
    int a = sc.nextInt();
        System.out.println("Pon un segundo valor");
    int b =sc.nextInt();
    int resultado = a/b;
    System.out.println(resultado); 
    }
}
