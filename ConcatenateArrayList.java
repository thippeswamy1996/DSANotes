import java.util.*;

public class ConcatenateArrayList {
    public static void main(String[] args) {
        // Step 1: Create and populate an ArrayList
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add(" ");
        words.add("World");
        words.add("!");
        
        // Step 2: Concatenate all elements
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word);
        }

        // Step 3: Output the result
        System.out.println("Concatenated String: " + result.toString());
    }
}
