//two dimentional array
import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix
        System.out.println("Enter dimensions for first matrix");
        System.out.print("Rows: ");
        int rows1 = scanner.nextInt();
        System.out.print("Columns: ");
        int cols1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements for the first matrix:");
        inputMatrix(scanner, matrix1);

        // Input for the second matrix
        System.out.println("Enter dimensions for the second matrix:");
        System.out.print("Rows: ");
        int rows2 = scanner.nextInt();
        System.out.print("Columns: ");
        int cols2 = scanner.nextInt();

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible: Inner dimensions don't match.");
            return;
        }

        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements for the second matrix:");
        inputMatrix(scanner, matrix2);

        // Perform matrix multiplication
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Resultant matrix after multiplication:");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    public static void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("Enter element at index [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

