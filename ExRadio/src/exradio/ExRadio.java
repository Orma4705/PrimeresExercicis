/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exradio;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class ExRadio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float radio, diametro, longitud, area, pi;
        System.out.println("el radio es ");
        radio = sc.nextFloat();
        pi = (float) 3.14;
        diametro = radio + radio;
        longitud = pi * diametro;
        area = pi*(radio*radio);
        System.out.println("el diametro es " + diametro
                            + " longitud " + longitud
                            + " area " + area);
        
        
               
    }
    
}
