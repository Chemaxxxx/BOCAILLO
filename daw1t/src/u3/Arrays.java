package u3;

public class Arrays {
    public static void main(String[] args) {
        
        // Nombres
        String[] nombres = {"Ana", "Luis", "Maria"};
        System.out.println("Nombres:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        System.out.println("------");
        
        // Colores
        String[] colores = {"Rojo", "Verde", "Azul"};
        System.out.println("Colores:");
        for (int i = 0; i < colores.length; i++) {
            System.out.println("Color " + i + " : " + colores[i]);
        }
        System.out.println("------");
        
        // Edades
        int[] edades = {12, 23, 34};
        System.out.println("Edades:");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad " + i + " : " + edades[i]);
        }
        System.out.println("------");
        
        // Notas
        Double[] notas = {3.7, 6.2, 9.25};
        System.out.println("Notas:");
        for (Double nota : notas) {
            System.out.println("Nota " + nota);
        }
        System.out.println("------");
    }
}
