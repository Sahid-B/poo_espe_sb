package com.mycompany.main2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registro de equipos
        System.out.println("Registro de equipos");
        System.out.print("Ingrese el nombre del equipo local: ");
        Equipo equipoLocal = new Equipo(scanner.nextLine());

        System.out.print("Ingrese el nombre del equipo visitante: ");
        Equipo equipoVisitante = new Equipo(scanner.nextLine());

        // Registro de jugadores
        System.out.println("\nRegistro de jugadores - Equipo Local");
        registrarJugadores(equipoLocal, scanner, 11);

        System.out.println("\nRegistro de jugadores - Equipo Visitante");
        registrarJugadores(equipoVisitante, scanner, 11);

        // Creación del partido
        Partido partido = new Partido(equipoLocal, equipoVisitante);

        // Registro de goles
        System.out.println("\nRegistro de goles");
        registrarGoles(partido, scanner);

        // Obtener máximo goleador y MVP
        String maximoGoleador = partido.obtenerMaximoGoleador();
        String mvp = partido.obtenerMVP();

        System.out.println("\nEstadísticas del partido:");
        System.out.println("Máximo goleador: " + maximoGoleador);
        System.out.println("MVP del partido: " + mvp);

        scanner.close();
    }

    private static void registrarJugadores(Equipo equipo, Scanner scanner, int cantidadJugadores) {
        for (int i = 1; i <= cantidadJugadores; i++) {
            System.out.print("Ingrese el nombre del jugador " + i + ": ");
            String nombreJugador = scanner.nextLine();
            equipo.agregarJugador(new Jugador(nombreJugador));
        }
    }

    private static void registrarGoles(Partido partido, Scanner scanner) {
        System.out.println("Registro de goles (Equipo Local)");
        registrarGolesEquipo(partido.getEquipoLocal(), scanner);

        System.out.println("\nRegistro de goles (Equipo Visitante)");
        registrarGolesEquipo(partido.getEquipoVisitante(), scanner);
    }

    private static void registrarGolesEquipo(Equipo equipo, Scanner scanner) {
        for (Jugador jugador : equipo.getJugadores()) {
            System.out.print("Ingrese la cantidad de goles anotados por " + jugador.getNombre() + ": ");
            int goles = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
            for (int i = 0; i < goles; i++) {
                jugador.anotarGol();
            }
        }
    }
}
