package Clase4;

import java.util.Scanner;
public class Ejercicio41c {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 'Numeros','total positivos','total negativos'
    System.out.println("Digite los numeros...");
    int num = sc.nextInt();
    if (num>0){
        System.out.println("total positivos");
    }else{
        System.out.println("numros negativos");
    }
    sc.close();
        
    }


    
}
