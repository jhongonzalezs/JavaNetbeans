package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Consultas_Productos extends Conexion {

    public boolean registrar(Producto Pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO producto (codigo, nombre, precio, cantidad) VALUES (?, ?, ?, ?)";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, Pro.getCodigo());
            ps.setString(2, Pro.getNombre());
            ps.setDouble(3, Pro.getPrecio());
            ps.setInt(4, Pro.getCantidad());
            ps.execute();
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
    
    
    public boolean modificar(Producto Pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE producto SET codigo=?, nombre=?, precio=?, cantidad=? WHERE id=?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, Pro.getCodigo());
            ps.setString(2, Pro.getNombre());
            ps.setDouble(3, Pro.getPrecio());
            ps.setInt(4, Pro.getCantidad());
            ps.setInt(5, Pro.getId());
            ps.execute();
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
    
    public boolean eliminar(Producto Pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM producto WHERE id=?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, Pro.getId());
            ps.execute();
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
    
    public boolean buscar(Producto Pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM producto WHERE codigo=?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, Pro.getCodigo());
            rs = ps.executeQuery();
            
            if(rs.next()){
                Pro.setId(Integer.parseInt(rs.getString("id")));
                Pro.setCodigo(rs.getString("codigo"));
                Pro.setNombre(rs.getString("nombre"));
                Pro.setPrecio(Double.parseDouble( rs.getString("precio")));
                Pro.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                return true;
            }            
            return false;
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

}
