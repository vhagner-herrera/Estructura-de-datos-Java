package busqueda_bi;

import java.util.ArrayList;
import java.util.Scanner;

public class busqueda_bi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<metodos> productos = new ArrayList<>();

        System.out.println("ingresa la cantidad de productos: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i=0; i<cantidad; i++){
            System.out.println("ingresa el nombre del producto:");
            String nombre= scanner.nextLine();

            System.out.println("ingresa edad: ");
            double precio= scanner.nextDouble();
            scanner.nextLine();

            productos.add(new metodos(nombre,precio));

        }





        // Mostrar todos los productos
        for (metodos producto : productos) {
            System.out.println(producto);
        }

        // Eliminar un producto por índice
        productos.remove(1); // Eliminamos el segundo producto

        // Mostrar la lista de productos después de la eliminación
        System.out.println("Después de eliminar un producto:");
        for (metodos producto : productos) {
            System.out.println(producto);
        }
    }

}

