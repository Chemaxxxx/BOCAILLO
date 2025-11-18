package Tarea8b;

import java.util.Scanner;

public class CajaFuerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 2005;
        int intentos = 4;
        boolean pinCorrecto = false;
        int intento;
        System.out.print("Introduce el PIN: ");
        intento = sc.nextInt();


        while(!pinCorrecto && intentos > 0) {
           
            if(intento > 9999) {
                System.out.println("Caracteres excedidos introduce de nuevo");
            } else if(intento == pin) {
                pinCorrecto = true;
            } else {
                intentos--;
                if(intentos == 0) {
                    System.out.println("No te quedan intentos");
                } else {
                    System.out.println("PIN incorrecto te quedan " + intentos + " intentos");
                }
            }
            System.out.print("Introduce el pin de nuevo: ");
            intento = sc.nextInt();

        }

        if(pinCorrecto) {
            System.out.println("Bienvenido");
        }
    }
}

