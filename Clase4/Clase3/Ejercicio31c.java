package Clase3;

import java.util.Scanner;
public class Ejercicio31c {
public static void main(String[] arg);
Scanner sc = new Scanner(System.in);
System.out.print("Digite la temperatura en Fahrenheit");
double fahrenheit = sc.nextDouble();
double celsius = (fahrenheit-32)*5/9;
System.out.println(fahrenheit+"°f="+celsius+"°c");

System.out.print("Digite la temperatura de celsius:");
celsius= sc.nextDouble();
fahrenheit = (celsius*9/5)+32;
System.out.println(celsius+"°c="+fahrenheit+"°f");

sc.close();

}

}

