/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_15_BECA {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      int prom;
      double ingresos;
      
      System.out.println("<<<<DETERMINAR BECA>>>>"); 
      
      System.out.println("Ingresos familiares: ");  
      ingresos = capture.nextDouble();
      
      System.out.println("Promedio: ");
      prom = capture.nextInt();
      
      
      if(prom >= 80 && ingresos<10000){
           
         System.out.println("Beca concedida");
      
      }else{
         System.out.println("Beca denegada");
      
      }
   }
   
}
