/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_menu;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_8_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capture = new Scanner(System.in);  
        int opcion;  
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> MENU TORTAS MR.MEMORANDUM <<<<<<<<<<<<<<<<<<<<<");
            System.out.println("1. Ventas");
            System.out.println("2. Proveedores");
            System.out.println("3. Empleados");
            System.out.println("4. Inventario");
            System.out.println("5. Salir");
            
        opcion = capture.nextInt();
        
        if (opcion == 1){
            System.out.println("PANTALLA VENTAS");
        
        }else if(opcion == 2){
            System.out.println("PANTALLA PROVEEDORES");
            
        }else if(opcion == 3){
            System.out.println("PANTALLA EMPLEADOS");
            
        }else if(opcion == 4){
            System.out.println("PANTALLA INVENTARIO");
            
        }else if(opcion == 5){
            System.out.println("SALIR");
            
        } else {
            System.out.println("OPCION NO VALIDA");
        
        }

    }
    
}
