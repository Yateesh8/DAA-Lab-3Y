package Lab3;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = { {1,2}, {3,4} };
        int[][] b = { {5,6}, {7,8} };

        int rows = a.length;
        int cols = b[0].length;
        int[][] product = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < b.length; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) System.out.print(product[i][j] + " ");
            System.out.println();
        }
    }
}
