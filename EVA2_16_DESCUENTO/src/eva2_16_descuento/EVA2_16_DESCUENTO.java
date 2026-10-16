/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_16_DESCUENTO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      int edad;
      String respuesta, respuesta2, credencial;
      
      
      System.out.println("<<<<DESCUENTO DE AUTOBUS>>>>"); 
      
      System.out.println("Edad: ");  
      edad = capture.nextInt();
      
      capture.nextLine();
      
      System.out.println("Eres estudiante:");
      System.out.println("- S (SI)");
      System.out.println("- N (NO)");
      respuesta = capture.nextLine();
               
      if(edad > 60 || (respuesta.equals("S") && edad >= 18)){
         

        System.out.println("Tienes Credencial:");
          System.out.println("- S (SI)");
          System.out.println("- N (NO)");
          credencial = capture.nextLine();
                          
          
         if(credencial.equals("S")){
             
            System.out.println("Su crecendial estudiantil/INSEN tiene vigencia:");
            System.out.println("- S (SI)");
            System.out.println("- N (NO)");
            respuesta2 = capture.nextLine();
 
            
            if(respuesta2.equals("S")){
             
            System.out.println("DESCUENTO ACEPTADO");
          
            }else{
            System.out.println("DESCUENTO DENEGADO");            
            }
            
         }else{
            System.out.println("DESCUENTO DENEGADO");
         }
          
      
      }else if(edad < 18){
            System.out.println("DESCUENTO ACEPTADO");
            
         }else{
         System.out.println("DESCUENTO DENEGADO");
      
      }
      

      
      
      
      

   }
   
}
