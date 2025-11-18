package u3;

import java.util.Scanner;

public class CalculadoraConFunciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número (a): ");
        double a = sc.nextDouble();

        System.out.print("Introduce el segundo número (b): ");
        double b = sc.nextDouble();

        System.out.print("Elige operación (+, -, *, /): ");
        char op = sc.next().charAt(0);

        try {
            // Primero validamos el operador

            // Calculamos el resultado
            double resultado = Utilidadess.calcular(a, b, op);
            System.out.println("Resultado: " + resultado);

        } catch (OperacionInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (RestaNegativaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (DivPorCeroException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }

    }
}
