/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dadosarray;
import java.util.Random;
/**
 *
 * @author orma4705
 */
public class DadosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] dados = new int [6];
        for (int i = 0; i < dados.length; i++) {
            dados[i]= 0;
        }
        int contador = 0;
        float frecuencia=0;
        do{
        int tirada = SimuladaLanzamiento();
        dados[tirada-1] = dados[tirada -1] +1;
        contador++;
        }while(contador < 10000);
        mostrarArray(dados);
        for (int i = 0; i < dados.length; i++) {
            frecuencia = (float) dados[i]/contador;
            System.out.println((i+1)+" Ha salido: "+(frecuencia*100)+"%");
        }   
    }
    private static int SimuladaLanzamiento() {
        Random rd = new Random();
        int lanzamiento = rd.nextInt(6)+1;
        return lanzamiento;
    }
     static void mostrarArray(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Posicio "+ (i+1) + " conte -> "+ valores[i]);
            }
    }   
}