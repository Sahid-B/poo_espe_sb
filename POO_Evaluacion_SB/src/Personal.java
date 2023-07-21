
import java.util.Date;

abstract class Personal {
	//Variables
    private String nombre;
    private String cedula;
    private Date fechaNacimiento;
    private char genero; // 'H' para hombre, 'M' para mujer
    private String nacionalidad;
    private int merito;
//constructor
    public Personal(String nombre, String cedula, Date fechaNacimiento, char genero, String nacionalidad, int merito) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.merito = merito;
    }

//Metodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getMerito() {
        return merito;
    }

    
    public abstract double calcularSueldoBase();

    
    public double calcularBono() {
        return merito * 0.01 * calcularSueldoBase();
    }
}
