import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler dimensões da primeira matriz
        System.out.print("Linhas da 1ª matriz: ");
        int l1 = sc.nextInt();
        System.out.print("Colunas da 1ª matriz: ");
        int c1 = sc.nextInt();

        // Ler dimensões da segunda matriz
        System.out.print("Linhas da 2ª matriz: ");
        int l2 = sc.nextInt();
        System.out.print("Colunas da 2ª matriz: ");
        int c2 = sc.nextInt();

        // Verifica se a multiplicação é possível
        if (c1 != l2) {
            System.out.println("Multiplicação impossível: colunas da 1ª matriz diferente das linhas da 2ª matriz.");
            sc.close();
            return;
        }

        int[][] m1 = new int[l1][c1];
        int[][] m2 = new int[l2][c2];

        // Ler valores da primeira matriz
        System.out.println("Digite os valores da 1ª matriz:");
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        // Ler valores da segunda matriz
        System.out.println("Digite os valores da 2ª matriz:");
        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        // Matriz produto (l1 x c2)
        int[][] prod = new int[l1][c2];

        // Calcular produto
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c2; j++) {
                int soma = 0;
                for (int k = 0; k < c1; k++) {
                    soma += m1[i][k] * m2[k][j];
                }
                prod[i][j] = soma;
            }
        }

        // Mostrar matriz produto
        System.out.println("Matriz produto:");
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
