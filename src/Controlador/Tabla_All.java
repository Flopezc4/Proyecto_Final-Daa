
package Controlador;

import javax.swing.table.AbstractTableModel;
import Modelo.Optimizacion;
import Modelo.Consultas;
import Modelo.Producto;
import java.util.ArrayList;

public class Tabla_All extends AbstractTableModel{
    private ArrayList<Producto> lista_completa = new ArrayList<>();
    private Consultas consulta;
    
    public Tabla_All(){
        consulta = new Consultas();
    }
     public void updatemodel() {
         lista_completa= consulta.getAll();

    }
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "Codigo";
            case 1: return "Descripcion";
            default: return "";
        } 
    }
    
    @Override
    public int getRowCount() {
        return lista_completa.size();
    }

    @Override
    public int getColumnCount() {
       return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto pro = lista_completa.get(rowIndex);
        switch(columnIndex){
            case 0: return pro.getCodigo();
            case 1: return pro.getProducto();
            default: return "";
        } 
    }

}
