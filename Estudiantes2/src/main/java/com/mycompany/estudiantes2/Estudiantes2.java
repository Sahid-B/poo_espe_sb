/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiantes2;

import javax.swing.SwingUtilities;

/**
 *
 * @author ESPE
 */
public class Estudiantes2 {
public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RegistroEstudiantes().setVisible(true);
            }
        });
    }
}


