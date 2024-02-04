package cuc.edu.Ejercicio_n6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio_n6 {

    String archivo;

    public Ejercicio_n6(String archivo) {
        this.archivo = archivo;
    }
    int cont = 0;
    String[] blog = null;
    int x = 0;

    public int invertir() throws FileNotFoundException, IOException {
        File archivoB = new File(archivo);
        FileInputStream salida = new FileInputStream(archivoB);
        FileInputStream salida2 = new FileInputStream(archivoB);

        String cadena = "";
        while (salida.available() != 0) {
            int byteLeido = salida.read();
            char letra = (char) byteLeido;
            //System.out.println("El valor leido es: " + byteLeido + " : " + letra);
            if (letra == ' ' || letra == '\n') {
                //System.out.println("Cadena Leida " + cadena);
                cont = cont + 1;
                cadena = "";
            } else {
                cadena += letra;
            }
        }
        System.out.println();
        blog = new String[cont];
        System.out.println("num palabras "+blog.length);
        String cadena2 = "";
        while (salida2.available() != 0) {
            int byteLeido = salida2.read();
            char letra = (char) byteLeido;
            //System.out.println("El valor leido es: " + byteLeido + " : " + letra);
            if (letra == ' ' || letra == '\n') {
                //System.out.println("Cadena Leida " + cadena);
                blog[x] = cadena2;
                x = x + 1;
                cadena2 = "";
            } else {
                cadena2 += letra;
            }
        }
        
        int aux;
        String[] invertido = new String[blog.length];
        for (int i = 0; i < blog.length; i++) {
            invertido[i] = blog[blog.length - 1 - i];
        }
        blog = invertido;
        FileOutputStream guardar = new FileOutputStream(archivoB);
        guardar.write('\n');
        for (int i = 0; i < blog.length; i++) {
            byte[] bytes1 = blog[i].getBytes();
            guardar.write(bytes1);
            guardar.write(' ');
        }
        
        
        salida.close();
        salida2.close();
        guardar.close();
        System.out.println("Fin....");

        return 0;
    }
}
