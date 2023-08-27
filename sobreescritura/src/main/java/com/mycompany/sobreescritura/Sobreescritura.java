/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sobreescritura;

/**
 *
 * @author VERONICA
 */
public class Sobreescritura {

      public static void main(String[] args) {
        PublicacionTexto texto = new PublicacionTexto("¡Hoy es un gran día!", "Usuario1");
        PublicacionFoto foto = new PublicacionFoto("Vacaciones en la playa", "Disfrutando del sol", "Playa Paradise");

        texto.darLike();
        foto.darLike();
        foto.darLike();

        System.out.println("Publicación de texto:");
        texto.mostrar();

        System.out.println("\nPublicación de foto:");
        foto.mostrar();
    }
}