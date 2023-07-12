package LABSB;
//Hereda de la clase producto
public class ProductoOfertado extends Producto {
    private int dias;
//Constructor
    public ProductoOfertado(String nombre, double precio, int dias) {
        super(nombre, precio);
        this.dias = dias;
    }
//metodos getters y setters
    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
//sobreescribimos la clase 
    @Override
    public double obtenerPrecioPedido(int unidades) {
        double precioFinal = super.obtenerPrecioPedido(unidades);
        if (dias == 1) {
            precioFinal *= 0.8; // oferta 20%
        } else if (dias == 2 || dias == 3) {
            precioFinal *= 0.85; // oferta 15%
        } else if (dias > 3) {
            precioFinal *= 0.9; // oferta del 10%
        }
        return precioFinal;
    }
}
