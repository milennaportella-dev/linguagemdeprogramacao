import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor da base (X): ");
        int x = in.nextInt();

        System.out.print("Digite o valor do expoente (Y - deve ser maior ou igual a 0): ");
        int y = in.nextInt();

        if (y < 0) {
            System.out.println("Expoente inválido. Y deve ser maior ou igual a zero.");
        } else {
            long resultado = potencia(x, y);
            System.out.println(x + " elevado a " + y + " é: " + resultado);
        }

        in.close();
    }

    public static long potencia(int base, int expoente) {
        long resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
