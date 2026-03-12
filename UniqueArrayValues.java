import java.util.*;

public class UniqueArrayValues {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};

        // Use LinkedHashMap to preserve insertion order and count frequency
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Unique values in the array:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
