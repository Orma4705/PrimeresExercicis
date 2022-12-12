/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioescribirfrase;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class EjercicioEscribirFrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] abecedario = new char [26];
        int cont=0;
        String frase = "";
        for (int i = 65; i < 91; i++) {
          abecedario[cont] = (char) i;
          cont++;
        }
        for (int i = 0; i < abecedario.length; i++) {
            System.out.println(abecedario[i]);
        }
        int pos;
        do{
        pos =PedirPosicionLetra();
        if (pos!=-1){
        frase = frase + abecedario[pos];
        }
        }while(pos!=-1);
        System.out.println(frase);
    }

    private static int PedirPosicionLetra() {
          Scanner sc = new Scanner(System.in);
        int valor;
        do{
            System.out.println("Pon la posicion letra (0-25)(-1 terminar)");
            valor=sc.nextInt();
        }while(!(valor>=-1 && valor<=25));
        return valor;
    }
    
}
