package cuc.edu.Ejercicio_n5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ejercicio_n5 {

    String archivo;

    public Ejercicio_n5(String archivo) {
        this.archivo = archivo;
    }

    public int vectorByte() throws FileNotFoundException, IOException {
        FileInputStream salida = new FileInputStream(archivo);
        System.out.println(salida.available());
        if (salida.available() <= 0) {
            FileOutputStream guardar = new FileOutputStream(archivo);

            int cantidad;
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantida de posiciones del vector: "));
            String[] vector = new String[cantidad];
            byte[] numerobinario;

            for (int i = 0; i < vector.length; i++) {
                vector[i] = JOptionPane.showInputDialog("valor para la posicion " + (i + 1) + " del vector: ");
                numerobinario = vector[i].getBytes();
                System.out.print("|" + numerobinario + "|");
                guardar.write(numerobinario);
                guardar.write(' ');
            }

            guardar.write('\n');

            guardar.close();
        }else{
            FileOutputStream guardar = new FileOutputStream(archivo, true);
        
        int cantidad;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantida de posiciones del vector: "));
        String[] vector = new String[cantidad];
        byte[] numerobinario;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = JOptionPane.showInputDialog("valor para la posicion " + (i + 1) + " del vector: ");
            numerobinario = vector[i].getBytes();
            System.out.print("|" + numerobinario + "|");
            guardar.write(numerobinario);
            guardar.write(' ');
        }

        guardar.write('\n');

        guardar.close();
        }

        return 0;
    }

}
