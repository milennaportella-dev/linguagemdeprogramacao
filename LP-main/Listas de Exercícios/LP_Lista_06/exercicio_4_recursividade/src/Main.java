import java.util.Scanner;

public class Main {
    // Função recursiva para verificar se uma String é palíndromo
    public static boolean ehPalindromo(String str, int inicio, int fim) {
        // Caso base: se o intervalo for inválido ou de tamanho 0 ou 1, é palíndromo
        if (inicio >= fim) return true;
        // Ignora caracteres que não são letras ou números e compara apenas os válidos
        while (inicio < fim && !Character.isLetterOrDigit(str.charAt(inicio))) inicio++;
        while (inicio < fim && !Character.isLetterOrDigit(str.charAt(fim))) fim--;
        // Compara os caracteres nas extremidades
        if (inicio >= fim) return true;
        if (Character.toLowerCase(str.charAt(inicio)) != Character.toLowerCase(str.charAt(fim))) return false;
        // Recursão: verifica o restante da String
        return ehPalindromo(str, inicio + 1, fim - 1);
    }

    // Método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma String para verificar se é palíndromo: ");
        String entrada = scanner.nextLine();
        // Chama a função e exibe o resultado
        if (ehPalindromo(entrada, 0, entrada.length() - 1)) {
            System.out.println("\"" + entrada + "\" é um palíndromo!");
        } else {
            System.out.println("\"" + entrada + "\" não é um palíndromo!");
        }
        scanner.close();
    }
}