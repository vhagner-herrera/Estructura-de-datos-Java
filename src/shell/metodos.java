package shell;

import java.util.Comparator;

public class metodos {

    public void ordenamiento_shell( int [] numero, boolean orden){
        for (int i=numero.length/2; i>0; i/=2){
            for (int j=i; j<numero.length; j++){
                int temp = numero[j];
                int k;

                if (orden){
                    for (k=j;k>=i && numero[k-i]>temp;k-=i){
                        numero[k]=numero[k-i];
                    }
                }else {
                    for (k=j;k>=i && numero[k-i]<temp;k-=i){
                        numero[k]=numero[k-i];
                    }
                }
                numero[k]=temp;
            }
        }
    }
    public void  imprimir(int [] numero){
        for (int i=0;i<numero.length; i++){
            System.out.println(numero[i]);
        }
    }
    public void ordenamiento_shell(String[] cadenas, boolean orden) {
        for (int i = cadenas.length / 2; i > 0; i /= 2) {

            for (int j = i; j < cadenas.length; j++) {
                String temp = cadenas[j];
                int k;


                if (orden) {
                    for (k = j; k >= i && cadenas[k - i].compareTo(temp) > 0; k -= i) {
                        cadenas[k] = cadenas[k - i];
                    }
                }

                else {
                    for (k = j; k >= i && cadenas[k - i].compareTo(temp) < 0; k -= i) {
                        cadenas[k] = cadenas[k - i];
                    }
                }
                cadenas[k] = temp;
            }
        }
    }
    public void  imprimirc(String [] cadenas){
        for (int i=0;i<cadenas.length; i++){
            System.out.println(cadenas[i]);
        }
    }
    public void ordenamiento_shell(persona[] personas, boolean orden) {
        for (int i = 0; i < personas.length - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < personas.length; j++) {
                if (orden) {
                    if (personas[j].getNombre().compareTo(personas[indice].getNombre()) < 0) {
                        indice = j;
                    }
                } else {
                    if (personas[j].getNombre().compareTo(personas[indice].getNombre()) > 0) {
                        indice = j;
                    }
                }
            }
            persona temp = personas[indice];
            personas[indice] = personas[i];
            personas[i] = temp;
        }
    }
    public void ordenamiento_shell(persona[] personas, boolean orden, Comparator<persona> comparator) {
        for (int i = 0; i < personas.length - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < personas.length; j++) {
                if (orden) {
                    // Ascendente según el criterio del Comparator
                    if (comparator.compare(personas[j], personas[indice]) < 0) {
                        indice = j;
                    }
                } else {
                    // Descendente según el criterio del Comparator
                    if (comparator.compare(personas[j], personas[indice]) > 0) {
                        indice = j;
                    }
                }
            }
            // Intercambiar las posiciones
            persona temp = personas[indice];
            personas[indice] = personas[i];
            personas[i] = temp;
        }
    }
    public void  imprimiro(persona [] personas){
        for (int i=0;i<personas.length; i++){
            System.out.println(personas[i]);
        }
    }







}
