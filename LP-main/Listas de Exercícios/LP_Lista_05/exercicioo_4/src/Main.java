import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declarando o vetor
        int[] vetor = new int[10];

        // Lendo os 10 números inseridos pelo usuário
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = in.nextInt();
        }

        // Inicializando maior e menor com o primeiro elemento do vetor
        int maior = vetor[0];
        int menor = vetor[0];
        int posMaior = 0;
        int posMenor = 0;

        // Percorrendo o vetor para encontrar o maior e o menor
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
        }

        // Exibindo os resultados
        System.out.println("\nMaior número: " + maior + " na posição " + posMaior);
        System.out.println("Menor número: " + menor + " na posição " + posMenor);
    }
}
