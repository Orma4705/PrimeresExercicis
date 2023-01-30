/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codiuf4;

import Objectes.Punto;

/**
 *
 * @author orma4705
 */
public class PuntoMain {
    public static void main(String[] args) {
        Punto A =new Punto(5,0);
        Punto B =new Punto(10,10);
        Punto C =new Punto(-3,7);
        
        System.out.println("Punto A ("+A.getX()+","+A.getY()+")");
        System.out.println("Punto B ("+B.getX()+","+B.getY()+")");
        System.out.println("Punto C ("+C.getX()+","+C.getY()+")");
        
        A.setX(15);
        B.setX(14);
        C.setX(13);
        C.setY(12);
        
        System.out.println("Punto A ("+A.getX()+","+A.getY()+")");
        System.out.println("Punto B ("+B.getX()+","+B.getY()+")");
        System.out.println("Punto C ("+C.getX()+","+C.getY()+")"); 
    }
}
