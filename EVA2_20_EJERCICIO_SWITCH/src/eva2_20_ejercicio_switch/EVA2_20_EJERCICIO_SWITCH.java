/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_20_EJERCICIO_SWITCH {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //CALCULADORA:
      //PEDIR DOS VALORES ENTEROS 
      //PEDIR LA OPERACIÓN
      //1 
      //2 RESTA
      //3 MULTIPLICACION
      //4 DIVISION
      //REGRESAR EL RESULTADO
 
      Scanner capture = new Scanner(System.in);
      int operacion;
      double num1, num2, result;
      
      System.out.println("----CALCULADORA-----");
      System.out.println("<<Ingrese los numeros>>");
      
      System.out.print("Numero 1: ");
         num1 = capture.nextDouble();
      System.out.print("Numero 2: ");
         num2 = capture.nextDouble();
      System.out.println("");
       
      System.out.println("<<Ingrese la operacion a realizar>>");
      System.out.println("SUMA --> 1");
      System.out.println("RESTA --> 2");
      System.out.println("MULTIPLICACION --> 3");
      System.out.println("DIVISION --> 4");
      
      operacion = capture.nextInt();
      
      switch(operacion){
         
         case 1:
            result = num1 + num2; 
            System.out.println("Resultado de la suma es: " + result);
            break;
         case 2:
            result = num1 - num2; 
            System.out.println("Resultado de la resta es: " + result);
            break;
         case 3:
            result = num1 * num2; 
            System.out.println("Resultado de la multiplicacion es: " + result);
            break;
         case 4:
            result = num1 / num2; 
            System.out.println("Resultado de la division es: " + result);
            break;
            
         default:
            System.out.println("Numero ingresado no valido");
   }
      

   }
   
}
