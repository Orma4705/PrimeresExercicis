/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal_Equipo;

import objetos.entrenador;
import objetos.futbolista;
import objetos.masajista;
import objetos.presidente;

/**
 *
 * @author orma4705
 */
public class Personal_equipo {
    public static void main(String[] args) {
        entrenador trainer = new entrenador(1, "Oriol");
        futbolista player = new futbolista(1, "Jeremy");
        masajista massager = new masajista(2, "Dani");
        presidente manager = new presidente(3, "Miquel Angel");
        
        if(!player.equals(trainer))
        {
            System.out.println("no iguales");
        }
        else
        {
            System.out.println("Iguales");
        }
        
        manager.tratarContrato(trainer);
        manager.tratarContrato(player);
        manager.tratarContrato(massager);
        
        trainer.Viajar();
        player.Viajar();
        massager.Viajar();
        manager.Viajar();
        System.out.println("sueldo jugador" + player.getSalary());
        player.jugarPartido();
        System.out.println("sueldo jugador" + player.getSalary());
    }
    
}

