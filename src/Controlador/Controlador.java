package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Modelo.Producto;
import Modelo.Consultas;
import Frames.vistanueva;
import Frames.JframeModificar;
import Frames.Jframeproductos;
import Modelo.Optimizacion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controlador extends MouseAdapter implements ActionListener {

    private ArrayList<Producto> lista_2;
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

    public Controlador(Producto pro, Consultas consultas, vistanueva marco, Optimizacion canasta, Jframeproductos Jframe, JframeModificar Jframe2) {
        this.Jframe = Jframe;
        this.Jframe2 = Jframe2;
        this.canasta = canasta;
        this.pro = pro;
        this.consultas = consultas;
        this.marco = marco;
        this.marco.btnAgregarProducto.addActionListener(this);
        this.marco.btnBuscar.addActionListener(this);
        this.marco.btnEliminarProducto.addActionListener(this);
        this.marco.btn_todo.addActionListener(this);
        this.marco.btn_modificar.addActionListener(this);
        this.marco.btnOptimizar.addActionListener(this);
        this.Jframe2.jButton1.addActionListener(this);
        this.Jframe2.btn_buscar_3.addActionListener(this);
        this.Jframe2.jButton2.addActionListener(this);
        this.marco.tablacompras.addMouseListener(this);
        this.Jframe2.jTable1.addMouseListener(this);
    }

    public void iniciar() {
        tabla_model = new Table(canasta);
        tabla_All = new Tabla_All();
        tabla_modificar = new Tabla_Modificar();
        tabla_optima = new TablaOptima(canasta);

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

    public void actualizarTabla() {
        tabla_model.updatemodel();
        tabla_model.fireTableDataChanged();

    }

    public void actualizarTabla2() {
        tabla_optima.updatemodel();
        tabla_optima.fireTableDataChanged();
    }

    public void limpiar_2() {
        Jframe2.jtext_codigo.setText("");
        Jframe2.jtext_descri.setText("");
        Jframe2.jtext_lubba.setText("");
        Jframe2.jtext_caserita.setText("");
        Jframe2.jtext_mayorista.setText("");
        Jframe2.jtext_pacifico.setText("");
        Jframe2.jtext_caserita.setEditable(false);
        Jframe2.jtext_lubba.setEditable(false);
        Jframe2.jtext_mayorista.setEditable(false);
        Jframe2.jtext_pacifico.setEditable(false);
        Jframe2.jtext_descri.setEditable(false);

    }

    public void limpiar() {
        marco.JtextCodigoProducto.setText("");
        marco.JtextDescripcionProducto.setText("");
        marco.JtextCantidaddeproducto.setText("");
        marco.btnAgregarProducto.setEnabled(false);
        marco.btnEliminarProducto.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == marco.btnBuscar) {
            pro = new Producto();
            try {
                pro.setCodigo(Integer.parseInt(marco.JtextCodigoProducto.getText()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(marco, "Error en la busqueda", "ERROR", 0);
            }
            if (consultas.buscar(pro)) {
                marco.JtextDescripcionProducto.setText(pro.getProducto());
                marco.btnAgregarProducto.setEnabled(true);
                marco.btnEliminarProducto.setEnabled(true);
            }
        }

        if (e.getSource() == marco.btnAgregarProducto) {
            try{
            int k =Integer.parseInt(marco.JtextCantidaddeproducto.getText());
            canasta.agregar(pro, k);
            for(int i=1;i<=k;i++){
                canasta.agregar(pro);
            }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(marco, "Error Ingresar Cantidad Valida", "ERROR", 0);
            }
            actualizarTabla();
            limpiar();
        }

        if (e.getSource() == marco.btnEliminarProducto) {
            pro.setCodigo(Integer.parseInt(marco.JtextCodigoProducto.getText()));
            pro.setProducto(marco.JtextDescripcionProducto.getText());
            lista_2 = canasta.getLista();
            Iterator<Producto> itr = lista_2.iterator();
            while (itr.hasNext()) {
                Producto pro2 = itr.next();
                if (pro.getCodigo() == pro2.getCodigo()) {
                    itr.remove();
                    actualizarTabla();
                }
            }
            JOptionPane.showMessageDialog(marco, "Producto Eliminado");
            limpiar();
        }
        if (e.getSource() == marco.btn_todo) {

            Jframe.setVisible(true);
        }
        if (e.getSource() == marco.btn_modificar) {

            Jframe2.setVisible(true);

        }
        if (e.getSource() == Jframe2.btn_buscar_3) {
            pro = new Producto();
            try {
                pro.setCodigo(Integer.parseInt(Jframe2.jtext_codigo.getText()));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(marco, "Error en la busqueda", "ERROR", 0);
            }
            if (consultas.buscar(pro)) {
                Jframe2.jtext_descri.setText(pro.getProducto());
                Jframe2.jtext_lubba.setText(Integer.toString(pro.getLubba()));
                Jframe2.jtext_caserita.setText(Integer.toString(pro.getCaserita()));
                Jframe2.jtext_mayorista.setText(Integer.toString(pro.getMayorista()));
                Jframe2.jtext_pacifico.setText(Integer.toString(pro.getPacifico()));
                Jframe2.jButton2.setEnabled(true);
            }

        }
        if (e.getSource() == Jframe2.jButton1) {
            pro.setProducto(Jframe2.jtext_descri.getText());
            pro.setLubba(Integer.parseInt(Jframe2.jtext_lubba.getText()));
            pro.setCaserita(Integer.parseInt(Jframe2.jtext_caserita.getText()));
            pro.setMayorista(Integer.parseInt(Jframe2.jtext_mayorista.getText()));
            pro.setPacifico(Integer.parseInt(Jframe2.jtext_pacifico.getText()));
            if (consultas.modificar(pro)) {
                JOptionPane.showMessageDialog(Jframe2, "Producto modificado");
                tabla_modificar.updatemodel();
                tabla_modificar.fireTableDataChanged();
                limpiar_2();
            }

        }
        if (e.getSource() == Jframe2.jButton2) {
            Jframe2.jtext_caserita.setEditable(true);
            Jframe2.jtext_lubba.setEditable(true);
            Jframe2.jtext_mayorista.setEditable(true);
            Jframe2.jtext_pacifico.setEditable(true);
            Jframe2.jtext_descri.setEditable(true);
            Jframe2.jButton1.setEnabled(true);
        }
        if (e.getSource() == marco.btnOptimizar) {
            
            try{
            canasta.setPesoMaximo(Integer.parseInt(marco.valor_maximo.getText()));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(marco, "Ingrese Monto Mínimo por favor","Error",0);
            }
            canasta.Kanask();
            marco.jTextField1.setText(Integer.toString(canasta.getValorMochila()-canasta.getPesoMochila()));
            marco.jTextField2.setText(Integer.toString(canasta.getPesoMochila()));
            actualizarTabla2();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == marco.tablacompras) {
            int fila = marco.tablacompras.rowAtPoint(e.getPoint());
            marco.JtextCodigoProducto.setText(marco.tablacompras.getValueAt(fila, 0).toString());
            marco.JtextDescripcionProducto.setText(marco.tablacompras.getValueAt(fila, 1).toString());
            marco.btnEliminarProducto.setEnabled(true);
        }
        if (e.getSource() == Jframe2.jTable1) {
            int fila = Jframe2.jTable1.rowAtPoint(e.getPoint());
            Jframe2.jtext_codigo.setText(Jframe2.jTable1.getValueAt(fila, 0).toString());
            Jframe2.jtext_descri.setText(Jframe2.jTable1.getValueAt(fila, 1).toString());
            Jframe2.jtext_lubba.setText(Jframe2.jTable1.getValueAt(fila, 2).toString());
            Jframe2.jtext_caserita.setText(Jframe2.jTable1.getValueAt(fila, 3).toString());
            Jframe2.jtext_mayorista.setText(Jframe2.jTable1.getValueAt(fila, 4).toString());
            Jframe2.jtext_pacifico.setText(Jframe2.jTable1.getValueAt(fila, 5).toString());
            Jframe2.jButton2.setEnabled(true);
        }
    }

}
