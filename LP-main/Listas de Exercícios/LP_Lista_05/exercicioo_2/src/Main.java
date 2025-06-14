public class Main {
    public static void main(String[] args) {
        // Declarando e inicializando o vetor com 10 posições
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Percorrendo o vetor e alterando os valores conforme a regra
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                // Índice par: soma 2
                vetor[i] = vetor[i] + 2;
            } else {
                // Índice ímpar: multiplica por 2
                vetor[i] = vetor[i] * 2;
            }
        }

        // Imprimindo o vetor modificado
        System.out.println("Vetor após as alterações:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}
