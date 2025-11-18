package Tarea8b;
import java.util.Scanner;

public class LetraL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la altura de la L: ");
        int altura = sc.nextInt();
        
        
        int longitudHorizontal = (altura / 2) + 1;
        
        
        for (int i = 0; i < altura - 1; i++) {
            System.out.println("*");
        }
        
       
        for (int i = 0; i < longitudHorizontal; i++) {
            System.out.print("*");
        }
        
        System.out.println(); // Salto de línea final
        sc.close();
    }
}
