/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Objectes.Digimon;
import Objectes.Pokemon;
import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de tu pokemon");
        String pika = sc.next();
        System.out.println("Vida de tu pokemon");
        int life = sc.nextInt();
        Pokemon pikachu =new Pokemon(pika, life);
        System.out.println("Nombre de tu digimon");
        String digi = sc.next();
        Digimon blastoise = new Digimon(digi);
        int pok_daño = pikachu.atacar();
        int digi_daño = blastoise.atacar();
        do{
            pikachu.atacar();
            blastoise.rebreAtac(pok_daño);
            blastoise.toString();
            blastoise.atacar();
            pikachu.rebreAtac(digi_daño);
            pikachu.toString();
        }while(pikachu.rebreAtac(digi_daño)==false && blastoise.rebreAtac(pok_daño)==false);
        
        
        if (pikachu.rebreAtac(digi_daño)==true || blastoise.rebreAtac(pok_daño)==false){
            System.out.println(pikachu.getNombre()+" HA GANADO");
        }
        else if (blastoise.rebreAtac(pok_daño)==true || pikachu.rebreAtac(digi_daño)==false){
            System.out.println(blastoise.getNombre()+" HA GANADO");
        }
        else {
            System.out.println("EMPATE");
        }
    }
    
}
