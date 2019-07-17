
package Modelo;
import java.util.ArrayList;
import Modelo.Producto;
import java.util.Collections;
import java.util.Comparator;

public class Optimizacion {
    
    private ArrayList<Producto> Item;
    private ArrayList<Producto> Mochila ;
    private int pesoMaximo; // monto maximo a comprar

    public Optimizacion(){
     this.Item= new ArrayList<>();
     this.Mochila=new ArrayList<>();
     this.pesoMaximo=0;
    }
   
    public ArrayList<Producto> getMochila() {
        return Mochila;
    }
    public void setMochila(ArrayList<Producto> Mochila) {
        this.Mochila = Mochila;
    }
    public int getPesoMaximo() {
        return pesoMaximo;
    }
    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    public void agregar(Producto pro){
        Item.add(pro);
        System.out.println(Item);
    }
    public ArrayList<Producto> getLista(){
        return Item;
    }
    public int getPesoMochila(){
        int pesoMochila=0;
        if(Mochila!=null){
            for(Producto x : Mochila){
                pesoMochila = pesoMochila+x.getPeso(); // valos que se compra 
            }
        }
        return pesoMochila;
    }
    public int getValorMochila(){
        int valorMochila=0;
        if(Mochila!=null){
            for(Producto x : Mochila){
                valorMochila = valorMochila+x.getValor(); // valor que se vende 
            }
        }
        return valorMochila;
    }
    
    public void Kanask(){
        Mochila = new ArrayList<>();
        Comparator compador = new Comparator<Producto>() {
            @Override
            public int compare(Producto x, Producto y) {
                return (int) (x.getValor() / x.getPeso() - y.getValor() / y.getPeso());
            }
        };
        
        int pesoMochila = 0;
        Collections.sort(Item, compador);
        Collections.reverse(Item);  
        int posicion=0;
        
        while (pesoMochila < pesoMaximo && posicion < Item.size()) {
            Producto producto = Item.get(posicion);
            if (pesoMochila + producto.getPeso() <= pesoMaximo) {
                Mochila.add(producto);
                pesoMochila +=  producto.getPeso();
            }
            posicion++;
        }
    }
}
