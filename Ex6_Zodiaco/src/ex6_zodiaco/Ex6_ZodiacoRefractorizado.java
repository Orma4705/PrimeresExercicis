/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6_zodiaco;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Ex6_ZodiacoRefractorizado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fase uno (Coge los datos del usuario)
        System.out.println("Adivina tu signo del Zodiaco.");
        Scanner sc = new Scanner(System.in);
        boolean respuestasOK;
        
        System.out.println("¿Que dia naciste?(1-31)");
        int Dia = sc.nextInt();

        System.out.println("¿En que mes naciste?(1-12)");
        int Mes = sc.nextInt();

        //Fase dos (Verifica los datos del usuario)
        respuestasOK = Dia > 0 && Dia <= _31;
        respuestasOK = respuestasOK && Mes > 0 && Mes <= _12;

        System.out.println();
        String Signo="";
        if (respuestasOK) {
            Signo = MetodoFase3(Dia, Mes, Signo);

            //Fase cuatro, mostrar resultado.
            System.out.println("Tu signo es " + Signo);
        } else {
            System.out.println("El mes o el dia no son correctos.");
        }
    }

    private static String MetodoFase3(int Dia, int Mes, String Signo) {
        //Fase tres (Calculando datos)
        System.out.println("Calculando");
        if (Dia >= 21 && Mes == 3 || Dia <= 20 && Mes == 4) {
            Signo="Aries";
        }
        if (Dia >= 21 && Mes == 4 || Dia <= 21 && Mes == 5) {
            Signo="Tauro";
        }
        if (Dia >= 22 && Mes == 5 || Dia <= 21 && Mes == 6) {
            Signo="Geminis";
        }
        if (Dia >= 21 && Mes == 6 || Dia <= 27 && Mes == 7) {
            Signo="Cancer";
        }
        if (Dia >= 24 && Mes == 7 || Dia <= 23 && Mes == 8) {
            Signo="Leo";
        }
        if (Dia >= 24 && Mes == 8 || Dia <= 23 && Mes == 9) {
            Signo="Virgo";
        }
        if (Dia >= 24 && Mes == 9 || Dia <= 23 && Mes == 10) {
            Signo="Libra";
        }
        if (Dia >= 24 && Mes == 10 || Dia <= 22 && Mes == 11) {
            Signo="Escorpio";
        }
        if (Dia >= 23 && Mes == 11 || Dia <= 21 && Mes == 12) {
            Signo="Sagitario";
        }
        if (Dia >= 22 && Mes == 11 || Dia <= 20 && Mes == 1) {
            Signo="Capricornio";
        }
        if (Dia >= 21 && Mes == 1 || Dia <= 19 && Mes == 2) {
            Signo="Acuario";
        }
        if (Dia >= 20 && Mes == 2 || Dia <= 20 && Mes == 3) {
            Signo="Picis";
        }
        //Fin fase tres (Calculando datos)
        return Signo;
    }
    private static final int _12 = 12;
    private static final int _31 = 31;
    
}
