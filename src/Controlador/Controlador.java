
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Modelo.Producto;
import Modelo.Consultas;
import Vistaa.Vista;
import Modelo.Optimizacion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controlador implements ActionListener{
    //private ArrayList<Producto> lista_2 = new ArrayList<>();
    private Producto pro;
    private Consultas consultas;
    private Vista marco;
    private Table tabla_model;
    public Optimizacion canasta;
    public Controlador (Producto pro,Consultas consultas , Vista marco,Optimizacion canasta){
        this.canasta = canasta;
        this.pro=pro;
        this.consultas=consultas;
        this.marco=marco;
        this.marco.btnAgregarProducto.addActionListener(this);
        this.marco.btnBuscar.addActionListener(this);
        this.marco.btnEliminarProducto.addActionListener(this);
    }
    
    public void iniciar(){

        tabla_model=new Table(canasta);
        tabla_model.updatemodel();
        marco.setTitle("Best Buy");
        marco.setLocationRelativeTo(null);
        marco.tablacompras.setModel(tabla_model);
        marco.tablacompras.getTableHeader().setReorderingAllowed(false);
        marco.setResizable(true);
    }
    
    public void actualizarTabla(){
        tabla_model.updatemodel();
        tabla_model.fireTableDataChanged();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== marco.btnBuscar){
            pro = new Producto();
            try{
            pro.setCodigo(Integer.parseInt(marco.JtextCodigoProducto.getText()));
            }catch(NumberFormatException ex){
                System.out.println("intente denuevo");
            }
            if(consultas.buscar(pro)){
               System.out.println("producto encontrado");
            }
        }
        if(e.getSource()==marco.btnAgregarProducto){
            canasta.agregar(pro);
            actualizarTabla();
            System.out.println("producto Agregado a el carro");
        }
        /*
        if(e.getSource()== marco.boton_eliminar){
        
        
            eliminar producto de la tabla de compras(carro de compras)
        }
*/
    }
    
    
}
