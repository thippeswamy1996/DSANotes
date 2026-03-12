import java.util.HashMap;
import java.util.Map;

public class CountVowels {
    public static void main(String[] args) {
        String input = "Hello World, Welcome to Java";
        countVowelOccurrences(input);
    }

    public static void countVowelOccurrences(String str) {
        Map<Character, Integer> vowelCount = new HashMap<>();
        String vowels = "aeiou";

        for (char ch : str.toLowerCase().toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                vowelCount.put(ch, vowelCount.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Vowel Occurrences:");
        for (char vowel : vowels.toCharArray()) {
            int count = vowelCount.getOrDefault(vowel, 0);
            System.out.println(vowel + ": " + count);
        }
    }
}
