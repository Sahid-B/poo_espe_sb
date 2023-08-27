/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculo_figurass;

/**
 *
 * @author VERONICA
 */
//para calcular el pentagono
class Pentagono extends Figura {
    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double calcularArea() {
        return 5 * lado * apotema / 2;
    }

    public double calcularPerimetro() {
        return 5 * lado;
    }
}