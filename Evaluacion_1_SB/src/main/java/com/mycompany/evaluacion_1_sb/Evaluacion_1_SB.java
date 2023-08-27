/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//Evaluación 1
//Enunciado
//Realizar un programa para la gestión de notas que al iniciarse muestre el siguiente menú:
//I-Agregar nota
//2.-Ver nota media
//3.-yer aprobados
//4.- Salir
//A elegir la opción se solicitará la introducción de una nota y se guardará, volviendo a mostrar de nuevo el menú.
//Con las opciones 2 y 3 se mostrará, respectivamente, la nota media registrada hasta el momento y el número de aprobados. A elegir 4 se abandonará el programa

package com.mycompany.evaluacion_1_sb;
 import java.util.Scanner;
/**
 *
 * @author ESPE
 */
public class Evaluacion_1_SB {

    private static int opcion;
    private static double nota;

      public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in) // Crear un Scanner para leer datos del teclado
        ) {
            Notas n = new Notas(5);//Definimos el tamaño de las notas a ingresar (se lo puede cambiar)
            
            do {
                //Creamos el menu de ociones
                System.out.println("Menu para ver notas de estudiantes:");
                System.out.println("1. Agregar nota");
                System.out.println("2. Ver nota media");
                System.out.println("3. Ver aprobados");
                System.out.println("4. Salir");
                
                //Creamos el selector de opciones 
                System.out.print("Elejir alguna opcion: ");
                int opcion = sc.nextInt();
                
                //switch que nos permitira elejir y que se ejecute el programa 
                switch (opcion) {
                    case 1://primera opcion que nos permite agreuar las 5 notas de los estudiantes 
                        System.out.print("Agregar nota de estudiante: ");
                        nota = sc.nextDouble();
                        n.agregarNota(nota);
                        break;
                    case 2: //segunda opcion que nos permite ver la media de notas de los estudiantes es decir valor medio de un conjunto de datos ordenados
                        System.out.println("La nota media de los estudiantes es: " + n.verNotaMedia());
                        break;
                    case 3: // tercera opcion esta nos permite ver si la nota es igual o mayor a 14 
                        System.out.println("El número de estudiantes aprobados es: " + n.verAprobados());
                        break;
                    case 4: // cuarta opcion esta nos permite salir del programa y termina con un adios!
                        System.out.println("Adios");
                        break;
                    default: // mensaje que se muestra  si escojen numeros mayores a 4
                        System.out.println("Las opciones van del 1-4");
                        break;
                }
            } while (opcion != 4);
        } 
    }
}
