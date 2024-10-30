package burbuja;

import java.util.Comparator;

public class metodos {
    ///////////////////////////////////////////////////////
    // usando metodo burbuja para ordenar numeros
///////////////////////////////////////////////////////
    public void metodoburbuja(int[] numeros){
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int tem = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = tem;
                }
            }
        }
    }
    public void metodoburbuja(int[] numeros, boolean orden){
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++){
                if (orden){
                    if (numeros[j] > numeros[j + 1]) {
                        int tem = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = tem;
                    }
                }else{
                    if (numeros[j] < numeros[j + 1]) {
                        int tem = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = tem;
                    }
                }
            }
        }
    }
    public void imprimir(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    ///////////////////////////////////////////////////////
    //ordenando cadenas
    ///////////////////////////////////////////////////////
    public void metododoburbuja (String [] cadena, boolean orden){
        for (int i=0; i<cadena.length-1; i++){
            for (int j=0; j<cadena.length-i-1; j++){
                if(orden){
                    if(cadena[j].compareTo(cadena[j+1])>0){
                        String tem=cadena[j];
                        cadena[j]=cadena[j+1];
                        cadena[j+1]=tem;
                    }
                }else{
                    if(cadena[j].compareTo(cadena[j+1])<0){
                        String tem=cadena[j];
                        cadena[j]=cadena[j+1];
                        cadena[j+1]=tem;
                    }
                }
            }
        }
    }
    public void  imprimir(String[] cadena){
        for (int i=0; i<cadena.length; i++){
            System.out.println(cadena[i]);
        }
    }

    ///////////////////////////////////////////////////////
    //ORDENANDO OBJETOS
    ///////////////////////////////////////////////////////
    public void metodoBurbuja(Persona[] personas, boolean orden) {
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (orden) {
                    // Ascendente (nombre A-Z)
                    if (personas[j].compareTo(personas[j + 1]) > 0) {
                        Persona temp = personas[j];
                        personas[j] = personas[j + 1];
                        personas[j + 1] = temp;
                    }
                } else {
                    // Descendente (nombre Z-A)
                    if (personas[j].compareTo(personas[j + 1]) < 0) {
                        Persona temp = personas[j];
                        personas[j] = personas[j + 1];
                        personas[j + 1] = temp;
                    }
                }
            }
        }
    }
    public void metodoBurbuja(Persona[] personas, boolean orden, Comparator<Persona> comparator) {
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (orden) {
                    // Ascendente (edad)
                    if (comparator.compare(personas[j], personas[j + 1]) > 0) {
                        Persona temp = personas[j];
                        personas[j] = personas[j + 1];
                        personas[j + 1] = temp;
                    }
                } else {
                    // Descendente (edad)
                    if (comparator.compare(personas[j], personas[j + 1]) < 0) {
                        Persona temp = personas[j];
                        personas[j] = personas[j + 1];
                        personas[j + 1] = temp;
                    }
                }
            }
        }
    }

    public void imprimir(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }








}

