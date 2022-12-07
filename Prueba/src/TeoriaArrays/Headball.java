/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TeoriaArrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Headball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] tarjetas = new int [4];
        int premio, monedas=0;
        int posicion_escollida;
        boolean respuesta=true;
        do{
        llenarArrayMonedas(tarjetas);
        Funcions.mostrarArray(tarjetas);
        posicion_escollida = pedirPosicion(tarjetas.length);
        premio = devolverPremio(tarjetas,posicion_escollida);
        if (premio!=-1){
            monedas = monedas+premio;
            System.out.println("Llevas ganado "+ monedas);
            respuesta = pedirContinuarOplantar();
        }
        else{
           monedas=0;
        }
        }while(premio!=1 || (respuesta==true));
        System.out.println("Al final has ganado " + monedas);
    }

    private static void llenarArrayMonedas(int[] tarjetas) {
        Random rd = new Random();
        for (int i = 0; i < tarjetas.length; i++) {
            tarjetas[i] = rd.nextInt(1,21);
        }
        ponerTarjetaRoja(tarjetas);
    }

    private static void ponerTarjetaRoja(int[] tarjetas) {
        Random rd = new Random();
        int posicion = rd.nextInt(0,4);
        tarjetas[posicion]=-1;
    }
    
    private static int pedirPosicion(int tope){
        Scanner sc = new Scanner(System.in);
        int pos;
        do{
            System.out.println("Pon posicion 1-"+tope);
            pos=sc.nextInt();
        }while(pos<1 || pos>tope);
        return pos-1;
    }

    private static int devolverPremio(int[] tarjetas, int posicion_escollida) {
        if (tarjetas[posicion_escollida]!=-1){
            System.out.println("Has ganado "+tarjetas[posicion_escollida]+" monedas");
        }
        else{
            System.out.println("Tarjetas Roja perdiste");
        }
        return tarjetas[posicion_escollida];
    }
    
    private static boolean pedirContinuarOplantar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres continuar(Si/No)");
        String frase = sc.next();
        if (frase.equalsIgnoreCase("Si")){
         return true;   
        }
        else{
            return false;
        }
    }
}
