/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string2;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class STRING2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String f1 = "Hola que tal" ;            
        System.out.println(f1.length());
        System.out.println(f1.toCharArray());
        System.out.println(f1.substring(1));
        MayusculasMinusculas(f1);
        contarA(f1);
        int numA =contarA(f1);
        System.out.println("numero a: "+ numA);
        contarvocales(f1);
        int numvoc = contarvocales(f1);
        System.out.println("vocales que hay: "+numvoc);
        char letrabuscada= sc.next().charAt(0);
        int numcar = contarcaracteres(f1, letrabuscada);
        System.out.println("La letra "+ letrabuscada+" esta "+numcar);
        frase_sense_espai(f1);
    }
    public static void MayusculasMinusculas(String f1){
      System.out.println(f1.toUpperCase());  
      System.out.println(f1.toLowerCase());
    } 
    private static int contarA (String f1){
        int conta=0;
        for (int i = 0; i < f1.length(); i++) {
            System.out.println("posicion "+i+" caracter: "+f1.charAt(i));
            if (f1.charAt(i)=='a'){
                System.out.println("Incrementa contador");
                conta++;
            }
        }
        return conta;
    }
     private static int contarvocales(String f1){
         int contvoc = 0;
         for (int i = 0; i < f1.length(); i++) {
             if (f1.charAt(i)=='a' || f1.charAt(i)=='e' || f1.charAt(i)=='i' || f1.charAt(i)=='o' || f1.charAt(i)=='u' || f1.charAt(i)=='A' || f1.charAt(i)=='E' || f1.charAt(i)=='I' || f1.charAt(i)=='O' || f1.charAt(i)=='U'){
                 contvoc++;
                 System.out.println(contvoc);
             }
         }
         return contvoc;
     }
     private static int contarcaracteres(String f1, char letra){
         int numcaracter = 0;
         for (int i = 0; i < f1.length(); i++) {
             if (f1.charAt(i)==letra){
                 numcaracter++;
             }
         }
         return numcaracter;
     }
      private static void frase_sense_espai(String f1){
          System.out.println(f1.replace("", ""));
          for (int i = 0; i < f1.length(); i++) {
              if (f1.charAt(i) != ' '){
               System.out.println(f1.charAt(i));  
          }
          }
      }
}

