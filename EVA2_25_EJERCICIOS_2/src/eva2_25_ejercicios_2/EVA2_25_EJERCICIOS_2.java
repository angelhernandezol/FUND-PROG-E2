/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_2;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_25_EJERCICIOS_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      int num;
      String s = "";
      
      System.out.println("Numero de filas: ");
       num  = capture.nextInt();
       
       for(int i = 1; i <= num; i++ ){
          
          System.out.println("*"  + s);
          s = s + "*";
          
       }
      
   }
   
}
