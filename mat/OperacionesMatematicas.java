package mat;
public class OperacionesMatematicas {
    //Atributos
    private int a;
    private int b;
 
    //Constructor de la clase
    public OperacionesMatematicas (int a, int b){
        this.a = a;
        this.b = b;
    }
 
    //Metodo de sumar
    public int sumar(int a, int b){
        return a + b;
    }
   
    //Metodo de restar
    public int restar(int a, int b){
        return a - b;
    }
 
    //Metodo de multiplicar
    public int multiplicar(int a, int b){
        return a * b;
    }
 
    //Metodo de dividir
    public double dividir(int a, int b){
        double total;
        if(b == 0){
            total = 0.0;
        }else{
            total = a / b;
        }
        return total;
    }
 
    //Metodo de potencia
    public int potencia (int a, int b){
        int p = 1;
        for (int i = 1; i <= b; i++) {
            p = p * a;
        }
        return p;
    }
   
}