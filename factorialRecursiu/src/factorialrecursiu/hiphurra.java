package factorialrecursiu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orma4705
 */
public class hiphurra {
    public static void main(String[] args) throws InterruptedException {
        int num = 4;
        salut(num);
        System.out.println("");
    }
    public static void salut(int n){
        if (n==0){
            System.out.println("Hurra!!");
        }
        else{
            System.out.println("Hip");
            salut(n-1);
        }
    }
    
}
