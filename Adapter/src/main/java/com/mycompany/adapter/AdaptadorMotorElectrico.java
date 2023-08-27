/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;


// Adaptador que permite que el motor eléctrico funcione como un motor de combustión
class AdaptadorMotorElectrico implements MotorCombustion {
    private MotorElectrico motorElectrico;

    public AdaptadorMotorElectrico(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void encender() {
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el motor eléctrico");
    }
}

