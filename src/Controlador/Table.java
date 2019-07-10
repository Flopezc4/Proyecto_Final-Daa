
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
            case 0: return "Codigo";
            case 1: return "Producto";
            case 2: return "Lubba";
            case 3: return "Cacerita";
            case 4: return "Mayorista";
            case 5: return "Pacific";
            default: return "";
        } 
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
       return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto pro = list.get(rowIndex);
        switch(columnIndex){
            case 0: return pro.getCodigo();
            case 1: return pro.getProducto();
            case 2: return pro.getLubba();
            case 3: return pro.getCaserita();
            case 4: return pro.getMayorista();
            case 5: return pro.getPacifico();
            default: return "";
        } 
    }

}
