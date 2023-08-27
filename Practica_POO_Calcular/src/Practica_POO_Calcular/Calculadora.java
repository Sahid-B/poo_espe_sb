package Practica_POO_Calcular;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        while (option != 0) {
            System.out.println("Seleccione una figura:");
            System.out.println("1. Calcular el area y perimetro Cuadrado");
            System.out.println("2. Calcular el area y perimetro Rectángulo");
            System.out.println("3. Calcular el area y perimetro Triángulo");
            System.out.println("4. Calcular el area y perimetro Pentágono");
            System.out.println("5. Salir");
            option = scanner.nextInt();
            switch (option) {
	
	case 1:
		System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);
        System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
        System.out.println("El perímetro del cuadrado es: " + cuadrado.calcularPerimetro());
		break;
		
		
   case 2:
	   System.out.println("Ingrese la base del rectángulo:");
       double base = scanner.nextDouble();
       System.out.println("Ingrese la altura del rectángulo:");
       double altura = scanner.nextDouble();
       Rectangulo rectangulo = new Rectangulo(base, altura);
       System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
       System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
       break;
		
   case 3:
	   
	   break;
	
 case 4:
	   
	   break;
       
       
       
       
       
       
       
       
       
       
       
       
	
	
   case 5:
       System.out.println("Saliendo del programa...");
       break;
   default:
       System.out.println("Las opciones son del 1-5");
       break;
}
}
scanner.close();
}
}
	
	
	
	
	
	

		
		
		
		
		
		
		
	





