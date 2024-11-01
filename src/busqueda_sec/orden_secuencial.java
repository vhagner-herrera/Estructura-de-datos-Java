package busqueda_sec;

import java.util.Scanner;

public class orden_secuencial {
    metodos metod = new metodos();
    Scanner sc = new Scanner(System.in);
    public void numeros(){
        System.out.println("ingrese la cantidad de numeros a ingresar: ");
        int cantidad=sc.nextInt();

        int [] datos= new int [cantidad];
        for (int i=0; i<datos.length;i++){
            System.out.println("ingrese numero "+(i+1)+":");
            datos[i]=sc.nextInt();
        }
        metod.numeros(datos);

    }
}
