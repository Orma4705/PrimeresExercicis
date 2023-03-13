/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author orma4705
 */
public class Nedador extends Gos implements NedadorInterface{
    
    protected EstilNatacio EstilNatacio;
    
    public Nedador(String nom, EstilNatacio ned) {
        super(nom);
        this.energia=100;
        this.hidratacio=200;
        EstilNatacio=ned;
    }

    @Override
    public void nedar() {
        this.energia-=5;
        this.hidratacio-=10;
        System.out.println("El nedador amb nom "+ nom + " esta nedant ara mateix");
    }


   
    
    
}
