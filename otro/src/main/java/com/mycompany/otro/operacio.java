/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.otro;

/**
 *
 * @author VERONICA
 */
public class operacio {

    private static Iterable<String> listaNombres;
    private static void agregarNombre() {
        System.out.print("Ingrese un nombre: ");
        String nombre = scanner.nextLine();
        listaNombres.add(nombre);

        System.out.println("Nombre agregado exitosamente.");
    }

    private static void mostrarNombres() {
        System.out.println("Lista de nombres:");

        if (listaNombres.isEmpty()) {
            System.out.println("No hay nombres en la lista.");
        } else {
            for (String nombre : listaNombres) {
                System.out.println(nombre);
            }
        }
    }
}

