/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package credencials_examen;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Credencials_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int identificador = llegirNumero();
        int data = dataNaixement();
        char resposta;
        int contra_pos;
        boolean comprovacio;
        do{
        System.out.println("Coneixes la teva contrasenya?");
         resposta = sc.next().charAt(0);
        }while (!(resposta!='s' || resposta!='S' || resposta!='N' || resposta!='n'));
        int contra = generarContrasenya(identificador, data);
        if (resposta=='s' || resposta == 'S'){
            System.out.println("Posa la contrasenya");
            contra_pos = sc.nextInt();
        comprovacio = verificarCredencials(identificador, data, contra_pos);
            if (comprovacio == true){
                System.out.println("0. Sortir");
                System.out.println("1. Mostrar perfil d’usuari");
                int eleccio = sc.nextInt();
                if (eleccio == 0){
                    System.out.println("Fins aviat");
                }
                else if (eleccio==1){
                  mostrarPerfilUsuari(identificador, data);  
                }
            }
        }
        else if (resposta == 'n' || resposta == 'N'){
           mostrarPerfilUsuari(identificador, data); 
        }
    }
    public static int llegirNumero(){
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
        System.out.println("Eligeix un identificador entre 1000 i 10000 (exclosos els dos)");
        numero = sc.nextInt();
        }while (!(numero>1000 || numero<10000));
        return numero;
    }
    public static int generarContrasenya(int num, int fecha){
        int resultat = num*fecha;
        int contrasenya = resultat%10000;
        return contrasenya;
    }
            
    public static int dataNaixement(){
        int data;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Quina es la data de naixement (Any de neixament)");
            data = sc.nextInt();
        }while (!(data>=1900 || data<=2022));
        return data;
        
    }
    public static boolean verificarCredencials(int num, int fecha, int password) {
        boolean verificacio;
        int multiplicacio;
        int divisio;
        multiplicacio = num*fecha;
        divisio = multiplicacio%10000;
        int suma = 10000-divisio;
        if (suma+password==10000){
            verificacio = true;
            return verificacio;
         }
        else {
            verificacio = false;
            return verificacio;
        }  
    } 
    public static void mostrarPerfilUsuari(int num, int fecha){
        int edat;
        edat = 2022-fecha;
        System.out.println("**********************");
        System.out.println("     "+num+"-"+edat+"-"+ generarContrasenya(num, fecha));
        System.out.println("**********************");
    }
}
