/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando objetos Scanner
        Scanner input = new Scanner(System.in);
        
        //Mostrando mensaje al usuario
        System.out.print("INGRESE LA DISTANCIA A RECORRER :  ");
        double distancia = input.nextDouble();
        
        System.out.print("INGRESE MILLA POR GALON:  ");
        double millasporgalon=input.nextDouble();
        
        System.out.print("INGRESE PRECIO POR GALON");
        double precioporgalon = input.nextDouble();
        
        //Calcular el costo de viaje en auto
        double costoviaje = (distancia / millasporgalon)* precioporgalon;
        
        //Mostrando resultado
        System.out.println("EL COSTO DE VIAJE EN AUTO ES: $"+costoviaje);
    }
}
