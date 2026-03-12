import java.util.*;

public class Dp {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3, 3};
        findDuplicates(arr);
    }

    static void findDuplicates(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Flag to check if any duplicates exist
        boolean hasDuplicates = false;

        // Print elements that appear more than once
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element: " + entry.getKey() + " → Count: " + entry.getValue());
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }
}
