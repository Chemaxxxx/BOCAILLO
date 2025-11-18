package daw1t.tarea5b;
import java.util.Scanner;
public class PrimeraHora {
	public static void main(String[] args) {
		System.out.println("Primera asignatura del dia");
		Scanner PrimeraHora = new Scanner (System.in);
		
		System.out.println("escribe un dia de la semana: ");
		String dia = PrimeraHora.nextLine();
		
		
		if (dia.equals("Lunes")) {
			System.out.println("Tienes programacion a primera hora ");	
		} else if(dia.equals("Martes"))
			System.out.println("Tienes matematicas a primera hora ");
		else if (dia.equals("Miercoles"))
			System.out.println("Tienes lengua a primera hora");
		else if (dia.equals("Jueves"))
			System.out.println("Tienes ingles a primera hora ");
		else if (dia.equals("Viernes"))
			System.out.println("Tienes historia a primera hora");
	}

}
