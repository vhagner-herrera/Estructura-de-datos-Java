package recursividad;

public class Recursivo {
    public static void main(String[] args) {
        int numero = 13;
        String resultado = intToBinary(numero);
        System.out.println("El número " + numero + " en binario es: " + resultado);
    }

    // Metodo recursivo para convertir un número entero a binario
    public static String intToBinary(int n) {
        // Caso base: si n es 0, retorna "0"
        if (n == 0) {
            return "";
        }

        // Llamada recursiva
        String binary = intToBinary(n / 2);

        // Agrega el residuo (0 o 1) al resultado
        return binary + (n % 2);
    }
}
