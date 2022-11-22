/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor;

/**
 *
 * @author orma4705
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        for (i = 0; i < 6; i++) {
            System.out.println("-->"+ i);
        }
        System.out.println("");
        System.out.println("bucle en while");
        i=0;
        while(i <6) {
            System.out.println("*"+ i);
            i++;
        }
        System.out.println("");
        System.out.println("bucle en while");
        i=7;
        do{
            System.out.println("*"+ i);
            i++;
        } 
        while(i<6);
    }
    }
             
                  

