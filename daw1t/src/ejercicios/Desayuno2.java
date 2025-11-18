package ejercicios;

import java.util.Scanner;

public class Desayuno2 {

    public static void main(String[] args) {
        Scanner Desayuno2 = new Scanner(System.in);

        String comida;
        String bebida;
       String pitufo;
        float precioPalmera = 1.40f;
        float precioDonut = 1.00f;
        float precioZumo = 1.50f;
        float precioCafe = 1.20f;
        float precioPitufo = 0f;
        float precioComida = 0f;
        float precioTotal = 0f;

        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        comida = Desayuno2.next().toLowerCase();

        System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
        bebida = Desayuno2.next().toLowerCase();

      
        if (comida.equals("pitufo")) {
            System.out.print("¿Con qué se ha tomado el pitufo (aceite o tortilla)?: ");
            pitufo = Desayuno2.next().toLowerCase();

            
            precioPitufo = pitufo.equals("aceite") ? 1.20f
                         : pitufo.equals("tortilla") ? 1.60f
                         : 0f;

            if (precioPitufo == 0) 
                System.out.println("Elección de pitufo no válida.");
        }

        
        precioComida = comida.equals("palmera") ? precioPalmera
                      : comida.equals("donut") ? precioDonut
                      : comida.equals("pitufo") ? precioPitufo
                      : 0f;

        if (precioComida == 0f) 
            System.out.println("Comida no válida.");
            
            
        

       
        float precioBebida = bebida.equals("zumo") ? precioZumo
                          : (bebida.equals("café") || bebida.equals("cafe")) ? precioCafe
                          : 0f;

        if (precioBebida == 0f) 
            System.out.println("Bebida no válida.");
          

        

       
        precioTotal = precioComida + precioBebida;

       
    
}
}