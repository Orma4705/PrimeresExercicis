/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uefa2;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class MayorEdad {
    
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    int edad;
    System.out.println("Cual es tu edad?");
    edad=sc.nextInt();
    boolean Mayor = mayor(edad);
    if (Mayor==true){
    System.out.println("Eres Mayor de edad");
    }
    else {
    System.out.println("Eres Menor de edad");
    }
}
public static boolean mayor(int num) {
  boolean old;
    if (num>=18)  {
      //System.out.println("Eres Mayor de edad");
      old=true;
  }
  else {
     // System.out.println("Eres menor de edad");
      old = false;
  }
 return old;
}

}

