/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package for3;

/**
 *
 * @author orma4705
 */
public class For3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma_acum = 0;
        int contador=1;
        while (contador<=5){
            suma_acum = suma_acum + contador;
            System.out.println("contador:" + contador +" suma:"+ suma_acum);
            contador=contador+1;
             }
        System.out.println("suma acumulada while "+ suma_acum);
        suma_acum =0;
        for (contador = 1; contador<=5; contador++){
            suma_acum = suma_acum + contador;
            System.out.println("contador:" + contador +" suma:"+ suma_acum);
            
        }
        System.out.println("la suma cumulada es "+ suma_acum);
    }
    
}
