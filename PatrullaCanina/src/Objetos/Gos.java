/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Objects;

/**
 *
 * @author orma4705
 */
public abstract class Gos implements NedadorInterface{
    protected String nom;
    public int energia;
    protected int hidratacio;

    public Gos(String nom) {
        this.nom = nom;
    }

    public Gos(String nom, int energia, int hidratacio) {
        this.nom = nom;
        this.energia = energia;
        this.hidratacio = hidratacio;
    }

   

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getHidratacio() {
        return hidratacio;
    }

    public void setHidratacio(int hidratacio) {
        this.hidratacio = hidratacio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gos other = (Gos) obj;
        return Objects.equals(this.nom, other.nom);
        
    }
    public  void bordar(){
        System.out.println("El gos "+ nom + " ha bordat");
       this.energia=-10;
       this.hidratacio=-20;
    }
    public  void menjar(){
        System.out.println("El gos "+ nom + " ha menjat");
        this.energia=200;
    }
    public  void beure(){
        System.out.println("El gos "+ nom + " ha begut");
        this.hidratacio+=50;
    }
    public  void rescatar(){
        System.out.println("El gos "+ nom + " ha sigut rescatat");
        this.energia-=20;
        this.hidratacio-=30;
    }

    @Override
    public String toString() {
        return "Gos amb nom=" + nom + " te energia= " + energia + " te hidratacio= " + hidratacio;
    }
    
    
   

    @Override
    public void nedar() {
       
    }
    
}
