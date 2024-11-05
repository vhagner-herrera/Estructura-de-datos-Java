package shell;

import java.util.Comparator;
import java.util.Scanner;

public class ordenamiento_shell {
    Scanner sc = new Scanner(System.in);
    metodos metod= new metodos();
    public void numeros(){
        System.out.println("ingrese la cantidad de numeros a ingresar: ");
        int datos = sc.nextInt();

        int numeros []= new int[datos];

        for (int k=0; k<numeros.length;k++){
            System.out.print("ingresa numero : "+(k+1)+"= ");
            numeros[k]=sc.nextInt();
        }
        System.out.println("¿Desea ordenar de manera ascendente? (true/false): ");
        boolean ascendente = sc.nextBoolean();

        metod.ordenamiento_shell(numeros, ascendente);
        System.out.println("numeros ordenados: ");
        metod.imprimir(numeros);
    }
    public void cadenas(){
        System.out.println("Ingrese la cantidad de nombres a ordenar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        String[] nombres = new String[cantidad];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ":");
            nombres[i] = sc.nextLine();
        }

        System.out.println("¿Desea ordenar de manera ascendente (A-Z)? (true/false): ");
        boolean ascendente = sc.nextBoolean();

        metod.ordenamiento_shell(nombres,ascendente);
        System.out.println("Nombres ordenados:");
        metod.imprimirc(nombres);

    }
    public void objetos(){

        System.out.println("Ingrese la cantidad de personas a ordenar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        persona[] personas = new persona[cantidad];
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ":");
            String nombre = sc.nextLine();

            System.out.print("Ingrese la edad de " + nombre + ":");
            int edad = sc.nextInt();
            sc.nextLine();

            personas[i] = new persona(nombre, edad);
        }


        System.out.println("¿Desea ordenar por nombre (1) o por edad (2)?: ");
        int criterio = sc.nextInt();


        System.out.println("¿Desea ordenar de manera ascendente (true) o descendente (false)?: ");
        boolean ascendente = sc.nextBoolean();

        if (criterio == 1) {
            metod.ordenamiento_shell(personas, ascendente);
        } else if (criterio == 2) {
            metod.ordenamiento_shell(personas, ascendente, new Comparator<persona>() {
                @Override
                public int compare(persona p1, persona p2) {

                    return Integer.compare(p1.getEdad(), p2.getEdad());
                }
            });
        }
        System.out.println("Personas ordenadas:");
        metod.imprimiro(personas);





    }
}
