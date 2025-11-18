package ejercicios;
import java.util.Scanner;
public class VocalOConsonante {
	public static void main(String[] args) {
		Scanner VocalOConsonante = new Scanner (System.in);
		
		char letra;
		
		
		System.out.print("Introduce Vocal o Consonante: ");
		letra = VocalOConsonante.next().charAt(0);
		
		switch (letra) {
		case 'a', 'e' , 'i' , 'o' , 'u':
			System.out.println("Es vocal");
			break;
		
		default:
			System.out.println("Es consonante");
		
		}

		
	}

}
