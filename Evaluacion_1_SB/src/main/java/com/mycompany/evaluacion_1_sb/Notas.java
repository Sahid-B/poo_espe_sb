/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion_1_sb;
/**
 *
 * @author ESPE
 */
public class Notas {
    // Atributos
    private final double[] notas; 
    private int alumnos; 
    // Constructor
    public Notas(int tam) {
        notas = new double[tam]; 
        alumnos = 0; 
    }
    // Método para agregar una nota al array
    public void agregarNota(double nota) {
        if (alumnos < notas.length) { 
            notas[alumnos] = nota; 
            alumnos++; 
        } else {
            System.out.println("No se pueden agregar más notas.");
        }
    }
    public double verNotaMedia() {
        double suma = 0; 
        for (int i = 0; i < alumnos; i++) { 
            suma += notas[i]; 
        }
        return suma / alumnos; 
    }
    // Método para contar el número de aprobados en el array
    public int verAprobados() {
        int aprobados = 0; 
        for (int i = 0; i < alumnos; i++) { 
            if (notas[i] >= 14) { // Si la nota es mayor o igual a 14
                aprobados++; 
            }
        }
        return aprobados; // Devolver el número de aprobados
    }
}
  