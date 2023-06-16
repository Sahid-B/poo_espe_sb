package Poo_Herencia_Practica;

public class Motociclieta extends Vehiculo {
	
	boolean patada;
	
	@Override
	
	public void encendido(){
	encendido=true;
	estado="Motocicleta encendida";
	
}
	@Override

	public void apagado() {
		
		encendido = false;
		estado="Motocicleta apagada";
		
		
		
	}	
	
	}

