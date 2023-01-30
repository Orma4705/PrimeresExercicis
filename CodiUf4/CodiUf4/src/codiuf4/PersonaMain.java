/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codiuf4;

import Objectes.Persona;

/**
 *
 * @author orma4705
 */
public class PersonaMain {
    public static void main(String[] args) {
        Persona uno;
        Persona dos;
        //pedir datos por teclado 
        
        String DNI = "999989998Y";
        String nombre = "asfsdpo";
        String apellido = "policasfdas";
        int edad = 67;
        uno = new Persona(DNI, nombre, apellido, edad);
        DNI = "986745998Y";
        nombre = "bmnhjhj";
        apellido = "policsdfsds";
        edad = 17;
        dos = new Persona(DNI);
        dos.setApellidos(apellido);
        dos.setEdad(edad);
        dos.setNombre(nombre);
        if(uno.isMayorEdad()){
            System.out.println(uno.getNombre()+" "+ uno.getApellidos());
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println(uno.getNombre()+" "+ uno.getApellidos());
            System.out.println("Es menor de edad");
        }
         if(dos.isMayorEdad()){
            System.out.println(dos.getNombre()+" "+ dos.getApellidos());
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println(dos.getNombre()+" "+ dos.getApellidos());
            System.out.println("Es menor de edad");
        }
    }
}
