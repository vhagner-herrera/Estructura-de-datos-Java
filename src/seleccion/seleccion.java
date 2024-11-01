package seleccion;

import java.util.Scanner;

public class seleccion {
    orden_seleccion selec= new orden_seleccion();
    Scanner sc = new Scanner(System.in);
    public void ordenamientoseleccion(){
        System.out.println("que desea ordenar:\n"+
                "1: Numeros:\n"+
                "2: cadenas:\n"+
                "3: Objetos:\n ");
        int opcionb=sc.nextInt();

        switch (opcionb){
            case 1:
                System.out.println("numeros");
                System.out.println("========================================");
                selec.numeros();
                break;

            case 2:
                System.out.println("Cadenas: ");
                System.out.println("========================================");
                selec.cadenas();

                break;
            case 3:
                System.out.println("objetos: ");
                System.out.println("========================================");
                selec.objetos();

                break;
        }
    }
}
