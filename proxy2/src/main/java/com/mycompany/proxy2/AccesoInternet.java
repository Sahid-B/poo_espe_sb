/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy2;


// Clase concreta que implementa el servicio de acceso a Internet
class AccesoInternet implements ServicioInternet {
    @Override
    public void acceder(String sitioWeb) {
        System.out.println("Accediendo a " + sitioWeb);
    }
}