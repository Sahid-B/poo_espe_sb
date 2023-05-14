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
      String sim = "1.\n";
      String si = "2.\n";
      String s2 = "3.\n";
      
      
      
      
        Gato gato1 = new Gato();
        gato1.nombre = "Mario"; 
        gato1.edad =4;
        gato1.color = "Blanco";
        gato1.raza = "Siames";
        gato1.caracter = "tranquilo";
        
        
        Gato gato2 = new Gato();
        gato2.nombre = "Jose"; 
        gato2.edad =1;
        gato2.color = "Dorado";
        gato2.raza = "Persa";
        gato2.caracter = "tranquilo";
        
        
        System.out.print(sim);
        
        
        System.out.println("El gato se llama: " + gato1.nombre);
        System.out.println("Su edad es: "+ gato1.edad);
        System.out.println("Su raza es:" +gato1.raza);
        System.out.println("Su color es: "+gato1.color);
        System.out.println("Su caracter es:"+gato1.caracter);
        
         
        
        System.out.println("El gato se llama: " + gato2.nombre);
        System.out.println("Su edad es: "+ gato2.edad);
        System.out.println("Su raza es:" +gato2.raza);
        System.out.println("Su color es: "+gato2.color);
        System.out.println("Su caracter es:"+gato2.caracter);
        
        
        
        
         String simbolo = "============================.\n";
         
       System.out.print(simbolo);
        
       
       
       
       
       
       
       
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.placa =1232324;
        carro1.color="Azul";
        carro1.transmision= "Automatico";
        carro1.anio=2023;
        
         
        Carro carro2 = new Carro();
        carro2.marca = "Chevrolet";
        carro2.placa =456456;
        carro2.color="Rojo";
        carro2.transmision= "Manual";
        carro2.anio=2000;
        
        
        System.out.print(si);
        
        System.out.println("La marca es: " + carro1.marca);
        System.out.println("Suplaca es: "+"ABC"+carro1.placa);
        System.out.println("El color es:" + carro1.color);
        System.out.println("El anio es: "+ carro1.anio);
        System.out.println("La transmision es: "+ carro1.transmision);
        
        System.out.println("La marca es: " + carro2.marca);
        System.out.println("Suplaca es: "+"ABC"+carro2.placa);
        System.out.println("El color es:" + carro2.color);
        System.out.println("El anio es: "+ carro2.anio);
        System.out.println("La transmision es: "+ carro2.transmision);
        
        
        
        
        
        
        
        
        
        
       System.out.print(simbolo);
       
       
    Consola consola1 = new Consola();
       
    consola1.color="Negro";
    consola1.marca="Ps";
    consola1.potencia=10;
    consola1.ram=8;
    consola1.rom=10;
       
       
       Consola consola2 = new Consola();
       
    consola2.color="Blanco";
    consola2.marca="Xbox";
    consola2.potencia=12;
    consola2.ram=8;
    consola2.rom=5;
    
    
    
    
        
      System.out.print(s2);  
System.out.println("La consola es:"+consola1.marca);
System.out.println("El color es: "+consola1.color);
System.out.println("Su potencia es: "+consola1.potencia + " TFLOPS");
System.out.println(consola1.ram + " GB");
System.out.println(consola1.rom + " GB");
        
        





System.out.println("La consola es:"+consola2.marca);
System.out.println("El color es: "+consola2.color);
System.out.println("Su potencia es: "+consola2.potencia + " TFLOPS"); 
System.out.println(consola2.ram + " GB");
System.out.println(consola2.rom + " GB");
        
        
        

        
    }
    
}
