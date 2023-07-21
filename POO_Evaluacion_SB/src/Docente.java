import java.util.Date;
class Docente extends Personal {
    private String nivelTecnico;
    private String area;
  //Constructor de la clase 
    public Docente(String nombre, String cedula, Date fechaNacimiento, char genero, String nacionalidad, int merito,
                   String nivelTecnico, String area) {
        super(nombre, cedula, fechaNacimiento, genero, nacionalidad, merito);
        this.nivelTecnico = nivelTecnico;
        this.area = area;
    }

    // Getters y Setters

    public String getNivelTecnico() {
        return nivelTecnico;
    }

    public String getArea() {
        return area;
    }

    @Override
    public double calcularSueldoBase() {
        return 400 ; // Sueldo base para todos los empleados 
    }
}
