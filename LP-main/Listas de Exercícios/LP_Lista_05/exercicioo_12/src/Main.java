public class Main {
    public static void main(String[] args) {
        // Declarar e inicializar a matriz 3x3
        int[][] matriz = {
                {2, 5, 3},
                {1, -2, -1},
                {1, 3, 4}
        };

        // Calcular o determinante
        int det = determinante3x3(matriz);

        // Mostrar o resultado
        System.out.println("Determinante da matriz: " + det);
    }

    // Método para calcular determinante de matriz 3x3
    public static int determinante3x3(int[][] m) {
        int det = m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
                - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
                + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        return det;
    }
}
