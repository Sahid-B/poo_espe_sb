package com.mycompany.main2;

public class Jugador {
    private String nombre;
    private int goles;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.goles = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGoles() {
        return goles;
    }

    public void anotarGol() {
        goles++;
    }
}
