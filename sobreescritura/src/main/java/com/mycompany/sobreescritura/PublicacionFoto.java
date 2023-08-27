/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobreescritura;

/**
 *
 * @author VERONICA
 */
class PublicacionFoto extends Publicacion {
    private String descripcion;
    private String ubicacion;

    public PublicacionFoto(String contenido, String descripcion, String ubicacion) {
        super(contenido);
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }

    @Override
    public void mostrar() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Ubicación: " + ubicacion);
        super.mostrar();
    }
}