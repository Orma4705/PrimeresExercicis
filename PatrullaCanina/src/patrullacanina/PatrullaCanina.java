/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patrullacanina;

import Objetos.Bomber;
import Objetos.EstilNatacio;
import Objetos.Gos;
import Objetos.Nedador;
import Objetos.Policia;
import java.util.Scanner;


/**
 *
 * @author orma4705
 */
public class PatrullaCanina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gos[] canina = new Gos[6];
        creaPersonatges(canina);
        llistaPersonatges(canina);
        actuarGossos(canina);
        ferNedar(canina);
        cansarGos(canina);
  
    }
    private static void creaPersonatges(Gos[] canina){  
        canina[0]= new Policia("Max");
        canina[1]= new Policia("Pau");
        canina[2]= new Nedador("Pedri",EstilNatacio.BRACA);
        canina[3]= new Nedador("Alma",EstilNatacio.CROL);
        canina[4]= new Bomber("Alfredo", 150, 150);
        canina[5]= new Bomber("Eustaquio", 150, 150);
        
    }
    private static void  llistaPersonatges(Gos[] canina){
        for (int i = 0; i < canina.length; i++) {
            canina[i].toString();
        }
  
    }
    private static void actuarGossos(Gos[] canina){
        for (int i = 0; i < canina.length; i++) {
            canina[i].bordar();
            canina[i].rescatar();
            canina[i].menjar();
            canina[i].beure();
            canina[i].toString();
        }
    }
    private static void ferNedar(Gos[] canina){
        for (int i = 0; i < canina.length; i++) {
            canina[i].nedar();    
        }
    }
    private static void cansarGos(Gos[] canina){
        int pos;
         Scanner sc = new Scanner(System.in);
         System.out.println("Escull un gos que vols que bordi");
         pos=sc.nextInt();
       do{
          canina[pos].bordar();
          canina[pos].toString();
       }while(canina[pos].energia<=0); 
        System.out.println("El gos s'ha cansat");
    }
    

}
