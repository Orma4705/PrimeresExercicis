/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetos;

import Interfaces.PersonaAmable;

/**
 *
 * @author orma4705
 */
public abstract class Equipo implements PersonaAmable{
    protected int id;
    protected String nombre;
    protected int edad;
    protected double salary;
    protected Equipos team;

    protected Equipo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        salary=1500;
    }

    public Equipo(int id, String nombre, Equipos team) {
        this.id = id;
        this.nombre = nombre;
        this.team = team;
    }
   
    
    /**
     * lo hacen todos igualmes mostrar una frase (igual) por
     * lo tanto en el padre y no hace falta redefinirlo
     */
    public void Concentrarse()
    {
        System.out.println(nombre+ "- me concentro en el hotel") ;
    }
    
    public void Viajar()
    {
        System.out.println(nombre + " viajo al partido...");
        //
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalary() {
        return salary;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Equipo)) {
            return false;
        }
        final Equipo other = (Equipo) obj;
        return this.id == other.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    

    
}
