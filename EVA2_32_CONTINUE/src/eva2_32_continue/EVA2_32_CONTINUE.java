/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_continue;

/**
 *
 * @author bisonte
 */
public class EVA2_32_CONTINUE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      //CONTINUE --> INTERRUMPE LA ITERACIÓN ACTUAL
      //BREAK --> INTERRUMPLE TODO EL CICLO
      
      for(int i = 0; i <= 20; i++){
         
         int residuo = i % 2; 
         
         if(residuo == 0){ //numero par
            System.out.print(i + " - ");
            continue; //Interrumpe la iteración actual
         }
         
         //System.out.println("SI EL NUMERO ES PAR, NO SE IMPRIME");
      }
   }
   
}
