package PRINCIPAL;

import burbuja.burbuja;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        burbuja ordenamiento_burbuja = new burbuja();

        System.out.println("===============================================");
        System.out.println("\t \t \t\t Bienvenido");
        System.out.println("===============================================\n");
        System.out.print("Elige una opcion: \n"+
                "1: metodo Burbuja\n"+
                "2: metodo seleccion\n"+
                "3: metodo insercion\n"+
                "4: metodo shell\n" +
                "5: quicksort\n"+
                "6: Búsqueda Secuencial\n"+
                "7: Búsqueda binaria\n"+
                "8: uso de Arreglos\n"+
                "9: uso de Matrices\n"+
                "10: uso de Listas\n"+
                "11: uso de Pilas\n" +
                "12: uso de Colas\n"+
                "13: uso de Arboles\n"+
                "14: uso de Grafos\n"+
                "=============================\n"+
                "15: programacion funcional \n"+
                "=============================\n");

        int opcion=sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("========================================");
                System.out.println("\t Bienvenido al metodo Burbuja: ");
                System.out.println("========================================");
                ordenamiento_burbuja.ordenamientoburbuja();
                break;

            case 2:
                System.out.println("========================================");
                System.out.println("Bienvenido al metodo seleccion: ");
                System.out.println("========================================");
//                selec.ordenamientoseleccion();
                break;

            case 3:
                System.out.println("========================================");
                System.out.println("Bienvenido al metodo insercion: ");
                System.out.println("========================================");
//                inser.ordenamientoseleccion();

                break;

            case 4:
                System.out.println("========================================");
                System.out.println("Bienvenido al metodo shell: ");
                System.out.println("========================================");
//                she.ordenamientoshell();

                break;

            case 5:
                System.out.println("========================================");
                System.out.println("Bienvenido al metodo quicksort: ");
                System.out.println("========================================");
//                quic.ordenamientoquicksort();

                break;

            case 6:
                System.out.println("========================================");
                System.out.println("Bienvenido al metodo Búsqueda Secuencial: ");
                System.out.println("========================================");
//                secu.busueda_secuencial();

                break;

            case 7:
                System.out.println("========================================");
                System.out.println("Bienvenido al metodo Búsqueda binaria: ");
                System.out.println("========================================");

                break;

            case 8:
                System.out.println("========================================");
                System.out.println("Bienvenido al uso de arreglos: ");
                System.out.println("========================================");

                break;
            case 9:
                System.out.println("========================================");
                System.out.println("Bienvenido al uso de matrices: ");
                System.out.println("========================================");

                break;

            case 10:
                System.out.println("========================================");
                System.out.println("Bienvenido al uso de listas: ");
                System.out.println("========================================");

                break;
            case 11:
                System.out.println("========================================");
                System.out.println("Bienvenido al uso de pilas: ");
                System.out.println("========================================");

                break;

            case 12:
                System.out.println("========================================");
                System.out.println("Bienvenido al uso de colas: ");
                System.out.println("========================================");

                break;

            case 13:
                System.out.println("========================================");
                System.out.println("Bienvenido al uso de arboles: ");
                System.out.println("========================================");

                break;

            case 14:
                System.out.println("========================================");
                System.out.println("Bienvenido al uso de grafos: ");
                System.out.println("========================================");

                break;

            case 15:
                System.out.println("========================================");
                System.out.println("Programacion funcional: ");
                System.out.println("========================================");
//                funcional.programacion_funcional();



        }

    }
}