package cuc.edu.Ejercicio_n4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ejercicio_n4 {

    String archivo;

    public Ejercicio_n4(String archivo) {
        this.archivo = archivo;
    }

    public int Matriz() throws FileNotFoundException, IOException {
        System.out.println("En Proceso.....");
        FileOutputStream guardar = new FileOutputStream(archivo, true);
        int filas = 0, columnas = 0;
        filas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas de la matriz: "));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas de la matriz: "));
        String[][] matriz = new String[filas][columnas];
        
        byte letra;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = JOptionPane.showInputDialog("Digite el valor para la fila: "+(i+1)+" y la columna: "+(j+1));
                System.out.print( matriz[i][j]);
                letra = (byte) matriz[i][j].charAt(0);
                System.out.print(" "+letra+" ");
                guardar.write(' ');
                guardar.write(letra);
                guardar.write(' ');
            }
            System.out.println("\n");
            guardar.write('\n');
        }
        
        guardar.close();
        return filas;
    }

}
