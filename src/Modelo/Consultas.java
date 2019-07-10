package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Consultas extends Conexion {
   
    public ArrayList<Producto> list_pro;
    
    public boolean buscar(Producto p) {
        PreparedStatement ps;
        ResultSet rs;
        Connection conexion = getConexion();
        String consulta = "SELECT * FROM productos WHERE Codigo=?";

        try {
            ps = conexion.prepareStatement(consulta);
            ps.setInt(1, p.getCodigo());
            rs = ps.executeQuery();
            if (rs.next()) {
                p.setProducto(rs.getString("producto"));
                p.setLubba(Integer.parseInt(rs.getString("lubba"))); //Luba 
                p.setCaserita(Integer.parseInt(rs.getString("caserita")));//caserita
                p.setMayorista(Integer.parseInt(rs.getString("mayorista")));//mayorista
                p.setPacifico(Integer.parseInt(rs.getString("pacifico")));//pacifc

                return true;
            }
            return false;
        } catch (SQLException ex) {
            System.out.println("error ");
            ex.printStackTrace();
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return false;
    }
}
