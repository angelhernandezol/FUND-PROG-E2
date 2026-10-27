/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_do_while;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_29_DO_WHILE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      int monto, cuenta = 5000;
      
      do{ //Almenos una vez la ejecucion 
         System.out.println("Dinero a retirar:");
         monto = capture.nextInt();
         
         cuenta -= monto;
         
         System.out.println("Tu saldo es = " + cuenta);
         System.out.println();
      }
      while(cuenta > 0);
         
         System.out.println("Sin saldo disponible");
   }
   
}
