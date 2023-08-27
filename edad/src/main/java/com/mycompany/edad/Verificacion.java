/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edad;

/**
 *
 * @author VERONICA
 */
public class Verificacion {
    

    private String nombre;
    private int edad;

    public Verificacion(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void verificacionEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " es menor de edad");
        }
    }

    public static void main(String[] args) {
        String nombre = "Juan";
        int edad = 25;

        Verificacion persona = new Verificacion(nombre, edad);
        persona.verificacionEdad();
    }
}
    
    
    
    
    
    
    
    
    
}
