package Clase3;

import java.util.Scanner;
public class Ejercicio31c {

}
public static void main(String[] aStrings){
Scanner sc = new Scanner(System.in);
System.out.print("Digite la temperatura en celsius");
double celsius = sc.nextDouble();
double fahrenheit = (celsius*9/5)+32;
System.out.println(celsius+"°c="+fahrenheit+"°f");

System.out.print("Digite la temperatura faherenheit:");
fahrenheit = sc.nextDouble();
celsius = (fahrenheit-32)*5/9;
System.out.println(fahrenheit+"°f="+celsius+"°c");

} 
sc.clese();

}


