package Poo_Herencia_Practica;

public class Poo_Herencia_Practica {

    public static void main(String[] args) {
      
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.apagado();;
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.apagado();
        Automovil auto = new Automovil();
        auto.encendido();
        Automovil auto1 = new Automovil();
        auto1.apagado();
        Motociclieta moto = new Motociclieta();
        moto.encendido();
        Motociclieta moto1 = new Motociclieta();
        moto1.apagado();
        
        
        
        System.out.println("Encendido");
        System.out.println(vehiculo1.estado);
        System.out.println(auto.estado);
        System.out.println(moto.estado);
        System.out.println("Apagado");
        System.out.println(vehiculo2.estado);
        System.out.println(auto1.estado);
        System.out.println(moto1.estado);
    }
    
}