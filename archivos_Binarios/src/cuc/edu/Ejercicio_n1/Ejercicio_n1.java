package cuc.edu.Ejercicio_n1;

import java.io.*;

public class Ejercicio_n1 {

    String imagenRecibida;

    //Constructor
    public Ejercicio_n1(String imagenRecibida) {
        this.imagenRecibida = imagenRecibida;
    }

    //Metodo para saber si es una imagen de tipo BMP o no
    public boolean ImagenesBMP() throws FileNotFoundException, IOException {

        FileInputStream imagen = new FileInputStream(imagenRecibida);

        //Leer la primera letra de la imagen
        int byte_n1 = imagen.read();
        char letra_n1 = (char) byte_n1;

        //Imprimir la primera letra de la imagen
        System.out.println("La primera letra es: " + letra_n1);
        System.out.println(" ");

        //Leer la segunda letra de la imagen
        int byte_n2 = imagen.read();
        char letra_n2 = (char) byte_n2;

        //Imprimir la segunda letra de la imagen
        System.out.println("La segunda letra es: " + letra_n2);
        System.out.println(" ");
        
        //Cerrar el archivo
        imagen.close();
        
        //Comparar si las 2 primeras letras cumplen con las caracteristicas de las imagenes BMP
        if (letra_n1 == 'B' && letra_n2 == 'M') {
            return true;
        } else {
            return false;
        }
    }

}
