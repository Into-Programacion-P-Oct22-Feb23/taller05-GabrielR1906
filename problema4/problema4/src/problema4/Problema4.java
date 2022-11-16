/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numerodias;
        double preciodiario;
        double subtotal;
        double descuento;
        double total;
        
        System.out.println("Ingrese el número de días de hospedaje:");
        numerodias = entrada.nextInt();
        
        System.out.println("Ingrese el precio diario de la habitación:");
        preciodiario = entrada.nextDouble();
        
        subtotal = numerodias * preciodiario;
        total = subtotal;
        descuento = 0.00;
        
        if (5 < numerodias && numerodias<= 10) {
            descuento = (subtotal * 10) / 100;
            total = subtotal - descuento;
        } else {
            if (10 < numerodias && numerodias <= 15) {
                descuento = (subtotal * 15) / 100;
                total = subtotal - descuento;
            } else {
                if (numerodias > 15) {
                    descuento = (subtotal * 20) / 100;
                    total = subtotal - descuento;
                }
            }
        }
        System.out.printf("\nEl subtotal por pagar es: %.2f\nEl descuento es: "
                + "%.2f\nEl total por pagar es: $%.2f\n", subtotal, descuento,
                total);
    }
    
}
