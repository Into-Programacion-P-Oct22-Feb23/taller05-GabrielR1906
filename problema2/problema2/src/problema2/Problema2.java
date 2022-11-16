/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String descripcion;
        int cantidad;
        double precio;
        double descuento;
        double preciototal;
        
        System.out.println("Ingrese la descripción del articulo:");
        descripcion = entrada.nextLine();
        
        System.out.println("Ingrese la cantidad de unidades requeridas:");
        cantidad = entrada.nextInt();
        
        System.out.println("Ingrese el precio unitario:");
        precio = entrada.nextDouble();
        
        preciototal = cantidad * precio;
        
        if (cantidad > 50){
            descuento = (preciototal * 15) / 100;
            preciototal = preciototal - descuento;
        }
        System.out.printf("El costo del pedido: $%.2f\n", preciototal);
    }
    
}
