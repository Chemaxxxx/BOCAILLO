package ejercicios;

import java.util.Scanner;

public class Rango {
	
	public static void main(String[] args) {
		Scanner Rango = new Scanner(System.in);
		
		short numeroMaximo;
		numeroMaximo = 32767;
				System.out.println("El numero maximo del tipo short es " + numeroMaximo);
				
				short SumaNumero;
				SumaNumero = (short) (numeroMaximo +1);
				System.out.println("Si sumamos 1 al numero maximo del tipo short pasa  que el resultado es: " + SumaNumero);
				System.out.println("El tipo short se comporta de una forma ciclica es decir si sumamos una unidad a su maximo, vuelve al numero minimo del rango");
		
		
	}

}


