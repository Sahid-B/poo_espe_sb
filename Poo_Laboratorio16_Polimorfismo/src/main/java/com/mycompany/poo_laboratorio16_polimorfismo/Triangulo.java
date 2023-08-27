
package com.mycompany.poo_laboratorio16_polimorfismo;

/**
 *
 * @author ESPE
 */
public class Triangulo extends Figura {
    private int base;
    private int altura;

    public Triangulo(String color, int base,int alura ) {
        super(color);
        this.altura=alura;
        this.base=base;   
    }
    @Override
    public double suprtficie() {
        
      return base*altura; 
      
    }  
}
