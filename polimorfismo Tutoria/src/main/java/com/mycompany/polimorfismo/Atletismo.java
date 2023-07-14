/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author VERONICA
 */
class Atletismo extends Deportista {

    public Atletismo(String nombre, int edad, String disciplina, String sexo) {
        super(nombre, edad, disciplina, sexo);
    }

}

class Natacion extends Deportista {
    private String estilo;

    public Natacion(String nombre, int edad, String disciplina, String sexo, String estilo) {
        super(nombre, edad, disciplina, sexo);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void entrenamiento() {
        System.out.println("LA NATACION ES EL DEPORTE DONDE...");
    }
}1