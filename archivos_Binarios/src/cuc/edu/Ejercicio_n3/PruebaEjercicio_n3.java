package cuc.edu.Ejercicio_n3;

import java.io.IOException;

public class PruebaEjercicio_n3 {
    public static void main(String[] args) {
        try {
            System.out.println("Programa Iniciado, Espere un momento....");
            System.out.println(" ");
            Ejercicio_n3 prueba1 = new Ejercicio_n3("archivo.bin");
            int respuesta = prueba1.Numero_Total_lineas();
            System.out.println("Este archivo binario contiene "+respuesta+" lineas");
            System.out.println(" ");
            System.out.println("Programa Finalizado");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
