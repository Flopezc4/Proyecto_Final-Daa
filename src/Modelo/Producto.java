
package Modelo;

public class Producto implements Comparable<Producto>{


    private int codigo;
    private String producto;
    private int lubba,caserita,mayorista,pacifico;
    private int valor;
    private int peso;
    private String proveedor;
        
    public Producto(){
        super();
    }
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getMayorista() {
        return mayorista;
    }

    public void setMayorista(int mayorista) {
        this.mayorista = mayorista;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getLubba() {
        return lubba;
    }

    public void setLubba(int lubba) {
        this.lubba = lubba;
    }

    public int getCaserita() {
        return caserita;
    }

    public void setCaserita(int caserita) {
        this.caserita = caserita;
    }

    public int getPacifico() {
        return pacifico;
    }

    public void setPacifico(int pacifico) {
        this.pacifico = pacifico;
    }

    @Override
    public int compareTo(Producto p) {
        return this.producto.compareTo(p.producto);
    }
        @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", producto=" + producto + ", lubba=" + lubba + ", caserita=" + caserita + ", mayorista=" + mayorista + ", pacifico=" + pacifico + '}';
    }
}
