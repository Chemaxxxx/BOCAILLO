package ejercicios;

import java.util.Scanner;

public class CalculaMillas {
	public static void main(String[] args) {
		System.out.println("Pasamos de millas a kilometros"); //Indicamos que vamos a realizar la conversion
		Scanner CalculaMillas = new Scanner(System.in);
		
		System.out.println("Introduce un numero para las millas: " );
		float millas;
		millas = CalculaMillas.nextFloat();
		
		float kilometros;
		kilometros = millas * 1609;
		System.out.println("Para pasar " + millas + " millas a kilometros realizamos la operacion: " + millas + " * " + 1609);
				System.out.println(millas + " millas son: " + kilometros + " kilometros");
	}

}
