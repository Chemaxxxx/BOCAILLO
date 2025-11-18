package u3;

public class Wrapper {
	public static void main(String[] args) {
		int natural;
		double decimal;
		boolean continuar;
		String texto="12.3";
		
		Integer naturalV = 15;
		Double decimalV = 23.5;
		Boolean continuarV = true;
		
		natural = naturalV;
		System.out.println("numero " + natural);
		
		natural = naturalV.compareTo(10);
		System.out.println("Comparacion: " + natural);
		
		natural = decimalV.intValue();
		System.out.println("Transformación: " + natural);
		
		decimal = naturalV.doubleValue();
		System.out.println("Transformación: " + natural);
		
		
	}

}
