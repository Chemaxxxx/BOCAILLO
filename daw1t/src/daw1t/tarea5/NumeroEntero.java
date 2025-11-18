package daw1t.tarea5;
import java.util.Scanner;

public class NumeroEntero {

public static void main(String[] args) {
	System.out.println("Calculo numero positivo ");
	Scanner NumeroEntero = new Scanner(System.in);
	
	System.out.println("Introduce un numero entero: ");
	int num1 = NumeroEntero.nextInt();
	System.out.println("Numero seleccionado: " + num1);
	
	if(num1 > 0) {
		System.out.println("Tu numero es positivo!");
	} else if(num1 == 0) 
		System.out.println("Tu numero es 0!");
	       else 
		      System.out.println("Tu numero es negativo!");
	     
		
	
   }
}
