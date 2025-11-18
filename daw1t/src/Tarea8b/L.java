package Tarea8b;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la L: ");
        int altura = sc.nextInt();

        int base = (altura / 2) + 1; 

        for (int i = 1; i <= altura; i++) { 
            if (i < altura) {
                
                System.out.println("*");
            } else {
                
                for (int j = 1; j <= base; j++) {
                    System.out.print("*");
                }
                System.out.println(); 
            }
        }

        sc.close();
    }
}
