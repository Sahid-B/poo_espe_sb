/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.otro;

/**
 *
 * @author VERONICA
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Otro {
  
    public static void main(String[] args) {
     

public class AdministradorNombres {
    private static List<String> listaNombres = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar nombre");
            System.out.println("2. Mostrar todos los nombres");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea después de leer la opción

            switch (opcion) {
                case 1:
                    agregarNombre();
                    break;
                case 2:
                    mostrarNombres();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }
        } while (opcion != 3);
    }

    }
}
