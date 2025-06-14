import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        // Recebendo os valores da matriz
        System.out.println("Digite os valores para a matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
            }
        }

        // Encontrando a maior soma das linhas
        int maiorSomaLinha = Integer.MIN_VALUE;
        int linhaMaior = -1;

        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha > maiorSomaLinha) {
                maiorSomaLinha = somaLinha;
                linhaMaior = i;
            }
        }

        // Encontrando a maior soma das colunas
        int maiorSomaColuna = Integer.MIN_VALUE;
        int colunaMaior = -1;

        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna > maiorSomaColuna) {
                maiorSomaColuna = somaColuna;
                colunaMaior = j;
            }
        }

        // Exibindo os resultados
        System.out.println("\nMaior soma das linhas: " + maiorSomaLinha + " (linha " + linhaMaior + ")");
        System.out.println("Maior soma das colunas: " + maiorSomaColuna + " (coluna " + colunaMaior + ")");
    }
}
