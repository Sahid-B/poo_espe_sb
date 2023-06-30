/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio2_u2;

/**
 *
 * @author VERONICA
 */
class Asignatura {
    private String nombre;
    private String horario;
    private Laboratorio laboratorioAsignado;

    public Asignatura(String nombre, String horario, Laboratorio laboratorioAsignado) {
        this.nombre = nombre;
        this.horario = horario;
        this.laboratorioAsignado = laboratorioAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    public Laboratorio getLaboratorioAsignado() {
        return laboratorioAsignado;
    }
}