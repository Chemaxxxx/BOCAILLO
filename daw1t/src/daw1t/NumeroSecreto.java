package daw1t;

import java.util.Scanner;

public class NumeroSecreto {
	public static void main(String[] args) {
		System.out.println("Adivina el numero secreto");
		Scanner NumeroSecreto = new Scanner (System.in);
		
		int numero = 8;
		int intento;
		boolean correcto = false;
		
		int i = 0;
		while(!correcto) {
			System.out.println("Introduce un numero");
			intento = NumeroSecreto.nextInt();
			
			if (intento == numero) {
				System.out.println("Acertaste!");
				correcto = true;
				
			} else {
				System.out.println("Incorrecto");
			}
				
			i++;
			
			if(correcto)
				System.out.println("Has acertado en " + i + " intentos");
				
		
	}

}
}
