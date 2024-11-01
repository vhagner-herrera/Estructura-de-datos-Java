package shell;

import java.util.Scanner;

public class shell {
    ordenamiento_shell shel= new ordenamiento_shell();
    Scanner sc = new Scanner(System.in);
    public void ordenamientoshell(){
        System.out.println("que desea ordenar:\n"+
                "1: Numeros:\n"+
                "2: cadenas:\n"+
                "3: Objetos:\n ");
        int opcionb=sc.nextInt();

        switch (opcionb){
            case 1:
                System.out.println("numeros");
                System.out.println("========================================");
                shel.numeros();
                break;

            case 2:
                System.out.println("Cadenas: ");
                System.out.println("========================================");
                shel.cadenas();

                break;
            case 3:
                System.out.println("objetos: ");
                System.out.println("========================================");
                shel.objetos();

                break;
        }
    }
}
