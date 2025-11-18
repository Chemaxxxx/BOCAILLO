package daw1t.tarea5;

import java.util.Scanner;
public class Numero12 {
	
	public static void main(String[] args) {
		
		Scanner Numero12 = new Scanner(System.in);
		
		System.out.println("Introduce el numero 12 ");
		int num;
		num = Numero12.nextInt();
		System.out.println("Numero Introducido: " + num );
		
		if(num == 12) {
			System.out.println("Numero Correcto!");
		} else
			   System.out.println("Numero incorrecto! introduce el numero 12 ");
				
		
	}

}
