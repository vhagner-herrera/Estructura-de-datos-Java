package recursividad;

public class FactorialMultiple {
    public static void main(String[] args) {
        int n = 5;
        long resultado = factorial(n);
        System.out.println("El factorial de " + n + " es: " + resultado);
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1; // Caso base
        }
        // Llamada recursiva para dividir el problema
        int mitad = n / 2;
        long parte1 = factorial(mitad); //2
        long parte2 = factorial(n - mitad);//

        // Calculamos el multiplicador desde mitad + 1 hasta n
        long multiplicador = multiplicarDesde(mitad + 1, n);

        // Combinar resultados
        return parte1 * parte2 * multiplicador;
    }

    // Método para multiplicar los números restantes
    private static long multiplicarDesde(int inicio, int fin) {
        long resultado = 1;
        for (int i = inicio; i <= fin; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
