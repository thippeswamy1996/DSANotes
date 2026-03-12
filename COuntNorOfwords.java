import java.util.*;

public class CountNumOfChars {
    public static void main(String[] args) {
        String s = "Hi my name is thippesh";
        Map<Character, Integer> hashmap = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            if (ch != ' ') {  // skip spaces
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character Frequency:");
        for (Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
ap=a+(n-1)*d

