package com.mycompany.prueba_1u2;

public class Prueba_1U2 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Auto
        Auto auto = new Auto("ABC123", "Toyota", 4, 1);
        auto.setTransmision("Automática");
        auto.encenderParabrisas();

        // Mostrar información del auto
        System.out.println("Información del Auto:");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Número de Placa: " + auto.getNumPlaca());
        System.out.println("Número de Ruedas: " + auto.getNumRuedas());
        System.out.println("Transmisión: " + auto.getTransmision());
        System.out.println("Estado: " + auto.getEstado());
        System.out.println("Parabrisas encendido: " + auto.isParabrisasOn());
        System.out.println();

        // Crear un objeto de la clase Camion
        Camion camion = new Camion("XYZ789", "Ford", 6, 1);
        camion.setColor("Rojo");
        camion.setCarga(5000.0);

        // Mostrar información del camión
        System.out.println("Información del Camión:");
        System.out.println("Marca: " + camion.getMarca());
        System.out.println("Número de Placa: " + camion.getNumPlaca());
        System.out.println("Número de Ruedas: " + camion.getNumRuedas());
        System.out.println("Color: " + camion.getColor());
        System.out.println("Estado: " + camion.getEstado());
        System.out.println("Carga: " + camion.getCarga());

        // Encender el parabrisas del camión
        camion.onOffParabrisas();
        System.out.println("Parabrisas encendido: " + camion.isParabrisasOn());
    }
}
