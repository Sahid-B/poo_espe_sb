/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobreescritura;

/**
 *
 * @author VERONICA
 */
class Publicacion {
    private String contenido;
    private int likes;

    public Publicacion(String contenido) {
        this.contenido = contenido;
        this.likes = 0;
    }

    public void darLike() {
        likes++;
    }

    public void mostrar() {
        System.out.println("Contenido: " + contenido);
        System.out.println("Likes: " + likes);
    }
}
