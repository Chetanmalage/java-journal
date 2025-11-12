package Q_2;

// Q.2 Java program to demonstrate matrix manipulation and sorting.

import java.util.Arrays;

public class MatrixSort {
	public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static void sortMatrixRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {56, 1, 5, 10},
            {9, 3, 2, 8},
            {4, 6, 10, 11}
        };
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        sortMatrixRows(matrix);
        System.out.println("\nMatrix After Sorting Rows:");
        printMatrix(matrix);
    }
}
