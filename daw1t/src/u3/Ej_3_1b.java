package u3;
import java.util.Scanner;

public class Ej_3_1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombre = new String[5];

        for (int i = 0; i < nombre.length; i++) {
            System.out.print("Introduce un nombre: ");
            nombre[i] = sc.next();
        }

        System.out.println("\nLos nombres  introducidos son:");
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i]);
        }

    }
}
