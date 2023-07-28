package POO_Prueba2;
import java.util.Scanner;
public class PRINCIPAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir información sobre Spiderman
        System.out.println("Ingresa el nombre de Spiderman:");
        String nombreSpiderman = scanner.nextLine();
        System.out.println("Ingresa la edad de Spiderman:");
        int edadSpiderman = scanner.nextInt();
        System.out.println("Ingresa la cantidad de telarañas que lanza Spiderman:");
        int telaranasSpiderman = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        
        // Pedir información sobre Flash
        System.out.println("Ingresa el nombre de Flash:");
        String nombreFlash = scanner.nextLine();
        System.out.println("Ingresa la edad de Flash:");
        int edadFlash = scanner.nextInt();
        System.out.println("Ingresa la cantidad de kilómetros que ha recorrido Flash:");
        int kmFlash = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        
        // Pedir información sobre Superman
        System.out.println("Ingresa el nombre de Superman:");
        String nombreSuperman = scanner.nextLine();
        System.out.println("Ingresa la edad de Superman:");
        int edadSuperman = scanner.nextInt();
        System.out.println("Ingresa el nivel del rayo láser de Superman:");
        int nivelRayoLaserSuperman = scanner.nextInt();
        
        // Crear instancias de los superhéroes
        Spiderman spiderman = new Spiderman(nombreSpiderman, edadSpiderman, telaranasSpiderman);
        Flash flash = new Flash(nombreFlash, edadFlash, kmFlash);
        Superman superman = new Superman(nombreSuperman, edadSuperman, nivelRayoLaserSuperman);
        
        // Menú de opciones
        int opcion;
        do {
            System.out.println("\n*** Menú de opciones ***");
            System.out.println("1. Mostrar información de Spiderman");
            System.out.println("2. Mostrar información de Flash");
            System.out.println("3. Mostrar información de Superman");
            System.out.println("4. Comparar superhéroes");
            System.out.println("5. Salir");
            System.out.println("Ingrese la opción deseada:");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    spiderman.mostrarPoder();
                    break;
                case 2:
                    flash.mostrarPoder();
                    break;
                case 3:
                    superman.mostrarPoder();
                    break;
                case 4:
                    compararSuperheroes(spiderman, flash, superman);
                    break;
                case 5:
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

//Comparar los superhroes a ver quien es el mas fuerte de los 3
public static void compararSuperheroes(Superheroe... superheroes) {
    if (superheroes.length < 2) {
        System.out.println("Debes ingresar al menos dos superhéroes para comparar.");
        return;
    }

    Superheroe mejorSuperheroe = superheroes[0];
    for (int i = 1; i < superheroes.length; i++) {
        if (superheroes[i] instanceof Flash && mejorSuperheroe instanceof Flash) {
            if (((Flash) superheroes[i]).getKmRecorridos() > ((Flash) mejorSuperheroe).getKmRecorridos()) {
                mejorSuperheroe = superheroes[i];
            }
        } else if (superheroes[i] instanceof Superman && mejorSuperheroe instanceof Superman) {
            if (((Superman) superheroes[i]).getNivelRayoLaser() > ((Superman) mejorSuperheroe).getNivelRayoLaser()) {
                mejorSuperheroe = superheroes[i];
            }
        }
    }

    System.out.println("\n*** Comparación de superhéroes ***");
    System.out.println("El mejor superhéroe es: " + mejorSuperheroe.getNombre());
    System.out.println("Con la habilidad: " + mejorSuperheroe.getHabilidad());
    System.out.println("Y la edad de: " + mejorSuperheroe.getEdad());
}
}
