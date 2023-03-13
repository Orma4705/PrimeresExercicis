/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasenum;

import Objetos.Demarcacion;

/**
 *
 * @author orma4705
 */
public class PruebasEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Demarcacion jugador= Demarcacion.Defensa;
        Demarcacion jugador2 = Demarcacion.Delantero;
        Demarcacion jugador3 = Demarcacion.Centrocampista;
        System.out.println(jugador.name());
        System.out.println(jugador2.name());
    }
    
}
