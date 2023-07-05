package Interface14;

public class Circulo implements Figura,Dibujar,Rotar {

	
	double r;
	

	public Circulo(double r) {
		this.r=r;
		
	}

	@Override
	public void dibujar() {
		System.out.println("vas a dibujar");
		
	}

	@Override
	public double calcularArea() {
		double pi=3.141516;
		double result= pi*r*r;
		return result;
	}

	@Override
	public void rodar() {
		System.out.println("Usted va a rodar");
		
	}

}
