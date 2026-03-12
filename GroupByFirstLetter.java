import java.util.*;

public class GroupByFirstLetter {
    public static void main(String[] args) {
        String[] input = {"Bob", "ron", "ram", "sent"};
        Map<Character, List<String>> map = new TreeMap<>();

        for (String name : input) {
            if (name.length() > 0) {
                char firstChar = Character.toUpperCase(name.charAt(0));

                map.putIfAbsent(firstChar, new ArrayList<>());
                map.get(firstChar).add(name);
            }
        }

        // Print the result
        for (Map.Entry<Character, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
