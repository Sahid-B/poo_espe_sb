/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

import java.util.Scanner;

/**
 *
 * @author VERONICA
 */
public class operacioncasa {
    int a;
    int b;
    int resultado;

    public int suma(int a, int b) {
        resultado = a + b;
        return resultado;
    }

    public int resta(int a, int b) {
        resultado = a - b;
        return resultado;
    }

    public int multiplicacion(int a, int b) {
        resultado = a * b;
        return resultado;
    }

    public int division(int a, int b) {
        resultado = a / b;
        return resultado;
    }

    public void ingresar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        a = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = leer.nextInt();
    }
}