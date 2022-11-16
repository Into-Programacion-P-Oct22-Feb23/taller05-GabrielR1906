/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String marca;
        String origen;
        double costo;
        double impuesto;
        
        System.out.println("Ingrese la marca del vehículo:");
        marca = entrada.nextLine();
        System.out.println("Ingrese el origen del vehículo:");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del vehículo:");
        costo = entrada.nextDouble();
                
        if (origen.equals("Alemania")) {
            impuesto = (costo * 20) / 100;
            costo = costo + impuesto;
        } else {
          if (origen.equals("Japon")) {
              impuesto = (costo * 30) / 100;
              costo = costo + impuesto;
          } else {
              if (origen.equals("Italia")) {
                  impuesto = (costo * 15) / 100;
                  costo = costo + impuesto;
              } else {
                  if (origen.equals("USA")) {
                      impuesto = (costo * 8) / 100;
                      costo = costo + impuesto;
                  } else {
                      impuesto = 0.00;
                  }
              }
          }
        }
        
        System.out.printf("\nLa marca del vehículo es: %s\nEl origen del "
                + "vehículo es: %s\nEl impuesto del vehículo es: %.2f\n"
                + "El costo total del vehículo es: $%.2f\n", marca, origen,
                impuesto, costo);
    }
    
}
