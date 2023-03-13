/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cromos;

import Menu.Menu;
import Menu.OptionItem;
import Objectes.Cromo;
import Objectes.CromoDAO;
import Objectes.DescriptionToShort;
import Objectes.NumberOutOfAlbum;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author orma4705
 */
public class AlbumCromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlbumCromos app = new AlbumCromos();
        app.run();
    }

       private void run()
    {
        //ho deixo d'aquest form
        //creo un DAO (album)
        CromoDAO album = new CromoDAO(150);
        Menu cromos_menu = new Menu("Dragonball Collection");
        int option; 
        anyadiropcionesMenu(cromos_menu);
        Cromo aux;
        do{
        cromos_menu.DisplayMenú();
        option = cromos_menu.chooseOption();
        switch(option)
        {
            case 1: 
                System.out.println("Adios");
                break;
            case 2://afegir cromo
                aux = CrearCromoUsuario();
                try{
                    boolean ok=album.afegirCromo(aux);
                    if(ok){
                        System.out.println("Cromo añadido al album numero Cromos: "+ album.getNumAlbum());
                    }
                    else{
                        System.out.println("Cromo repetido numero de Cromos: "+ album.getNumRepes()); 
                    }
                }
                catch (NumberOutOfAlbum ex) {
                    System.out.println(ex.getMessage());
                }
                //crear un objecte cromo, amb els camps informats
                //afegir-lo al album DAO
                break;
            case 3:
                aux = CrearCromoUsuario();
                if(album.removeCard(aux)){
                    System.out.println("Cromo borrado " + album.getNumAlbum());
                }
                else{
                    System.out.println("Cromo no borrado "+ album.getNumAlbum());
                }
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        }while(option!=1); 
        
    }

    private void anyadiropcionesMenu(Menu cromos_menu) {
        cromos_menu.AddOption(new OptionItem("AfegirCromo"));
        cromos_menu.AddOption(new OptionItem("Sortir"));
        cromos_menu.AddOption(new OptionItem("Borrar cromo"));
    }
    private Cromo CrearCromoUsuario() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        Cromo card = null;
        boolean num_introduciodo_ok=false;
        while(!num_introduciodo_ok)
        {
        try{
        
        System.out.println("Pon el numero de cromo");
         num = sc.nextInt();
         sc.nextLine();
        }catch(InputMismatchException ex){
            System.out.println("Valor no es numerico");
            sc.nextLine();
            num_introduciodo_ok=false;
        }
        }
        
        
        while(!num_introduciodo_ok){
        System.out.println("Pon descripcion ");
        String Descripcion = sc.nextLine();
        
        try {
            card = new Cromo(num, Descripcion);
            num_introduciodo_ok=true;
        } catch (DescriptionToShort ex1) {
            System.out.println("Descripcion incorrecta "+ ex1.getMessage());
        } catch (Exception ex) {
            System.out.println("Descripcion incorrecta "+ ex.getMessage());
            num_introduciodo_ok=true;
        }
        }
        return card;
        
        
    }
}
