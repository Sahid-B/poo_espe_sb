/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composite;

import java.util.ArrayList;
import java.util.List;

// Clase que representa a un Gerente
class Gerente implements Empleado {
    private String nombre;
    private List<Empleado> subordinados = new ArrayList<>();

    public Gerente(String nombre) {
        this.nombre = nombre;
    }

    public void agregarSubordinado(Empleado empleado) {
        subordinados.add(empleado);
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Gerente: " + nombre);
        System.out.println("Subordinados:");
        for (Empleado subordinado : subordinados) {
            subordinado.mostrarDetalles();
        }
    }
}
