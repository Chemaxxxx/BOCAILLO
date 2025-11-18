package daw1t.tarea5;
import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
		System.out.println("Calculo par o impar ");
		Scanner ParImpar = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num;
		num = ParImpar.nextInt();
		System.out.println("Numero introducido: " + num);
		
		if (num % 2 == 0) {
			System.out.println("Tu numero es par!");
		} else
			   System.out.println("Tu numero es impar!");
	}

}
