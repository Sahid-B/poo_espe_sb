/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistemabancario;

/**
 *
 * @author ESPE
 */
public class Sistemabancario {

    public static void main(String[] args) {
        Cuantalimitada cuenta = new Cuantalimitada("Juan", 5000);
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        cuenta.retirar(2000);
        System.out.println("Saldo después del retiro: $" + cuenta.getSaldo());

        cuenta.retirar(3000);
        System.out.println("Saldo después del segundo retiro: $" + cuenta.getSaldo());

        cuenta.retirar(900);
        System.out.println("Saldo después del tercer retiro: $" + cuenta.getSaldo());
    }
}