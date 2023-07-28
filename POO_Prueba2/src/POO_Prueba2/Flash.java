package POO_Prueba2;

class Flash extends Superheroe {
    int kmRecorridos;

    public Flash(String nombre, int edad, int kmRecorridos) {
        super(nombre, edad, "Velocidad");
        this.kmRecorridos = kmRecorridos;
    }
  //sobreescritura de la clase
    @Override
    public void mostrarPoder() {
        System.out.println("Soy " + nombre + ", he recorrido " + kmRecorridos + " kilómetros.");
    }

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
}