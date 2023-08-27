/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;


// Decorador concreto: Agrega leche a la bebida
class Leche extends DecoradorBebida {
    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + ", Leche";
    }

    @Override
    public double obtenerCosto() {
        return super.obtenerCosto() + 0.5;
    }
}
