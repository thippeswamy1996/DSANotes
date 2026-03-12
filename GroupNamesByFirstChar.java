import java.util.*;

public class GroupNamesByFirstChar {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Anil", "Bob", "Brian", "Charlie", "Cathy", "Arun");

        // Map to store character -> list of names
        Map<Character, List<String>> groupedNames = new HashMap<>();

        for (String name : names) {
            if (name == null || name.isEmpty()) continue;

            // Convert first character to uppercase
            char firstChar = Character.toUpperCase(name.charAt(0));

            // Group names under the corresponding character
            groupedNames.computeIfAbsent(firstChar, k -> new ArrayList<>()).add(name);
        }

        // Print the grouped names
        for (Map.Entry<Character, List<String>> entry : groupedNames.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
