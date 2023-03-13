/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author orma4705
 */
public enum Equipo {
    BARCELONA("F.C.Barcelona",1),MADRID("Real Madrid",2),SEVILLA("Sevilla F.C",3),VILLAREAL("Villareal C.F",7);
    private String nombre_equipo;
    private int pos_liga_anterior;

    private Equipo(String nombre_equipo, int pos_liga_anterior) {
        this.nombre_equipo = nombre_equipo;
        this.pos_liga_anterior = pos_liga_anterior;
    }
    
}
