public class Main {
    // Função recursiva
    public static int somaAteN(int n) {
        if (n <= 1) return n; // Caso base
        return n + somaAteN(n - 1); // Recursão
    }

    // Método main
    public static void main(String[] args) {
        int n = 5;
        int resultado = somaAteN(n);
        System.out.println("Soma de 1 até " + n + ": " + resultado); // Esperado: 15
    }
}