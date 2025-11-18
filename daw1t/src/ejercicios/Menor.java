package ejercicios;
import java.util.Scanner;
public class Menor {

	
	public static void main(String[] args) {
		Scanner Menor = new Scanner (System.in);
		byte num1;
		byte num2;
	
		
		System.out.println("Introduce un numero");
		 num1 = Menor.nextByte();
		 System.out.println("Introduce un numero");
		 num2 = Menor.nextByte();
		 
			int numeroMenor = (num1 < num2) ? -1 : 1;
			
			switch(numeroMenor) {
			case  -1:
				numeroMenor = num1;
				break;
			case 1:
				numeroMenor = num2;
				break;
				
				
			}
			
			System.out.println("El numero menor es " + numeroMenor);
	}
	
}
