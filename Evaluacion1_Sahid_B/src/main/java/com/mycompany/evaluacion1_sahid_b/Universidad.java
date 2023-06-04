package com.mycompany.evaluacion1_sahid_b;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Universidad {
    private final ArrayList<Profesor> profesores;
    private final ArrayList<Alumno> alumnos;
    private final ArrayList<Materia> materias;
    private final ArrayList<Matricula> matriculas;

    public Universidad() {
        profesores = new ArrayList<>();
        alumnos = new ArrayList<>();
        materias = new ArrayList<>();
        matriculas = new ArrayList<>();
    }

    public void agregarProfesor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agregar profesor");
        System.out.print("Cedula: ");
        String cedula = scanner.next();
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Direccion: ");
        String direccion = scanner.next();
        System.out.print("Telefono: ");
        String telefono = scanner.next();
        System.out.print("Celular: ");
        String celular = scanner.next();

        Profesor profesor = new Profesor(cedula, nombre, direccion, telefono, celular);
        profesores.add(profesor);
        System.out.println("Profesor agregado correctamente");
    }

    public void agregarAlumno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agregar alumno");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Género: ");
        String genero = scanner.next();

        Alumno alumno = new Alumno(nombre, genero);
        alumnos.add(alumno);
        System.out.println("Alumno agregado correctamente");
    }

    public void agregarMateria() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agregar materia");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Profesor (cedula): ");
        String cedulaProfesor = scanner.next();

        Profesor profesor = buscarProfesorPorCedula(cedulaProfesor);
        if (profesor == null) {
            System.out.println("Profesor no encontrado");
            return;
        }

        Materia materia = new Materia(nombre, profesor);
        materias.add(materia);
        System.out.println("Materia agregada correctamente");
    }

    public void agregarMatricula() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agregar matricula");
        System.out.print("Profesor (cedula): ");
        String cedulaProfesor = scanner.next();
        Profesor profesor = buscarProfesorPorCedula(cedulaProfesor);
        if (profesor == null) {
            System.out.println("Profesor no encontrado");
            return;
        }

        System.out.print("Alumno (nombre): ");
        String nombreAlumno = scanner.next();
        Alumno alumno = buscarAlumnoPorNombre(nombreAlumno);
        if (alumno == null) {
            System.out.println("Alumno no encontrado");
            return;
        }

        System.out.print("Materia (nombre): ");
        String nombreMateria = scanner.next();
        Materia materia = buscarMateriaPorNombre(nombreMateria);
        if (materia == null) {
            System.out.println("Materia no encontrada");
            return;
        }

        Matricula matricula = new Matricula(profesor, alumno, materia);
        matriculas.add(matricula);
        System.out.println("Matricula agregada correctamente");
    }

    public void mostrarTotalMatriculados() {
        System.out.println("Total matriculados por materia y género");
        for (Materia materia : materias) {
            int totalMateria = 0;
            int totalMujeres = 0;
            int totalHombres = 0;
            for (Matricula matricula : matriculas) {
                if (matricula.getMateria() == materia) {
                    totalMateria++;
                    if (matricula.getAlumno().getGenero().equals("Femenino")) {
                        totalMujeres++;
                    } else {
                        totalHombres++;
                    }
                }
            }
            System.out.println("Materia: " + materia.getNombre());
            System.out.println("Total matriculados: " + totalMateria);
            System.out.println("Total mujeres: " + totalMujeres);
            System.out.println("Total hombres: " + totalHombres);
        }
    }

    private Profesor buscarProfesorPorCedula(String cedula) {
        for (Profesor profesor : profesores) {
            if (profesor.getCedula().equals(cedula)) {
                return profesor;
            }
        }
        return null;
    }

    private Alumno buscarAlumnoPorNombre(String nombre) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombre)) {
                return alumno;
            }
        }
        return null;
    }

    private Materia buscarMateriaPorNombre(String nombre) {
        for (Materia materia : materias) {
            if (materia.getNombre().equals(nombre)) {
                return materia;
            }
        }
        return null;
    }
}

class Profesor {
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String celular;

    public Profesor(String cedula, String nombre, String direccion, String telefono, String celular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
}

class Alumno {
    private String nombre;
    private String genero;

    public Alumno(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
}

class Materia {
    private String nombre;
    private Profesor profesor;

    public Materia(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }
}

class Matricula {
    private Profesor profesor;
    private Alumno alumno;
    private Materia materia;

    public Matricula(Profesor profesor, Alumno alumno, Materia materia) {
        this.profesor = profesor;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }
}

