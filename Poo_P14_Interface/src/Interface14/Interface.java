package Interface14;

import java.util.Scanner;
public class Interface {
	

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int opcion;
		        do {
		            System.out.println("Menú:");
		            System.out.println("1. Crear un cuadrado");
		            System.out.println("2. Crear un círculo");
		            System.out.println("3. Crear un rectángulo");
		            System.out.println("4. Salir");
		            System.out.print("Introduce una opción: ");
		            opcion = sc.nextInt();
		            switch (opcion) {
		                case 1:
		                    System.out.print("Introduce la longitud del lado del cuadrado: ");
		                    double lado = sc.nextDouble();
		                    Cuadrado cuadrado = new Cuadrado(lado);
		                    System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
		                    cuadrado.dibujar();
		                    break;
		                case 2:
		                    System.out.print("Introduce el radio del círculo: ");
		                    double radio = sc.nextDouble();
		                    Circulo circulo = new Circulo(radio);
		                    System.out.println("El área del círculo es: " + circulo.calcularArea());
		                    circulo.dibujar();
		                    circulo.rodar();
		                    break;
		                case 3:
		                    System.out.print("Introduce el ancho del rectángulo: ");
		                    double ancho = sc.nextDouble();
		                    System.out.print("Introduce la altura del rectángulo: ");
		                    double altura = sc.nextDouble();
		                    Rectangulo rectangulo = new Rectangulo(ancho, altura);
		                    System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
		                    rectangulo.dibujar();
		                    break;
		                case 4:
		                    System.out.println("Saliendo...");
		                    break;
		                default:
		                    System.out.println("Opción no válida. Por favor, inténtalo de nuevo.");
		            }
		        } while (opcion != 4);
		        sc.close();
		    }
		}
