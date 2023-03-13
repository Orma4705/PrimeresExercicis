/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Random;

/**
 *
 * @author orma4705
 */
public abstract class cofregeneric {
    protected int num_monedas;
    protected carta carta1;
    
    protected abstract void obrirCofre();
    public String mostrar_cofre(){
        return "Monedas "+ num_monedas +" Carta1..."+ carta1;
    }
    
    protected int trobarMonedes(int min, int max){
        Random rd = new Random();
        int monedes = rd.nextInt(min, (max+1));
        return monedes;
    }
    protected carta seleccionarCarta(){
        carta[] cartes_clas_royale = carta.values();
        Random rd = new Random();
        int random_num = rd.nextInt(cartes_clas_royale.length);
        return cartes_clas_royale[random_num];
    }
}
