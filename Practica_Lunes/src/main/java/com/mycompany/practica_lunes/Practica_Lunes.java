/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_lunes;

/**
 *
 * @author VERONICA
 */
public class Practica_Lunes {

   
    public static void main(String[] args) {
        rectangulo rectangulo = new rectangulo(5.0, 3.0);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularperimetro());
    }
}