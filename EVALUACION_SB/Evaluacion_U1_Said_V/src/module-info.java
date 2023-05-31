import java.util.ArrayList;
import java.util.Scanner;

public class Evaluacion_U1_Said_V {
    public static void main(String[] args) {
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Materia> materias = new ArrayList<>();
        ArrayList<Matricula> matriculas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //menu de opciones
        int opcion;
        String cedula;
        String nombre;
        String direccion;
        String telefono;
        String celular;
        Profesor profesor;
        Alumno alumno;
        Materia materia;
        do {
            System.out.println("====================ESPE====================");
            System.out.println("Menú:");
            System.out.println("1. Profesores");
            System.out.println("2. Alumno");
            System.out.println("3. Materias");
            System.out.println("4. Gestión Matriculas");
            System.out.println("5. Total Matriculados");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            System.out.println("===========================================");
            switch (opcion) {
                case 1:
                    System.out.println("Agregar profesor");
                    System.out.print("Cedula: ");
                    cedula = scanner.next();
                    System.out.print("Nombre: ");
                    nombre = scanner.next();
                    System.out.print("Direccion: ");
                    direccion = scanner.next();
                    System.out.print("Telefono: ");
                    telefono = scanner.next();
                    System.out.print("Celular: ");
                    celular = scanner.next();
                    profesor = new Profesor(cedula, nombre, direccion, telefono, celular);
                    profesores.add(profesor);
                    System.out.println("Profesor agregado correctamente");
                    break;
                case 2:
                    System.out.println("Agregar alumno");
                    System.out.print("Nombre: ");
                    nombre = scanner.next();
                    System.out.print("Genero: ");
                    String genero = scanner.next();
                    alumno = new Alumno(nombre, genero);
                    alumnos.add(alumno);
                    System.out.println("Alumno agregado correctamente");
                    break;
                case 3:
                    System.out.println("Agregar materia");
                    System.out.print("Nombre: ");
                    nombre = scanner.next();
                    System.out.print("Profesor (cedula): ");
                    cedula = scanner.next();
                    profesor = null;
                    for (Profesor p : profesores) {
                        if (p.cedula.equals(cedula)) {
                            profesor = p;
                            break;
                        }
                    }
                    if (profesor == null) {
                        System.out.println("Profesor no encontrado");
                        break;
                    }
                    materia = new Materia(nombre, profesor);
                    materias.add(materia);
                    System.out.println("Materia agregada correctamente");
                    break;
                case 4:
                    System.out.println("Agregar matricula");
                    System.out.print("Profesor (cedula): ");
                    String cedulaProfesor = scanner.next();
                    profesor = null;
                    for (Profesor p : profesores) {
                        if (p.cedula.equals(cedulaProfesor)) {
                            profesor = p;
                            break;
                        }
                    }
                    if (profesor == null) {
                        System.out.println("Profesor no encontrado");
                        break;
                    }
                    System.out.print("Alumno (nombre): ");
                    String nombreAlumno = scanner.next();
                     alumno = null;
                     for (Alumno a : alumnos) {
                         if (a.nombre.equals(nombreAlumno)) {
                             alumno = a;
                             break;
                         }
                     }
                     if (alumno == null) {
                         System.out.println("Alumno no encontrado");
                         break;
                     }
                     System.out.print("Materia (nombre): ");
                     String nombreMateria = scanner.next();
                     materia = null;
                     for (Materia m : materias) {
                         if (m.nombre.equals(nombreMateria)) {
                             materia = m;
                             break;
                         }
                     }
                     if (materia == null) {
                         System.out.println("Materia no encontrada");
                         break;
                     }
                     Matricula matricula = new Matricula(profesor, alumno, materia);
                     matriculas.add(matricula);
                     System.out.println("Matricula agregada correctamente");
                     break;
                 case 5:
                     System.out.println("Total matriculados por materia y genero");
                     for (Materia m : materias) {
                         int totalMateria = 0;
                         int totalMujeres = 0;
                         int totalHombres = 0;
                         for (Matricula matricula : matriculas) {
                             if (matricula.materia == m) {
                                 totalMateria++;
                                 if (matricula.alumno.genero.equals("Femenino")) {
                                     totalMujeres++;
                                 } else {
                                     totalHombres++;
                                 }
                             }
                         }
                         System.out.println("Materia: " + m.nombre);
                         System.out.println("Total matriculados: " + totalMateria);
                         System.out.println("Total mujeres: " + totalMujeres);
                         System.out.println("Total hombres: " + totalHombres);
                     }
                     break;
                 case 6:
                     System.out.println("Salir");
                     break;
                 default:
                     System.out.println("Las opciones van del 1-6");
             }
         } while (opcion != 6);
     }
}
