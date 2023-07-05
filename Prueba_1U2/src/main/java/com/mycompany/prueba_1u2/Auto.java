/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1u2;

/**
 *
 * @author VERONICA
 */
class Auto extends Vehiculo {
    private String transmision;
    private boolean parabrisasOn;
    private int multa;

    public Auto(String numPlaca, String marca, int numRuedas, int estado) {
        super(numPlaca, marca, numRuedas, estado);
        this.transmision = "";
        this.parabrisasOn = false;
        this.multa = 0;
    }

    public boolean isParabrisasOn() {
        return parabrisasOn;
    }

    public void encenderParabrisas() {
        if (this.parabrisasOn) {
            this.parabrisasOn = false;
            System.out.println("Se apagó el parabrisas.");
        } else {
            this.parabrisasOn = true;
            System.out.println("Parabrisas encendido.");
        }
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public void addMulta() {
        this.multa++;
    }

    public int getMulta() {
        return multa;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
}
