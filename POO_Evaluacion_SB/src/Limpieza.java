import java.util.Date;
class Limpieza extends Personal {
    private String materiales;
//Constructor de la clase 
    public Limpieza(String nombre, String cedula, Date fechaNacimiento, char genero, String nacionalidad,
                    int merito, String materiales) {
        super(nombre, cedula, fechaNacimiento, genero, nacionalidad, merito);
        this.materiales = materiales;
    }

    // Getters y Setters

    public String getMateriales() {
        return materiales;
    }

    @Override
    public double calcularSueldoBase() {
        return 400; // Sueldo base para todos los empleados
    }
}