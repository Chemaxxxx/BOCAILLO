package U2.ejemplos;

public class ejemplo1 {
public static void main(String[] args) {
	
	
	int c;
	int a = 1;
	int b = 0;
	
	try {
	c = a/b;
	}catch(ArithmeticException e) {
	System.out.println("No se puede dividir por cero");
	}
	System.out.println("¿LLega aqui?");
}
}
