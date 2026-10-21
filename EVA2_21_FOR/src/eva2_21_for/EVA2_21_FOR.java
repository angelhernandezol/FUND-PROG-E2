/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_for;

/**
 *
 * @author bisonte
 */
public class EVA2_21_FOR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //acceso por indices --> i
      //IMPRIMIR UN LISTADO DEL 1 AL 10
      //3 parámetros:
         //punto de partida
         //condición para detenerse 
         //avance 
      for(int i = 1; i <= 10; i++){
         //Instruccion a repetir 
         System.out.print(i + " - ");
      }
      
      System.out.println();
      
      for(int i = 20; i <= 38; i += 2){
      
         System.out.print(i + " - ");      
      }
      
      System.out.println();
      
      for(int i = 0; i < 10; i++){
      
         System.out.print(i + " - ");      
      }
      
      //del 10 al 1
      //pares entre 0 y 20
      
      System.out.println();
      System.out.println("Numeros del 10 a 1");
      
      for(int i = 10; i >= 1; i--){
      
        System.out.print(i + " - ");     
      }

      System.out.println();
      System.out.println("Pares entre 0 y 20");
      
      for(int i = 0; i <= 20; i+=2){
      
        System.out.print(i + " - ");     
      }
              
   }
   
}
