/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_califas;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_27_CALIFAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      int calif = 0, acum = 0, cant = 0; 
      double prom;
         
      while(calif > -1){
      System.out.println("Ingresar califiacion: ");
      System.out.println("(-1 para terminar)");
         calif = capture.nextInt();
         capture.nextLine();
         
         acum += calif;
         cant++;           
      }
      
      acum += 1;
      cant -= 1;
      
      prom = acum/(cant * 1.0);
      System.out.println("Promedio general: " + prom);
   }
   
}
