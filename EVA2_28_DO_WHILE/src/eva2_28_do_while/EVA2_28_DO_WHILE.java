/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_do_while;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_28_DO_WHILE {
     static final String USUARIO = "admin";
     static final String PWD = "admin";
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      String usuario, pwd; 
      int acum = 0;
      
        do{
           System.out.println("Usuario: ");
           usuario = capture.nextLine();
           
           System.out.println("Contraseña: ");
           pwd = capture.nextLine();
           
          
        } 
        while(!(usuario.equals(USUARIO)) || !(pwd.equals(PWD)));
        
        System.out.println("<<<<<ACCESO CONCEDIDO>>>>>");
   }
   
}
