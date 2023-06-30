/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio2_u2;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * author VERONICA
 */
class SistemaGestionHorario {
    List<Laboratorio> laboratorios;

    public SistemaGestionHorario() {
        laboratorios = new ArrayList<>();
    }

    public void agregarLaboratorio(Laboratorio laboratorio) {
        laboratorios.add(laboratorio);
    }

    public void asignarHorario(Asignatura asignatura) {
        Laboratorio laboratorio = asignatura.getLaboratorioAsignado();
        String horario = asignatura.getHorario();

        if (laboratorio.verificarDisponibilidadHorario(horario)) {
            laboratorio.asignarHorario(horario);
            System.out.println("Asignatura '" + asignatura.getNombre() + "' asignada al laboratorio '" + laboratorio.getNombre() + "'");
            System.out.println("Horario: " + asignatura.getHorario());
        } else {
            System.out.println("El laboratorio '" + laboratorio.getNombre() + "' ya tiene asignado un horario en el mismo período.");
            System.out.println("Por favor, ingrese un nuevo horario.");
            asignarHorario(asignatura); // Solicitar nuevo horario recursivamente
        }

        System.out.println();
    }

    public void mostrarInformacionLaboratorios() {
        for (Laboratorio laboratorio : laboratorios) {
            laboratorio.mostrarInformacion();
            System.out.println();
        }
    }
}