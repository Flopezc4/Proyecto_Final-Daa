
package Controlador;

import javax.swing.table.AbstractTableModel;
import Modelo.Optimizacion;
import Modelo.Producto;
import java.util.ArrayList;

public class tabla_2 extends AbstractTableModel{
    ArrayList<Producto> lista_2 = new ArrayList<>();
    
    public tabla_2(){
    }
     public void updatemodel() {
         //lista_2= list_optimizada();

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
        return 4;
    }

    @Override
    public int getColumnCount() {
       return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto pro = lista_2.get(rowIndex);
        switch(columnIndex){
            case 0: return pro.getCodigo();
            case 1: return pro.getProducto();
            default: return "";
        } 
    }

}
