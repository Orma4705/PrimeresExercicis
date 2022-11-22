/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciswitch;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Exerciciswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int mes;
        System.out.print("Elige un numero del 1 al 12 ");
        mes = sc.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
             case 2:
             System.out.println("Febrero");
             break;
             
          case 3:
                System.out.println("Marzo");
                break;
           case 4:
                System.out.println("Abril");
                break;
                
            case 5:
                System.out.println("Mayo");
                break;
           case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
              case 8:
             System.out.println("Agosto");
             break;
              case 9:
                System.out.println("Septiembre");
                break;
                case 10:
                System.out.println("Octubre");
                break;
              case 11:
                System.out.println("Noviembre");
                break;
              case 12:
                System.out.println("Diciembre");
                break;
              default:
                  System.out.println("Opcion incorrecta");
                  break;  
        }
                
            
        
    }
    
}
