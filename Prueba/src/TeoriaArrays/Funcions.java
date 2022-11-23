/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TeoriaArrays;

/**
 *
 * @author orma4705
 */
public class Funcions {
    static int calcularSumaNotes(int[] notes) {
        int suma = 0;
         for (int i = 0; i < notes.length; i++) {
           //System.out.println("Posicio "+ i + " conte -> "+ notes[i]);
           suma = suma + notes[i];
            //System.out.println("Acumulado por ahora "+ suma);
            }
         return suma;
    }

    static void mostrarArray(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Posicio "+ i + " conte -> "+ valores[i]);
            }
    }
}
