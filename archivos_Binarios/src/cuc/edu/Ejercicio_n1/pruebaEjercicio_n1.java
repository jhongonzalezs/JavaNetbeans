package cuc.edu.Ejercicio_n1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class pruebaEjercicio_n1 {

    public static void main(String[] args) {
        try {
            System.out.println("Programa Iniciado, Espere un momento....");
            System.out.println(" ");
            Ejercicio_n1 prueba1 = new Ejercicio_n1("logo1.bmp");
            boolean respuesta = prueba1.ImagenesBMP();
            if (respuesta) {
                System.out.println("La Imagen es de tipo BMP");
            } else {
                System.out.println("La Imagen no es de tipo BMP");
            }
            System.out.println(" ");
            System.out.println("Programa Finalizado");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
