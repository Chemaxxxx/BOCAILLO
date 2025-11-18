package u3;

// Excepciones personalizadas
class OperacionInvalidaException extends Exception {
    public OperacionInvalidaException(String mensaje) {
        super(mensaje);
    }
}

class RestaNegativaException extends Exception {
    public RestaNegativaException(String mensaje) {
        super(mensaje);
    }
}

class DivPorCeroException extends Exception {
    public DivPorCeroException(String mensaje) {
        super(mensaje);
    }
}

public class Utilidadess {

	static boolean validaOperacion(Character op)throws OperacionInvalidaException  {
		if(Character.isDigit(op) || Character.isLetter(op)) {
			return false;
		}else
			return true;
		
	 }
       

    static double suma(double a, double b) {
        return a + b;
    }

    static double resta(double a, double b) throws RestaNegativaException {
        if (b > a) {
            throw new RestaNegativaException("La resta es negativa.");
        }
        return a - b;
    }

    static double producto(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) throws DivPorCeroException {
        if (b == 0) {
            throw new DivPorCeroException("No se puede dividir entre cero.");
        }
        return a / b;
    }

    static double calcular(double a, double b, char op)
            throws DivPorCeroException, RestaNegativaException, OperacionInvalidaException {
    	
    	if(!validaOperacion(op)) {
    		throw new OperacionInvalidaException ("No puedes poner ni numero ni letras");
    	}

        switch (op) {
            case '+':
                return suma(a, b);
            case '-':
                return resta(a, b);
            case '*':
                return producto(a, b);
            case '/':
                return divide(a, b);
            default:
                throw new OperacionInvalidaException("Operación desconocida.");
        }
    }
}
