/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;






/**
 *
 * @author orma4705
 */
public class ListEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> llista = new ArrayList<Integer>();
        System.out.println(llista.isEmpty());
        llista.add(7);
        llista.add(new Integer (5));
        llista.add(17);
        llista.add(9);
        System.out.println(llista.isEmpty());
        System.out.println("Numero d'elemts  " + llista.size());
        for (Integer valor : llista){
            System.out.println(valor);
        }
        
        System.out.println("Recorrer iterator");
        Iterator<Integer> iter = llista.iterator();
        while(iter.hasNext()){
            Integer i = iter.next();
            System.out.println(i);
        }
        
        System.out.println("Recorrent llista metode get ");
        Integer val;
        for (int i = 0; i < llista.size(); i++) {
            val = llista.get(i);
            System.out.println(val);
        }
        System.out.println("Canvio la posicio 100 poso valor 2");
        llista.set(2, 100);
        for(Integer num : llista){
            System.out.println(num);
        }
        
        System.out.println("Afegeixo 100 a posicio 2 i la resta es mou");
        System.out.println("Afegeixo 100 a posicio 3 i la resta es mou");
        llista.set(2, 1000);
        for (Integer num : llista){
            System.out.println(num);
        }
        System.out.println("toString: "+ llista.toString());
        System.out.println("Index of busquem el 1000 i es troba "+ llista.indexOf(1000)+ " contains "+ llista.contains(100));
        System.out.println("Las Index of busquem el 1000 i es troba "+ llista.lastIndexOf(1000));
        System.out.println("Las Index of busquem el 50 i es troba "+ llista.lastIndexOf(50));
    }
    
}
