/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sahidbosquez_prueba_2;

import java.util.Scanner;

/**
 *
 * @author VERONICA
 */
public class SahidBosquez_Prueba_2 {

     public static void main(String[] args) {
        int opcion;
        int[] numeros = new int[5];
        String[] apellidos = new String[5];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1: Ingresar números");
            System.out.println("2: Suma números");
            System.out.println("3: Promedio");
            System.out.println("4: Verificar si es positivo o negativo");
            System.out.println("5: Ingresar apellidos");
            System.out.println("6: Mostrar apellidos ingresados");
            System.out.println("7: Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.print("Ingrese el número " + (i+1) + ": ");
                        numeros[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    int suma = Calculos.sum(numeros);
                    System.out.println("Suma: " + suma);
                    break;
                case 3:
                    double promedio = Calculos.average(numeros);
                    System.out.println("Promedio: " + promedio);
                    break;
                case 4:
                    System.out.print("Ingrese un número para verificar si es positivo o negativo: ");
                    int number = scanner.nextInt();
                    String result = Calculos.positivoonegativo(number);
                    System.out.println(result);
                    break;
                case 5:
                    scanner.nextLine();
                    for (int i = 0; i < apellidos.length; i++) {
                        System.out.print("Ingrese el apellido " + (i+1) + ": ");
                        apellidos[i] = scanner.nextLine();
                    }
                    break;
                case 6:
                for (String apellido : apellidos) {
                    System.out.println(apellido);
                }
                    break;

                case 7:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Las opciones son 7");
            }
        } while (opcion != 7);
    }
}