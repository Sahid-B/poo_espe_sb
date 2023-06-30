/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancario;

/**
 *
 * @author ESPE
 */
public class Cuenta {
    private String titular;
    private double saldo;
    private int cedula;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public Cuenta(int cedula) {
        this.cedula=cedula;
        
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad);
        } else {
            System.out.println("No se puede retirar más de lo que hay en la cuenta");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
