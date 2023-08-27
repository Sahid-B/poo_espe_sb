/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decorator;


public class Decorator {

    public static void main(String[] args) {
        // Pedir un café
        Bebida cafe = new Cafe();
        System.out.println(cafe.obtenerDescripcion() + " - Costo: $" + cafe.obtenerCosto());

        // Pedir un café con leche
        Bebida cafeConLeche = new Leche(new Cafe());
        System.out.println(cafeConLeche.obtenerDescripcion() + " - Costo: $" + cafeConLeche.obtenerCosto());
    }
}
