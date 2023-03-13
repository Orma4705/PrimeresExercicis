/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.Random;

/**
 *
 * @author orma4705
 */
public class Digimon {
    private String nombre;
    private int lifePoints;
    private boolean shield;

    public Digimon(String nombre) {
        this.nombre = nombre;
        this.lifePoints=600;
        this.shield=true;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public boolean isShield() {
        return shield;
    }
  /*
    RECIBE EL DAÑO DEL ADVERSARIO Y RETORNA UN BOOLEAN SI ESTA VIVO O MUERTO
    */
    public boolean rebreAtac(int daño){
         boolean vida= true;
         if(shield == true){
             shield = false;
             System.out.println("Escut desactivat");
         }
         else {
        this.lifePoints-=daño;
         }
        if(this.lifePoints<=0){
            vida=false;
            return vida;
        }
        System.out.println("Digimon vida "+lifePoints);
        return vida;
    }
     /*
    Ataca al adversario y si esta a punto de morir multiplica *2 el daño
    */
    public int atacar(){
         Random rd = new Random();
        int puntoscombate;
        puntoscombate= rd.nextInt(30, 200);
        System.out.println(nombre+" digimon ataca amb forca "+puntoscombate);
        return puntoscombate;
    }
     /*
    muestra el digimon sus caracteristicas
    */
    @Override
    public String toString() {
        return "Digimon{" + "nombre=" + nombre + ", lifePoints=" + lifePoints + ", shield=" + shield + '}';
    }
}
