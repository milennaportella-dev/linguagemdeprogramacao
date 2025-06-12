import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro para ver a sua tabuada: ");
        numero = in.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
