package POO_Prueba2;

class Spiderman extends Superheroe {
    int cantidadTelaranas;
//constructor
    public Spiderman(String nombre, int edad, int cantidadTelaranas) {
        super(nombre, edad, "Telarañas");
        this.cantidadTelaranas = cantidadTelaranas;
    }
//sobreescritura de la clase
    @Override
    public void mostrarPoder() {
        System.out.println("Soy " + nombre + ", puedo lanzar " + cantidadTelaranas + " telarañas.");
    }

	public int getCantidadTelaranas() {
		return cantidadTelaranas;
	}

	public void setCantidadTelaranas(int cantidadTelaranas) {
		this.cantidadTelaranas = cantidadTelaranas;
	}
}