/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costokilovatio;
        double numerokilovatios;
        int edad;
        double descuento;
        double costo;
        
        System.out.println("Ingresar el valor de costo por kilovatio/hora:");
        costokilovatio = entrada.nextDouble();
        
        System.out.println("Ingrese el número de kilovatios consumidos en el "
                + "mes:");
        numerokilovatios = entrada.nextDouble();
        
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        
        costo = costokilovatio * numerokilovatios;
        
        if (edad >= 65){
            descuento = (costo * 10 ) / 100;
            costo = costo - descuento;
        }
        System.out.printf("El total a pagar es: %.2f\n", costo);
    }
    
}
