package com.mycompany.laboratorio2_u2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * author VERONICA
 */
public class Laboratorio2_U2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaGestionHorario sistema = new SistemaGestionHorario();

        System.out.print("Ingrese la cantidad de laboratorios: ");
        int cantidadLaboratorios = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea después de leer el entero

        for (int i = 0; i < cantidadLaboratorios; i++) {
            System.out.println("Ingrese los datos del laboratorio " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Capacidad máxima: ");
            int capacidad = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea después de leer el entero
            System.out.print("Responsable: ");
            String responsable = scanner.nextLine();

            System.out.print("¿Es un Laboratorio1 o Laboratorio2? (1/2): ");
            int tipoLaboratorio = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea después de leer el entero

            List<String> equipos = new ArrayList<>();
            System.out.print("Ingrese los equipos disponibles (separados por comas): ");
            String equiposString = scanner.nextLine();
            String[] equiposArray = equiposString.split(",");
            for (String equipo : equiposArray) {
                equipos.add(equipo.trim());
            }

            if (tipoLaboratorio == 1) {
                System.out.print("Espacio: ");
                String espacio = scanner.nextLine();
                sistema.agregarLaboratorio(new Laboratorio1(nombre, capacidad, equipos, responsable, espacio));
            } else if (tipoLaboratorio == 2) {
                System.out.print("Lugar: ");
                String lugar = scanner.nextLine();
                sistema.agregarLaboratorio(new Laboratorio2(nombre, capacidad, equipos, responsable, lugar));
            }

            System.out.println();
        }

        System.out.print("Ingrese la cantidad de asignaturas: ");
        int cantidadAsignaturas = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea después de leer el entero

        for (int i = 0; i < cantidadAsignaturas; i++) {
            System.out.println("Ingrese los datos de la asignatura " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Horario: ");
            String horario = scanner.nextLine();

            System.out.println("Seleccione un laboratorio para asignar la asignatura:");
            sistema.mostrarInformacionLaboratorios();
            System.out.print("Ingrese el número de laboratorio: ");
            int numeroLaboratorio = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea después de leer el entero

            if (numeroLaboratorio >= 1 && numeroLaboratorio <= sistema.laboratorios.size()) {
                Laboratorio laboratorioAsignado = sistema.laboratorios.get(numeroLaboratorio - 1);
                sistema.asignarHorario(new Asignatura(nombre, horario, laboratorioAsignado));
            } else {
                System.out.println("Número de laboratorio inválido. La asignatura no será asignada a ningún laboratorio.");
                System.out.println();
            }
        }
    }
}