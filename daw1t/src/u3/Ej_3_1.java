package u3;
import java.util.Scanner;

public class Ej_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número decimal: ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("\nLos números introducidos son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
