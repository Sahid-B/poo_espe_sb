package Interface14;

public class Rectangulo implements Figura, Dibujar {

	double A;
	double B;
	
	
	
	public Rectangulo(double A, double B) {
	this.A=A;
	this.B=B;
		
		
	}
	
	
	@Override
	public void dibujar() {
		System.out.println("Vas a dibujar ");
		
	}

	@Override
	public double calcularArea() {
		double result= B*A;
		return result;
	}
}
