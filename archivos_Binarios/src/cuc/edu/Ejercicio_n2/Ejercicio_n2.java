package cuc.edu.Ejercicio_n2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ejercicio_n2 {

    String archivoBinario;
    
    //Constructor
    public Ejercicio_n2(String archivoBinario) {
        this.archivoBinario = archivoBinario;
    }

    //Metodo para guardar texto binario
    public String Guardar_Texto_Binario() throws IOException {
        
        String mensaje = "Guardado Correctamente";
        //Se pide el texto al usuario con JOptionPane
        String textoIngresado = JOptionPane.showInputDialog("Digite el texto a guardar");
        
        //archivo binario en donde se va a guardar la informacion
        FileOutputStream archivo = new FileOutputStream(archivoBinario, true);
        
        //El texto ingresado se guarda en un arreglo de Byte
        byte[] almacenarTexto = textoIngresado.getBytes();
        
        //Se guarda el arreglo en el archivo binario
        archivo.write(almacenarTexto);
        
        //Se hace un salto de linea para el proximo texto a ingresar
        archivo.write('\n');
        
        //Se cierra el archivo binario
        archivo.close();

        return mensaje;

    }

}
