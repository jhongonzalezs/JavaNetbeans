package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Consulta_De_Medicamentos extends Conexion {

    public boolean GuardarTB(Medicamentos Medi) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO medicamentos (Codigo, Nombre, Tipo_Venta, Cantidad, Valor, Informacion) VALUES (?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, Medi.getCodigo());
            ps.setString(2, Medi.getNombre());
            ps.setString(3, Medi.getTipo_Venta());
            ps.setInt(4, Medi.getCantidad());
            ps.setInt(5, Medi.getValor());
            ps.setString(6, Medi.getInformacion());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }

        }
    }
    
    
    public boolean GuardarUser(Usuarios User){
        PreparedStatement Ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO personal (Nombres, Apellidos, Cedula, celular, Correo, Contrasena) VALUES (?,?,?,?,?,?)";
        
        try {
            
            Ps = con.prepareStatement(sql);
            Ps.setString(1, User.getNombres());
            Ps.setString(2, User.getApellidos());
            Ps.setInt(3, User.getCedula());
            Ps.setString(4, User.getTelefono());
            Ps.setString(5, User.getCorreo());
            Ps.setString(6, User.getPass());
            Ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean ModificarTB(Medicamentos Medi) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE medicamentos SET Codigo=?, Nombre=?, Tipo_Venta=?, Cantidad=?, Valor=?, Informacion=? WHERE id=?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, Medi.getCodigo());
            ps.setString(2, Medi.getNombre());
            ps.setString(3, Medi.getTipo_Venta());
            ps.setInt(4, Medi.getCantidad());
            ps.setInt(5, Medi.getValor());
            ps.setString(6, Medi.getInformacion());
            ps.setInt(7, Medi.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }

    public boolean BorrarTB(Medicamentos Medi) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM medicamentos WHERE id=?";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, Medi.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean BuscarTB(Medicamentos Medi) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM medicamentos WHERE Codigo=?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, Medi.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                Medi.setId(Integer.parseInt(rs.getString("id")));
                Medi.setCodigo(rs.getString("Codigo"));
                Medi.setNombre(rs.getString("Nombre"));
                Medi.setTipo_Venta(rs.getString("Tipo_Venta"));
                Medi.setCantidad(Integer.parseInt(rs.getString("Cantidad")));
                Medi.setValor(Integer.parseInt(rs.getString("Valor")));
                Medi.setInformacion(rs.getString("Informacion"));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
