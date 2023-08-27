/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composite;


// Clase que representa a un Trabajador
class Trabajador implements Empleado {
    private String nombre;

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Trabajador: " + nombre);
    }
}
