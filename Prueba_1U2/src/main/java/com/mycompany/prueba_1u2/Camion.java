/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1u2;

/**
 *
 * @author VERONICA
 */
class Camion extends Vehiculo {
    private boolean parabrisasOn;
    private String color;
    private double carga;

    public Camion(String numPlaca, String marca, int numRuedas, int estado) {
        super(numPlaca, marca, numRuedas, estado);
        this.parabrisasOn = false;
        this.color = "";
        this.carga = 0.0;
    }

    public boolean isParabrisasOn() {
        return parabrisasOn;
    }

    public void onOffParabrisas() {
        if (this.parabrisasOn) {
            this.parabrisasOn = false;
            System.out.println("Se apagó el parabrisas.");
        } else {
            this.parabrisasOn = true;
            System.out.println("Parabrisas encendido.");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
}

    
    
    
    
    

