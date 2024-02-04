package cuc.edu.Ejercicio_n6;

import java.io.IOException;

public class PruebaEjercicio_n6 {
    public static void main(String[] args) {
        try {
            System.out.println("Programa Iniciado, Espere un momento....");
            System.out.println(" ");
            Ejercicio_n6 prueba1 = new Ejercicio_n6("binario.txt");
            int respuesta = prueba1.invertir();
            System.out.println("Programa Finalizado");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
