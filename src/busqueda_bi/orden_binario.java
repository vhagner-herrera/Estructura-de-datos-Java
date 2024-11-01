package busqueda_bi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class orden_binario {


    public static void main(String[] args) {


        System.out.println("====================================");

        LinkedList<String> nombres = new LinkedList<>();

        // Agregar elementos al LinkedList
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");

        // Mostrar todos los elementos del LinkedList
        System.out.println("Nombres en LinkedList:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Agregar elementos al principio y al final
        nombres.addFirst("Carlos"); // Agrega al inicio
        nombres.addLast("Ana");     // Agrega al final

        // Mostrar después de agregar elementos en diferentes posiciones
        System.out.println("Después de agregar elementos al principio y al final:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Eliminar el primer y último elemento
        nombres.removeFirst();
        nombres.removeLast();

        // Mostrar después de la eliminación
        System.out.println("Después de eliminar el primer y último elemento:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }


    public static void retorno(){
        Scanner sc = new Scanner(System.in);

        String producto;
        double precio;
        boolean dato=true;
        ArrayList<metodos> datos= new ArrayList<>();
        do{



            System.out.println("ingrese el nombre del producto:");
            producto=sc.nextLine();

            System.out.println("ingrese la cantidad del producto");
            precio= sc.nextDouble();
            sc.nextLine();

            datos.add(new metodos(producto,precio));

            System.out.println("quere seguir agregarndo datos (true/false)");
            dato=sc.nextBoolean();
            sc.nextLine();




        }while(dato);

        for (int i=0; i<datos.size(); i++){
            System.out.println(datos.get(i));
        }



    }
}
