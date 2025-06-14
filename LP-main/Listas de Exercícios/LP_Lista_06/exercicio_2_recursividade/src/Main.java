public class Main {
    // Função recursiva
    public static double potencia(int x, int y) {
        if (y == 0) return 1; // Caso base
        if (y < 0) return 1 / potencia(x, -y); // Caso negativo
        return x * potencia(x, y - 1); // Recursão
    }

    // Método main
    public static void main(String[] args) {
        int base = 2, expoente = 3;
        double resultado = potencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + ": " + resultado); // Esperado: 8
        double resultadoNegativo = potencia(base, -expoente);
        System.out.println(base + " elevado a -" + expoente + ": " + resultadoNegativo); // Esperado: 0.125
    }
}