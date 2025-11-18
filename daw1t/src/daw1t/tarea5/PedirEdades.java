package daw1t.tarea5;
import java.util.Scanner;

public class PedirEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;

        int menores = 0;
        int mayores = 0;

        System.out.println("Vamos a introducir edades. Para terminar, escribe 0.");

        System.out.print("Introduce una edad: ");
        edad = scanner.nextInt();

        while (edad != 0) {
        	
        	  System.out.print("Introduce otra edad: ");
              edad = scanner.nextInt();
              
            if (edad < 18) {
                menores++;
            } else {
                mayores++;
            }

          
        }

        System.out.println("Fin del programa.");
        System.out.println("Cantidad de menores de edad: " + menores);
        System.out.println("Cantidad de mayores de edad: " + mayores);

        scanner.close();
    }
}
