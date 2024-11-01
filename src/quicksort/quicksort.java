package quicksort;

import java.util.Scanner;

public class quicksort {
    orden_quicksort quick = new orden_quicksort();
    Scanner sc = new Scanner(System.in);
    public void ordenamientoquicksort(){
        System.out.println("que desea ordenar:\n"+
                "1: Numeros:\n"+
                "2: cadenas:\n"+
                "3: Objetos:\n ");
        int opcionb=sc.nextInt();

        switch (opcionb){
            case 1:
                System.out.println("numeros");
                System.out.println("========================================");
                quick.numeros();
                break;

            case 2:
                System.out.println("Cadenas: ");
                System.out.println("========================================");
                quick.cadenas();

                break;
            case 3:
                System.out.println("objetos: ");
                System.out.println("========================================");
                quick.objetos();

                break;
        }
    }
}

