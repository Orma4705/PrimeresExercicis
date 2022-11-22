/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exempleholamundo;

/**
 *
 * @author orma4705
 */
public class ExempleHolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=2;
        char hola_adios='H';
        System.out.println("x en main "+x);
        imprimeHelloWorldEnIdiomas(x,hola_adios);
    }
      public static void imprimeHelloWorldEnIdiomas(int idioma){
          System.out.println("idioma o el valor de x que me ha llegado "+idioma);
        switch (idioma){
            case 1:
             System.out.println("Hello World");   
             System.out.println("Goodbye");  
        break;
        case 2:
             System.out.println("Hola mon");   
             System.out.println("Adeu"); 
             break;
        case 3:
            System.out.println("Hola mundo");
            System.out.println("Adios");
            break;
        }
      }
    public static void imprimeHelloWorldEnIdiomas(int idioma, char helloGoodbye){
        System.out.println("idioma o el valor de x que me ha llegado "+idioma);
        if (idioma==1){
            if (helloGoodbye=='H'){
             System.out.println("Hello World");   
            }
         if (helloGoodbye=='A'){
             System.out.println("Goodbye");  
            }
            
        }
        else if (idioma==2){
            if (helloGoodbye=='H'){
             System.out.println("Hola mon");   
            }
         if (helloGoodbye=='A'){
             System.out.println("Adeu"); 
            }        
         }
        else {
            System.out.println("Hola mundo");
            System.out.println("Adios");
        }
    }
}
