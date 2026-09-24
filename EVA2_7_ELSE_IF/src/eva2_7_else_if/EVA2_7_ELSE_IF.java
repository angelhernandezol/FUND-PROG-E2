/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_else_if;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_7_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capture = new Scanner(System.in);  
        int temp;
        //TEMPERATURA
        //35 MUY CALIDO
        //20 AGRADABLE
        //10 FRESCO
        //MUY FRIO -
        
        System.out.println("Ingrese la temperatura: ");
        temp = capture.nextInt();
        
        if(temp >= 35){
            System.out.println("Temperatura muy calida");
        
        }else if(temp >= 20){
            System.out.println("Temperatura agradable");
            
        }else if(temp >= 10){
            System.out.println("Temperatura fresca");
            
        }else{
            System.out.println("Temperatura muy fria");
            
        }
        
        
    }
    
}
