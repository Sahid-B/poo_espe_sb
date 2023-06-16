/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculo_figurass;

/**
 *
 * @author VERONICA
 */
import java.util.Scanner;

public class Calculo_figurass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        Figura[] figuras = new Figura[5];
        int figuraIndex = 0;

        while (option != 0) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Medir una figura");
            System.out.println("2. Medir todas las figuras");
            System.out.println("0. Salir");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (figuraIndex < 5) {
                        System.out.println("Seleccione una figura:");
                        System.out.println("1. Cuadrado");
                        System.out.println("2. Rectángulo");
                        System.out.println("3. Triángulo");
                        System.out.println("4. Pentágono");
                        int figuraOption = scanner.nextInt();

                        Figura figura = null;
                        switch (figuraOption) {
                            case 1:
                                System.out.println("Ingrese el lado del cuadrado:");
                                double lado = scanner.nextDouble();
                                figura = new Cuadrado(lado);
                                break;
                            case 2:
                                System.out.println("Ingrese la base del rectángulo:");
                                double base = scanner.nextDouble();
                                System.out.println("Ingrese la altura del rectángulo:");
                                double altura = scanner.nextDouble();
                                figura = new Rectangulo(base, altura);
                                break;
                            case 3:
                                System.out.println("Ingrese la base del triángulo:");
                                base = scanner.nextDouble();
                                System.out.println("Ingrese la altura del triángulo:");
                                altura = scanner.nextDouble();
                                System.out.println("Ingrese el lado 1 del triángulo:");
                                double lado1 = scanner.nextDouble();
                                System.out.println("Ingrese el lado 2 del triángulo:");
                                double lado2 = scanner.nextDouble();
                                figura = new Triangulo(base, altura, lado1, lado2);
                                break;
                            case 4:
                                System.out.println("Ingrese el lado del pentágono:");
                                double ladoPentagono = scanner.nextDouble();
                                System.out.println("Ingrese la apotema del pentágono:");
                                double apotema = scanner.nextDouble();
                                figura = new Pentagono(ladoPentagono, apotema);
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }

                        if (figura != null) {
                            System.out.println("El área de la figura es: " + figura.calcularArea());
                            System.out.println("El perímetro de la figura es: " + figura.calcularPerimetro());
                            figuras[figuraIndex] = figura;
                            figuraIndex++;
                        }
                    } else {
                        System.out.println("Ya has ingresado el máximo de figuras permitidas (5).");
                    }
                    break;

                case 2:
                    if (figuraIndex > 0) {
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Medir todas las figuras una por una");
                        System.out.println("2. Medir todas las figuras al mismo tiempo");
                        int medidaOption = scanner.nextInt();

                        switch (medidaOption) {
                            case 1:
                                for (int i = 0; i < figuraIndex; i++) {
                                    System.out.println("Medición de la figura " + (i + 1) + ":");
                                    System.out.println("El área de la figura es: " + figuras[i].calcularArea());
                                    System.out.println("El perímetro de la figura es: " + figuras[i].calcularPerimetro());
                                }
                                break;
                            case 2:
                                double totalArea = 0;
                                double totalPerimetro = 0;
                                for (int i = 0; i < figuraIndex; i++) {
                                    totalArea += figuras[i].calcularArea();
                                    totalPerimetro += figuras[i].calcularPerimetro();
                                }
                                System.out.println("El área total de las figuras es: " + totalArea);
                                System.out.println("El perímetro total de las figuras es: " + totalPerimetro);
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                    } else {
                        System.out.println("No has ingresado ninguna figura todavía.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        scanner.close();
    }
}

  