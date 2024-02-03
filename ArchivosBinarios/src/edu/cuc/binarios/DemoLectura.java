package edu.cuc.binarios;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoLectura {

    public static void main(String[] args) {
        File archivo = new File("salida.txt");
        try {
            System.out.println("En Proceso.....");
            FileInputStream entrada = new FileInputStream(archivo);
            String cadena = " ";
            while (entrada.available() != 0) {
                int byteLeido = entrada.read();
                char letra = (char) byteLeido;
                //System.out.println("El valor leido es: " + byteLeido + " : " + letra);
                if (letra == ' ' || letra == '\n') {
                    System.out.println("Cadena Leida " + cadena);
                    cadena = "";
                } else {
                    cadena += letra;
                }
            }
            System.out.println("Cadena Leida " + cadena);
            System.out.println("finalizado");
            entrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
