/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adapter;


public class Adapter {

    public static void main(String[] args) {
        // Crear un motor eléctrico
        MotorElectrico motorElectrico = new MotorElectrico();

        // Crear un adaptador para el motor eléctrico
        MotorCombustion motorAdaptado = new AdaptadorMotorElectrico(motorElectrico);

        // Utilizar el motor adaptado
        motorAdaptado.encender();
        motorAdaptado.acelerar();
    }
}
