package cuc.edu.Ejercicio_n3;

import java.io.*;

public class Ejercicio_n3 {

    String archivoBinario;

    //Constructor
    public Ejercicio_n3(String archivoBinario) {
        this.archivoBinario = archivoBinario;
    }

    //Metodo para indicar el numero de lineas de un archivo binario
    public int Numero_Total_lineas() throws FileNotFoundException, IOException {

        FileInputStream archivo = new FileInputStream(archivoBinario);

        String cadena = "";
        int num_lineas=0;
        while (archivo.available() != 0) {
            int byteLeido = archivo.read();
            char letra = (char) byteLeido;
            //System.out.println("El valor leido es: " + byteLeido + " : " + letra);
            if (letra == '\n') {
                num_lineas=num_lineas+1;
            }
        }
        archivo.close();

        return num_lineas;
    }

}
