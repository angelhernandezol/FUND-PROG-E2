/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_califas;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_2_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int calif;
        Scanner capture = new Scanner(System.in);        
        
        System.out.println("Ingrese calificacion: ");
        calif = capture.nextInt();  
        
        
        if (calif >= 70) {         
            
            System.out.println("Felicidades, has acreditado!!");

        } else {          
        
            System.out.println("No has acreditado");
        
         }  
        
    }
    
}
