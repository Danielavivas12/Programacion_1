package mat;

public class Calculadora {

    public static void main(String[] args) {

        int a = 3;
        int b = 8;

        OperacionesMatematicas objCalc1 = new OperacionesMatematicas(a, b);

        System.out.println("suma: " + objCalc1.sumar(a, b));
        System.out.println("resta: " + objCalc1.restar(a, b));
        System.out.println("multiplición: " + objCalc1.multiplicar(a, b));
        System.out.println("división: " + objCalc1.dividir(a, b));
        System.out.println("potencia: " + objCalc1.potencia(a, b));
    }

}
