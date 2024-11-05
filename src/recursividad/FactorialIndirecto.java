package recursividad;

public class FactorialIndirecto {
    public static void main(String[] args) {
        int n = 5;
        int resultado = calcularFactorial(n);
        System.out.println("El factorial de " + n + " es: " + resultado);
    }

    public static int calcularFactorial(int n) {
        return factorial(n);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Caso base
        }
        return n * calcularFactorial(n - 1); // Llamada indirecta
    }
}
