
package com.mycompany.poo_laboratorio16_polimorfismo;

import java.util.Scanner;

public class Poo_Laboratorio16_Polimorfismo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("---------------------ESPE-----------------");
            System.out.println("Menu:");
            System.out.println("1. Calcular superficie de un Triangulo");
            System.out.println("2. Calcular superficie de un Circulo");
            System.out.println("3. Calcular superficie de un Cuadrado");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el color del Triangulo: ");
                    String colorT = input.next();
                    System.out.print("Ingrese la base del Triangulo: ");
                    int base = input.nextInt();
                    System.out.print("Ingrese la altura del Triangulo: ");
                    int altura = input.nextInt();
                    Triangulo t = new Triangulo(colorT, base, altura);
                    System.out.println("La superficie del Triangulo es: " + t.suprtficie());
                    break;
                case 2:
                    System.out.print("Ingrese el color del Circulo: ");
                    String colorC = input.next();
                    System.out.print("Ingrese el radio del Circulo: ");
                    int radio = input.nextInt();
                    Circulo c = new Circulo(colorC, radio);
                    System.out.println("La superficie del Circulo es: " + c.suprtficie());
                    break;
                case 3:
                    System.out.print("Ingrese el color del Cuadrado: ");
                    String colorf = input.next();
                    System.out.print("Ingrese el lado del Cuadrado: ");
                    int lado = input.nextInt();
                    Cuadrado f = new Cuadrado(colorf, lado) {};
                    System.out.println("La superficie del Cuadrado es: " + f.suprtficie());
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("las opciones van del 1-4");
            }
        } while (opcion != 4);
    }
}