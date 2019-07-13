
package Modelo;

public class Producto implements Comparable<Producto>{

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", producto=" + producto + ", lubba=" + lubba + ", caserita=" + caserita + ", mayorista=" + mayorista + ", pacifico=" + pacifico + '}';
    }
    private int codigo;
    private String producto;
    private int lubba,caserita,mayorista,pacifico;

    public int getMayorista() {
        return mayorista;
    }

    public void setMayorista(int mayorista) {
        this.mayorista = mayorista;
    }
    
    public Producto(){
        super();
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
    
}
