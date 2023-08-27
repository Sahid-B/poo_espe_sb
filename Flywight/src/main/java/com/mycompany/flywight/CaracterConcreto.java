/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flywight;


// Clase concreta de Flyweight
class CaracterConcreto implements Caracter {
    private char simbolo;

    public CaracterConcreto(char simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public void imprimir() {
        System.out.print(simbolo);
    }
}