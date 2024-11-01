package busqueda_sec;

import java.util.Scanner;

public class metodos {
    Scanner sc = new Scanner(System.in);
    public void numeros(int []datos) {
        for (int i = 0; i < datos.length - 1; i++) {
            for (int j = 0; j < datos.length - i - 1; j++) {
                if (datos[j] > datos[j + 1]) {
                    int temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                }

            }
        }

        System.out.println("los numeros ordenados ascendentemente son: ");
        for (int i=0; i<datos.length;i++){
            System.out.println(datos[i]);

        }
        System.out.println("ingrese dato a buscar:");
        int buscar= sc.nextInt();
        boolean encontrado = false;

        for (int i=0;i<datos.length; i++){
            if (datos[i]==buscar){
                System.out.println("numero "+buscar+" encontrado" +i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("numero no encontrado: ");
        }


    }}
