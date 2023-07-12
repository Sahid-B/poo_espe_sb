package LABSB;
//importar los paquetes necesarios 
 import java.util.ArrayList;
import java.util.Scanner;
public class PRINCIPAL {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        int opcion;

        do {
        	//menu de opciones a elegir 
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
            //elegir alguna opcion
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Agregar producto
                	//ingreso del producto 
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.next();
                    //ingreso del precio que llevara el producto 
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    //producto 1 o 2
                    System.out.print("Es un producto estándar (1) o ofertado (2)? ");
                    int tipoProducto = scanner.nextInt();
                    if (tipoProducto == 1) {
                        System.out.print("Ingrese la sección del producto: ");
                        String seccion = scanner.next();
                        productos.add(new ProductoEstandar(nombre, precio, seccion));
                    } else if (tipoProducto == 2) {
                    	// ingresar los dias d eoferta para q se aplique los 10 o 15 o 20 % de descuento 
                        System.out.print("Ingrese los días restantes de la oferta: ");
                        int dias = scanner.nextInt();
                        productos.add(new ProductoOfertado(nombre, precio, dias));
                    } else {
                        System.out.println("Opción inválida. Intente de nuevo.");
                    }
                    break;
                case 2:
                    // Mostrar productos
                    for (Producto producto : productos) {
                        System.out.println(producto.getNombre() + " - Precio: " + producto.getPrecio());
                    }
                    break;
                case 3:
                    // Salir del menú
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Las opciones van de 1-3");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }
}