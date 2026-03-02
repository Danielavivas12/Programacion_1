package Clase4.2

import java.util.Scanner;
public class Ejercicio42{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digitar el primer numero:");
        double num1 = sc.nextDouble();

        System.out.print("Digitar el segundo numero");
        double num2 = sc.nextDouble();

        if(num1>num2){
            System.out.println("El primer numero es el mayor");
        }else if(num1<num2){
            System.out.println("El primer numero es el mas pequeño");
        }else{
            System.out.println("ambos numeros son iguales");
        }
        sc.close();
    }


    
}
