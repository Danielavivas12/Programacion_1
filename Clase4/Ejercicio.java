package Clase4;

import java.util.Scanner;
public class Ejercicio4.8
public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digitar el primer numero:");
    int num1 = sc Scanner.nextInt();
    System.out.print("Digite el segundo numero:");
    int num2 = Scanner.nextInt();

    if(num2!=0 && num1% num2 ==0){
        System.out.println(num2+"es divisor de"+num1);
    }else if(num1 !=0 && num2% num1 == 0){
        System.out.println(num1+"es divisorde"+num2);

    }else{
        System.out.println("ninguno de los numeros es divisor del otro");
    }

    sc.close();
}

}


