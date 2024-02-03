package Controlador;

import Modelo.Consulta_De_Medicamentos;
import Modelo.Medicamentos;
import Modelo.Usuarios;
import Vistas.Agregar;
import Vistas.Registrarse;
import Vistas.Vender;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_De_Medicina implements ActionListener {

    private Consulta_De_Medicamentos CM;
    private Medicamentos MD;
    private Usuarios US;
    private Agregar AG;
    private Vender VD;
    private Registrarse RG;

    public Controlador_De_Medicina(Medicamentos MD, Consulta_De_Medicamentos CM, Agregar AG, Vender VD, Usuarios US, Registrarse RG) {
        this.CM = CM;
        this.MD = MD;
        this.AG = AG;
        this.VD = VD;
        this.RG = RG;
        this.US = US;

        this.AG.BtnGuardar.addActionListener(this);
        this.AG.BtnBuscar.addActionListener(this);
        this.AG.BtnModificar.addActionListener(this);
        this.VD.VDBuscar.addActionListener(this);
        this.VD.VENDER.addActionListener(this);
        this.RG.RegGuadar.addActionListener(this);
    }

    public void Iniciar() {
        AG.setTitle("Medicamentos");
        AG.setLocationRelativeTo(null);
        AG.txtID.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == AG.BtnGuardar) {
            MD.setCodigo(AG.txtCodigo.getText());
            MD.setNombre(AG.txtNombre.getText());
            MD.setTipo_Venta(AG.CBTipo_Venta.getSelectedItem().toString());
            MD.setCantidad(Integer.parseInt(AG.txtCantidad.getText()));
            MD.setValor(Integer.parseInt(AG.txtValor.getText()));
            MD.setInformacion(AG.txtInformacion.getText());

            if (CM.GuardarTB(MD)) {
                JOptionPane.showMessageDialog(null, "Guardado Correctamente");
                limpiarGuardar();
            } else {
                JOptionPane.showMessageDialog(null, "No Se Logro Guardar");
                limpiarGuardar();
            }
        }

        if (e.getSource() == AG.BtnModificar) {
            MD.setId(Integer.parseInt(AG.txtID.getText()));
            MD.setCodigo(AG.txtCode.getText());
            MD.setNombre(AG.txtName.getText());
            MD.setTipo_Venta(AG.txtVenta.getText());
            MD.setCantidad(Integer.parseInt(AG.txtCant.getText()));
            MD.setValor(Integer.parseInt(AG.txtPrecio.getText()));
            MD.setInformacion(AG.txtInforme.getText());

            if (CM.ModificarTB(MD)) {
                JOptionPane.showMessageDialog(null, "Modificacion Correctamente");
                LimpiarModificarAG();
            } else {
                JOptionPane.showMessageDialog(null, "No Se Logro Modificar");
                
            }
        }

        if (e.getSource() == AG.BtnBuscar) {
            MD.setCodigo(AG.txtCode.getText());
            MD.setNombre(AG.txtName.getText());

            if (CM.BuscarTB(MD)) {
                AG.txtID.setText(String.valueOf(MD.getId()));
                AG.txtCode.setText(MD.getCodigo());
                AG.txtName.setText(MD.getNombre());
                AG.txtVenta.setText(MD.getTipo_Venta());
                AG.txtCant.setText(String.valueOf(MD.getCantidad()));
                AG.txtPrecio.setText(String.valueOf(MD.getValor()));
                AG.txtInforme.setText(MD.getInformacion());
            }else{
                JOptionPane.showMessageDialog(null, "No Se Logro Encontrar Ninguna Informacion");
                
            }

        }

        if (e.getSource() == VD.VDBuscar) {
            VD.ID.setVisible(false);
            MD.setCodigo(VD.CODE.getText());
            MD.setNombre(VD.NOMBRE.getText());

            if (CM.BuscarTB(MD)) {
                VD.ID.setText(String.valueOf(MD.getId()));
                VD.CODE.setText(MD.getCodigo());
                VD.NOMBRE.setText(MD.getNombre());
                VD.TIPO_VALOR.setText(MD.getTipo_Venta());
                VD.CANTIDAD.setText(String.valueOf(MD.getCantidad()));
                VD.VALOR.setText(String.valueOf(MD.getValor()));
                VD.INFORME.setText(MD.getInformacion());
            } else {
                JOptionPane.showMessageDialog(null, "No Se Logro Encontrar Ninguna Informacion");
                
            }

        }

        if (e.getSource() == VD.VENDER) {

            int valor1, valor2, cambio, resta, total, valorUni, compra, billete;

            valorUni = Integer.parseInt(VD.VALOR.getText());
            compra = Integer.parseInt(VD.VENTA.getText());

            total = valorUni * compra;
            VD.txtTotal.setText(Integer.toString(total));

            billete = Integer.parseInt(JOptionPane.showInputDialog("Total a Pagar $: " + total + "\n" + "Digite El Valor Del Billete"));
            cambio = billete - total;
            JOptionPane.showMessageDialog(null, "El Cambio Es De: $ " + cambio);
            VD.txtCambio.setText(Integer.toString(cambio));

            valor1 = Integer.parseInt(VD.CANTIDAD.getText());
            valor2 = Integer.parseInt(VD.VENTA.getText());

            resta = valor1 - valor2;
            VD.CANTIDAD.setText(null);
            VD.CANTIDAD.setText(Integer.toString(resta));

            MD.setId(Integer.parseInt(VD.ID.getText()));
            MD.setCodigo(VD.CODE.getText());
            MD.setNombre(VD.NOMBRE.getText());
            MD.setTipo_Venta(VD.TIPO_VALOR.getText());
            MD.setCantidad(Integer.parseInt(VD.CANTIDAD.getText()));
            MD.setValor(Integer.parseInt(VD.VALOR.getText()));
            MD.setInformacion(VD.INFORME.getText());

            if (CM.ModificarTB(MD)) {
                JOptionPane.showMessageDialog(null, "Venta Efectuada Correctamente");
                LimpiarModificarVD();
                
            } else {
                JOptionPane.showMessageDialog(null, "No Se Logro La Venta");
                
            }
        }
        
        if (e.getSource() == RG.RegGuadar) {
            US.setNombres(RG.RegNombres.getText());
            US.setApellidos(RG.RegApellidos.getText());
            US.setCedula(Integer.parseInt(RG.RegCedula.getText()));
            US.setTelefono(RG.RegTelefono.getText());
            US.setCorreo(RG.RegCorreo.getText());
            US.setPass(RG.RegPass.getText());

            if (CM.GuardarUser(US)) {
                JOptionPane.showMessageDialog(null, "Guardado Correctamente");
                limpiarUser();
            } else {
                JOptionPane.showMessageDialog(null, "No Se Logro Guardar");
                limpiarUser();
            }
        }

    }
    
    
    void limpiarUser(){
        RG.RegNombres.setText(null);
        RG.RegApellidos.setText(null);
        RG.RegCedula.setText(null);
        RG.RegTelefono.setText(null);
        RG.RegCorreo.setText(null);
        RG.RegPass.setText(null);
    }

    void limpiarGuardar() {
        AG.txtCodigo.setText(null);
        AG.txtNombre.setText(null);
        AG.CBTipo_Venta.setSelectedItem(null);
        AG.txtCantidad.setText(null);
        AG.txtValor.setText(null);
        AG.txtInformacion.setText(null);

    }
    
    void LimpiarModificarAG(){
        AG.txtName.setText(null);
        AG.txtCode.setText(null);
        AG.txtID.setText(null);
        AG.txtVenta.setText(null);
        AG.txtCant.setText(null);
        AG.txtPrecio.setText(null);
        AG.txtInforme.setText(null);
    }
    
    void LimpiarModificarVD(){
        VD.NOMBRE.setText(null);
        VD.CODE.setText(null);
        VD.CANTIDAD.setText(null);
        VD.TIPO_VALOR.setText(null);
        VD.VALOR.setText(null);
        VD.INFORME.setText(null);
        VD.VENTA.setText(null);
        VD.txtTotal.setText(null);
        VD.txtCambio.setText(null);
    }

}
