/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobrecarga;

/**
 *
 * @author VERONICA
 */
class Libro extends Material {
    private String autor;

    public Libro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo: Libro");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + autor);
    }
}