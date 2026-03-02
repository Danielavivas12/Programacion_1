package Clase4;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        // Definición de constantes y variables
        final int CLAVE = 1234;
        final int SALDOINICIAL = 800000;
        int claveUsuario;
        int retiro;
        int nuevoSaldo;
        
        Scanner entrada = new Scanner(System.in);
        
        // Leer clave ingresada por el usuario
        System.out.print("Ingrese la clave: ");
        claveUsuario = entrada.nextInt();
        
        // Validación de clave
        if (CLAVE == claveUsuario) {
            System.out.println("Bienvenido al cajero de la Uniajc");
            System.out.print("Digite la cantidad a retirar: ");
            retiro = entrada.nextInt();
            
            // Aplicar costo de transacción si es necesario
            if (retiro > 200000) {
                retiro = retiro + 2000;
            }
            
            // Validación de saldo y cálculo
            if (retiro <= SALDOINICIAL) {
                nuevoSaldo = SALDOINICIAL - retiro;
                System.out.println("Su saldo actual es: " + nuevoSaldo + ", Muchas Gracias!!!");
            } else {
                // Mensaje diferenciado según si hubo costo de transacción
                if (retiro > 200000) {
                    System.out.println("El valor solicitado más el costo de la transacción es mayor al saldo");
                } else {
                    System.out.println("El valor solicitado es mayor al saldo actual....");
                }
            }
        } else {
            System.out.println("Su clave no es correcta...intenta nuevamente....");
        }
        
        entrada.close();
    }
}
    

