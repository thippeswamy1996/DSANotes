public class ReverseRows2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 4, 5},
            {6, 7, 8},
            {7, 8, 9}
        };

        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Reverse the order of the rows
        int left = 0;
        int right = matrix.length - 1;
        while (left < right) {
            // Swap rows
            int[] temp = matrix[left];
            matrix[left] = matrix[right];
            matrix[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }

        // Print reversed matrix
        System.out.println("\nReversed Rows Matrix:");
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


/*
If you want to **reverse the rows** of a **2D array** (matrix) in Java, where the result should look like this:

### Input:
```
[[3, 4, 5],
 [6, 7, 8],
 [7, 8, 9]]
```

### Output:
```
[[7, 8, 9],
 [6, 7, 8],
 [3, 4, 5]]
```

### Java Code:

Here’s how you can achieve this by **reversing the order of the rows** in the 2D array:

```java
public class ReverseRows2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 4, 5},
            {6, 7, 8},
            {7, 8, 9}
        };

        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Reverse the order of the rows
        int left = 0;
        int right = matrix.length - 1;
        while (left < right) {
            // Swap rows
            int[] temp = matrix[left];
            matrix[left] = matrix[right];
            matrix[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }

        // Print reversed matrix
        System.out.println("\nReversed Rows Matrix:");
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
```

### 🧠 Explanation:

1. **Original Matrix**:
   - We start with the matrix:
   ```
   [3, 4, 5]
   [6, 7, 8]
   [7, 8, 9]
   ```

2. **Reverse the Rows**:
   - We swap the first row with the last row, the second with the second last row, and so on.
   - We use two pointers: `left` starting from 0 (beginning) and `right` from the end (matrix.length - 1). 
   - The rows are swapped until `left` and `right` pointers meet.

3. **Print the Matrix**:
   - We print the matrix before and after the swap to visualize the change.

### 🧾 Output:

```
Original Matrix:
3 4 5 
6 7 8 
7 8 9 

Reversed Rows Matrix:
7 8 9 
6 7 8 
3 4 5 
```

---

This method effectively reverses the order of rows in the matrix. Let me know if you'd like to modify this approach or if you have any other questions!
*/