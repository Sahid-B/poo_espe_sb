/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio2_u2;

import java.util.List;

class Laboratorio1 extends Laboratorio {
    private String espacio;

    public Laboratorio1(String nombre, int capacidad, List<String> equipos, String responsable, String espacio) {
        super(nombre, capacidad, equipos, responsable);
        this.espacio = espacio;
    }

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Espacio: " + espacio);
    }
}