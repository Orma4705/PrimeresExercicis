/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.ArrayList;
import java.util.List;

/**
 *DAO el encarrgeat de la estructura de guardar cromos
 * Tindra tots els metodes ( afegir,treure,canviar)
 * retorna objectes, exceptions o valor de la part de la app
 * @author orma4705
 */
public class CromoDAO {
    List<Cromo> album;
    List<Cromo> repes;
    int num_max_coleccio;
    
    
    
    public CromoDAO(int max){
        album = new ArrayList<Cromo>();
        repes = new ArrayList<Cromo>();
        num_max_coleccio = max;
    }
    //no scanner y els souts
    
    public boolean afegirCromo(Cromo cromo_add) throws NumberOutOfAlbum{
        //comprobar que el num no surt fora limits
        // si surt fora llança la excepcio demanada
        //sino haig de mirar si no el tinc repes
        if(this.num_max_coleccio<cromo_add.getNum()){
            throw new NumberOutOfAlbum("Cromo no es de la coleccio");
        }
        if(!album.contains(cromo_add)){
            album.add(cromo_add);
            return true;
        }
        else{
            repes.add(cromo_add);
            return false;
        }
        
    }
    
public int removeCard (Cromo del){
    if(repes.remove(del)){
        return 0;
    }
    else if(album.remove(del)){
        return 1;
    }
    else{
        return -1;
    }

}
    
    //afegir
    
    //esborrar
    
    //canviar
    
    //buscar
    
    public List<Cromo> getAlbum() {
        return album;
    }

    public List<Cromo> getRepes() {
        return repes;
    }

    public int getNum_max_coleccio() {
        return num_max_coleccio;
    }
    public int getNumAlbum(){
        return album.size();
    }
    public int getNumRepes(){
        return repes.size();
    }
    
}
