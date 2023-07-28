package POO_Prueba2;

class Superman extends Superheroe {
    int nivelRayoLaser;

    public Superman(String nombre, int edad, int nivelRayoLaser) {
        super(nombre, edad, "Rayo Láser");
        this.nivelRayoLaser = nivelRayoLaser;
    }
  //sobreescritura de la clase
    @Override
    public void mostrarPoder() {
        System.out.println("Soy " + nombre + ", mi rayo láser está en nivel " + nivelRayoLaser + ".");
    }

	public int getNivelRayoLaser() {
		return nivelRayoLaser;
	}

	public void setNivelRayoLaser(int nivelRayoLaser) {
		this.nivelRayoLaser = nivelRayoLaser;
	}
}