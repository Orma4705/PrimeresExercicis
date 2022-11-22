/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bola;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Bola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo=100,bola_player, apuesta, ball, dinero_ganado;
        boolean winner;
        char seguir;
        do{
        bola_player = pedirNumero();
        apuesta = pedirDineroApuesta​(saldo);
        saldo = saldo - apuesta;
        System.out.println("Saldo "+ saldo);
        ball = caidaBola();
        pintaAsteriscos​(ball);
        winner = comprobarResultado​( ball, bola_player);
        if (winner=true){
            System.out.println("Has ganado");
            dinero_ganado = ganancias​(apuesta, bola_player);
            saldo = saldo + dinero_ganado;
        }
        else {
            System.out.println("No has acertado");
        }
        seguir = seguirJugando();
        }while (continuarJugando(seguir, saldo));
        System.out.println("Tu saldo es "+ saldo);
    }
    public static int pedirNumero(){
        Scanner sc=new Scanner(System.in);
        int bola;
        System.out.println("Elige numero entre el 1 al 36, (37 impar) (38 par)");
        bola = sc.nextInt();
        return bola;
    }
    public static int caidaBola(){
        int maquina;
        Random rd = new Random();
        maquina = rd.nextInt(37)+1;
        return maquina;
    }
    public static void pintaAsteriscos​(int num){
        int contador=0;
        do {
            System.out.print("*");
            contador++;
        }while (contador == num);
        System.out.print(num);
    }
   public static int pedirDineroApuesta​(int dinero_tienes){
       Scanner sc=new Scanner(System.in);
       int apuesta;
       do{
           System.out.println("Cuanto quieres apostar?");
           apuesta= sc.nextInt();
       }while (apuesta<=dinero_tienes);
       return apuesta;
   } 
   public static boolean comprobarResultado​(int bola, int num_apostado){
       boolean ganado;
       if (bola==num_apostado) {
           ganado = true;
       }
       else if (bola % 2 == 0 && num_apostado == 38){
           ganado=true;
       }
        else if (bola % 2 == 1 && num_apostado == 37){
           ganado=true;
       }
        else{
            ganado = false;
        }
       return false;
   }
   public static int ganancias​(int dinero_apostado, int num_apostado){
       int money;
       if (num_apostado>=1 && num_apostado<=36){
           money=dinero_apostado*35;
       }
       else if (num_apostado == 37 && num_apostado == 38){
           money = dinero_apostado*2;
       }
       else {
           money = 0;
       }
       return money;
   }
   public static char seguirJugando(){
       Scanner sc=new Scanner(System.in);
       char eleccion;
       do{
       System.out.println("Quieres seguir jugando? (s/S) (n/N)");
       eleccion = sc.next().charAt(0);
       }while (eleccion == 'S' || eleccion == 'N' || eleccion == 's'|| eleccion == 'n');
       return eleccion;
   }
   public static boolean continuarJugando​(char respuesta, int dinero){
       boolean continua;
       if (respuesta == 's' || dinero > 0 && respuesta == 'S'){
       continua=true;
       
   }
       else {
           continua = false;
       }
       return continua;
   }
}
