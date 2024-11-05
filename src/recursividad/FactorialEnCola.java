package recursividad;

public class FactorialEnCola {
    public static void main(String[] args) {
        int n = 5;
        int resultado = factorial(n);
        System.out.println("El factorial de " + n + " es: " + resultado);
    }

    public static int factorial(int n) {
        return factorialHelper(n, 1); // Llama al helper con acumulador
    }

    private static int factorialHelper(int n, int acumulador) {
        if (n == 0) {
            return acumulador; // Caso base
        }
        return factorialHelper(n - 1, n * acumulador); // Llamada recursiva de cola
    }
}
