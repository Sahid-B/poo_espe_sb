/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flywight;


import java.util.HashMap;
import java.util.Map;

public class Flywight {

    private FabricaCaracteres fabrica = new FabricaCaracteres();
    private StringBuilder contenido = new StringBuilder();

    public void insertarCaracter(char key) {
        Caracter caracter = fabrica.getCaracter(key);
        contenido.append(caracter);
    }

    public void imprimirContenido() {
        System.out.println(contenido.toString());
    }
    
      public static void main(String[] args) {
        Flywight editor = new Flywight();
        editor.insertarCaracter('H');
        editor.insertarCaracter('e');
        editor.insertarCaracter('l');
        editor.insertarCaracter('l');
        editor.insertarCaracter('o');
        editor.insertarCaracter(' ');
        editor.insertarCaracter('M');
        editor.insertarCaracter('u');
        editor.insertarCaracter('n');
        editor.insertarCaracter('d');
        editor.insertarCaracter('o');
        editor.imprimirContenido();
    }
}