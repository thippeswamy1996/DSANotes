import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6, 8};

        // Create merged array of size arr1 + arr2
        int[] merged = new int[arr1.length + arr2.length];

        // Copy elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}
