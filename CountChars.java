import java.util.HashMap;
import java.util.Map;

public class CountChars {
    public static void main(String[] args) {
        String a = "abccd"; // Input string
        Map<Character, Integer> map = new HashMap<>();

        // Loop through each character in the string
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);  // Get the current character
            // Update count in the map
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
