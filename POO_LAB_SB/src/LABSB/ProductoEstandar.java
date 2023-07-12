package LABSB;
//Hereda de la clase producto
public class ProductoEstandar extends Producto {
    private String seccion;
//Constructor 
    public ProductoEstandar(String nombre, double precio, String seccion) {
        super(nombre, precio);
        this.seccion = seccion;
    }
  //Metodo getter y setter 
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
//sobre escribir la clase anterior 
    @Override
    public double obtenerPrecioPedido(int unidades) {
        double precioFinal = super.obtenerPrecioPedido(unidades);
        if (unidades >= 5) {
            precioFinal *= 0.9; 
        }
        return precioFinal;
    }
}	




