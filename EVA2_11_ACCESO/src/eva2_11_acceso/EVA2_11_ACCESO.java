/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_acceso;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_11_ACCESO {
    final static String USUARIO = "admin";
    final static String PWD = "admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capture = new Scanner(System.in);
        String usuario, pwd;
        
        System.out.println("Usuario: ");
            usuario = capture.nextLine();
            
        System.out.println("Contraseña: ");
            pwd = capture.nextLine();
            
        if(usuario.equals(USUARIO) && pwd.equals(PWD)){
          
            System.out.println("Acceso concedido");

        }else{
            System.out.println("Acceso denegado");
        }
            
    

         
    }
    
}
