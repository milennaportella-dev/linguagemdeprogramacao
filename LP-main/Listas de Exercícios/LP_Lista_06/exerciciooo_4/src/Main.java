import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = in.nextLine();

        // Remover espaços e transformar em minúsculas para ignorar diferenças
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        if (ehPalindromo(texto)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        in.close();
    }

    public static boolean ehPalindromo(String texto) {
        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}

