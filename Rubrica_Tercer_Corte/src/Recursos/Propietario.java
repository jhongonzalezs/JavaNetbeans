package Recursos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Propietario {
    private int IdPropietario;
    private String NombrePropietario;
    private String ApellidoPropietario;
    private String EmailPropietario;
    private int TelefonoPropietario;
    
    //Constructor

    public Propietario(int IdPropietario, String NombrePropietario, String ApellidoPropietario, String EmailPropietario, int TelefonoPropietario) {
        this.IdPropietario = IdPropietario;
        this.NombrePropietario = NombrePropietario;
        this.ApellidoPropietario = ApellidoPropietario;
        this.EmailPropietario = EmailPropietario;
        this.TelefonoPropietario = TelefonoPropietario;
    }
    
    //Getter and setter

    public int getIdPropietario() {
        return IdPropietario;
    }

    public void setIdPropietario(int IdPropietario) {
        this.IdPropietario = IdPropietario;
    }

    public String getNombrePropietario() {
        return NombrePropietario;
    }

    public void setNombrePropietario(String NombrePropietario) {
        this.NombrePropietario = NombrePropietario;
    }

    public String getApellidoPropietario() {
        return ApellidoPropietario;
    }

    public void setApellidoPropietario(String ApellidoPropietario) {
        this.ApellidoPropietario = ApellidoPropietario;
    }

    public String getEmailPropietario() {
        return EmailPropietario;
    }

    public void setEmailPropietario(String EmailPropietario) {
        this.EmailPropietario = EmailPropietario;
    }

    public int getTelefonoPropietario() {
        return TelefonoPropietario;
    }

    public void setTelefonoPropietario(int TelefonoPropietario) {
        this.TelefonoPropietario = TelefonoPropietario;
    }
    
    public DefaultTableModel MostrarPro (ArrayList <Propietario> a){
        DefaultTableModel modelo = new DefaultTableModel(a.size(),5);
        String Columnas[] = new String[5];
        Columnas[0]="IdPropietario";
        Columnas[1]="Nombre del Propietario";
        Columnas[2]="Apellido del Propietario";
        Columnas[3]="Email del Propietario";
        Columnas[4]="Telefono del Propietario";
        modelo.setColumnIdentifiers(Columnas);
        
        Propietario nuevo;
        for (int i = 0; i < a.size(); i++) {
            nuevo = a.get(i);
            modelo.setValueAt(nuevo.getIdPropietario(), i, 0);
            modelo.setValueAt(nuevo.getNombrePropietario(), i, 1);
            modelo.setValueAt(nuevo.getApellidoPropietario(), i, 2);
            modelo.setValueAt(nuevo.getEmailPropietario(), i, 3);
            modelo.setValueAt(nuevo.getTelefonoPropietario(), i, 4);

        }
        
        return modelo;
        
    }
}
