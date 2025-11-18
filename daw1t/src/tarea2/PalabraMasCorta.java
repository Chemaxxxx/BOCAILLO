package tarea2;
import java.util.Scanner;

public class PalabraMasCorta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera palabra: ");
        String palabra1 = sc.nextLine();

        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = sc.nextLine();

        if (palabra1.length() < palabra2.length()) {
            System.out.println("La palabra más corta es: " + palabra1);
        } else if (palabra2.length() < palabra1.length()) {
            System.out.println("La palabra más corta es: " + palabra2);
        } else {
            System.out.println("Ambas palabras tienen la misma longitud.");
        }

    }
}
