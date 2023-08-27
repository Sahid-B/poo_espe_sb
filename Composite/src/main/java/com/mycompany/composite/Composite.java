/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.composite;


public class Composite {

       public static void main(String[] args) {
        Empleado juan = new Trabajador("Juan");
        Empleado maria = new Trabajador("Maria");

        Gerente pedro = new Gerente("Pedro");
        pedro.agregarSubordinado(juan);
        pedro.agregarSubordinado(maria);

        Empleado carlos = new Trabajador("Carlos");

        Gerente ana = new Gerente("Ana");
        ana.agregarSubordinado(carlos);
        ana.agregarSubordinado(pedro);

        ana.mostrarDetalles();
    }
}
