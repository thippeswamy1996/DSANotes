public class Reverse2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 4, 5},
            {6, 7, 8},
            {7, 8, 9}
        };

        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Reverse each row in the matrix
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[i].length - 1;
            while (left < right) {
                // Swap elements
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                // Move towards the middle
                left++;
                right--;
            }
        }

        // Print reversed matrix
        System.out.println("\nReversed Matrix:");
        printMatrix(matrix);
    }

    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
