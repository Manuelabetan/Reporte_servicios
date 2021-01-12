package reporte_servicios;

import java.util.Scanner;


public class Reporte_servicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
   
        Scanner input = new Scanner(System.in);
        
        System.out.print("Escribe tu identificación (tecnico): ");
        String text = input.nextLine();
      
       
        System.out.print("Escribe la identificación del servicio: ");
        String texto = input.nextLine();
        
        System.out.print("Escribe la hora inicio del servicio: ");
        String textoo = input.nextLine();
        
        System.out.print("Escribe la hora fin del servicio: ");
        String textt = input.nextLine();  
    }
}
