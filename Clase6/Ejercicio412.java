
public class Ejercicio412 {
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
        if (seleccion == 1) {
            System.out.println("la suma es: " + (num1 + num2));
        } else {
            if (seleccion == 2) {
                System.out.println("la multiplicación es: " + (num1 * num2));
            } else {
                if (seleccion == 3) {
                    System.out.println("la división es: " + (num1 / num2));
                } else {
                    System.out.println("opción no valia");
                }
            } // else
        }
        sc.close();
    }
}
