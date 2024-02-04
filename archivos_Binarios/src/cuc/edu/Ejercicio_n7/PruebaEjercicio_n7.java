package cuc.edu.Ejercicio_n7;

import java.io.IOException;



public class PruebaEjercicio_n7 {
public static void main(String[] args) {
        try {
            System.out.println("Programa Iniciado, Espere un momento....");
            System.out.println(" ");
            Ejercicio_n7 prueba1 = new Ejercicio_n7("contactos.txt");
            String respuesta = prueba1.guardar();
            System.out.println("Programa Finalizado");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
