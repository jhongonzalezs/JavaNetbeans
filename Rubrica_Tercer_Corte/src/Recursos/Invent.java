package Recursos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus X505B
 */
public class Invent {
    
    private int id;
    private int idProp;
    private String NomPro;
    private String ApelliPro;
    private int idmueb;
    private int TorreMueb;
    private int NumAptomueble;
    private int idconj;
    private String nombConj;

    public Invent(int id, int idProp, String NomPro, String ApelliPro, int idmueb, int TorreMueb, int NumAptomueble, int idconj, String nombConj) {
        this.id = id;
        this.idProp = idProp;
        this.NomPro = NomPro;
        this.ApelliPro = ApelliPro;
        this.idmueb = idmueb;
        this.TorreMueb = TorreMueb;
        this.NumAptomueble = NumAptomueble;
        this.idconj = idconj;
        this.nombConj = nombConj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProp() {
        return idProp;
    }

    public void setIdProp(int idProp) {
        this.idProp = idProp;
    }

    public String getNomPro() {
        return NomPro;
    }

    public void setNomPro(String NomPro) {
        this.NomPro = NomPro;
    }

    public String getApelliPro() {
        return ApelliPro;
    }

    public void setApelliPro(String ApelliPro) {
        this.ApelliPro = ApelliPro;
    }

    public int getIdmueb() {
        return idmueb;
    }

    public void setIdmueb(int idmueb) {
        this.idmueb = idmueb;
    }

    public int getTorreMueb() {
        return TorreMueb;
    }

    public void setTorreMueb(int TorreMueb) {
        this.TorreMueb = TorreMueb;
    }

    public int getNumAptomueble() {
        return NumAptomueble;
    }

    public void setNumAptomueble(int NumAptomueble) {
        this.NumAptomueble = NumAptomueble;
    }

    public int getIdconj() {
        return idconj;
    }

    public void setIdconj(int idconj) {
        this.idconj = idconj;
    }

    public String getNombConj() {
        return nombConj;
    }

    public void setNombConj(String nombConj) {
        this.nombConj = nombConj;
    }
    
     public DefaultTableModel MostrarInvent (ArrayList <Invent> a){
        DefaultTableModel modelo = new DefaultTableModel(a.size(),9);
        String Columnas[] = new String[9];
        Columnas[0]="Id";
        Columnas[1]="IdPro";
        Columnas[2]="Nombre Pro";
        Columnas[3]="ApelliPro";
        Columnas[4]="idmueb";
        Columnas[5]="TorreMueb";
        Columnas[6]="NumAptomueble";
        Columnas[7]="idconj";
        Columnas[8]="nombConj";
        modelo.setColumnIdentifiers(Columnas);
        Invent nuevo;
        for (int i = 0; i < a.size(); i++) {
            nuevo = a.get(i);
            modelo.setValueAt(nuevo.getId(), i, 0);
            modelo.setValueAt(nuevo.getIdProp(), i, 1);
            modelo.setValueAt(nuevo.getNomPro(), i, 2);
            modelo.setValueAt(nuevo.getApelliPro(), i, 3);
            modelo.setValueAt(nuevo.getIdmueb(), i, 4);
            modelo.setValueAt(nuevo.getTorreMueb(), i, 5);
            modelo.setValueAt(nuevo.getNumAptomueble(), i, 6);
            modelo.setValueAt(nuevo.getIdconj(), i, 7);
            modelo.setValueAt(nuevo.getNombConj(), i, 8);

        }
        
        return modelo;
        
    }
    
    
}
