import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 6, 9, 0, 5, 3};
        int n = arr.length;
        int index = 0; // Points to the next position for non-zero

        // Step 1: Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Step 2: Fill remaining positions with zeros
        while (index < n) {
            arr[index++] = 0;
        }

        // Output result
        System.out.println("Output: " + Arrays.toString(arr));
    }
}
