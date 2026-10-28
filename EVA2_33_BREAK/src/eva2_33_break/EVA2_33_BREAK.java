/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_break;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_33_BREAK {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      int valor = 10, num;
      
      
      while(true){ //ciclo infinito 
         System.out.println("Introduce el valor: "); 
         num = capture.nextInt();
         capture.nextLine();
         
         if(num == valor){
            System.out.println("ADIVINASTE, EL VALOR ES 10, GANASTE");
            break; //termina el ciclo 
         }
      }
      
   }
   
}
