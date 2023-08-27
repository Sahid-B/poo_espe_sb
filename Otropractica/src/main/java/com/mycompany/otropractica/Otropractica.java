/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.otropractica;

import java.util.Scanner;

/**
 *
 * @author VERONICA
 */

public class Otropractica {
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Programa de cálculo de rectángulos");
        
        double largo, ancho;
        System.out.print("Ingresa el largo del rectángulo: ");
        largo = scanner.nextDouble();
        System.out.print("Ingresa el ancho del rectángulo: ");
        ancho = scanner.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(largo, ancho);
        
        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Calcular área");
            System.out.println("2. Calcular perímetro");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                    break;
                case 2:
                    System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
                    break;
            }
        } while (opcion != 3);
        
        scanner.close();
    }