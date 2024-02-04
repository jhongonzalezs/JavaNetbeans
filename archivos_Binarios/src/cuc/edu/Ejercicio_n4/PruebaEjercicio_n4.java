package cuc.edu.Ejercicio_n4;

import java.io.IOException;

public class PruebaEjercicio_n4 {
    public static void main(String[] args) {
        try {
            System.out.println("Programa Iniciado, Espere un momento....");
            System.out.println(" ");
            Ejercicio_n4 prueba1 = new Ejercicio_n4("matriz.txt");
            int respuesta = prueba1.Matriz();
            System.out.println(respuesta);
            System.out.println(" ");
            System.out.println("Programa Finalizado");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
