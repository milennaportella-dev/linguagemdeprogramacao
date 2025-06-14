public class Main {

    public static void main(String[] args) {
        int n = 5; // Exemplo de valor
        if (n > 0) {
            int resultado = somaAteN(n);
            System.out.println("A soma dos números de 1 até " + n + " é: " + resultado);
        } else {
            System.out.println("O número deve ser maior que 0.");
        }
    }

    public static int somaAteN(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
}
