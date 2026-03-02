package Clase3

import java.util.Scanner;
Public class Ejercicio31b{
    Public static void main(String[] arg);{
      Scanner sc = new Scanner(System.in);
      //leer el radio
      System.out.print("Digite el radio del circulo:");
  double radio = sc.nextDouble();
  final double PI=3.1416;
  double area=PI*radio*radio;
  System.out.printf("El area del circulo es:%2f%n",area);
  sc.close();
 }

     
}