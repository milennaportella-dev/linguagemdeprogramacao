import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declarando e inicializando o vetor
        int[] vetor = {5, 8, 12, 20, 25, 30, 42, 50, 60, 75};

        // Criando o scanner para receber dados do usuário
        Scanner in = new Scanner(System.in);

        // Solicitando o número ao usuário
        System.out.print("Digite um número inteiro para buscar no vetor: ");
        int numero = in.nextInt();

        // Variável de controle para verificar se encontrou o número
        boolean encontrado = false;

        // Percorrendo o vetor para buscar o número
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
                break; // Para parar assim que encontrar
            }
        }

        // Caso não encontre o número
        if (!encontrado) {
            System.out.println("Valor não encontrado.");
        }
    }
}
