
package Controlador;

import javax.swing.table.AbstractTableModel;
import Modelo.Optimizacion;
import Modelo.Producto;
import java.util.ArrayList;

public class Table extends AbstractTableModel{
    private ArrayList<Producto> list = new ArrayList<>();
    private Optimizacion canasta;
    
    public Table(Optimizacion canasta){
        this.canasta=canasta;
    }
     public void updatemodel() {
       list = canasta.getLista();

    }
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "Código";
            case 1: return "Descripción";
            default: return "";
        } 
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
       return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto pro = list.get(rowIndex);
        switch(columnIndex){
            case 0: return pro.getCodigo();
            case 1: return pro.getProducto();
            default: return "";
        } 
    }
     

}
