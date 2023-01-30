/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_array_bid;

import java.util.Random;

/**
 *
 * @author orma4705
 */
public class Examen_Array_Bid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd=new Random();
        final int files=1;
        final int files1=3;
        final int colum=5;
        int [] LlistaBoles = new int [files];
        int bola;
        int [][]martin = new int [files1][colum];
        int [][]cartro = new int [files1][colum];
        boolean marcada,bingo,existeix_bola;
        plenarCartro(martin);
        plenarCartro(cartro);
        mostrarCartro(martin);
        mostrarCartro(cartro);
        do{
        do{
             bola = rd.nextInt();
            IntroduirBolaLlista(LlistaBoles, bola);
            MostrarLlistaBoles(LlistaBoles);
        }while(IntroduirBolaLlista(LlistaBoles, bola)==false);
            marcarBola(martin, bola);
            existeixBingo(martin);
            marcarBola(cartro, bola);
            existeixBingo(cartro);
            if(ExisteixLinea(martin)==true) {
                System.out.println("Linea");
            }
            else if (ExisteixLinea(cartro)==true){
                System.out.println("Linea");
            }
            mostrarCartro(martin);
            mostrarCartro(cartro);
        }while(existeixBingo(martin)==true || existeixBingo(cartro)==true);
        if (existeixBingo(martin)==true){
            System.out.println("Ha guanyat Martin");
        }
        else if (existeixBingo(cartro)==true){
            System.out.println("Ha guanyat el segon jugador");
        }
    }
    /*Paràmetre entrada: Array unidimensional d'enters anomenat LlistaBoles
Funcionament: Posar totes les posicions a -1*/
    public static void InicialitzarLlistaBoles(int [] LlistaBoles){
        
            for (int j = 0; j < LlistaBoles.length; j++) {
                LlistaBoles[j]=-1;
            }
        
    }
    /*Paràmetre entrada: Array unidimensional d'enters anomenat LlistaBoles
Funcionament: Mostrar tot l'array en una sola línia, cada posició separada per un asterisc
Exemple si l'array té 2,3,-1 → 2*3*-1*
Ampliació (0,5 pts més) Al mostrar el llistat, si la posició és -1, mostrarà un espai en lloc del -1
Exemple si l'array té 2,3,-1 → 2*3* *
*/
    public static void MostrarLlistaBoles(int [] LlistaBoles) {
         
            for (int j = 0; j < LlistaBoles.length; j++) {
                if (LlistaBoles[j]==-1){
                    System.out.print(" ");
                }
                else{
                System.out.print(LlistaBoles[j]+"*");
                }
            }
        
    }
    /*Paràmetre entrada: Array unidimensional d'enters anomenat LlistaBoles, variable entera
anomenada bola
Funcionament: Recorrerà un array, per insertar a la primera posició buida el valor contingut a la bola,
si no existeix previament. El array inicialment ve amb valors positius,i/o valor (-1) que voldrà dir posició
lliure(no cal comprobar).
Si al recorrer el array troba una posició amb el valor de bola, retornarà false(no l’introduirà).
Si recorrent el array troba una posició amb valor -1 (i previament no ha trobat el valor de bola)
ficarà aquell valor en aquesta posició i retornarà true.
Si arriba al final de l'array i no ha trobat cap -1 i tampoc el valor de la bola, retornarà false.*/
    public static boolean  IntroduirBolaLlista(int [] LlistaBoles,int bola) {
         
            for (int j = 0; j < LlistaBoles.length; j++) {
              if (LlistaBoles[j]==bola){
                return false;  
              }
              else if (LlistaBoles[j]==-1){
                  return true;
              }
            }
         return true;
    }
    /*Paràmetre entrada: Rebrà un array bidimensional d'enters, anomeneu-lo amb el vostre
cognom
Funcionament: Funció que omplirà totes les posicions amb valors aleatoris de l'1 al 90.*/

   public static void plenarCartro(int [][] martin){
       Random rd=new Random();
       int num = 0;
       do{
       for (int i = 0; i < martin.length; i++) {
           for (int j = 0; j < martin[0].length; j++) {
              martin[i][j]=rd.nextInt(90)+1;
              num=martin[i][j];
               existeixBola(martin,num);
           }
       }
       }while(existeixBola(martin,num)==false);
   }
 /*Paràmetre entrada: Rebrà un array bidimensional d'enters, anomeneu-lo amb el vostre cognom
Funcionament: Mostrarà l'array bidimensional separant tot l'array, separant les files per una nova
línia, i els valors de la mateixa línia, per un guió */
    public static void mostrarCartro(int [][] martin) {
        for (int i = 0; i < martin.length; i++) {
           for (int j = 0; j < martin[0].length; j++) {
               if(martin[i][j]==0){
                  System.out.print("X-");
              }

              else{
                  System.out.print(martin[i][j]+"-");
              }
           }
            System.out.println("");
       }
    }
   /* Paràmetre entrada: Array bidimensional d'enters, i un enter anomenat bola
Funcionament: Recorrerà tot l’array bidimensional:
Si troba el valor de bola, aquella posició la ficarà a 0, a més retornara true.
Si no troba el valor de bola, en tota la taula, retornarà false.*/
    public static boolean marcarBola(int [][] martin,int bola){
        for (int i = 0; i < martin.length; i++) {
            for (int j = 0; j < martin[0].length; j++) {
                if (martin[i][j]==bola){
                    System.out.println("marcat" + i + "," + j);
                   martin[i][j]=0;
                   return true;
                }
            }
        }
        return false;
        
    }
    /*Paràmetre entrada: Rebrà un array bidimensional anomeneu-lo amb el vostre cognom, enter
anomeneu-lo bola
Funcionament: Recorrerà tot l’array bidimensional:
Si troba el valor de bola, retornara true.
Si no troba el valor de bola, en tota la taula, retornarà false.*/
    public static boolean existeixBola(int [][] martin,int bola){
         for (int i = 0; i < martin.length; i++) {
            for (int j = 0; j < martin[0].length; j++) {
               if(martin[i][j]==bola){
                   return true;
               } 
            }  
         }
         return false;
    }
    /*Paràmetre entrada: Rebrà un array bidimensional anomeneu-lo amb el vostre cognom
Funcionament: Si totes les posicions d’aquest array es troben a 0, retornarà true.
Si alguna posició, no es 0 retornarà false.
Ajuda: Si alguna posició ja no es 0, llavors, ja se que no hi ha bingo*/
    public static boolean existeixBingo(int [][] martin){
         for (int i = 0; i < martin.length; i++) {
             for (int j = 0; j < martin[0].length; j++) {
              if(martin[i][j]==0){
                  return true; 
              }
             }
         }
         return false;
    }
   /*Crear una estructura per poder guardar les diferents boles del 1 al 90 que aniran sortint.
InicialitzarCartro, per cadascun dels cartrons. Estaria be que no és fiques un número repetit
(existeixBola) AIXO HO FA EL PLENAR CARTRO
*/
  /*Paràmetre entrada: Rebrà un array bidimensional anomeneu-lo amb el vostre cognom
Si alguna fila, de l'array bidimensional, totes les posicions d'aquest array es troben a 0, retornarà
true.
Si no en troba cap fila que ho compleixi o sigui que en totes les files retornarà false*/
    public static boolean ExisteixLinea(int [][] martin){
        int cont=0;
        for (int i = 0; i < martin.length; i++) {
            for (int j = 0; j < martin[0].length; j++) {
              if(martin[i][j]==0){
                  cont++;
              }  
            }
        }
        if (cont==5){
            return true;  
        }
        return false;
        
    }
}

