package edu.cuc.binarios;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoEscritura {

    public static void main(String[] args) {
        File archivo = new File("salida.txt");
        String cadena = "Hola Mundo";
        String cadena2 = "Prueba #1 de archivos binarios";
        try {
            System.out.println("En Proceso.....");
            FileOutputStream salida = new FileOutputStream(archivo);
            
            /*Prueba Caracteres
            salida.write('J');
            salida.close();
            */
            
            
            /*Prueba Cadenas por letras
            char[] vectorletras = cadena.toCharArray();
            for (int i = 0; i < vectorletras.length; i++) {
            char letraActual = vectorletras[i];
            salida.write(letraActual);
            }
            salida.close();
             */
            
            
            byte[] bytes1 = cadena.getBytes();
            byte[] bytes2 = cadena2.getBytes();
            salida.write(bytes1);
            salida.write('\n');
            salida.write(bytes2);
            salida.close();

            System.out.println("Finalizado Correctamente");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
