/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici18ext;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exercici18ext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horas,h_extra;
        double precio_horas;
        double salario_bruto, salario_hnormales, salario_extra;
        final int HORAS_NORMALES = 35, salario_sin_impuestos = 500;
        Scanner sc = new Scanner(System.in); //recoger datos teclado
        System.out.print("Posa les hores treballades? ");
        horas = sc.nextInt();
        System.out.print("Posa el preu que et paguen cada hora? ");
        precio_horas = sc.nextDouble();
        if (horas > HORAS_NORMALES)
        { //calclare horas y horas extra
            salario_hnormales = HORAS_NORMALES*precio_horas;
            h_extra = horas - HORAS_NORMALES;
            salario_extra = precio_horas*h_extra*1.5;
            salario_bruto = salario_hnormales+salario_extra;
        }
        else
        { //no hay horas extra
            salario_bruto = horas * precio_horas;
        }
        double salario_final;
        double salario_aplicar_impuestos, impuestos = 0;
       if (salario_bruto>salario_sin_impuestos){
           salario_aplicar_impuestos = salario_bruto - salario_sin_impuestos;
           impuestos = salario_aplicar_impuestos * 0.25;
           salario_final =salario_bruto - impuestos;
       }
       else {
           salario_final = salario_bruto;
       }
        
        
        
        System.out.println("El salario bruto es " + salario_bruto );
        System.out.println("Los impuestos seran " + impuestos);
        System.out.println("El salario neto " + salario_final + " Euros");
        
    }
    
    
}
