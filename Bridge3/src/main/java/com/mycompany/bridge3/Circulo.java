/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge3;


class Circulo extends Forma {
    private int x, y, radio;

    public Circulo(Dibujo dibujo, int x, int y, int radio) {
        super(dibujo);
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    @Override
    void dibujar() {
        dibujo.dibujarCirculo(x, y, radio);
    }
}