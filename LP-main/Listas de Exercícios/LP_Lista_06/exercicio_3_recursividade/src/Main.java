public class Main {
    // Função recursiva
    public static boolean ehPalindromo(String str) {
        // Remove caracteres especiais e converte para minúsculo
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        if (str.length() <= 1) return true; // Caso base
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false; // Compara extremidades
        return ehPalindromo(str.substring(1, str.length() - 1)); // Recursão
    }

    // Método main
    public static void main(String[] args) {
        String palavra = "A man a plan a canal Panama";
        boolean resultado = ehPalindromo(palavra);
        System.out.println("\"" + palavra + "\" é palíndromo? " + resultado); // Esperado: true
    }
}