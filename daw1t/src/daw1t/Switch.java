package daw1t;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner Switch= new Scanner (System.in);
		
		String mes;
		
		System.out.println("Introduce un Mes");
		mes = Switch.next();
		
		switch (mes) {
		case "Enero", "Febrero", "Marzo":
			System.out.println("Es invierno");
			break;
			
			
			case "Abril", "Febrero",  "Marzo":
				System.out.println("Es primavera");
				break;
				
				
				case "Junio" + "Julio" + "Agosto":
					System.out.println("Es verano");
					break;
					
					
					case "Septiembre" + "Octubre" + "Noviembre" :
						System.out.println("Es otoño");
						break;
						
						default:
							System.out.println("El valor debe de estar entre 1 y 12");
		}
	}
}
