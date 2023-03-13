/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author orma4705
 */
public enum carta {
     PEKKA("Super Pekka",7),PRINCIPE("El principe",5),
    MINERO("El minero",3),ESBIRROS("Los Esbirros",3),
    MAGO("El mago",5);
    
   private String nombre;
   private int elixir;
   private int arena;

    private carta(String nombre, int elixir) {
        this.nombre = nombre;
        this.elixir = elixir;
       
        if(elixir==8){
          this.arena = 13;
        }
        else if(elixir==9){
           this.arena = 10;
        }
        else{
           this.arena = arena;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getElixir() {
        return elixir;
    }

    public int getArena() {
        return arena;
    }
 public void setElixir(int elixir) {
       if (elixir==8)
       {
                this.arena=10;
                this.elixir=elixir;
       }        
        else if (elixir==9)
        {
                this.arena = 13;
                this.elixir=elixir;
        }
        else
            {
                this.arena = elixir;
                this.elixir=elixir;
            }
     
}
 @Override
    public String toString() {
        return "carta{" + "nombre=" + nombre + ", elixir=" + elixir + '}';
    }
}