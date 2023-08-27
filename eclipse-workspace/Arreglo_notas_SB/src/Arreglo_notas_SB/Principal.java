package Arreglo_notas_SB;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
	GestionNotas gnotas=new GestionNotas();
	int op;
	Scanner sc=new Scanner(System.in);
	
	double notas;
	
	 do {
		 
		 System.out.println("1. Añadir notas");
		 System.out.println("2. ver promedio");
		 System.out.println("3. ver aprobado");
		 System.out.println("4. Salir");
		 
		 
		 
		 
	op=Integer.parseInt(sc.nextLine());
	
	 }while(op!=4);
	

	switch(op) {
	case 1:
		System.out.println("Ingresar notas");
		notas=Double.parseDouble(sc.nextLine());
		gnotas.guardarNota(notas);
		break;
		
	case 2:
		System.out.println("La media es: "+ gnotas.media());
		break;
		
	case 3:
		System.out.println("Aprobados"+gnotas.aprobados());
		break;
		
	case 4:
		System.out.println("Gracias");
		
		
	
	}
}
}
