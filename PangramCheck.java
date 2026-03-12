import java.util.*;

public class PangramCheck {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        if (isPangram(input)) {
            System.out.println("✅ It is a Pangram.");
        } else {
            System.out.println("❌ It is NOT a Pangram.");
        }
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        Set<Character> letters = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        return letters.size() == 26;
    }
}
