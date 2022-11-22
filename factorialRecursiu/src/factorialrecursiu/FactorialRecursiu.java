/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialrecursiu;

/**
 *
 * @author orma4705
 */
public class FactorialRecursiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 4;
        System.out.println(valor+"! = "+ factorial(valor));
    }
    public static int factorial(int n){
        int resultado;
        if (n==1){
            return 1;
        }
        else if (n==0){
            return 1;
        }
   //     if (n<=1){
    //        return 1;
     //   }
        else {
            System.out.println("crido a "+ n + "*factorial("+ (n-1) + ")");
            resultado = n* factorial(n-1);
            return resultado;
        }
     //return 0;
    }
}
