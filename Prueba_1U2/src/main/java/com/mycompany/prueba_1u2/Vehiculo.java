/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1u2;

/**
 *
 * @author VERONICA
 */
class Vehiculo {
    private String numPlaca;
    private String marca;
    private int numRuedas;
    private int estado;

    public Vehiculo(String numPlaca, String marca, int numRuedas, int estado) {
        this.numPlaca = numPlaca;
        this.marca = marca;
        this.numRuedas = numRuedas;
        this.estado = estado;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
        

    
    
    
    

