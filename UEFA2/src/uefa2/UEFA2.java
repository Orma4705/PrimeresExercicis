/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uefa2;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class UEFA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("maximo");
        System.out.println("Muestrame el valor 1");
        double num1= sc.nextDouble();
        System.out.println("Muestrame el valor 2");
        double num2= sc.nextDouble();
        double max, min;
        max = maximo(num1,num2);
        System.out.println("maximo-> "+max);
        
        min=minimo(num1,num2);
        System.out.println("minimo-> "+ min);
    }
    public static double maximo(double valor1, double valor2) {
    double max;
    if (valor1 > valor2){
        max = valor1;
    }
    else{
        max = valor2;
    }
    return max;
}

    public static double minimo(double valor1, double valor2) {
    double min;
    if (valor1 > valor2){
        min = valor2;
    }
    else{
        min = valor1;
    }
    return min;
}
}
