import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        // Sample input arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Use Set to store elements from arr1
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        // Set to store common elements
        Set<Integer> common = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        // Print the common elements
        System.out.println("Common Elements: " + common);
    }
}
