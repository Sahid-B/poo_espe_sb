/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;

import java.util.Scanner;

/**
 *
 * @author VERONICA
 */
public class Polimorfismo {

   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, disciplina, sexo;
        int edad;
        int opc;

        System.out.println("ESCOJA UNA OPCION");
        System.out.println("1. Atletismo");
        System.out.println("2. Natacion");
        opc = entrada.nextInt();
        entrada.nextLine();

        switch (opc) {
            case 1:
                System.out.println("INGRESE LOS DATOS");
                System.out.println("NOMBRE:");
                nombre = entrada.nextLine();
                System.out.println("EDAD:");
                edad = entrada.nextInt();
                entrada.nextLine();
                System.out.println("DISCIPLINA:");
                disciplina = entrada.nextLine();
                System.out.println("SEXO:");
                sexo = entrada.nextLine();

                Atletismo atle = new Atletismo(nombre, edad, disciplina, sexo);
                break;

            case 2:
                System.out.println("INGRESE LOS DATOS");
                System.out.println("NOMBRE:");
                nombre = entrada.nextLine();
                System.out.println("EDAD:");
                edad = entrada.nextInt();
                entrada.nextLine();
                System.out.println("DISCIPLINA:");
                disciplina = entrada.nextLine();
                System.out.println("SEXO:");
                sexo = entrada.nextLine();

                Natacion natacion = new Natacion(nombre, edad, disciplina, sexo, "Estilo");
                break;

            default:
                System.out.println("Opción inválida");
                break;
        }
    }
}