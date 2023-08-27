/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sobrecarga;

/**
 *
 * @author VERONICA
 */
public class Sobrecarga {

     public static void main(String[] args) {
        Libro libro = new Libro("El Gran Gatsby", "F. Scott Fitzgerald");
        Revista revista = new Revista("National Geographic", 256);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.prestar(libro);
        biblioteca.devolver(libro);
        biblioteca.prestar(revista);
        biblioteca.devolver(revista);

        System.out.println("\nInformación detallada:");
        libro.mostrarInformacion();
        revista.mostrarInformacion();
    }
}