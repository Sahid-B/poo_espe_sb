/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba2origianl;

/**
 *
 * @author VERONICA
 */
public class Quad extends Vehiculo {
    private boolean es4x4;

    public Quad(String marca, String modelo, int año, boolean es4x4) {
        super(marca, modelo, año);
        this.es4x4 = es4x4;
    }

    public boolean es4x4() {
        return es4x4;
    }
}
