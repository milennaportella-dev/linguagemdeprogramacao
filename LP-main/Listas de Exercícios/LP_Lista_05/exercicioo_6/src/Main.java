public class Main {
    public static void main(String[] args) {
        // Declarando e inicializando o vetor
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Invertendo o vetor usando apenas uma variável auxiliar
        int aux;
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho / 2; i++) {
            aux = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = aux;
        }

        // Exibindo o vetor invertido
        System.out.println("Vetor invertido:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
