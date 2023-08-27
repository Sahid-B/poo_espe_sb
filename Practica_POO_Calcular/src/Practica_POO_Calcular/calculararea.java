package Practica_POO_Calcular;

public class calculararea {

	//Para calcularar el area del cuadrado
	class Cuadrado {
	    private double lado;
	    
	    public Cuadrado(double lado) {
	        this.lado = lado;
	    }

	    public double calcularArea() {
	        return lado * lado;
	    }

	    public double calcularPerimetro() {
	        return 4 * lado;
	    }
	}
}
	

	
	
	
