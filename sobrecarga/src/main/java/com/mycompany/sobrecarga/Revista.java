/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobrecarga;

/**
 *
 * @author VERONICA
 */
class Revista extends Material {
    private int numero;

    public Revista(String titulo, int numero) {
        super(titulo);
        this.numero = numero;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo: Revista");
        System.out.println("Título: " + getTitulo());
        System.out.println("Número: " + numero);
    }
}