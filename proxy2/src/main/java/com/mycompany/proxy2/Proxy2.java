/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proxy2;


public class Proxy2 {

     public static void main(String[] args) {
        ServicioInternet servicio = new ProxyInternet();

        servicio.acceder("google.com");
        servicio.acceder("sitio-restringido.com");
        servicio.acceder("facebook.com");
    }
}