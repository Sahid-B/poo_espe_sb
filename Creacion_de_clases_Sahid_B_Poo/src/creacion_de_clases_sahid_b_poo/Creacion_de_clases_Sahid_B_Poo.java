/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creacion_de_clases_sahid_b_poo;

/**
 *
 * @author ESPE
 */
public class Creacion_de_clases_Sahid_B_Poo {

    /**
     * CREAR OBJETOS
     * @param args
     */
    public static void main(String[] args) {
      
        Gato gato1 = new Gato();
        gato1.nombre = "Mario"; 
        gato1.edad =4;
        gato1.color = "Blanco";
        gato1.raza = "Siames";
        gato1.caracter = "tranquilo";
        
        
        
        System.out.println(gato1.nombre);
        System.out.println(gato1.edad);
        System.out.println(gato1.raza);
        System.out.println(gato1.color);
        System.out.println(gato1.caracter);
        
         String simbolo = "============================";
       System.out.print(simbolo);
        
       
       
       
       
       
       
       
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.placa =1232324;
        carro1.color="Azul";
        carro1.transmision= "Automatico";
        carro1.anio=2023;
        
        System.out.println(carro1.marca);
        System.out.println(carro1.placa);
        System.out.println(carro1.color);
        System.out.println(carro1.anio);
        System.out.println(carro1.transmision);
        
        
       System.out.print(simbolo);
       
       Consola consola1 = new Consola();
       
      consola1.color="Negro";
      consola1.marca="Ps";
      consola1.potencia=10;
    consola1.ram=8;
    
    consola1.rom=10;
       
       
       
        
        System.out.println(consola1.color);
        System.out.println(consola1.marca);
        System.out.println(consola1.potencia);
        System.out.println(consola1.ram);
        System.out.println(consola1.rom);
        
        
        
        
        
        

        
    }
    
}
