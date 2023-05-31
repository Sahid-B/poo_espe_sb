import java.util.ArrayList;
import java.util.Scanner;

public class Evaluacion_U1_Said_V {
	
	//clases usadas en el codigo de profesor
	class Profesor {
	    String cedula;
	    String nombre;
	    String direccion;
	    String telefono;
	    String celular;

	    
	    public Profesor(String cedula, String nombre, String direccion, String telefono, String celular) {
	        this.cedula = cedula;
	        this.nombre = nombre;
	        this.direccion = direccion;
	        this.telefono = telefono;
	        this.celular = celular;
	    }
	}
//clases usadas en alumnos 
	
	class Alumno {
	    String nombre;
	    String genero;
	    ArrayList<Materia> materias;

	    public Alumno(String nombre, String genero) {
	        this.nombre = nombre;
	        this.genero = genero;
	        this.materias = new ArrayList<>();
	    }
	}
	//clases usadas en materias 
	class Materia {
	    String nombre;
	    Profesor profesor;

	    public Materia(String nombre, Profesor profesor) {
	        this.nombre = nombre;
	        this.profesor = profesor;
	    }
	}
	//clases usadas en matricula
	class Matricula {
	    Profesor profesor;
	    Alumno alumno;
	    Materia materia;

	    public Matricula(Profesor profesor, Alumno alumno, Materia materia) {
	        this.profesor = profesor;
	        this.alumno = alumno;
	        this.materia = materia;
	    }
	}
}


