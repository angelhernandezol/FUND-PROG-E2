/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_capturar;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_23_CAPTURAR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //SOLICITAR LAS CALIFICACIONES Y PROMEDIAR
      Scanner capture = new Scanner(System.in);
      int cant, calif = 0;
      double promedio;
      
      System.out.println("Cuantas calificaciones quieres capturar: ");
      cant = capture.nextInt();
      capture.nextLine();
      
      
      for(int i = 0; i < cant; i++){
         
         System.out.println("Capturar calificación: ");
         calif = calif + capture.nextInt(); //Acumulador
         capture.nextLine();

      }
      System.out.println("Acumulado: " + calif);
     
      promedio = calif / (cant + 1.0);
      
      System.out.println("Promedio = " + promedio);
   }
   
}
