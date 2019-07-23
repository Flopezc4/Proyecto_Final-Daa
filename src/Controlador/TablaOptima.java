package Controlador;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import Modelo.Producto;
import Modelo.productos2;
import Modelo.Optimizacion;
import java.util.Iterator;

public class TablaOptima extends AbstractTableModel {

    public ArrayList<Producto> productos;
    public ArrayList<productos2> cantidades;
    public Producto pro;
    private Optimizacion canasta;

    public TablaOptima(Optimizacion canasta) {
        this.canasta = canasta;
    }

    public void updatemodel() {
        productos = canasta.getMochila();
        cantidades = new ArrayList<>();
        //System.out.println("productos de mochila " + productos);
        Iterator<Producto> iter = productos.iterator();
        while (iter.hasNext()) {
            pro = iter.next();          
            if (cantidades.isEmpty()) {
                cantidades.add(new productos2(pro, 1));
            } else {
                if(estaElProducto(pro)){
                    for(productos2 i : cantidades){
                        if(i.getProducto().getCodigo()==pro.getCodigo()){
                            i.setCantidad(i.getCantidad()+1);
                        }
                    }
                }else{
                    cantidades.add(new productos2(pro, 1));
                }
            }

        }

    }
    public boolean estaElProducto(Producto pro){
        Iterator <productos2> iter2 = cantidades.iterator();
        while(iter2.hasNext()){
            productos2 x = iter2.next();
            if(x.getProducto().getCodigo()==pro.getCodigo()){
                return true;
            }
        }
        return false;
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
            case 4:
              return "Cantidad";
            default:
                return "";
        }
    }

    @Override
    public int getRowCount() {
        return cantidades.size();
        //return productos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
        //return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Producto pro = productos.get(rowIndex);
        productos2 pro = cantidades.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pro.getProducto().getCodigo();
            case 1:
                return pro.getProducto().getProducto();
            case 2:
                return pro.getProducto().getProveedor();
            case 3:
                return pro.getProducto().getPeso();
            case 4:
              return pro.getCantidad();
            default:
                return "";
        }
    }

}
