import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class PRINCIPAL {
	private String bono;
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 System.out.println("=============================BIENVENIDO=====================");
		 System.out.println("============================SAHID BOSQUEZ====================");
		 System.out.println("===================SISTEMA DE ADMINISTRADOR DE PERSONAL==================");
		 System.out.println("Bienvenido al sistema de administrador de personal.");
		 //Ingresa los datos del empleado 
	        System.out.print("Ingrese su nombre: ");
	        String nombre = scanner.nextLine();
	        System.out.print("Ingrese su cédula: ");
	        String cedula = scanner.nextLine();
	        System.out.print("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
	        Date fechaNacimiento = dateFormat.parse(scanner.nextLine());
	        System.out.print("Ingrese su género (H/M): ");
	        char genero = scanner.nextLine().charAt(0);
	        System.out.print("Ingrese su nacionalidad: ");
	        String nacionalidad = scanner.nextLine();
	        System.out.print("Ingrese su mérito (valor numérico del 1 al 100): ");
	        int merito = Integer.parseInt(scanner.nextLine());
	        System.out.print("Ingrese su sueldo básico: ");
	        double sueldoBasico = Double.parseDouble(scanner.nextLine());
	        Personal empleado;
	        MetodosDePago metodosDePago = new MetodosDePago();
	        //seleccionas de que clase es el empleado 
	        System.out.println("\nSeleccione una categoría:");
	        System.out.println("1. Docente");
	        System.out.println("2. Administrativo");
	        System.out.println("3. Limpieza");
	        System.out.println("4. Técnico");
	        int opcion = Integer.parseInt(scanner.nextLine());
			 System.out.println("===================ELIGE UNA OPCION:==================");
	        switch (opcion) {
	        case 1:
                System.out.print("Ingrese el nivel técnico: " +"Nivel:  ");
                String nivelTecnico = scanner.nextLine();
                System.out.print("Ingrese el área: ");
                String area = scanner.nextLine();
                empleado = new Docente(nombre, cedula, fechaNacimiento, genero, nacionalidad, merito, nivelTecnico, area);
                break;
            case 2:
                System.out.print("Ingrese el número de personas a cargo: ");
                int personasACargo = Integer.parseInt(scanner.nextLine());
                empleado = new Administrativo(nombre, cedula, fechaNacimiento, genero, nacionalidad, merito, personasACargo);
                break;
            case 3:
                System.out.print("Ingrese los materiales que maneja: ");
                String materiales = scanner.nextLine();
                empleado = new Limpieza(nombre, cedula, fechaNacimiento, genero, nacionalidad, merito, materiales);
                break;
            case 4:
                System.out.print("Ingrese el área técnica: ");
                String areaTecnica = scanner.nextLine();
                empleado = new Tecnico(nombre, cedula, fechaNacimiento, genero, nacionalidad, merito, areaTecnica);
                break;
            default:
                System.out.println("Las opciones van del 1-4 wazaaa");
                return;
	        }
	        //retorna mosttrando los datos ingresados del empleado :)
	        System.out.print("Razon del bono:");
	        String bono =  scanner.nextLine();
	        System.out.print("Ingrese el porcentaje del bono (1 - 100%): ");
	        double bonus = Double.parseDouble(scanner.nextLine()) / 100;
	        System.out.println("=================\nDetalle del empleado: ======================");
	        System.out.println("Nombre: " + empleado.getNombre());
	        System.out.println("Cédula: " + empleado.getCedula());
	        System.out.println("Fecha de Nacimiento: " + dateFormat.format(empleado.getFechaNacimiento()));
	        System.out.println("Género: " + empleado.getGenero());
	        System.out.println("Nacionalidad: " + empleado.getNacionalidad());
	       
	        System.out.println("Mérito: " + empleado.getMerito());
	        System.out.println("Sueldo Básico: " + sueldoBasico);
	        System.out.println("Bono Total: " + metodosDePago.calcularBono(empleado, bonus));
	        scanner.close();
	    }
	}

	