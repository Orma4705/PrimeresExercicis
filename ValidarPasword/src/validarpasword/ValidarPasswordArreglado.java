/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validarpasword;
import java.util.Scanner;
/**
 *
 * @author orma4705
 */
public class ValidarPasswordArreglado {
    public static void main(String[] args) {
        String usuario,password;
        usuario = ponString("Pon tu mail");
        password = ponString("Pon tu password");
        boolean valido = Validaciones(usuario, password);
        if (valido=true){
            System.out.println("Usuario y password correctos");
        }  
    }
    private static String ponString(String palabra) {
        Scanner sc = new Scanner(System.in);
        String frase;
        frase = sc.nextLine();
        return frase;
    }
    private static boolean Validaciones(String usuario,String password){
        boolean valido=true;
        if (!usuario.contains("@")){
            System.out.println("No contiene la @");
            valido =false;
        }
         if (usuario.contains(" ")){
            System.out.println("Usuario contiene espacios");
            valido =false;
        }
          if (password.contains(" ")){
            System.out.println("Password contiene espacios");
            valido =false;
        }
           if (!usuario.endsWith("@proven.cat")){
            System.out.println("Dominio mail imcorrecto");
            valido =false;
        }
            if (password.length()<8){
            System.out.println("Contrasenya tiene que ser mayor de 8 caracters");
            valido =false;
        }
        return valido;
    }
}