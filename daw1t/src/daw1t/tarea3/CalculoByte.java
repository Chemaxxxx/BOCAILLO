package daw1t.tarea3;

import java.util.Scanner;

public class CalculoByte {
public static void main(String[] args) {
	System.out.println("Calcula de suma de numeros byte");
	Scanner CalculoByte = new Scanner(System.in);
	
	System.out.println("Introduce un numero: ");
	byte num1;
	num1 = CalculoByte.nextByte();
	System.out.println("El numero seleccionado es: " + num1);
	
	System.out.println("Introduce un numero: ");
	byte num2;
	num2 = CalculoByte.nextByte();
	System.out.println("El numero seleccionado es: " + num2);
	
	 int suma;
	 suma= (byte) num1 + num2;
	System.out.println("Calculo de la suma:" + num1 + " + " + num2 );
	System.out.println("Resultado: " + suma);
	
}
}
