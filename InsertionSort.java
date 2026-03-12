import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {9, 1, 0, 2, 3, 4, 5, 6, 7, 8, 11, 12};
        int res[] = insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(res));
    }

    static int[] insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // element to insert
            int j = i - 1;

            // Move elements that are greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at correct position
            arr[j + 1] = key;
        }

        return arr;
    }
}
