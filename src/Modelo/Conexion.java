
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
        
    private Connection conexion = null;
    private final String jbdc = "jdbc:mysql://localhost:3306/proyecto_productos";   //proyecto_productos     //proyecto
    private final String usuario = "root";
    private final String clave = "-voodoo18";                                       //-voodoo18    //root1234
    
    public Connection getConexion(){
        try{
            conexion = DriverManager.getConnection(jbdc, usuario,clave);
            
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "problemas de conexion con la base de datos ");
           e.printStackTrace();
         return null;
        }
        return conexion;
    }
}
    
