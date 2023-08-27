/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge3;


// Abstracción
abstract class Forma {
    protected Dibujo dibujo;

    public Forma(Dibujo dibujo) {
        this.dibujo = dibujo;
    }

    abstract void dibujar();
}