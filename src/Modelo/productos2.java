
package Modelo;


public class productos2{
   
    public int cantidad;
    public Producto producto;
    
    public productos2(Producto producto,int cantidad){
        this.producto=producto;
        this.cantidad=cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int Cantidad) {
        this.cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "productos2{" + "cantidad=" + cantidad + ", producto=" + producto + '}';
    }
    
}
