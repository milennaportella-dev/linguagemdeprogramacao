import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int n = in.nextInt();

        if (n < 0) {
            System.out.println("Número inválido. O número deve ser maior ou igual a zero.");
        } else {
            long resultado = fatorial(n);
            System.out.println("O fatorial de " + n + " é: " + resultado);
        }

        in.close();
    }

    public static long fatorial(int n) {
        long fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
}
