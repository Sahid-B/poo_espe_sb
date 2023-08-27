/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_lunes;

/**
 *
 * @author VERONICA
 */
public class rectangulo {
    
    private final double largo;
            
    private final double ancho;
    
    
    public rectangulo (double largo, double ancho){
    this.largo=largo;
    this.ancho=ancho;
    
    public double Area () {
        return largo * ancho;
    }
    
     public double calcularperimetro(){
        
        return 2* (largo + ancho);
        
    
    
    
    
    }
    
    
    
}
