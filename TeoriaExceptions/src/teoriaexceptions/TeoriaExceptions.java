/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaexceptions;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class TeoriaExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] valores = new int [3];
        for (int i = 0; i < 10; i++) {
            System.out.println(valores[i]);
        }
        System.out.println("");
        Scanner sc=new Scanner(System.in);
        boolean dato_correcto=true;
        do{
        try{
        System.out.println("Pon un entero");
        
        int valor = sc.nextInt();
        }
        catch (Exception ex){
            System.out.println("Debes poner un entero y un mensaje");
            System.out.println(ex.getMessage());
            dato_correcto=false;
        }
        }while (dato_correcto=false);
        System.out.println("Final programa");
    }
    
}
