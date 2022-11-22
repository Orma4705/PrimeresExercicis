/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyaletorres;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class ClashroyaleTorres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Quin nivell te el llenyataire?");
        int niv_lleny = sc.nextInt();
        System.out.println("Quin nivell te la torre?");
        int niv_tor = sc.nextInt();
        int dany_lleny, dany_tor;
        int vida_tor, vida_lleny;
        
        switch (niv_lleny) {
            case 9:
                dany_lleny = 200;
                break;
            case 10:
                dany_lleny = 220;
                break;
            case 11:
                dany_lleny = 242;
                break;
            default:
                System.out.println("Nivel incorrecto");
                dany_lleny = 1;
                
        }
        switch (niv_tor) {
            case 9:
                vida_tor = 2534;
                break;
            case 10:
                vida_tor = 2786;
                break;
            case 11:
                vida_tor = 3052;
                break;
            default:
                System.out.println("Nivel incorrecto");
                vida_tor = 1;
        }
        int golp_lleny = 0;
        
        while (!(vida_tor<=0)) {
            vida_tor=vida_tor-dany_lleny;
            golp_lleny++;
            System.out.println("Lenyador ataca con fuerza de valor "+dany_lleny +" La torre li queda "+ vida_tor);
            Thread.sleep(500);
        }
        System.out.println("Lenyador ha atacado "+golp_lleny+" vegades "+vida_tor);
    }
    
}
