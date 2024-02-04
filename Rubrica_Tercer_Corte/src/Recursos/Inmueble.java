package Recursos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Inmueble {
    private int Idmueble;
    private int Torre;
    private int NumeroApto;
    
    //Constructor

    public Inmueble(int Idmueble, int Torre, int NumeroApto) {
        this.Idmueble = Idmueble;
        this.Torre = Torre;
        this.NumeroApto = NumeroApto;
    }
    
    //Getter and Setter
    public int getIdmueble() {
        return Idmueble;
    }

    public void setIdmueble(int Idmueble) {
        this.Idmueble = Idmueble;
    }

    public int getTorre() {
        return Torre;
    }

    public void setTorre(int Torre) {
        this.Torre = Torre;
    }

    public int getNumeroApto() {
        return NumeroApto;
    }

    public void setNumeroApto(int NumeroApto) {
        this.NumeroApto = NumeroApto;
    }
    
    public DefaultTableModel MostrarInm (ArrayList <Inmueble> b){
        DefaultTableModel modelo = new DefaultTableModel(b.size(),3);
        String Columnas[] = new String[3];
        Columnas[0]="Idmueble";
        Columnas[1]="Torre";
        Columnas[2]="NumeroApto";
        modelo.setColumnIdentifiers(Columnas);
        Inmueble nuevo;
        for (int i = 0; i < b.size(); i++) {
            nuevo = b.get(i);
            modelo.setValueAt(nuevo.getIdmueble(), i, 0);
            modelo.setValueAt(nuevo.getTorre(), i, 1);
            modelo.setValueAt(nuevo.getNumeroApto(), i, 2);

        }
        
        return modelo;
        
    }
    
    
    
}
