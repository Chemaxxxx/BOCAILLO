package daw1t.tarea1;

import java.util.Scanner;

public class EdadAcertada {
	public static void main(String[] args) {
		System.out.println("Acierta la edad ");
		
		Scanner EdadAcertada = new Scanner (System.in);
		
		int edadCorrecta = 20;
		int intento;
		boolean correcto = false;
		 
		 System.out.println("Inserta edad");
		 intento= EdadAcertada.nextInt();
		 
		while(!correcto) {
			
			if(intento == edadCorrecta) {
				System.out.println("acertaste la edad");
				correcto = true;
				
			}else {
				System.out.println("error intenta de nuevo");
				intento = EdadAcertada.nextInt();
				
			}
			
			
		}
		

}
}
