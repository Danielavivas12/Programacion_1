package Clase3;

import java.util.Scanner;

public class Ejercicio31e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double Tasa_Peso_Dolar = 3766.30;
        final double Tasa_Peso_Euro = 4442.80;
        System.out.print("Digite cantidad en pesos:");

        double pesos = sc.nextDouble();
        double dólares = pesos/ Tasa_Peso_Dolar;
        double euros = pesos/ Tasa_Peso_Euro;
    System.out.println("Equivalente en dolares:"+ dolares);
    System.out.println("Equivalente en euros:"+ euros);
    
    sc.close();
    }
}
