package daw1t;

import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numeroSecreto = 7; 
        int intento;
        boolean acertado = false;

        System.out.println("Adivina el número (entre 1 y 10). Tienes 5 intentos.");

        int i = 0;
        while (i < 5 && !acertado) {
            System.out.print("Introduce un número: ");
            intento = teclado.nextInt();

            if (intento == numeroSecreto) {
                System.out.println("¡Correcto! Has adivinado el número.");
                acertado = true;
            } else {
                System.out.println("Incorrecto.");
            }

            i++;
        }

        if (!acertado) {
            System.out.println("Has agotado los intentos. El número era: " + numeroSecreto);
        }

    }
}