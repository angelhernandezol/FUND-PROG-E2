/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;
import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class EVA2_17_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      int edad;
      double peso,altura, imc;
      String enfermedad;
      
    
    System.out.println("<<<<PERSONA DE RIESGO>>>>"); 

      System.out.println("Edad: ");  
      edad = capture.nextInt();
      
      capture.nextLine();
      
      if (edad > 65){
      
         System.out.println("Se presenta riesgo!!!!"); 
      
      }else{
          
          System.out.println("Presenta enfermedades cronicas: ");
            System.out.println("- S (SI)");
            System.out.println("- N (NO)");
          enfermedad = capture.nextLine();
          
          if(enfermedad.equals("S")){
          
            System.out.println("Se presenta riesgo!!!!"); 

          }else{
          
          System.out.println("iNGRESE INFORMACION PARA MEDIR IMC ");
            System.out.print("Ingrese su peso (kg): ");
            peso = capture.nextDouble();
            
            System.out.print("Ingrese su altura (m): ");
            altura = capture.nextDouble();
            
                imc = peso / (Math.pow(altura, 2));
                System.out.println(imc);
                System.out.println("");

            
               if(imc >= 25){    
                System.out.println(" "); 
                System.out.println("Se presenta riesgo!!!!"); 

               }else{
                System.out.println(" "); 
                System.out.println("No se presenta riesgo"); 

               }
          
          }
      
          
      }
      


    }
    
}
