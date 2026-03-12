import java.util.*;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "Thippeswamy";
        String result = lswrc(s);
        System.out.println("Longest Substring Without Repeating Characters: " + result);
        System.out.println("Length: " + result.length());
    }

    static String lswrc(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0; // to track the start index of the max substring
        int left = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            // if we found a longer substring, update start and maxLength
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        // return the longest substring
        return s.substring(start, start + maxLength);
    }
}
