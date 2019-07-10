
package proyecto_daa;

import Modelo.Producto;
import Vistaa.Vista;
import Modelo.Consultas;
import Modelo.Optimizacion;
import Controlador.Controlador;
import java.util.ArrayList;

public class Proyecto_daa {


    public static void main(String[] args) {

        Producto pro = new Producto();
        Vista marco = new Vista();
        Consultas consulta = new Consultas();
        Optimizacion canasta = new Optimizacion();
        Controlador controlador = new Controlador(pro,consulta,marco,canasta);
        controlador.iniciar();
        marco.setVisible(true);

    }
    
}
