package daw1t;

import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		System.out.println("Inicio de sesión");
		Scanner Login = new Scanner (System.in);
		
		System.out.println("Introduce una contraseña: ");
		String clave = Login.next();
		System.out.println("Clave Introducida:" + clave);
		String claveCorrecta = "pato";
		
		boolean secreta = (clave.equals(claveCorrecta)) ? true:false;
		
		if (secreta)
			System.out.println("Clave correcta!");
		else
			System.out.println("Clave incorrecta!");
		
		while (secreta == false) {
		System.out.println("aaa");}
		
			
				
			
	}
}
		