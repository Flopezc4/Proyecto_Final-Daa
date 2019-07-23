
package Modelo;
import java.util.ArrayList;
import Modelo.Producto;
import java.util.Collections;
import java.util.Comparator;

public class Optimizacion {
    
    private ArrayList<Producto> Item;
    private ArrayList<Producto> ItemParaOrdenar;
    private ArrayList<productos2> Item2;
    private ArrayList<Producto> Mochila;
    private int pesoMaximo; // monto maximo a comprar

    public Optimizacion(){
     this.Item= new ArrayList<>();
     this.Item2=new ArrayList<>();
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
        //System.out.println("lista de item  "+Item);
    }
    public void agregar(Producto producto,int cantidad){
        
        Item2.add(new productos2(producto,cantidad));
       // System.out.println("lista con cantidad  "+Item2);
    }
    public ArrayList<productos2> getItem2() {
        return Item2;
    }

    public void setItem2(ArrayList<productos2> Item2) {
        this.Item2 = Item2;
    }
    
    public ArrayList<Producto> getLista(){
        return Item;
    }
    public int getPesoMochila(){
        //System.out.println("entro a contar");
        int pesoMochila=0;
        if(Mochila!=null){
            for(Producto x : Mochila){
                pesoMochila = pesoMochila+x.getPeso(); // valos que se compra 
                //System.out.println("entro a contar");
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
        ItemParaOrdenar = new ArrayList<>(Item);
        Comparator compador = new Comparator<Producto>() {
            @Override
            public int compare(Producto x, Producto y) {
                return (int) ((x.getValor() - x.getPeso()) - (y.getValor() - y.getPeso()));
            }
        };
        int pesoMochila = 0;
        System.out.println("antes de ordenar : "+ItemParaOrdenar);
        Collections.sort(ItemParaOrdenar, compador);
        System.out.println("despues de ordenar : "+ItemParaOrdenar);
        Collections.reverse(ItemParaOrdenar); 
        System.out.println("item de ordenados : " +ItemParaOrdenar);
        int posicion=0;       
        while (pesoMochila < pesoMaximo && posicion < ItemParaOrdenar.size()) {
            Producto producto = ItemParaOrdenar.get(posicion);
            if (pesoMochila + producto.getPeso() <= pesoMaximo) {
                Mochila.add(producto);
                pesoMochila +=  producto.getPeso();
            }
            posicion++;
        }
    }
}
