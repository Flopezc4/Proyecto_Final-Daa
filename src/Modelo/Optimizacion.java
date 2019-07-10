
package Modelo;
import java.util.ArrayList;
import Modelo.Producto;

public class Optimizacion {
    
    ArrayList<Producto> canasta;
    public Optimizacion(){
        canasta= new ArrayList<>();
    }
    public void agregar(Producto pro){
        canasta.add(pro);
        System.out.println(canasta);
    }
    public ArrayList<Producto> getLista(){
        return canasta;
    }
}
