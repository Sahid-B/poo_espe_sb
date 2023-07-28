package POO_Prueba2;

import java.util.Scanner;

//Clase abstracta que representa a un superhéroe
abstract class Superheroe {
 String nombre;
 int edad;
 String habilidad;
//constructor
 public Superheroe(String nombre, int edad, String habilidad) {
     this.nombre = nombre;
     this.edad = edad;
     this.habilidad = habilidad;
 }

 public abstract void mostrarPoder();
//getters y setters
 public String getNombre() {
     return nombre;
 }

 public int getEdad() {
     return edad;
 }

 public String getHabilidad() {
     return habilidad;
 }
}