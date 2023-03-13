/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author orma4705
 */
public class Bomber extends Gos implements NedadorInterface{
    
    public Bomber(String nom, int energia, int hidratacio) {
        super(nom, energia, hidratacio);
    }

    @Override
    public void nedar() {
        this.energia-=5;
        this.hidratacio-=10;
        System.out.println("El bomber amb nom "+ nom + " esta nedant ara mateix");
    }
    public void apagarFoc(){
      System.out.println("El bomber amb nom "+ nom + " esta apagant un foc ara mateix");  
      toString();
    }

   
    
}
