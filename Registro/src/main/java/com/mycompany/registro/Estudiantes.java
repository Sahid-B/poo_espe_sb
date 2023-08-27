/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registro;

/**
 *
 * @author VERONICA
 */
import java.util.Scanner;
public class Estudiantes {
    
  
    private String nombre;
    private int edad;
    
    public Estudiantes (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
}

