/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_do_while_adivinar;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_31_DO_WHILE_ADIVINAR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      int num, numc = 76;
      
      do{
         System.out.println("<<<< Adivina un numero entre el 1 y el 100 >>>>");
         System.out.println("Ingresa el numero:");
         num = capture.nextInt();
         
         System.out.println();
      
      }
      while(num != numc);
      
      System.out.println("---- ADININASTE ----");
      
   }
   
}
