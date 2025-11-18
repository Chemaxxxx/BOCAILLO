package u3;

public class Validacion {
public static void main(String[] args) {
	

	String telefono = "Mi teléfono es 987654321";
	String sinNumero = telefono.replaceAll("\\d", "*");
	System.out.println(sinNumero);
	
	String dni = "12345678A";
	boolean valido = dni.matches("^\\d{8}","[A-Z]$");
	
}
	
	
}
