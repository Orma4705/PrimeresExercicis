/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenjackpot;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class ExamenJackpot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diners = 10;
        int apostado;
        char jugades1, jugades2, jugades3;
        boolean continuar;
         //apostado = Quantitat_apostada(diners);
       do{
        apostado = Quantitat_apostada(diners);  
        jugades1=tirada_disc();
        jugades2=tirada_disc();
        jugades3=tirada_disc();
        mostrar_tirada(jugades1, jugades2, jugades3);
        int guanyat = Calcular_premi(jugades1, jugades2, jugades3, apostado);
        diners=guanyat+apostado;
        continuar = Seguir_jugant(diners);
        }while (continuar == true);
    }
    public static int Quantitat_apostada(int saldo){
        Scanner sc = new Scanner(System.in);
        int quantitat;
        do{
        System.out.println("Quant vols apostar?");
        quantitat = sc.nextInt();
        }while(quantitat<0 || quantitat>=saldo);
        
        return quantitat;
    }
    public static char tirada_disc(){
        Random rd = new Random();
        int tirada;
        char lletra;
        tirada = rd.nextInt(3);
        switch (tirada) {
            case 0:
                lletra = 'A';
                break;
            case 1:
                lletra='B';
                break;
            default:
                lletra='C';
                break;
        }
        return lletra;
    }
    public static void mostrar_tirada(char tirada1, char tirada2, char tirada3){
        System.out.println("*****************");
        System.out.println("*"+tirada1+"-"+tirada2+"-"+tirada3+"*");
        System.out.println("*****************");  
    }
    public static int Calcular_premi(char tir1, char tir2, char tir3, int aposta){
        int guanyat = 0;
        if (tir1=='A' || tir2==tir3 || tir1==tir2){
            guanyat=aposta+5;   
        }
        else if (tir1=='B'||  tir2==tir3 || tir1==tir2){
            guanyat=aposta+2;
        }
        else if (tir1=='C'||  tir2==tir3 || tir1==tir2){
           guanyat=aposta+aposta; 
        }
        else{
            guanyat = 0;
        }
        return guanyat;
    }
    public static boolean Seguir_jugant(int saldo){
        boolean seguir;
        if (saldo>0 || saldo>25){
            seguir = true;
        }
        else{
            seguir =false;
            
        }   
        return seguir;
    } 
}
