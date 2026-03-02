package Clase3;

import java.util.Scanner;

public class Ejercicio31d {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // calculo del salario neto
   double salarioBruto = 1750905.0;
    System.out.println("nsalariobruto(salario minimo 2026):"+ salarioBruto+"cop");

    System.out.print("Digite deduciones:");
    double deduciones = sc.nextDouble();

    System.out.print("Digite comision:");
    double comision = sc.nextDouble(); 

    double salarioneto = (salarioBruto-deduciones)+comision;
    System.out.println("salario neto:"+salaroneto+"cop");

    sc.close();
    
  }
    
}
