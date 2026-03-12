import java.util.Arrays;

public class Move {
    public static void main(String[] args) {
        int arr[] = {1, 0, 6, 9, 0, 5, 3};
        moveZerosToEnd(arr);
        System.out.println("After moving zeros: " + Arrays.toString(arr));
    }

    static void moveZerosToEnd(int[] arr) {
        int count = 0; // Position to place the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Fill remaining positions with zero
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }
}
