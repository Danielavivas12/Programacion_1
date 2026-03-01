package Clase3;

import java.util.Scanner;

public class Ejercicios31f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\Digite cantidad de horas estacionado:");
        int horas = sc.nextLong();
        
        // valores en pesos colombianos(cop)
        final double Valor_Hora_Parqueadero=2000.0;//2.000 cop por hora
        final double PORCENTAJE_IVA = 0.20;//20% de IVA

        double subtotal= horas*Valor_Hora_Parqueadero;
        double totalpago = subtotal+(subtotal*PORCENTAJE_IVA);

        system.out.println("subtotal(sin IVA,en cop):"+subtotal);
        System.out.println("total a pagar(con 20% IVA,en cop):"+totalpago);

        sc.close();


    }
    
}
