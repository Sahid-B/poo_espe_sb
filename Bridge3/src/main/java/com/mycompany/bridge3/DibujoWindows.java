/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge3;



class DibujoWindows implements Dibujo {
    @Override
    public void dibujarCirculo(int x, int y, int radio) {
        System.out.println("Dibujando círculo en Windows en (" + x + ", " + y + ") con radio " + radio);
    }

    @Override
    public void dibujarRectangulo(int x1, int y1, int x2, int y2) {
        System.out.println("Dibujando rectángulo en Windows con vértices (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ")");
    }
}
