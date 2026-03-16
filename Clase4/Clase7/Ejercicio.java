package Clase4.Clase7;

import java.util.Scanner;

public class Ejercicio Tabla {

 public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite numero tabla");
    int n = sc.nextInt();
    for (int i = 1; i <= 10; i++) {

        System.out.println(n + "x" + i + "=" + (n * i));
    }
    sc.close();
    }
    
}
