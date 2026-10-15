/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas2;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_14_EXPRESIONES_BOOLEANAS2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //BECA
      //promedio -> 95
      //ESTA EN EQUIPO REPRESENTATIVO 
      Scanner capture = new Scanner(System.in);
      int prom;
      String equipo;
      
      System.out.println("<<<<DETERMINAR BECA>>>>"); 
      
      System.out.println("Se encuentra en equipo representativo: ");
      System.out.println("- S (SI)");
      System.out.println("- N (NO)");   
      equipo = capture.nextLine();
      
      System.out.println("Promedio: ");
      prom = capture.nextInt();
      
      
      if(prom >= 95 || equipo.equals("S")){
           
         System.out.println("Beca concedida");
      
      }else{
         System.out.println("Beca denegada");
      
      }
      



   }
   
}
