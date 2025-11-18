package ejercicios;
import java.util.Scanner;

public class EcuacionPrimerGrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ecuación primer grado");
        
        double a;
        double b;

        System.out.print("Por favor, introduzca el valor de a: ");
         a = sc.nextDouble();

        System.out.print("Ahora introduzca el valor de b: ");
         b = sc.nextDouble();

        
        String resultado = (a == 0) ?  " ecuación sin solución real." : 
        								"x = " + (-b / a);

        System.out.println(resultado);

       
    }
}

