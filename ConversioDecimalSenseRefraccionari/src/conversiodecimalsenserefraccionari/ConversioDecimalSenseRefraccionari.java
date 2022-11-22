/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiodecimalsenserefraccionari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author orma4705
 */
public class ConversioDecimalSenseRefraccionari {

    /**
     * @param args the command line arguments
     */
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    void menu() throws IOException {
        while (true) {
            System.out.println("\nMENU");
            System.out.println("1.-DECIMAL => BINARIO");
            System.out.println("2.-DECIMAL => HEXADECIMAL");
            System.out.println("3.-DECIMAL => OCTAL\n");
            System.out.print("4.-SALIR\n OPCION: ");

            int opc = Integer.parseInt(in.readLine());
            String valor;
            System.out.print("\n");

            switch (opc) {
                case 1 -> {
                    System.out.println("\n\nDECIMAL => BINARIO");
                    System.out.print("DECIMAL= ");
                    valor = in.readLine();
                    // TODO Ref. Conversio a binari. 
                    int dec = Integer.parseInt(valor);
                    valor = Integer.toBinaryString(dec);
                    System.out.print("BINARIO: " + valor);
                }
                case 2 -> {
                    System.out.println("\n\nDECIMAL => HEXADECIMAL");
                    System.out.print("DECIMAL= ");
                    valor = in.readLine();
                    // TODO Ref. Conversio a hex. 
                    int hex = Integer.parseInt(valor);
                    valor = Integer.toHexString(hex);
                    System.out.print("HEXADECIMAL: " + valor);
                }
                case 3 -> {
                    System.out.println("\n\nDECIMAL => OCTAL");
                    System.out.print("DECIMAL= ");
                    valor = in.readLine();
                    dec_oct(valor);
                }
                case 4 ->
                    System.exit(0);
                default ->
                    System.out.print("Introduexi una opció de l'1 al 4.");
            }
        }
    }

    void dec_oct(String valor) {
        // TODO Rename dec to oct
        int dec = Integer.parseInt(valor);
        valor = Integer.toOctalString(dec);
        System.out.print("OCTAL: " + valor);
    }

    public static void main(String[] args) throws IOException {
        ConversioDecimalSenseRefraccionar conversion
                = new ConversioDecimalSenseRefraccionar();
        conversion.menu();
        System.out.println(menu);
    }

}
