/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_9_ESTACIONAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capture = new Scanner(System.in);
        int horas;  
        double costo;
        
        System.out.println("Ingrese el numero de horas: ");
        
        horas = capture.nextInt();
        
        if(horas <= 2){
            costo = horas * 25;
            System.out.println("El costo por " + horas + " hrs es de: $" + costo);

        }else if(horas <=5){
            costo = horas * 20;
            System.out.println("El costo por " + horas + " hrs es de: $" + costo);
        
        }else if(horas<=10){
            costo = horas * 15;
            System.out.println("El costo por " + horas + " hrs es de: $" + costo);
        
        }else if(horas>10){          
            System.out.println("El costo por " + horas + " hrs es de: $150");
        }
        
    }
    
}
