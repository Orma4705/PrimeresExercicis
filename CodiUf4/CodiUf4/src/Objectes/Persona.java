/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author orma4705
 */
public class Persona {
    private final String DNI;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String DNI, String nombre, String apellidos, int edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona(String DNI) {
        this.DNI = DNI;
    }
    public boolean isMayorEdad(){
        return this.edad>17;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
    
    
}
