/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora_basica_practica;

/**
 *
 * @author VERONICA
 */
public class Calculadora_basica_Practica {

    public static void main(String[] args) {
       
        calculadora calculadora1 = new calculadora(System.in);



 System.out.println("Calculadora Básica");
 
        double num1, num2;
        System.out.print("Ingresa el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        num2 = scanner.nextDouble();
        
         int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + Calculadora.sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + Calculadora.restar(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + Calculadora.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado: " + Calculadora.dividir(num1, num2));
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
                    break;
            }
        } while (opcion != 5);
        
        scanner.close();
    }
}
