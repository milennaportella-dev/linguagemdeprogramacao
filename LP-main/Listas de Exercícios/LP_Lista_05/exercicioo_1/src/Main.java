public class Main {
    public static void main(String[] args) {
        // Declarando e inicializando o vetor
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Imprimindo o vetor em ordem inversa
        System.out.println("Vetor em ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
