/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package precioiva;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class PrecioIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int cont_precio = 0;
        double iva, precio;
        do {
            System.out.print("Pon un precio ");
            precio = sc.nextDouble();
            cont_precio++;
            iva=precio_mas_iva(precio);
            System.out.println("El precio con IVA "+iva);
            
        }while (cont_precio!=5);
    }
    public static double precio_mas_iva(double precio) {
    double precio_iva;
    precio_iva = precio * 1.21;
    return precio_iva;
}
    
}
