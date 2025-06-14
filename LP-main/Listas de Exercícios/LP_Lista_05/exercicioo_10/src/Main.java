public class Main {
    public static void main(String[] args) {
        // Declarando e inicializando as matrizes
        int[][] matrizA = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] matrizB = {
                {7, 8},
                {9, 10}
        };

        // Matriz resultado (3x2)
        int[][] matrizC = new int[3][2];

        // Calculando o produto das matrizes
        for (int i = 0; i < 3; i++) { // linhas de A
            for (int j = 0; j < 2; j++) { // colunas de B
                matrizC[i][j] = matrizA[i][0] * matrizB[0][j] + matrizA[i][1] * matrizB[1][j];
            }
        }

        // Exibindo a matriz resultado
        System.out.println("Matriz resultado (produto):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
