/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenarrays;

import java.util.Random;

/**
 *
 * @author orma4705
 */
public class ExamenArrays {

    /**
     * En el while hauria d'haver pr quan arribes a 30 pero em dona fallo aixi que ho he tret i no es 
     * tan facil o se me escapen coses de com fer perque no trobo la solucio
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int [30];
        int pos = 0;
        inicialitzarTauler(numeros);
        definirCasellesMort(numeros);
        System.out.println("Aixi esta la carrera");
        mostrarTauler(numeros, pos);
        System.out.println("Comienca a jugar el jugador");
        do {
        pos = pos+tirarDau();
            mostrarTauler(numeros, pos);
            comprovarCasellaValida(numeros, pos);
        }while(comprovarCasellaValida(numeros, pos)==false );
        if (comprovarCasellaValida(numeros, pos)== true){
            System.out.println("Has mort");
        }
        if (comprovarCasellaValida(numeros, pos)==false ){
            System.out.println("Has guanyat");
        }
    }
    /**
     * dona numeros a cada un
     * @param numeros 
     */
     public static void inicialitzarTauler(int[]numeros){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= 1;
        }
    }
     /**
      * Dona les casselles que valen 0 pero ni idea de com comprovar que nos es repeteixin
      * @param numeros 
      */
     private static void definirCasellesMort(int[] numeros) {
        Random rd = new Random();
        int cont = 0;
        int posicion;
        do{
        posicion = rd.nextInt(0,numeros.length);
        numeros[posicion]=0;
        cont++;
        }while (cont!=4);
     }
     /**
      * Mostrar tauler amb uan funcio y dos parametres
      * @param numeros
      * @param pos 
      */
     public static void mostrarTauler(int[] numeros, int pos){
         mostrarArray(numeros);
         System.out.print(numeros[pos]);
         System.out.println(" ");
}
     /**
      * dona un numero del 1 al 6
      * @return 
      */
     public static int tirarDau(){
         Random rd = new Random();
         int tirada = rd.nextInt(0,6);
         return tirada;
     }
      static void mostrarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i+1)+"="+ numeros[i]+" ");
            }
    }
      /**
       * Aqui comproves la casella amb el array i la posicio que tens
       * @param numeros
       * @param pos
       * @return 
       */
    public static boolean comprovarCasellaValida(int[] numeros,int pos){
        boolean comprovacio;
        if (numeros[pos]!=1){
            comprovacio =true;
            return comprovacio;
        }
        else{
            comprovacio=false;
            return comprovacio;
        }
    }
}
