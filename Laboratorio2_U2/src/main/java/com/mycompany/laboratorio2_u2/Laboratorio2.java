/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio2_u2;

import java.util.List;

class Laboratorio2 extends Laboratorio {
    private String lugar;

    public Laboratorio2(String nombre, int capacidad, List<String> equipos, String responsable, String lugar) {
        super(nombre, capacidad, equipos, responsable);
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Lugar: " + lugar);
    }
}
