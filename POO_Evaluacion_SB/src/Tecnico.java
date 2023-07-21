import java.util.Date;
class Tecnico extends Personal {
    private String areaTecnica;
  //Constructor de la clase 
    public Tecnico(String nombre, String cedula, Date fechaNacimiento, char genero, String nacionalidad, int merito,
                   String areaTecnica) {
        super(nombre, cedula, fechaNacimiento, genero, nacionalidad, merito);
        this.areaTecnica = areaTecnica;
    }

    // Getters y Setters

    public String getAreaTecnica() {
        return areaTecnica;
    }

    @Override
    public double calcularSueldoBase() {
        return 400; // Sueldo base para todos los empleados
    }
}