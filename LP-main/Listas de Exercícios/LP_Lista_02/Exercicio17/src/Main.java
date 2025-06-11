import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int velocidade0;
        double aceleracao;
        double tempo;

        Scanner in = new Scanner(System.in);

        System.out.println("--> CALCULA A VELOCIDADE DE UM CORPO <--");
        System.out.println("Insira a velocidade inicial: ");
        velocidade0 = in.nextInt();
        System.out.println("Insira a aceleração: ");
        aceleracao = in.nextDouble();
        System.out.println("Insira o tempo de percurso: ");
        tempo = in.nextDouble();

        double velocidadeFinal = velocidade0 + (aceleracao * tempo);
        System.out.println("A velocidade final é: " + velocidadeFinal);

    }
}