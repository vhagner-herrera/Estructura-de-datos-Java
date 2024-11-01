package busqueda_sec;

import java.util.Scanner;

public class busqueda_sec {

    Scanner sc = new Scanner(System.in);

    orden_secuencial sec = new orden_secuencial();
    public void busueda_secuencial(){
        System.out.println("que buscar ordenar:\n"+
                "1: Numeros:\n"+
                "2: cadenas:\n"+
                "3: Objetos:\n ");
        int opcionb=sc.nextInt();

        switch (opcionb){
            case 1:
                System.out.println("numeros");
                System.out.println("========================================");
                sec.numeros();
                break;
            case 2:
                System.out.println("Cadenas: ");
                System.out.println("========================================");
                //orden.cadenas();
                break;
            case 3:
                System.out.println("objetos: ");
                System.out.println("========================================");
                // orden.objetos();
                break;
        }
    }


}
