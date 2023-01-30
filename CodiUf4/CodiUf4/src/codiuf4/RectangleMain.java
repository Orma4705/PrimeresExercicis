/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codiuf4;

import Objectes.rectangle;

/**
 *
 * @author orma4705
 */
public class RectangleMain {
    public static void main(String[] args) {
        rectangle uno;
        uno = new rectangle(0, 0, 5, 5);
        calcularperimetro(uno);
        uno.setX1(7);
        uno.setY1(3);
        uno.setX2(7);
        uno.setY2(9);
         calcularperimetro(uno);
    }

    private static void calcularperimetro(rectangle uno) {
         int base =uno.getX2()-uno.getX1();
        int lado = uno.getY2()-uno.getY1();
        int perimetro = (base*2)+(lado*2);
        System.out.println("("+uno.getX1()+","+uno.getY1()+") y ("+uno.getX2()+","+uno.getY2()+") perimetro = "+ perimetro);
    }
}
