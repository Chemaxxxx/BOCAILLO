package daw1t.tarea5b;
import java.util.Scanner;
public class MenorMayor {
	
	public static void main(String[] args) {
		
		
		System.out.println("Orden de numeros");
		Scanner MenorMayor = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		
		
		System.out.println("Introduce un numero");
		num1 = MenorMayor.nextInt();
		
		System.out.println("Introduce un numero");
		num2 = MenorMayor.nextInt();
		
		System.out.println("Introduce un numero");
		num3 = MenorMayor.nextInt();
		
		if(num1 < num2 && num1 < num3 && num2 < num3)
			System.out.println(num1  + "<"  + num2 + "<" + num3 );
		
		else if(num1 < num2 && num1 < num3 && num3< num2)
			System.out.println( num1 + "<" + num3 +  "<" +  num2);
		
		if(num2 < num1 && num2 < num3 && num1 < num3)
			System.out.println(num2 + "<" + num1 + "<" + num3);
			
		
	}
}
			 
		
			 
			 
	
		
			
		
		
		
			
		
			
		
							
	


