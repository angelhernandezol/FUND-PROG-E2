/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ejercicios_if_;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_4_EJERCICIOS_IF_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner capture = new Scanner(System.in); 
        
         String nombre; 
         double sal_men, bono, sal_fin;
         
         
        System.out.println("Ingrese nombre: ");
            nombre = capture.nextLine();

        System.out.println("Ingrese salario mensual: ");
            sal_men = capture.nextDouble();
           
            
    if (sal_men < 12000){
    
        bono = sal_men * 0.10; 
        
        sal_fin = sal_men + bono;
       
        
        System.out.println("Se le ha otorgado un bono del 10%");

        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + "$ " + sal_men);
        System.out.println("Bono: " + "$ " + bono);
        System.out.println("Salario final: " + "$ " + sal_fin);

    } else {
        
        bono = sal_men * 0.05; 
        
        sal_fin = sal_men + bono;
    
        
        System.out.println("Se le ha otorgado un bono del 5%");

        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + "$ " + sal_men);
        System.out.println("Bono: " + "$ " + bono);
        System.out.println("Salario final: " + "$ " + sal_fin);
    }
         

    }
    
}
