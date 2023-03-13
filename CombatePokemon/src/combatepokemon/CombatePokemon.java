/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package combatepokemon;

import Objeto.Aigua;
import Objeto.Electric;
import Objeto.Pokemon;
import Objeto.Veri;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class CombatePokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //combatSenseArrayList();
        
        combatAmbArrayList();
        
    }

    private static void combatSenseArrayList() {
        Aigua water = new Aigua("Squirtle");
        Aigua water2 = new Aigua("Mudkip");
        Veri poison = new Veri("Golbat");
        
//        List<Pokemon> lluitadors;
//        lluitadors = new ArrayList<Pokemon> ();
//        
        
        
        
        
        while(water.getCP()>0 && poison.getCP()>0)
        {
            water.recibirImpacto(poison);
            if(water.getCP()>0)
            {
                poison.recibirImpacto(poison);
            }
        }
        
        if(water.getCP()>0)
        {
            System.out.println("ha ganado" + water.getNombre());
        }
        else
        {
            System.out.println("ha ganado" + poison.getNombre());
        }
//        
//        if(water.equals(s))
//        {
//            System.out.println("iguales");
//        }
//        else
//        {
//            System.out.println("diferentes");
//        }

//        water.recibirImpacto(poison);
//        water.recibirImpacto(water2);
    }

    private static void combatAmbArrayList() {
        Aigua water = new Aigua("Squirtle");
        Aigua water2 = new Aigua("Mudkip");
        Veri poison = new Veri("Golbat");
        
        List<Pokemon> lluitadors;
        lluitadors = new ArrayList<Pokemon> ();
        
        
        int opcion = ElegirPokemon();
        anyadirPokemonArrayList(lluitadors, opcion);
        
        opcion = ElegirPokemon();
        anyadirPokemonArrayList(lluitadors, opcion);
        System.out.println(lluitadors.toString());
        for (Pokemon fighter : lluitadors) {
            System.out.println(fighter);
        }
        
        System.exit(0);
        
        
        while(lluitadors.get(0).isVivo() && lluitadors.get(1).isVivo()){
           lluitadors.get(1).recibirImpacto(lluitadors.get(0));
           if(lluitadors.get(1).isVivo()){
               lluitadors.get(0).recibirImpacto(lluitadors.get(1));
           }
        }
        

        
        if(lluitadors.get(0).isVivo())
        {
            System.out.println("ha ganado" + lluitadors.get(0).getNombre());
        }
        else
        {
            System.out.println("ha ganado" + lluitadors.get(0).getNombre());
        }
    }

    private static int ElegirPokemon() {
        System.out.println("Escull pokemon a afegir (0-Aigua)"
        + ", (1-Electric), (2-Veri)");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        return opcion;
    }

    private static void anyadirPokemonArrayList(List<Pokemon> lluitadors, int opcion) {
        if(opcion==0)
            {
                lluitadors.add(new Aigua("Squirtle"));
                System.out.println("He afegit Squirtle");
            }
        else if(opcion==1)
                {
                   lluitadors.add(new Electric("Pikachu"));
                   System.out.println("He afegit Pikachu");
                }
        else
            {
                lluitadors.add(new Veri("Golbat")); 
                System.out.println("He afegit Golbat");
            }
    }
    
}
