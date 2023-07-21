

import java.util.Date;
class Administrativo extends Personal {
    private int personasACargo;
  //Constructor de la clase 
    public Administrativo(String nombre, String cedula, Date fechaNacimiento, char genero, String nacionalidad,
                          int merito, int personasACargo) {
        super(nombre, cedula, fechaNacimiento, genero, nacionalidad, merito);
        this.personasACargo = personasACargo;
    }

    // Getters y Setters

    public int getPersonasACargo() {
        return personasACargo;
    }

    @Override
    public double calcularSueldoBase() {
        return 400; // Sueldo base para todos los empleados
    }
}