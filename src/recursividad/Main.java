package recursividad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numero = 5;  // Definimos el número para calcular su factorial
        int resultado = factorial(numero);  // Llamamos a la función recursiva y guardamos el resultado
        System.out.println("El factorial de " + numero + " es: " + resultado);  // Mostramos el resultado
    }

    /**
     * Método recursivo para calcular el factorial de un número.
     * @param n Número del cual queremos calcular el factorial.
     * @return El factorial del número n.
     */
    public static int factorial(int n) {
        if (n <= 1) {  // Condición base: si n es 0 o 1, el factorial es 1
            return 1;  // Devuelve 1 para detener la recursión
        }
        // Llamada recursiva: multiplicamos n por el factorial de (n-1)
        return n * factorial(n - 1);

    }
}