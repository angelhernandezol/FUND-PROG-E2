/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;
import java.util.Scanner;
/**
 *
 * @author bisonte
 */
public class EVA2_24_FACTORIAL {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      int num, factor = 1;
      
      System.out.println("Numero para calcular factorial: ");
      num = capture.nextInt();
      
      //PARA 5 x 4 x 2 x 3 x 2 x 1 = 120
      for(int i = num; i >= 1; i--){
         System.out.println(i);
         
         factor *= i; 
      }
      
      System.out.println("El factorial de "+ num + " = " + factor);
      
      factor = 1;
      
       //PARA 1 x 2 x 3 x 4 x 5 = 120
      for(int i = 1; i <= num; i++){
             factor *= i; 
         
      }
      System.out.println("El factorial de "+ num + " = " + factor);

   }
   
}
