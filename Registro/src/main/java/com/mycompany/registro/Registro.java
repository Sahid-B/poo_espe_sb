/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registro;

/**
 *
 * @author VERONICA
 */
public class Registro {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Registro de Estudiantes");
        
        Estudiantes[] estudiantes = new Estudiantes [5];
        
        int opcion;
        int contador = 0;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes registrados");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    if (contador < estudiantes.length) {
                        System.out.print("Ingresa el nombre del estudiante: ");
                        String nombre = scanner.next();
                        System.out.print("Ingresa la edad del estudiante: ");
                        int edad = scanner.nextInt();
                        
                        estudiantes[contador] = new Estudiantes(nombre, edad);
                        contador++;
                        System.out.println("Estudiante agregado correctamente.");
                    } else {
                        System.out.println("No es posible agregar más estudiantes. Límite alcanzado.");
                    }
                 }
                case 2 -> {
                    System.out.println("Estudiantes registrados:");
                    for (int i = 0; i < contador; i++) {
                        Estudiantes estudiante = estudiantes[i];
                        System.out.println("Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad());
                    }
                 }
                case 3 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida. Inténtalo nuevamente.");
            }
        } while (opcion != 3);
        
        scanner.close();
    }
}
    
