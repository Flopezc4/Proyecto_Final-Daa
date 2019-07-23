
package proyecto_daa;

import Modelo.Producto;
import Frames.vistanueva;
import Modelo.Consultas;
import Modelo.Optimizacion;
import Controlador.Controlador;
import Frames.JframeModificar;
import Frames.Jframeproductos;
import Frames.login;

public class Proyecto_daa {


    public static void main(String[] args) {

        
        Producto pro = new Producto();
         vistanueva marco = new vistanueva();
        Jframeproductos Jframe = new Jframeproductos(marco, true);
        JframeModificar Jframe2= new JframeModificar(marco,true);
        Consultas consulta = new Consultas();
        Optimizacion canasta = new Optimizacion();
        Controlador controlador = new Controlador(pro,consulta,marco,canasta,Jframe,Jframe2);
        controlador.iniciar();
        marco.setVisible(true);

    }
}
