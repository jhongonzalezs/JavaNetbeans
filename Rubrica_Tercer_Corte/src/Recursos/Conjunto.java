package Recursos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Conjunto {
    private int IdConjunto;
    private String NombreConjunto;
    private String NitConjunto;
    private String DireccionConjunto;
    private int TelefonoConjunto;
     
     //Constructor

    public Conjunto(int IdConjunto, String NombreConjunto, String NitConjunto, String DireccionConjunto, int TelefonoConjunto) {
        this.IdConjunto = IdConjunto;
        this.NombreConjunto = NombreConjunto;
        this.NitConjunto = NitConjunto;
        this.DireccionConjunto = DireccionConjunto;
        this.TelefonoConjunto = TelefonoConjunto;
    }
     
    //Getter and Setter

    public int getIdConjunto() {
        return IdConjunto;
    }

    public void setIdConjunto(int IdConjunto) {
        this.IdConjunto = IdConjunto;
    }

    public String getNombreConjunto() {
        return NombreConjunto;
    }

    public void setNombreConjunto(String NombreConjunto) {
        this.NombreConjunto = NombreConjunto;
    }

    public String getNitConjunto() {
        return NitConjunto;
    }

    public void setNitConjunto(String NitConjunto) {
        this.NitConjunto = NitConjunto;
    }

    public String getDireccionConjunto() {
        return DireccionConjunto;
    }

    public void setDireccionConjunto(String DireccionConjunto) {
        this.DireccionConjunto = DireccionConjunto;
    }

    public int getTelefonoConjunto() {
        return TelefonoConjunto;
    }

    public void setTelefonoConjunto(int TelefonoConjunto) {
        this.TelefonoConjunto = TelefonoConjunto;
    }
    
    public DefaultTableModel MostrarConj (ArrayList <Conjunto> a){
        DefaultTableModel modelo = new DefaultTableModel(a.size(),5);
        String Columnas[] = new String[5];
        Columnas[0]="IdConjunto";
        Columnas[1]="Nombre del Conjunto";
        Columnas[2]="NIT del Conjunto";
        Columnas[3]="Direccion del Conjunto";
        Columnas[4]="Telefono del Conjunto";
        modelo.setColumnIdentifiers(Columnas);
        Conjunto nuevo;
        for (int i = 0; i < a.size(); i++) {
            nuevo = a.get(i);
            modelo.setValueAt(nuevo.getIdConjunto(), i, 0);
            modelo.setValueAt(nuevo.getNombreConjunto(), i, 1);
            modelo.setValueAt(nuevo.getNitConjunto(), i, 2);
            modelo.setValueAt(nuevo.getDireccionConjunto(), i, 3);
            modelo.setValueAt(nuevo.getTelefonoConjunto(), i, 4);

        }
        
        return modelo;
        
    }
     
}
