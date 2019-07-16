
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Modelo.Producto;
import Modelo.Consultas;
import Frames.vistanueva;
//import Frames.JDialog_productos;
//import Frames.JDialog_Modificar;
import Frames.JframeModificar;
import Frames.Jframeproductos;
import Modelo.Optimizacion;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controlador implements ActionListener{
    private ArrayList<Producto> lista_2 ;
    private Producto pro;
    private Consultas consultas;
    private TablaOptima tabla_optima;
    private vistanueva marco;
    private Table tabla_model;
    private Tabla_All tabla_All;
    private Tabla_Modificar tabla_modificar;
    public Optimizacion canasta;
    private Jframeproductos Jframe;
    private JframeModificar Jframe2;
    
    public Controlador (Producto pro,Consultas consultas , vistanueva marco,Optimizacion canasta, Jframeproductos Jframe,JframeModificar Jframe2){
        this.Jframe = Jframe;
        this.Jframe2=Jframe2;
        this.canasta = canasta;
        this.pro=pro;
        this.consultas=consultas;
        this.marco=marco;
        this.marco.btnAgregarProducto.addActionListener(this);
        this.marco.btnBuscar.addActionListener(this);
        this.marco.btnEliminarProducto.addActionListener(this);
        this.marco.btn_todo.addActionListener(this);
        this.marco.btn_modificar.addActionListener(this);
        this.Jframe2.jButton1.addActionListener(this);
        this.Jframe2.btn_buscar_3.addActionListener(this);
    }
    
    public void iniciar(){
        tabla_model=new Table(canasta);
        tabla_All= new Tabla_All();
        tabla_modificar = new Tabla_Modificar(); 
        tabla_optima=new TablaOptima(canasta);
        
        tabla_optima.updatemodel();
        tabla_model.updatemodel();
        tabla_All.updatemodel();
        tabla_modificar.updatemodel();
        
        marco.setTitle("Best Buy");
        marco.setLocationRelativeTo(null);
        
        marco.jTable4.setModel(tabla_optima);
        marco.jTable4.getTableHeader().setReorderingAllowed(false);
        
        marco.tablacompras.setModel(tabla_model);
        marco.tablacompras.getTableHeader().setReorderingAllowed(false);
        
        Jframe.jTable1_productosAll22.setModel(tabla_All);
        Jframe.jTable1_productosAll22.getTableHeader().setReorderingAllowed(false);
        Jframe.setLocationRelativeTo(marco);
      
        Jframe2.jTable1.setModel(tabla_modificar);
        Jframe2.jTable1.getTableHeader().setReorderingAllowed(false);
        Jframe2.setLocationRelativeTo(marco);
        
        marco.setResizable(true);
    }
    
    public void actualizarTabla(){
        tabla_model.updatemodel();
        tabla_model.fireTableDataChanged();

    }
    public void limpiar_2(){
        Jframe2.jtext_codigo.setText("");
        Jframe2.jtext_descri.setText("");
        Jframe2.jtext_lubba.setText("");
        Jframe2.jtext_caserita.setText("");
        Jframe2.jtext_mayorista.setText("");
        Jframe2.jtext_pacifico.setText("");
        
    }
    public void limpiar(){
        marco.JtextCodigoProducto.setText("");
        marco.JtextDescripcionProducto.setText("");
        marco.btnAgregarProducto.setEnabled(false);
        marco.btnEliminarProducto.setEnabled(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== marco.btnBuscar){
            pro = new Producto();
            try{
            pro.setCodigo(Integer.parseInt(marco.JtextCodigoProducto.getText()));
            
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(marco,"Error en la busqueda","ERROR", 0);
            }
            if(consultas.buscar(pro)){
                marco.JtextDescripcionProducto.setText(pro.getProducto());
               marco.btnAgregarProducto.setEnabled(true);
            marco.btnEliminarProducto.setEnabled(true);
            }
        }
        
        if(e.getSource()==marco.btnAgregarProducto){
            canasta.agregar(pro);
            actualizarTabla();
            System.out.println("producto Agregado a el carro");
            limpiar();
        }
        
        if(e.getSource()== marco.btnEliminarProducto){
            pro.setCodigo(Integer.parseInt(marco.JtextCodigoProducto.getText()));
            pro.setProducto(marco.JtextDescripcionProducto.getText());
            lista_2 = canasta.getLista();
            Iterator<Producto> itr = lista_2.iterator();
            while(itr.hasNext()){
                Producto pro2 =itr.next();
                if(pro.getCodigo()==pro2.getCodigo()){
                    itr.remove();
                    actualizarTabla();
                }
            }
            JOptionPane.showMessageDialog(marco,"Producto Eliminado");
            limpiar();
        }
        if(e.getSource()==marco.btn_todo){
            
            Jframe.setVisible(true);
        }
        if(e.getSource()== marco.btn_modificar){      

            Jframe2.setVisible(true);

        }
        if(e.getSource()== Jframe2.btn_buscar_3){
            pro = new Producto();
            try{
            pro.setCodigo(Integer.parseInt(Jframe2.jtext_codigo.getText()));
            
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(marco,"Error en la busqueda","ERROR", 0);
            }
            if(consultas.buscar(pro)){
                Jframe2.jtext_descri.setText(pro.getProducto());
                Jframe2.jtext_lubba.setText(Integer.toString(pro.getLubba()));
                Jframe2.jtext_caserita.setText(Integer.toString(pro.getCaserita()));
                Jframe2.jtext_mayorista.setText(Integer.toString(pro.getMayorista()));
                Jframe2.jtext_pacifico.setText(Integer.toString(pro.getPacifico()));
            }
            
        }
        if(e.getSource()== Jframe2.jButton1){
            pro.setProducto(Jframe2.jtext_descri.getText());
            pro.setLubba(Integer.parseInt(Jframe2.jtext_lubba.getText()));
            pro.setCaserita(Integer.parseInt(Jframe2.jtext_caserita.getText()));
            pro.setMayorista(Integer.parseInt(Jframe2.jtext_mayorista.getText()));
            pro.setPacifico(Integer.parseInt(Jframe2.jtext_pacifico.getText()));
            if(consultas.modificar(pro)){
                JOptionPane.showMessageDialog(Jframe2,"Producto modificado");
                tabla_modificar.updatemodel();
                tabla_modificar.fireTableDataChanged();
                limpiar_2();
            }
            
        }

    }
    
    
}
