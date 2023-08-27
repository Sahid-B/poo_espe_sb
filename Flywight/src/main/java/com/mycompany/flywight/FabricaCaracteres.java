/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flywight;


import java.util.HashMap;
import java.util.Map;
class FabricaCaracteres {
    private Map<Character, Caracter> caracteres = new HashMap<>();

    public Caracter getCaracter(char key) {
        if (caracteres.containsKey(key)) {
            return caracteres.get(key);
        } else {
            Caracter caracter = new CaracterConcreto(key);
            caracteres.put(key, caracter);
            return caracter;
        }
    }
}
