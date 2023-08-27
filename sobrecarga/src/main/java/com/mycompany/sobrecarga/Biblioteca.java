/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobrecarga;

/**
 *
 * @author VERONICA
 */
class Biblioteca {
    public void prestar(Material material) {
        System.out.println("Préstamo de: " + material.getTitulo());
    }

    public void devolver(Material material) {
        System.out.println("Devolución de: " + material.getTitulo());
    }
}