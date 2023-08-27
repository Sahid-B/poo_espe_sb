/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobreescritura;

/**
 *
 * @author VERONICA
 */
class PublicacionTexto extends Publicacion {
    private String autor;

    public PublicacionTexto(String contenido, String autor) {
        super(contenido);
        this.autor = autor;
    }

    @Override
    public void mostrar() {
        System.out.println("Autor: " + autor);
        super.mostrar();
    }
}