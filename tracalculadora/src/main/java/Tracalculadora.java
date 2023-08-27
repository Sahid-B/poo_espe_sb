import java.util.Scanner;

public class Tracalculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el valor de a: ");
            int a = scanner.nextInt();
            
            System.out.print("Ingrese el valor de b: ");
            int b = scanner.nextInt();
            
            int opcion;
            do {
                System.out.println("\nMenú de opciones:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.print("Selecciona una opción: ");
                opcion = scanner.nextInt();
                
                Operaciones2 operaciones = new Operaciones2();
                switch (opcion) {
                    case 1 -> System.out.println("Resultado: " + operaciones.suma(a, b));
                    
                    case 2 -> System.out.println("Resultado: " + operaciones.resta(a, b));
                    
                    case 3 -> System.out.println("Resultado: " + operaciones.multiplicacion(a, b));
  
                    case 4 -> System.out.println("Resultado: " + operaciones.division(a, b));
                    
                }
            } while (opcion != 5);
        }
    }
}
