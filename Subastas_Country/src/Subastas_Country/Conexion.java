package Subastas_Country;

import com.mysql.jdbc.Connection;
import com.sun.corba.se.impl.activation.ServerMain;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    public static final String base = "datos";
    public static final String user = "root";
    public static final String password = "";
    public static final String url = "jdbc:mysql://localhost:3306/"+base;
    private Connection con = null;
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch (SQLException e) {
            System.err.println(e);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
