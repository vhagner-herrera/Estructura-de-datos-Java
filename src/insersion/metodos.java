package insersion;

import java.util.Comparator;

public class metodos {
    // metodo para imprimir numeros ascendentemente y descendentemente
    public void ordenamiento_insercion(int[] numero, boolean dato) {
        for (int i = 0; i < numero.length; i++) {
            int indice = numero[i];
            int j = i - 1;
            if (dato) {
                while (j >= 0 && numero[j] > indice) {
                    numero[j + 1] = numero[j];
                    j = j - 1;

                }
            } else {
                while (j >= 0 && numero[j] < indice) {
                    numero[j + 1] = numero[j];
                    j = j - 1;
                }
            }
            numero[j + 1] = indice;
        }
    }

    public void imprimir(int[] numero) {
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }

    //metodo para ordenar caracteres ascendentemente y descendentemente

    public void ordenamiento_insercion(String[] cadena, boolean dato) {
        for (int i = 0; i < cadena.length; i++) {
            String indice = cadena[i];
            int j = i - 1;
            if (dato) {
                while (j >= 0 && cadena[j].compareTo(indice) > 0) {
                    cadena[j + 1] = cadena[j];
                    j = j - 1;
                }
            } else {
                while (j >= 0 && cadena[j].compareTo(indice) < 0) {
                    cadena[j + 1] = cadena[j];
                    j = j - 1;
                }
            }
            cadena[j + 1] = indice;
        }
    }

    public void imprimir(String[] cadena) {
        for (int i = 0; i < cadena.length; i++) {
            System.out.println(cadena[i]);
        }
    }

    // metodo para ordenar objetos de manera ascendente y descendente
    public void metodoinsersion(persona[] personas, boolean orden){
        for( int i=0; i<personas.length; i++){
            persona indice=personas[i];
            int j=i-1;
            if(orden){
                while (j >= 0 && personas[j].compareTo(indice) > 0) {
                    personas[j + 1] = personas[j];
                    j = j - 1;
                }
            }else{
                while (j >= 0 && personas[j].compareTo(indice) < 0) {
                    personas[j + 1] = personas[j];
                    j = j - 1;
                }
            }
            personas[j+1]=indice;
        }
    }


    public void metodoinsersion(persona[] personas, boolean orden, Comparator<persona> comparator) {
        for( int i=0; i<personas.length; i++){
            persona indice=personas[i];
            int j=i-1;
            if(orden){
                while(j>=0 && comparator.compare(personas[j],indice)>0){
                    personas[j+1]=personas[j];
                    j=j-1;
                }
            }else{
                while(j>=0 && comparator.compare(personas[j],indice)<0){
                    personas[j+1]=personas[j];
                    j=j-1;
                }
            }
            personas[j+1]=indice;
        }

    }
    public void imprimirr(persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
    }

}
