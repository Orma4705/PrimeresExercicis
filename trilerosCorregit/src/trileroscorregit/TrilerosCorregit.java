/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trileroscorregit;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class TrilerosCorregit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] cubiletes = new char[3];
        inicializarCubiletes(cubiletes);
        mostrarCubiletes(cubiletes);
        for (int i = 0; i < 10; i++) {
            System.out.println("Cambio: " + (i+1) + ": ");
            moverCubiletes(cubiletes);
        }
        int pos = PedirPosicionBolita();
        if (cubiletes[pos]== 'O'){
            System.out.println("Has ganado");
        }
        else {
            System.out.println("Has perdido");
        }
    }

    private static void inicializarCubiletes(char[] cubiletes) {
        for (int i = 0; i < cubiletes.length; i++) {
            cubiletes[i]= 'X';
        }
        Random rd = new Random();
        int pos = rd.nextInt(3);
        cubiletes[pos]='O';
    }
    private static void mostrarCubiletes(char[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]);
            if (i !=valores.length-1){
                System.out.print("-");
            }
            }
        System.out.println("");
    }

    private static void moverCubiletes(char[] cubiletes) {
         Random rd = new Random();
         int pos1,pos2;
         pos1 = rd.nextInt(3);
         do{
         pos2 = rd.nextInt(3);
         }while (pos1==pos2);
         System.out.println("Cambio la posicion " + (pos1+1)+" por la posicion "+(pos2+1));
         char aux = cubiletes[pos1];
         cubiletes[pos1] = cubiletes[pos2];
         cubiletes[pos2] = aux;
    }

    private static int PedirPosicionBolita() {
         Scanner sc = new Scanner(System.in);
        int pos;
        do{
            System.out.println("Pon el cubilete donde esta la bola");
            pos=sc.nextInt();
        }while(!(pos>=1 && pos<=3));
        return pos-1;
    }
    
}
