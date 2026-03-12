import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 3, 4, 5, 2, 1};
        int k = removeDuplicates(arr);

        // Print only the unique portion of the array
        System.out.println("Count of unique elements: " + k);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, k)));
    }

    // Works for sorted arrays (using LinkedHashSet)
    static int[] unique(int arr[]) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
            }
        }
        int result[] = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }

    // ✅ Works for UNSORTED arrays - in place, O(n²)
    static int removeDuplicates(int arr[]) {
        int n = arr.length;
        if (n == 0) return 0;

        int k = 0; // index for unique elements

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            // Check if arr[i] already appeared before index k
            for (int j = 0; j < k; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[k++] = arr[i];
            }
        }

        return k; // number of unique elements
    }
}
