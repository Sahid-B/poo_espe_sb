package com.mycompany.main2;

import java.util.HashMap;
import java.util.Map;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public void registrarGol(String nombreJugador, Equipo equipo) {
        for (Jugador jugador : equipo.getJugadores()) {
            if (jugador.getNombre().equals(nombreJugador)) {
                jugador.anotarGol();
                break;
            }
        }
    }

    public String obtenerMaximoGoleador() {
        Jugador maximoGoleador = null;
        int maxGoles = 0;

        for (Jugador jugador : equipoLocal.getJugadores()) {
            if (jugador.getGoles() > maxGoles) {
                maximoGoleador = jugador;
                maxGoles = jugador.getGoles();
            }
        }

        for (Jugador jugador : equipoVisitante.getJugadores()) {
            if (jugador.getGoles() > maxGoles) {
                maximoGoleador = jugador;
                maxGoles = jugador.getGoles();
            }
        }

        return (maximoGoleador != null) ? maximoGoleador.getNombre() : "No se registraron goles";
    }

    public String obtenerMVP() {
        Map<Jugador, Integer> golesPorJugador = new HashMap<>();

        for (Jugador jugador : equipoLocal.getJugadores()) {
            golesPorJugador.put(jugador, jugador.getGoles());
        }

        for (Jugador jugador : equipoVisitante.getJugadores()) {
            golesPorJugador.put(jugador, golesPorJugador.getOrDefault(jugador, 0) + jugador.getGoles());
        }

        Jugador mvp = null;
        int maxGoles = 0;

        for (Map.Entry<Jugador, Integer> entry : golesPorJugador.entrySet()) {
            Jugador jugador = entry.getKey();
            int goles = entry.getValue();

            if (goles > maxGoles) {
                mvp = jugador;
                maxGoles = goles;
            }
        }

        return (mvp != null) ? mvp.getNombre() : "No se registraron goles";
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }
}
