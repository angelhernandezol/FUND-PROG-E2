/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_4;
import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class EVA2_25_EJERCICIOS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      int num, exp, resultado = 1;
      
      System.out.println("Ingrese la base: ");
        num = capture.nextInt();
      
        
      System.out.println("Ingrese el exponente: ");
        exp = capture.nextInt();
        
        for(int i = 1; i <= exp; i++){
            
            resultado *= num;             
        }
        System.out.println("La base "+ num + " con exponente "+ exp + " da como resultado = " + resultado);
    }
    
}
