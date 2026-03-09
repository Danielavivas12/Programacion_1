import java.util.Scanner;

public class Ejercicio412b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        int seleccion;
        System.out.println("Digite numero1");
        num1 = sc.nextDouble();
        System.out.println("Digite numero2");
        num2 = sc.nextDouble();
        System.out.println("Digite la solucion 1,2 o 3");
        seleccion = sc.nextInt();

        switch (seleccion) {

            case 1:
                System.out.println("La suma es"+(num1+num2));

                  break;
                case 2:
                    System.out.println("La multiplicacion es"+(num1*num2));
                break;
                case 3:
                    System.out.println("La division es "+(num1/num2));
                break;
                default:
                    System.out.println("Opcion no valida");
                break;
        }
                 sc.close();

                 }
                        
           }
        
              
        
            
                
        
    

