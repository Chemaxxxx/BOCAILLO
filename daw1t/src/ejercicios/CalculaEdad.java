package ejercicios;

import java.util.Scanner;

class CalculaEdad {
 
    public static void main( String args[] ) {
 
        Scanner calculaEdad = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: " );
        int primerNumero = calculaEdad.nextInt();
        System.out.print( "Introduzca el segundo número: " );
        int segundoNumero = calculaEdad.nextInt();
 
        System.out.print( "Su suma es: " );
        System.out.println( primerNumero+segundoNumero );
    }
}