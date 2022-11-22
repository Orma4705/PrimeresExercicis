/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packkage_math;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class ProvesmetodesPropis {
    public static int pedirValorPositivo(){
        Scanner sc=new Scanner(System.in);
        int valor;
        do{
            System.out.println("Pon un valor positivo");
            valor = sc.nextInt();
        }while(valor<=0);
        return valor;
    }
      public static int pedirValorPositivoFrase(String frase){
        Scanner sc=new Scanner(System.in);
        int valor;
        do{
            System.out.println(frase);
            valor = sc.nextInt();
        }while(valor<=0);
        return valor;
    }
    public static int PedirValorEntreDosNumeros(int n1, int n2){
         Scanner sc=new Scanner(System.in);
        int valor;
        int max,min;
        if (n1>n2){
            max=n1;
            min=n2;
        }
        else{
            max=n2;
            min=n1;
        }
        do{
            System.out.println("Pon un valor entre" + min + " y " + max);
            valor = sc.nextInt();
        }while(valor<min || valor>max);
        return valor;
    }
}
