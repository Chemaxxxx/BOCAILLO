package daw1t;

import java.util.Scanner;

public class NumeroPositivo {
	public static void main(String[] args) {
		Scanner NumeroPositivo = new Scanner (System.in);
		
		int numeroIntroducido = 0;
		boolean numeroPositivo =  numeroIntroducido > 0;
		System.out.println("Introduce un número (0 para acabar la secuencia)");
		
		while(numeroIntroducido == 0) {
			System.out.println("Introduce un número");
			numeroIntroducido = NumeroPositivo.nextInt();
			
			if(numeroIntroducido > 0)
				System.out.println("Introduce un numero: " + numeroIntroducido);
		}
		
		
		System.out.println("Hay" + numeroPositivo + "Positivos");
	}
		


	
	

}
