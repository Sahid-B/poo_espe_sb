
package com.mycompany.poo_u2_p10_sobrecargaa;

/**
 *
 * @author ESPE
 */
public class Persona {
String nombre;
int edad;
int cedula;

//sobrecarga de metodos
public Persona (String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
}

public Persona (int cedula){
    
    this.cedula=cedula;
}
//sobrecarga de metodos
public void jugar (){
  System.out.println("Mi nombre es:" + nombre + " ,voy a jugar");   
}

public void jugar (String juego){
  System.out.println("Voy a jugar " + juego + ", me gusta mucho " );   
}





}
