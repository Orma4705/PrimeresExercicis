/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_ex_bar;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Examen_Ex_Bar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
    char dia;
    int tipus;
        System.out.println("Quin dia de la semana es? Laborable (L) Dissabte (S) Festiu (F)");              
    dia = sc.next().charAt(0);
        System.out.println("Quin tipus de menu vols? (1) (2)");
        tipus = sc.nextInt();
        if (tipus>2 | tipus<1){
            System.out.println("Tipus de menu incorrecte");
          }
        switch (dia){
            case 'l','L':
                if (tipus == 1){
                    System.out.println("El menu costa 2");
                }
                if (tipus == 2){
                    System.out.println("El menu costa 2,50");
                }
                break;
            case 's','S':
                 if (tipus == 1){
                    System.out.println("El menu costa 2,20");
                }
                if (tipus == 2){
                    System.out.println("El menu costa 2,70");
                }
                break;
            case 'f','F':
                 if (tipus == 1){
                    System.out.println("El menu costa 2,30");
                }
                if (tipus == 2){
                    System.out.println("El menu costa 2,80");
                }
                break;
            default:
                System.out.println("Opcio dia incorrecte");
        }
    }
    
}
