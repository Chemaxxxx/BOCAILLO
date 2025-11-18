package u3;
import java.util.Scanner;

public class Ej_3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuántos números deseas introducir?: ");
        int numero = sc.nextInt();

        int[] numeros = new int[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Los números introducidos son:");
        for (int j = numeros[0]; j < numeros.length - 1; j++) {
            System.out.println(numeros[j]);
        }

     
    }
}
