package UD1;
import java.util.Scanner;
public class Ej1 {
	public static void main(String[] args) {
		Scanner Ej1 = new Scanner (System.in);
		int numero ;
		final int MAX = 100;
		float suma= 0;
		int cantidad = 0;
		
		System.out.print("Introduce un numero par:");
		numero = Ej1.nextInt();
		
		while(suma <= MAX) { 
			
			if(numero %2 != 0) { //mientras que el numero no sea par se pide numero hasta que se introduzca uno valido
				System.out.println("Debes introducir un numero par!: ");
					numero = Ej1.nextInt();
			}else { //en caso de que sea par se van sumando y contando cuantos se introducen
				suma += numero;
				cantidad ++;
				if(suma<= MAX) {
					System.out.print("Introduce  otro numero par:");
					numero = Ej1.nextInt();
			}
			
			
			}
			
		}
		
		if (suma> MAX) { //se calcula la suma y la media de los numeros pares introducidos 
			System.out.println("La suma de los numeros pares es: " + suma);
			float media = suma/cantidad;
			System.out.println("La media de los numeros introducidos es: " + media );
			
		}
		
		
	}

}
