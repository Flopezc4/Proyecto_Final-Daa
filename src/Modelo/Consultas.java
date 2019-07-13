package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null, "Codigo no encontrado");
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
    public boolean modificar(Producto p){
        PreparedStatement ps;
        ResultSet rs;
        Connection conexion = getConexion();
        String consulta = "UPDATE productos SET producto=?,lubba=?,caserita=?,mayorista=?,pacifico=? WHERE Codigo=?";
        try{
            ps = conexion.prepareStatement(consulta);
            ps.setString(1, p.getProducto());
            ps.setInt(2, p.getLubba());
            ps.setInt(3,p.getCaserita());
            ps.setInt(4,p.getMayorista());
            ps.setInt(5,p.getPacifico());
            ps.setInt(6,p.getCodigo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    public ArrayList<Producto> getAll() {
        list_pro = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection conexion = getConexion();
        String consulta = "SELECT * FROM productos";
        try {
            ps = conexion.prepareStatement(consulta);
            rs = ps.executeQuery();
            while(rs.next()) {
                Producto p = new Producto();
                p.setProducto(rs.getString("producto"));
                p.setCodigo(Integer.parseInt(rs.getString("Codigo")));
                p.setLubba(Integer.parseInt(rs.getString("lubba"))); //Luba 
                p.setCaserita(Integer.parseInt(rs.getString("caserita")));//caserita
                p.setMayorista(Integer.parseInt(rs.getString("mayorista")));//mayorista
                p.setPacifico(Integer.parseInt(rs.getString("pacifico")));//pacifco
                list_pro.add(p);
            }
            return list_pro;
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
        return null;
    }
}
