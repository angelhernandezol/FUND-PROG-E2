/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_10_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capture = new Scanner(System.in);
        double prom; 
        
        System.out.println("Ingrese el promedio: ");
        
        prom = capture.nextDouble();
        
        if(prom > 100){
            System.out.println("Dato invalido");
            
        }else if(prom < 0){
            System.out.println("Dato invalido");
            
        }else if(prom < 70){
            System.out.println("Insuficiente");
            
        } else if(prom < 80){
            System.out.println("Aceptable");
            
        }else if(prom < 90){
            System.out.println("Bueno");
            
        }else if(prom >= 90){
            System.out.println("Sobresaliente");
            
        }

    }
    
}
