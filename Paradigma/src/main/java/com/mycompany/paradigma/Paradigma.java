/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paradigma;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Paradigma {

  public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("María", 30));
        personas.add(new Persona("Carlos", 22));

        // Mostrar información de todas las personas
        System.out.println("Información de todas las personas:");
        personas.forEach(System.out::println);

        // Buscar personas mayores de 25 años
        List<Persona> mayoresDe25 = personas.stream()
            .filter(persona -> persona.getEdad() > 25)
            .collect(Collectors.toList());

        System.out.println("\nPersonas mayores de 25 años:");
        mayoresDe25.forEach(System.out::println);
    }
}
