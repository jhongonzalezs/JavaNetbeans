package cuc.edu.Ejercicio_n5;

import java.io.IOException;

public class PruebaEjercicio_n5 {

    public static void main(String[] args) {
        try {
            System.out.println("Programa Iniciado, Espere un momento....");
            System.out.println(" ");
            Ejercicio_n5 prueba1 = new Ejercicio_n5("binario.txt");
            int respuesta = prueba1.vectorByte();
            System.out.println("Programa Finalizado");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
