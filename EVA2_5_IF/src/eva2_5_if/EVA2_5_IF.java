/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_if;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_5_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ANIDAMIENTO
        
        int edad, credencial;
        Scanner capture = new Scanner(System.in); 
        
        System.out.println("Ingresa tu edad");
        edad = capture.nextInt();
        
        if(edad >= 18){
            
            System.out.println("Tienes credencial de lector: ");
            System.out.println("Si --> 1");
            System.out.println("No --> 0");
            
            credencial = capture.nextInt();
            
                if(credencial == 1){
                
                    System.out.println("Puedes entrar");
                
                }
                else{
                    System.out.println("No tienes permitido el acceso --> falta de credencial");
           
                }      
        }else {
        
            System.out.println("No tienes permitido el acceso");
        }
        
    }
    
}
