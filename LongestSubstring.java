import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        String myName = "Thippeswamy";
        int result = longestSubstring(myName);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }

    public static int longestSubstring(String myName) {
        int n = myName.length();
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            while (set.contains(myName.charAt(right))) {
                set.remove(myName.charAt(left));
                left++;
            }

            set.add(myName.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}