/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_1;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_25_EJERCICIOS_1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      int num1, num2;
      
      System.out.println("Numero inicial: ");
       num1  = capture.nextInt();
       
      System.out.println("Numero final: ");
       num2  = capture.nextInt();
       
       for(int i = num1; i <= num2; i++){
       
        System.out.print(i + " - ");

       }
   }
   
}
