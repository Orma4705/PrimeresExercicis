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
public class Pokemon {
    private final String nombre;
    private int lifePoints;
    private int combatPoints;

    public Pokemon(String nombre, int lifePoints) { 
        Random rd = new Random();
        this.nombre = nombre;
        this.setLifePoints(lifePoints);
        this.combatPoints = rd.nextInt(100, 200);
    }

    public void setLifePoints(int lifePoints) {
        if(lifePoints>1000){
            this.lifePoints=1000;
            System.out.println("Vida erronea, vida=1000");
        }
        else{
            this.lifePoints=lifePoints;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getCombatPoints() {
        return combatPoints;
    }
    /*
    Aqui cambia los puntos de combate con un random
   */ 
    private int canviCombatPoints(){
        Random rd = new Random();
        combatPoints= rd.nextInt(100, 100);
        return this.combatPoints; 
    }
 /*
    FUNCION QUE MUERTA UN GRITO DE COMBATE
    */
    private void critCombat(int combatpoints){
        combatpoints=this.combatPoints;
        System.out.println(nombre+" pokemon ataca amb forca "+combatpoints);
    }
    /*
    RECIBE EL DAÑO DEL ADVERSARIO Y RETORNA UN BOOLEAN SI ESTA VIVO O MUERTO
    */
    public boolean rebreAtac (int daño){
        boolean vida= true;
        this.lifePoints-=daño;
        if(this.lifePoints<=0){
            vida=false;
            return vida;
        }
        System.out.println("Pokemon vida "+lifePoints);
        return vida;
    }
    /*
    Ataca al adversario y si esta a punto de morir multiplica *2 el daño
    */
    public int atacar(){
        int combatfinal;
        if(lifePoints<100){
            combatfinal=combatPoints*=2;
            critCombat(combatfinal);
            return combatfinal;
        }
        critCombat(combatPoints);
        return combatPoints;
    }
    /*
    muestra el pokemon y sus caracteristicas
    */
        @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", lifePoints=" + lifePoints + ", combatPoints=" + combatPoints + '}';
    }
}
