
package com.mycompany.poo_laboratorio16_polimorfismo;

/**
 *
 * @author ESPE
 */
public abstract class  Figura {

private String color;

    public Figura(String color) {
        super();
        this.color = color;
    }
public abstract  double suprtficie();

public String getColor(){
return color;
}

public String setColor(){
    return color;
    
    
}   
}
