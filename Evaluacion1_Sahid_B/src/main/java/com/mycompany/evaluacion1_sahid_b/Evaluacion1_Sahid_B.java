package com.mycompany.evaluacion1_sahid_b;

/**
 *
 * @author ESPE
 */
 import java.util.ArrayList;
import java.util.Scanner;
public class Evaluacion1_Sahid_B {

    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("====================ESPE====================");
            System.out.println("Menú:");
            System.out.println("1. Profesores");
            System.out.println("2. Alumnos");
            System.out.println("3. Materias");
            System.out.println("4. Gestión de Matrículas");
            System.out.println("5. Total de Matriculados");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            System.out.println("===========================================");

            switch (opcion) {
                case 1:
                    universidad.agregarProfesor();
                    break;
                case 2:
                    universidad.agregarAlumno();
                    break;
                case 3:
                    universidad.agregarMateria();
                    break;
                case 4:
                    universidad.agregarMatricula();
                    break;
                case 5:
                    universidad.mostrarTotalMatriculados();
                    break;
                case 6:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Las opciones van del 1 al 6");
            }
        } while (opcion != 6);
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    

