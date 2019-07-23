package Controlador;

import javax.swing.table.AbstractTableModel;
import Modelo.Optimizacion;
import Modelo.Producto;
import Modelo.productos2;
import java.util.ArrayList;

public class Table extends AbstractTableModel {

    private ArrayList<Producto> list = new ArrayList<>();
    private ArrayList<productos2> list2 = new ArrayList<>();
    private Optimizacion canasta;
    private productos2 nuevo;

    public Table(Optimizacion canasta) {
        this.canasta = canasta;
    }

    public void updatemodel() {

        list2 = canasta.getItem2();
        //System.out.println(canasta.getLista());
        
        /* System.out.println(list);
       for (Producto i : list) {
            for (productos2 p : list2) {
                if (i.getCodigo() == p.getProducto().getCodigo()) {
                    p.setCantidad(p.getCantidad() + 1);
                }
            }// falta terminar acaaaaaa
            nuevo = new productos2(i, 1);
            //System.out.println(nuevo);
            list2.add(nuevo);
            System.out.println(list2);
        }*/
    }

    @Override
    public String getColumnName(int column
    ) {
        switch (column) {
            case 0:
                return "Código";
            case 1:
                return "Descripción";
            case 2:
                return "Cantidad";
            default:
                return "";
        }
    }

    @Override
    public int getRowCount() {
        return list2.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex
    ) {
        productos2 pro = list2.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pro.getProducto().getCodigo();
            case 1:
                return pro.getProducto().getProducto();
            case 2:
                return pro.getCantidad();
            default:
                return "";
        }
    }

}
