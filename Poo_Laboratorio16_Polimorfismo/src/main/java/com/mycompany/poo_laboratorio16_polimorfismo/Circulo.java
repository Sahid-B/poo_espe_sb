
package com.mycompany.poo_laboratorio16_polimorfismo;

/**
 *
 * @author ESPE
 */
public class Circulo extends Figura {
    
    private int radio;

    public Circulo(String color, int radio) {
        super(color);
        this.radio=radio;
    }

    @Override
    public double suprtficie() {
       return Math.PI*radio*radio;
      
}}
