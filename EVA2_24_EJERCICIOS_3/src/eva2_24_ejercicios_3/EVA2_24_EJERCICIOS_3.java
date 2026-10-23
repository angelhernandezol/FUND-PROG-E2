/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ejercicios_3;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_24_EJERCICIOS_3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      int num, res;
      
      System.out.println("Numero para su tabla de multiplicar: ");
          num = capture.nextInt();
          
      for(int i = 1; i <= 10; i++){
         
         res = num * i;
         System.out.println(num + " x " + i + " = " + res);
      
      }

   }
   
}
