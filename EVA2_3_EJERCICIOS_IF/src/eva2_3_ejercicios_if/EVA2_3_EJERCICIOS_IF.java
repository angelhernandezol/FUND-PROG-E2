/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_ejercicios_if;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_3_EJERCICIOS_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner capture = new Scanner(System.in);        
        
        double precio, subtotal, destotal, total; 
        int cantidad;
        
    
        System.out.println("Ingrese precio del produto: ");
            precio = capture.nextDouble();
            
        System.out.println("Ingrese cantidad del produto: ");
            cantidad = capture.nextInt();  
        
        
        subtotal = precio * cantidad;
        
        if (subtotal >= 1000){
               
            destotal = subtotal * 0.10;
            total = subtotal - destotal;
            
         System.out.println("Descuento: " + destotal + " pesos");
         System.out.println("Subtotal: " + subtotal + " pesos");         
         System.out.println("Total: " + total + " pesos");
        
        }
        else{
            
        System.out.println("No aplica descuento");
        System.out.println("Subtotal: " + subtotal + " pesos");         
        System.out.println("Total: " + subtotal + " pesos");    
        
        }
    }
    
}
