/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bridge3;

public class Bridge3 {

    public static void main(String[] args) {
        Dibujo dibujoWindows = new DibujoWindows();
        Dibujo dibujoLinux = new DibujoLinux();

        Forma circuloWindows = new Circulo(dibujoWindows, 10, 20, 5);
        Forma rectanguloLinux = new Rectangulo(dibujoLinux, 5, 10, 20, 15);

        circuloWindows.dibujar();
        rectanguloLinux.dibujar();
    }
}