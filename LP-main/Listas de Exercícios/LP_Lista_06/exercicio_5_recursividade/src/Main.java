public class Main {
    // Função recursiva para busca binária
    public static int buscaBinaria(int[] arr, int valor, int inicio, int fim) {
        if (inicio > fim) return -1; // Caso base: valor não encontrado
        int meio = (inicio + fim) / 2;
        if (arr[meio] == valor) return meio; // Valor encontrado
        if (arr[meio] > valor) return buscaBinaria(arr, valor, inicio, meio - 1); // Busca na metade esquerda
        return buscaBinaria(arr, valor, meio + 1, fim); // Busca na metade direita
    }

    // Método main
    public static void main(String[] args) {
        int[] arr = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};
        int valorBuscado = 42;
        int indice = buscaBinaria(arr, valorBuscado, 0, arr.length - 1);
        if (indice != -1) {
            System.out.println("Valor " + valorBuscado + " encontrado no índice " + indice);
        } else {
            System.out.println("Valor " + valorBuscado + " não encontrado");
        }
    }
}