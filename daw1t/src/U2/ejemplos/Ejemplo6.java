package U2.ejemplos;

public class Ejemplo6 {
    public static void main(String[] args) {
        
        int numerador = 1;
        int denominador = 0;
        
        try {
            divide (numerador, denominador);
        } catch (ArithmeticException e) {
            System.out.println("Divide por cero");
        }
    }

    static void divide(int a, int b) throws ArithmeticException {
        int c = a / b;
        System.out.println("a/b = " + c);
    }
}

