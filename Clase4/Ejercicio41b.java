package Clase4;

import java.util.Scanner; 
public class Ejercicio41b {
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        // si la temperatura esta por encima de 100 sube punto de ebullicion
        System.out.printIn("Digite la temperatura...");
        int temp = sc.nextInt();
        if (temp == 100){
            System.out.printInt( "punto ebullicionº");
        }else{
            System.out.println( "No esta en punto de ebullicionº");
        }
        sc.close();    
    }
    
    
}
