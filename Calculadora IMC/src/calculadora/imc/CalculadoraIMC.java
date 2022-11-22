/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.imc;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class CalculadoraIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double resultat;
        double altura, massa;
        massa = calculopeso();
        altura = calculoaltura();
        resultat = calculoIndiceIMC(altura, massa);
        System.out.println(resultat);
        interpretarIndiceIMC(resultat);    
    }
    public static double calculoIndiceIMC(double estatura,double pes){
        double IMC;
        IMC= pes/(estatura*estatura);
        return IMC;
    }
    public static double calculopeso(){
        Scanner sc = new Scanner(System.in);
        double pes;
        do{
        System.out.println("Quin es el teu pes?");
        pes = sc.nextDouble();
        }while (pes>635);
        return pes;   
    }
    public static double calculoaltura(){
        Scanner sc = new Scanner(System.in);
        double altura;
        do{
        System.out.println("Quina es la teva altura? (Metres)");
        altura = sc.nextDouble();
        }while (altura>2.75);
        return altura;   
    }
    public static void interpretarIndiceIMC(double indiceIMC){
        if (indiceIMC<18.50){
            System.out.println("Baix Pes");
        }
        else if (indiceIMC>=18.50 || indiceIMC<=24.99){
            System.out.println("Normal");
        }
        else{
            System.out.println("SobrePes");
        }
    }
}
