package Tarea8b;
import java.util.Scanner;
public class Piramide1 {
public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce la altura de la pirámide: ");
	        int altura = sc.nextInt();

	        System.out.print("Introduce el símbolo: ");
	        char simbolo = sc.next().charAt(0);

	        for (int i = 1; i <= altura; i++) {
	            for (int j = 1; j <= altura - i; j++) {
	                System.out.print(" "); 
	            }
	            for (int k = 1; k <= (2 * i) - 1; k++) {
	                System.out.print(simbolo); 
	            }
	            System.out.println();
	        }

	        }

	

}



