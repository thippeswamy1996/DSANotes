import java.util.*;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
            }
        }
    }
}
