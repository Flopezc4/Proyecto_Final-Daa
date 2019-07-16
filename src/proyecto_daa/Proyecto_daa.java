
package proyecto_daa;

import Modelo.Producto;
import Frames.Vista;
import Frames.vistanueva;
//import Frames.JDialog_productos;
//import Frames.JDialog_Modificar;
import Modelo.Consultas;
import Modelo.Optimizacion;
import Controlador.Controlador;
import Frames.JframeModificar;
import Frames.Jframeproductos;

public class Proyecto_daa {


    public static void main(String[] args) {

        Producto pro = new Producto();
        //Vista marco = new Vista();
         vistanueva marco = new vistanueva();
        
        //JDialog_productos dialog = new JDialog_productos(marco, true);
        //JDialog_Modificar dialog_2 = new JDialog_Modificar(marco, true);
        Jframeproductos Jframe = new Jframeproductos(marco, true);
        JframeModificar Jframe2= new JframeModificar(marco,true);
        Consultas consulta = new Consultas();
        Optimizacion canasta = new Optimizacion();
        Controlador controlador = new Controlador(pro,consulta,marco,canasta,Jframe,Jframe2);
        controlador.iniciar();
        marco.setVisible(true);

    }
    
}
