/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio2_u2;

import java.util.List;

/**
 *
 * @author VERONICA
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Laboratorio {
    private String nombre;
    private int capacidad;
    private List<String> equipos;
    private String responsable;
    private Set<String> horariosAsignados;

    public Laboratorio(String nombre, int capacidad, List<String> equipos, String responsable) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipos = equipos;
        this.responsable = responsable;
        this.horariosAsignados = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public List<String> getEquipos() {
        return equipos;
    }

    public String getResponsable() {
        return responsable;
    }

    public boolean verificarDisponibilidadHorario(String horario) {
        return !horariosAsignados.contains(horario);
    }

    public void asignarHorario(String horario) {
        horariosAsignados.add(horario);
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad máxima: " + capacidad);
        System.out.println("Equipos disponibles: " + equipos);
        System.out.println("Responsable: " + responsable);
        System.out.println("Horarios asignados: " + horariosAsignados);
    }
}