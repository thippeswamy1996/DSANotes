import java.util.*;

public class SortHashMapByValue {
    public static void main(String[] args) {
        // Sample input
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 40);
        map.put("banana", 10);
        map.put("mango", 30);
        map.put("orange", 20);

        // Step 1: Convert map to a list of entries
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Step 2: Sort the list by values
        entryList.sort(Map.Entry.comparingByValue());

        // Step 3: Create a LinkedHashMap to preserve sorted order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Output the sorted map
        System.out.println("Sorted map by values:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
