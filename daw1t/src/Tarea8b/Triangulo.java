package Tarea8b;
import java.util.Scanner;
public class Triangulo {
	
	public static void main(String[] args) {
		int num;
		int i = 1;
		int j = 1;
		Scanner Triangulo = new Scanner (System.in);
		System.out.println("Introduce num");
		num = Triangulo.nextInt();
		
		for ( i = num; i >= 1; i--) {
		    for (j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}

	}

}
