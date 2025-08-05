public class MatrixOperations {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {5, 6},
                {7, 8}
        };

        int rows = A.length;
        int cols = A[0].length;

        int[][] sum = new int[rows][cols];
        int[][] product = new int[rows][cols];

        // Matrix Addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Matrix Multiplication
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                product[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matrix Addition:");
        printMatrix(sum);

        System.out.println("Matrix Multiplication:");
        printMatrix(product);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
