package burbuja;

import java.util.Scanner;

public class burbuja {
    Scanner sc = new Scanner(System.in);
    orden_burbuja orden = new orden_burbuja();

    public void ordenamientoburbuja(){
        System.out.println("que desea ordenar:\n"+
                "1: Numeros:\n"+
                "2: cadenas:\n"+
                "3: Objetos:\n ");
        int opcionb=sc.nextInt();

        switch (opcionb){
            case 1:
                System.out.println("numeros");
                System.out.println("========================================");
                orden.numeros();
                break;
            case 2:
                System.out.println("Cadenas: ");
                System.out.println("========================================");
                orden.cadenas();
                break;
            case 3:
                System.out.println("objetos: ");
                System.out.println("========================================");
                orden.objetos();
                break;
        }
    }
    }

