/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Pokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] tiposPokemon = {
                                            "ACERO", 
                                            "AGUA", 
                                            "BICHO",
                                            "DRAGON",
                                            "ELECTRICO",
                                            "FANTASMA",
                                            "FUEGO",
                                            "HADA",
                                            "HIELO",
                                            "LUCHA",
                                            "NORMAL",
                                            "PLANTA",
                                            "PSIQUICO",
                                            "ROCA",
                                            "SINIESTRO",
                                            "TIERRA",
                                            "VENENO",
                                            "VOLADOR"
                                          };
 
 /*
        FILAS = Pokemon atacante
        COLUMNAS = Pokemon que recibe el ataque
         
        Significados de los números:
            - 0.5: el atacante hace la mitad de daño al oponente (No es muy eficaz) 
            - 1: el atacante hace un daño neutro al oponente (No se da información pero diremos neutro)
            - 2: el atacante hace el doble de daño al oponente (Es muy eficaz)
            - 0: el atacante hace un daño nulo al oponente (No afecta)
 
    */
    double[][] efectividadesPokemon = {
         
        /*ACERO   AGUA   BICHO   DRAGON   ELÉC   FANT   FUEGO   HADA   HIELO   LUCHA   NORMAL   PLANTA   PSI   ROCA   SINIE  TIERRA   VENENO   VOLADOR   */
         
        { 0.5   , 0.5  ,   1   ,   1    , 0.5  ,  1   ,  0.5   ,  2  ,   2   ,   1   ,    1    ,   1   ,  1   ,  2  ,   1   ,   1   ,    1   ,   1},   //ACERO
        {  1    , 0.5  ,   1   ,  0.5   ,  1   ,  1   ,   2    ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  2  ,   1   ,   2   ,    1   ,   1},   //AGUA
        { 0.5   ,  1   ,   1   ,   1    ,  1   , 0.5  ,  0.5   , 0.5 ,   1   ,  0.5  ,    1    ,   2   ,  2   ,  1  ,   2   ,   1   ,   0.5  ,  0.5},  //BICHO
        { 0.5   ,  1   ,   1   ,   2    ,  1   ,  1   ,   1    ,  0  ,   1   ,   1   ,    1    ,   1   ,  1   ,  1  ,   1   ,   1   ,    1   ,   1},   // DRAGÓN
        {  1    ,  2   ,   1   ,  0.5   , 0.5  ,  1   ,   1    ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  1  ,   1   ,   0   ,    1   ,   2},   // ELÉCTRICO
        {  1    ,  1   ,   1   ,   1    ,  1   ,  2   ,   1    ,  1  ,   1   ,   1   ,    0    ,   1   ,  2   ,  1  ,  0.5  ,   1   ,    1   ,   1},   // FANTASMA
        {  2    , 0.5  ,   2   ,  0.5   ,  1   ,  1   ,  0.5   ,  1  ,   2   ,   1   ,    1    ,   2   ,  1   , 0.5 ,   1   ,   1   ,    1   ,   1},   // FUEGO
        { 0.5   ,  1   ,   1   ,   2    ,  1   ,  1   ,  0.5   ,  1  ,   1   ,   2   ,    1    ,   1   ,  1   ,  1  ,   2   ,   1   ,   0.5  ,   1},   // HADA
        { 0.5   , 0.5  ,   1   ,   2    ,  1   ,  1   ,  0.5   ,  1  ,  0.5  ,   1   ,    1    ,   2   ,  1   ,  1  ,   1   ,   2   ,    1   ,   2},   // HIELO
        {  2    ,  1   ,  0.5  ,   1    ,  1   ,  0   ,   1    , 0.5 ,   2   ,   1   ,    2    ,   1   , 0.5  ,  2  ,   2   ,   1   ,   0.5  ,  0.5},  // LUCHA
        { 0.5   ,  1   ,   1   ,   1    ,  1   ,  0   ,   1    ,  1  ,   1   ,   1   ,    1    ,   1   ,  1   , 0.5 ,   1   ,   1   ,    1   ,   1},   // NORMAL
        { 0.5   ,  2   ,  0.5  ,  0.5   ,  1   ,  1   ,  0.5   ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  2  ,   1   ,   2   ,   0.5  ,  0.5},  // PLANTA
        { 0.5   ,  1   ,   1   ,   1    ,  1   ,  1   ,   1    ,  1  ,   1   ,   2   ,    1    ,   1   , 0.5  ,  1  ,   0   ,   1   ,    2   ,   1},   // PSÍQUICO
        { 0.5   ,  1   ,   2   ,   1    ,  1   ,  1   ,   2    ,  1  ,   2   ,  0.5  ,    1    ,   1   ,  1   ,  1  ,   1   ,  0.5  ,    1   ,   2},   // ROCA
        {  1    ,  1   ,   1   ,   1    ,  1   ,  2   ,   1    , 0.5 ,   1   ,  0.5  ,    1    ,   1   ,  2   ,  1  ,  0.5  ,   1   ,    1   ,   1},   // SINIESTRO
        {  2    ,  1   ,  0.5  ,   1    ,  2   ,  1   ,   2    ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  2  ,   1   ,   1   ,    2   ,   0},   // TIERRA
        {  0    ,  1   ,   1   ,   1    ,  1   , 0.5  ,   1    ,  2  ,   1   ,   1   ,    1    ,   2   ,  1   , 0.5 ,   1   ,  0.5  ,   0.5  ,   1},   // VENENO
        { 0.5   ,  1   ,   2   ,   1    , 0.5  ,  1   ,   1    ,  1  ,   1   ,   2   ,    1    ,   2   ,  1   , 0.5 ,   1   ,   1   ,    1   ,   1}    // VOLADOR
    };
        int eleccio = Menu();
        if (eleccio==1){
        ataquePokemon(tiposPokemon, efectividadesPokemon);
        }
        else if (eleccio==2){
            mostrarDebilidades();
        }
        
       
    }
    public static int Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******Menu********");
        System.out.println("1. Mostrar impacto de atacante 1 al atacante 2");
        System.out.println("2. Mostrar debilidades para un tipo pokemon");
        System.out.println("3. Mostrar todos los daños para un tipo de pokemon.");
        System.out.println("4. Mostrar con que pokemons es mas efectivo un tipo pokemon y contar cuantos hay. ");
        System.out.println("5. Mostrar todas las combinaciones de ataques que tenga la efectividad buscada y contar cuantos hay");
        System.out.print("Entra una opcio: ");
        int opcioSel = sc.nextInt();
        return opcioSel;
    }
    private static void ataquePokemon(String[] tiposPokemon, double[][] efectividadesPokemon ) {
        Scanner sc = new Scanner(System.in);
        String pok1;
        String pok2;
        int pokemon1;
        int pokemon2;
        do{
        System.out.println("Elige el primer pokemon: ");
        pok1 = sc.nextLine().toUpperCase();
        System.out.println("Elige el segundo pokemon: ");
        pok2 = sc.nextLine().toUpperCase();
        pokemon1=trobarFilaPokemon(pok1,tiposPokemon);
        pokemon2=trobarFilaPokemon(pok2, tiposPokemon);
        
        }while((pokemon1==-1 || pokemon2==-1));
        System.out.println("Pokemon 1 posicion: "+pokemon1);
        System.out.println("Pokemon 2 posicion: "+pokemon2);
        double num = efectividadesPokemon[pokemon1][pokemon2];
       //double num2 = efectividadesPokemon[pokemon2][pokemon1];
        System.out.println("El danyo del atacante 1 es: "+ num);
       // System.out.println(num2);
    }

    /**
     * Trobará la fila del pokemon
     * @param pok1
     * @param tiposPokemon
     * @return 
     */
    private static int trobarFilaPokemon(String pok1, String[] tiposPokemon) {
        int i;
        for (i = 0; i < tiposPokemon.length; i++) {
            if (pok1.equalsIgnoreCase(tiposPokemon[i])){
                return i; 
            }
        }
       return -1;
    } 

    private static void mostrarDebilidades(double[][] efectividadesPokemon,String[] tiposPokemon) {
       Scanner sc = new Scanner(System.in);
       String pok1;
        System.out.println("Elige el pokemon que quieras: ");
       pok1=sc.nextLine();
       int pokemon = trobarFilaPokemon(pok1, tiposPokemon);
       int cont = 0;
        for (int i = 0; i < tiposPokemon.length; i++) {
            if(efectividadesPokemon[pokemon][i]==2){
                System.out.println(tiposPokemon[pokemon]);
               cont++; 
            }
        }
    }
}
