/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy2;

import java.util.ArrayList;
import java.util.List;


// Proxy que controla el acceso al servicio de Internet
class ProxyInternet implements ServicioInternet {
    private ServicioInternet servicioInternet;
    private List<String> sitiosRestringidos;

    public ProxyInternet() {
        servicioInternet = new AccesoInternet();
        sitiosRestringidos = new ArrayList<>();
        sitiosRestringidos.add("sitio-restringido.com");
        sitiosRestringidos.add("contenido-adulto.com");
    }

    @Override
    public void acceder(String sitioWeb) {
        if (sitiosRestringidos.contains(sitioWeb)) {
            System.out.println("Acceso a " + sitioWeb + " bloqueado.");
        } else {
            servicioInternet.acceder(sitioWeb);
        }
    }
}