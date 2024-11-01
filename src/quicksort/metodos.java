package quicksort;

import java.util.Comparator;

public class metodos {


    ////////////////////////////////Numeros///////////////////////////////7
    public void ordenamiento_quicksorft(int[] numero, int bjo, int alto, boolean orden) {
        if (bjo < alto) {
            int pi = particion(numero, bjo, alto, orden);
            ordenamiento_quicksorft(numero, bjo, pi - 1, orden);
            ordenamiento_quicksorft(numero, pi + 1, alto, orden);
        }
    }


    private int particion(int[] numero, int bjo, int alto, boolean orden) {
        int pivote = numero[alto];
        int i = bjo - 1;

        for (int j = bjo; j < alto; j++) {
            if (orden ? numero[j] < pivote : numero[j] > pivote) {
                i++;

                int temp = numero[i];
                numero[i] = numero[j];
                numero[j] = temp;
            }
        }

        int temp = numero[i + 1];
        numero[i + 1] = numero[alto];
        numero[alto] = temp;

        return i + 1;
    }


    public void imprimir(int[] numero) {
        for (int num : numero) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    ////////////////////////////////cadenas///////////////////////////////7
    public void ordenamiento_quicksorft(String[] cadenas, int bjo, int alto, boolean orden) {
        if (bjo < alto) {
            int pi = particion(cadenas, bjo, alto, orden);
            ordenamiento_quicksorft(cadenas, bjo, pi - 1, orden);
            ordenamiento_quicksorft(cadenas, pi + 1, alto, orden);
        }
    }


    private int particion(String[] cadenas, int bjo, int alto, boolean orden) {
        String pivote = cadenas[alto];
        int i = bjo - 1;

        for (int j = bjo; j < alto; j++) {

            if (orden ? cadenas[j].compareTo(pivote) < 0 : cadenas[j].compareTo(pivote) > 0) {
                i++;

                String temp = cadenas[i];
                cadenas[i] = cadenas[j];
                cadenas[j] = temp;
            }
        }


        String temp = cadenas[i + 1];
        cadenas[i + 1] = cadenas[alto];
        cadenas[alto] = temp;

        return i + 1;
    }


    public void imprimir(String[] cadenas) {
        for (String cadena : cadenas) {
            System.out.print(cadena + " ");
        }
        System.out.println();
    }

    ////////////////////////////////Objetos///////////////////////////////7

    public void ordenamiento_quicksorft(persona[] personas, int bjo, int alto, boolean ascendente, Comparator<persona> comparator) {
        if (bjo < alto) {
            int pi = particion(personas, bjo, alto, ascendente, comparator);
            ordenamiento_quicksorft(personas, bjo, pi - 1, ascendente, comparator);
            ordenamiento_quicksorft(personas, pi + 1, alto, ascendente, comparator);
        }
    }


    private int particion(persona[] personas, int bjo, int alto, boolean ascendente, Comparator<persona> comparator) {
        persona pivote = personas[alto];
        int i = bjo - 1;

        for (int j = bjo; j < alto; j++) {
            int comparison = ascendente ? comparator.compare(personas[j], pivote) : comparator.compare(pivote, personas[j]);
            if (comparison < 0) {
                i++;

                persona temp = personas[i];
                personas[i] = personas[j];
                personas[j] = temp;
            }
        }

        persona temp = personas[i + 1];
        personas[i + 1] = personas[alto];
        personas[alto] = temp;

        return i + 1;
    }


    public void imprimir(persona[] personas) {
        for (persona persona : personas) {
            System.out.println(persona);
        }
    }

}
