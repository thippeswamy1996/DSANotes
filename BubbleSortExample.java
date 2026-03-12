import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("Original array: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }

    // Method to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparisons and swaps
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: break if no elements were swapped
            if (!swapped) break;
        }
    }
}
