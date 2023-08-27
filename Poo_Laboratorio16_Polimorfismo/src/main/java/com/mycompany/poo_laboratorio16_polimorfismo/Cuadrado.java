package com.mycompany.poo_laboratorio16_polimorfismo;

/**
 *
 * @author ESPE
 */
public abstract class Cuadrado extends Figura {
    private int lado;
    
    public Cuadrado(String color, int lado) {
        super(color);
        this.lado=lado;
    }

    @Override
    public double suprtficie() {
        return lado*lado;
    }

    
}
