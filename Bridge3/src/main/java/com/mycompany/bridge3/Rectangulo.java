/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge3;


class Rectangulo extends Forma {
    private int x1, y1, x2, y2;

    public Rectangulo(Dibujo dibujo, int x1, int y1, int x2, int y2) {
        super(dibujo);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    void dibujar() {
        dibujo.dibujarRectangulo(x1, y1, x2, y2);
    }
}