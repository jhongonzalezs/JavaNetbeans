package Controlador;

import Modelo.Consultas_Productos;
import Modelo.Producto;
import Vista.Formulario_Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_Producto implements ActionListener{
    
    private Consultas_Productos CP;
    private Producto PD;
    private Formulario_Producto FP;
    
    public Controlador_Producto (Producto PD, Consultas_Productos CP, Formulario_Producto FP){
        this.CP = CP;
        this.FP = FP;
        this.PD = PD;
        
        this.FP.Buscar.addActionListener(this);
        this.FP.Guardar.addActionListener(this);
        this.FP.Modificar.addActionListener(this);
        this.FP.Eliminar.addActionListener(this);
        this.FP.Limpiar.addActionListener(this);
        
    }
    
    public void Iniciar(){
        FP.setTitle("Productos");
        FP.setLocationRelativeTo(null);
        FP.ID.setVisible(false);
        
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        if(e.getSource() == FP.Guardar){
            PD.setCodigo(FP.txtCodigo.getText());
            PD.setNombre(FP.txtNombre.getText());
            PD.setPrecio(Double.parseDouble(FP.txtPrecio.getText()));
            PD.setCantidad(Integer.parseInt(FP.txtCantidad.getText()));
            
            if(CP.registrar(PD)){
                JOptionPane.showMessageDialog(null, "Guardado Correctamente");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "No Se Logro Guardar");
                limpiar();
            }
        }
        
        if(e.getSource() == FP.Modificar){
            PD.setId(Integer.parseInt(FP.ID.getText()));
            PD.setCodigo(FP.txtCodigo.getText());
            PD.setNombre(FP.txtNombre.getText());
            PD.setPrecio(Double.parseDouble(FP.txtPrecio.getText()));
            PD.setCantidad(Integer.parseInt(FP.txtCantidad.getText()));
            
            if(CP.modificar(PD)){
                JOptionPane.showMessageDialog(null, "La Modificacion Se Realizo Correctamente");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "No Se Logro Modificar El Producto");
                limpiar();
            }
        }
        
        if(e.getSource() == FP.Eliminar){
            PD.setId(Integer.parseInt(FP.ID.getText()));            
            if(CP.eliminar(PD)){
                JOptionPane.showMessageDialog(null, "Eliminado Correctamente");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "No Se Logro Eliminar El Producto");
                limpiar();
            }
        }
        
         if(e.getSource() == FP.Buscar){
            PD.setCodigo(FP.txtCodigo.getText());            
            if(CP.buscar(PD)){
                
                FP.ID.setText(String.valueOf(PD.getId()));
                FP.txtCodigo.setText(PD.getCodigo());
                FP.txtNombre.setText(PD.getNombre());
                FP.txtPrecio.setText(String.valueOf(PD.getPrecio()));
                FP.txtCantidad.setText(String.valueOf(PD.getCantidad()));

            }else{
                JOptionPane.showMessageDialog(null, "No Se Logro Encontrar El Codigo");
                limpiar();
            }
        }
         
         if(e.getSource() == FP.Limpiar){
             limpiar();
         }
        
        
        
    }
    
    public void limpiar(){
        FP.ID.setText(null);
        FP.txtCodigo.setText(null);
        FP.txtNombre.setText(null);
        FP.txtPrecio.setText(null);
        FP.txtCantidad.setText(null);
    }
    
}
