package Controlador;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import Modelo.Producto;
import Modelo.Optimizacion;

public class TablaOptima extends AbstractTableModel {

    public ArrayList<Producto> productos;
    private Optimizacion canasta;

    public TablaOptima(Optimizacion canasta) {
        this.canasta = canasta;
    }

    public void updatemodel() {
        productos = canasta.getMochila();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Código";
            case 1:
                return "Descripción";
            case 2:
                return "Proveedor";
            case 3:
                return "Precio";
            default:
                return "";
        }
    }

    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto pro = productos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pro.getCodigo();
            case 1:
                return pro.getProducto();
            case 2:
                return pro.getProveedor();
            case 3:
                return pesoMinimo(pro);
            default:
                return "";
        }
    }

    public int pesoMinimo(Producto x) {
        int pesoMin = x.getLubba();
        if (pesoMin > x.getCaserita()) {
            pesoMin = x.getCaserita();
        } else if (pesoMin > x.getMayorista()) {
            pesoMin = x.getMayorista();
        } else if (pesoMin > x.getPacifico()) {
            pesoMin = x.getPacifico();
        }
        return pesoMin;
    }

}
