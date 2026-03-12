import java.util.*;

public class SortHashMapByValues {
    public static void main(String[] args) {
        // Step 1: Create sample HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 40);
        map.put("banana", 10);
        map.put("mango", 30);
        map.put("orange", 20);

        // Step 2: Convert HashMap to List of Map.Entry
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Step 3: Sort the list by values
        entryList.sort(Map.Entry.comparingByValue());

        // Step 4: Print sorted values
        System.out.println("HashMap entries sorted by value:");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
