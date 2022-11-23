/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TeoriaArrays;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class TeorriaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] notes;
        int nota;
        notes=new int[4];
        notes[0]=3;
        notes[1]=4;
        notes[2]=7;
        notes[3]=1;
        System.out.println("Array creat "+ notes);
        Funcions.mostrarArray(notes);
            int suma;
            double media;
            suma = Funcions.calcularSumaNotes(notes);
                 
        media = (double) suma/notes.length;
        System.out.println("La nota media es "+ media);
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon tus notas ");
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Introdueix la nota "+ (i+1));
            notes[i] = sc.nextInt();
        }
        suma = Funcions.calcularSumaNotes(notes);
         media = (double) suma/notes.length;
        System.out.println("La nota media es "+ media);
    }

    
    
}
