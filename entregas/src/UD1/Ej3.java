package UD1;
import java.util.Scanner;
public class Ej3 {
	public static void main(String[] args) {
		Scanner Ej3 = new Scanner (System.in);
		
		int altura = 8;
		int anchura = 6;
		char simbolo;
		
		
		
		System.out.print("Selecciona simbolo a colocar:");
		simbolo = Ej3.next().charAt(0);
		
		switch (simbolo) { //switch en el que depende el numero que insertemos se pondra uno u otro simbolo
		
		case '1':
			simbolo = '*';
			break;
		case '2':
			simbolo = '#';
			break;
			default:
				System.out.println("Opcion no valida");
		}
		
		for(int i = 1; i<= altura - 2 ; i++) { //bucle anidado para formar la letra 
			System.out.println(simbolo ); 
			
			for(int j = 1; j <= i ; j++)
				System.out.println(simbolo);
			
			
			
			
		}
		System.out.println("");
	}
}


