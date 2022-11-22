/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulo;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double ancho, alto, areas, perimetros;
        System.out.println("Cual es la anchura del triangulo?");
        ancho = sc.nextDouble();
        System.out.println("Cual es la altura del triangulo?");
        alto = sc.nextDouble();
        perimetros = perimetroRectangulo(ancho,alto);
        areas = areaRectangulo(ancho,alto);
        System.out.println("AREA "+areas);
        System.out.println("PERIMETRO "+ perimetros);
    }
    public static double perimetroRectangulo(double ancho, double alto){
        double perimetro;
        perimetro = (alto*2)+(ancho*2);
        return perimetro;
    }
    public static double areaRectangulo(double ancho, double alto) {
        double area;
        area = ancho*alto;
        return area;
    }
}
