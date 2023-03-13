/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author orma4705
 */
public class Policia extends Gos {
    
    public Policia(String nom) {
        super(nom);
        this.energia=200;
        this.hidratacio=100;
    }
    public void detenir(){
        this.energia-=5;
        this.hidratacio-=10;
        System.out.println("El policia amb nom "+ nom + " esta detenint ara mateix");
    }

    
}
