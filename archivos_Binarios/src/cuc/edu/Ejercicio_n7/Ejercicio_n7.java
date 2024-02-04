package cuc.edu.Ejercicio_n7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio_n7 {

    String archivo;

    public Ejercicio_n7(String archivo) {
        this.archivo = archivo;
    }

    public String guardar() throws FileNotFoundException, IOException {
        File archivoB = new File(archivo);

        int total_contactos = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de contactos a guardar: "));
        String[] nombres = new String[total_contactos];
        String[] telefonos = new String[total_contactos];

        FileOutputStream guardar = new FileOutputStream(archivoB, true);
        FileInputStream mostrar = new FileInputStream(archivoB);
        for (int i = 0; i < total_contactos; i++) {
            JOptionPane.showMessageDialog(null, "Datos del contacto #" + (i + 1));
            nombres[i] = JOptionPane.showInputDialog("Nombre: ");
            telefonos[i] = JOptionPane.showInputDialog("Telefono: ");
            byte[] bytes1 = nombres[i].getBytes();
            byte[] bytes2 = telefonos[i].getBytes();
            byte[] titulo = "Lista Telefonica".getBytes();
            if (mostrar.available() == 0) {
                guardar.write(titulo);
                guardar.write('\n');
            }
            guardar.write(bytes1);
            guardar.write(' ');
            guardar.write(bytes2);
            guardar.write('\n');
        }

        guardar.close();
        return "s";
    }

}
