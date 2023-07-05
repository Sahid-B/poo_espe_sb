/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba2origianl;

/**
 *
 * @author VERONICA
 */
public class Prueba2origianl {

    public static void main(String[] args) {
        
        Coche coche = new Coche("Toyota", "Corolla", 2022, 4);
        Motocicleta motocicleta = new Motocicleta("Harley-Davidson", "Street Glide", 2021, false);
        Quad quad = new Quad("Can-Am", "Outlander", 2020, true);

        System.out.println("Coche: " + coche.getMarca() + " " + coche.getModelo() + " " + coche.getAño() + " " + coche.getNumPuertas() + " puertas");
        System.out.println("Motocicleta: " + motocicleta.getMarca() + " " + motocicleta.getModelo() + " " + motocicleta.getAño() + " " + (motocicleta.tieneSidecar() ? "con" : "sin") + " sidecar");
        System.out.println("Quad: " + quad.getMarca() + " " + quad.getModelo() + " " + quad.getAño() + " " + (quad.es4x4() ? "4x4" : "no es 4x4"));
    }
}