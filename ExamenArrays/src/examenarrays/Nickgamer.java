package examenarrays;


import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Es increible faig el que es mes complicat pero lo mes facil no em surt absolutament res
 * aixo demana una frase despres compara amb el first (ho he intentat d'altre formes i no em surt)
 * El tema d'agafar les ultimes cuatre lletres em surt be pero el tema de la eleccio no 
 * jo flipoo
 * @author orma4705
 */
public class Nickgamer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, respuesta;
        System.out.println("Introduce el nombre");
        nombre = sc.nextLine();
        System.out.println("Vols retallar per davant (first) o  per darrere (last)");
        respuesta =sc.nextLine();
        String frase = "first";
         Random rd = new Random();
        int numeros = rd.nextInt(1,1000);
        if (respuesta == frase){
            String nickf = nombre.substring(0,4);
            System.out.println(nickf+"_"+numeros);
        }
        else {
            String nickl = nombre.substring((nombre.length()-4),nombre.length());
            System.out.println(nickl+"_"+numeros);
        }
    }
}
