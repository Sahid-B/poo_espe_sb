package p13;

public class Circulo extends figura {

double r;
public Circulo () {
}
	public Circulo(double r, double x, double y) {
	super(x, y);
	this.r=r;
}
	@Override
	public double calcularArea() {	
		double pi=3.1416;
		double result = pi*r*r;
		return result;
	}
	}


