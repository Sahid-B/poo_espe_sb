/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.otropractica;

/**
 *
 * @author VERONICA
 */

class Rectangulo {
    private double largo;
    private double ancho;
    
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public double calcularArea() {
        return largo * ancho;
    }
    
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}
