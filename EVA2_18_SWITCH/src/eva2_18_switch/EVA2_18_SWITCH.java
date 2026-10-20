/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_switch;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_18_SWITCH {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      
      System.out.println("Introduce el numero del dia (1 - 7)");
      
      int dia = capture.nextInt();
      
      switch(dia){
      
         case 1:
            System.out.println("Domingo");
            //Las intrucciones que necesitemos antes del break
            break; //Termina el caso del switch 
         case 2:
            System.out.println("Lunes");
            break;
         case 3:
            System.out.println("Martes");
            break;
         case 4:
            System.out.println("Miercoles");
            break;
         case 5:
            System.out.println("Jueves");
            break;
         case 6:
            System.out.println("Viernes");
            break;
         case 7:
            System.out.println("Sabado");
            break;
      
         default: //Opcional: que se hace cuando no es ninguna de las opciones anteriores 
            System.out.println("No es un dia valido");
      }

   }
   
}
