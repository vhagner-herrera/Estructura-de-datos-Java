package quicksort;

import java.util.Comparator;

public class orden_quicksort {
    metodos metod = new metodos();
    Scanner sc = new Scanner(System.in);
    public void numeros(){
        System.out.println("Ingrese la cantidad de números a ingresar: ");
        int datos = sc.nextInt();

        int[] numeros = new int[datos];


        for (int k = 0; k < numeros.length; k++) {
            System.out.print("Ingrese el número " + (k + 1) + ": ");
            numeros[k] = sc.nextInt();
        }


        System.out.println("¿Desea ordenar de manera ascendente? (true/false): ");
        boolean ascendente = sc.nextBoolean();


        metod.ordenamiento_quicksorft(numeros, 0, numeros.length - 1, ascendente);


        System.out.println("Números ordenados: ");
        metod.imprimir(numeros);
    }
    public void cadenas(){
        System.out.println("Ingrese la cantidad de nombres a ordenar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        String[] nombres = new String[cantidad];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        System.out.println("¿Desea ordenar de manera ascendente (A-Z)? (true/false): ");
        boolean ascendente = sc.nextBoolean();


        metod.ordenamiento_quicksorft(nombres, 0, nombres.length - 1, ascendente);


        System.out.println("Nombres ordenados:");
        metod.imprimir(nombres);

    }
    public void objetos(){
        System.out.println("Ingrese la cantidad de personas a ordenar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        persona[] personas = new persona[cantidad];
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese la edad de " + nombre + ": ");
            int edad = sc.nextInt();
            sc.nextLine();

            personas[i] = new persona(nombre, edad);
        }

        System.out.println("¿Desea ordenar por nombre (1) o por edad (2)?: ");
        int criterio = sc.nextInt();

        System.out.println("¿Desea ordenar de manera ascendente (true) o descendente (false)?: ");
        boolean ascendente = sc.nextBoolean();

        Comparator<persona> comparator;
        if (criterio == 1) {
            comparator = new Comparator<persona>() {
                @Override
                public int compare(persona p1, persona p2) {
                    return p1.getNombre().compareTo(p2.getNombre());
                }
            };
        } else if (criterio == 2) {
            comparator = new Comparator<persona>() {
                @Override
                public int compare(persona p1, persona p2) {
                    return Integer.compare(p1.getEdad(), p2.getEdad());
                }
            };
        } else {
            throw new IllegalArgumentException("Criterio no válido. Use 1 para nombre o 2 para edad.");
        }


        metod.ordenamiento_quicksorft(personas, 0, personas.length - 1, ascendente, comparator);


        System.out.println("Personas ordenadas:");
        metod.imprimir(personas);
    }
}
