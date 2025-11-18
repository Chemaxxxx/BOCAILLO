package u3;

public class Recursiva {

    public static void numeros(int numero) {
        if (numero == 0) {
            return; 
        }

        System.out.println(numero); 
        numeros(numero - 1); 
    }

    public static void main(String[] args) {
        numeros(10); 
    }
}
