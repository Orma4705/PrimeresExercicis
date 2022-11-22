/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici_10;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exercici_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int dia, any, mes;
        System.out.print("Pon el dia: ");
        dia=sc.nextInt();
        System.out.print("Pon el mes: ");
        mes=sc.nextInt();
        System.out.print("Pon el año: ");
        any=sc.nextInt();
        boolean correcta;
        correcta = fecha_correcto(dia,mes,any);
        if (correcta){
            System.out.println("Fecha correcta");
        }
        else {
            System.out.println("Fecha incorrecta");
        }
    }
    
    public static boolean fecha_correcto(int dia, int mes, int any){
        boolean fecha = true;
        if (dia<=30 || dia>1){
            fecha=false;
        }
       if (mes<1 || mes>30){
           fecha=false;
       }
       if (any<1900){
           fecha=false;
       }
        return fecha;
    }
}
