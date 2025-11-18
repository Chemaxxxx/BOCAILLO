package Tarea8b;

import java.util.Scanner;

public class LetraT {
    public static void main(String[] args) {
        int alturaT;
        int horizontal;
        int vertical;
        int i;

        Scanner LetraT = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        alturaT = LetraT.nextInt();

        horizontal = alturaT;
        vertical = alturaT / 2 - 1;

        
        for (i = 0; i < horizontal; i++) {
            System.out.print("*");
        }
        System.out.println();

       
        for (i = 0; i < alturaT - 1; i++) {
            for (int j = 0; j < vertical; j++) { 
                System.out.print(" ");
            }
            System.out.println("*"); // 
        }

        LetraT.close();
    }
}

