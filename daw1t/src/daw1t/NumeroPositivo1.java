package daw1t;

import java.util.Scanner;

public class NumeroPositivo1 {
public static void main(String[] args) {
	System.out.println("Programa numeros enteros");
	
	Scanner NumeroPositivo1 = new Scanner (System.in);
	
	int numeroIntroducido = 0;
	int suma = 0;
	
	System.out.println("Introduce un numero (negativo para acabar la suma)");
	
	while (numeroIntroducido >= 0) {
		System.out.println("Introduce un numero");
		numeroIntroducido = NumeroPositivo1.nextInt();
		
		if (numeroIntroducido >= 0)
			suma += numeroIntroducido;
	}
	
	System.out.println("La suma de los numeros no negativos es: " + suma);
	
}
}
