
package Controlador;

import javax.swing.table.AbstractTableModel;
import Modelo.Optimizacion;
import Modelo.Consultas;
import Modelo.Producto;
import java.util.ArrayList;

public class Tabla_Modificar extends AbstractTableModel{
    private ArrayList<Producto> lista_completa = new ArrayList<>();
    private Consultas consulta;
    
    public Tabla_Modificar(){
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
            case 2: return "Lubba";
            case 3: return "Caserita";
            case 4: return "Mayorista";
            case 5: return "Pacifico";
            default: return "";
        } 
    }
    
    @Override
    public int getRowCount() {
        return lista_completa.size();
    }

    @Override
    public int getColumnCount() {
       return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto pro = lista_completa.get(rowIndex);
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
