import java.util.*;

public class CharacterFrequencySort {
    public static void main(String[] args) {
        String input = "banana";

        // Step 1: Use Set to store unique characters
        Set<Character> uniqueChars = new HashSet<>();
        for (char ch : input.toCharArray()) {
            uniqueChars.add(ch);
        }

        System.out.println("Unique characters: " + uniqueChars);

        // Step 2: Use Map to count occurrences
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 3: Sort the map by values (frequency) in descending order
        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(freqMap.entrySet());
        sortedList.sort((e1, e2) -> e2.getValue() - e1.getValue());

        // Step 4: Print sorted frequencies
        System.out.println("Character frequencies sorted by highest count:");
        for (Map.Entry<Character, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
