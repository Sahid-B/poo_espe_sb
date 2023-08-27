/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_2_sb;

/**
 *
 * @author ESPE
 */
public class Persona {

    private String nombre;
    private String telefono;
    private String email;
    
   
    public Persona (String nombre, String telefono, String email ){
        this.email = email;
        this.nombre = nombre;
        this.telefono = telefono;   
    }
    
    public String getNombre(){
        return nombre;
    }
    

    public String getEmail(){
        return email;
    }
    
   
    public void setTelefono(String nuevoTelefono){
        this.telefono = nuevoTelefono;
    }
}
 

