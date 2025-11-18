package UD1;
import java.util.Scanner;
public class Ej2 {
	public static void main(String[] args) {
		Scanner Ej2 = new Scanner(System.in);
		
		final int SECRETO = 25;
		 int intentos = 8;
		 boolean correcto = false;
		 boolean ayuda = false;
		 String eleccion;
		 int numero; 
		 System.out.print("Introduce un numero:");
		 numero = Ej2.nextInt();
		 
		 while(!correcto && intentos > 0) {
			 
			 if(numero == SECRETO)
				 correcto = true; //si se acierta correcto pasa a ser true
			 else {
				 intentos --; //restamos intentos si el numero no es correcto
					System.out.println("Error! te quedan " + intentos + " intentos");
					
					
					
					
					
					if(intentos> 0) { //este bloque de codigo se ejecutara siempre que los intentos sean mayor que 0
						
						System.out.print("¿Quieres recibir ayuda?(Si/No):");
						eleccion = Ej2.next();
						
						if(eleccion.equals("Si")) { //en estos condicionales se activa ayuda como "true" y se indica al usuario si el numero introducido es menor o mayor al numero secreto
							ayuda = true;
				
						if(ayuda && numero > SECRETO)
							System.out.println("El numero es mayor");
						else if(ayuda && numero < SECRETO)
							System.out.println("El numero es menor");
						
						
						}else
							System.out.println("No tienes ayuda"); //en caso de responder que no se indica que no habra ayuda
						
						System.out.print("Introduce un numero:");
						numero = Ej2.nextInt();
			 }
			 
			 
				}
		 }
		 
		 if(correcto)
			 System.out.println("Correcto!");
		 else
			 System.out.println("Te has quedado sin intentos");
	}
}
