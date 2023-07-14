package com.mycompany.poo_practica17_mvc;

import control.Control;
import modelo.Modelo;
import vista.Vista2;

public class POO_Practica17_MVC {

    public static void main(String[] args) {
        
  Modelo mod = new Modelo  ();
  
  Vista2 vis = new Vista2();
  
  Control cont =new Control(vis,mod);
  
  cont.iniciar();
  vis.setVisible(true);
  
        
    }
}
