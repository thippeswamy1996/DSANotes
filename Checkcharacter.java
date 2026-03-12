import java.util.*;

public class Checkcharacter {
    public static void main(String[] args) {
        String s = "Hello";
        charCount(s);
    }

    static void charCount(String s) {
        Map<Character, Integer> charCounts = new HashMap<>();

        // Step 1: Count each character
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Step 2: Print only duplicates
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " is repeating " + entry.getValue() + " times");
            }
        }
    }
}
