package seleccion;

import java.util.Comparator;

public class metodos {


    // metodo para ordenar numeros ascendente y descendente
    public void ordenamiento_seleccion(int [] numero, boolean orden){

        for (int i=0; i<numero.length-1; i++){
            int indice=i;
            for (int j=i+1; j<numero.length;j++){
                if (orden){
                    if (numero[j]<numero[indice]){
                        indice=j;
                    }
                }else{
                    if(numero[j]>numero[indice]){
                        indice=j;
                    }
                }
            }
            int temp = numero[indice];
            numero[indice]=numero[i];
            numero[i]=temp;
        }

    }

    public void imprimir(int [] numero){
        for (int i=0; i<numero.length; i++){
            System.out.println(numero[i]);
        }
    }
    // metodo para odenar cadenas ascendente y descendente
    public void ordenamiento_seleccion(String [] cadena, boolean datos){
        for( int i=0; i<cadena.length-1; i++){
            int indice=i;
            for (int j=i+1; j<cadena.length; j++){
                if (datos){
                    if (cadena[j].compareTo(cadena[indice]) < 0) {
                        indice = j;
                    }
                }else{
                    if (cadena[j].compareTo(cadena[indice]) > 0) {
                        indice = j;
                    }

                }
            }
            String temp=cadena[indice];
            cadena[indice]=cadena[i];
            cadena[i]=temp;

        }
    }

    public void imprimir(String [] cadena){
        for (int i=0; i<cadena.length; i++){
            System.out.println(cadena[i]);
        }
    }

    ///////////////////
    public void metodoSeleccion(persona[] Personas, boolean orden) {
        for (int i = 0; i < Personas.length - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < Personas.length; j++) {
                if (orden) {
                    // Ascendente (nombre A-Z)
                    if (Personas[j].compareTo(Personas[indice]) < 0) {
                        indice = j;
                    }
                } else {
                    // Descendente (nombre Z-A)
                    if (Personas[j].compareTo(Personas[indice]) > 0) {
                        indice = j;
                    }
                }
            }
            // Intercambiar las posiciones
            persona temp = Personas[indice];
            Personas[indice] = Personas[i];
            Personas[i] = temp;
        }
    }



    public void metodoSeleccion(persona[] personas, boolean orden, Comparator<persona> comparator) {
        for (int i = 0; i < personas.length - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < personas.length; j++) {
                if (orden) {
                    // Ascendente (edad)
                    if (comparator.compare(personas[j], personas[indice]) < 0) {
                        indice = j;
                    }
                } else {
                    // Descendente (edad)
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

    public void imprimir (persona[] Personas){
        for (int i=0; i<Personas.length;i++){
            System.out.println(Personas[i]);
        }
    }


}

