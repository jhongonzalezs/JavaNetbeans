package cuc.edu.Ejercicio_n2;

import java.io.IOException;

public class PruebaEjercicio_n2 {
    public static void main(String[] args) {
        try {
            System.out.println("Programa Iniciado, Espere un momento....");
            System.out.println(" ");
            Ejercicio_n2 prueba1 = new Ejercicio_n2("archivo.bin");
            String respuesta = prueba1.Guardar_Texto_Binario();
            System.out.println(respuesta);
            System.out.println(" ");
            System.out.println("Programa Finalizado");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
